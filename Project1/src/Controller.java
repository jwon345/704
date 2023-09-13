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
  private Signal manualMode_96;
  private Signal autoMode_96;
  private Signal bottleAtPos3_96;
  private Signal done_96;
  private int S200966 = 1;
  private int S200822 = 1;
  private int S200821 = 1;
  private int S148229 = 1;
  private int S148224 = 1;
  private int S148290 = 1;
  private int S148252 = 1;
  private int S148247 = 1;
  private int S148299 = 1;
  private int S148305 = 1;
  private int S148336 = 1;
  private int S148347 = 1;
  private int S148338 = 1;
  private int S148383 = 1;
  private int S148378 = 1;
  private int S151202 = 1;
  private int S151210 = 1;
  private int S151353 = 1;
  private int S151257 = 1;
  private int S151217 = 1;
  private int S151212 = 1;
  private int S151361 = 1;
  private int S200843 = 1;
  private int S200842 = 1;
  private int S200926 = 1;
  private int S200870 = 1;
  private int S200850 = 1;
  private int S200845 = 1;
  private int S200964 = 1;
  private int S200938 = 1;
  private int S200931 = 1;
  private int S200934 = 1;
  
  private int[] ends = new int[109];
  private int[] tdone = new int[109];
  
  public void thread202060(int [] tdone, int [] ends){
        S200934=1;
    active[108]=1;
    ends[108]=1;
    tdone[108]=1;
  }

  public void thread202059(int [] tdone, int [] ends){
        S200931=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 910, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[107]=1;
    ends[107]=1;
    tdone[107]=1;
  }

  public void thread202057(int [] tdone, int [] ends){
        switch(S200934){
      case 0 : 
        active[108]=0;
        ends[108]=0;
        tdone[108]=1;
        break;
      
      case 1 : 
        if(done_96.getprestatus()){//sysj\conveyor_controller.sysj line: 914, column: 28
          ends[108]=2;
          tdone[108]=1;
        }
        else {
          active[108]=1;
          ends[108]=1;
          tdone[108]=1;
        }
        break;
      
    }
  }

  public void thread202056(int [] tdone, int [] ends){
        switch(S200931){
      case 0 : 
        active[107]=0;
        ends[107]=0;
        tdone[107]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 910, column: 22
        currsigs.addElement(bottleAtPos3E);
        active[107]=1;
        ends[107]=1;
        tdone[107]=1;
        break;
      
    }
  }

  public void thread202055(int [] tdone, int [] ends){
        switch(S200964){
      case 0 : 
        active[106]=0;
        ends[106]=0;
        tdone[106]=1;
        break;
      
      case 1 : 
        switch(S200938){
          case 0 : 
            thread202056(tdone,ends);
            thread202057(tdone,ends);
            int biggest202058 = 0;
            if(ends[107]>=biggest202058){
              biggest202058=ends[107];
            }
            if(ends[108]>=biggest202058){
              biggest202058=ends[108];
            }
            if(biggest202058 == 1){
              active[106]=1;
              ends[106]=1;
              tdone[106]=1;
            }
            if(biggest202058 == 2){
              ends[106]=2;
              ;//sysj\conveyor_controller.sysj line: 908, column: 7
              S200938=1;
              active[106]=1;
              ends[106]=1;
              tdone[106]=1;
            }
            //FINXME code
            if(biggest202058 == 0){
              ;//sysj\conveyor_controller.sysj line: 916, column: 19
              S200938=1;
              active[106]=1;
              ends[106]=1;
              tdone[106]=1;
            }
            break;
          
          case 1 : 
            S200938=1;
            S200938=0;
            if(bottleAtPos3_96.getprestatus()){//sysj\conveyor_controller.sysj line: 907, column: 20
              thread202059(tdone,ends);
              thread202060(tdone,ends);
              int biggest202061 = 0;
              if(ends[107]>=biggest202061){
                biggest202061=ends[107];
              }
              if(ends[108]>=biggest202061){
                biggest202061=ends[108];
              }
              if(biggest202061 == 1){
                active[106]=1;
                ends[106]=1;
                tdone[106]=1;
              }
            }
            else {
              S200938=1;
              active[106]=1;
              ends[106]=1;
              tdone[106]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202054(int [] tdone, int [] ends){
        switch(S200926){
      case 0 : 
        active[105]=0;
        ends[105]=0;
        tdone[105]=1;
        break;
      
      case 1 : 
        switch(S200870){
          case 0 : 
            switch(S200850){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 894, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 894, column: 6
                  S200850=1;
                  active[105]=1;
                  ends[105]=1;
                  tdone[105]=1;
                }
                else {
                  switch(S200845){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 894, column: 6
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 894, column: 6
                        S200845=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 894, column: 6
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 894, column: 6
                          ends[105]=2;
                          ;//sysj\conveyor_controller.sysj line: 894, column: 6
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 895, column: 9
                            bottleAtPos3_96.setPresent();//sysj\conveyor_controller.sysj line: 896, column: 7
                            currsigs.addElement(bottleAtPos3_96);
                            S200870=1;
                            active[105]=1;
                            ends[105]=1;
                            tdone[105]=1;
                          }
                          else {
                            done_96.setPresent();//sysj\conveyor_controller.sysj line: 898, column: 7
                            currsigs.addElement(done_96);
                            S200870=1;
                            active[105]=1;
                            ends[105]=1;
                            tdone[105]=1;
                          }
                        }
                        else {
                          active[105]=1;
                          ends[105]=1;
                          tdone[105]=1;
                        }
                      }
                      else {
                        active[105]=1;
                        ends[105]=1;
                        tdone[105]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 894, column: 6
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 894, column: 6
                        ends[105]=2;
                        ;//sysj\conveyor_controller.sysj line: 894, column: 6
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 895, column: 9
                          bottleAtPos3_96.setPresent();//sysj\conveyor_controller.sysj line: 896, column: 7
                          currsigs.addElement(bottleAtPos3_96);
                          S200870=1;
                          active[105]=1;
                          ends[105]=1;
                          tdone[105]=1;
                        }
                        else {
                          done_96.setPresent();//sysj\conveyor_controller.sysj line: 898, column: 7
                          currsigs.addElement(done_96);
                          S200870=1;
                          active[105]=1;
                          ends[105]=1;
                          tdone[105]=1;
                        }
                      }
                      else {
                        active[105]=1;
                        ends[105]=1;
                        tdone[105]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S200850=1;
                S200850=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 894, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 894, column: 6
                  S200850=1;
                  active[105]=1;
                  ends[105]=1;
                  tdone[105]=1;
                }
                else {
                  S200845=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 894, column: 6
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 894, column: 6
                    S200845=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 894, column: 6
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 894, column: 6
                      ends[105]=2;
                      ;//sysj\conveyor_controller.sysj line: 894, column: 6
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 895, column: 9
                        bottleAtPos3_96.setPresent();//sysj\conveyor_controller.sysj line: 896, column: 7
                        currsigs.addElement(bottleAtPos3_96);
                        S200870=1;
                        active[105]=1;
                        ends[105]=1;
                        tdone[105]=1;
                      }
                      else {
                        done_96.setPresent();//sysj\conveyor_controller.sysj line: 898, column: 7
                        currsigs.addElement(done_96);
                        S200870=1;
                        active[105]=1;
                        ends[105]=1;
                        tdone[105]=1;
                      }
                    }
                    else {
                      active[105]=1;
                      ends[105]=1;
                      tdone[105]=1;
                    }
                  }
                  else {
                    active[105]=1;
                    ends[105]=1;
                    tdone[105]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S200870=1;
            S200870=0;
            S200850=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 894, column: 6
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 894, column: 6
              S200850=1;
              active[105]=1;
              ends[105]=1;
              tdone[105]=1;
            }
            else {
              S200845=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 894, column: 6
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 894, column: 6
                S200845=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 894, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 894, column: 6
                  ends[105]=2;
                  ;//sysj\conveyor_controller.sysj line: 894, column: 6
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 895, column: 9
                    bottleAtPos3_96.setPresent();//sysj\conveyor_controller.sysj line: 896, column: 7
                    currsigs.addElement(bottleAtPos3_96);
                    S200870=1;
                    active[105]=1;
                    ends[105]=1;
                    tdone[105]=1;
                  }
                  else {
                    done_96.setPresent();//sysj\conveyor_controller.sysj line: 898, column: 7
                    currsigs.addElement(done_96);
                    S200870=1;
                    active[105]=1;
                    ends[105]=1;
                    tdone[105]=1;
                  }
                }
                else {
                  active[105]=1;
                  ends[105]=1;
                  tdone[105]=1;
                }
              }
              else {
                active[105]=1;
                ends[105]=1;
                tdone[105]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202053(int [] tdone, int [] ends){
        switch(S200843){
      case 0 : 
        active[104]=0;
        ends[104]=0;
        tdone[104]=1;
        break;
      
      case 1 : 
        switch(S200842){
          case 0 : 
            if(mode.getprestatus()){//sysj\conveyor_controller.sysj line: 878, column: 11
              S200842=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 880, column: 9
                autoMode_96.setPresent();//sysj\conveyor_controller.sysj line: 881, column: 7
                currsigs.addElement(autoMode_96);
                active[104]=1;
                ends[104]=1;
                tdone[104]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 883, column: 14
                  manualMode_96.setPresent();//sysj\conveyor_controller.sysj line: 884, column: 7
                  currsigs.addElement(manualMode_96);
                  active[104]=1;
                  ends[104]=1;
                  tdone[104]=1;
                }
                else {
                  active[104]=1;
                  ends[104]=1;
                  tdone[104]=1;
                }
              }
            }
            else {
              active[104]=1;
              ends[104]=1;
              tdone[104]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 880, column: 9
              autoMode_96.setPresent();//sysj\conveyor_controller.sysj line: 881, column: 7
              currsigs.addElement(autoMode_96);
              active[104]=1;
              ends[104]=1;
              tdone[104]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 883, column: 14
                manualMode_96.setPresent();//sysj\conveyor_controller.sysj line: 884, column: 7
                currsigs.addElement(manualMode_96);
                active[104]=1;
                ends[104]=1;
                tdone[104]=1;
              }
              else {
                active[104]=1;
                ends[104]=1;
                tdone[104]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202051(int [] tdone, int [] ends){
        switch(S151361){
      case 0 : 
        active[103]=0;
        ends[103]=0;
        tdone[103]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 871, column: 21
          armDest.setPresent();//sysj\conveyor_controller.sysj line: 871, column: 31
          currsigs.addElement(armDest);
          active[103]=1;
          ends[103]=1;
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

  public void thread202050(int [] tdone, int [] ends){
        switch(S151353){
      case 0 : 
        active[102]=0;
        ends[102]=0;
        tdone[102]=1;
        break;
      
      case 1 : 
        switch(S151257){
          case 0 : 
            switch(S151217){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 869, column: 48
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 869, column: 48
                  S151217=1;
                  active[102]=1;
                  ends[102]=1;
                  tdone[102]=1;
                }
                else {
                  switch(S151212){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 869, column: 48
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 869, column: 48
                        S151212=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 869, column: 48
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 869, column: 48
                          ends[102]=2;
                          ;//sysj\conveyor_controller.sysj line: 869, column: 48
                          S151257=1;
                          active[102]=1;
                          ends[102]=1;
                          tdone[102]=1;
                        }
                        else {
                          active[102]=1;
                          ends[102]=1;
                          tdone[102]=1;
                        }
                      }
                      else {
                        active[102]=1;
                        ends[102]=1;
                        tdone[102]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 869, column: 48
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 869, column: 48
                        ends[102]=2;
                        ;//sysj\conveyor_controller.sysj line: 869, column: 48
                        S151257=1;
                        active[102]=1;
                        ends[102]=1;
                        tdone[102]=1;
                      }
                      else {
                        active[102]=1;
                        ends[102]=1;
                        tdone[102]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S151217=1;
                S151217=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 869, column: 48
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 869, column: 48
                  S151217=1;
                  active[102]=1;
                  ends[102]=1;
                  tdone[102]=1;
                }
                else {
                  S151212=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 869, column: 48
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 869, column: 48
                    S151212=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 869, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 869, column: 48
                      ends[102]=2;
                      ;//sysj\conveyor_controller.sysj line: 869, column: 48
                      S151257=1;
                      active[102]=1;
                      ends[102]=1;
                      tdone[102]=1;
                    }
                    else {
                      active[102]=1;
                      ends[102]=1;
                      tdone[102]=1;
                    }
                  }
                  else {
                    active[102]=1;
                    ends[102]=1;
                    tdone[102]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S151257=1;
            S151257=0;
            if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 869, column: 21
              armSource.setPresent();//sysj\conveyor_controller.sysj line: 869, column: 33
              currsigs.addElement(armSource);
              S151217=0;
              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 869, column: 48
                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 869, column: 48
                S151217=1;
                active[102]=1;
                ends[102]=1;
                tdone[102]=1;
              }
              else {
                S151212=0;
                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 869, column: 48
                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 869, column: 48
                  S151212=1;
                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 869, column: 48
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 869, column: 48
                    ends[102]=2;
                    ;//sysj\conveyor_controller.sysj line: 869, column: 48
                    S151257=1;
                    active[102]=1;
                    ends[102]=1;
                    tdone[102]=1;
                  }
                  else {
                    active[102]=1;
                    ends[102]=1;
                    tdone[102]=1;
                  }
                }
                else {
                  active[102]=1;
                  ends[102]=1;
                  tdone[102]=1;
                }
              }
            }
            else {
              S151257=1;
              active[102]=1;
              ends[102]=1;
              tdone[102]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202049(int [] tdone, int [] ends){
        switch(S151210){
      case 0 : 
        active[101]=0;
        ends[101]=0;
        tdone[101]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 867, column: 21
          vacOn.setPresent();//sysj\conveyor_controller.sysj line: 867, column: 29
          currsigs.addElement(vacOn);
          active[101]=1;
          ends[101]=1;
          tdone[101]=1;
        }
        else {
          active[101]=1;
          ends[101]=1;
          tdone[101]=1;
        }
        break;
      
    }
  }

  public void thread202048(int [] tdone, int [] ends){
        switch(S151202){
      case 0 : 
        active[100]=0;
        ends[100]=0;
        tdone[100]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 865, column: 21
          pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 865, column: 36
          currsigs.addElement(pusherExtend);
          active[100]=1;
          ends[100]=1;
          tdone[100]=1;
        }
        else {
          active[100]=1;
          ends[100]=1;
          tdone[100]=1;
        }
        break;
      
    }
  }

  public void thread202046(int [] tdone, int [] ends){
        S151361=1;
    if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 871, column: 21
      armDest.setPresent();//sysj\conveyor_controller.sysj line: 871, column: 31
      currsigs.addElement(armDest);
      active[103]=1;
      ends[103]=1;
      tdone[103]=1;
    }
    else {
      active[103]=1;
      ends[103]=1;
      tdone[103]=1;
    }
  }

  public void thread202045(int [] tdone, int [] ends){
        S151353=1;
    S151257=0;
    if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 869, column: 21
      armSource.setPresent();//sysj\conveyor_controller.sysj line: 869, column: 33
      currsigs.addElement(armSource);
      S151217=0;
      if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 869, column: 48
        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 869, column: 48
        S151217=1;
        active[102]=1;
        ends[102]=1;
        tdone[102]=1;
      }
      else {
        S151212=0;
        if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 869, column: 48
          lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 869, column: 48
          S151212=1;
          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 869, column: 48
            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 869, column: 48
            ends[102]=2;
            ;//sysj\conveyor_controller.sysj line: 869, column: 48
            S151257=1;
            active[102]=1;
            ends[102]=1;
            tdone[102]=1;
          }
          else {
            active[102]=1;
            ends[102]=1;
            tdone[102]=1;
          }
        }
        else {
          active[102]=1;
          ends[102]=1;
          tdone[102]=1;
        }
      }
    }
    else {
      S151257=1;
      active[102]=1;
      ends[102]=1;
      tdone[102]=1;
    }
  }

  public void thread202044(int [] tdone, int [] ends){
        S151210=1;
    if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 867, column: 21
      vacOn.setPresent();//sysj\conveyor_controller.sysj line: 867, column: 29
      currsigs.addElement(vacOn);
      active[101]=1;
      ends[101]=1;
      tdone[101]=1;
    }
    else {
      active[101]=1;
      ends[101]=1;
      tdone[101]=1;
    }
  }

  public void thread202043(int [] tdone, int [] ends){
        S151202=1;
    if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 865, column: 21
      pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 865, column: 36
      currsigs.addElement(pusherExtend);
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

  public void thread202041(int [] tdone, int [] ends){
        switch(S148347){
      case 0 : 
        active[99]=0;
        ends[99]=0;
        tdone[99]=1;
        break;
      
      case 1 : 
        switch(S148338){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 836, column: 16
              System.out.println("WP gripped");//sysj\conveyor_controller.sysj line: 837, column: 10
              S148338=1;
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 839, column: 11
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
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 838, column: 16
              System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 841, column: 10
              ends[99]=2;
              tdone[99]=1;
            }
            else {
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 839, column: 11
              currsigs.addElement(armDest);
              active[99]=1;
              ends[99]=1;
              tdone[99]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202040(int [] tdone, int [] ends){
        switch(S148336){
      case 0 : 
        active[98]=0;
        ends[98]=0;
        tdone[98]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\conveyor_controller.sysj line: 832, column: 10
        currsigs.addElement(vacOn);
        active[98]=1;
        ends[98]=1;
        tdone[98]=1;
        break;
      
    }
  }

  public void thread202038(int [] tdone, int [] ends){
        S148347=1;
    S148338=0;
    active[99]=1;
    ends[99]=1;
    tdone[99]=1;
  }

  public void thread202037(int [] tdone, int [] ends){
        S148336=1;
    vacOn.setPresent();//sysj\conveyor_controller.sysj line: 832, column: 10
    currsigs.addElement(vacOn);
    active[98]=1;
    ends[98]=1;
    tdone[98]=1;
  }

  public void thread202036(int [] tdone, int [] ends){
        switch(S200822){
      case 0 : 
        active[97]=0;
        ends[97]=0;
        tdone[97]=1;
        break;
      
      case 1 : 
        switch(S200821){
          case 0 : 
            switch(S148229){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 796, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 796, column: 5
                  S148229=1;
                  active[97]=1;
                  ends[97]=1;
                  tdone[97]=1;
                }
                else {
                  switch(S148224){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 796, column: 5
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 796, column: 5
                        S148224=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 796, column: 5
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 796, column: 5
                          ends[97]=2;
                          ;//sysj\conveyor_controller.sysj line: 796, column: 5
                          S200821=1;
                          S148290=0;
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
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 796, column: 5
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 796, column: 5
                        ends[97]=2;
                        ;//sysj\conveyor_controller.sysj line: 796, column: 5
                        S200821=1;
                        S148290=0;
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
                S148229=1;
                S148229=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 796, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 796, column: 5
                  S148229=1;
                  active[97]=1;
                  ends[97]=1;
                  tdone[97]=1;
                }
                else {
                  S148224=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 796, column: 5
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 796, column: 5
                    S148224=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 796, column: 5
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 796, column: 5
                      ends[97]=2;
                      ;//sysj\conveyor_controller.sysj line: 796, column: 5
                      S200821=1;
                      S148290=0;
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
            switch(S148290){
              case 0 : 
                if(bottleAtPos3_96.getprestatus()){//sysj\conveyor_controller.sysj line: 798, column: 13
                  S148290=1;
                  S148252=0;
                  if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 799, column: 6
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 799, column: 6
                    S148252=1;
                    active[97]=1;
                    ends[97]=1;
                    tdone[97]=1;
                  }
                  else {
                    S148247=0;
                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 799, column: 6
                      lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 799, column: 6
                      S148247=1;
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 799, column: 6
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 799, column: 6
                        ends[97]=2;
                        ;//sysj\conveyor_controller.sysj line: 799, column: 6
                        S148290=2;
                        System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 801, column: 7
                        S148299=0;
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 803, column: 8
                        currsigs.addElement(armDest);
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
                  active[97]=1;
                  ends[97]=1;
                  tdone[97]=1;
                }
                break;
              
              case 1 : 
                switch(S148252){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 799, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 799, column: 6
                      S148252=1;
                      active[97]=1;
                      ends[97]=1;
                      tdone[97]=1;
                    }
                    else {
                      switch(S148247){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 799, column: 6
                            lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 799, column: 6
                            S148247=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 799, column: 6
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 799, column: 6
                              ends[97]=2;
                              ;//sysj\conveyor_controller.sysj line: 799, column: 6
                              S148290=2;
                              System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 801, column: 7
                              S148299=0;
                              armDest.setPresent();//sysj\conveyor_controller.sysj line: 803, column: 8
                              currsigs.addElement(armDest);
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
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 799, column: 6
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 799, column: 6
                            ends[97]=2;
                            ;//sysj\conveyor_controller.sysj line: 799, column: 6
                            S148290=2;
                            System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 801, column: 7
                            S148299=0;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 803, column: 8
                            currsigs.addElement(armDest);
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
                    S148252=1;
                    S148252=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 799, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 799, column: 6
                      S148252=1;
                      active[97]=1;
                      ends[97]=1;
                      tdone[97]=1;
                    }
                    else {
                      S148247=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 799, column: 6
                        lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 799, column: 6
                        S148247=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 799, column: 6
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 799, column: 6
                          ends[97]=2;
                          ;//sysj\conveyor_controller.sysj line: 799, column: 6
                          S148290=2;
                          System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 801, column: 7
                          S148299=0;
                          armDest.setPresent();//sysj\conveyor_controller.sysj line: 803, column: 8
                          currsigs.addElement(armDest);
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
              
              case 2 : 
                if(manualMode_96.getprestatus()){//sysj\conveyor_controller.sysj line: 800, column: 12
                  lidLoaderReady_o.setPreempted();
                  S148290=3;
                  active[97]=1;
                  ends[97]=1;
                  tdone[97]=1;
                }
                else {
                  switch(S148299){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 802, column: 13
                        System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 805, column: 7
                        S148299=1;
                        active[97]=1;
                        ends[97]=1;
                        tdone[97]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 803, column: 8
                        currsigs.addElement(armDest);
                        active[97]=1;
                        ends[97]=1;
                        tdone[97]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 806, column: 13
                        System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 807, column: 7
                        S148299=2;
                        S148305=0;
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
                    
                    case 2 : 
                      switch(S148305){
                        case 0 : 
                          if(!empty.getprestatus()){//sysj\conveyor_controller.sysj line: 810, column: 14
                            S148305=1;
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
                        
                        case 1 : 
                          if(request.getprestatus()){//sysj\conveyor_controller.sysj line: 811, column: 14
                            System.out.println("New request");//sysj\conveyor_controller.sysj line: 812, column: 8
                            S148305=2;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 814, column: 9
                            currsigs.addElement(armDest);
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
                        
                        case 2 : 
                          if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 813, column: 14
                            System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 816, column: 8
                            S148305=3;
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 819, column: 9
                            currsigs.addElement(pusherExtend);
                            active[97]=1;
                            ends[97]=1;
                            tdone[97]=1;
                          }
                          else {
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 814, column: 9
                            currsigs.addElement(armDest);
                            active[97]=1;
                            ends[97]=1;
                            tdone[97]=1;
                          }
                          break;
                        
                        case 3 : 
                          if(pusherExtended.getprestatus()){//sysj\conveyor_controller.sysj line: 818, column: 14
                            System.out.println("Pusher extended");//sysj\conveyor_controller.sysj line: 821, column: 8
                            S148305=4;
                            active[97]=1;
                            ends[97]=1;
                            tdone[97]=1;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 819, column: 9
                            currsigs.addElement(pusherExtend);
                            active[97]=1;
                            ends[97]=1;
                            tdone[97]=1;
                          }
                          break;
                        
                        case 4 : 
                          if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 822, column: 14
                            System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 823, column: 8
                            S148305=5;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 826, column: 9
                            currsigs.addElement(armSource);
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
                        
                        case 5 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 825, column: 14
                            System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 828, column: 8
                            S148305=6;
                            thread202037(tdone,ends);
                            thread202038(tdone,ends);
                            int biggest202039 = 0;
                            if(ends[98]>=biggest202039){
                              biggest202039=ends[98];
                            }
                            if(ends[99]>=biggest202039){
                              biggest202039=ends[99];
                            }
                            if(biggest202039 == 1){
                              active[97]=1;
                              ends[97]=1;
                              tdone[97]=1;
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 826, column: 9
                            currsigs.addElement(armSource);
                            active[97]=1;
                            ends[97]=1;
                            tdone[97]=1;
                          }
                          break;
                        
                        case 6 : 
                          thread202040(tdone,ends);
                          thread202041(tdone,ends);
                          int biggest202042 = 0;
                          if(ends[98]>=biggest202042){
                            biggest202042=ends[98];
                          }
                          if(ends[99]>=biggest202042){
                            biggest202042=ends[99];
                          }
                          if(biggest202042 == 1){
                            active[97]=1;
                            ends[97]=1;
                            tdone[97]=1;
                          }
                          if(biggest202042 == 2){
                            ends[97]=2;
                            ;//sysj\conveyor_controller.sysj line: 830, column: 8
                            S148305=7;
                            active[97]=1;
                            ends[97]=1;
                            tdone[97]=1;
                          }
                          //FINXME code
                          if(biggest202042 == 0){
                            S148305=7;
                            active[97]=1;
                            ends[97]=1;
                            tdone[97]=1;
                          }
                          break;
                        
                        case 7 : 
                          if(!WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 846, column: 14
                            S148305=8;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 849, column: 9
                            currsigs.addElement(armSource);
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
                        
                        case 8 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 848, column: 14
                            S148305=9;
                            S148383=0;
                            if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 853, column: 8
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 853, column: 8
                              S148383=1;
                              active[97]=1;
                              ends[97]=1;
                              tdone[97]=1;
                            }
                            else {
                              S148378=0;
                              if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 853, column: 8
                                lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 853, column: 8
                                S148378=1;
                                if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 853, column: 8
                                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 853, column: 8
                                  ends[97]=2;
                                  ;//sysj\conveyor_controller.sysj line: 853, column: 8
                                  System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 855, column: 8
                                  S148305=10;
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
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 849, column: 9
                            currsigs.addElement(armSource);
                            active[97]=1;
                            ends[97]=1;
                            tdone[97]=1;
                          }
                          break;
                        
                        case 9 : 
                          switch(S148383){
                            case 0 : 
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 853, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 853, column: 8
                                S148383=1;
                                active[97]=1;
                                ends[97]=1;
                                tdone[97]=1;
                              }
                              else {
                                switch(S148378){
                                  case 0 : 
                                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 853, column: 8
                                      lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 853, column: 8
                                      S148378=1;
                                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 853, column: 8
                                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 853, column: 8
                                        ends[97]=2;
                                        ;//sysj\conveyor_controller.sysj line: 853, column: 8
                                        System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 855, column: 8
                                        S148305=10;
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
                                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 853, column: 8
                                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 853, column: 8
                                      ends[97]=2;
                                      ;//sysj\conveyor_controller.sysj line: 853, column: 8
                                      System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 855, column: 8
                                      S148305=10;
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
                              S148383=1;
                              S148383=0;
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 853, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 853, column: 8
                                S148383=1;
                                active[97]=1;
                                ends[97]=1;
                                tdone[97]=1;
                              }
                              else {
                                S148378=0;
                                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 853, column: 8
                                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 853, column: 8
                                  S148378=1;
                                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 853, column: 8
                                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 853, column: 8
                                    ends[97]=2;
                                    ;//sysj\conveyor_controller.sysj line: 853, column: 8
                                    System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 855, column: 8
                                    S148305=10;
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
                        
                        case 10 : 
                          S148305=10;
                          S148305=0;
                          active[97]=1;
                          ends[97]=1;
                          tdone[97]=1;
                          break;
                        
                      }
                      break;
                    
                  }
                }
                break;
              
              case 3 : 
                S148290=3;
                System.out.println("entering manual");//sysj\conveyor_controller.sysj line: 863, column: 6
                S148290=4;
                thread202043(tdone,ends);
                thread202044(tdone,ends);
                thread202045(tdone,ends);
                thread202046(tdone,ends);
                int biggest202047 = 0;
                if(ends[100]>=biggest202047){
                  biggest202047=ends[100];
                }
                if(ends[101]>=biggest202047){
                  biggest202047=ends[101];
                }
                if(ends[102]>=biggest202047){
                  biggest202047=ends[102];
                }
                if(ends[103]>=biggest202047){
                  biggest202047=ends[103];
                }
                if(biggest202047 == 1){
                  active[97]=1;
                  ends[97]=1;
                  tdone[97]=1;
                }
                break;
              
              case 4 : 
                if(autoMode_96.getprestatus()){//sysj\conveyor_controller.sysj line: 864, column: 12
                  lidLoaderReady_o.setPreempted();
                  S148290=0;
                  active[97]=1;
                  ends[97]=1;
                  tdone[97]=1;
                }
                else {
                  thread202048(tdone,ends);
                  thread202049(tdone,ends);
                  thread202050(tdone,ends);
                  thread202051(tdone,ends);
                  int biggest202052 = 0;
                  if(ends[100]>=biggest202052){
                    biggest202052=ends[100];
                  }
                  if(ends[101]>=biggest202052){
                    biggest202052=ends[101];
                  }
                  if(ends[102]>=biggest202052){
                    biggest202052=ends[102];
                  }
                  if(ends[103]>=biggest202052){
                    biggest202052=ends[103];
                  }
                  if(biggest202052 == 1){
                    active[97]=1;
                    ends[97]=1;
                    tdone[97]=1;
                  }
                  //FINXME code
                  if(biggest202052 == 0){
                    S148290=0;
                    active[97]=1;
                    ends[97]=1;
                    tdone[97]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202033(int [] tdone, int [] ends){
        S200934=1;
    active[108]=1;
    ends[108]=1;
    tdone[108]=1;
  }

  public void thread202032(int [] tdone, int [] ends){
        S200931=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 910, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[107]=1;
    ends[107]=1;
    tdone[107]=1;
  }

  public void thread202031(int [] tdone, int [] ends){
        S200964=1;
    S200938=0;
    if(bottleAtPos3_96.getprestatus()){//sysj\conveyor_controller.sysj line: 907, column: 20
      thread202032(tdone,ends);
      thread202033(tdone,ends);
      int biggest202034 = 0;
      if(ends[107]>=biggest202034){
        biggest202034=ends[107];
      }
      if(ends[108]>=biggest202034){
        biggest202034=ends[108];
      }
      if(biggest202034 == 1){
        active[106]=1;
        ends[106]=1;
        tdone[106]=1;
      }
    }
    else {
      S200938=1;
      active[106]=1;
      ends[106]=1;
      tdone[106]=1;
    }
  }

  public void thread202030(int [] tdone, int [] ends){
        S200926=1;
    S200870=0;
    S200850=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 894, column: 6
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 894, column: 6
      S200850=1;
      active[105]=1;
      ends[105]=1;
      tdone[105]=1;
    }
    else {
      S200845=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 894, column: 6
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 894, column: 6
        S200845=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 894, column: 6
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 894, column: 6
          ends[105]=2;
          ;//sysj\conveyor_controller.sysj line: 894, column: 6
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 895, column: 9
            bottleAtPos3_96.setPresent();//sysj\conveyor_controller.sysj line: 896, column: 7
            currsigs.addElement(bottleAtPos3_96);
            S200870=1;
            active[105]=1;
            ends[105]=1;
            tdone[105]=1;
          }
          else {
            done_96.setPresent();//sysj\conveyor_controller.sysj line: 898, column: 7
            currsigs.addElement(done_96);
            S200870=1;
            active[105]=1;
            ends[105]=1;
            tdone[105]=1;
          }
        }
        else {
          active[105]=1;
          ends[105]=1;
          tdone[105]=1;
        }
      }
      else {
        active[105]=1;
        ends[105]=1;
        tdone[105]=1;
      }
    }
  }

  public void thread202029(int [] tdone, int [] ends){
        S200843=1;
    S200842=0;
    active[104]=1;
    ends[104]=1;
    tdone[104]=1;
  }

  public void thread202028(int [] tdone, int [] ends){
        S200822=1;
    S200821=0;
    S148229=0;
    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 796, column: 5
      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 796, column: 5
      S148229=1;
      active[97]=1;
      ends[97]=1;
      tdone[97]=1;
    }
    else {
      S148224=0;
      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 796, column: 5
        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 796, column: 5
        S148224=1;
        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 796, column: 5
          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 796, column: 5
          ends[97]=2;
          ;//sysj\conveyor_controller.sysj line: 796, column: 5
          S200821=1;
          S148290=0;
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

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S200966){
        case 0 : 
          S200966=0;
          break RUN;
        
        case 1 : 
          S200966=2;
          S200966=2;
          manualMode_96.setClear();//sysj\conveyor_controller.sysj line: 794, column: 4
          autoMode_96.setClear();//sysj\conveyor_controller.sysj line: 794, column: 4
          bottleAtPos3_96.setClear();//sysj\conveyor_controller.sysj line: 794, column: 4
          done_96.setClear();//sysj\conveyor_controller.sysj line: 794, column: 4
          thread202028(tdone,ends);
          thread202029(tdone,ends);
          thread202030(tdone,ends);
          thread202031(tdone,ends);
          int biggest202035 = 0;
          if(ends[97]>=biggest202035){
            biggest202035=ends[97];
          }
          if(ends[104]>=biggest202035){
            biggest202035=ends[104];
          }
          if(ends[105]>=biggest202035){
            biggest202035=ends[105];
          }
          if(ends[106]>=biggest202035){
            biggest202035=ends[106];
          }
          if(biggest202035 == 1){
            active[96]=1;
            ends[96]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_96.setClear();//sysj\conveyor_controller.sysj line: 794, column: 4
          autoMode_96.setClear();//sysj\conveyor_controller.sysj line: 794, column: 4
          bottleAtPos3_96.setClear();//sysj\conveyor_controller.sysj line: 794, column: 4
          done_96.setClear();//sysj\conveyor_controller.sysj line: 794, column: 4
          thread202036(tdone,ends);
          thread202053(tdone,ends);
          thread202054(tdone,ends);
          thread202055(tdone,ends);
          int biggest202062 = 0;
          if(ends[97]>=biggest202062){
            biggest202062=ends[97];
          }
          if(ends[104]>=biggest202062){
            biggest202062=ends[104];
          }
          if(ends[105]>=biggest202062){
            biggest202062=ends[105];
          }
          if(ends[106]>=biggest202062){
            biggest202062=ends[106];
          }
          if(biggest202062 == 1){
            active[96]=1;
            ends[96]=1;
            break RUN;
          }
          //FINXME code
          if(biggest202062 == 0){
            S200966=0;
            active[96]=0;
            ends[96]=0;
            S200966=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    manualMode_96 = new Signal();
    autoMode_96 = new Signal();
    bottleAtPos3_96 = new Signal();
    done_96 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[96] != 0){
      int index = 96;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[96]!=0 || suspended[96]!=0 || active[96]!=1);
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
      manualMode_96.setpreclear();
      autoMode_96.setpreclear();
      bottleAtPos3_96.setpreclear();
      done_96.setpreclear();
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
      manualMode_96.setClear();
      autoMode_96.setClear();
      bottleAtPos3_96.setClear();
      done_96.setClear();
      checkThree_in.sethook();
      lidLoaderReady_o.sethook();
      if(paused[96]!=0 || suspended[96]!=0 || active[96]!=1);
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
      if(active[96] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
