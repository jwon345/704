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
  private long __start_thread_93;//sysj\conveyor_controller.sysj line: 792, column: 32
  private int S212208 = 1;
  private int S212064 = 1;
  private int S212063 = 1;
  private int S154095 = 1;
  private int S154090 = 1;
  private int S154156 = 1;
  private int S154118 = 1;
  private int S154113 = 1;
  private int S154165 = 1;
  private int S154171 = 1;
  private int S154202 = 1;
  private int S154213 = 1;
  private int S154204 = 1;
  private int S154249 = 1;
  private int S154244 = 1;
  private int S157068 = 1;
  private int S157076 = 1;
  private int S157387 = 1;
  private int S157179 = 1;
  private int S157121 = 1;
  private int S157083 = 1;
  private int S157078 = 1;
  private int S157395 = 1;
  private int S212085 = 1;
  private int S212084 = 1;
  private int S212168 = 1;
  private int S212112 = 1;
  private int S212092 = 1;
  private int S212087 = 1;
  private int S212206 = 1;
  private int S212180 = 1;
  private int S212173 = 1;
  private int S212176 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread213055(int [] tdone, int [] ends){
        S212176=1;
    active[99]=1;
    ends[99]=1;
    tdone[99]=1;
  }

  public void thread213054(int [] tdone, int [] ends){
        S212173=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 830, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[98]=1;
    ends[98]=1;
    tdone[98]=1;
  }

  public void thread213052(int [] tdone, int [] ends){
        switch(S212176){
      case 0 : 
        active[99]=0;
        ends[99]=0;
        tdone[99]=1;
        break;
      
      case 1 : 
        if(done_87.getprestatus()){//sysj\conveyor_controller.sysj line: 834, column: 28
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

  public void thread213051(int [] tdone, int [] ends){
        switch(S212173){
      case 0 : 
        active[98]=0;
        ends[98]=0;
        tdone[98]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 830, column: 22
        currsigs.addElement(bottleAtPos3E);
        active[98]=1;
        ends[98]=1;
        tdone[98]=1;
        break;
      
    }
  }

  public void thread213050(int [] tdone, int [] ends){
        switch(S212206){
      case 0 : 
        active[97]=0;
        ends[97]=0;
        tdone[97]=1;
        break;
      
      case 1 : 
        switch(S212180){
          case 0 : 
            thread213051(tdone,ends);
            thread213052(tdone,ends);
            int biggest213053 = 0;
            if(ends[98]>=biggest213053){
              biggest213053=ends[98];
            }
            if(ends[99]>=biggest213053){
              biggest213053=ends[99];
            }
            if(biggest213053 == 1){
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            if(biggest213053 == 2){
              ends[97]=2;
              ;//sysj\conveyor_controller.sysj line: 828, column: 7
              S212180=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            //FINXME code
            if(biggest213053 == 0){
              ;//sysj\conveyor_controller.sysj line: 836, column: 19
              S212180=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            break;
          
          case 1 : 
            S212180=1;
            S212180=0;
            if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 827, column: 20
              thread213054(tdone,ends);
              thread213055(tdone,ends);
              int biggest213056 = 0;
              if(ends[98]>=biggest213056){
                biggest213056=ends[98];
              }
              if(ends[99]>=biggest213056){
                biggest213056=ends[99];
              }
              if(biggest213056 == 1){
                active[97]=1;
                ends[97]=1;
                tdone[97]=1;
              }
            }
            else {
              S212180=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread213049(int [] tdone, int [] ends){
        switch(S212168){
      case 0 : 
        active[96]=0;
        ends[96]=0;
        tdone[96]=1;
        break;
      
      case 1 : 
        switch(S212112){
          case 0 : 
            switch(S212092){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 817, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 817, column: 6
                  S212092=1;
                  active[96]=1;
                  ends[96]=1;
                  tdone[96]=1;
                }
                else {
                  switch(S212087){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 817, column: 6
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 817, column: 6
                        S212087=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 817, column: 6
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 817, column: 6
                          ends[96]=2;
                          ;//sysj\conveyor_controller.sysj line: 817, column: 6
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 818, column: 9
                            bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 819, column: 7
                            currsigs.addElement(bottleAtPos3_87);
                            S212112=1;
                            active[96]=1;
                            ends[96]=1;
                            tdone[96]=1;
                          }
                          else {
                            S212112=1;
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
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 817, column: 6
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 817, column: 6
                        ends[96]=2;
                        ;//sysj\conveyor_controller.sysj line: 817, column: 6
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 818, column: 9
                          bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 819, column: 7
                          currsigs.addElement(bottleAtPos3_87);
                          S212112=1;
                          active[96]=1;
                          ends[96]=1;
                          tdone[96]=1;
                        }
                        else {
                          S212112=1;
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
                S212092=1;
                S212092=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 817, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 817, column: 6
                  S212092=1;
                  active[96]=1;
                  ends[96]=1;
                  tdone[96]=1;
                }
                else {
                  S212087=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 817, column: 6
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 817, column: 6
                    S212087=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 817, column: 6
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 817, column: 6
                      ends[96]=2;
                      ;//sysj\conveyor_controller.sysj line: 817, column: 6
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 818, column: 9
                        bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 819, column: 7
                        currsigs.addElement(bottleAtPos3_87);
                        S212112=1;
                        active[96]=1;
                        ends[96]=1;
                        tdone[96]=1;
                      }
                      else {
                        S212112=1;
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
            S212112=1;
            S212112=0;
            S212092=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 817, column: 6
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 817, column: 6
              S212092=1;
              active[96]=1;
              ends[96]=1;
              tdone[96]=1;
            }
            else {
              S212087=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 817, column: 6
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 817, column: 6
                S212087=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 817, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 817, column: 6
                  ends[96]=2;
                  ;//sysj\conveyor_controller.sysj line: 817, column: 6
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 818, column: 9
                    bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 819, column: 7
                    currsigs.addElement(bottleAtPos3_87);
                    S212112=1;
                    active[96]=1;
                    ends[96]=1;
                    tdone[96]=1;
                  }
                  else {
                    S212112=1;
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

  public void thread213048(int [] tdone, int [] ends){
        switch(S212085){
      case 0 : 
        active[95]=0;
        ends[95]=0;
        tdone[95]=1;
        break;
      
      case 1 : 
        switch(S212084){
          case 0 : 
            if(mode.getprestatus()){//sysj\conveyor_controller.sysj line: 801, column: 11
              S212084=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 803, column: 9
                autoMode_87.setPresent();//sysj\conveyor_controller.sysj line: 804, column: 7
                currsigs.addElement(autoMode_87);
                active[95]=1;
                ends[95]=1;
                tdone[95]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 806, column: 14
                  manualMode_87.setPresent();//sysj\conveyor_controller.sysj line: 807, column: 7
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
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 803, column: 9
              autoMode_87.setPresent();//sysj\conveyor_controller.sysj line: 804, column: 7
              currsigs.addElement(autoMode_87);
              active[95]=1;
              ends[95]=1;
              tdone[95]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 806, column: 14
                manualMode_87.setPresent();//sysj\conveyor_controller.sysj line: 807, column: 7
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

  public void thread213046(int [] tdone, int [] ends){
        switch(S157395){
      case 0 : 
        active[94]=0;
        ends[94]=0;
        tdone[94]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 794, column: 21
          armDest.setPresent();//sysj\conveyor_controller.sysj line: 794, column: 31
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

  public void thread213045(int [] tdone, int [] ends){
        switch(S157387){
      case 0 : 
        active[93]=0;
        ends[93]=0;
        tdone[93]=1;
        break;
      
      case 1 : 
        switch(S157179){
          case 0 : 
            switch(S157121){
              case 0 : 
                switch(S157083){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 792, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 48
                      S157083=1;
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                    else {
                      switch(S157078){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 48
                            lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 792, column: 48
                            S157078=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 48
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 48
                              ends[93]=2;
                              ;//sysj\conveyor_controller.sysj line: 792, column: 48
                              S157121=1;
                              __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 792, column: 32
                              if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 792, column: 32
                                ends[93]=2;
                                ;//sysj\conveyor_controller.sysj line: 792, column: 32
                                done_87.setPresent();//sysj\conveyor_controller.sysj line: 792, column: 100
                                currsigs.addElement(done_87);
                                S157179=1;
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
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 48
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 48
                            ends[93]=2;
                            ;//sysj\conveyor_controller.sysj line: 792, column: 48
                            S157121=1;
                            __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 792, column: 32
                            if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 792, column: 32
                              ends[93]=2;
                              ;//sysj\conveyor_controller.sysj line: 792, column: 32
                              done_87.setPresent();//sysj\conveyor_controller.sysj line: 792, column: 100
                              currsigs.addElement(done_87);
                              S157179=1;
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
                    S157083=1;
                    S157083=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 792, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 48
                      S157083=1;
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                    else {
                      S157078=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 48
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 792, column: 48
                        S157078=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 48
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 48
                          ends[93]=2;
                          ;//sysj\conveyor_controller.sysj line: 792, column: 48
                          S157121=1;
                          __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 792, column: 32
                          if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 792, column: 32
                            ends[93]=2;
                            ;//sysj\conveyor_controller.sysj line: 792, column: 32
                            done_87.setPresent();//sysj\conveyor_controller.sysj line: 792, column: 100
                            currsigs.addElement(done_87);
                            S157179=1;
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
                if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 792, column: 32
                  ends[93]=2;
                  ;//sysj\conveyor_controller.sysj line: 792, column: 32
                  done_87.setPresent();//sysj\conveyor_controller.sysj line: 792, column: 100
                  currsigs.addElement(done_87);
                  S157179=1;
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
            S157179=1;
            S157179=0;
            if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 792, column: 21
              armSource.setPresent();//sysj\conveyor_controller.sysj line: 792, column: 33
              currsigs.addElement(armSource);
              S157121=0;
              S157083=0;
              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 792, column: 48
                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 48
                S157083=1;
                active[93]=1;
                ends[93]=1;
                tdone[93]=1;
              }
              else {
                S157078=0;
                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 48
                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 792, column: 48
                  S157078=1;
                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 48
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 48
                    ends[93]=2;
                    ;//sysj\conveyor_controller.sysj line: 792, column: 48
                    S157121=1;
                    __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 792, column: 32
                    if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 792, column: 32
                      ends[93]=2;
                      ;//sysj\conveyor_controller.sysj line: 792, column: 32
                      done_87.setPresent();//sysj\conveyor_controller.sysj line: 792, column: 100
                      currsigs.addElement(done_87);
                      S157179=1;
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
              S157179=1;
              active[93]=1;
              ends[93]=1;
              tdone[93]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread213044(int [] tdone, int [] ends){
        switch(S157076){
      case 0 : 
        active[92]=0;
        ends[92]=0;
        tdone[92]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 790, column: 21
          vacOn.setPresent();//sysj\conveyor_controller.sysj line: 790, column: 29
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

  public void thread213043(int [] tdone, int [] ends){
        switch(S157068){
      case 0 : 
        active[91]=0;
        ends[91]=0;
        tdone[91]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 788, column: 21
          pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 788, column: 36
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

  public void thread213041(int [] tdone, int [] ends){
        S157395=1;
    if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 794, column: 21
      armDest.setPresent();//sysj\conveyor_controller.sysj line: 794, column: 31
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

  public void thread213040(int [] tdone, int [] ends){
        S157387=1;
    S157179=0;
    if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 792, column: 21
      armSource.setPresent();//sysj\conveyor_controller.sysj line: 792, column: 33
      currsigs.addElement(armSource);
      S157121=0;
      S157083=0;
      if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 792, column: 48
        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 48
        S157083=1;
        active[93]=1;
        ends[93]=1;
        tdone[93]=1;
      }
      else {
        S157078=0;
        if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 48
          lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 792, column: 48
          S157078=1;
          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 792, column: 48
            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 792, column: 48
            ends[93]=2;
            ;//sysj\conveyor_controller.sysj line: 792, column: 48
            S157121=1;
            __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 792, column: 32
            if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 792, column: 32
              ends[93]=2;
              ;//sysj\conveyor_controller.sysj line: 792, column: 32
              done_87.setPresent();//sysj\conveyor_controller.sysj line: 792, column: 100
              currsigs.addElement(done_87);
              S157179=1;
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
      S157179=1;
      active[93]=1;
      ends[93]=1;
      tdone[93]=1;
    }
  }

  public void thread213039(int [] tdone, int [] ends){
        S157076=1;
    if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 790, column: 21
      vacOn.setPresent();//sysj\conveyor_controller.sysj line: 790, column: 29
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

  public void thread213038(int [] tdone, int [] ends){
        S157068=1;
    if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 788, column: 21
      pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 788, column: 36
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

  public void thread213036(int [] tdone, int [] ends){
        switch(S154213){
      case 0 : 
        active[90]=0;
        ends[90]=0;
        tdone[90]=1;
        break;
      
      case 1 : 
        switch(S154204){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 758, column: 16
              System.out.println("WP gripped");//sysj\conveyor_controller.sysj line: 759, column: 10
              S154204=1;
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 761, column: 11
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
            if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 760, column: 16
              System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 763, column: 10
              ends[90]=2;
              tdone[90]=1;
            }
            else {
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 761, column: 11
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

  public void thread213035(int [] tdone, int [] ends){
        switch(S154202){
      case 0 : 
        active[89]=0;
        ends[89]=0;
        tdone[89]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\conveyor_controller.sysj line: 754, column: 10
        currsigs.addElement(vacOn);
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
        break;
      
    }
  }

  public void thread213033(int [] tdone, int [] ends){
        S154213=1;
    S154204=0;
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread213032(int [] tdone, int [] ends){
        S154202=1;
    vacOn.setPresent();//sysj\conveyor_controller.sysj line: 754, column: 10
    currsigs.addElement(vacOn);
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread213031(int [] tdone, int [] ends){
        switch(S212064){
      case 0 : 
        active[88]=0;
        ends[88]=0;
        tdone[88]=1;
        break;
      
      case 1 : 
        switch(S212063){
          case 0 : 
            switch(S154095){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 718, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 718, column: 5
                  S154095=1;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  switch(S154090){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 718, column: 5
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 718, column: 5
                        S154090=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 718, column: 5
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 718, column: 5
                          ends[88]=2;
                          ;//sysj\conveyor_controller.sysj line: 718, column: 5
                          S212063=1;
                          S154156=0;
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
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 718, column: 5
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 718, column: 5
                        ends[88]=2;
                        ;//sysj\conveyor_controller.sysj line: 718, column: 5
                        S212063=1;
                        S154156=0;
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
                S154095=1;
                S154095=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 718, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 718, column: 5
                  S154095=1;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  S154090=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 718, column: 5
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 718, column: 5
                    S154090=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 718, column: 5
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 718, column: 5
                      ends[88]=2;
                      ;//sysj\conveyor_controller.sysj line: 718, column: 5
                      S212063=1;
                      S154156=0;
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
            switch(S154156){
              case 0 : 
                if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 720, column: 13
                  S154156=1;
                  S154118=0;
                  if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 721, column: 6
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 721, column: 6
                    S154118=1;
                    active[88]=1;
                    ends[88]=1;
                    tdone[88]=1;
                  }
                  else {
                    S154113=0;
                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 721, column: 6
                      lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 721, column: 6
                      S154113=1;
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 721, column: 6
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 721, column: 6
                        ends[88]=2;
                        ;//sysj\conveyor_controller.sysj line: 721, column: 6
                        S154156=2;
                        System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 723, column: 7
                        S154165=0;
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 725, column: 8
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
                switch(S154118){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 721, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 721, column: 6
                      S154118=1;
                      active[88]=1;
                      ends[88]=1;
                      tdone[88]=1;
                    }
                    else {
                      switch(S154113){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 721, column: 6
                            lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 721, column: 6
                            S154113=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 721, column: 6
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 721, column: 6
                              ends[88]=2;
                              ;//sysj\conveyor_controller.sysj line: 721, column: 6
                              S154156=2;
                              System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 723, column: 7
                              S154165=0;
                              armDest.setPresent();//sysj\conveyor_controller.sysj line: 725, column: 8
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
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 721, column: 6
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 721, column: 6
                            ends[88]=2;
                            ;//sysj\conveyor_controller.sysj line: 721, column: 6
                            S154156=2;
                            System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 723, column: 7
                            S154165=0;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 725, column: 8
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
                    S154118=1;
                    S154118=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 721, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 721, column: 6
                      S154118=1;
                      active[88]=1;
                      ends[88]=1;
                      tdone[88]=1;
                    }
                    else {
                      S154113=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 721, column: 6
                        lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 721, column: 6
                        S154113=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 721, column: 6
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 721, column: 6
                          ends[88]=2;
                          ;//sysj\conveyor_controller.sysj line: 721, column: 6
                          S154156=2;
                          System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 723, column: 7
                          S154165=0;
                          armDest.setPresent();//sysj\conveyor_controller.sysj line: 725, column: 8
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
                if(manualMode_87.getprestatus()){//sysj\conveyor_controller.sysj line: 722, column: 12
                  lidLoaderReady_o.setPreempted();
                  S154156=3;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  switch(S154165){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 724, column: 13
                        System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 727, column: 7
                        S154165=1;
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 725, column: 8
                        currsigs.addElement(armDest);
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 728, column: 13
                        System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 729, column: 7
                        S154165=2;
                        S154171=0;
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
                      switch(S154171){
                        case 0 : 
                          if(!empty.getprestatus()){//sysj\conveyor_controller.sysj line: 732, column: 14
                            S154171=1;
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
                          if(request.getprestatus()){//sysj\conveyor_controller.sysj line: 733, column: 14
                            System.out.println("New request");//sysj\conveyor_controller.sysj line: 734, column: 8
                            S154171=2;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 736, column: 9
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
                          if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 735, column: 14
                            System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 738, column: 8
                            S154171=3;
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 741, column: 9
                            currsigs.addElement(pusherExtend);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 736, column: 9
                            currsigs.addElement(armDest);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 3 : 
                          if(pusherExtended.getprestatus()){//sysj\conveyor_controller.sysj line: 740, column: 14
                            System.out.println("Pusher extended");//sysj\conveyor_controller.sysj line: 743, column: 8
                            S154171=4;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 741, column: 9
                            currsigs.addElement(pusherExtend);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 4 : 
                          if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 744, column: 14
                            System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 745, column: 8
                            S154171=5;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 748, column: 9
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
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 747, column: 14
                            System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 750, column: 8
                            S154171=6;
                            thread213032(tdone,ends);
                            thread213033(tdone,ends);
                            int biggest213034 = 0;
                            if(ends[89]>=biggest213034){
                              biggest213034=ends[89];
                            }
                            if(ends[90]>=biggest213034){
                              biggest213034=ends[90];
                            }
                            if(biggest213034 == 1){
                              active[88]=1;
                              ends[88]=1;
                              tdone[88]=1;
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 748, column: 9
                            currsigs.addElement(armSource);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 6 : 
                          thread213035(tdone,ends);
                          thread213036(tdone,ends);
                          int biggest213037 = 0;
                          if(ends[89]>=biggest213037){
                            biggest213037=ends[89];
                          }
                          if(ends[90]>=biggest213037){
                            biggest213037=ends[90];
                          }
                          if(biggest213037 == 1){
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          if(biggest213037 == 2){
                            ends[88]=2;
                            ;//sysj\conveyor_controller.sysj line: 752, column: 8
                            S154171=7;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          //FINXME code
                          if(biggest213037 == 0){
                            S154171=7;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 7 : 
                          if(!WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 768, column: 14
                            S154171=8;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 771, column: 9
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
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 770, column: 14
                            done_87.setPresent();//sysj\conveyor_controller.sysj line: 775, column: 8
                            currsigs.addElement(done_87);
                            S154171=9;
                            S154249=0;
                            if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 776, column: 8
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 776, column: 8
                              S154249=1;
                              active[88]=1;
                              ends[88]=1;
                              tdone[88]=1;
                            }
                            else {
                              S154244=0;
                              if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 776, column: 8
                                lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 776, column: 8
                                S154244=1;
                                if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 776, column: 8
                                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 776, column: 8
                                  ends[88]=2;
                                  ;//sysj\conveyor_controller.sysj line: 776, column: 8
                                  System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 778, column: 8
                                  S154171=10;
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
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 771, column: 9
                            currsigs.addElement(armSource);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 9 : 
                          switch(S154249){
                            case 0 : 
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 776, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 776, column: 8
                                S154249=1;
                                active[88]=1;
                                ends[88]=1;
                                tdone[88]=1;
                              }
                              else {
                                switch(S154244){
                                  case 0 : 
                                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 776, column: 8
                                      lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 776, column: 8
                                      S154244=1;
                                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 776, column: 8
                                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 776, column: 8
                                        ends[88]=2;
                                        ;//sysj\conveyor_controller.sysj line: 776, column: 8
                                        System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 778, column: 8
                                        S154171=10;
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
                                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 776, column: 8
                                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 776, column: 8
                                      ends[88]=2;
                                      ;//sysj\conveyor_controller.sysj line: 776, column: 8
                                      System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 778, column: 8
                                      S154171=10;
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
                              S154249=1;
                              S154249=0;
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 776, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 776, column: 8
                                S154249=1;
                                active[88]=1;
                                ends[88]=1;
                                tdone[88]=1;
                              }
                              else {
                                S154244=0;
                                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 776, column: 8
                                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 776, column: 8
                                  S154244=1;
                                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 776, column: 8
                                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 776, column: 8
                                    ends[88]=2;
                                    ;//sysj\conveyor_controller.sysj line: 776, column: 8
                                    System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 778, column: 8
                                    S154171=10;
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
                          S154171=10;
                          S154171=0;
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
                S154156=3;
                System.out.println("entering manual");//sysj\conveyor_controller.sysj line: 786, column: 6
                S154156=4;
                thread213038(tdone,ends);
                thread213039(tdone,ends);
                thread213040(tdone,ends);
                thread213041(tdone,ends);
                int biggest213042 = 0;
                if(ends[91]>=biggest213042){
                  biggest213042=ends[91];
                }
                if(ends[92]>=biggest213042){
                  biggest213042=ends[92];
                }
                if(ends[93]>=biggest213042){
                  biggest213042=ends[93];
                }
                if(ends[94]>=biggest213042){
                  biggest213042=ends[94];
                }
                if(biggest213042 == 1){
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                break;
              
              case 4 : 
                if(autoMode_87.getprestatus()){//sysj\conveyor_controller.sysj line: 787, column: 12
                  lidLoaderReady_o.setPreempted();
                  S154156=0;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  thread213043(tdone,ends);
                  thread213044(tdone,ends);
                  thread213045(tdone,ends);
                  thread213046(tdone,ends);
                  int biggest213047 = 0;
                  if(ends[91]>=biggest213047){
                    biggest213047=ends[91];
                  }
                  if(ends[92]>=biggest213047){
                    biggest213047=ends[92];
                  }
                  if(ends[93]>=biggest213047){
                    biggest213047=ends[93];
                  }
                  if(ends[94]>=biggest213047){
                    biggest213047=ends[94];
                  }
                  if(biggest213047 == 1){
                    active[88]=1;
                    ends[88]=1;
                    tdone[88]=1;
                  }
                  //FINXME code
                  if(biggest213047 == 0){
                    S154156=0;
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

  public void thread213028(int [] tdone, int [] ends){
        S212176=1;
    active[99]=1;
    ends[99]=1;
    tdone[99]=1;
  }

  public void thread213027(int [] tdone, int [] ends){
        S212173=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 830, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[98]=1;
    ends[98]=1;
    tdone[98]=1;
  }

  public void thread213026(int [] tdone, int [] ends){
        S212206=1;
    S212180=0;
    if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 827, column: 20
      thread213027(tdone,ends);
      thread213028(tdone,ends);
      int biggest213029 = 0;
      if(ends[98]>=biggest213029){
        biggest213029=ends[98];
      }
      if(ends[99]>=biggest213029){
        biggest213029=ends[99];
      }
      if(biggest213029 == 1){
        active[97]=1;
        ends[97]=1;
        tdone[97]=1;
      }
    }
    else {
      S212180=1;
      active[97]=1;
      ends[97]=1;
      tdone[97]=1;
    }
  }

  public void thread213025(int [] tdone, int [] ends){
        S212168=1;
    S212112=0;
    S212092=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 817, column: 6
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 817, column: 6
      S212092=1;
      active[96]=1;
      ends[96]=1;
      tdone[96]=1;
    }
    else {
      S212087=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 817, column: 6
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 817, column: 6
        S212087=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 817, column: 6
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 817, column: 6
          ends[96]=2;
          ;//sysj\conveyor_controller.sysj line: 817, column: 6
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 818, column: 9
            bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 819, column: 7
            currsigs.addElement(bottleAtPos3_87);
            S212112=1;
            active[96]=1;
            ends[96]=1;
            tdone[96]=1;
          }
          else {
            S212112=1;
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

  public void thread213024(int [] tdone, int [] ends){
        S212085=1;
    S212084=0;
    active[95]=1;
    ends[95]=1;
    tdone[95]=1;
  }

  public void thread213023(int [] tdone, int [] ends){
        S212064=1;
    S212063=0;
    S154095=0;
    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 718, column: 5
      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 718, column: 5
      S154095=1;
      active[88]=1;
      ends[88]=1;
      tdone[88]=1;
    }
    else {
      S154090=0;
      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 718, column: 5
        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 718, column: 5
        S154090=1;
        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 718, column: 5
          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 718, column: 5
          ends[88]=2;
          ;//sysj\conveyor_controller.sysj line: 718, column: 5
          S212063=1;
          S154156=0;
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
      switch(S212208){
        case 0 : 
          S212208=0;
          break RUN;
        
        case 1 : 
          S212208=2;
          S212208=2;
          manualMode_87.setClear();//sysj\conveyor_controller.sysj line: 716, column: 4
          autoMode_87.setClear();//sysj\conveyor_controller.sysj line: 716, column: 4
          bottleAtPos3_87.setClear();//sysj\conveyor_controller.sysj line: 716, column: 4
          done_87.setClear();//sysj\conveyor_controller.sysj line: 716, column: 4
          thread213023(tdone,ends);
          thread213024(tdone,ends);
          thread213025(tdone,ends);
          thread213026(tdone,ends);
          int biggest213030 = 0;
          if(ends[88]>=biggest213030){
            biggest213030=ends[88];
          }
          if(ends[95]>=biggest213030){
            biggest213030=ends[95];
          }
          if(ends[96]>=biggest213030){
            biggest213030=ends[96];
          }
          if(ends[97]>=biggest213030){
            biggest213030=ends[97];
          }
          if(biggest213030 == 1){
            active[87]=1;
            ends[87]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_87.setClear();//sysj\conveyor_controller.sysj line: 716, column: 4
          autoMode_87.setClear();//sysj\conveyor_controller.sysj line: 716, column: 4
          bottleAtPos3_87.setClear();//sysj\conveyor_controller.sysj line: 716, column: 4
          done_87.setClear();//sysj\conveyor_controller.sysj line: 716, column: 4
          thread213031(tdone,ends);
          thread213048(tdone,ends);
          thread213049(tdone,ends);
          thread213050(tdone,ends);
          int biggest213057 = 0;
          if(ends[88]>=biggest213057){
            biggest213057=ends[88];
          }
          if(ends[95]>=biggest213057){
            biggest213057=ends[95];
          }
          if(ends[96]>=biggest213057){
            biggest213057=ends[96];
          }
          if(ends[97]>=biggest213057){
            biggest213057=ends[97];
          }
          if(biggest213057 == 1){
            active[87]=1;
            ends[87]=1;
            break RUN;
          }
          //FINXME code
          if(biggest213057 == 0){
            S212208=0;
            active[87]=0;
            ends[87]=0;
            S212208=0;
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
