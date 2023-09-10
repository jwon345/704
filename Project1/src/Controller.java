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
  private Signal manualMode_75;
  private Signal autoMode_75;
  private Signal bottleAtPos3_75;
  private Signal done_75;
  private long __start_thread_81;//sysj\conveyor_controller.sysj line: 679, column: 32
  private int S95158 = 1;
  private int S95014 = 1;
  private int S95013 = 1;
  private int S37045 = 1;
  private int S37040 = 1;
  private int S37106 = 1;
  private int S37068 = 1;
  private int S37063 = 1;
  private int S37115 = 1;
  private int S37121 = 1;
  private int S37152 = 1;
  private int S37163 = 1;
  private int S37154 = 1;
  private int S37199 = 1;
  private int S37194 = 1;
  private int S40018 = 1;
  private int S40026 = 1;
  private int S40337 = 1;
  private int S40129 = 1;
  private int S40071 = 1;
  private int S40033 = 1;
  private int S40028 = 1;
  private int S40345 = 1;
  private int S95035 = 1;
  private int S95034 = 1;
  private int S95118 = 1;
  private int S95062 = 1;
  private int S95042 = 1;
  private int S95037 = 1;
  private int S95156 = 1;
  private int S95130 = 1;
  private int S95123 = 1;
  private int S95126 = 1;
  
  private int[] ends = new int[88];
  private int[] tdone = new int[88];
  
  public void thread95868(int [] tdone, int [] ends){
        S95126=1;
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread95867(int [] tdone, int [] ends){
        S95123=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 717, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread95865(int [] tdone, int [] ends){
        switch(S95126){
      case 0 : 
        active[87]=0;
        ends[87]=0;
        tdone[87]=1;
        break;
      
      case 1 : 
        if(done_75.getprestatus()){//sysj\conveyor_controller.sysj line: 721, column: 28
          ends[87]=2;
          tdone[87]=1;
        }
        else {
          active[87]=1;
          ends[87]=1;
          tdone[87]=1;
        }
        break;
      
    }
  }

  public void thread95864(int [] tdone, int [] ends){
        switch(S95123){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 717, column: 22
        currsigs.addElement(bottleAtPos3E);
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
        break;
      
    }
  }

  public void thread95863(int [] tdone, int [] ends){
        switch(S95156){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        switch(S95130){
          case 0 : 
            thread95864(tdone,ends);
            thread95865(tdone,ends);
            int biggest95866 = 0;
            if(ends[86]>=biggest95866){
              biggest95866=ends[86];
            }
            if(ends[87]>=biggest95866){
              biggest95866=ends[87];
            }
            if(biggest95866 == 1){
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            if(biggest95866 == 2){
              ends[85]=2;
              ;//sysj\conveyor_controller.sysj line: 715, column: 7
              S95130=1;
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            //FINXME code
            if(biggest95866 == 0){
              ;//sysj\conveyor_controller.sysj line: 723, column: 19
              S95130=1;
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            break;
          
          case 1 : 
            S95130=1;
            S95130=0;
            if(bottleAtPos3_75.getprestatus()){//sysj\conveyor_controller.sysj line: 714, column: 20
              thread95867(tdone,ends);
              thread95868(tdone,ends);
              int biggest95869 = 0;
              if(ends[86]>=biggest95869){
                biggest95869=ends[86];
              }
              if(ends[87]>=biggest95869){
                biggest95869=ends[87];
              }
              if(biggest95869 == 1){
                active[85]=1;
                ends[85]=1;
                tdone[85]=1;
              }
            }
            else {
              S95130=1;
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95862(int [] tdone, int [] ends){
        switch(S95118){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        switch(S95062){
          case 0 : 
            switch(S95042){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 704, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 704, column: 6
                  S95042=1;
                  active[84]=1;
                  ends[84]=1;
                  tdone[84]=1;
                }
                else {
                  switch(S95037){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 704, column: 6
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 704, column: 6
                        S95037=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 704, column: 6
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 704, column: 6
                          ends[84]=2;
                          ;//sysj\conveyor_controller.sysj line: 704, column: 6
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 705, column: 9
                            bottleAtPos3_75.setPresent();//sysj\conveyor_controller.sysj line: 706, column: 7
                            currsigs.addElement(bottleAtPos3_75);
                            S95062=1;
                            active[84]=1;
                            ends[84]=1;
                            tdone[84]=1;
                          }
                          else {
                            S95062=1;
                            active[84]=1;
                            ends[84]=1;
                            tdone[84]=1;
                          }
                        }
                        else {
                          active[84]=1;
                          ends[84]=1;
                          tdone[84]=1;
                        }
                      }
                      else {
                        active[84]=1;
                        ends[84]=1;
                        tdone[84]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 704, column: 6
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 704, column: 6
                        ends[84]=2;
                        ;//sysj\conveyor_controller.sysj line: 704, column: 6
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 705, column: 9
                          bottleAtPos3_75.setPresent();//sysj\conveyor_controller.sysj line: 706, column: 7
                          currsigs.addElement(bottleAtPos3_75);
                          S95062=1;
                          active[84]=1;
                          ends[84]=1;
                          tdone[84]=1;
                        }
                        else {
                          S95062=1;
                          active[84]=1;
                          ends[84]=1;
                          tdone[84]=1;
                        }
                      }
                      else {
                        active[84]=1;
                        ends[84]=1;
                        tdone[84]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S95042=1;
                S95042=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 704, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 704, column: 6
                  S95042=1;
                  active[84]=1;
                  ends[84]=1;
                  tdone[84]=1;
                }
                else {
                  S95037=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 704, column: 6
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 704, column: 6
                    S95037=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 704, column: 6
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 704, column: 6
                      ends[84]=2;
                      ;//sysj\conveyor_controller.sysj line: 704, column: 6
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 705, column: 9
                        bottleAtPos3_75.setPresent();//sysj\conveyor_controller.sysj line: 706, column: 7
                        currsigs.addElement(bottleAtPos3_75);
                        S95062=1;
                        active[84]=1;
                        ends[84]=1;
                        tdone[84]=1;
                      }
                      else {
                        S95062=1;
                        active[84]=1;
                        ends[84]=1;
                        tdone[84]=1;
                      }
                    }
                    else {
                      active[84]=1;
                      ends[84]=1;
                      tdone[84]=1;
                    }
                  }
                  else {
                    active[84]=1;
                    ends[84]=1;
                    tdone[84]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S95062=1;
            S95062=0;
            S95042=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 704, column: 6
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 704, column: 6
              S95042=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            else {
              S95037=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 704, column: 6
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 704, column: 6
                S95037=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 704, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 704, column: 6
                  ends[84]=2;
                  ;//sysj\conveyor_controller.sysj line: 704, column: 6
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 705, column: 9
                    bottleAtPos3_75.setPresent();//sysj\conveyor_controller.sysj line: 706, column: 7
                    currsigs.addElement(bottleAtPos3_75);
                    S95062=1;
                    active[84]=1;
                    ends[84]=1;
                    tdone[84]=1;
                  }
                  else {
                    S95062=1;
                    active[84]=1;
                    ends[84]=1;
                    tdone[84]=1;
                  }
                }
                else {
                  active[84]=1;
                  ends[84]=1;
                  tdone[84]=1;
                }
              }
              else {
                active[84]=1;
                ends[84]=1;
                tdone[84]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95861(int [] tdone, int [] ends){
        switch(S95035){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        switch(S95034){
          case 0 : 
            if(mode.getprestatus()){//sysj\conveyor_controller.sysj line: 688, column: 11
              S95034=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 690, column: 9
                autoMode_75.setPresent();//sysj\conveyor_controller.sysj line: 691, column: 7
                currsigs.addElement(autoMode_75);
                active[83]=1;
                ends[83]=1;
                tdone[83]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 693, column: 14
                  manualMode_75.setPresent();//sysj\conveyor_controller.sysj line: 694, column: 7
                  currsigs.addElement(manualMode_75);
                  active[83]=1;
                  ends[83]=1;
                  tdone[83]=1;
                }
                else {
                  active[83]=1;
                  ends[83]=1;
                  tdone[83]=1;
                }
              }
            }
            else {
              active[83]=1;
              ends[83]=1;
              tdone[83]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 690, column: 9
              autoMode_75.setPresent();//sysj\conveyor_controller.sysj line: 691, column: 7
              currsigs.addElement(autoMode_75);
              active[83]=1;
              ends[83]=1;
              tdone[83]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 693, column: 14
                manualMode_75.setPresent();//sysj\conveyor_controller.sysj line: 694, column: 7
                currsigs.addElement(manualMode_75);
                active[83]=1;
                ends[83]=1;
                tdone[83]=1;
              }
              else {
                active[83]=1;
                ends[83]=1;
                tdone[83]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95859(int [] tdone, int [] ends){
        switch(S40345){
      case 0 : 
        active[82]=0;
        ends[82]=0;
        tdone[82]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 681, column: 21
          armDest.setPresent();//sysj\conveyor_controller.sysj line: 681, column: 31
          currsigs.addElement(armDest);
          active[82]=1;
          ends[82]=1;
          tdone[82]=1;
        }
        else {
          active[82]=1;
          ends[82]=1;
          tdone[82]=1;
        }
        break;
      
    }
  }

  public void thread95858(int [] tdone, int [] ends){
        switch(S40337){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        switch(S40129){
          case 0 : 
            switch(S40071){
              case 0 : 
                switch(S40033){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 679, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 679, column: 48
                      S40033=1;
                      active[81]=1;
                      ends[81]=1;
                      tdone[81]=1;
                    }
                    else {
                      switch(S40028){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 679, column: 48
                            lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 679, column: 48
                            S40028=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 679, column: 48
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 679, column: 48
                              ends[81]=2;
                              ;//sysj\conveyor_controller.sysj line: 679, column: 48
                              S40071=1;
                              __start_thread_81 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 679, column: 32
                              if(com.systemj.Timer.getMs() - __start_thread_81 >= 4000){//sysj\conveyor_controller.sysj line: 679, column: 32
                                ends[81]=2;
                                ;//sysj\conveyor_controller.sysj line: 679, column: 32
                                done_75.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 100
                                currsigs.addElement(done_75);
                                S40129=1;
                                active[81]=1;
                                ends[81]=1;
                                tdone[81]=1;
                              }
                              else {
                                active[81]=1;
                                ends[81]=1;
                                tdone[81]=1;
                              }
                            }
                            else {
                              active[81]=1;
                              ends[81]=1;
                              tdone[81]=1;
                            }
                          }
                          else {
                            active[81]=1;
                            ends[81]=1;
                            tdone[81]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 679, column: 48
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 679, column: 48
                            ends[81]=2;
                            ;//sysj\conveyor_controller.sysj line: 679, column: 48
                            S40071=1;
                            __start_thread_81 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 679, column: 32
                            if(com.systemj.Timer.getMs() - __start_thread_81 >= 4000){//sysj\conveyor_controller.sysj line: 679, column: 32
                              ends[81]=2;
                              ;//sysj\conveyor_controller.sysj line: 679, column: 32
                              done_75.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 100
                              currsigs.addElement(done_75);
                              S40129=1;
                              active[81]=1;
                              ends[81]=1;
                              tdone[81]=1;
                            }
                            else {
                              active[81]=1;
                              ends[81]=1;
                              tdone[81]=1;
                            }
                          }
                          else {
                            active[81]=1;
                            ends[81]=1;
                            tdone[81]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S40033=1;
                    S40033=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 679, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 679, column: 48
                      S40033=1;
                      active[81]=1;
                      ends[81]=1;
                      tdone[81]=1;
                    }
                    else {
                      S40028=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 679, column: 48
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 679, column: 48
                        S40028=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 679, column: 48
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 679, column: 48
                          ends[81]=2;
                          ;//sysj\conveyor_controller.sysj line: 679, column: 48
                          S40071=1;
                          __start_thread_81 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 679, column: 32
                          if(com.systemj.Timer.getMs() - __start_thread_81 >= 4000){//sysj\conveyor_controller.sysj line: 679, column: 32
                            ends[81]=2;
                            ;//sysj\conveyor_controller.sysj line: 679, column: 32
                            done_75.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 100
                            currsigs.addElement(done_75);
                            S40129=1;
                            active[81]=1;
                            ends[81]=1;
                            tdone[81]=1;
                          }
                          else {
                            active[81]=1;
                            ends[81]=1;
                            tdone[81]=1;
                          }
                        }
                        else {
                          active[81]=1;
                          ends[81]=1;
                          tdone[81]=1;
                        }
                      }
                      else {
                        active[81]=1;
                        ends[81]=1;
                        tdone[81]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                if(com.systemj.Timer.getMs() - __start_thread_81 >= 4000){//sysj\conveyor_controller.sysj line: 679, column: 32
                  ends[81]=2;
                  ;//sysj\conveyor_controller.sysj line: 679, column: 32
                  done_75.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 100
                  currsigs.addElement(done_75);
                  S40129=1;
                  active[81]=1;
                  ends[81]=1;
                  tdone[81]=1;
                }
                else {
                  active[81]=1;
                  ends[81]=1;
                  tdone[81]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S40129=1;
            S40129=0;
            if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 679, column: 21
              armSource.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 33
              currsigs.addElement(armSource);
              S40071=0;
              S40033=0;
              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 679, column: 48
                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 679, column: 48
                S40033=1;
                active[81]=1;
                ends[81]=1;
                tdone[81]=1;
              }
              else {
                S40028=0;
                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 679, column: 48
                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 679, column: 48
                  S40028=1;
                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 679, column: 48
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 679, column: 48
                    ends[81]=2;
                    ;//sysj\conveyor_controller.sysj line: 679, column: 48
                    S40071=1;
                    __start_thread_81 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 679, column: 32
                    if(com.systemj.Timer.getMs() - __start_thread_81 >= 4000){//sysj\conveyor_controller.sysj line: 679, column: 32
                      ends[81]=2;
                      ;//sysj\conveyor_controller.sysj line: 679, column: 32
                      done_75.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 100
                      currsigs.addElement(done_75);
                      S40129=1;
                      active[81]=1;
                      ends[81]=1;
                      tdone[81]=1;
                    }
                    else {
                      active[81]=1;
                      ends[81]=1;
                      tdone[81]=1;
                    }
                  }
                  else {
                    active[81]=1;
                    ends[81]=1;
                    tdone[81]=1;
                  }
                }
                else {
                  active[81]=1;
                  ends[81]=1;
                  tdone[81]=1;
                }
              }
            }
            else {
              S40129=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95857(int [] tdone, int [] ends){
        switch(S40026){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 677, column: 21
          vacOn.setPresent();//sysj\conveyor_controller.sysj line: 677, column: 29
          currsigs.addElement(vacOn);
          active[80]=1;
          ends[80]=1;
          tdone[80]=1;
        }
        else {
          active[80]=1;
          ends[80]=1;
          tdone[80]=1;
        }
        break;
      
    }
  }

  public void thread95856(int [] tdone, int [] ends){
        switch(S40018){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 675, column: 21
          pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 675, column: 36
          currsigs.addElement(pusherExtend);
          active[79]=1;
          ends[79]=1;
          tdone[79]=1;
        }
        else {
          active[79]=1;
          ends[79]=1;
          tdone[79]=1;
        }
        break;
      
    }
  }

  public void thread95854(int [] tdone, int [] ends){
        S40345=1;
    if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 681, column: 21
      armDest.setPresent();//sysj\conveyor_controller.sysj line: 681, column: 31
      currsigs.addElement(armDest);
      active[82]=1;
      ends[82]=1;
      tdone[82]=1;
    }
    else {
      active[82]=1;
      ends[82]=1;
      tdone[82]=1;
    }
  }

  public void thread95853(int [] tdone, int [] ends){
        S40337=1;
    S40129=0;
    if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 679, column: 21
      armSource.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 33
      currsigs.addElement(armSource);
      S40071=0;
      S40033=0;
      if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 679, column: 48
        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 679, column: 48
        S40033=1;
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
      else {
        S40028=0;
        if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 679, column: 48
          lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 679, column: 48
          S40028=1;
          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 679, column: 48
            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 679, column: 48
            ends[81]=2;
            ;//sysj\conveyor_controller.sysj line: 679, column: 48
            S40071=1;
            __start_thread_81 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 679, column: 32
            if(com.systemj.Timer.getMs() - __start_thread_81 >= 4000){//sysj\conveyor_controller.sysj line: 679, column: 32
              ends[81]=2;
              ;//sysj\conveyor_controller.sysj line: 679, column: 32
              done_75.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 100
              currsigs.addElement(done_75);
              S40129=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            else {
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
          }
          else {
            active[81]=1;
            ends[81]=1;
            tdone[81]=1;
          }
        }
        else {
          active[81]=1;
          ends[81]=1;
          tdone[81]=1;
        }
      }
    }
    else {
      S40129=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread95852(int [] tdone, int [] ends){
        S40026=1;
    if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 677, column: 21
      vacOn.setPresent();//sysj\conveyor_controller.sysj line: 677, column: 29
      currsigs.addElement(vacOn);
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
  }

  public void thread95851(int [] tdone, int [] ends){
        S40018=1;
    if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 675, column: 21
      pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 675, column: 36
      currsigs.addElement(pusherExtend);
      active[79]=1;
      ends[79]=1;
      tdone[79]=1;
    }
    else {
      active[79]=1;
      ends[79]=1;
      tdone[79]=1;
    }
  }

  public void thread95849(int [] tdone, int [] ends){
        switch(S37163){
      case 0 : 
        active[78]=0;
        ends[78]=0;
        tdone[78]=1;
        break;
      
      case 1 : 
        switch(S37154){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 645, column: 16
              System.out.println("WP gripped");//sysj\conveyor_controller.sysj line: 646, column: 10
              S37154=1;
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 648, column: 11
              currsigs.addElement(armDest);
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            else {
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            break;
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 647, column: 16
              System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 650, column: 10
              ends[78]=2;
              tdone[78]=1;
            }
            else {
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 648, column: 11
              currsigs.addElement(armDest);
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95848(int [] tdone, int [] ends){
        switch(S37152){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\conveyor_controller.sysj line: 641, column: 10
        currsigs.addElement(vacOn);
        active[77]=1;
        ends[77]=1;
        tdone[77]=1;
        break;
      
    }
  }

  public void thread95846(int [] tdone, int [] ends){
        S37163=1;
    S37154=0;
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread95845(int [] tdone, int [] ends){
        S37152=1;
    vacOn.setPresent();//sysj\conveyor_controller.sysj line: 641, column: 10
    currsigs.addElement(vacOn);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread95844(int [] tdone, int [] ends){
        switch(S95014){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        switch(S95013){
          case 0 : 
            switch(S37045){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 605, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 605, column: 5
                  S37045=1;
                  active[76]=1;
                  ends[76]=1;
                  tdone[76]=1;
                }
                else {
                  switch(S37040){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 605, column: 5
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 605, column: 5
                        S37040=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 605, column: 5
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 605, column: 5
                          ends[76]=2;
                          ;//sysj\conveyor_controller.sysj line: 605, column: 5
                          S95013=1;
                          S37106=0;
                          active[76]=1;
                          ends[76]=1;
                          tdone[76]=1;
                        }
                        else {
                          active[76]=1;
                          ends[76]=1;
                          tdone[76]=1;
                        }
                      }
                      else {
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 605, column: 5
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 605, column: 5
                        ends[76]=2;
                        ;//sysj\conveyor_controller.sysj line: 605, column: 5
                        S95013=1;
                        S37106=0;
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                      else {
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S37045=1;
                S37045=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 605, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 605, column: 5
                  S37045=1;
                  active[76]=1;
                  ends[76]=1;
                  tdone[76]=1;
                }
                else {
                  S37040=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 605, column: 5
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 605, column: 5
                    S37040=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 605, column: 5
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 605, column: 5
                      ends[76]=2;
                      ;//sysj\conveyor_controller.sysj line: 605, column: 5
                      S95013=1;
                      S37106=0;
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                    else {
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                  }
                  else {
                    active[76]=1;
                    ends[76]=1;
                    tdone[76]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S37106){
              case 0 : 
                if(bottleAtPos3_75.getprestatus()){//sysj\conveyor_controller.sysj line: 607, column: 13
                  S37106=1;
                  S37068=0;
                  if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 608, column: 6
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 608, column: 6
                    S37068=1;
                    active[76]=1;
                    ends[76]=1;
                    tdone[76]=1;
                  }
                  else {
                    S37063=0;
                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 608, column: 6
                      lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 608, column: 6
                      S37063=1;
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 608, column: 6
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 608, column: 6
                        ends[76]=2;
                        ;//sysj\conveyor_controller.sysj line: 608, column: 6
                        S37106=2;
                        System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 610, column: 7
                        S37115=0;
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 612, column: 8
                        currsigs.addElement(armDest);
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                      else {
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                    }
                    else {
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                  }
                }
                else {
                  active[76]=1;
                  ends[76]=1;
                  tdone[76]=1;
                }
                break;
              
              case 1 : 
                switch(S37068){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 608, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 608, column: 6
                      S37068=1;
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                    else {
                      switch(S37063){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 608, column: 6
                            lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 608, column: 6
                            S37063=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 608, column: 6
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 608, column: 6
                              ends[76]=2;
                              ;//sysj\conveyor_controller.sysj line: 608, column: 6
                              S37106=2;
                              System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 610, column: 7
                              S37115=0;
                              armDest.setPresent();//sysj\conveyor_controller.sysj line: 612, column: 8
                              currsigs.addElement(armDest);
                              active[76]=1;
                              ends[76]=1;
                              tdone[76]=1;
                            }
                            else {
                              active[76]=1;
                              ends[76]=1;
                              tdone[76]=1;
                            }
                          }
                          else {
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 608, column: 6
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 608, column: 6
                            ends[76]=2;
                            ;//sysj\conveyor_controller.sysj line: 608, column: 6
                            S37106=2;
                            System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 610, column: 7
                            S37115=0;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 612, column: 8
                            currsigs.addElement(armDest);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          else {
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S37068=1;
                    S37068=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 608, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 608, column: 6
                      S37068=1;
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                    else {
                      S37063=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 608, column: 6
                        lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 608, column: 6
                        S37063=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 608, column: 6
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 608, column: 6
                          ends[76]=2;
                          ;//sysj\conveyor_controller.sysj line: 608, column: 6
                          S37106=2;
                          System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 610, column: 7
                          S37115=0;
                          armDest.setPresent();//sysj\conveyor_controller.sysj line: 612, column: 8
                          currsigs.addElement(armDest);
                          active[76]=1;
                          ends[76]=1;
                          tdone[76]=1;
                        }
                        else {
                          active[76]=1;
                          ends[76]=1;
                          tdone[76]=1;
                        }
                      }
                      else {
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                if(manualMode_75.getprestatus()){//sysj\conveyor_controller.sysj line: 609, column: 12
                  lidLoaderReady_o.setPreempted();
                  S37106=3;
                  active[76]=1;
                  ends[76]=1;
                  tdone[76]=1;
                }
                else {
                  switch(S37115){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 611, column: 13
                        System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 614, column: 7
                        S37115=1;
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 612, column: 8
                        currsigs.addElement(armDest);
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 615, column: 13
                        System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 616, column: 7
                        S37115=2;
                        S37121=0;
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                      else {
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                      break;
                    
                    case 2 : 
                      switch(S37121){
                        case 0 : 
                          if(!empty.getprestatus()){//sysj\conveyor_controller.sysj line: 619, column: 14
                            S37121=1;
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          else {
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(request.getprestatus()){//sysj\conveyor_controller.sysj line: 620, column: 14
                            System.out.println("New request");//sysj\conveyor_controller.sysj line: 621, column: 8
                            S37121=2;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 623, column: 9
                            currsigs.addElement(armDest);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          else {
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 2 : 
                          if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 622, column: 14
                            System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 625, column: 8
                            S37121=3;
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 628, column: 9
                            currsigs.addElement(pusherExtend);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          else {
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 623, column: 9
                            currsigs.addElement(armDest);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 3 : 
                          if(pusherExtended.getprestatus()){//sysj\conveyor_controller.sysj line: 627, column: 14
                            System.out.println("Pusher extended");//sysj\conveyor_controller.sysj line: 630, column: 8
                            S37121=4;
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 628, column: 9
                            currsigs.addElement(pusherExtend);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 4 : 
                          if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 631, column: 14
                            System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 632, column: 8
                            S37121=5;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 635, column: 9
                            currsigs.addElement(armSource);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          else {
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 5 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 634, column: 14
                            System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 637, column: 8
                            S37121=6;
                            thread95845(tdone,ends);
                            thread95846(tdone,ends);
                            int biggest95847 = 0;
                            if(ends[77]>=biggest95847){
                              biggest95847=ends[77];
                            }
                            if(ends[78]>=biggest95847){
                              biggest95847=ends[78];
                            }
                            if(biggest95847 == 1){
                              active[76]=1;
                              ends[76]=1;
                              tdone[76]=1;
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 635, column: 9
                            currsigs.addElement(armSource);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 6 : 
                          thread95848(tdone,ends);
                          thread95849(tdone,ends);
                          int biggest95850 = 0;
                          if(ends[77]>=biggest95850){
                            biggest95850=ends[77];
                          }
                          if(ends[78]>=biggest95850){
                            biggest95850=ends[78];
                          }
                          if(biggest95850 == 1){
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          if(biggest95850 == 2){
                            ends[76]=2;
                            ;//sysj\conveyor_controller.sysj line: 639, column: 8
                            S37121=7;
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          //FINXME code
                          if(biggest95850 == 0){
                            S37121=7;
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 7 : 
                          if(!WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 655, column: 14
                            S37121=8;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 658, column: 9
                            currsigs.addElement(armSource);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          else {
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 8 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 657, column: 14
                            done_75.setPresent();//sysj\conveyor_controller.sysj line: 662, column: 8
                            currsigs.addElement(done_75);
                            S37121=9;
                            S37199=0;
                            if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 663, column: 8
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 663, column: 8
                              S37199=1;
                              active[76]=1;
                              ends[76]=1;
                              tdone[76]=1;
                            }
                            else {
                              S37194=0;
                              if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 663, column: 8
                                lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 663, column: 8
                                S37194=1;
                                if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 663, column: 8
                                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 663, column: 8
                                  ends[76]=2;
                                  ;//sysj\conveyor_controller.sysj line: 663, column: 8
                                  System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 665, column: 8
                                  S37121=10;
                                  active[76]=1;
                                  ends[76]=1;
                                  tdone[76]=1;
                                }
                                else {
                                  active[76]=1;
                                  ends[76]=1;
                                  tdone[76]=1;
                                }
                              }
                              else {
                                active[76]=1;
                                ends[76]=1;
                                tdone[76]=1;
                              }
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 658, column: 9
                            currsigs.addElement(armSource);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 9 : 
                          switch(S37199){
                            case 0 : 
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 663, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 663, column: 8
                                S37199=1;
                                active[76]=1;
                                ends[76]=1;
                                tdone[76]=1;
                              }
                              else {
                                switch(S37194){
                                  case 0 : 
                                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 663, column: 8
                                      lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 663, column: 8
                                      S37194=1;
                                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 663, column: 8
                                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 663, column: 8
                                        ends[76]=2;
                                        ;//sysj\conveyor_controller.sysj line: 663, column: 8
                                        System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 665, column: 8
                                        S37121=10;
                                        active[76]=1;
                                        ends[76]=1;
                                        tdone[76]=1;
                                      }
                                      else {
                                        active[76]=1;
                                        ends[76]=1;
                                        tdone[76]=1;
                                      }
                                    }
                                    else {
                                      active[76]=1;
                                      ends[76]=1;
                                      tdone[76]=1;
                                    }
                                    break;
                                  
                                  case 1 : 
                                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 663, column: 8
                                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 663, column: 8
                                      ends[76]=2;
                                      ;//sysj\conveyor_controller.sysj line: 663, column: 8
                                      System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 665, column: 8
                                      S37121=10;
                                      active[76]=1;
                                      ends[76]=1;
                                      tdone[76]=1;
                                    }
                                    else {
                                      active[76]=1;
                                      ends[76]=1;
                                      tdone[76]=1;
                                    }
                                    break;
                                  
                                }
                              }
                              break;
                            
                            case 1 : 
                              S37199=1;
                              S37199=0;
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 663, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 663, column: 8
                                S37199=1;
                                active[76]=1;
                                ends[76]=1;
                                tdone[76]=1;
                              }
                              else {
                                S37194=0;
                                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 663, column: 8
                                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 663, column: 8
                                  S37194=1;
                                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 663, column: 8
                                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 663, column: 8
                                    ends[76]=2;
                                    ;//sysj\conveyor_controller.sysj line: 663, column: 8
                                    System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 665, column: 8
                                    S37121=10;
                                    active[76]=1;
                                    ends[76]=1;
                                    tdone[76]=1;
                                  }
                                  else {
                                    active[76]=1;
                                    ends[76]=1;
                                    tdone[76]=1;
                                  }
                                }
                                else {
                                  active[76]=1;
                                  ends[76]=1;
                                  tdone[76]=1;
                                }
                              }
                              break;
                            
                          }
                          break;
                        
                        case 10 : 
                          S37121=10;
                          S37121=0;
                          active[76]=1;
                          ends[76]=1;
                          tdone[76]=1;
                          break;
                        
                      }
                      break;
                    
                  }
                }
                break;
              
              case 3 : 
                S37106=3;
                System.out.println("entering manual");//sysj\conveyor_controller.sysj line: 673, column: 6
                S37106=4;
                thread95851(tdone,ends);
                thread95852(tdone,ends);
                thread95853(tdone,ends);
                thread95854(tdone,ends);
                int biggest95855 = 0;
                if(ends[79]>=biggest95855){
                  biggest95855=ends[79];
                }
                if(ends[80]>=biggest95855){
                  biggest95855=ends[80];
                }
                if(ends[81]>=biggest95855){
                  biggest95855=ends[81];
                }
                if(ends[82]>=biggest95855){
                  biggest95855=ends[82];
                }
                if(biggest95855 == 1){
                  active[76]=1;
                  ends[76]=1;
                  tdone[76]=1;
                }
                break;
              
              case 4 : 
                if(autoMode_75.getprestatus()){//sysj\conveyor_controller.sysj line: 674, column: 12
                  lidLoaderReady_o.setPreempted();
                  S37106=0;
                  active[76]=1;
                  ends[76]=1;
                  tdone[76]=1;
                }
                else {
                  thread95856(tdone,ends);
                  thread95857(tdone,ends);
                  thread95858(tdone,ends);
                  thread95859(tdone,ends);
                  int biggest95860 = 0;
                  if(ends[79]>=biggest95860){
                    biggest95860=ends[79];
                  }
                  if(ends[80]>=biggest95860){
                    biggest95860=ends[80];
                  }
                  if(ends[81]>=biggest95860){
                    biggest95860=ends[81];
                  }
                  if(ends[82]>=biggest95860){
                    biggest95860=ends[82];
                  }
                  if(biggest95860 == 1){
                    active[76]=1;
                    ends[76]=1;
                    tdone[76]=1;
                  }
                  //FINXME code
                  if(biggest95860 == 0){
                    S37106=0;
                    active[76]=1;
                    ends[76]=1;
                    tdone[76]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95841(int [] tdone, int [] ends){
        S95126=1;
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread95840(int [] tdone, int [] ends){
        S95123=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 717, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread95839(int [] tdone, int [] ends){
        S95156=1;
    S95130=0;
    if(bottleAtPos3_75.getprestatus()){//sysj\conveyor_controller.sysj line: 714, column: 20
      thread95840(tdone,ends);
      thread95841(tdone,ends);
      int biggest95842 = 0;
      if(ends[86]>=biggest95842){
        biggest95842=ends[86];
      }
      if(ends[87]>=biggest95842){
        biggest95842=ends[87];
      }
      if(biggest95842 == 1){
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
      }
    }
    else {
      S95130=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
  }

  public void thread95838(int [] tdone, int [] ends){
        S95118=1;
    S95062=0;
    S95042=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 704, column: 6
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 704, column: 6
      S95042=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
    else {
      S95037=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 704, column: 6
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 704, column: 6
        S95037=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 704, column: 6
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 704, column: 6
          ends[84]=2;
          ;//sysj\conveyor_controller.sysj line: 704, column: 6
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 705, column: 9
            bottleAtPos3_75.setPresent();//sysj\conveyor_controller.sysj line: 706, column: 7
            currsigs.addElement(bottleAtPos3_75);
            S95062=1;
            active[84]=1;
            ends[84]=1;
            tdone[84]=1;
          }
          else {
            S95062=1;
            active[84]=1;
            ends[84]=1;
            tdone[84]=1;
          }
        }
        else {
          active[84]=1;
          ends[84]=1;
          tdone[84]=1;
        }
      }
      else {
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
  }

  public void thread95837(int [] tdone, int [] ends){
        S95035=1;
    S95034=0;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread95836(int [] tdone, int [] ends){
        S95014=1;
    S95013=0;
    S37045=0;
    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 605, column: 5
      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 605, column: 5
      S37045=1;
      active[76]=1;
      ends[76]=1;
      tdone[76]=1;
    }
    else {
      S37040=0;
      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 605, column: 5
        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 605, column: 5
        S37040=1;
        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 605, column: 5
          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 605, column: 5
          ends[76]=2;
          ;//sysj\conveyor_controller.sysj line: 605, column: 5
          S95013=1;
          S37106=0;
          active[76]=1;
          ends[76]=1;
          tdone[76]=1;
        }
        else {
          active[76]=1;
          ends[76]=1;
          tdone[76]=1;
        }
      }
      else {
        active[76]=1;
        ends[76]=1;
        tdone[76]=1;
      }
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S95158){
        case 0 : 
          S95158=0;
          break RUN;
        
        case 1 : 
          S95158=2;
          S95158=2;
          manualMode_75.setClear();//sysj\conveyor_controller.sysj line: 603, column: 4
          autoMode_75.setClear();//sysj\conveyor_controller.sysj line: 603, column: 4
          bottleAtPos3_75.setClear();//sysj\conveyor_controller.sysj line: 603, column: 4
          done_75.setClear();//sysj\conveyor_controller.sysj line: 603, column: 4
          thread95836(tdone,ends);
          thread95837(tdone,ends);
          thread95838(tdone,ends);
          thread95839(tdone,ends);
          int biggest95843 = 0;
          if(ends[76]>=biggest95843){
            biggest95843=ends[76];
          }
          if(ends[83]>=biggest95843){
            biggest95843=ends[83];
          }
          if(ends[84]>=biggest95843){
            biggest95843=ends[84];
          }
          if(ends[85]>=biggest95843){
            biggest95843=ends[85];
          }
          if(biggest95843 == 1){
            active[75]=1;
            ends[75]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_75.setClear();//sysj\conveyor_controller.sysj line: 603, column: 4
          autoMode_75.setClear();//sysj\conveyor_controller.sysj line: 603, column: 4
          bottleAtPos3_75.setClear();//sysj\conveyor_controller.sysj line: 603, column: 4
          done_75.setClear();//sysj\conveyor_controller.sysj line: 603, column: 4
          thread95844(tdone,ends);
          thread95861(tdone,ends);
          thread95862(tdone,ends);
          thread95863(tdone,ends);
          int biggest95870 = 0;
          if(ends[76]>=biggest95870){
            biggest95870=ends[76];
          }
          if(ends[83]>=biggest95870){
            biggest95870=ends[83];
          }
          if(ends[84]>=biggest95870){
            biggest95870=ends[84];
          }
          if(ends[85]>=biggest95870){
            biggest95870=ends[85];
          }
          if(biggest95870 == 1){
            active[75]=1;
            ends[75]=1;
            break RUN;
          }
          //FINXME code
          if(biggest95870 == 0){
            S95158=0;
            active[75]=0;
            ends[75]=0;
            S95158=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    manualMode_75 = new Signal();
    autoMode_75 = new Signal();
    bottleAtPos3_75 = new Signal();
    done_75 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[75] != 0){
      int index = 75;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[75]!=0 || suspended[75]!=0 || active[75]!=1);
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
      manualMode_75.setpreclear();
      autoMode_75.setpreclear();
      bottleAtPos3_75.setpreclear();
      done_75.setpreclear();
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
      manualMode_75.setClear();
      autoMode_75.setClear();
      bottleAtPos3_75.setClear();
      done_75.setClear();
      checkThree_in.sethook();
      lidLoaderReady_o.sethook();
      if(paused[75]!=0 || suspended[75]!=0 || active[75]!=1);
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
      if(active[75] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
