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
  private long __start_thread_81;//sysj\conveyor_controller.sysj line: 686, column: 32
  private int S100802 = 1;
  private int S100658 = 1;
  private int S100657 = 1;
  private int S42689 = 1;
  private int S42684 = 1;
  private int S42750 = 1;
  private int S42712 = 1;
  private int S42707 = 1;
  private int S42759 = 1;
  private int S42765 = 1;
  private int S42796 = 1;
  private int S42807 = 1;
  private int S42798 = 1;
  private int S42843 = 1;
  private int S42838 = 1;
  private int S45662 = 1;
  private int S45670 = 1;
  private int S45981 = 1;
  private int S45773 = 1;
  private int S45715 = 1;
  private int S45677 = 1;
  private int S45672 = 1;
  private int S45989 = 1;
  private int S100679 = 1;
  private int S100678 = 1;
  private int S100762 = 1;
  private int S100706 = 1;
  private int S100686 = 1;
  private int S100681 = 1;
  private int S100800 = 1;
  private int S100774 = 1;
  private int S100767 = 1;
  private int S100770 = 1;
  
  private int[] ends = new int[88];
  private int[] tdone = new int[88];
  
  public void thread101517(int [] tdone, int [] ends){
        S100770=1;
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread101516(int [] tdone, int [] ends){
        S100767=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 724, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread101514(int [] tdone, int [] ends){
        switch(S100770){
      case 0 : 
        active[87]=0;
        ends[87]=0;
        tdone[87]=1;
        break;
      
      case 1 : 
        if(done_75.getprestatus()){//sysj\conveyor_controller.sysj line: 728, column: 28
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

  public void thread101513(int [] tdone, int [] ends){
        switch(S100767){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 724, column: 22
        currsigs.addElement(bottleAtPos3E);
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
        break;
      
    }
  }

  public void thread101512(int [] tdone, int [] ends){
        switch(S100800){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        switch(S100774){
          case 0 : 
            thread101513(tdone,ends);
            thread101514(tdone,ends);
            int biggest101515 = 0;
            if(ends[86]>=biggest101515){
              biggest101515=ends[86];
            }
            if(ends[87]>=biggest101515){
              biggest101515=ends[87];
            }
            if(biggest101515 == 1){
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            if(biggest101515 == 2){
              ends[85]=2;
              ;//sysj\conveyor_controller.sysj line: 722, column: 7
              S100774=1;
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            //FINXME code
            if(biggest101515 == 0){
              ;//sysj\conveyor_controller.sysj line: 730, column: 19
              S100774=1;
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            break;
          
          case 1 : 
            S100774=1;
            S100774=0;
            if(bottleAtPos3_75.getprestatus()){//sysj\conveyor_controller.sysj line: 721, column: 20
              thread101516(tdone,ends);
              thread101517(tdone,ends);
              int biggest101518 = 0;
              if(ends[86]>=biggest101518){
                biggest101518=ends[86];
              }
              if(ends[87]>=biggest101518){
                biggest101518=ends[87];
              }
              if(biggest101518 == 1){
                active[85]=1;
                ends[85]=1;
                tdone[85]=1;
              }
            }
            else {
              S100774=1;
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread101511(int [] tdone, int [] ends){
        switch(S100762){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        switch(S100706){
          case 0 : 
            switch(S100686){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 711, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 711, column: 6
                  S100686=1;
                  active[84]=1;
                  ends[84]=1;
                  tdone[84]=1;
                }
                else {
                  switch(S100681){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 711, column: 6
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 711, column: 6
                        S100681=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 711, column: 6
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 711, column: 6
                          ends[84]=2;
                          ;//sysj\conveyor_controller.sysj line: 711, column: 6
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 712, column: 9
                            bottleAtPos3_75.setPresent();//sysj\conveyor_controller.sysj line: 713, column: 7
                            currsigs.addElement(bottleAtPos3_75);
                            S100706=1;
                            active[84]=1;
                            ends[84]=1;
                            tdone[84]=1;
                          }
                          else {
                            S100706=1;
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
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 711, column: 6
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 711, column: 6
                        ends[84]=2;
                        ;//sysj\conveyor_controller.sysj line: 711, column: 6
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 712, column: 9
                          bottleAtPos3_75.setPresent();//sysj\conveyor_controller.sysj line: 713, column: 7
                          currsigs.addElement(bottleAtPos3_75);
                          S100706=1;
                          active[84]=1;
                          ends[84]=1;
                          tdone[84]=1;
                        }
                        else {
                          S100706=1;
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
                S100686=1;
                S100686=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 711, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 711, column: 6
                  S100686=1;
                  active[84]=1;
                  ends[84]=1;
                  tdone[84]=1;
                }
                else {
                  S100681=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 711, column: 6
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 711, column: 6
                    S100681=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 711, column: 6
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 711, column: 6
                      ends[84]=2;
                      ;//sysj\conveyor_controller.sysj line: 711, column: 6
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 712, column: 9
                        bottleAtPos3_75.setPresent();//sysj\conveyor_controller.sysj line: 713, column: 7
                        currsigs.addElement(bottleAtPos3_75);
                        S100706=1;
                        active[84]=1;
                        ends[84]=1;
                        tdone[84]=1;
                      }
                      else {
                        S100706=1;
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
            S100706=1;
            S100706=0;
            S100686=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 711, column: 6
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 711, column: 6
              S100686=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            else {
              S100681=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 711, column: 6
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 711, column: 6
                S100681=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 711, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 711, column: 6
                  ends[84]=2;
                  ;//sysj\conveyor_controller.sysj line: 711, column: 6
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 712, column: 9
                    bottleAtPos3_75.setPresent();//sysj\conveyor_controller.sysj line: 713, column: 7
                    currsigs.addElement(bottleAtPos3_75);
                    S100706=1;
                    active[84]=1;
                    ends[84]=1;
                    tdone[84]=1;
                  }
                  else {
                    S100706=1;
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

  public void thread101510(int [] tdone, int [] ends){
        switch(S100679){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        switch(S100678){
          case 0 : 
            if(mode.getprestatus()){//sysj\conveyor_controller.sysj line: 695, column: 11
              S100678=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 697, column: 9
                autoMode_75.setPresent();//sysj\conveyor_controller.sysj line: 698, column: 7
                currsigs.addElement(autoMode_75);
                active[83]=1;
                ends[83]=1;
                tdone[83]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 700, column: 14
                  manualMode_75.setPresent();//sysj\conveyor_controller.sysj line: 701, column: 7
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
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 697, column: 9
              autoMode_75.setPresent();//sysj\conveyor_controller.sysj line: 698, column: 7
              currsigs.addElement(autoMode_75);
              active[83]=1;
              ends[83]=1;
              tdone[83]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 700, column: 14
                manualMode_75.setPresent();//sysj\conveyor_controller.sysj line: 701, column: 7
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

  public void thread101508(int [] tdone, int [] ends){
        switch(S45989){
      case 0 : 
        active[82]=0;
        ends[82]=0;
        tdone[82]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 688, column: 21
          armDest.setPresent();//sysj\conveyor_controller.sysj line: 688, column: 31
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

  public void thread101507(int [] tdone, int [] ends){
        switch(S45981){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        switch(S45773){
          case 0 : 
            switch(S45715){
              case 0 : 
                switch(S45677){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 686, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 686, column: 48
                      S45677=1;
                      active[81]=1;
                      ends[81]=1;
                      tdone[81]=1;
                    }
                    else {
                      switch(S45672){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 686, column: 48
                            lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 686, column: 48
                            S45672=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 686, column: 48
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 686, column: 48
                              ends[81]=2;
                              ;//sysj\conveyor_controller.sysj line: 686, column: 48
                              S45715=1;
                              __start_thread_81 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 686, column: 32
                              if(com.systemj.Timer.getMs() - __start_thread_81 >= 4000){//sysj\conveyor_controller.sysj line: 686, column: 32
                                ends[81]=2;
                                ;//sysj\conveyor_controller.sysj line: 686, column: 32
                                done_75.setPresent();//sysj\conveyor_controller.sysj line: 686, column: 100
                                currsigs.addElement(done_75);
                                S45773=1;
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
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 686, column: 48
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 686, column: 48
                            ends[81]=2;
                            ;//sysj\conveyor_controller.sysj line: 686, column: 48
                            S45715=1;
                            __start_thread_81 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 686, column: 32
                            if(com.systemj.Timer.getMs() - __start_thread_81 >= 4000){//sysj\conveyor_controller.sysj line: 686, column: 32
                              ends[81]=2;
                              ;//sysj\conveyor_controller.sysj line: 686, column: 32
                              done_75.setPresent();//sysj\conveyor_controller.sysj line: 686, column: 100
                              currsigs.addElement(done_75);
                              S45773=1;
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
                    S45677=1;
                    S45677=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 686, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 686, column: 48
                      S45677=1;
                      active[81]=1;
                      ends[81]=1;
                      tdone[81]=1;
                    }
                    else {
                      S45672=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 686, column: 48
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 686, column: 48
                        S45672=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 686, column: 48
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 686, column: 48
                          ends[81]=2;
                          ;//sysj\conveyor_controller.sysj line: 686, column: 48
                          S45715=1;
                          __start_thread_81 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 686, column: 32
                          if(com.systemj.Timer.getMs() - __start_thread_81 >= 4000){//sysj\conveyor_controller.sysj line: 686, column: 32
                            ends[81]=2;
                            ;//sysj\conveyor_controller.sysj line: 686, column: 32
                            done_75.setPresent();//sysj\conveyor_controller.sysj line: 686, column: 100
                            currsigs.addElement(done_75);
                            S45773=1;
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
                if(com.systemj.Timer.getMs() - __start_thread_81 >= 4000){//sysj\conveyor_controller.sysj line: 686, column: 32
                  ends[81]=2;
                  ;//sysj\conveyor_controller.sysj line: 686, column: 32
                  done_75.setPresent();//sysj\conveyor_controller.sysj line: 686, column: 100
                  currsigs.addElement(done_75);
                  S45773=1;
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
            S45773=1;
            S45773=0;
            if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 686, column: 21
              armSource.setPresent();//sysj\conveyor_controller.sysj line: 686, column: 33
              currsigs.addElement(armSource);
              S45715=0;
              S45677=0;
              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 686, column: 48
                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 686, column: 48
                S45677=1;
                active[81]=1;
                ends[81]=1;
                tdone[81]=1;
              }
              else {
                S45672=0;
                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 686, column: 48
                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 686, column: 48
                  S45672=1;
                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 686, column: 48
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 686, column: 48
                    ends[81]=2;
                    ;//sysj\conveyor_controller.sysj line: 686, column: 48
                    S45715=1;
                    __start_thread_81 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 686, column: 32
                    if(com.systemj.Timer.getMs() - __start_thread_81 >= 4000){//sysj\conveyor_controller.sysj line: 686, column: 32
                      ends[81]=2;
                      ;//sysj\conveyor_controller.sysj line: 686, column: 32
                      done_75.setPresent();//sysj\conveyor_controller.sysj line: 686, column: 100
                      currsigs.addElement(done_75);
                      S45773=1;
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
              S45773=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread101506(int [] tdone, int [] ends){
        switch(S45670){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 684, column: 21
          vacOn.setPresent();//sysj\conveyor_controller.sysj line: 684, column: 29
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

  public void thread101505(int [] tdone, int [] ends){
        switch(S45662){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 682, column: 21
          pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 682, column: 36
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

  public void thread101503(int [] tdone, int [] ends){
        S45989=1;
    if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 688, column: 21
      armDest.setPresent();//sysj\conveyor_controller.sysj line: 688, column: 31
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

  public void thread101502(int [] tdone, int [] ends){
        S45981=1;
    S45773=0;
    if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 686, column: 21
      armSource.setPresent();//sysj\conveyor_controller.sysj line: 686, column: 33
      currsigs.addElement(armSource);
      S45715=0;
      S45677=0;
      if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 686, column: 48
        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 686, column: 48
        S45677=1;
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
      else {
        S45672=0;
        if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 686, column: 48
          lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 686, column: 48
          S45672=1;
          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 686, column: 48
            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 686, column: 48
            ends[81]=2;
            ;//sysj\conveyor_controller.sysj line: 686, column: 48
            S45715=1;
            __start_thread_81 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 686, column: 32
            if(com.systemj.Timer.getMs() - __start_thread_81 >= 4000){//sysj\conveyor_controller.sysj line: 686, column: 32
              ends[81]=2;
              ;//sysj\conveyor_controller.sysj line: 686, column: 32
              done_75.setPresent();//sysj\conveyor_controller.sysj line: 686, column: 100
              currsigs.addElement(done_75);
              S45773=1;
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
      S45773=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread101501(int [] tdone, int [] ends){
        S45670=1;
    if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 684, column: 21
      vacOn.setPresent();//sysj\conveyor_controller.sysj line: 684, column: 29
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

  public void thread101500(int [] tdone, int [] ends){
        S45662=1;
    if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 682, column: 21
      pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 682, column: 36
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

  public void thread101498(int [] tdone, int [] ends){
        switch(S42807){
      case 0 : 
        active[78]=0;
        ends[78]=0;
        tdone[78]=1;
        break;
      
      case 1 : 
        switch(S42798){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 652, column: 16
              System.out.println("WP gripped");//sysj\conveyor_controller.sysj line: 653, column: 10
              S42798=1;
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 655, column: 11
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
            if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 654, column: 16
              System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 657, column: 10
              ends[78]=2;
              tdone[78]=1;
            }
            else {
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 655, column: 11
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

  public void thread101497(int [] tdone, int [] ends){
        switch(S42796){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\conveyor_controller.sysj line: 648, column: 10
        currsigs.addElement(vacOn);
        active[77]=1;
        ends[77]=1;
        tdone[77]=1;
        break;
      
    }
  }

  public void thread101495(int [] tdone, int [] ends){
        S42807=1;
    S42798=0;
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread101494(int [] tdone, int [] ends){
        S42796=1;
    vacOn.setPresent();//sysj\conveyor_controller.sysj line: 648, column: 10
    currsigs.addElement(vacOn);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread101493(int [] tdone, int [] ends){
        switch(S100658){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        switch(S100657){
          case 0 : 
            switch(S42689){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 612, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 612, column: 5
                  S42689=1;
                  active[76]=1;
                  ends[76]=1;
                  tdone[76]=1;
                }
                else {
                  switch(S42684){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 612, column: 5
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 612, column: 5
                        S42684=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 612, column: 5
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 612, column: 5
                          ends[76]=2;
                          ;//sysj\conveyor_controller.sysj line: 612, column: 5
                          S100657=1;
                          S42750=0;
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
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 612, column: 5
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 612, column: 5
                        ends[76]=2;
                        ;//sysj\conveyor_controller.sysj line: 612, column: 5
                        S100657=1;
                        S42750=0;
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
                S42689=1;
                S42689=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 612, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 612, column: 5
                  S42689=1;
                  active[76]=1;
                  ends[76]=1;
                  tdone[76]=1;
                }
                else {
                  S42684=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 612, column: 5
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 612, column: 5
                    S42684=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 612, column: 5
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 612, column: 5
                      ends[76]=2;
                      ;//sysj\conveyor_controller.sysj line: 612, column: 5
                      S100657=1;
                      S42750=0;
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
            switch(S42750){
              case 0 : 
                if(bottleAtPos3_75.getprestatus()){//sysj\conveyor_controller.sysj line: 614, column: 13
                  S42750=1;
                  S42712=0;
                  if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 615, column: 6
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 615, column: 6
                    S42712=1;
                    active[76]=1;
                    ends[76]=1;
                    tdone[76]=1;
                  }
                  else {
                    S42707=0;
                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 615, column: 6
                      lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 615, column: 6
                      S42707=1;
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 615, column: 6
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 615, column: 6
                        ends[76]=2;
                        ;//sysj\conveyor_controller.sysj line: 615, column: 6
                        S42750=2;
                        System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 617, column: 7
                        S42759=0;
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 619, column: 8
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
                switch(S42712){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 615, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 615, column: 6
                      S42712=1;
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                    else {
                      switch(S42707){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 615, column: 6
                            lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 615, column: 6
                            S42707=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 615, column: 6
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 615, column: 6
                              ends[76]=2;
                              ;//sysj\conveyor_controller.sysj line: 615, column: 6
                              S42750=2;
                              System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 617, column: 7
                              S42759=0;
                              armDest.setPresent();//sysj\conveyor_controller.sysj line: 619, column: 8
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
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 615, column: 6
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 615, column: 6
                            ends[76]=2;
                            ;//sysj\conveyor_controller.sysj line: 615, column: 6
                            S42750=2;
                            System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 617, column: 7
                            S42759=0;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 619, column: 8
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
                    S42712=1;
                    S42712=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 615, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 615, column: 6
                      S42712=1;
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                    else {
                      S42707=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 615, column: 6
                        lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 615, column: 6
                        S42707=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 615, column: 6
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 615, column: 6
                          ends[76]=2;
                          ;//sysj\conveyor_controller.sysj line: 615, column: 6
                          S42750=2;
                          System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 617, column: 7
                          S42759=0;
                          armDest.setPresent();//sysj\conveyor_controller.sysj line: 619, column: 8
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
                if(manualMode_75.getprestatus()){//sysj\conveyor_controller.sysj line: 616, column: 12
                  lidLoaderReady_o.setPreempted();
                  S42750=3;
                  active[76]=1;
                  ends[76]=1;
                  tdone[76]=1;
                }
                else {
                  switch(S42759){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 618, column: 13
                        System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 621, column: 7
                        S42759=1;
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 619, column: 8
                        currsigs.addElement(armDest);
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 622, column: 13
                        System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 623, column: 7
                        S42759=2;
                        S42765=0;
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
                      switch(S42765){
                        case 0 : 
                          if(!empty.getprestatus()){//sysj\conveyor_controller.sysj line: 626, column: 14
                            S42765=1;
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
                          if(request.getprestatus()){//sysj\conveyor_controller.sysj line: 627, column: 14
                            System.out.println("New request");//sysj\conveyor_controller.sysj line: 628, column: 8
                            S42765=2;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 630, column: 9
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
                          if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 629, column: 14
                            System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 632, column: 8
                            S42765=3;
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 635, column: 9
                            currsigs.addElement(pusherExtend);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          else {
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 630, column: 9
                            currsigs.addElement(armDest);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 3 : 
                          if(pusherExtended.getprestatus()){//sysj\conveyor_controller.sysj line: 634, column: 14
                            System.out.println("Pusher extended");//sysj\conveyor_controller.sysj line: 637, column: 8
                            S42765=4;
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 635, column: 9
                            currsigs.addElement(pusherExtend);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 4 : 
                          if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 638, column: 14
                            System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 639, column: 8
                            S42765=5;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 642, column: 9
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
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 641, column: 14
                            System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 644, column: 8
                            S42765=6;
                            thread101494(tdone,ends);
                            thread101495(tdone,ends);
                            int biggest101496 = 0;
                            if(ends[77]>=biggest101496){
                              biggest101496=ends[77];
                            }
                            if(ends[78]>=biggest101496){
                              biggest101496=ends[78];
                            }
                            if(biggest101496 == 1){
                              active[76]=1;
                              ends[76]=1;
                              tdone[76]=1;
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 642, column: 9
                            currsigs.addElement(armSource);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 6 : 
                          thread101497(tdone,ends);
                          thread101498(tdone,ends);
                          int biggest101499 = 0;
                          if(ends[77]>=biggest101499){
                            biggest101499=ends[77];
                          }
                          if(ends[78]>=biggest101499){
                            biggest101499=ends[78];
                          }
                          if(biggest101499 == 1){
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          if(biggest101499 == 2){
                            ends[76]=2;
                            ;//sysj\conveyor_controller.sysj line: 646, column: 8
                            S42765=7;
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          //FINXME code
                          if(biggest101499 == 0){
                            S42765=7;
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 7 : 
                          if(!WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 662, column: 14
                            S42765=8;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 665, column: 9
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
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 664, column: 14
                            done_75.setPresent();//sysj\conveyor_controller.sysj line: 669, column: 8
                            currsigs.addElement(done_75);
                            S42765=9;
                            S42843=0;
                            if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 670, column: 8
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 670, column: 8
                              S42843=1;
                              active[76]=1;
                              ends[76]=1;
                              tdone[76]=1;
                            }
                            else {
                              S42838=0;
                              if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 670, column: 8
                                lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 670, column: 8
                                S42838=1;
                                if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 670, column: 8
                                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 670, column: 8
                                  ends[76]=2;
                                  ;//sysj\conveyor_controller.sysj line: 670, column: 8
                                  System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 672, column: 8
                                  S42765=10;
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
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 665, column: 9
                            currsigs.addElement(armSource);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          break;
                        
                        case 9 : 
                          switch(S42843){
                            case 0 : 
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 670, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 670, column: 8
                                S42843=1;
                                active[76]=1;
                                ends[76]=1;
                                tdone[76]=1;
                              }
                              else {
                                switch(S42838){
                                  case 0 : 
                                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 670, column: 8
                                      lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 670, column: 8
                                      S42838=1;
                                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 670, column: 8
                                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 670, column: 8
                                        ends[76]=2;
                                        ;//sysj\conveyor_controller.sysj line: 670, column: 8
                                        System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 672, column: 8
                                        S42765=10;
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
                                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 670, column: 8
                                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 670, column: 8
                                      ends[76]=2;
                                      ;//sysj\conveyor_controller.sysj line: 670, column: 8
                                      System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 672, column: 8
                                      S42765=10;
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
                              S42843=1;
                              S42843=0;
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 670, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 670, column: 8
                                S42843=1;
                                active[76]=1;
                                ends[76]=1;
                                tdone[76]=1;
                              }
                              else {
                                S42838=0;
                                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 670, column: 8
                                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 670, column: 8
                                  S42838=1;
                                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 670, column: 8
                                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 670, column: 8
                                    ends[76]=2;
                                    ;//sysj\conveyor_controller.sysj line: 670, column: 8
                                    System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 672, column: 8
                                    S42765=10;
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
                          S42765=10;
                          S42765=0;
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
                S42750=3;
                System.out.println("entering manual");//sysj\conveyor_controller.sysj line: 680, column: 6
                S42750=4;
                thread101500(tdone,ends);
                thread101501(tdone,ends);
                thread101502(tdone,ends);
                thread101503(tdone,ends);
                int biggest101504 = 0;
                if(ends[79]>=biggest101504){
                  biggest101504=ends[79];
                }
                if(ends[80]>=biggest101504){
                  biggest101504=ends[80];
                }
                if(ends[81]>=biggest101504){
                  biggest101504=ends[81];
                }
                if(ends[82]>=biggest101504){
                  biggest101504=ends[82];
                }
                if(biggest101504 == 1){
                  active[76]=1;
                  ends[76]=1;
                  tdone[76]=1;
                }
                break;
              
              case 4 : 
                if(autoMode_75.getprestatus()){//sysj\conveyor_controller.sysj line: 681, column: 12
                  lidLoaderReady_o.setPreempted();
                  S42750=0;
                  active[76]=1;
                  ends[76]=1;
                  tdone[76]=1;
                }
                else {
                  thread101505(tdone,ends);
                  thread101506(tdone,ends);
                  thread101507(tdone,ends);
                  thread101508(tdone,ends);
                  int biggest101509 = 0;
                  if(ends[79]>=biggest101509){
                    biggest101509=ends[79];
                  }
                  if(ends[80]>=biggest101509){
                    biggest101509=ends[80];
                  }
                  if(ends[81]>=biggest101509){
                    biggest101509=ends[81];
                  }
                  if(ends[82]>=biggest101509){
                    biggest101509=ends[82];
                  }
                  if(biggest101509 == 1){
                    active[76]=1;
                    ends[76]=1;
                    tdone[76]=1;
                  }
                  //FINXME code
                  if(biggest101509 == 0){
                    S42750=0;
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

  public void thread101490(int [] tdone, int [] ends){
        S100770=1;
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread101489(int [] tdone, int [] ends){
        S100767=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 724, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread101488(int [] tdone, int [] ends){
        S100800=1;
    S100774=0;
    if(bottleAtPos3_75.getprestatus()){//sysj\conveyor_controller.sysj line: 721, column: 20
      thread101489(tdone,ends);
      thread101490(tdone,ends);
      int biggest101491 = 0;
      if(ends[86]>=biggest101491){
        biggest101491=ends[86];
      }
      if(ends[87]>=biggest101491){
        biggest101491=ends[87];
      }
      if(biggest101491 == 1){
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
      }
    }
    else {
      S100774=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
  }

  public void thread101487(int [] tdone, int [] ends){
        S100762=1;
    S100706=0;
    S100686=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 711, column: 6
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 711, column: 6
      S100686=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
    else {
      S100681=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 711, column: 6
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 711, column: 6
        S100681=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 711, column: 6
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 711, column: 6
          ends[84]=2;
          ;//sysj\conveyor_controller.sysj line: 711, column: 6
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 712, column: 9
            bottleAtPos3_75.setPresent();//sysj\conveyor_controller.sysj line: 713, column: 7
            currsigs.addElement(bottleAtPos3_75);
            S100706=1;
            active[84]=1;
            ends[84]=1;
            tdone[84]=1;
          }
          else {
            S100706=1;
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

  public void thread101486(int [] tdone, int [] ends){
        S100679=1;
    S100678=0;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread101485(int [] tdone, int [] ends){
        S100658=1;
    S100657=0;
    S42689=0;
    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 612, column: 5
      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 612, column: 5
      S42689=1;
      active[76]=1;
      ends[76]=1;
      tdone[76]=1;
    }
    else {
      S42684=0;
      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 612, column: 5
        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 612, column: 5
        S42684=1;
        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 612, column: 5
          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 612, column: 5
          ends[76]=2;
          ;//sysj\conveyor_controller.sysj line: 612, column: 5
          S100657=1;
          S42750=0;
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
      switch(S100802){
        case 0 : 
          S100802=0;
          break RUN;
        
        case 1 : 
          S100802=2;
          S100802=2;
          manualMode_75.setClear();//sysj\conveyor_controller.sysj line: 610, column: 4
          autoMode_75.setClear();//sysj\conveyor_controller.sysj line: 610, column: 4
          bottleAtPos3_75.setClear();//sysj\conveyor_controller.sysj line: 610, column: 4
          done_75.setClear();//sysj\conveyor_controller.sysj line: 610, column: 4
          thread101485(tdone,ends);
          thread101486(tdone,ends);
          thread101487(tdone,ends);
          thread101488(tdone,ends);
          int biggest101492 = 0;
          if(ends[76]>=biggest101492){
            biggest101492=ends[76];
          }
          if(ends[83]>=biggest101492){
            biggest101492=ends[83];
          }
          if(ends[84]>=biggest101492){
            biggest101492=ends[84];
          }
          if(ends[85]>=biggest101492){
            biggest101492=ends[85];
          }
          if(biggest101492 == 1){
            active[75]=1;
            ends[75]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_75.setClear();//sysj\conveyor_controller.sysj line: 610, column: 4
          autoMode_75.setClear();//sysj\conveyor_controller.sysj line: 610, column: 4
          bottleAtPos3_75.setClear();//sysj\conveyor_controller.sysj line: 610, column: 4
          done_75.setClear();//sysj\conveyor_controller.sysj line: 610, column: 4
          thread101493(tdone,ends);
          thread101510(tdone,ends);
          thread101511(tdone,ends);
          thread101512(tdone,ends);
          int biggest101519 = 0;
          if(ends[76]>=biggest101519){
            biggest101519=ends[76];
          }
          if(ends[83]>=biggest101519){
            biggest101519=ends[83];
          }
          if(ends[84]>=biggest101519){
            biggest101519=ends[84];
          }
          if(ends[85]>=biggest101519){
            biggest101519=ends[85];
          }
          if(biggest101519 == 1){
            active[75]=1;
            ends[75]=1;
            break RUN;
          }
          //FINXME code
          if(biggest101519 == 0){
            S100802=0;
            active[75]=0;
            ends[75]=0;
            S100802=0;
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
