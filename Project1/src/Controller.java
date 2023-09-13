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
  private long __start_thread_93;//sysj\conveyor_controller.sysj line: 808, column: 32
  private int S182568 = 1;
  private int S182424 = 1;
  private int S182423 = 1;
  private int S124455 = 1;
  private int S124450 = 1;
  private int S124516 = 1;
  private int S124478 = 1;
  private int S124473 = 1;
  private int S124525 = 1;
  private int S124531 = 1;
  private int S124562 = 1;
  private int S124573 = 1;
  private int S124564 = 1;
  private int S124609 = 1;
  private int S124604 = 1;
  private int S127428 = 1;
  private int S127436 = 1;
  private int S127747 = 1;
  private int S127539 = 1;
  private int S127481 = 1;
  private int S127443 = 1;
  private int S127438 = 1;
  private int S127755 = 1;
  private int S182445 = 1;
  private int S182444 = 1;
  private int S182528 = 1;
  private int S182472 = 1;
  private int S182452 = 1;
  private int S182447 = 1;
  private int S182566 = 1;
  private int S182540 = 1;
  private int S182533 = 1;
  private int S182536 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread183382(int [] tdone, int [] ends){
        S182536=1;
    active[99]=1;
    ends[99]=1;
    tdone[99]=1;
  }

  public void thread183381(int [] tdone, int [] ends){
        S182533=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 846, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[98]=1;
    ends[98]=1;
    tdone[98]=1;
  }

  public void thread183379(int [] tdone, int [] ends){
        switch(S182536){
      case 0 : 
        active[99]=0;
        ends[99]=0;
        tdone[99]=1;
        break;
      
      case 1 : 
        if(done_87.getprestatus()){//sysj\conveyor_controller.sysj line: 850, column: 28
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

  public void thread183378(int [] tdone, int [] ends){
        switch(S182533){
      case 0 : 
        active[98]=0;
        ends[98]=0;
        tdone[98]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 846, column: 22
        currsigs.addElement(bottleAtPos3E);
        active[98]=1;
        ends[98]=1;
        tdone[98]=1;
        break;
      
    }
  }

  public void thread183377(int [] tdone, int [] ends){
        switch(S182566){
      case 0 : 
        active[97]=0;
        ends[97]=0;
        tdone[97]=1;
        break;
      
      case 1 : 
        switch(S182540){
          case 0 : 
            thread183378(tdone,ends);
            thread183379(tdone,ends);
            int biggest183380 = 0;
            if(ends[98]>=biggest183380){
              biggest183380=ends[98];
            }
            if(ends[99]>=biggest183380){
              biggest183380=ends[99];
            }
            if(biggest183380 == 1){
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            if(biggest183380 == 2){
              ends[97]=2;
              ;//sysj\conveyor_controller.sysj line: 844, column: 7
              S182540=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            //FINXME code
            if(biggest183380 == 0){
              ;//sysj\conveyor_controller.sysj line: 852, column: 19
              S182540=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            break;
          
          case 1 : 
            S182540=1;
            S182540=0;
            if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 843, column: 20
              thread183381(tdone,ends);
              thread183382(tdone,ends);
              int biggest183383 = 0;
              if(ends[98]>=biggest183383){
                biggest183383=ends[98];
              }
              if(ends[99]>=biggest183383){
                biggest183383=ends[99];
              }
              if(biggest183383 == 1){
                active[97]=1;
                ends[97]=1;
                tdone[97]=1;
              }
            }
            else {
              S182540=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread183376(int [] tdone, int [] ends){
        switch(S182528){
      case 0 : 
        active[96]=0;
        ends[96]=0;
        tdone[96]=1;
        break;
      
      case 1 : 
        switch(S182472){
          case 0 : 
            switch(S182452){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 833, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 833, column: 6
                  S182452=1;
                  active[96]=1;
                  ends[96]=1;
                  tdone[96]=1;
                }
                else {
                  switch(S182447){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 833, column: 6
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 833, column: 6
                        S182447=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 833, column: 6
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 833, column: 6
                          ends[96]=2;
                          ;//sysj\conveyor_controller.sysj line: 833, column: 6
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 834, column: 9
                            bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 835, column: 7
                            currsigs.addElement(bottleAtPos3_87);
                            S182472=1;
                            active[96]=1;
                            ends[96]=1;
                            tdone[96]=1;
                          }
                          else {
                            S182472=1;
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
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 833, column: 6
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 833, column: 6
                        ends[96]=2;
                        ;//sysj\conveyor_controller.sysj line: 833, column: 6
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 834, column: 9
                          bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 835, column: 7
                          currsigs.addElement(bottleAtPos3_87);
                          S182472=1;
                          active[96]=1;
                          ends[96]=1;
                          tdone[96]=1;
                        }
                        else {
                          S182472=1;
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
                S182452=1;
                S182452=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 833, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 833, column: 6
                  S182452=1;
                  active[96]=1;
                  ends[96]=1;
                  tdone[96]=1;
                }
                else {
                  S182447=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 833, column: 6
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 833, column: 6
                    S182447=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 833, column: 6
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 833, column: 6
                      ends[96]=2;
                      ;//sysj\conveyor_controller.sysj line: 833, column: 6
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 834, column: 9
                        bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 835, column: 7
                        currsigs.addElement(bottleAtPos3_87);
                        S182472=1;
                        active[96]=1;
                        ends[96]=1;
                        tdone[96]=1;
                      }
                      else {
                        S182472=1;
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
            S182472=1;
            S182472=0;
            S182452=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 833, column: 6
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 833, column: 6
              S182452=1;
              active[96]=1;
              ends[96]=1;
              tdone[96]=1;
            }
            else {
              S182447=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 833, column: 6
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 833, column: 6
                S182447=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 833, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 833, column: 6
                  ends[96]=2;
                  ;//sysj\conveyor_controller.sysj line: 833, column: 6
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 834, column: 9
                    bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 835, column: 7
                    currsigs.addElement(bottleAtPos3_87);
                    S182472=1;
                    active[96]=1;
                    ends[96]=1;
                    tdone[96]=1;
                  }
                  else {
                    S182472=1;
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

  public void thread183375(int [] tdone, int [] ends){
        switch(S182445){
      case 0 : 
        active[95]=0;
        ends[95]=0;
        tdone[95]=1;
        break;
      
      case 1 : 
        switch(S182444){
          case 0 : 
            if(mode.getprestatus()){//sysj\conveyor_controller.sysj line: 817, column: 11
              S182444=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 819, column: 9
                autoMode_87.setPresent();//sysj\conveyor_controller.sysj line: 820, column: 7
                currsigs.addElement(autoMode_87);
                active[95]=1;
                ends[95]=1;
                tdone[95]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 822, column: 14
                  manualMode_87.setPresent();//sysj\conveyor_controller.sysj line: 823, column: 7
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
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 819, column: 9
              autoMode_87.setPresent();//sysj\conveyor_controller.sysj line: 820, column: 7
              currsigs.addElement(autoMode_87);
              active[95]=1;
              ends[95]=1;
              tdone[95]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 822, column: 14
                manualMode_87.setPresent();//sysj\conveyor_controller.sysj line: 823, column: 7
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

  public void thread183373(int [] tdone, int [] ends){
        switch(S127755){
      case 0 : 
        active[94]=0;
        ends[94]=0;
        tdone[94]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 810, column: 21
          armDest.setPresent();//sysj\conveyor_controller.sysj line: 810, column: 31
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

  public void thread183372(int [] tdone, int [] ends){
        switch(S127747){
      case 0 : 
        active[93]=0;
        ends[93]=0;
        tdone[93]=1;
        break;
      
      case 1 : 
        switch(S127539){
          case 0 : 
            switch(S127481){
              case 0 : 
                switch(S127443){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 808, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 808, column: 48
                      S127443=1;
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                    else {
                      switch(S127438){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 808, column: 48
                            lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 808, column: 48
                            S127438=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 808, column: 48
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 808, column: 48
                              ends[93]=2;
                              ;//sysj\conveyor_controller.sysj line: 808, column: 48
                              S127481=1;
                              __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 808, column: 32
                              if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 808, column: 32
                                ends[93]=2;
                                ;//sysj\conveyor_controller.sysj line: 808, column: 32
                                done_87.setPresent();//sysj\conveyor_controller.sysj line: 808, column: 100
                                currsigs.addElement(done_87);
                                S127539=1;
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
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 808, column: 48
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 808, column: 48
                            ends[93]=2;
                            ;//sysj\conveyor_controller.sysj line: 808, column: 48
                            S127481=1;
                            __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 808, column: 32
                            if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 808, column: 32
                              ends[93]=2;
                              ;//sysj\conveyor_controller.sysj line: 808, column: 32
                              done_87.setPresent();//sysj\conveyor_controller.sysj line: 808, column: 100
                              currsigs.addElement(done_87);
                              S127539=1;
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
                    S127443=1;
                    S127443=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 808, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 808, column: 48
                      S127443=1;
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                    else {
                      S127438=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 808, column: 48
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 808, column: 48
                        S127438=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 808, column: 48
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 808, column: 48
                          ends[93]=2;
                          ;//sysj\conveyor_controller.sysj line: 808, column: 48
                          S127481=1;
                          __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 808, column: 32
                          if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 808, column: 32
                            ends[93]=2;
                            ;//sysj\conveyor_controller.sysj line: 808, column: 32
                            done_87.setPresent();//sysj\conveyor_controller.sysj line: 808, column: 100
                            currsigs.addElement(done_87);
                            S127539=1;
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
                if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 808, column: 32
                  ends[93]=2;
                  ;//sysj\conveyor_controller.sysj line: 808, column: 32
                  done_87.setPresent();//sysj\conveyor_controller.sysj line: 808, column: 100
                  currsigs.addElement(done_87);
                  S127539=1;
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
            S127539=1;
            S127539=0;
            if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 808, column: 21
              armSource.setPresent();//sysj\conveyor_controller.sysj line: 808, column: 33
              currsigs.addElement(armSource);
              S127481=0;
              S127443=0;
              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 808, column: 48
                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 808, column: 48
                S127443=1;
                active[93]=1;
                ends[93]=1;
                tdone[93]=1;
              }
              else {
                S127438=0;
                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 808, column: 48
                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 808, column: 48
                  S127438=1;
                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 808, column: 48
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 808, column: 48
                    ends[93]=2;
                    ;//sysj\conveyor_controller.sysj line: 808, column: 48
                    S127481=1;
                    __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 808, column: 32
                    if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 808, column: 32
                      ends[93]=2;
                      ;//sysj\conveyor_controller.sysj line: 808, column: 32
                      done_87.setPresent();//sysj\conveyor_controller.sysj line: 808, column: 100
                      currsigs.addElement(done_87);
                      S127539=1;
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
              S127539=1;
              active[93]=1;
              ends[93]=1;
              tdone[93]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread183371(int [] tdone, int [] ends){
        switch(S127436){
      case 0 : 
        active[92]=0;
        ends[92]=0;
        tdone[92]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 806, column: 21
          vacOn.setPresent();//sysj\conveyor_controller.sysj line: 806, column: 29
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

  public void thread183370(int [] tdone, int [] ends){
        switch(S127428){
      case 0 : 
        active[91]=0;
        ends[91]=0;
        tdone[91]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 804, column: 21
          pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 804, column: 36
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

  public void thread183368(int [] tdone, int [] ends){
        S127755=1;
    if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 810, column: 21
      armDest.setPresent();//sysj\conveyor_controller.sysj line: 810, column: 31
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

  public void thread183367(int [] tdone, int [] ends){
        S127747=1;
    S127539=0;
    if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 808, column: 21
      armSource.setPresent();//sysj\conveyor_controller.sysj line: 808, column: 33
      currsigs.addElement(armSource);
      S127481=0;
      S127443=0;
      if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 808, column: 48
        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 808, column: 48
        S127443=1;
        active[93]=1;
        ends[93]=1;
        tdone[93]=1;
      }
      else {
        S127438=0;
        if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 808, column: 48
          lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 808, column: 48
          S127438=1;
          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 808, column: 48
            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 808, column: 48
            ends[93]=2;
            ;//sysj\conveyor_controller.sysj line: 808, column: 48
            S127481=1;
            __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 808, column: 32
            if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 808, column: 32
              ends[93]=2;
              ;//sysj\conveyor_controller.sysj line: 808, column: 32
              done_87.setPresent();//sysj\conveyor_controller.sysj line: 808, column: 100
              currsigs.addElement(done_87);
              S127539=1;
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
      S127539=1;
      active[93]=1;
      ends[93]=1;
      tdone[93]=1;
    }
  }

  public void thread183366(int [] tdone, int [] ends){
        S127436=1;
    if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 806, column: 21
      vacOn.setPresent();//sysj\conveyor_controller.sysj line: 806, column: 29
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

  public void thread183365(int [] tdone, int [] ends){
        S127428=1;
    if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 804, column: 21
      pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 804, column: 36
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

  public void thread183363(int [] tdone, int [] ends){
        switch(S124573){
      case 0 : 
        active[90]=0;
        ends[90]=0;
        tdone[90]=1;
        break;
      
      case 1 : 
        switch(S124564){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 774, column: 16
              System.out.println("WP gripped");//sysj\conveyor_controller.sysj line: 775, column: 10
              S124564=1;
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 777, column: 11
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
            if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 776, column: 16
              System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 779, column: 10
              ends[90]=2;
              tdone[90]=1;
            }
            else {
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 777, column: 11
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

  public void thread183362(int [] tdone, int [] ends){
        switch(S124562){
      case 0 : 
        active[89]=0;
        ends[89]=0;
        tdone[89]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\conveyor_controller.sysj line: 770, column: 10
        currsigs.addElement(vacOn);
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
        break;
      
    }
  }

  public void thread183360(int [] tdone, int [] ends){
        S124573=1;
    S124564=0;
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread183359(int [] tdone, int [] ends){
        S124562=1;
    vacOn.setPresent();//sysj\conveyor_controller.sysj line: 770, column: 10
    currsigs.addElement(vacOn);
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread183358(int [] tdone, int [] ends){
        switch(S182424){
      case 0 : 
        active[88]=0;
        ends[88]=0;
        tdone[88]=1;
        break;
      
      case 1 : 
        switch(S182423){
          case 0 : 
            switch(S124455){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 734, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 734, column: 5
                  S124455=1;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  switch(S124450){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 734, column: 5
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 734, column: 5
                        S124450=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 734, column: 5
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 734, column: 5
                          ends[88]=2;
                          ;//sysj\conveyor_controller.sysj line: 734, column: 5
                          S182423=1;
                          S124516=0;
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
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 734, column: 5
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 734, column: 5
                        ends[88]=2;
                        ;//sysj\conveyor_controller.sysj line: 734, column: 5
                        S182423=1;
                        S124516=0;
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
                S124455=1;
                S124455=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 734, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 734, column: 5
                  S124455=1;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  S124450=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 734, column: 5
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 734, column: 5
                    S124450=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 734, column: 5
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 734, column: 5
                      ends[88]=2;
                      ;//sysj\conveyor_controller.sysj line: 734, column: 5
                      S182423=1;
                      S124516=0;
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
            switch(S124516){
              case 0 : 
                if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 736, column: 13
                  S124516=1;
                  S124478=0;
                  if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 737, column: 6
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 737, column: 6
                    S124478=1;
                    active[88]=1;
                    ends[88]=1;
                    tdone[88]=1;
                  }
                  else {
                    S124473=0;
                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 737, column: 6
                      lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 737, column: 6
                      S124473=1;
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 737, column: 6
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 737, column: 6
                        ends[88]=2;
                        ;//sysj\conveyor_controller.sysj line: 737, column: 6
                        S124516=2;
                        System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 739, column: 7
                        S124525=0;
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 741, column: 8
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
                switch(S124478){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 737, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 737, column: 6
                      S124478=1;
                      active[88]=1;
                      ends[88]=1;
                      tdone[88]=1;
                    }
                    else {
                      switch(S124473){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 737, column: 6
                            lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 737, column: 6
                            S124473=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 737, column: 6
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 737, column: 6
                              ends[88]=2;
                              ;//sysj\conveyor_controller.sysj line: 737, column: 6
                              S124516=2;
                              System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 739, column: 7
                              S124525=0;
                              armDest.setPresent();//sysj\conveyor_controller.sysj line: 741, column: 8
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
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 737, column: 6
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 737, column: 6
                            ends[88]=2;
                            ;//sysj\conveyor_controller.sysj line: 737, column: 6
                            S124516=2;
                            System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 739, column: 7
                            S124525=0;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 741, column: 8
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
                    S124478=1;
                    S124478=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 737, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 737, column: 6
                      S124478=1;
                      active[88]=1;
                      ends[88]=1;
                      tdone[88]=1;
                    }
                    else {
                      S124473=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 737, column: 6
                        lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 737, column: 6
                        S124473=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 737, column: 6
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 737, column: 6
                          ends[88]=2;
                          ;//sysj\conveyor_controller.sysj line: 737, column: 6
                          S124516=2;
                          System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 739, column: 7
                          S124525=0;
                          armDest.setPresent();//sysj\conveyor_controller.sysj line: 741, column: 8
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
                if(manualMode_87.getprestatus()){//sysj\conveyor_controller.sysj line: 738, column: 12
                  lidLoaderReady_o.setPreempted();
                  S124516=3;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  switch(S124525){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 740, column: 13
                        System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 743, column: 7
                        S124525=1;
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 741, column: 8
                        currsigs.addElement(armDest);
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 744, column: 13
                        System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 745, column: 7
                        S124525=2;
                        S124531=0;
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
                      switch(S124531){
                        case 0 : 
                          if(!empty.getprestatus()){//sysj\conveyor_controller.sysj line: 748, column: 14
                            S124531=1;
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
                          if(request.getprestatus()){//sysj\conveyor_controller.sysj line: 749, column: 14
                            System.out.println("New request");//sysj\conveyor_controller.sysj line: 750, column: 8
                            S124531=2;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 752, column: 9
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
                          if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 751, column: 14
                            System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 754, column: 8
                            S124531=3;
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 757, column: 9
                            currsigs.addElement(pusherExtend);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 752, column: 9
                            currsigs.addElement(armDest);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 3 : 
                          if(pusherExtended.getprestatus()){//sysj\conveyor_controller.sysj line: 756, column: 14
                            System.out.println("Pusher extended");//sysj\conveyor_controller.sysj line: 759, column: 8
                            S124531=4;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 757, column: 9
                            currsigs.addElement(pusherExtend);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 4 : 
                          if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 760, column: 14
                            System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 761, column: 8
                            S124531=5;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 764, column: 9
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
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 763, column: 14
                            System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 766, column: 8
                            S124531=6;
                            thread183359(tdone,ends);
                            thread183360(tdone,ends);
                            int biggest183361 = 0;
                            if(ends[89]>=biggest183361){
                              biggest183361=ends[89];
                            }
                            if(ends[90]>=biggest183361){
                              biggest183361=ends[90];
                            }
                            if(biggest183361 == 1){
                              active[88]=1;
                              ends[88]=1;
                              tdone[88]=1;
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 764, column: 9
                            currsigs.addElement(armSource);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 6 : 
                          thread183362(tdone,ends);
                          thread183363(tdone,ends);
                          int biggest183364 = 0;
                          if(ends[89]>=biggest183364){
                            biggest183364=ends[89];
                          }
                          if(ends[90]>=biggest183364){
                            biggest183364=ends[90];
                          }
                          if(biggest183364 == 1){
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          if(biggest183364 == 2){
                            ends[88]=2;
                            ;//sysj\conveyor_controller.sysj line: 768, column: 8
                            S124531=7;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          //FINXME code
                          if(biggest183364 == 0){
                            S124531=7;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 7 : 
                          if(!WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 784, column: 14
                            S124531=8;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 787, column: 9
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
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 786, column: 14
                            done_87.setPresent();//sysj\conveyor_controller.sysj line: 791, column: 8
                            currsigs.addElement(done_87);
                            S124531=9;
                            S124609=0;
                            if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 792, column: 8
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 8
                              S124609=1;
                              active[88]=1;
                              ends[88]=1;
                              tdone[88]=1;
                            }
                            else {
                              S124604=0;
                              if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 8
                                lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 792, column: 8
                                S124604=1;
                                if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 8
                                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 8
                                  ends[88]=2;
                                  ;//sysj\conveyor_controller.sysj line: 792, column: 8
                                  System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 794, column: 8
                                  S124531=10;
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
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 787, column: 9
                            currsigs.addElement(armSource);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 9 : 
                          switch(S124609){
                            case 0 : 
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 792, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 8
                                S124609=1;
                                active[88]=1;
                                ends[88]=1;
                                tdone[88]=1;
                              }
                              else {
                                switch(S124604){
                                  case 0 : 
                                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 8
                                      lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 792, column: 8
                                      S124604=1;
                                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 8
                                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 8
                                        ends[88]=2;
                                        ;//sysj\conveyor_controller.sysj line: 792, column: 8
                                        System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 794, column: 8
                                        S124531=10;
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
                                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 8
                                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 8
                                      ends[88]=2;
                                      ;//sysj\conveyor_controller.sysj line: 792, column: 8
                                      System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 794, column: 8
                                      S124531=10;
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
                              S124609=1;
                              S124609=0;
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 792, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 8
                                S124609=1;
                                active[88]=1;
                                ends[88]=1;
                                tdone[88]=1;
                              }
                              else {
                                S124604=0;
                                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 8
                                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 792, column: 8
                                  S124604=1;
                                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 8
                                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 8
                                    ends[88]=2;
                                    ;//sysj\conveyor_controller.sysj line: 792, column: 8
                                    System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 794, column: 8
                                    S124531=10;
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
                          S124531=10;
                          S124531=0;
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
                S124516=3;
                System.out.println("entering manual");//sysj\conveyor_controller.sysj line: 802, column: 6
                S124516=4;
                thread183365(tdone,ends);
                thread183366(tdone,ends);
                thread183367(tdone,ends);
                thread183368(tdone,ends);
                int biggest183369 = 0;
                if(ends[91]>=biggest183369){
                  biggest183369=ends[91];
                }
                if(ends[92]>=biggest183369){
                  biggest183369=ends[92];
                }
                if(ends[93]>=biggest183369){
                  biggest183369=ends[93];
                }
                if(ends[94]>=biggest183369){
                  biggest183369=ends[94];
                }
                if(biggest183369 == 1){
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                break;
              
              case 4 : 
                if(autoMode_87.getprestatus()){//sysj\conveyor_controller.sysj line: 803, column: 12
                  lidLoaderReady_o.setPreempted();
                  S124516=0;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  thread183370(tdone,ends);
                  thread183371(tdone,ends);
                  thread183372(tdone,ends);
                  thread183373(tdone,ends);
                  int biggest183374 = 0;
                  if(ends[91]>=biggest183374){
                    biggest183374=ends[91];
                  }
                  if(ends[92]>=biggest183374){
                    biggest183374=ends[92];
                  }
                  if(ends[93]>=biggest183374){
                    biggest183374=ends[93];
                  }
                  if(ends[94]>=biggest183374){
                    biggest183374=ends[94];
                  }
                  if(biggest183374 == 1){
                    active[88]=1;
                    ends[88]=1;
                    tdone[88]=1;
                  }
                  //FINXME code
                  if(biggest183374 == 0){
                    S124516=0;
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

  public void thread183355(int [] tdone, int [] ends){
        S182536=1;
    active[99]=1;
    ends[99]=1;
    tdone[99]=1;
  }

  public void thread183354(int [] tdone, int [] ends){
        S182533=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 846, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[98]=1;
    ends[98]=1;
    tdone[98]=1;
  }

  public void thread183353(int [] tdone, int [] ends){
        S182566=1;
    S182540=0;
    if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 843, column: 20
      thread183354(tdone,ends);
      thread183355(tdone,ends);
      int biggest183356 = 0;
      if(ends[98]>=biggest183356){
        biggest183356=ends[98];
      }
      if(ends[99]>=biggest183356){
        biggest183356=ends[99];
      }
      if(biggest183356 == 1){
        active[97]=1;
        ends[97]=1;
        tdone[97]=1;
      }
    }
    else {
      S182540=1;
      active[97]=1;
      ends[97]=1;
      tdone[97]=1;
    }
  }

  public void thread183352(int [] tdone, int [] ends){
        S182528=1;
    S182472=0;
    S182452=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 833, column: 6
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 833, column: 6
      S182452=1;
      active[96]=1;
      ends[96]=1;
      tdone[96]=1;
    }
    else {
      S182447=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 833, column: 6
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 833, column: 6
        S182447=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 833, column: 6
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 833, column: 6
          ends[96]=2;
          ;//sysj\conveyor_controller.sysj line: 833, column: 6
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 834, column: 9
            bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 835, column: 7
            currsigs.addElement(bottleAtPos3_87);
            S182472=1;
            active[96]=1;
            ends[96]=1;
            tdone[96]=1;
          }
          else {
            S182472=1;
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

  public void thread183351(int [] tdone, int [] ends){
        S182445=1;
    S182444=0;
    active[95]=1;
    ends[95]=1;
    tdone[95]=1;
  }

  public void thread183350(int [] tdone, int [] ends){
        S182424=1;
    S182423=0;
    S124455=0;
    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 734, column: 5
      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 734, column: 5
      S124455=1;
      active[88]=1;
      ends[88]=1;
      tdone[88]=1;
    }
    else {
      S124450=0;
      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 734, column: 5
        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 734, column: 5
        S124450=1;
        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 734, column: 5
          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 734, column: 5
          ends[88]=2;
          ;//sysj\conveyor_controller.sysj line: 734, column: 5
          S182423=1;
          S124516=0;
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
      switch(S182568){
        case 0 : 
          S182568=0;
          break RUN;
        
        case 1 : 
          S182568=2;
          S182568=2;
          manualMode_87.setClear();//sysj\conveyor_controller.sysj line: 732, column: 4
          autoMode_87.setClear();//sysj\conveyor_controller.sysj line: 732, column: 4
          bottleAtPos3_87.setClear();//sysj\conveyor_controller.sysj line: 732, column: 4
          done_87.setClear();//sysj\conveyor_controller.sysj line: 732, column: 4
          thread183350(tdone,ends);
          thread183351(tdone,ends);
          thread183352(tdone,ends);
          thread183353(tdone,ends);
          int biggest183357 = 0;
          if(ends[88]>=biggest183357){
            biggest183357=ends[88];
          }
          if(ends[95]>=biggest183357){
            biggest183357=ends[95];
          }
          if(ends[96]>=biggest183357){
            biggest183357=ends[96];
          }
          if(ends[97]>=biggest183357){
            biggest183357=ends[97];
          }
          if(biggest183357 == 1){
            active[87]=1;
            ends[87]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_87.setClear();//sysj\conveyor_controller.sysj line: 732, column: 4
          autoMode_87.setClear();//sysj\conveyor_controller.sysj line: 732, column: 4
          bottleAtPos3_87.setClear();//sysj\conveyor_controller.sysj line: 732, column: 4
          done_87.setClear();//sysj\conveyor_controller.sysj line: 732, column: 4
          thread183358(tdone,ends);
          thread183375(tdone,ends);
          thread183376(tdone,ends);
          thread183377(tdone,ends);
          int biggest183384 = 0;
          if(ends[88]>=biggest183384){
            biggest183384=ends[88];
          }
          if(ends[95]>=biggest183384){
            biggest183384=ends[95];
          }
          if(ends[96]>=biggest183384){
            biggest183384=ends[96];
          }
          if(ends[97]>=biggest183384){
            biggest183384=ends[97];
          }
          if(biggest183384 == 1){
            active[87]=1;
            ends[87]=1;
            break RUN;
          }
          //FINXME code
          if(biggest183384 == 0){
            S182568=0;
            active[87]=0;
            ends[87]=0;
            S182568=0;
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
