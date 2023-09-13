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
  private Signal manualMode_91;
  private Signal autoMode_91;
  private Signal bottleAtPos3_91;
  private Signal done_91;
  private int S191485 = 1;
  private int S191341 = 1;
  private int S191340 = 1;
  private int S138748 = 1;
  private int S138743 = 1;
  private int S138809 = 1;
  private int S138771 = 1;
  private int S138766 = 1;
  private int S138818 = 1;
  private int S138824 = 1;
  private int S138855 = 1;
  private int S138866 = 1;
  private int S138857 = 1;
  private int S138902 = 1;
  private int S138897 = 1;
  private int S141721 = 1;
  private int S141729 = 1;
  private int S141872 = 1;
  private int S141776 = 1;
  private int S141736 = 1;
  private int S141731 = 1;
  private int S141880 = 1;
  private int S191362 = 1;
  private int S191361 = 1;
  private int S191445 = 1;
  private int S191389 = 1;
  private int S191369 = 1;
  private int S191364 = 1;
  private int S191483 = 1;
  private int S191457 = 1;
  private int S191450 = 1;
  private int S191453 = 1;
  
  private int[] ends = new int[104];
  private int[] tdone = new int[104];
  
  public void thread192377(int [] tdone, int [] ends){
        S191453=1;
    active[103]=1;
    ends[103]=1;
    tdone[103]=1;
  }

  public void thread192376(int [] tdone, int [] ends){
        S191450=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 902, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[102]=1;
    ends[102]=1;
    tdone[102]=1;
  }

  public void thread192374(int [] tdone, int [] ends){
        switch(S191453){
      case 0 : 
        active[103]=0;
        ends[103]=0;
        tdone[103]=1;
        break;
      
      case 1 : 
        if(done_91.getprestatus()){//sysj\conveyor_controller.sysj line: 906, column: 28
          ends[103]=2;
          tdone[103]=1;
        }
        else {
          active[103]=1;
          ends[103]=1;
          tdone[103]=1;
        }
        break;
      
    }
  }

  public void thread192373(int [] tdone, int [] ends){
        switch(S191450){
      case 0 : 
        active[102]=0;
        ends[102]=0;
        tdone[102]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 902, column: 22
        currsigs.addElement(bottleAtPos3E);
        active[102]=1;
        ends[102]=1;
        tdone[102]=1;
        break;
      
    }
  }

  public void thread192372(int [] tdone, int [] ends){
        switch(S191483){
      case 0 : 
        active[101]=0;
        ends[101]=0;
        tdone[101]=1;
        break;
      
      case 1 : 
        switch(S191457){
          case 0 : 
            thread192373(tdone,ends);
            thread192374(tdone,ends);
            int biggest192375 = 0;
            if(ends[102]>=biggest192375){
              biggest192375=ends[102];
            }
            if(ends[103]>=biggest192375){
              biggest192375=ends[103];
            }
            if(biggest192375 == 1){
              active[101]=1;
              ends[101]=1;
              tdone[101]=1;
            }
            if(biggest192375 == 2){
              ends[101]=2;
              ;//sysj\conveyor_controller.sysj line: 900, column: 7
              S191457=1;
              active[101]=1;
              ends[101]=1;
              tdone[101]=1;
            }
            //FINXME code
            if(biggest192375 == 0){
              ;//sysj\conveyor_controller.sysj line: 908, column: 19
              S191457=1;
              active[101]=1;
              ends[101]=1;
              tdone[101]=1;
            }
            break;
          
          case 1 : 
            S191457=1;
            S191457=0;
            if(bottleAtPos3_91.getprestatus()){//sysj\conveyor_controller.sysj line: 899, column: 20
              thread192376(tdone,ends);
              thread192377(tdone,ends);
              int biggest192378 = 0;
              if(ends[102]>=biggest192378){
                biggest192378=ends[102];
              }
              if(ends[103]>=biggest192378){
                biggest192378=ends[103];
              }
              if(biggest192378 == 1){
                active[101]=1;
                ends[101]=1;
                tdone[101]=1;
              }
            }
            else {
              S191457=1;
              active[101]=1;
              ends[101]=1;
              tdone[101]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192371(int [] tdone, int [] ends){
        switch(S191445){
      case 0 : 
        active[100]=0;
        ends[100]=0;
        tdone[100]=1;
        break;
      
      case 1 : 
        switch(S191389){
          case 0 : 
            switch(S191369){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 886, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 886, column: 6
                  S191369=1;
                  active[100]=1;
                  ends[100]=1;
                  tdone[100]=1;
                }
                else {
                  switch(S191364){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 886, column: 6
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 886, column: 6
                        S191364=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 886, column: 6
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 886, column: 6
                          ends[100]=2;
                          ;//sysj\conveyor_controller.sysj line: 886, column: 6
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 887, column: 9
                            bottleAtPos3_91.setPresent();//sysj\conveyor_controller.sysj line: 888, column: 7
                            currsigs.addElement(bottleAtPos3_91);
                            S191389=1;
                            active[100]=1;
                            ends[100]=1;
                            tdone[100]=1;
                          }
                          else {
                            done_91.setPresent();//sysj\conveyor_controller.sysj line: 890, column: 7
                            currsigs.addElement(done_91);
                            S191389=1;
                            active[100]=1;
                            ends[100]=1;
                            tdone[100]=1;
                          }
                        }
                        else {
                          active[100]=1;
                          ends[100]=1;
                          tdone[100]=1;
                        }
                      }
                      else {
                        active[100]=1;
                        ends[100]=1;
                        tdone[100]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 886, column: 6
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 886, column: 6
                        ends[100]=2;
                        ;//sysj\conveyor_controller.sysj line: 886, column: 6
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 887, column: 9
                          bottleAtPos3_91.setPresent();//sysj\conveyor_controller.sysj line: 888, column: 7
                          currsigs.addElement(bottleAtPos3_91);
                          S191389=1;
                          active[100]=1;
                          ends[100]=1;
                          tdone[100]=1;
                        }
                        else {
                          done_91.setPresent();//sysj\conveyor_controller.sysj line: 890, column: 7
                          currsigs.addElement(done_91);
                          S191389=1;
                          active[100]=1;
                          ends[100]=1;
                          tdone[100]=1;
                        }
                      }
                      else {
                        active[100]=1;
                        ends[100]=1;
                        tdone[100]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S191369=1;
                S191369=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 886, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 886, column: 6
                  S191369=1;
                  active[100]=1;
                  ends[100]=1;
                  tdone[100]=1;
                }
                else {
                  S191364=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 886, column: 6
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 886, column: 6
                    S191364=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 886, column: 6
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 886, column: 6
                      ends[100]=2;
                      ;//sysj\conveyor_controller.sysj line: 886, column: 6
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 887, column: 9
                        bottleAtPos3_91.setPresent();//sysj\conveyor_controller.sysj line: 888, column: 7
                        currsigs.addElement(bottleAtPos3_91);
                        S191389=1;
                        active[100]=1;
                        ends[100]=1;
                        tdone[100]=1;
                      }
                      else {
                        done_91.setPresent();//sysj\conveyor_controller.sysj line: 890, column: 7
                        currsigs.addElement(done_91);
                        S191389=1;
                        active[100]=1;
                        ends[100]=1;
                        tdone[100]=1;
                      }
                    }
                    else {
                      active[100]=1;
                      ends[100]=1;
                      tdone[100]=1;
                    }
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
          
          case 1 : 
            S191389=1;
            S191389=0;
            S191369=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 886, column: 6
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 886, column: 6
              S191369=1;
              active[100]=1;
              ends[100]=1;
              tdone[100]=1;
            }
            else {
              S191364=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 886, column: 6
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 886, column: 6
                S191364=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 886, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 886, column: 6
                  ends[100]=2;
                  ;//sysj\conveyor_controller.sysj line: 886, column: 6
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 887, column: 9
                    bottleAtPos3_91.setPresent();//sysj\conveyor_controller.sysj line: 888, column: 7
                    currsigs.addElement(bottleAtPos3_91);
                    S191389=1;
                    active[100]=1;
                    ends[100]=1;
                    tdone[100]=1;
                  }
                  else {
                    done_91.setPresent();//sysj\conveyor_controller.sysj line: 890, column: 7
                    currsigs.addElement(done_91);
                    S191389=1;
                    active[100]=1;
                    ends[100]=1;
                    tdone[100]=1;
                  }
                }
                else {
                  active[100]=1;
                  ends[100]=1;
                  tdone[100]=1;
                }
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

  public void thread192370(int [] tdone, int [] ends){
        switch(S191362){
      case 0 : 
        active[99]=0;
        ends[99]=0;
        tdone[99]=1;
        break;
      
      case 1 : 
        switch(S191361){
          case 0 : 
            if(mode.getprestatus()){//sysj\conveyor_controller.sysj line: 870, column: 11
              S191361=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 872, column: 9
                autoMode_91.setPresent();//sysj\conveyor_controller.sysj line: 873, column: 7
                currsigs.addElement(autoMode_91);
                active[99]=1;
                ends[99]=1;
                tdone[99]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 875, column: 14
                  manualMode_91.setPresent();//sysj\conveyor_controller.sysj line: 876, column: 7
                  currsigs.addElement(manualMode_91);
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
            }
            else {
              active[99]=1;
              ends[99]=1;
              tdone[99]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 872, column: 9
              autoMode_91.setPresent();//sysj\conveyor_controller.sysj line: 873, column: 7
              currsigs.addElement(autoMode_91);
              active[99]=1;
              ends[99]=1;
              tdone[99]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 875, column: 14
                manualMode_91.setPresent();//sysj\conveyor_controller.sysj line: 876, column: 7
                currsigs.addElement(manualMode_91);
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
            break;
          
        }
        break;
      
    }
  }

  public void thread192368(int [] tdone, int [] ends){
        switch(S141880){
      case 0 : 
        active[98]=0;
        ends[98]=0;
        tdone[98]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 863, column: 21
          armDest.setPresent();//sysj\conveyor_controller.sysj line: 863, column: 31
          currsigs.addElement(armDest);
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

  public void thread192367(int [] tdone, int [] ends){
        switch(S141872){
      case 0 : 
        active[97]=0;
        ends[97]=0;
        tdone[97]=1;
        break;
      
      case 1 : 
        switch(S141776){
          case 0 : 
            switch(S141736){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 861, column: 48
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 861, column: 48
                  S141736=1;
                  active[97]=1;
                  ends[97]=1;
                  tdone[97]=1;
                }
                else {
                  switch(S141731){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 861, column: 48
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 861, column: 48
                        S141731=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 861, column: 48
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 861, column: 48
                          ends[97]=2;
                          ;//sysj\conveyor_controller.sysj line: 861, column: 48
                          S141776=1;
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
                      else {
                        active[97]=1;
                        ends[97]=1;
                        tdone[97]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 861, column: 48
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 861, column: 48
                        ends[97]=2;
                        ;//sysj\conveyor_controller.sysj line: 861, column: 48
                        S141776=1;
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
                break;
              
              case 1 : 
                S141736=1;
                S141736=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 861, column: 48
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 861, column: 48
                  S141736=1;
                  active[97]=1;
                  ends[97]=1;
                  tdone[97]=1;
                }
                else {
                  S141731=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 861, column: 48
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 861, column: 48
                    S141731=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 861, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 861, column: 48
                      ends[97]=2;
                      ;//sysj\conveyor_controller.sysj line: 861, column: 48
                      S141776=1;
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
                  else {
                    active[97]=1;
                    ends[97]=1;
                    tdone[97]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S141776=1;
            S141776=0;
            if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 861, column: 21
              armSource.setPresent();//sysj\conveyor_controller.sysj line: 861, column: 33
              currsigs.addElement(armSource);
              S141736=0;
              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 861, column: 48
                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 861, column: 48
                S141736=1;
                active[97]=1;
                ends[97]=1;
                tdone[97]=1;
              }
              else {
                S141731=0;
                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 861, column: 48
                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 861, column: 48
                  S141731=1;
                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 861, column: 48
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 861, column: 48
                    ends[97]=2;
                    ;//sysj\conveyor_controller.sysj line: 861, column: 48
                    S141776=1;
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
                else {
                  active[97]=1;
                  ends[97]=1;
                  tdone[97]=1;
                }
              }
            }
            else {
              S141776=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192366(int [] tdone, int [] ends){
        switch(S141729){
      case 0 : 
        active[96]=0;
        ends[96]=0;
        tdone[96]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 859, column: 21
          vacOn.setPresent();//sysj\conveyor_controller.sysj line: 859, column: 29
          currsigs.addElement(vacOn);
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

  public void thread192365(int [] tdone, int [] ends){
        switch(S141721){
      case 0 : 
        active[95]=0;
        ends[95]=0;
        tdone[95]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 857, column: 21
          pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 857, column: 36
          currsigs.addElement(pusherExtend);
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
      
    }
  }

  public void thread192363(int [] tdone, int [] ends){
        S141880=1;
    if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 863, column: 21
      armDest.setPresent();//sysj\conveyor_controller.sysj line: 863, column: 31
      currsigs.addElement(armDest);
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

  public void thread192362(int [] tdone, int [] ends){
        S141872=1;
    S141776=0;
    if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 861, column: 21
      armSource.setPresent();//sysj\conveyor_controller.sysj line: 861, column: 33
      currsigs.addElement(armSource);
      S141736=0;
      if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 861, column: 48
        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 861, column: 48
        S141736=1;
        active[97]=1;
        ends[97]=1;
        tdone[97]=1;
      }
      else {
        S141731=0;
        if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 861, column: 48
          lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 861, column: 48
          S141731=1;
          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 861, column: 48
            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 861, column: 48
            ends[97]=2;
            ;//sysj\conveyor_controller.sysj line: 861, column: 48
            S141776=1;
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
        else {
          active[97]=1;
          ends[97]=1;
          tdone[97]=1;
        }
      }
    }
    else {
      S141776=1;
      active[97]=1;
      ends[97]=1;
      tdone[97]=1;
    }
  }

  public void thread192361(int [] tdone, int [] ends){
        S141729=1;
    if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 859, column: 21
      vacOn.setPresent();//sysj\conveyor_controller.sysj line: 859, column: 29
      currsigs.addElement(vacOn);
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

  public void thread192360(int [] tdone, int [] ends){
        S141721=1;
    if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 857, column: 21
      pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 857, column: 36
      currsigs.addElement(pusherExtend);
      active[95]=1;
      ends[95]=1;
      tdone[95]=1;
    }
    else {
      active[95]=1;
      ends[95]=1;
      tdone[95]=1;
    }
  }

  public void thread192358(int [] tdone, int [] ends){
        switch(S138866){
      case 0 : 
        active[94]=0;
        ends[94]=0;
        tdone[94]=1;
        break;
      
      case 1 : 
        switch(S138857){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 828, column: 16
              System.out.println("WP gripped");//sysj\conveyor_controller.sysj line: 829, column: 10
              S138857=1;
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 831, column: 11
              currsigs.addElement(armDest);
              active[94]=1;
              ends[94]=1;
              tdone[94]=1;
            }
            else {
              active[94]=1;
              ends[94]=1;
              tdone[94]=1;
            }
            break;
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 830, column: 16
              System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 833, column: 10
              ends[94]=2;
              tdone[94]=1;
            }
            else {
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 831, column: 11
              currsigs.addElement(armDest);
              active[94]=1;
              ends[94]=1;
              tdone[94]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192357(int [] tdone, int [] ends){
        switch(S138855){
      case 0 : 
        active[93]=0;
        ends[93]=0;
        tdone[93]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\conveyor_controller.sysj line: 824, column: 10
        currsigs.addElement(vacOn);
        active[93]=1;
        ends[93]=1;
        tdone[93]=1;
        break;
      
    }
  }

  public void thread192355(int [] tdone, int [] ends){
        S138866=1;
    S138857=0;
    active[94]=1;
    ends[94]=1;
    tdone[94]=1;
  }

  public void thread192354(int [] tdone, int [] ends){
        S138855=1;
    vacOn.setPresent();//sysj\conveyor_controller.sysj line: 824, column: 10
    currsigs.addElement(vacOn);
    active[93]=1;
    ends[93]=1;
    tdone[93]=1;
  }

  public void thread192353(int [] tdone, int [] ends){
        switch(S191341){
      case 0 : 
        active[92]=0;
        ends[92]=0;
        tdone[92]=1;
        break;
      
      case 1 : 
        switch(S191340){
          case 0 : 
            switch(S138748){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 788, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 788, column: 5
                  S138748=1;
                  active[92]=1;
                  ends[92]=1;
                  tdone[92]=1;
                }
                else {
                  switch(S138743){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 788, column: 5
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 788, column: 5
                        S138743=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 788, column: 5
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 788, column: 5
                          ends[92]=2;
                          ;//sysj\conveyor_controller.sysj line: 788, column: 5
                          S191340=1;
                          S138809=0;
                          active[92]=1;
                          ends[92]=1;
                          tdone[92]=1;
                        }
                        else {
                          active[92]=1;
                          ends[92]=1;
                          tdone[92]=1;
                        }
                      }
                      else {
                        active[92]=1;
                        ends[92]=1;
                        tdone[92]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 788, column: 5
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 788, column: 5
                        ends[92]=2;
                        ;//sysj\conveyor_controller.sysj line: 788, column: 5
                        S191340=1;
                        S138809=0;
                        active[92]=1;
                        ends[92]=1;
                        tdone[92]=1;
                      }
                      else {
                        active[92]=1;
                        ends[92]=1;
                        tdone[92]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S138748=1;
                S138748=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 788, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 788, column: 5
                  S138748=1;
                  active[92]=1;
                  ends[92]=1;
                  tdone[92]=1;
                }
                else {
                  S138743=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 788, column: 5
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 788, column: 5
                    S138743=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 788, column: 5
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 788, column: 5
                      ends[92]=2;
                      ;//sysj\conveyor_controller.sysj line: 788, column: 5
                      S191340=1;
                      S138809=0;
                      active[92]=1;
                      ends[92]=1;
                      tdone[92]=1;
                    }
                    else {
                      active[92]=1;
                      ends[92]=1;
                      tdone[92]=1;
                    }
                  }
                  else {
                    active[92]=1;
                    ends[92]=1;
                    tdone[92]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S138809){
              case 0 : 
                if(bottleAtPos3_91.getprestatus()){//sysj\conveyor_controller.sysj line: 790, column: 13
                  S138809=1;
                  S138771=0;
                  if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 791, column: 6
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 791, column: 6
                    S138771=1;
                    active[92]=1;
                    ends[92]=1;
                    tdone[92]=1;
                  }
                  else {
                    S138766=0;
                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 791, column: 6
                      lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 791, column: 6
                      S138766=1;
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 791, column: 6
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 791, column: 6
                        ends[92]=2;
                        ;//sysj\conveyor_controller.sysj line: 791, column: 6
                        S138809=2;
                        System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 793, column: 7
                        S138818=0;
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 795, column: 8
                        currsigs.addElement(armDest);
                        active[92]=1;
                        ends[92]=1;
                        tdone[92]=1;
                      }
                      else {
                        active[92]=1;
                        ends[92]=1;
                        tdone[92]=1;
                      }
                    }
                    else {
                      active[92]=1;
                      ends[92]=1;
                      tdone[92]=1;
                    }
                  }
                }
                else {
                  active[92]=1;
                  ends[92]=1;
                  tdone[92]=1;
                }
                break;
              
              case 1 : 
                switch(S138771){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 791, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 791, column: 6
                      S138771=1;
                      active[92]=1;
                      ends[92]=1;
                      tdone[92]=1;
                    }
                    else {
                      switch(S138766){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 791, column: 6
                            lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 791, column: 6
                            S138766=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 791, column: 6
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 791, column: 6
                              ends[92]=2;
                              ;//sysj\conveyor_controller.sysj line: 791, column: 6
                              S138809=2;
                              System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 793, column: 7
                              S138818=0;
                              armDest.setPresent();//sysj\conveyor_controller.sysj line: 795, column: 8
                              currsigs.addElement(armDest);
                              active[92]=1;
                              ends[92]=1;
                              tdone[92]=1;
                            }
                            else {
                              active[92]=1;
                              ends[92]=1;
                              tdone[92]=1;
                            }
                          }
                          else {
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 791, column: 6
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 791, column: 6
                            ends[92]=2;
                            ;//sysj\conveyor_controller.sysj line: 791, column: 6
                            S138809=2;
                            System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 793, column: 7
                            S138818=0;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 795, column: 8
                            currsigs.addElement(armDest);
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          else {
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S138771=1;
                    S138771=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 791, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 791, column: 6
                      S138771=1;
                      active[92]=1;
                      ends[92]=1;
                      tdone[92]=1;
                    }
                    else {
                      S138766=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 791, column: 6
                        lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 791, column: 6
                        S138766=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 791, column: 6
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 791, column: 6
                          ends[92]=2;
                          ;//sysj\conveyor_controller.sysj line: 791, column: 6
                          S138809=2;
                          System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 793, column: 7
                          S138818=0;
                          armDest.setPresent();//sysj\conveyor_controller.sysj line: 795, column: 8
                          currsigs.addElement(armDest);
                          active[92]=1;
                          ends[92]=1;
                          tdone[92]=1;
                        }
                        else {
                          active[92]=1;
                          ends[92]=1;
                          tdone[92]=1;
                        }
                      }
                      else {
                        active[92]=1;
                        ends[92]=1;
                        tdone[92]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                if(manualMode_91.getprestatus()){//sysj\conveyor_controller.sysj line: 792, column: 12
                  lidLoaderReady_o.setPreempted();
                  S138809=3;
                  active[92]=1;
                  ends[92]=1;
                  tdone[92]=1;
                }
                else {
                  switch(S138818){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 794, column: 13
                        System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 797, column: 7
                        S138818=1;
                        active[92]=1;
                        ends[92]=1;
                        tdone[92]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 795, column: 8
                        currsigs.addElement(armDest);
                        active[92]=1;
                        ends[92]=1;
                        tdone[92]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 798, column: 13
                        System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 799, column: 7
                        S138818=2;
                        S138824=0;
                        active[92]=1;
                        ends[92]=1;
                        tdone[92]=1;
                      }
                      else {
                        active[92]=1;
                        ends[92]=1;
                        tdone[92]=1;
                      }
                      break;
                    
                    case 2 : 
                      switch(S138824){
                        case 0 : 
                          if(!empty.getprestatus()){//sysj\conveyor_controller.sysj line: 802, column: 14
                            S138824=1;
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          else {
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(request.getprestatus()){//sysj\conveyor_controller.sysj line: 803, column: 14
                            System.out.println("New request");//sysj\conveyor_controller.sysj line: 804, column: 8
                            S138824=2;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 806, column: 9
                            currsigs.addElement(armDest);
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          else {
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          break;
                        
                        case 2 : 
                          if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 805, column: 14
                            System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 808, column: 8
                            S138824=3;
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 811, column: 9
                            currsigs.addElement(pusherExtend);
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          else {
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 806, column: 9
                            currsigs.addElement(armDest);
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          break;
                        
                        case 3 : 
                          if(pusherExtended.getprestatus()){//sysj\conveyor_controller.sysj line: 810, column: 14
                            System.out.println("Pusher extended");//sysj\conveyor_controller.sysj line: 813, column: 8
                            S138824=4;
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 811, column: 9
                            currsigs.addElement(pusherExtend);
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          break;
                        
                        case 4 : 
                          if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 814, column: 14
                            System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 815, column: 8
                            S138824=5;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 818, column: 9
                            currsigs.addElement(armSource);
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          else {
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          break;
                        
                        case 5 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 817, column: 14
                            System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 820, column: 8
                            S138824=6;
                            thread192354(tdone,ends);
                            thread192355(tdone,ends);
                            int biggest192356 = 0;
                            if(ends[93]>=biggest192356){
                              biggest192356=ends[93];
                            }
                            if(ends[94]>=biggest192356){
                              biggest192356=ends[94];
                            }
                            if(biggest192356 == 1){
                              active[92]=1;
                              ends[92]=1;
                              tdone[92]=1;
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 818, column: 9
                            currsigs.addElement(armSource);
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          break;
                        
                        case 6 : 
                          thread192357(tdone,ends);
                          thread192358(tdone,ends);
                          int biggest192359 = 0;
                          if(ends[93]>=biggest192359){
                            biggest192359=ends[93];
                          }
                          if(ends[94]>=biggest192359){
                            biggest192359=ends[94];
                          }
                          if(biggest192359 == 1){
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          if(biggest192359 == 2){
                            ends[92]=2;
                            ;//sysj\conveyor_controller.sysj line: 822, column: 8
                            S138824=7;
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          //FINXME code
                          if(biggest192359 == 0){
                            S138824=7;
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          break;
                        
                        case 7 : 
                          if(!WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 838, column: 14
                            S138824=8;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 841, column: 9
                            currsigs.addElement(armSource);
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          else {
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          break;
                        
                        case 8 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 840, column: 14
                            S138824=9;
                            S138902=0;
                            if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 845, column: 8
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 845, column: 8
                              S138902=1;
                              active[92]=1;
                              ends[92]=1;
                              tdone[92]=1;
                            }
                            else {
                              S138897=0;
                              if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 845, column: 8
                                lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 845, column: 8
                                S138897=1;
                                if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 845, column: 8
                                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 845, column: 8
                                  ends[92]=2;
                                  ;//sysj\conveyor_controller.sysj line: 845, column: 8
                                  System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 847, column: 8
                                  S138824=10;
                                  active[92]=1;
                                  ends[92]=1;
                                  tdone[92]=1;
                                }
                                else {
                                  active[92]=1;
                                  ends[92]=1;
                                  tdone[92]=1;
                                }
                              }
                              else {
                                active[92]=1;
                                ends[92]=1;
                                tdone[92]=1;
                              }
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 841, column: 9
                            currsigs.addElement(armSource);
                            active[92]=1;
                            ends[92]=1;
                            tdone[92]=1;
                          }
                          break;
                        
                        case 9 : 
                          switch(S138902){
                            case 0 : 
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 845, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 845, column: 8
                                S138902=1;
                                active[92]=1;
                                ends[92]=1;
                                tdone[92]=1;
                              }
                              else {
                                switch(S138897){
                                  case 0 : 
                                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 845, column: 8
                                      lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 845, column: 8
                                      S138897=1;
                                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 845, column: 8
                                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 845, column: 8
                                        ends[92]=2;
                                        ;//sysj\conveyor_controller.sysj line: 845, column: 8
                                        System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 847, column: 8
                                        S138824=10;
                                        active[92]=1;
                                        ends[92]=1;
                                        tdone[92]=1;
                                      }
                                      else {
                                        active[92]=1;
                                        ends[92]=1;
                                        tdone[92]=1;
                                      }
                                    }
                                    else {
                                      active[92]=1;
                                      ends[92]=1;
                                      tdone[92]=1;
                                    }
                                    break;
                                  
                                  case 1 : 
                                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 845, column: 8
                                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 845, column: 8
                                      ends[92]=2;
                                      ;//sysj\conveyor_controller.sysj line: 845, column: 8
                                      System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 847, column: 8
                                      S138824=10;
                                      active[92]=1;
                                      ends[92]=1;
                                      tdone[92]=1;
                                    }
                                    else {
                                      active[92]=1;
                                      ends[92]=1;
                                      tdone[92]=1;
                                    }
                                    break;
                                  
                                }
                              }
                              break;
                            
                            case 1 : 
                              S138902=1;
                              S138902=0;
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 845, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 845, column: 8
                                S138902=1;
                                active[92]=1;
                                ends[92]=1;
                                tdone[92]=1;
                              }
                              else {
                                S138897=0;
                                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 845, column: 8
                                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 845, column: 8
                                  S138897=1;
                                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 845, column: 8
                                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 845, column: 8
                                    ends[92]=2;
                                    ;//sysj\conveyor_controller.sysj line: 845, column: 8
                                    System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 847, column: 8
                                    S138824=10;
                                    active[92]=1;
                                    ends[92]=1;
                                    tdone[92]=1;
                                  }
                                  else {
                                    active[92]=1;
                                    ends[92]=1;
                                    tdone[92]=1;
                                  }
                                }
                                else {
                                  active[92]=1;
                                  ends[92]=1;
                                  tdone[92]=1;
                                }
                              }
                              break;
                            
                          }
                          break;
                        
                        case 10 : 
                          S138824=10;
                          S138824=0;
                          active[92]=1;
                          ends[92]=1;
                          tdone[92]=1;
                          break;
                        
                      }
                      break;
                    
                  }
                }
                break;
              
              case 3 : 
                S138809=3;
                System.out.println("entering manual");//sysj\conveyor_controller.sysj line: 855, column: 6
                S138809=4;
                thread192360(tdone,ends);
                thread192361(tdone,ends);
                thread192362(tdone,ends);
                thread192363(tdone,ends);
                int biggest192364 = 0;
                if(ends[95]>=biggest192364){
                  biggest192364=ends[95];
                }
                if(ends[96]>=biggest192364){
                  biggest192364=ends[96];
                }
                if(ends[97]>=biggest192364){
                  biggest192364=ends[97];
                }
                if(ends[98]>=biggest192364){
                  biggest192364=ends[98];
                }
                if(biggest192364 == 1){
                  active[92]=1;
                  ends[92]=1;
                  tdone[92]=1;
                }
                break;
              
              case 4 : 
                if(autoMode_91.getprestatus()){//sysj\conveyor_controller.sysj line: 856, column: 12
                  lidLoaderReady_o.setPreempted();
                  S138809=0;
                  active[92]=1;
                  ends[92]=1;
                  tdone[92]=1;
                }
                else {
                  thread192365(tdone,ends);
                  thread192366(tdone,ends);
                  thread192367(tdone,ends);
                  thread192368(tdone,ends);
                  int biggest192369 = 0;
                  if(ends[95]>=biggest192369){
                    biggest192369=ends[95];
                  }
                  if(ends[96]>=biggest192369){
                    biggest192369=ends[96];
                  }
                  if(ends[97]>=biggest192369){
                    biggest192369=ends[97];
                  }
                  if(ends[98]>=biggest192369){
                    biggest192369=ends[98];
                  }
                  if(biggest192369 == 1){
                    active[92]=1;
                    ends[92]=1;
                    tdone[92]=1;
                  }
                  //FINXME code
                  if(biggest192369 == 0){
                    S138809=0;
                    active[92]=1;
                    ends[92]=1;
                    tdone[92]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192350(int [] tdone, int [] ends){
        S191453=1;
    active[103]=1;
    ends[103]=1;
    tdone[103]=1;
  }

  public void thread192349(int [] tdone, int [] ends){
        S191450=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 902, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[102]=1;
    ends[102]=1;
    tdone[102]=1;
  }

  public void thread192348(int [] tdone, int [] ends){
        S191483=1;
    S191457=0;
    if(bottleAtPos3_91.getprestatus()){//sysj\conveyor_controller.sysj line: 899, column: 20
      thread192349(tdone,ends);
      thread192350(tdone,ends);
      int biggest192351 = 0;
      if(ends[102]>=biggest192351){
        biggest192351=ends[102];
      }
      if(ends[103]>=biggest192351){
        biggest192351=ends[103];
      }
      if(biggest192351 == 1){
        active[101]=1;
        ends[101]=1;
        tdone[101]=1;
      }
    }
    else {
      S191457=1;
      active[101]=1;
      ends[101]=1;
      tdone[101]=1;
    }
  }

  public void thread192347(int [] tdone, int [] ends){
        S191445=1;
    S191389=0;
    S191369=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 886, column: 6
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 886, column: 6
      S191369=1;
      active[100]=1;
      ends[100]=1;
      tdone[100]=1;
    }
    else {
      S191364=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 886, column: 6
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 886, column: 6
        S191364=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 886, column: 6
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 886, column: 6
          ends[100]=2;
          ;//sysj\conveyor_controller.sysj line: 886, column: 6
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 887, column: 9
            bottleAtPos3_91.setPresent();//sysj\conveyor_controller.sysj line: 888, column: 7
            currsigs.addElement(bottleAtPos3_91);
            S191389=1;
            active[100]=1;
            ends[100]=1;
            tdone[100]=1;
          }
          else {
            done_91.setPresent();//sysj\conveyor_controller.sysj line: 890, column: 7
            currsigs.addElement(done_91);
            S191389=1;
            active[100]=1;
            ends[100]=1;
            tdone[100]=1;
          }
        }
        else {
          active[100]=1;
          ends[100]=1;
          tdone[100]=1;
        }
      }
      else {
        active[100]=1;
        ends[100]=1;
        tdone[100]=1;
      }
    }
  }

  public void thread192346(int [] tdone, int [] ends){
        S191362=1;
    S191361=0;
    active[99]=1;
    ends[99]=1;
    tdone[99]=1;
  }

  public void thread192345(int [] tdone, int [] ends){
        S191341=1;
    S191340=0;
    S138748=0;
    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 788, column: 5
      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 788, column: 5
      S138748=1;
      active[92]=1;
      ends[92]=1;
      tdone[92]=1;
    }
    else {
      S138743=0;
      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 788, column: 5
        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 788, column: 5
        S138743=1;
        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 788, column: 5
          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 788, column: 5
          ends[92]=2;
          ;//sysj\conveyor_controller.sysj line: 788, column: 5
          S191340=1;
          S138809=0;
          active[92]=1;
          ends[92]=1;
          tdone[92]=1;
        }
        else {
          active[92]=1;
          ends[92]=1;
          tdone[92]=1;
        }
      }
      else {
        active[92]=1;
        ends[92]=1;
        tdone[92]=1;
      }
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S191485){
        case 0 : 
          S191485=0;
          break RUN;
        
        case 1 : 
          S191485=2;
          S191485=2;
          manualMode_91.setClear();//sysj\conveyor_controller.sysj line: 786, column: 4
          autoMode_91.setClear();//sysj\conveyor_controller.sysj line: 786, column: 4
          bottleAtPos3_91.setClear();//sysj\conveyor_controller.sysj line: 786, column: 4
          done_91.setClear();//sysj\conveyor_controller.sysj line: 786, column: 4
          thread192345(tdone,ends);
          thread192346(tdone,ends);
          thread192347(tdone,ends);
          thread192348(tdone,ends);
          int biggest192352 = 0;
          if(ends[92]>=biggest192352){
            biggest192352=ends[92];
          }
          if(ends[99]>=biggest192352){
            biggest192352=ends[99];
          }
          if(ends[100]>=biggest192352){
            biggest192352=ends[100];
          }
          if(ends[101]>=biggest192352){
            biggest192352=ends[101];
          }
          if(biggest192352 == 1){
            active[91]=1;
            ends[91]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_91.setClear();//sysj\conveyor_controller.sysj line: 786, column: 4
          autoMode_91.setClear();//sysj\conveyor_controller.sysj line: 786, column: 4
          bottleAtPos3_91.setClear();//sysj\conveyor_controller.sysj line: 786, column: 4
          done_91.setClear();//sysj\conveyor_controller.sysj line: 786, column: 4
          thread192353(tdone,ends);
          thread192370(tdone,ends);
          thread192371(tdone,ends);
          thread192372(tdone,ends);
          int biggest192379 = 0;
          if(ends[92]>=biggest192379){
            biggest192379=ends[92];
          }
          if(ends[99]>=biggest192379){
            biggest192379=ends[99];
          }
          if(ends[100]>=biggest192379){
            biggest192379=ends[100];
          }
          if(ends[101]>=biggest192379){
            biggest192379=ends[101];
          }
          if(biggest192379 == 1){
            active[91]=1;
            ends[91]=1;
            break RUN;
          }
          //FINXME code
          if(biggest192379 == 0){
            S191485=0;
            active[91]=0;
            ends[91]=0;
            S191485=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    manualMode_91 = new Signal();
    autoMode_91 = new Signal();
    bottleAtPos3_91 = new Signal();
    done_91 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[91] != 0){
      int index = 91;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[91]!=0 || suspended[91]!=0 || active[91]!=1);
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
      manualMode_91.setpreclear();
      autoMode_91.setpreclear();
      bottleAtPos3_91.setpreclear();
      done_91.setpreclear();
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
      manualMode_91.setClear();
      autoMode_91.setClear();
      bottleAtPos3_91.setClear();
      done_91.setClear();
      checkThree_in.sethook();
      lidLoaderReady_o.sethook();
      if(paused[91]!=0 || suspended[91]!=0 || active[91]!=1);
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
      if(active[91] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
