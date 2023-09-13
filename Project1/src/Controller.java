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
  private Signal manualMode_87;
  private Signal autoMode_87;
  private Signal bottleAtPos3_87;
  private Signal done_87;
  private long __start_thread_93;//sysj\conveyor_controller.sysj line: 794, column: 32
  private int S201568 = 1;
  private int S201424 = 1;
  private int S201423 = 1;
  private int S143455 = 1;
  private int S143450 = 1;
  private int S143516 = 1;
  private int S143478 = 1;
  private int S143473 = 1;
  private int S143525 = 1;
  private int S143531 = 1;
  private int S143562 = 1;
  private int S143573 = 1;
  private int S143564 = 1;
  private int S143609 = 1;
  private int S143604 = 1;
  private int S146428 = 1;
  private int S146436 = 1;
  private int S146747 = 1;
  private int S146539 = 1;
  private int S146481 = 1;
  private int S146443 = 1;
  private int S146438 = 1;
  private int S146755 = 1;
  private int S201445 = 1;
  private int S201444 = 1;
  private int S201528 = 1;
  private int S201472 = 1;
  private int S201452 = 1;
  private int S201447 = 1;
  private int S201566 = 1;
  private int S201540 = 1;
  private int S201533 = 1;
  private int S201536 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread202410(int [] tdone, int [] ends){
        S201536=1;
    active[99]=1;
    ends[99]=1;
    tdone[99]=1;
  }

  public void thread202409(int [] tdone, int [] ends){
        S201533=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 832, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[98]=1;
    ends[98]=1;
    tdone[98]=1;
  }

  public void thread202407(int [] tdone, int [] ends){
        switch(S201536){
      case 0 : 
        active[99]=0;
        ends[99]=0;
        tdone[99]=1;
        break;
      
      case 1 : 
        if(done_87.getprestatus()){//sysj\conveyor_controller.sysj line: 836, column: 28
          ends[99]=2;
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

  public void thread202406(int [] tdone, int [] ends){
        switch(S201533){
      case 0 : 
        active[98]=0;
        ends[98]=0;
        tdone[98]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 832, column: 22
        currsigs.addElement(bottleAtPos3E);
        active[98]=1;
        ends[98]=1;
        tdone[98]=1;
        break;
      
    }
  }

  public void thread202405(int [] tdone, int [] ends){
        switch(S201566){
      case 0 : 
        active[97]=0;
        ends[97]=0;
        tdone[97]=1;
        break;
      
      case 1 : 
        switch(S201540){
          case 0 : 
            thread202406(tdone,ends);
            thread202407(tdone,ends);
            int biggest202408 = 0;
            if(ends[98]>=biggest202408){
              biggest202408=ends[98];
            }
            if(ends[99]>=biggest202408){
              biggest202408=ends[99];
            }
            if(biggest202408 == 1){
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            if(biggest202408 == 2){
              ends[97]=2;
              ;//sysj\conveyor_controller.sysj line: 830, column: 7
              S201540=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            //FINXME code
            if(biggest202408 == 0){
              ;//sysj\conveyor_controller.sysj line: 838, column: 19
              S201540=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            break;
          
          case 1 : 
            S201540=1;
            S201540=0;
            if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 829, column: 20
              thread202409(tdone,ends);
              thread202410(tdone,ends);
              int biggest202411 = 0;
              if(ends[98]>=biggest202411){
                biggest202411=ends[98];
              }
              if(ends[99]>=biggest202411){
                biggest202411=ends[99];
              }
              if(biggest202411 == 1){
                active[97]=1;
                ends[97]=1;
                tdone[97]=1;
              }
            }
            else {
              S201540=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202404(int [] tdone, int [] ends){
        switch(S201528){
      case 0 : 
        active[96]=0;
        ends[96]=0;
        tdone[96]=1;
        break;
      
      case 1 : 
        switch(S201472){
          case 0 : 
            switch(S201452){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 819, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 819, column: 6
                  S201452=1;
                  active[96]=1;
                  ends[96]=1;
                  tdone[96]=1;
                }
                else {
                  switch(S201447){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 819, column: 6
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 819, column: 6
                        S201447=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 819, column: 6
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 819, column: 6
                          ends[96]=2;
                          ;//sysj\conveyor_controller.sysj line: 819, column: 6
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 820, column: 9
                            bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 821, column: 7
                            currsigs.addElement(bottleAtPos3_87);
                            S201472=1;
                            active[96]=1;
                            ends[96]=1;
                            tdone[96]=1;
                          }
                          else {
                            S201472=1;
                            active[96]=1;
                            ends[96]=1;
                            tdone[96]=1;
                          }
                        }
                        else {
                          active[96]=1;
                          ends[96]=1;
                          tdone[96]=1;
                        }
                      }
                      else {
                        active[96]=1;
                        ends[96]=1;
                        tdone[96]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 819, column: 6
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 819, column: 6
                        ends[96]=2;
                        ;//sysj\conveyor_controller.sysj line: 819, column: 6
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 820, column: 9
                          bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 821, column: 7
                          currsigs.addElement(bottleAtPos3_87);
                          S201472=1;
                          active[96]=1;
                          ends[96]=1;
                          tdone[96]=1;
                        }
                        else {
                          S201472=1;
                          active[96]=1;
                          ends[96]=1;
                          tdone[96]=1;
                        }
                      }
                      else {
                        active[96]=1;
                        ends[96]=1;
                        tdone[96]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S201452=1;
                S201452=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 819, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 819, column: 6
                  S201452=1;
                  active[96]=1;
                  ends[96]=1;
                  tdone[96]=1;
                }
                else {
                  S201447=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 819, column: 6
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 819, column: 6
                    S201447=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 819, column: 6
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 819, column: 6
                      ends[96]=2;
                      ;//sysj\conveyor_controller.sysj line: 819, column: 6
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 820, column: 9
                        bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 821, column: 7
                        currsigs.addElement(bottleAtPos3_87);
                        S201472=1;
                        active[96]=1;
                        ends[96]=1;
                        tdone[96]=1;
                      }
                      else {
                        S201472=1;
                        active[96]=1;
                        ends[96]=1;
                        tdone[96]=1;
                      }
                    }
                    else {
                      active[96]=1;
                      ends[96]=1;
                      tdone[96]=1;
                    }
                  }
                  else {
                    active[96]=1;
                    ends[96]=1;
                    tdone[96]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S201472=1;
            S201472=0;
            S201452=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 819, column: 6
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 819, column: 6
              S201452=1;
              active[96]=1;
              ends[96]=1;
              tdone[96]=1;
            }
            else {
              S201447=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 819, column: 6
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 819, column: 6
                S201447=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 819, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 819, column: 6
                  ends[96]=2;
                  ;//sysj\conveyor_controller.sysj line: 819, column: 6
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 820, column: 9
                    bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 821, column: 7
                    currsigs.addElement(bottleAtPos3_87);
                    S201472=1;
                    active[96]=1;
                    ends[96]=1;
                    tdone[96]=1;
                  }
                  else {
                    S201472=1;
                    active[96]=1;
                    ends[96]=1;
                    tdone[96]=1;
                  }
                }
                else {
                  active[96]=1;
                  ends[96]=1;
                  tdone[96]=1;
                }
              }
              else {
                active[96]=1;
                ends[96]=1;
                tdone[96]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202403(int [] tdone, int [] ends){
        switch(S201445){
      case 0 : 
        active[95]=0;
        ends[95]=0;
        tdone[95]=1;
        break;
      
      case 1 : 
        switch(S201444){
          case 0 : 
            if(mode.getprestatus()){//sysj\conveyor_controller.sysj line: 803, column: 11
              S201444=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 805, column: 9
                autoMode_87.setPresent();//sysj\conveyor_controller.sysj line: 806, column: 7
                currsigs.addElement(autoMode_87);
                active[95]=1;
                ends[95]=1;
                tdone[95]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 808, column: 14
                  manualMode_87.setPresent();//sysj\conveyor_controller.sysj line: 809, column: 7
                  currsigs.addElement(manualMode_87);
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
            }
            else {
              active[95]=1;
              ends[95]=1;
              tdone[95]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 805, column: 9
              autoMode_87.setPresent();//sysj\conveyor_controller.sysj line: 806, column: 7
              currsigs.addElement(autoMode_87);
              active[95]=1;
              ends[95]=1;
              tdone[95]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 808, column: 14
                manualMode_87.setPresent();//sysj\conveyor_controller.sysj line: 809, column: 7
                currsigs.addElement(manualMode_87);
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
            break;
          
        }
        break;
      
    }
  }

  public void thread202401(int [] tdone, int [] ends){
        switch(S146755){
      case 0 : 
        active[94]=0;
        ends[94]=0;
        tdone[94]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 796, column: 21
          armDest.setPresent();//sysj\conveyor_controller.sysj line: 796, column: 31
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
      
    }
  }

  public void thread202400(int [] tdone, int [] ends){
        switch(S146747){
      case 0 : 
        active[93]=0;
        ends[93]=0;
        tdone[93]=1;
        break;
      
      case 1 : 
        switch(S146539){
          case 0 : 
            switch(S146481){
              case 0 : 
                switch(S146443){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 794, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 794, column: 48
                      S146443=1;
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                    else {
                      switch(S146438){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 794, column: 48
                            lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 794, column: 48
                            S146438=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 794, column: 48
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 794, column: 48
                              ends[93]=2;
                              ;//sysj\conveyor_controller.sysj line: 794, column: 48
                              S146481=1;
                              __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 794, column: 32
                              if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 794, column: 32
                                ends[93]=2;
                                ;//sysj\conveyor_controller.sysj line: 794, column: 32
                                done_87.setPresent();//sysj\conveyor_controller.sysj line: 794, column: 100
                                currsigs.addElement(done_87);
                                S146539=1;
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
                          else {
                            active[93]=1;
                            ends[93]=1;
                            tdone[93]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 794, column: 48
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 794, column: 48
                            ends[93]=2;
                            ;//sysj\conveyor_controller.sysj line: 794, column: 48
                            S146481=1;
                            __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 794, column: 32
                            if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 794, column: 32
                              ends[93]=2;
                              ;//sysj\conveyor_controller.sysj line: 794, column: 32
                              done_87.setPresent();//sysj\conveyor_controller.sysj line: 794, column: 100
                              currsigs.addElement(done_87);
                              S146539=1;
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
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S146443=1;
                    S146443=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 794, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 794, column: 48
                      S146443=1;
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                    else {
                      S146438=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 794, column: 48
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 794, column: 48
                        S146438=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 794, column: 48
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 794, column: 48
                          ends[93]=2;
                          ;//sysj\conveyor_controller.sysj line: 794, column: 48
                          S146481=1;
                          __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 794, column: 32
                          if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 794, column: 32
                            ends[93]=2;
                            ;//sysj\conveyor_controller.sysj line: 794, column: 32
                            done_87.setPresent();//sysj\conveyor_controller.sysj line: 794, column: 100
                            currsigs.addElement(done_87);
                            S146539=1;
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
                if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 794, column: 32
                  ends[93]=2;
                  ;//sysj\conveyor_controller.sysj line: 794, column: 32
                  done_87.setPresent();//sysj\conveyor_controller.sysj line: 794, column: 100
                  currsigs.addElement(done_87);
                  S146539=1;
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
            break;
          
          case 1 : 
            S146539=1;
            S146539=0;
            if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 794, column: 21
              armSource.setPresent();//sysj\conveyor_controller.sysj line: 794, column: 33
              currsigs.addElement(armSource);
              S146481=0;
              S146443=0;
              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 794, column: 48
                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 794, column: 48
                S146443=1;
                active[93]=1;
                ends[93]=1;
                tdone[93]=1;
              }
              else {
                S146438=0;
                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 794, column: 48
                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 794, column: 48
                  S146438=1;
                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 794, column: 48
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 794, column: 48
                    ends[93]=2;
                    ;//sysj\conveyor_controller.sysj line: 794, column: 48
                    S146481=1;
                    __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 794, column: 32
                    if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 794, column: 32
                      ends[93]=2;
                      ;//sysj\conveyor_controller.sysj line: 794, column: 32
                      done_87.setPresent();//sysj\conveyor_controller.sysj line: 794, column: 100
                      currsigs.addElement(done_87);
                      S146539=1;
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
                else {
                  active[93]=1;
                  ends[93]=1;
                  tdone[93]=1;
                }
              }
            }
            else {
              S146539=1;
              active[93]=1;
              ends[93]=1;
              tdone[93]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202399(int [] tdone, int [] ends){
        switch(S146436){
      case 0 : 
        active[92]=0;
        ends[92]=0;
        tdone[92]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 792, column: 21
          vacOn.setPresent();//sysj\conveyor_controller.sysj line: 792, column: 29
          currsigs.addElement(vacOn);
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

  public void thread202398(int [] tdone, int [] ends){
        switch(S146428){
      case 0 : 
        active[91]=0;
        ends[91]=0;
        tdone[91]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 790, column: 21
          pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 790, column: 36
          currsigs.addElement(pusherExtend);
          active[91]=1;
          ends[91]=1;
          tdone[91]=1;
        }
        else {
          active[91]=1;
          ends[91]=1;
          tdone[91]=1;
        }
        break;
      
    }
  }

  public void thread202396(int [] tdone, int [] ends){
        S146755=1;
    if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 796, column: 21
      armDest.setPresent();//sysj\conveyor_controller.sysj line: 796, column: 31
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
  }

  public void thread202395(int [] tdone, int [] ends){
        S146747=1;
    S146539=0;
    if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 794, column: 21
      armSource.setPresent();//sysj\conveyor_controller.sysj line: 794, column: 33
      currsigs.addElement(armSource);
      S146481=0;
      S146443=0;
      if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 794, column: 48
        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 794, column: 48
        S146443=1;
        active[93]=1;
        ends[93]=1;
        tdone[93]=1;
      }
      else {
        S146438=0;
        if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 794, column: 48
          lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 794, column: 48
          S146438=1;
          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 794, column: 48
            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 794, column: 48
            ends[93]=2;
            ;//sysj\conveyor_controller.sysj line: 794, column: 48
            S146481=1;
            __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 794, column: 32
            if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 794, column: 32
              ends[93]=2;
              ;//sysj\conveyor_controller.sysj line: 794, column: 32
              done_87.setPresent();//sysj\conveyor_controller.sysj line: 794, column: 100
              currsigs.addElement(done_87);
              S146539=1;
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
        else {
          active[93]=1;
          ends[93]=1;
          tdone[93]=1;
        }
      }
    }
    else {
      S146539=1;
      active[93]=1;
      ends[93]=1;
      tdone[93]=1;
    }
  }

  public void thread202394(int [] tdone, int [] ends){
        S146436=1;
    if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 792, column: 21
      vacOn.setPresent();//sysj\conveyor_controller.sysj line: 792, column: 29
      currsigs.addElement(vacOn);
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

  public void thread202393(int [] tdone, int [] ends){
        S146428=1;
    if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 790, column: 21
      pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 790, column: 36
      currsigs.addElement(pusherExtend);
      active[91]=1;
      ends[91]=1;
      tdone[91]=1;
    }
    else {
      active[91]=1;
      ends[91]=1;
      tdone[91]=1;
    }
  }

  public void thread202391(int [] tdone, int [] ends){
        switch(S143573){
      case 0 : 
        active[90]=0;
        ends[90]=0;
        tdone[90]=1;
        break;
      
      case 1 : 
        switch(S143564){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 760, column: 16
              System.out.println("WP gripped");//sysj\conveyor_controller.sysj line: 761, column: 10
              S143564=1;
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 763, column: 11
              currsigs.addElement(armDest);
              active[90]=1;
              ends[90]=1;
              tdone[90]=1;
            }
            else {
              active[90]=1;
              ends[90]=1;
              tdone[90]=1;
            }
            break;
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 762, column: 16
              System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 765, column: 10
              ends[90]=2;
              tdone[90]=1;
            }
            else {
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 763, column: 11
              currsigs.addElement(armDest);
              active[90]=1;
              ends[90]=1;
              tdone[90]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202390(int [] tdone, int [] ends){
        switch(S143562){
      case 0 : 
        active[89]=0;
        ends[89]=0;
        tdone[89]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\conveyor_controller.sysj line: 756, column: 10
        currsigs.addElement(vacOn);
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
        break;
      
    }
  }

  public void thread202388(int [] tdone, int [] ends){
        S143573=1;
    S143564=0;
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread202387(int [] tdone, int [] ends){
        S143562=1;
    vacOn.setPresent();//sysj\conveyor_controller.sysj line: 756, column: 10
    currsigs.addElement(vacOn);
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread202386(int [] tdone, int [] ends){
        switch(S201424){
      case 0 : 
        active[88]=0;
        ends[88]=0;
        tdone[88]=1;
        break;
      
      case 1 : 
        switch(S201423){
          case 0 : 
            switch(S143455){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 720, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 720, column: 5
                  S143455=1;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  switch(S143450){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 720, column: 5
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 720, column: 5
                        S143450=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 720, column: 5
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 720, column: 5
                          ends[88]=2;
                          ;//sysj\conveyor_controller.sysj line: 720, column: 5
                          S201423=1;
                          S143516=0;
                          active[88]=1;
                          ends[88]=1;
                          tdone[88]=1;
                        }
                        else {
                          active[88]=1;
                          ends[88]=1;
                          tdone[88]=1;
                        }
                      }
                      else {
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 720, column: 5
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 720, column: 5
                        ends[88]=2;
                        ;//sysj\conveyor_controller.sysj line: 720, column: 5
                        S201423=1;
                        S143516=0;
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      else {
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S143455=1;
                S143455=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 720, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 720, column: 5
                  S143455=1;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  S143450=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 720, column: 5
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 720, column: 5
                    S143450=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 720, column: 5
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 720, column: 5
                      ends[88]=2;
                      ;//sysj\conveyor_controller.sysj line: 720, column: 5
                      S201423=1;
                      S143516=0;
                      active[88]=1;
                      ends[88]=1;
                      tdone[88]=1;
                    }
                    else {
                      active[88]=1;
                      ends[88]=1;
                      tdone[88]=1;
                    }
                  }
                  else {
                    active[88]=1;
                    ends[88]=1;
                    tdone[88]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S143516){
              case 0 : 
                if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 722, column: 13
                  S143516=1;
                  S143478=0;
                  if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 723, column: 6
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 723, column: 6
                    S143478=1;
                    active[88]=1;
                    ends[88]=1;
                    tdone[88]=1;
                  }
                  else {
                    S143473=0;
                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 723, column: 6
                      lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 723, column: 6
                      S143473=1;
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 723, column: 6
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 723, column: 6
                        ends[88]=2;
                        ;//sysj\conveyor_controller.sysj line: 723, column: 6
                        S143516=2;
                        System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 725, column: 7
                        S143525=0;
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 727, column: 8
                        currsigs.addElement(armDest);
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      else {
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                    }
                    else {
                      active[88]=1;
                      ends[88]=1;
                      tdone[88]=1;
                    }
                  }
                }
                else {
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                break;
              
              case 1 : 
                switch(S143478){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 723, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 723, column: 6
                      S143478=1;
                      active[88]=1;
                      ends[88]=1;
                      tdone[88]=1;
                    }
                    else {
                      switch(S143473){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 723, column: 6
                            lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 723, column: 6
                            S143473=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 723, column: 6
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 723, column: 6
                              ends[88]=2;
                              ;//sysj\conveyor_controller.sysj line: 723, column: 6
                              S143516=2;
                              System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 725, column: 7
                              S143525=0;
                              armDest.setPresent();//sysj\conveyor_controller.sysj line: 727, column: 8
                              currsigs.addElement(armDest);
                              active[88]=1;
                              ends[88]=1;
                              tdone[88]=1;
                            }
                            else {
                              active[88]=1;
                              ends[88]=1;
                              tdone[88]=1;
                            }
                          }
                          else {
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 723, column: 6
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 723, column: 6
                            ends[88]=2;
                            ;//sysj\conveyor_controller.sysj line: 723, column: 6
                            S143516=2;
                            System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 725, column: 7
                            S143525=0;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 727, column: 8
                            currsigs.addElement(armDest);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S143478=1;
                    S143478=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 723, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 723, column: 6
                      S143478=1;
                      active[88]=1;
                      ends[88]=1;
                      tdone[88]=1;
                    }
                    else {
                      S143473=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 723, column: 6
                        lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 723, column: 6
                        S143473=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 723, column: 6
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 723, column: 6
                          ends[88]=2;
                          ;//sysj\conveyor_controller.sysj line: 723, column: 6
                          S143516=2;
                          System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 725, column: 7
                          S143525=0;
                          armDest.setPresent();//sysj\conveyor_controller.sysj line: 727, column: 8
                          currsigs.addElement(armDest);
                          active[88]=1;
                          ends[88]=1;
                          tdone[88]=1;
                        }
                        else {
                          active[88]=1;
                          ends[88]=1;
                          tdone[88]=1;
                        }
                      }
                      else {
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                if(manualMode_87.getprestatus()){//sysj\conveyor_controller.sysj line: 724, column: 12
                  lidLoaderReady_o.setPreempted();
                  S143516=3;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  switch(S143525){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 726, column: 13
                        System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 729, column: 7
                        S143525=1;
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 727, column: 8
                        currsigs.addElement(armDest);
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 730, column: 13
                        System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 731, column: 7
                        S143525=2;
                        S143531=0;
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      else {
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      break;
                    
                    case 2 : 
                      switch(S143531){
                        case 0 : 
                          if(!empty.getprestatus()){//sysj\conveyor_controller.sysj line: 734, column: 14
                            S143531=1;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(request.getprestatus()){//sysj\conveyor_controller.sysj line: 735, column: 14
                            System.out.println("New request");//sysj\conveyor_controller.sysj line: 736, column: 8
                            S143531=2;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 738, column: 9
                            currsigs.addElement(armDest);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 2 : 
                          if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 737, column: 14
                            System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 740, column: 8
                            S143531=3;
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 743, column: 9
                            currsigs.addElement(pusherExtend);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 738, column: 9
                            currsigs.addElement(armDest);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 3 : 
                          if(pusherExtended.getprestatus()){//sysj\conveyor_controller.sysj line: 742, column: 14
                            System.out.println("Pusher extended");//sysj\conveyor_controller.sysj line: 745, column: 8
                            S143531=4;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 743, column: 9
                            currsigs.addElement(pusherExtend);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 4 : 
                          if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 746, column: 14
                            System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 747, column: 8
                            S143531=5;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 750, column: 9
                            currsigs.addElement(armSource);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 5 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 749, column: 14
                            System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 752, column: 8
                            S143531=6;
                            thread202387(tdone,ends);
                            thread202388(tdone,ends);
                            int biggest202389 = 0;
                            if(ends[89]>=biggest202389){
                              biggest202389=ends[89];
                            }
                            if(ends[90]>=biggest202389){
                              biggest202389=ends[90];
                            }
                            if(biggest202389 == 1){
                              active[88]=1;
                              ends[88]=1;
                              tdone[88]=1;
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 750, column: 9
                            currsigs.addElement(armSource);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 6 : 
                          thread202390(tdone,ends);
                          thread202391(tdone,ends);
                          int biggest202392 = 0;
                          if(ends[89]>=biggest202392){
                            biggest202392=ends[89];
                          }
                          if(ends[90]>=biggest202392){
                            biggest202392=ends[90];
                          }
                          if(biggest202392 == 1){
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          if(biggest202392 == 2){
                            ends[88]=2;
                            ;//sysj\conveyor_controller.sysj line: 754, column: 8
                            S143531=7;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          //FINXME code
                          if(biggest202392 == 0){
                            S143531=7;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 7 : 
                          if(!WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 770, column: 14
                            S143531=8;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 773, column: 9
                            currsigs.addElement(armSource);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 8 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 772, column: 14
                            done_87.setPresent();//sysj\conveyor_controller.sysj line: 777, column: 8
                            currsigs.addElement(done_87);
                            S143531=9;
                            S143609=0;
                            if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 778, column: 8
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 778, column: 8
                              S143609=1;
                              active[88]=1;
                              ends[88]=1;
                              tdone[88]=1;
                            }
                            else {
                              S143604=0;
                              if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 778, column: 8
                                lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 778, column: 8
                                S143604=1;
                                if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 778, column: 8
                                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 778, column: 8
                                  ends[88]=2;
                                  ;//sysj\conveyor_controller.sysj line: 778, column: 8
                                  System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 780, column: 8
                                  S143531=10;
                                  active[88]=1;
                                  ends[88]=1;
                                  tdone[88]=1;
                                }
                                else {
                                  active[88]=1;
                                  ends[88]=1;
                                  tdone[88]=1;
                                }
                              }
                              else {
                                active[88]=1;
                                ends[88]=1;
                                tdone[88]=1;
                              }
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 773, column: 9
                            currsigs.addElement(armSource);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 9 : 
                          switch(S143609){
                            case 0 : 
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 778, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 778, column: 8
                                S143609=1;
                                active[88]=1;
                                ends[88]=1;
                                tdone[88]=1;
                              }
                              else {
                                switch(S143604){
                                  case 0 : 
                                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 778, column: 8
                                      lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 778, column: 8
                                      S143604=1;
                                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 778, column: 8
                                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 778, column: 8
                                        ends[88]=2;
                                        ;//sysj\conveyor_controller.sysj line: 778, column: 8
                                        System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 780, column: 8
                                        S143531=10;
                                        active[88]=1;
                                        ends[88]=1;
                                        tdone[88]=1;
                                      }
                                      else {
                                        active[88]=1;
                                        ends[88]=1;
                                        tdone[88]=1;
                                      }
                                    }
                                    else {
                                      active[88]=1;
                                      ends[88]=1;
                                      tdone[88]=1;
                                    }
                                    break;
                                  
                                  case 1 : 
                                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 778, column: 8
                                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 778, column: 8
                                      ends[88]=2;
                                      ;//sysj\conveyor_controller.sysj line: 778, column: 8
                                      System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 780, column: 8
                                      S143531=10;
                                      active[88]=1;
                                      ends[88]=1;
                                      tdone[88]=1;
                                    }
                                    else {
                                      active[88]=1;
                                      ends[88]=1;
                                      tdone[88]=1;
                                    }
                                    break;
                                  
                                }
                              }
                              break;
                            
                            case 1 : 
                              S143609=1;
                              S143609=0;
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 778, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 778, column: 8
                                S143609=1;
                                active[88]=1;
                                ends[88]=1;
                                tdone[88]=1;
                              }
                              else {
                                S143604=0;
                                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 778, column: 8
                                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 778, column: 8
                                  S143604=1;
                                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 778, column: 8
                                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 778, column: 8
                                    ends[88]=2;
                                    ;//sysj\conveyor_controller.sysj line: 778, column: 8
                                    System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 780, column: 8
                                    S143531=10;
                                    active[88]=1;
                                    ends[88]=1;
                                    tdone[88]=1;
                                  }
                                  else {
                                    active[88]=1;
                                    ends[88]=1;
                                    tdone[88]=1;
                                  }
                                }
                                else {
                                  active[88]=1;
                                  ends[88]=1;
                                  tdone[88]=1;
                                }
                              }
                              break;
                            
                          }
                          break;
                        
                        case 10 : 
                          S143531=10;
                          S143531=0;
                          active[88]=1;
                          ends[88]=1;
                          tdone[88]=1;
                          break;
                        
                      }
                      break;
                    
                  }
                }
                break;
              
              case 3 : 
                S143516=3;
                System.out.println("entering manual");//sysj\conveyor_controller.sysj line: 788, column: 6
                S143516=4;
                thread202393(tdone,ends);
                thread202394(tdone,ends);
                thread202395(tdone,ends);
                thread202396(tdone,ends);
                int biggest202397 = 0;
                if(ends[91]>=biggest202397){
                  biggest202397=ends[91];
                }
                if(ends[92]>=biggest202397){
                  biggest202397=ends[92];
                }
                if(ends[93]>=biggest202397){
                  biggest202397=ends[93];
                }
                if(ends[94]>=biggest202397){
                  biggest202397=ends[94];
                }
                if(biggest202397 == 1){
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                break;
              
              case 4 : 
                if(autoMode_87.getprestatus()){//sysj\conveyor_controller.sysj line: 789, column: 12
                  lidLoaderReady_o.setPreempted();
                  S143516=0;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  thread202398(tdone,ends);
                  thread202399(tdone,ends);
                  thread202400(tdone,ends);
                  thread202401(tdone,ends);
                  int biggest202402 = 0;
                  if(ends[91]>=biggest202402){
                    biggest202402=ends[91];
                  }
                  if(ends[92]>=biggest202402){
                    biggest202402=ends[92];
                  }
                  if(ends[93]>=biggest202402){
                    biggest202402=ends[93];
                  }
                  if(ends[94]>=biggest202402){
                    biggest202402=ends[94];
                  }
                  if(biggest202402 == 1){
                    active[88]=1;
                    ends[88]=1;
                    tdone[88]=1;
                  }
                  //FINXME code
                  if(biggest202402 == 0){
                    S143516=0;
                    active[88]=1;
                    ends[88]=1;
                    tdone[88]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202383(int [] tdone, int [] ends){
        S201536=1;
    active[99]=1;
    ends[99]=1;
    tdone[99]=1;
  }

  public void thread202382(int [] tdone, int [] ends){
        S201533=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 832, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[98]=1;
    ends[98]=1;
    tdone[98]=1;
  }

  public void thread202381(int [] tdone, int [] ends){
        S201566=1;
    S201540=0;
    if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 829, column: 20
      thread202382(tdone,ends);
      thread202383(tdone,ends);
      int biggest202384 = 0;
      if(ends[98]>=biggest202384){
        biggest202384=ends[98];
      }
      if(ends[99]>=biggest202384){
        biggest202384=ends[99];
      }
      if(biggest202384 == 1){
        active[97]=1;
        ends[97]=1;
        tdone[97]=1;
      }
    }
    else {
      S201540=1;
      active[97]=1;
      ends[97]=1;
      tdone[97]=1;
    }
  }

  public void thread202380(int [] tdone, int [] ends){
        S201528=1;
    S201472=0;
    S201452=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 819, column: 6
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 819, column: 6
      S201452=1;
      active[96]=1;
      ends[96]=1;
      tdone[96]=1;
    }
    else {
      S201447=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 819, column: 6
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 819, column: 6
        S201447=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 819, column: 6
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 819, column: 6
          ends[96]=2;
          ;//sysj\conveyor_controller.sysj line: 819, column: 6
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 820, column: 9
            bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 821, column: 7
            currsigs.addElement(bottleAtPos3_87);
            S201472=1;
            active[96]=1;
            ends[96]=1;
            tdone[96]=1;
          }
          else {
            S201472=1;
            active[96]=1;
            ends[96]=1;
            tdone[96]=1;
          }
        }
        else {
          active[96]=1;
          ends[96]=1;
          tdone[96]=1;
        }
      }
      else {
        active[96]=1;
        ends[96]=1;
        tdone[96]=1;
      }
    }
  }

  public void thread202379(int [] tdone, int [] ends){
        S201445=1;
    S201444=0;
    active[95]=1;
    ends[95]=1;
    tdone[95]=1;
  }

  public void thread202378(int [] tdone, int [] ends){
        S201424=1;
    S201423=0;
    S143455=0;
    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 720, column: 5
      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 720, column: 5
      S143455=1;
      active[88]=1;
      ends[88]=1;
      tdone[88]=1;
    }
    else {
      S143450=0;
      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 720, column: 5
        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 720, column: 5
        S143450=1;
        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 720, column: 5
          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 720, column: 5
          ends[88]=2;
          ;//sysj\conveyor_controller.sysj line: 720, column: 5
          S201423=1;
          S143516=0;
          active[88]=1;
          ends[88]=1;
          tdone[88]=1;
        }
        else {
          active[88]=1;
          ends[88]=1;
          tdone[88]=1;
        }
      }
      else {
        active[88]=1;
        ends[88]=1;
        tdone[88]=1;
      }
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S201568){
        case 0 : 
          S201568=0;
          break RUN;
        
        case 1 : 
          S201568=2;
          S201568=2;
          manualMode_87.setClear();//sysj\conveyor_controller.sysj line: 718, column: 4
          autoMode_87.setClear();//sysj\conveyor_controller.sysj line: 718, column: 4
          bottleAtPos3_87.setClear();//sysj\conveyor_controller.sysj line: 718, column: 4
          done_87.setClear();//sysj\conveyor_controller.sysj line: 718, column: 4
          thread202378(tdone,ends);
          thread202379(tdone,ends);
          thread202380(tdone,ends);
          thread202381(tdone,ends);
          int biggest202385 = 0;
          if(ends[88]>=biggest202385){
            biggest202385=ends[88];
          }
          if(ends[95]>=biggest202385){
            biggest202385=ends[95];
          }
          if(ends[96]>=biggest202385){
            biggest202385=ends[96];
          }
          if(ends[97]>=biggest202385){
            biggest202385=ends[97];
          }
          if(biggest202385 == 1){
            active[87]=1;
            ends[87]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_87.setClear();//sysj\conveyor_controller.sysj line: 718, column: 4
          autoMode_87.setClear();//sysj\conveyor_controller.sysj line: 718, column: 4
          bottleAtPos3_87.setClear();//sysj\conveyor_controller.sysj line: 718, column: 4
          done_87.setClear();//sysj\conveyor_controller.sysj line: 718, column: 4
          thread202386(tdone,ends);
          thread202403(tdone,ends);
          thread202404(tdone,ends);
          thread202405(tdone,ends);
          int biggest202412 = 0;
          if(ends[88]>=biggest202412){
            biggest202412=ends[88];
          }
          if(ends[95]>=biggest202412){
            biggest202412=ends[95];
          }
          if(ends[96]>=biggest202412){
            biggest202412=ends[96];
          }
          if(ends[97]>=biggest202412){
            biggest202412=ends[97];
          }
          if(biggest202412 == 1){
            active[87]=1;
            ends[87]=1;
            break RUN;
          }
          //FINXME code
          if(biggest202412 == 0){
            S201568=0;
            active[87]=0;
            ends[87]=0;
            S201568=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    manualMode_87 = new Signal();
    autoMode_87 = new Signal();
    bottleAtPos3_87 = new Signal();
    done_87 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[87] != 0){
      int index = 87;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[87]!=0 || suspended[87]!=0 || active[87]!=1);
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
      manualMode_87.setpreclear();
      autoMode_87.setpreclear();
      bottleAtPos3_87.setpreclear();
      done_87.setpreclear();
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
      manualMode_87.setClear();
      autoMode_87.setClear();
      bottleAtPos3_87.setClear();
      done_87.setClear();
      checkThree_in.sethook();
      lidLoaderReady_o.sethook();
      if(paused[87]!=0 || suspended[87]!=0 || active[87]!=1);
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
      if(active[87] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
