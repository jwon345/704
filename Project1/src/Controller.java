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
  private long __start_thread_93;//sysj\conveyor_controller.sysj line: 809, column: 32
  private int S212368 = 1;
  private int S212224 = 1;
  private int S212223 = 1;
  private int S154255 = 1;
  private int S154250 = 1;
  private int S154316 = 1;
  private int S154278 = 1;
  private int S154273 = 1;
  private int S154325 = 1;
  private int S154331 = 1;
  private int S154362 = 1;
  private int S154373 = 1;
  private int S154364 = 1;
  private int S154409 = 1;
  private int S154404 = 1;
  private int S157228 = 1;
  private int S157236 = 1;
  private int S157547 = 1;
  private int S157339 = 1;
  private int S157281 = 1;
  private int S157243 = 1;
  private int S157238 = 1;
  private int S157555 = 1;
  private int S212245 = 1;
  private int S212244 = 1;
  private int S212328 = 1;
  private int S212272 = 1;
  private int S212252 = 1;
  private int S212247 = 1;
  private int S212366 = 1;
  private int S212340 = 1;
  private int S212333 = 1;
  private int S212336 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread213215(int [] tdone, int [] ends){
        S212336=1;
    active[99]=1;
    ends[99]=1;
    tdone[99]=1;
  }

  public void thread213214(int [] tdone, int [] ends){
        S212333=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 847, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[98]=1;
    ends[98]=1;
    tdone[98]=1;
  }

  public void thread213212(int [] tdone, int [] ends){
        switch(S212336){
      case 0 : 
        active[99]=0;
        ends[99]=0;
        tdone[99]=1;
        break;
      
      case 1 : 
        if(done_87.getprestatus()){//sysj\conveyor_controller.sysj line: 851, column: 28
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

  public void thread213211(int [] tdone, int [] ends){
        switch(S212333){
      case 0 : 
        active[98]=0;
        ends[98]=0;
        tdone[98]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 847, column: 22
        currsigs.addElement(bottleAtPos3E);
        active[98]=1;
        ends[98]=1;
        tdone[98]=1;
        break;
      
    }
  }

  public void thread213210(int [] tdone, int [] ends){
        switch(S212366){
      case 0 : 
        active[97]=0;
        ends[97]=0;
        tdone[97]=1;
        break;
      
      case 1 : 
        switch(S212340){
          case 0 : 
            thread213211(tdone,ends);
            thread213212(tdone,ends);
            int biggest213213 = 0;
            if(ends[98]>=biggest213213){
              biggest213213=ends[98];
            }
            if(ends[99]>=biggest213213){
              biggest213213=ends[99];
            }
            if(biggest213213 == 1){
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            if(biggest213213 == 2){
              ends[97]=2;
              ;//sysj\conveyor_controller.sysj line: 845, column: 7
              S212340=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            //FINXME code
            if(biggest213213 == 0){
              ;//sysj\conveyor_controller.sysj line: 853, column: 19
              S212340=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            break;
          
          case 1 : 
            S212340=1;
            S212340=0;
            if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 844, column: 20
              thread213214(tdone,ends);
              thread213215(tdone,ends);
              int biggest213216 = 0;
              if(ends[98]>=biggest213216){
                biggest213216=ends[98];
              }
              if(ends[99]>=biggest213216){
                biggest213216=ends[99];
              }
              if(biggest213216 == 1){
                active[97]=1;
                ends[97]=1;
                tdone[97]=1;
              }
            }
            else {
              S212340=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread213209(int [] tdone, int [] ends){
        switch(S212328){
      case 0 : 
        active[96]=0;
        ends[96]=0;
        tdone[96]=1;
        break;
      
      case 1 : 
        switch(S212272){
          case 0 : 
            switch(S212252){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 834, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 834, column: 6
                  S212252=1;
                  active[96]=1;
                  ends[96]=1;
                  tdone[96]=1;
                }
                else {
                  switch(S212247){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 834, column: 6
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 834, column: 6
                        S212247=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 834, column: 6
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 834, column: 6
                          ends[96]=2;
                          ;//sysj\conveyor_controller.sysj line: 834, column: 6
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 835, column: 9
                            bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 836, column: 7
                            currsigs.addElement(bottleAtPos3_87);
                            S212272=1;
                            active[96]=1;
                            ends[96]=1;
                            tdone[96]=1;
                          }
                          else {
                            S212272=1;
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
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 834, column: 6
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 834, column: 6
                        ends[96]=2;
                        ;//sysj\conveyor_controller.sysj line: 834, column: 6
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 835, column: 9
                          bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 836, column: 7
                          currsigs.addElement(bottleAtPos3_87);
                          S212272=1;
                          active[96]=1;
                          ends[96]=1;
                          tdone[96]=1;
                        }
                        else {
                          S212272=1;
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
                S212252=1;
                S212252=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 834, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 834, column: 6
                  S212252=1;
                  active[96]=1;
                  ends[96]=1;
                  tdone[96]=1;
                }
                else {
                  S212247=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 834, column: 6
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 834, column: 6
                    S212247=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 834, column: 6
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 834, column: 6
                      ends[96]=2;
                      ;//sysj\conveyor_controller.sysj line: 834, column: 6
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 835, column: 9
                        bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 836, column: 7
                        currsigs.addElement(bottleAtPos3_87);
                        S212272=1;
                        active[96]=1;
                        ends[96]=1;
                        tdone[96]=1;
                      }
                      else {
                        S212272=1;
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
            S212272=1;
            S212272=0;
            S212252=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 834, column: 6
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 834, column: 6
              S212252=1;
              active[96]=1;
              ends[96]=1;
              tdone[96]=1;
            }
            else {
              S212247=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 834, column: 6
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 834, column: 6
                S212247=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 834, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 834, column: 6
                  ends[96]=2;
                  ;//sysj\conveyor_controller.sysj line: 834, column: 6
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 835, column: 9
                    bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 836, column: 7
                    currsigs.addElement(bottleAtPos3_87);
                    S212272=1;
                    active[96]=1;
                    ends[96]=1;
                    tdone[96]=1;
                  }
                  else {
                    S212272=1;
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

  public void thread213208(int [] tdone, int [] ends){
        switch(S212245){
      case 0 : 
        active[95]=0;
        ends[95]=0;
        tdone[95]=1;
        break;
      
      case 1 : 
        switch(S212244){
          case 0 : 
            if(mode.getprestatus()){//sysj\conveyor_controller.sysj line: 818, column: 11
              S212244=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 820, column: 9
                autoMode_87.setPresent();//sysj\conveyor_controller.sysj line: 821, column: 7
                currsigs.addElement(autoMode_87);
                active[95]=1;
                ends[95]=1;
                tdone[95]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 823, column: 14
                  manualMode_87.setPresent();//sysj\conveyor_controller.sysj line: 824, column: 7
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
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 820, column: 9
              autoMode_87.setPresent();//sysj\conveyor_controller.sysj line: 821, column: 7
              currsigs.addElement(autoMode_87);
              active[95]=1;
              ends[95]=1;
              tdone[95]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 823, column: 14
                manualMode_87.setPresent();//sysj\conveyor_controller.sysj line: 824, column: 7
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

  public void thread213206(int [] tdone, int [] ends){
        switch(S157555){
      case 0 : 
        active[94]=0;
        ends[94]=0;
        tdone[94]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 811, column: 21
          armDest.setPresent();//sysj\conveyor_controller.sysj line: 811, column: 31
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

  public void thread213205(int [] tdone, int [] ends){
        switch(S157547){
      case 0 : 
        active[93]=0;
        ends[93]=0;
        tdone[93]=1;
        break;
      
      case 1 : 
        switch(S157339){
          case 0 : 
            switch(S157281){
              case 0 : 
                switch(S157243){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 809, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 809, column: 48
                      S157243=1;
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                    else {
                      switch(S157238){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 809, column: 48
                            lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 809, column: 48
                            S157238=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 809, column: 48
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 809, column: 48
                              ends[93]=2;
                              ;//sysj\conveyor_controller.sysj line: 809, column: 48
                              S157281=1;
                              __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 809, column: 32
                              if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 809, column: 32
                                ends[93]=2;
                                ;//sysj\conveyor_controller.sysj line: 809, column: 32
                                done_87.setPresent();//sysj\conveyor_controller.sysj line: 809, column: 100
                                currsigs.addElement(done_87);
                                S157339=1;
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
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 809, column: 48
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 809, column: 48
                            ends[93]=2;
                            ;//sysj\conveyor_controller.sysj line: 809, column: 48
                            S157281=1;
                            __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 809, column: 32
                            if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 809, column: 32
                              ends[93]=2;
                              ;//sysj\conveyor_controller.sysj line: 809, column: 32
                              done_87.setPresent();//sysj\conveyor_controller.sysj line: 809, column: 100
                              currsigs.addElement(done_87);
                              S157339=1;
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
                    S157243=1;
                    S157243=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 809, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 809, column: 48
                      S157243=1;
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                    else {
                      S157238=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 809, column: 48
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 809, column: 48
                        S157238=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 809, column: 48
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 809, column: 48
                          ends[93]=2;
                          ;//sysj\conveyor_controller.sysj line: 809, column: 48
                          S157281=1;
                          __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 809, column: 32
                          if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 809, column: 32
                            ends[93]=2;
                            ;//sysj\conveyor_controller.sysj line: 809, column: 32
                            done_87.setPresent();//sysj\conveyor_controller.sysj line: 809, column: 100
                            currsigs.addElement(done_87);
                            S157339=1;
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
                if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 809, column: 32
                  ends[93]=2;
                  ;//sysj\conveyor_controller.sysj line: 809, column: 32
                  done_87.setPresent();//sysj\conveyor_controller.sysj line: 809, column: 100
                  currsigs.addElement(done_87);
                  S157339=1;
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
            S157339=1;
            S157339=0;
            if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 809, column: 21
              armSource.setPresent();//sysj\conveyor_controller.sysj line: 809, column: 33
              currsigs.addElement(armSource);
              S157281=0;
              S157243=0;
              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 809, column: 48
                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 809, column: 48
                S157243=1;
                active[93]=1;
                ends[93]=1;
                tdone[93]=1;
              }
              else {
                S157238=0;
                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 809, column: 48
                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 809, column: 48
                  S157238=1;
                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 809, column: 48
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 809, column: 48
                    ends[93]=2;
                    ;//sysj\conveyor_controller.sysj line: 809, column: 48
                    S157281=1;
                    __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 809, column: 32
                    if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 809, column: 32
                      ends[93]=2;
                      ;//sysj\conveyor_controller.sysj line: 809, column: 32
                      done_87.setPresent();//sysj\conveyor_controller.sysj line: 809, column: 100
                      currsigs.addElement(done_87);
                      S157339=1;
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
              S157339=1;
              active[93]=1;
              ends[93]=1;
              tdone[93]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread213204(int [] tdone, int [] ends){
        switch(S157236){
      case 0 : 
        active[92]=0;
        ends[92]=0;
        tdone[92]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 807, column: 21
          vacOn.setPresent();//sysj\conveyor_controller.sysj line: 807, column: 29
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

  public void thread213203(int [] tdone, int [] ends){
        switch(S157228){
      case 0 : 
        active[91]=0;
        ends[91]=0;
        tdone[91]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 805, column: 21
          pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 805, column: 36
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

  public void thread213201(int [] tdone, int [] ends){
        S157555=1;
    if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 811, column: 21
      armDest.setPresent();//sysj\conveyor_controller.sysj line: 811, column: 31
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

  public void thread213200(int [] tdone, int [] ends){
        S157547=1;
    S157339=0;
    if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 809, column: 21
      armSource.setPresent();//sysj\conveyor_controller.sysj line: 809, column: 33
      currsigs.addElement(armSource);
      S157281=0;
      S157243=0;
      if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 809, column: 48
        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 809, column: 48
        S157243=1;
        active[93]=1;
        ends[93]=1;
        tdone[93]=1;
      }
      else {
        S157238=0;
        if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 809, column: 48
          lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 809, column: 48
          S157238=1;
          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 809, column: 48
            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 809, column: 48
            ends[93]=2;
            ;//sysj\conveyor_controller.sysj line: 809, column: 48
            S157281=1;
            __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 809, column: 32
            if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 809, column: 32
              ends[93]=2;
              ;//sysj\conveyor_controller.sysj line: 809, column: 32
              done_87.setPresent();//sysj\conveyor_controller.sysj line: 809, column: 100
              currsigs.addElement(done_87);
              S157339=1;
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
      S157339=1;
      active[93]=1;
      ends[93]=1;
      tdone[93]=1;
    }
  }

  public void thread213199(int [] tdone, int [] ends){
        S157236=1;
    if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 807, column: 21
      vacOn.setPresent();//sysj\conveyor_controller.sysj line: 807, column: 29
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

  public void thread213198(int [] tdone, int [] ends){
        S157228=1;
    if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 805, column: 21
      pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 805, column: 36
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

  public void thread213196(int [] tdone, int [] ends){
        switch(S154373){
      case 0 : 
        active[90]=0;
        ends[90]=0;
        tdone[90]=1;
        break;
      
      case 1 : 
        switch(S154364){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 775, column: 16
              System.out.println("WP gripped");//sysj\conveyor_controller.sysj line: 776, column: 10
              S154364=1;
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 778, column: 11
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
            if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 777, column: 16
              System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 780, column: 10
              ends[90]=2;
              tdone[90]=1;
            }
            else {
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 778, column: 11
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

  public void thread213195(int [] tdone, int [] ends){
        switch(S154362){
      case 0 : 
        active[89]=0;
        ends[89]=0;
        tdone[89]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\conveyor_controller.sysj line: 771, column: 10
        currsigs.addElement(vacOn);
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
        break;
      
    }
  }

  public void thread213193(int [] tdone, int [] ends){
        S154373=1;
    S154364=0;
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread213192(int [] tdone, int [] ends){
        S154362=1;
    vacOn.setPresent();//sysj\conveyor_controller.sysj line: 771, column: 10
    currsigs.addElement(vacOn);
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread213191(int [] tdone, int [] ends){
        switch(S212224){
      case 0 : 
        active[88]=0;
        ends[88]=0;
        tdone[88]=1;
        break;
      
      case 1 : 
        switch(S212223){
          case 0 : 
            switch(S154255){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 735, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 735, column: 5
                  S154255=1;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  switch(S154250){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 735, column: 5
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 735, column: 5
                        S154250=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 735, column: 5
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 735, column: 5
                          ends[88]=2;
                          ;//sysj\conveyor_controller.sysj line: 735, column: 5
                          S212223=1;
                          S154316=0;
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
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 735, column: 5
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 735, column: 5
                        ends[88]=2;
                        ;//sysj\conveyor_controller.sysj line: 735, column: 5
                        S212223=1;
                        S154316=0;
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
                S154255=1;
                S154255=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 735, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 735, column: 5
                  S154255=1;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  S154250=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 735, column: 5
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 735, column: 5
                    S154250=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 735, column: 5
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 735, column: 5
                      ends[88]=2;
                      ;//sysj\conveyor_controller.sysj line: 735, column: 5
                      S212223=1;
                      S154316=0;
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
            switch(S154316){
              case 0 : 
                if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 737, column: 13
                  S154316=1;
                  S154278=0;
                  if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 738, column: 6
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 738, column: 6
                    S154278=1;
                    active[88]=1;
                    ends[88]=1;
                    tdone[88]=1;
                  }
                  else {
                    S154273=0;
                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 738, column: 6
                      lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 738, column: 6
                      S154273=1;
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 738, column: 6
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 738, column: 6
                        ends[88]=2;
                        ;//sysj\conveyor_controller.sysj line: 738, column: 6
                        S154316=2;
                        System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 740, column: 7
                        S154325=0;
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 742, column: 8
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
                switch(S154278){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 738, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 738, column: 6
                      S154278=1;
                      active[88]=1;
                      ends[88]=1;
                      tdone[88]=1;
                    }
                    else {
                      switch(S154273){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 738, column: 6
                            lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 738, column: 6
                            S154273=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 738, column: 6
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 738, column: 6
                              ends[88]=2;
                              ;//sysj\conveyor_controller.sysj line: 738, column: 6
                              S154316=2;
                              System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 740, column: 7
                              S154325=0;
                              armDest.setPresent();//sysj\conveyor_controller.sysj line: 742, column: 8
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
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 738, column: 6
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 738, column: 6
                            ends[88]=2;
                            ;//sysj\conveyor_controller.sysj line: 738, column: 6
                            S154316=2;
                            System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 740, column: 7
                            S154325=0;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 742, column: 8
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
                    S154278=1;
                    S154278=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 738, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 738, column: 6
                      S154278=1;
                      active[88]=1;
                      ends[88]=1;
                      tdone[88]=1;
                    }
                    else {
                      S154273=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 738, column: 6
                        lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 738, column: 6
                        S154273=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 738, column: 6
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 738, column: 6
                          ends[88]=2;
                          ;//sysj\conveyor_controller.sysj line: 738, column: 6
                          S154316=2;
                          System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 740, column: 7
                          S154325=0;
                          armDest.setPresent();//sysj\conveyor_controller.sysj line: 742, column: 8
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
                if(manualMode_87.getprestatus()){//sysj\conveyor_controller.sysj line: 739, column: 12
                  lidLoaderReady_o.setPreempted();
                  S154316=3;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  switch(S154325){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 741, column: 13
                        System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 744, column: 7
                        S154325=1;
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 742, column: 8
                        currsigs.addElement(armDest);
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 745, column: 13
                        System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 746, column: 7
                        S154325=2;
                        S154331=0;
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
                      switch(S154331){
                        case 0 : 
                          if(!empty.getprestatus()){//sysj\conveyor_controller.sysj line: 749, column: 14
                            S154331=1;
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
                          if(request.getprestatus()){//sysj\conveyor_controller.sysj line: 750, column: 14
                            System.out.println("New request");//sysj\conveyor_controller.sysj line: 751, column: 8
                            S154331=2;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 753, column: 9
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
                          if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 752, column: 14
                            System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 755, column: 8
                            S154331=3;
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 758, column: 9
                            currsigs.addElement(pusherExtend);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 753, column: 9
                            currsigs.addElement(armDest);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 3 : 
                          if(pusherExtended.getprestatus()){//sysj\conveyor_controller.sysj line: 757, column: 14
                            System.out.println("Pusher extended");//sysj\conveyor_controller.sysj line: 760, column: 8
                            S154331=4;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 758, column: 9
                            currsigs.addElement(pusherExtend);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 4 : 
                          if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 761, column: 14
                            System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 762, column: 8
                            S154331=5;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 765, column: 9
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
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 764, column: 14
                            System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 767, column: 8
                            S154331=6;
                            thread213192(tdone,ends);
                            thread213193(tdone,ends);
                            int biggest213194 = 0;
                            if(ends[89]>=biggest213194){
                              biggest213194=ends[89];
                            }
                            if(ends[90]>=biggest213194){
                              biggest213194=ends[90];
                            }
                            if(biggest213194 == 1){
                              active[88]=1;
                              ends[88]=1;
                              tdone[88]=1;
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 765, column: 9
                            currsigs.addElement(armSource);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 6 : 
                          thread213195(tdone,ends);
                          thread213196(tdone,ends);
                          int biggest213197 = 0;
                          if(ends[89]>=biggest213197){
                            biggest213197=ends[89];
                          }
                          if(ends[90]>=biggest213197){
                            biggest213197=ends[90];
                          }
                          if(biggest213197 == 1){
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          if(biggest213197 == 2){
                            ends[88]=2;
                            ;//sysj\conveyor_controller.sysj line: 769, column: 8
                            S154331=7;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          //FINXME code
                          if(biggest213197 == 0){
                            S154331=7;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 7 : 
                          if(!WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 785, column: 14
                            S154331=8;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 788, column: 9
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
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 787, column: 14
                            done_87.setPresent();//sysj\conveyor_controller.sysj line: 792, column: 8
                            currsigs.addElement(done_87);
                            S154331=9;
                            S154409=0;
                            if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 793, column: 8
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 793, column: 8
                              S154409=1;
                              active[88]=1;
                              ends[88]=1;
                              tdone[88]=1;
                            }
                            else {
                              S154404=0;
                              if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 793, column: 8
                                lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 793, column: 8
                                S154404=1;
                                if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 793, column: 8
                                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 793, column: 8
                                  ends[88]=2;
                                  ;//sysj\conveyor_controller.sysj line: 793, column: 8
                                  System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 795, column: 8
                                  S154331=10;
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
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 788, column: 9
                            currsigs.addElement(armSource);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 9 : 
                          switch(S154409){
                            case 0 : 
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 793, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 793, column: 8
                                S154409=1;
                                active[88]=1;
                                ends[88]=1;
                                tdone[88]=1;
                              }
                              else {
                                switch(S154404){
                                  case 0 : 
                                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 793, column: 8
                                      lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 793, column: 8
                                      S154404=1;
                                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 793, column: 8
                                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 793, column: 8
                                        ends[88]=2;
                                        ;//sysj\conveyor_controller.sysj line: 793, column: 8
                                        System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 795, column: 8
                                        S154331=10;
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
                                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 793, column: 8
                                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 793, column: 8
                                      ends[88]=2;
                                      ;//sysj\conveyor_controller.sysj line: 793, column: 8
                                      System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 795, column: 8
                                      S154331=10;
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
                              S154409=1;
                              S154409=0;
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 793, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 793, column: 8
                                S154409=1;
                                active[88]=1;
                                ends[88]=1;
                                tdone[88]=1;
                              }
                              else {
                                S154404=0;
                                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 793, column: 8
                                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 793, column: 8
                                  S154404=1;
                                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 793, column: 8
                                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 793, column: 8
                                    ends[88]=2;
                                    ;//sysj\conveyor_controller.sysj line: 793, column: 8
                                    System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 795, column: 8
                                    S154331=10;
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
                          S154331=10;
                          S154331=0;
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
                S154316=3;
                System.out.println("entering manual");//sysj\conveyor_controller.sysj line: 803, column: 6
                S154316=4;
                thread213198(tdone,ends);
                thread213199(tdone,ends);
                thread213200(tdone,ends);
                thread213201(tdone,ends);
                int biggest213202 = 0;
                if(ends[91]>=biggest213202){
                  biggest213202=ends[91];
                }
                if(ends[92]>=biggest213202){
                  biggest213202=ends[92];
                }
                if(ends[93]>=biggest213202){
                  biggest213202=ends[93];
                }
                if(ends[94]>=biggest213202){
                  biggest213202=ends[94];
                }
                if(biggest213202 == 1){
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                break;
              
              case 4 : 
                if(autoMode_87.getprestatus()){//sysj\conveyor_controller.sysj line: 804, column: 12
                  lidLoaderReady_o.setPreempted();
                  S154316=0;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  thread213203(tdone,ends);
                  thread213204(tdone,ends);
                  thread213205(tdone,ends);
                  thread213206(tdone,ends);
                  int biggest213207 = 0;
                  if(ends[91]>=biggest213207){
                    biggest213207=ends[91];
                  }
                  if(ends[92]>=biggest213207){
                    biggest213207=ends[92];
                  }
                  if(ends[93]>=biggest213207){
                    biggest213207=ends[93];
                  }
                  if(ends[94]>=biggest213207){
                    biggest213207=ends[94];
                  }
                  if(biggest213207 == 1){
                    active[88]=1;
                    ends[88]=1;
                    tdone[88]=1;
                  }
                  //FINXME code
                  if(biggest213207 == 0){
                    S154316=0;
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

  public void thread213188(int [] tdone, int [] ends){
        S212336=1;
    active[99]=1;
    ends[99]=1;
    tdone[99]=1;
  }

  public void thread213187(int [] tdone, int [] ends){
        S212333=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 847, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[98]=1;
    ends[98]=1;
    tdone[98]=1;
  }

  public void thread213186(int [] tdone, int [] ends){
        S212366=1;
    S212340=0;
    if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 844, column: 20
      thread213187(tdone,ends);
      thread213188(tdone,ends);
      int biggest213189 = 0;
      if(ends[98]>=biggest213189){
        biggest213189=ends[98];
      }
      if(ends[99]>=biggest213189){
        biggest213189=ends[99];
      }
      if(biggest213189 == 1){
        active[97]=1;
        ends[97]=1;
        tdone[97]=1;
      }
    }
    else {
      S212340=1;
      active[97]=1;
      ends[97]=1;
      tdone[97]=1;
    }
  }

  public void thread213185(int [] tdone, int [] ends){
        S212328=1;
    S212272=0;
    S212252=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 834, column: 6
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 834, column: 6
      S212252=1;
      active[96]=1;
      ends[96]=1;
      tdone[96]=1;
    }
    else {
      S212247=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 834, column: 6
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 834, column: 6
        S212247=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 834, column: 6
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 834, column: 6
          ends[96]=2;
          ;//sysj\conveyor_controller.sysj line: 834, column: 6
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 835, column: 9
            bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 836, column: 7
            currsigs.addElement(bottleAtPos3_87);
            S212272=1;
            active[96]=1;
            ends[96]=1;
            tdone[96]=1;
          }
          else {
            S212272=1;
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

  public void thread213184(int [] tdone, int [] ends){
        S212245=1;
    S212244=0;
    active[95]=1;
    ends[95]=1;
    tdone[95]=1;
  }

  public void thread213183(int [] tdone, int [] ends){
        S212224=1;
    S212223=0;
    S154255=0;
    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 735, column: 5
      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 735, column: 5
      S154255=1;
      active[88]=1;
      ends[88]=1;
      tdone[88]=1;
    }
    else {
      S154250=0;
      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 735, column: 5
        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 735, column: 5
        S154250=1;
        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 735, column: 5
          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 735, column: 5
          ends[88]=2;
          ;//sysj\conveyor_controller.sysj line: 735, column: 5
          S212223=1;
          S154316=0;
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
      switch(S212368){
        case 0 : 
          S212368=0;
          break RUN;
        
        case 1 : 
          S212368=2;
          S212368=2;
          manualMode_87.setClear();//sysj\conveyor_controller.sysj line: 733, column: 4
          autoMode_87.setClear();//sysj\conveyor_controller.sysj line: 733, column: 4
          bottleAtPos3_87.setClear();//sysj\conveyor_controller.sysj line: 733, column: 4
          done_87.setClear();//sysj\conveyor_controller.sysj line: 733, column: 4
          thread213183(tdone,ends);
          thread213184(tdone,ends);
          thread213185(tdone,ends);
          thread213186(tdone,ends);
          int biggest213190 = 0;
          if(ends[88]>=biggest213190){
            biggest213190=ends[88];
          }
          if(ends[95]>=biggest213190){
            biggest213190=ends[95];
          }
          if(ends[96]>=biggest213190){
            biggest213190=ends[96];
          }
          if(ends[97]>=biggest213190){
            biggest213190=ends[97];
          }
          if(biggest213190 == 1){
            active[87]=1;
            ends[87]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_87.setClear();//sysj\conveyor_controller.sysj line: 733, column: 4
          autoMode_87.setClear();//sysj\conveyor_controller.sysj line: 733, column: 4
          bottleAtPos3_87.setClear();//sysj\conveyor_controller.sysj line: 733, column: 4
          done_87.setClear();//sysj\conveyor_controller.sysj line: 733, column: 4
          thread213191(tdone,ends);
          thread213208(tdone,ends);
          thread213209(tdone,ends);
          thread213210(tdone,ends);
          int biggest213217 = 0;
          if(ends[88]>=biggest213217){
            biggest213217=ends[88];
          }
          if(ends[95]>=biggest213217){
            biggest213217=ends[95];
          }
          if(ends[96]>=biggest213217){
            biggest213217=ends[96];
          }
          if(ends[97]>=biggest213217){
            biggest213217=ends[97];
          }
          if(biggest213217 == 1){
            active[87]=1;
            ends[87]=1;
            break RUN;
          }
          //FINXME code
          if(biggest213217 == 0){
            S212368=0;
            active[87]=0;
            ends[87]=0;
            S212368=0;
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
