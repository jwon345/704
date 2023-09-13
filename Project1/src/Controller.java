import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  public Signal bottleAtPos3E = new Signal("bottleAtPos3E", Signal.OUTPUT);
  public input_Channel checkThree_in = new input_Channel();
  public output_Channel lidLoaderReady_o = new output_Channel();
  private Signal manualMode_92;
  private Signal autoMode_92;
  private Signal bottleAtPos3_92;
  private Signal done_92;
  private int S191385 = 1;
  private int S191241 = 1;
  private int S191240 = 1;
  private int S138648 = 1;
  private int S138643 = 1;
  private int S138709 = 1;
  private int S138671 = 1;
  private int S138666 = 1;
  private int S138718 = 1;
  private int S138724 = 1;
  private int S138755 = 1;
  private int S138766 = 1;
  private int S138757 = 1;
  private int S138802 = 1;
  private int S138797 = 1;
  private int S141621 = 1;
  private int S141629 = 1;
  private int S141772 = 1;
  private int S141676 = 1;
  private int S141636 = 1;
  private int S141631 = 1;
  private int S141780 = 1;
  private int S191262 = 1;
  private int S191261 = 1;
  private int S191345 = 1;
  private int S191289 = 1;
  private int S191269 = 1;
  private int S191264 = 1;
  private int S191383 = 1;
  private int S191357 = 1;
  private int S191350 = 1;
  private int S191353 = 1;
  
  private int[] ends = new int[105];
  private int[] tdone = new int[105];
  
  public void thread192282(int [] tdone, int [] ends){
        S191353=1;
    active[104]=1;
    ends[104]=1;
    tdone[104]=1;
  }

  public void thread192281(int [] tdone, int [] ends){
        S191350=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 903, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[103]=1;
    ends[103]=1;
    tdone[103]=1;
  }

  public void thread192279(int [] tdone, int [] ends){
        switch(S191353){
      case 0 : 
        active[104]=0;
        ends[104]=0;
        tdone[104]=1;
        break;
      
      case 1 : 
        if(done_92.getprestatus()){//sysj\conveyor_controller.sysj line: 907, column: 28
          ends[104]=2;
          tdone[104]=1;
        }
        else {
          active[104]=1;
          ends[104]=1;
          tdone[104]=1;
        }
        break;
      
    }
  }

  public void thread192278(int [] tdone, int [] ends){
        switch(S191350){
      case 0 : 
        active[103]=0;
        ends[103]=0;
        tdone[103]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 903, column: 22
        currsigs.addElement(bottleAtPos3E);
        active[103]=1;
        ends[103]=1;
        tdone[103]=1;
        break;
      
    }
  }

  public void thread192277(int [] tdone, int [] ends){
        switch(S191383){
      case 0 : 
        active[102]=0;
        ends[102]=0;
        tdone[102]=1;
        break;
      
      case 1 : 
        switch(S191357){
          case 0 : 
            thread192278(tdone,ends);
            thread192279(tdone,ends);
            int biggest192280 = 0;
            if(ends[103]>=biggest192280){
              biggest192280=ends[103];
            }
            if(ends[104]>=biggest192280){
              biggest192280=ends[104];
            }
            if(biggest192280 == 1){
              active[102]=1;
              ends[102]=1;
              tdone[102]=1;
            }
            if(biggest192280 == 2){
              ends[102]=2;
              ;//sysj\conveyor_controller.sysj line: 901, column: 7
              S191357=1;
              active[102]=1;
              ends[102]=1;
              tdone[102]=1;
            }
            //FINXME code
            if(biggest192280 == 0){
              ;//sysj\conveyor_controller.sysj line: 909, column: 19
              S191357=1;
              active[102]=1;
              ends[102]=1;
              tdone[102]=1;
            }
            break;
          
          case 1 : 
            S191357=1;
            S191357=0;
            if(bottleAtPos3_92.getprestatus()){//sysj\conveyor_controller.sysj line: 900, column: 20
              thread192281(tdone,ends);
              thread192282(tdone,ends);
              int biggest192283 = 0;
              if(ends[103]>=biggest192283){
                biggest192283=ends[103];
              }
              if(ends[104]>=biggest192283){
                biggest192283=ends[104];
              }
              if(biggest192283 == 1){
                active[102]=1;
                ends[102]=1;
                tdone[102]=1;
              }
            }
            else {
              S191357=1;
              active[102]=1;
              ends[102]=1;
              tdone[102]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192276(int [] tdone, int [] ends){
        switch(S191345){
      case 0 : 
        active[101]=0;
        ends[101]=0;
        tdone[101]=1;
        break;
      
      case 1 : 
        switch(S191289){
          case 0 : 
            switch(S191269){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 887, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 887, column: 6
                  S191269=1;
                  active[101]=1;
                  ends[101]=1;
                  tdone[101]=1;
                }
                else {
                  switch(S191264){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 887, column: 6
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 887, column: 6
                        S191264=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 887, column: 6
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 887, column: 6
                          ends[101]=2;
                          ;//sysj\conveyor_controller.sysj line: 887, column: 6
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 888, column: 9
                            bottleAtPos3_92.setPresent();//sysj\conveyor_controller.sysj line: 889, column: 7
                            currsigs.addElement(bottleAtPos3_92);
                            S191289=1;
                            active[101]=1;
                            ends[101]=1;
                            tdone[101]=1;
                          }
                          else {
                            done_92.setPresent();//sysj\conveyor_controller.sysj line: 891, column: 7
                            currsigs.addElement(done_92);
                            S191289=1;
                            active[101]=1;
                            ends[101]=1;
                            tdone[101]=1;
                          }
                        }
                        else {
                          active[101]=1;
                          ends[101]=1;
                          tdone[101]=1;
                        }
                      }
                      else {
                        active[101]=1;
                        ends[101]=1;
                        tdone[101]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 887, column: 6
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 887, column: 6
                        ends[101]=2;
                        ;//sysj\conveyor_controller.sysj line: 887, column: 6
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 888, column: 9
                          bottleAtPos3_92.setPresent();//sysj\conveyor_controller.sysj line: 889, column: 7
                          currsigs.addElement(bottleAtPos3_92);
                          S191289=1;
                          active[101]=1;
                          ends[101]=1;
                          tdone[101]=1;
                        }
                        else {
                          done_92.setPresent();//sysj\conveyor_controller.sysj line: 891, column: 7
                          currsigs.addElement(done_92);
                          S191289=1;
                          active[101]=1;
                          ends[101]=1;
                          tdone[101]=1;
                        }
                      }
                      else {
                        active[101]=1;
                        ends[101]=1;
                        tdone[101]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S191269=1;
                S191269=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 887, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 887, column: 6
                  S191269=1;
                  active[101]=1;
                  ends[101]=1;
                  tdone[101]=1;
                }
                else {
                  S191264=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 887, column: 6
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 887, column: 6
                    S191264=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 887, column: 6
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 887, column: 6
                      ends[101]=2;
                      ;//sysj\conveyor_controller.sysj line: 887, column: 6
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 888, column: 9
                        bottleAtPos3_92.setPresent();//sysj\conveyor_controller.sysj line: 889, column: 7
                        currsigs.addElement(bottleAtPos3_92);
                        S191289=1;
                        active[101]=1;
                        ends[101]=1;
                        tdone[101]=1;
                      }
                      else {
                        done_92.setPresent();//sysj\conveyor_controller.sysj line: 891, column: 7
                        currsigs.addElement(done_92);
                        S191289=1;
                        active[101]=1;
                        ends[101]=1;
                        tdone[101]=1;
                      }
                    }
                    else {
                      active[101]=1;
                      ends[101]=1;
                      tdone[101]=1;
                    }
                  }
                  else {
                    active[101]=1;
                    ends[101]=1;
                    tdone[101]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S191289=1;
            S191289=0;
            S191269=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 887, column: 6
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 887, column: 6
              S191269=1;
              active[101]=1;
              ends[101]=1;
              tdone[101]=1;
            }
            else {
              S191264=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 887, column: 6
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 887, column: 6
                S191264=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 887, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 887, column: 6
                  ends[101]=2;
                  ;//sysj\conveyor_controller.sysj line: 887, column: 6
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 888, column: 9
                    bottleAtPos3_92.setPresent();//sysj\conveyor_controller.sysj line: 889, column: 7
                    currsigs.addElement(bottleAtPos3_92);
                    S191289=1;
                    active[101]=1;
                    ends[101]=1;
                    tdone[101]=1;
                  }
                  else {
                    done_92.setPresent();//sysj\conveyor_controller.sysj line: 891, column: 7
                    currsigs.addElement(done_92);
                    S191289=1;
                    active[101]=1;
                    ends[101]=1;
                    tdone[101]=1;
                  }
                }
                else {
                  active[101]=1;
                  ends[101]=1;
                  tdone[101]=1;
                }
              }
              else {
                active[101]=1;
                ends[101]=1;
                tdone[101]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192275(int [] tdone, int [] ends){
        switch(S191262){
      case 0 : 
        active[100]=0;
        ends[100]=0;
        tdone[100]=1;
        break;
      
      case 1 : 
        switch(S191261){
          case 0 : 
            if(mode.getprestatus()){//sysj\conveyor_controller.sysj line: 871, column: 11
              S191261=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 873, column: 9
                autoMode_92.setPresent();//sysj\conveyor_controller.sysj line: 874, column: 7
                currsigs.addElement(autoMode_92);
                active[100]=1;
                ends[100]=1;
                tdone[100]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 876, column: 14
                  manualMode_92.setPresent();//sysj\conveyor_controller.sysj line: 877, column: 7
                  currsigs.addElement(manualMode_92);
                  active[100]=1;
                  ends[100]=1;
                  tdone[100]=1;
                }
                else {
                  active[100]=1;
                  ends[100]=1;
                  tdone[100]=1;
                }
              }
            }
            else {
              active[100]=1;
              ends[100]=1;
              tdone[100]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 873, column: 9
              autoMode_92.setPresent();//sysj\conveyor_controller.sysj line: 874, column: 7
              currsigs.addElement(autoMode_92);
              active[100]=1;
              ends[100]=1;
              tdone[100]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 876, column: 14
                manualMode_92.setPresent();//sysj\conveyor_controller.sysj line: 877, column: 7
                currsigs.addElement(manualMode_92);
                active[100]=1;
                ends[100]=1;
                tdone[100]=1;
              }
              else {
                active[100]=1;
                ends[100]=1;
                tdone[100]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192273(int [] tdone, int [] ends){
        switch(S141780){
      case 0 : 
        active[99]=0;
        ends[99]=0;
        tdone[99]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 864, column: 21
          armDest.setPresent();//sysj\conveyor_controller.sysj line: 864, column: 31
          currsigs.addElement(armDest);
          active[99]=1;
          ends[99]=1;
          tdone[99]=1;
        }
        else {
          active[99]=1;
          ends[99]=1;
          tdone[99]=1;
        }
        break;
      
    }
  }

  public void thread192272(int [] tdone, int [] ends){
        switch(S141772){
      case 0 : 
        active[98]=0;
        ends[98]=0;
        tdone[98]=1;
        break;
      
      case 1 : 
        switch(S141676){
          case 0 : 
            switch(S141636){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 862, column: 48
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 862, column: 48
                  S141636=1;
                  active[98]=1;
                  ends[98]=1;
                  tdone[98]=1;
                }
                else {
                  switch(S141631){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 862, column: 48
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 862, column: 48
                        S141631=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 862, column: 48
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 862, column: 48
                          ends[98]=2;
                          ;//sysj\conveyor_controller.sysj line: 862, column: 48
                          S141676=1;
                          active[98]=1;
                          ends[98]=1;
                          tdone[98]=1;
                        }
                        else {
                          active[98]=1;
                          ends[98]=1;
                          tdone[98]=1;
                        }
                      }
                      else {
                        active[98]=1;
                        ends[98]=1;
                        tdone[98]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 862, column: 48
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 862, column: 48
                        ends[98]=2;
                        ;//sysj\conveyor_controller.sysj line: 862, column: 48
                        S141676=1;
                        active[98]=1;
                        ends[98]=1;
                        tdone[98]=1;
                      }
                      else {
                        active[98]=1;
                        ends[98]=1;
                        tdone[98]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S141636=1;
                S141636=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 862, column: 48
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 862, column: 48
                  S141636=1;
                  active[98]=1;
                  ends[98]=1;
                  tdone[98]=1;
                }
                else {
                  S141631=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 862, column: 48
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 862, column: 48
                    S141631=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 862, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 862, column: 48
                      ends[98]=2;
                      ;//sysj\conveyor_controller.sysj line: 862, column: 48
                      S141676=1;
                      active[98]=1;
                      ends[98]=1;
                      tdone[98]=1;
                    }
                    else {
                      active[98]=1;
                      ends[98]=1;
                      tdone[98]=1;
                    }
                  }
                  else {
                    active[98]=1;
                    ends[98]=1;
                    tdone[98]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S141676=1;
            S141676=0;
            if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 862, column: 21
              armSource.setPresent();//sysj\conveyor_controller.sysj line: 862, column: 33
              currsigs.addElement(armSource);
              S141636=0;
              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 862, column: 48
                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 862, column: 48
                S141636=1;
                active[98]=1;
                ends[98]=1;
                tdone[98]=1;
              }
              else {
                S141631=0;
                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 862, column: 48
                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 862, column: 48
                  S141631=1;
                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 862, column: 48
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 862, column: 48
                    ends[98]=2;
                    ;//sysj\conveyor_controller.sysj line: 862, column: 48
                    S141676=1;
                    active[98]=1;
                    ends[98]=1;
                    tdone[98]=1;
                  }
                  else {
                    active[98]=1;
                    ends[98]=1;
                    tdone[98]=1;
                  }
                }
                else {
                  active[98]=1;
                  ends[98]=1;
                  tdone[98]=1;
                }
              }
            }
            else {
              S141676=1;
              active[98]=1;
              ends[98]=1;
              tdone[98]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192271(int [] tdone, int [] ends){
        switch(S141629){
      case 0 : 
        active[97]=0;
        ends[97]=0;
        tdone[97]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 860, column: 21
          vacOn.setPresent();//sysj\conveyor_controller.sysj line: 860, column: 29
          currsigs.addElement(vacOn);
          active[97]=1;
          ends[97]=1;
          tdone[97]=1;
        }
        else {
          active[97]=1;
          ends[97]=1;
          tdone[97]=1;
        }
        break;
      
    }
  }

  public void thread192270(int [] tdone, int [] ends){
        switch(S141621){
      case 0 : 
        active[96]=0;
        ends[96]=0;
        tdone[96]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 858, column: 21
          pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 858, column: 36
          currsigs.addElement(pusherExtend);
          active[96]=1;
          ends[96]=1;
          tdone[96]=1;
        }
        else {
          active[96]=1;
          ends[96]=1;
          tdone[96]=1;
        }
        break;
      
    }
  }

  public void thread192268(int [] tdone, int [] ends){
        S141780=1;
    if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 864, column: 21
      armDest.setPresent();//sysj\conveyor_controller.sysj line: 864, column: 31
      currsigs.addElement(armDest);
      active[99]=1;
      ends[99]=1;
      tdone[99]=1;
    }
    else {
      active[99]=1;
      ends[99]=1;
      tdone[99]=1;
    }
  }

  public void thread192267(int [] tdone, int [] ends){
        S141772=1;
    S141676=0;
    if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 862, column: 21
      armSource.setPresent();//sysj\conveyor_controller.sysj line: 862, column: 33
      currsigs.addElement(armSource);
      S141636=0;
      if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 862, column: 48
        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 862, column: 48
        S141636=1;
        active[98]=1;
        ends[98]=1;
        tdone[98]=1;
      }
      else {
        S141631=0;
        if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 862, column: 48
          lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 862, column: 48
          S141631=1;
          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 862, column: 48
            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 862, column: 48
            ends[98]=2;
            ;//sysj\conveyor_controller.sysj line: 862, column: 48
            S141676=1;
            active[98]=1;
            ends[98]=1;
            tdone[98]=1;
          }
          else {
            active[98]=1;
            ends[98]=1;
            tdone[98]=1;
          }
        }
        else {
          active[98]=1;
          ends[98]=1;
          tdone[98]=1;
        }
      }
    }
    else {
      S141676=1;
      active[98]=1;
      ends[98]=1;
      tdone[98]=1;
    }
  }

  public void thread192266(int [] tdone, int [] ends){
        S141629=1;
    if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 860, column: 21
      vacOn.setPresent();//sysj\conveyor_controller.sysj line: 860, column: 29
      currsigs.addElement(vacOn);
      active[97]=1;
      ends[97]=1;
      tdone[97]=1;
    }
    else {
      active[97]=1;
      ends[97]=1;
      tdone[97]=1;
    }
  }

  public void thread192265(int [] tdone, int [] ends){
        S141621=1;
    if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 858, column: 21
      pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 858, column: 36
      currsigs.addElement(pusherExtend);
      active[96]=1;
      ends[96]=1;
      tdone[96]=1;
    }
    else {
      active[96]=1;
      ends[96]=1;
      tdone[96]=1;
    }
  }

  public void thread192263(int [] tdone, int [] ends){
        switch(S138766){
      case 0 : 
        active[95]=0;
        ends[95]=0;
        tdone[95]=1;
        break;
      
      case 1 : 
        switch(S138757){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 829, column: 16
              System.out.println("WP gripped");//sysj\conveyor_controller.sysj line: 830, column: 10
              S138757=1;
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 832, column: 11
              currsigs.addElement(armDest);
              active[95]=1;
              ends[95]=1;
              tdone[95]=1;
            }
            else {
              active[95]=1;
              ends[95]=1;
              tdone[95]=1;
            }
            break;
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 831, column: 16
              System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 834, column: 10
              ends[95]=2;
              tdone[95]=1;
            }
            else {
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 832, column: 11
              currsigs.addElement(armDest);
              active[95]=1;
              ends[95]=1;
              tdone[95]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192262(int [] tdone, int [] ends){
        switch(S138755){
      case 0 : 
        active[94]=0;
        ends[94]=0;
        tdone[94]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\conveyor_controller.sysj line: 825, column: 10
        currsigs.addElement(vacOn);
        active[94]=1;
        ends[94]=1;
        tdone[94]=1;
        break;
      
    }
  }

  public void thread192260(int [] tdone, int [] ends){
        S138766=1;
    S138757=0;
    active[95]=1;
    ends[95]=1;
    tdone[95]=1;
  }

  public void thread192259(int [] tdone, int [] ends){
        S138755=1;
    vacOn.setPresent();//sysj\conveyor_controller.sysj line: 825, column: 10
    currsigs.addElement(vacOn);
    active[94]=1;
    ends[94]=1;
    tdone[94]=1;
  }

  public void thread192258(int [] tdone, int [] ends){
        switch(S191241){
      case 0 : 
        active[93]=0;
        ends[93]=0;
        tdone[93]=1;
        break;
      
      case 1 : 
        switch(S191240){
          case 0 : 
            switch(S138648){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 789, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 789, column: 5
                  S138648=1;
                  active[93]=1;
                  ends[93]=1;
                  tdone[93]=1;
                }
                else {
                  switch(S138643){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 789, column: 5
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 789, column: 5
                        S138643=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 789, column: 5
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 789, column: 5
                          ends[93]=2;
                          ;//sysj\conveyor_controller.sysj line: 789, column: 5
                          S191240=1;
                          S138709=0;
                          active[93]=1;
                          ends[93]=1;
                          tdone[93]=1;
                        }
                        else {
                          active[93]=1;
                          ends[93]=1;
                          tdone[93]=1;
                        }
                      }
                      else {
                        active[93]=1;
                        ends[93]=1;
                        tdone[93]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 789, column: 5
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 789, column: 5
                        ends[93]=2;
                        ;//sysj\conveyor_controller.sysj line: 789, column: 5
                        S191240=1;
                        S138709=0;
                        active[93]=1;
                        ends[93]=1;
                        tdone[93]=1;
                      }
                      else {
                        active[93]=1;
                        ends[93]=1;
                        tdone[93]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S138648=1;
                S138648=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 789, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 789, column: 5
                  S138648=1;
                  active[93]=1;
                  ends[93]=1;
                  tdone[93]=1;
                }
                else {
                  S138643=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 789, column: 5
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 789, column: 5
                    S138643=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 789, column: 5
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 789, column: 5
                      ends[93]=2;
                      ;//sysj\conveyor_controller.sysj line: 789, column: 5
                      S191240=1;
                      S138709=0;
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                    else {
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                  }
                  else {
                    active[93]=1;
                    ends[93]=1;
                    tdone[93]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S138709){
              case 0 : 
                if(bottleAtPos3_92.getprestatus()){//sysj\conveyor_controller.sysj line: 791, column: 13
                  S138709=1;
                  S138671=0;
                  if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 792, column: 6
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 6
                    S138671=1;
                    active[93]=1;
                    ends[93]=1;
                    tdone[93]=1;
                  }
                  else {
                    S138666=0;
                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 6
                      lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 792, column: 6
                      S138666=1;
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 6
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 6
                        ends[93]=2;
                        ;//sysj\conveyor_controller.sysj line: 792, column: 6
                        S138709=2;
                        System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 794, column: 7
                        S138718=0;
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 796, column: 8
                        currsigs.addElement(armDest);
                        active[93]=1;
                        ends[93]=1;
                        tdone[93]=1;
                      }
                      else {
                        active[93]=1;
                        ends[93]=1;
                        tdone[93]=1;
                      }
                    }
                    else {
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                  }
                }
                else {
                  active[93]=1;
                  ends[93]=1;
                  tdone[93]=1;
                }
                break;
              
              case 1 : 
                switch(S138671){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 792, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 6
                      S138671=1;
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                    else {
                      switch(S138666){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 6
                            lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 792, column: 6
                            S138666=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 6
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 6
                              ends[93]=2;
                              ;//sysj\conveyor_controller.sysj line: 792, column: 6
                              S138709=2;
                              System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 794, column: 7
                              S138718=0;
                              armDest.setPresent();//sysj\conveyor_controller.sysj line: 796, column: 8
                              currsigs.addElement(armDest);
                              active[93]=1;
                              ends[93]=1;
                              tdone[93]=1;
                            }
                            else {
                              active[93]=1;
                              ends[93]=1;
                              tdone[93]=1;
                            }
                          }
                          else {
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 6
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 6
                            ends[93]=2;
                            ;//sysj\conveyor_controller.sysj line: 792, column: 6
                            S138709=2;
                            System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 794, column: 7
                            S138718=0;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 796, column: 8
                            currsigs.addElement(armDest);
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          else {
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S138671=1;
                    S138671=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 792, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 6
                      S138671=1;
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                    else {
                      S138666=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 6
                        lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 792, column: 6
                        S138666=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 6
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 6
                          ends[93]=2;
                          ;//sysj\conveyor_controller.sysj line: 792, column: 6
                          S138709=2;
                          System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 794, column: 7
                          S138718=0;
                          armDest.setPresent();//sysj\conveyor_controller.sysj line: 796, column: 8
                          currsigs.addElement(armDest);
                          active[93]=1;
                          ends[93]=1;
                          tdone[93]=1;
                        }
                        else {
                          active[93]=1;
                          ends[93]=1;
                          tdone[93]=1;
                        }
                      }
                      else {
                        active[93]=1;
                        ends[93]=1;
                        tdone[93]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                if(manualMode_92.getprestatus()){//sysj\conveyor_controller.sysj line: 793, column: 12
                  lidLoaderReady_o.setPreempted();
                  S138709=3;
                  active[93]=1;
                  ends[93]=1;
                  tdone[93]=1;
                }
                else {
                  switch(S138718){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 795, column: 13
                        System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 798, column: 7
                        S138718=1;
                        active[93]=1;
                        ends[93]=1;
                        tdone[93]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 796, column: 8
                        currsigs.addElement(armDest);
                        active[93]=1;
                        ends[93]=1;
                        tdone[93]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 799, column: 13
                        System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 800, column: 7
                        S138718=2;
                        S138724=0;
                        active[93]=1;
                        ends[93]=1;
                        tdone[93]=1;
                      }
                      else {
                        active[93]=1;
                        ends[93]=1;
                        tdone[93]=1;
                      }
                      break;
                    
                    case 2 : 
                      switch(S138724){
                        case 0 : 
                          if(!empty.getprestatus()){//sysj\conveyor_controller.sysj line: 803, column: 14
                            S138724=1;
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          else {
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(request.getprestatus()){//sysj\conveyor_controller.sysj line: 804, column: 14
                            System.out.println("New request");//sysj\conveyor_controller.sysj line: 805, column: 8
                            S138724=2;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 807, column: 9
                            currsigs.addElement(armDest);
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          else {
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          break;
                        
                        case 2 : 
                          if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 806, column: 14
                            System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 809, column: 8
                            S138724=3;
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 812, column: 9
                            currsigs.addElement(pusherExtend);
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          else {
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 807, column: 9
                            currsigs.addElement(armDest);
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          break;
                        
                        case 3 : 
                          if(pusherExtended.getprestatus()){//sysj\conveyor_controller.sysj line: 811, column: 14
                            System.out.println("Pusher extended");//sysj\conveyor_controller.sysj line: 814, column: 8
                            S138724=4;
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 812, column: 9
                            currsigs.addElement(pusherExtend);
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          break;
                        
                        case 4 : 
                          if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 815, column: 14
                            System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 816, column: 8
                            S138724=5;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 819, column: 9
                            currsigs.addElement(armSource);
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          else {
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          break;
                        
                        case 5 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 818, column: 14
                            System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 821, column: 8
                            S138724=6;
                            thread192259(tdone,ends);
                            thread192260(tdone,ends);
                            int biggest192261 = 0;
                            if(ends[94]>=biggest192261){
                              biggest192261=ends[94];
                            }
                            if(ends[95]>=biggest192261){
                              biggest192261=ends[95];
                            }
                            if(biggest192261 == 1){
                              active[93]=1;
                              ends[93]=1;
                              tdone[93]=1;
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 819, column: 9
                            currsigs.addElement(armSource);
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          break;
                        
                        case 6 : 
                          thread192262(tdone,ends);
                          thread192263(tdone,ends);
                          int biggest192264 = 0;
                          if(ends[94]>=biggest192264){
                            biggest192264=ends[94];
                          }
                          if(ends[95]>=biggest192264){
                            biggest192264=ends[95];
                          }
                          if(biggest192264 == 1){
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          if(biggest192264 == 2){
                            ends[93]=2;
                            ;//sysj\conveyor_controller.sysj line: 823, column: 8
                            S138724=7;
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          //FINXME code
                          if(biggest192264 == 0){
                            S138724=7;
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          break;
                        
                        case 7 : 
                          if(!WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 839, column: 14
                            S138724=8;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 842, column: 9
                            currsigs.addElement(armSource);
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          else {
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          break;
                        
                        case 8 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 841, column: 14
                            S138724=9;
                            S138802=0;
                            if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 846, column: 8
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 846, column: 8
                              S138802=1;
                              active[93]=1;
                              ends[93]=1;
                              tdone[93]=1;
                            }
                            else {
                              S138797=0;
                              if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 846, column: 8
                                lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 846, column: 8
                                S138797=1;
                                if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 846, column: 8
                                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 846, column: 8
                                  ends[93]=2;
                                  ;//sysj\conveyor_controller.sysj line: 846, column: 8
                                  System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 848, column: 8
                                  S138724=10;
                                  active[93]=1;
                                  ends[93]=1;
                                  tdone[93]=1;
                                }
                                else {
                                  active[93]=1;
                                  ends[93]=1;
                                  tdone[93]=1;
                                }
                              }
                              else {
                                active[93]=1;
                                ends[93]=1;
                                tdone[93]=1;
                              }
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 842, column: 9
                            currsigs.addElement(armSource);
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          break;
                        
                        case 9 : 
                          switch(S138802){
                            case 0 : 
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 846, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 846, column: 8
                                S138802=1;
                                active[93]=1;
                                ends[93]=1;
                                tdone[93]=1;
                              }
                              else {
                                switch(S138797){
                                  case 0 : 
                                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 846, column: 8
                                      lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 846, column: 8
                                      S138797=1;
                                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 846, column: 8
                                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 846, column: 8
                                        ends[93]=2;
                                        ;//sysj\conveyor_controller.sysj line: 846, column: 8
                                        System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 848, column: 8
                                        S138724=10;
                                        active[93]=1;
                                        ends[93]=1;
                                        tdone[93]=1;
                                      }
                                      else {
                                        active[93]=1;
                                        ends[93]=1;
                                        tdone[93]=1;
                                      }
                                    }
                                    else {
                                      active[93]=1;
                                      ends[93]=1;
                                      tdone[93]=1;
                                    }
                                    break;
                                  
                                  case 1 : 
                                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 846, column: 8
                                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 846, column: 8
                                      ends[93]=2;
                                      ;//sysj\conveyor_controller.sysj line: 846, column: 8
                                      System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 848, column: 8
                                      S138724=10;
                                      active[93]=1;
                                      ends[93]=1;
                                      tdone[93]=1;
                                    }
                                    else {
                                      active[93]=1;
                                      ends[93]=1;
                                      tdone[93]=1;
                                    }
                                    break;
                                  
                                }
                              }
                              break;
                            
                            case 1 : 
                              S138802=1;
                              S138802=0;
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 846, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 846, column: 8
                                S138802=1;
                                active[93]=1;
                                ends[93]=1;
                                tdone[93]=1;
                              }
                              else {
                                S138797=0;
                                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 846, column: 8
                                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 846, column: 8
                                  S138797=1;
                                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 846, column: 8
                                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 846, column: 8
                                    ends[93]=2;
                                    ;//sysj\conveyor_controller.sysj line: 846, column: 8
                                    System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 848, column: 8
                                    S138724=10;
                                    active[93]=1;
                                    ends[93]=1;
                                    tdone[93]=1;
                                  }
                                  else {
                                    active[93]=1;
                                    ends[93]=1;
                                    tdone[93]=1;
                                  }
                                }
                                else {
                                  active[93]=1;
                                  ends[93]=1;
                                  tdone[93]=1;
                                }
                              }
                              break;
                            
                          }
                          break;
                        
                        case 10 : 
                          S138724=10;
                          S138724=0;
                          active[93]=1;
                          ends[93]=1;
                          tdone[93]=1;
                          break;
                        
                      }
                      break;
                    
                  }
                }
                break;
              
              case 3 : 
                S138709=3;
                System.out.println("entering manual");//sysj\conveyor_controller.sysj line: 856, column: 6
                S138709=4;
                thread192265(tdone,ends);
                thread192266(tdone,ends);
                thread192267(tdone,ends);
                thread192268(tdone,ends);
                int biggest192269 = 0;
                if(ends[96]>=biggest192269){
                  biggest192269=ends[96];
                }
                if(ends[97]>=biggest192269){
                  biggest192269=ends[97];
                }
                if(ends[98]>=biggest192269){
                  biggest192269=ends[98];
                }
                if(ends[99]>=biggest192269){
                  biggest192269=ends[99];
                }
                if(biggest192269 == 1){
                  active[93]=1;
                  ends[93]=1;
                  tdone[93]=1;
                }
                break;
              
              case 4 : 
                if(autoMode_92.getprestatus()){//sysj\conveyor_controller.sysj line: 857, column: 12
                  lidLoaderReady_o.setPreempted();
                  S138709=0;
                  active[93]=1;
                  ends[93]=1;
                  tdone[93]=1;
                }
                else {
                  thread192270(tdone,ends);
                  thread192271(tdone,ends);
                  thread192272(tdone,ends);
                  thread192273(tdone,ends);
                  int biggest192274 = 0;
                  if(ends[96]>=biggest192274){
                    biggest192274=ends[96];
                  }
                  if(ends[97]>=biggest192274){
                    biggest192274=ends[97];
                  }
                  if(ends[98]>=biggest192274){
                    biggest192274=ends[98];
                  }
                  if(ends[99]>=biggest192274){
                    biggest192274=ends[99];
                  }
                  if(biggest192274 == 1){
                    active[93]=1;
                    ends[93]=1;
                    tdone[93]=1;
                  }
                  //FINXME code
                  if(biggest192274 == 0){
                    S138709=0;
                    active[93]=1;
                    ends[93]=1;
                    tdone[93]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192255(int [] tdone, int [] ends){
        S191353=1;
    active[104]=1;
    ends[104]=1;
    tdone[104]=1;
  }

  public void thread192254(int [] tdone, int [] ends){
        S191350=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 903, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[103]=1;
    ends[103]=1;
    tdone[103]=1;
  }

  public void thread192253(int [] tdone, int [] ends){
        S191383=1;
    S191357=0;
    if(bottleAtPos3_92.getprestatus()){//sysj\conveyor_controller.sysj line: 900, column: 20
      thread192254(tdone,ends);
      thread192255(tdone,ends);
      int biggest192256 = 0;
      if(ends[103]>=biggest192256){
        biggest192256=ends[103];
      }
      if(ends[104]>=biggest192256){
        biggest192256=ends[104];
      }
      if(biggest192256 == 1){
        active[102]=1;
        ends[102]=1;
        tdone[102]=1;
      }
    }
    else {
      S191357=1;
      active[102]=1;
      ends[102]=1;
      tdone[102]=1;
    }
  }

  public void thread192252(int [] tdone, int [] ends){
        S191345=1;
    S191289=0;
    S191269=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 887, column: 6
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 887, column: 6
      S191269=1;
      active[101]=1;
      ends[101]=1;
      tdone[101]=1;
    }
    else {
      S191264=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 887, column: 6
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 887, column: 6
        S191264=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 887, column: 6
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 887, column: 6
          ends[101]=2;
          ;//sysj\conveyor_controller.sysj line: 887, column: 6
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 888, column: 9
            bottleAtPos3_92.setPresent();//sysj\conveyor_controller.sysj line: 889, column: 7
            currsigs.addElement(bottleAtPos3_92);
            S191289=1;
            active[101]=1;
            ends[101]=1;
            tdone[101]=1;
          }
          else {
            done_92.setPresent();//sysj\conveyor_controller.sysj line: 891, column: 7
            currsigs.addElement(done_92);
            S191289=1;
            active[101]=1;
            ends[101]=1;
            tdone[101]=1;
          }
        }
        else {
          active[101]=1;
          ends[101]=1;
          tdone[101]=1;
        }
      }
      else {
        active[101]=1;
        ends[101]=1;
        tdone[101]=1;
      }
    }
  }

  public void thread192251(int [] tdone, int [] ends){
        S191262=1;
    S191261=0;
    active[100]=1;
    ends[100]=1;
    tdone[100]=1;
  }

  public void thread192250(int [] tdone, int [] ends){
        S191241=1;
    S191240=0;
    S138648=0;
    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 789, column: 5
      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 789, column: 5
      S138648=1;
      active[93]=1;
      ends[93]=1;
      tdone[93]=1;
    }
    else {
      S138643=0;
      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 789, column: 5
        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 789, column: 5
        S138643=1;
        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 789, column: 5
          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 789, column: 5
          ends[93]=2;
          ;//sysj\conveyor_controller.sysj line: 789, column: 5
          S191240=1;
          S138709=0;
          active[93]=1;
          ends[93]=1;
          tdone[93]=1;
        }
        else {
          active[93]=1;
          ends[93]=1;
          tdone[93]=1;
        }
      }
      else {
        active[93]=1;
        ends[93]=1;
        tdone[93]=1;
      }
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S191385){
        case 0 : 
          S191385=0;
          break RUN;
        
        case 1 : 
          S191385=2;
          S191385=2;
          manualMode_92.setClear();//sysj\conveyor_controller.sysj line: 787, column: 4
          autoMode_92.setClear();//sysj\conveyor_controller.sysj line: 787, column: 4
          bottleAtPos3_92.setClear();//sysj\conveyor_controller.sysj line: 787, column: 4
          done_92.setClear();//sysj\conveyor_controller.sysj line: 787, column: 4
          thread192250(tdone,ends);
          thread192251(tdone,ends);
          thread192252(tdone,ends);
          thread192253(tdone,ends);
          int biggest192257 = 0;
          if(ends[93]>=biggest192257){
            biggest192257=ends[93];
          }
          if(ends[100]>=biggest192257){
            biggest192257=ends[100];
          }
          if(ends[101]>=biggest192257){
            biggest192257=ends[101];
          }
          if(ends[102]>=biggest192257){
            biggest192257=ends[102];
          }
          if(biggest192257 == 1){
            active[92]=1;
            ends[92]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_92.setClear();//sysj\conveyor_controller.sysj line: 787, column: 4
          autoMode_92.setClear();//sysj\conveyor_controller.sysj line: 787, column: 4
          bottleAtPos3_92.setClear();//sysj\conveyor_controller.sysj line: 787, column: 4
          done_92.setClear();//sysj\conveyor_controller.sysj line: 787, column: 4
          thread192258(tdone,ends);
          thread192275(tdone,ends);
          thread192276(tdone,ends);
          thread192277(tdone,ends);
          int biggest192284 = 0;
          if(ends[93]>=biggest192284){
            biggest192284=ends[93];
          }
          if(ends[100]>=biggest192284){
            biggest192284=ends[100];
          }
          if(ends[101]>=biggest192284){
            biggest192284=ends[101];
          }
          if(ends[102]>=biggest192284){
            biggest192284=ends[102];
          }
          if(biggest192284 == 1){
            active[92]=1;
            ends[92]=1;
            break RUN;
          }
          //FINXME code
          if(biggest192284 == 0){
            S191385=0;
            active[92]=0;
            ends[92]=0;
            S191385=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    manualMode_92 = new Signal();
    autoMode_92 = new Signal();
    bottleAtPos3_92 = new Signal();
    done_92 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[92] != 0){
      int index = 92;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[92]!=0 || suspended[92]!=0 || active[92]!=1);
      else{
        if(!df){
          checkThree_in.gethook();
          lidLoaderReady_o.gethook();
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      bottleAtPos3E.setpreclear();
      manualMode_92.setpreclear();
      autoMode_92.setpreclear();
      bottleAtPos3_92.setpreclear();
      done_92.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      bottleAtPos3E.sethook();
      bottleAtPos3E.setClear();
      manualMode_92.setClear();
      autoMode_92.setClear();
      bottleAtPos3_92.setClear();
      done_92.setClear();
      checkThree_in.sethook();
      lidLoaderReady_o.sethook();
      if(paused[92]!=0 || suspended[92]!=0 || active[92]!=1);
      else{
        checkThree_in.gethook();
        lidLoaderReady_o.gethook();
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[92] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
