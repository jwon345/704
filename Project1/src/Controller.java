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
  private long __start_thread_93;//sysj\conveyor_controller.sysj line: 802, column: 32
  private int S210128 = 1;
  private int S209984 = 1;
  private int S209983 = 1;
  private int S152015 = 1;
  private int S152010 = 1;
  private int S152076 = 1;
  private int S152038 = 1;
  private int S152033 = 1;
  private int S152085 = 1;
  private int S152091 = 1;
  private int S152122 = 1;
  private int S152133 = 1;
  private int S152124 = 1;
  private int S152169 = 1;
  private int S152164 = 1;
  private int S154988 = 1;
  private int S154996 = 1;
  private int S155307 = 1;
  private int S155099 = 1;
  private int S155041 = 1;
  private int S155003 = 1;
  private int S154998 = 1;
  private int S155315 = 1;
  private int S210005 = 1;
  private int S210004 = 1;
  private int S210088 = 1;
  private int S210032 = 1;
  private int S210012 = 1;
  private int S210007 = 1;
  private int S210126 = 1;
  private int S210100 = 1;
  private int S210093 = 1;
  private int S210096 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread210970(int [] tdone, int [] ends){
        S210096=1;
    active[99]=1;
    ends[99]=1;
    tdone[99]=1;
  }

  public void thread210969(int [] tdone, int [] ends){
        S210093=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 840, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[98]=1;
    ends[98]=1;
    tdone[98]=1;
  }

  public void thread210967(int [] tdone, int [] ends){
        switch(S210096){
      case 0 : 
        active[99]=0;
        ends[99]=0;
        tdone[99]=1;
        break;
      
      case 1 : 
        if(done_87.getprestatus()){//sysj\conveyor_controller.sysj line: 844, column: 28
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

  public void thread210966(int [] tdone, int [] ends){
        switch(S210093){
      case 0 : 
        active[98]=0;
        ends[98]=0;
        tdone[98]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 840, column: 22
        currsigs.addElement(bottleAtPos3E);
        active[98]=1;
        ends[98]=1;
        tdone[98]=1;
        break;
      
    }
  }

  public void thread210965(int [] tdone, int [] ends){
        switch(S210126){
      case 0 : 
        active[97]=0;
        ends[97]=0;
        tdone[97]=1;
        break;
      
      case 1 : 
        switch(S210100){
          case 0 : 
            thread210966(tdone,ends);
            thread210967(tdone,ends);
            int biggest210968 = 0;
            if(ends[98]>=biggest210968){
              biggest210968=ends[98];
            }
            if(ends[99]>=biggest210968){
              biggest210968=ends[99];
            }
            if(biggest210968 == 1){
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            if(biggest210968 == 2){
              ends[97]=2;
              ;//sysj\conveyor_controller.sysj line: 838, column: 7
              S210100=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            //FINXME code
            if(biggest210968 == 0){
              ;//sysj\conveyor_controller.sysj line: 846, column: 19
              S210100=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            break;
          
          case 1 : 
            S210100=1;
            S210100=0;
            if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 837, column: 20
              thread210969(tdone,ends);
              thread210970(tdone,ends);
              int biggest210971 = 0;
              if(ends[98]>=biggest210971){
                biggest210971=ends[98];
              }
              if(ends[99]>=biggest210971){
                biggest210971=ends[99];
              }
              if(biggest210971 == 1){
                active[97]=1;
                ends[97]=1;
                tdone[97]=1;
              }
            }
            else {
              S210100=1;
              active[97]=1;
              ends[97]=1;
              tdone[97]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread210964(int [] tdone, int [] ends){
        switch(S210088){
      case 0 : 
        active[96]=0;
        ends[96]=0;
        tdone[96]=1;
        break;
      
      case 1 : 
        switch(S210032){
          case 0 : 
            switch(S210012){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 827, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 827, column: 6
                  S210012=1;
                  active[96]=1;
                  ends[96]=1;
                  tdone[96]=1;
                }
                else {
                  switch(S210007){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 827, column: 6
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 827, column: 6
                        S210007=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 827, column: 6
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 827, column: 6
                          ends[96]=2;
                          ;//sysj\conveyor_controller.sysj line: 827, column: 6
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 828, column: 9
                            bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 829, column: 7
                            currsigs.addElement(bottleAtPos3_87);
                            S210032=1;
                            active[96]=1;
                            ends[96]=1;
                            tdone[96]=1;
                          }
                          else {
                            S210032=1;
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
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 827, column: 6
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 827, column: 6
                        ends[96]=2;
                        ;//sysj\conveyor_controller.sysj line: 827, column: 6
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 828, column: 9
                          bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 829, column: 7
                          currsigs.addElement(bottleAtPos3_87);
                          S210032=1;
                          active[96]=1;
                          ends[96]=1;
                          tdone[96]=1;
                        }
                        else {
                          S210032=1;
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
                S210012=1;
                S210012=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 827, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 827, column: 6
                  S210012=1;
                  active[96]=1;
                  ends[96]=1;
                  tdone[96]=1;
                }
                else {
                  S210007=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 827, column: 6
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 827, column: 6
                    S210007=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 827, column: 6
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 827, column: 6
                      ends[96]=2;
                      ;//sysj\conveyor_controller.sysj line: 827, column: 6
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 828, column: 9
                        bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 829, column: 7
                        currsigs.addElement(bottleAtPos3_87);
                        S210032=1;
                        active[96]=1;
                        ends[96]=1;
                        tdone[96]=1;
                      }
                      else {
                        S210032=1;
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
            S210032=1;
            S210032=0;
            S210012=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 827, column: 6
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 827, column: 6
              S210012=1;
              active[96]=1;
              ends[96]=1;
              tdone[96]=1;
            }
            else {
              S210007=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 827, column: 6
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 827, column: 6
                S210007=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 827, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 827, column: 6
                  ends[96]=2;
                  ;//sysj\conveyor_controller.sysj line: 827, column: 6
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 828, column: 9
                    bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 829, column: 7
                    currsigs.addElement(bottleAtPos3_87);
                    S210032=1;
                    active[96]=1;
                    ends[96]=1;
                    tdone[96]=1;
                  }
                  else {
                    S210032=1;
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

  public void thread210963(int [] tdone, int [] ends){
        switch(S210005){
      case 0 : 
        active[95]=0;
        ends[95]=0;
        tdone[95]=1;
        break;
      
      case 1 : 
        switch(S210004){
          case 0 : 
            if(mode.getprestatus()){//sysj\conveyor_controller.sysj line: 811, column: 11
              S210004=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 813, column: 9
                autoMode_87.setPresent();//sysj\conveyor_controller.sysj line: 814, column: 7
                currsigs.addElement(autoMode_87);
                active[95]=1;
                ends[95]=1;
                tdone[95]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 816, column: 14
                  manualMode_87.setPresent();//sysj\conveyor_controller.sysj line: 817, column: 7
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
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 813, column: 9
              autoMode_87.setPresent();//sysj\conveyor_controller.sysj line: 814, column: 7
              currsigs.addElement(autoMode_87);
              active[95]=1;
              ends[95]=1;
              tdone[95]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 816, column: 14
                manualMode_87.setPresent();//sysj\conveyor_controller.sysj line: 817, column: 7
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

  public void thread210961(int [] tdone, int [] ends){
        switch(S155315){
      case 0 : 
        active[94]=0;
        ends[94]=0;
        tdone[94]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 804, column: 21
          armDest.setPresent();//sysj\conveyor_controller.sysj line: 804, column: 31
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

  public void thread210960(int [] tdone, int [] ends){
        switch(S155307){
      case 0 : 
        active[93]=0;
        ends[93]=0;
        tdone[93]=1;
        break;
      
      case 1 : 
        switch(S155099){
          case 0 : 
            switch(S155041){
              case 0 : 
                switch(S155003){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 802, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 802, column: 48
                      S155003=1;
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                    else {
                      switch(S154998){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 802, column: 48
                            lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 802, column: 48
                            S154998=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 802, column: 48
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 802, column: 48
                              ends[93]=2;
                              ;//sysj\conveyor_controller.sysj line: 802, column: 48
                              S155041=1;
                              __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 802, column: 32
                              if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 802, column: 32
                                ends[93]=2;
                                ;//sysj\conveyor_controller.sysj line: 802, column: 32
                                done_87.setPresent();//sysj\conveyor_controller.sysj line: 802, column: 100
                                currsigs.addElement(done_87);
                                S155099=1;
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
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 802, column: 48
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 802, column: 48
                            ends[93]=2;
                            ;//sysj\conveyor_controller.sysj line: 802, column: 48
                            S155041=1;
                            __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 802, column: 32
                            if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 802, column: 32
                              ends[93]=2;
                              ;//sysj\conveyor_controller.sysj line: 802, column: 32
                              done_87.setPresent();//sysj\conveyor_controller.sysj line: 802, column: 100
                              currsigs.addElement(done_87);
                              S155099=1;
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
                    S155003=1;
                    S155003=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 802, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 802, column: 48
                      S155003=1;
                      active[93]=1;
                      ends[93]=1;
                      tdone[93]=1;
                    }
                    else {
                      S154998=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 802, column: 48
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 802, column: 48
                        S154998=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 802, column: 48
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 802, column: 48
                          ends[93]=2;
                          ;//sysj\conveyor_controller.sysj line: 802, column: 48
                          S155041=1;
                          __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 802, column: 32
                          if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 802, column: 32
                            ends[93]=2;
                            ;//sysj\conveyor_controller.sysj line: 802, column: 32
                            done_87.setPresent();//sysj\conveyor_controller.sysj line: 802, column: 100
                            currsigs.addElement(done_87);
                            S155099=1;
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
                if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 802, column: 32
                  ends[93]=2;
                  ;//sysj\conveyor_controller.sysj line: 802, column: 32
                  done_87.setPresent();//sysj\conveyor_controller.sysj line: 802, column: 100
                  currsigs.addElement(done_87);
                  S155099=1;
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
            S155099=1;
            S155099=0;
            if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 802, column: 21
              armSource.setPresent();//sysj\conveyor_controller.sysj line: 802, column: 33
              currsigs.addElement(armSource);
              S155041=0;
              S155003=0;
              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 802, column: 48
                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 802, column: 48
                S155003=1;
                active[93]=1;
                ends[93]=1;
                tdone[93]=1;
              }
              else {
                S154998=0;
                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 802, column: 48
                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 802, column: 48
                  S154998=1;
                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 802, column: 48
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 802, column: 48
                    ends[93]=2;
                    ;//sysj\conveyor_controller.sysj line: 802, column: 48
                    S155041=1;
                    __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 802, column: 32
                    if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 802, column: 32
                      ends[93]=2;
                      ;//sysj\conveyor_controller.sysj line: 802, column: 32
                      done_87.setPresent();//sysj\conveyor_controller.sysj line: 802, column: 100
                      currsigs.addElement(done_87);
                      S155099=1;
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
              S155099=1;
              active[93]=1;
              ends[93]=1;
              tdone[93]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread210959(int [] tdone, int [] ends){
        switch(S154996){
      case 0 : 
        active[92]=0;
        ends[92]=0;
        tdone[92]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 800, column: 21
          vacOn.setPresent();//sysj\conveyor_controller.sysj line: 800, column: 29
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

  public void thread210958(int [] tdone, int [] ends){
        switch(S154988){
      case 0 : 
        active[91]=0;
        ends[91]=0;
        tdone[91]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 798, column: 21
          pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 798, column: 36
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

  public void thread210956(int [] tdone, int [] ends){
        S155315=1;
    if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 804, column: 21
      armDest.setPresent();//sysj\conveyor_controller.sysj line: 804, column: 31
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

  public void thread210955(int [] tdone, int [] ends){
        S155307=1;
    S155099=0;
    if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 802, column: 21
      armSource.setPresent();//sysj\conveyor_controller.sysj line: 802, column: 33
      currsigs.addElement(armSource);
      S155041=0;
      S155003=0;
      if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 802, column: 48
        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 802, column: 48
        S155003=1;
        active[93]=1;
        ends[93]=1;
        tdone[93]=1;
      }
      else {
        S154998=0;
        if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 802, column: 48
          lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 802, column: 48
          S154998=1;
          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 802, column: 48
            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 802, column: 48
            ends[93]=2;
            ;//sysj\conveyor_controller.sysj line: 802, column: 48
            S155041=1;
            __start_thread_93 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 802, column: 32
            if(com.systemj.Timer.getMs() - __start_thread_93 >= 4000){//sysj\conveyor_controller.sysj line: 802, column: 32
              ends[93]=2;
              ;//sysj\conveyor_controller.sysj line: 802, column: 32
              done_87.setPresent();//sysj\conveyor_controller.sysj line: 802, column: 100
              currsigs.addElement(done_87);
              S155099=1;
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
      S155099=1;
      active[93]=1;
      ends[93]=1;
      tdone[93]=1;
    }
  }

  public void thread210954(int [] tdone, int [] ends){
        S154996=1;
    if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 800, column: 21
      vacOn.setPresent();//sysj\conveyor_controller.sysj line: 800, column: 29
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

  public void thread210953(int [] tdone, int [] ends){
        S154988=1;
    if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 798, column: 21
      pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 798, column: 36
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

  public void thread210951(int [] tdone, int [] ends){
        switch(S152133){
      case 0 : 
        active[90]=0;
        ends[90]=0;
        tdone[90]=1;
        break;
      
      case 1 : 
        switch(S152124){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 768, column: 16
              System.out.println("WP gripped");//sysj\conveyor_controller.sysj line: 769, column: 10
              S152124=1;
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 771, column: 11
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
            if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 770, column: 16
              System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 773, column: 10
              ends[90]=2;
              tdone[90]=1;
            }
            else {
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 771, column: 11
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

  public void thread210950(int [] tdone, int [] ends){
        switch(S152122){
      case 0 : 
        active[89]=0;
        ends[89]=0;
        tdone[89]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\conveyor_controller.sysj line: 764, column: 10
        currsigs.addElement(vacOn);
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
        break;
      
    }
  }

  public void thread210948(int [] tdone, int [] ends){
        S152133=1;
    S152124=0;
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread210947(int [] tdone, int [] ends){
        S152122=1;
    vacOn.setPresent();//sysj\conveyor_controller.sysj line: 764, column: 10
    currsigs.addElement(vacOn);
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread210946(int [] tdone, int [] ends){
        switch(S209984){
      case 0 : 
        active[88]=0;
        ends[88]=0;
        tdone[88]=1;
        break;
      
      case 1 : 
        switch(S209983){
          case 0 : 
            switch(S152015){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 728, column: 5
                  S152015=1;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  switch(S152010){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 728, column: 5
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 728, column: 5
                        S152010=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 728, column: 5
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 728, column: 5
                          ends[88]=2;
                          ;//sysj\conveyor_controller.sysj line: 728, column: 5
                          S209983=1;
                          S152076=0;
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
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 728, column: 5
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 728, column: 5
                        ends[88]=2;
                        ;//sysj\conveyor_controller.sysj line: 728, column: 5
                        S209983=1;
                        S152076=0;
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
                S152015=1;
                S152015=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 728, column: 5
                  S152015=1;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  S152010=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 728, column: 5
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 728, column: 5
                    S152010=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 728, column: 5
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 728, column: 5
                      ends[88]=2;
                      ;//sysj\conveyor_controller.sysj line: 728, column: 5
                      S209983=1;
                      S152076=0;
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
            switch(S152076){
              case 0 : 
                if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 730, column: 13
                  S152076=1;
                  S152038=0;
                  if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 731, column: 6
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 731, column: 6
                    S152038=1;
                    active[88]=1;
                    ends[88]=1;
                    tdone[88]=1;
                  }
                  else {
                    S152033=0;
                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 731, column: 6
                      lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 731, column: 6
                      S152033=1;
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 731, column: 6
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 731, column: 6
                        ends[88]=2;
                        ;//sysj\conveyor_controller.sysj line: 731, column: 6
                        S152076=2;
                        System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 733, column: 7
                        S152085=0;
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 735, column: 8
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
                switch(S152038){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 731, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 731, column: 6
                      S152038=1;
                      active[88]=1;
                      ends[88]=1;
                      tdone[88]=1;
                    }
                    else {
                      switch(S152033){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 731, column: 6
                            lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 731, column: 6
                            S152033=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 731, column: 6
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 731, column: 6
                              ends[88]=2;
                              ;//sysj\conveyor_controller.sysj line: 731, column: 6
                              S152076=2;
                              System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 733, column: 7
                              S152085=0;
                              armDest.setPresent();//sysj\conveyor_controller.sysj line: 735, column: 8
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
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 731, column: 6
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 731, column: 6
                            ends[88]=2;
                            ;//sysj\conveyor_controller.sysj line: 731, column: 6
                            S152076=2;
                            System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 733, column: 7
                            S152085=0;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 735, column: 8
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
                    S152038=1;
                    S152038=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 731, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 731, column: 6
                      S152038=1;
                      active[88]=1;
                      ends[88]=1;
                      tdone[88]=1;
                    }
                    else {
                      S152033=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 731, column: 6
                        lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 731, column: 6
                        S152033=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 731, column: 6
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 731, column: 6
                          ends[88]=2;
                          ;//sysj\conveyor_controller.sysj line: 731, column: 6
                          S152076=2;
                          System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 733, column: 7
                          S152085=0;
                          armDest.setPresent();//sysj\conveyor_controller.sysj line: 735, column: 8
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
                if(manualMode_87.getprestatus()){//sysj\conveyor_controller.sysj line: 732, column: 12
                  lidLoaderReady_o.setPreempted();
                  S152076=3;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  switch(S152085){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 734, column: 13
                        System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 737, column: 7
                        S152085=1;
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 735, column: 8
                        currsigs.addElement(armDest);
                        active[88]=1;
                        ends[88]=1;
                        tdone[88]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 738, column: 13
                        System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 739, column: 7
                        S152085=2;
                        S152091=0;
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
                      switch(S152091){
                        case 0 : 
                          if(!empty.getprestatus()){//sysj\conveyor_controller.sysj line: 742, column: 14
                            S152091=1;
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
                          if(request.getprestatus()){//sysj\conveyor_controller.sysj line: 743, column: 14
                            System.out.println("New request");//sysj\conveyor_controller.sysj line: 744, column: 8
                            S152091=2;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 746, column: 9
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
                          if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 745, column: 14
                            System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 748, column: 8
                            S152091=3;
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 751, column: 9
                            currsigs.addElement(pusherExtend);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 746, column: 9
                            currsigs.addElement(armDest);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 3 : 
                          if(pusherExtended.getprestatus()){//sysj\conveyor_controller.sysj line: 750, column: 14
                            System.out.println("Pusher extended");//sysj\conveyor_controller.sysj line: 753, column: 8
                            S152091=4;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 751, column: 9
                            currsigs.addElement(pusherExtend);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 4 : 
                          if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 754, column: 14
                            System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 755, column: 8
                            S152091=5;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 758, column: 9
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
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 757, column: 14
                            System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 760, column: 8
                            S152091=6;
                            thread210947(tdone,ends);
                            thread210948(tdone,ends);
                            int biggest210949 = 0;
                            if(ends[89]>=biggest210949){
                              biggest210949=ends[89];
                            }
                            if(ends[90]>=biggest210949){
                              biggest210949=ends[90];
                            }
                            if(biggest210949 == 1){
                              active[88]=1;
                              ends[88]=1;
                              tdone[88]=1;
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 758, column: 9
                            currsigs.addElement(armSource);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 6 : 
                          thread210950(tdone,ends);
                          thread210951(tdone,ends);
                          int biggest210952 = 0;
                          if(ends[89]>=biggest210952){
                            biggest210952=ends[89];
                          }
                          if(ends[90]>=biggest210952){
                            biggest210952=ends[90];
                          }
                          if(biggest210952 == 1){
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          if(biggest210952 == 2){
                            ends[88]=2;
                            ;//sysj\conveyor_controller.sysj line: 762, column: 8
                            S152091=7;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          //FINXME code
                          if(biggest210952 == 0){
                            S152091=7;
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 7 : 
                          if(!WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 778, column: 14
                            S152091=8;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 781, column: 9
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
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 780, column: 14
                            done_87.setPresent();//sysj\conveyor_controller.sysj line: 785, column: 8
                            currsigs.addElement(done_87);
                            S152091=9;
                            S152169=0;
                            if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 786, column: 8
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 786, column: 8
                              S152169=1;
                              active[88]=1;
                              ends[88]=1;
                              tdone[88]=1;
                            }
                            else {
                              S152164=0;
                              if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 786, column: 8
                                lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 786, column: 8
                                S152164=1;
                                if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 786, column: 8
                                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 786, column: 8
                                  ends[88]=2;
                                  ;//sysj\conveyor_controller.sysj line: 786, column: 8
                                  System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 788, column: 8
                                  S152091=10;
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
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 781, column: 9
                            currsigs.addElement(armSource);
                            active[88]=1;
                            ends[88]=1;
                            tdone[88]=1;
                          }
                          break;
                        
                        case 9 : 
                          switch(S152169){
                            case 0 : 
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 786, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 786, column: 8
                                S152169=1;
                                active[88]=1;
                                ends[88]=1;
                                tdone[88]=1;
                              }
                              else {
                                switch(S152164){
                                  case 0 : 
                                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 786, column: 8
                                      lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 786, column: 8
                                      S152164=1;
                                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 786, column: 8
                                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 786, column: 8
                                        ends[88]=2;
                                        ;//sysj\conveyor_controller.sysj line: 786, column: 8
                                        System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 788, column: 8
                                        S152091=10;
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
                                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 786, column: 8
                                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 786, column: 8
                                      ends[88]=2;
                                      ;//sysj\conveyor_controller.sysj line: 786, column: 8
                                      System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 788, column: 8
                                      S152091=10;
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
                              S152169=1;
                              S152169=0;
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 786, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 786, column: 8
                                S152169=1;
                                active[88]=1;
                                ends[88]=1;
                                tdone[88]=1;
                              }
                              else {
                                S152164=0;
                                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 786, column: 8
                                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 786, column: 8
                                  S152164=1;
                                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 786, column: 8
                                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 786, column: 8
                                    ends[88]=2;
                                    ;//sysj\conveyor_controller.sysj line: 786, column: 8
                                    System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 788, column: 8
                                    S152091=10;
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
                          S152091=10;
                          S152091=0;
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
                S152076=3;
                System.out.println("entering manual");//sysj\conveyor_controller.sysj line: 796, column: 6
                S152076=4;
                thread210953(tdone,ends);
                thread210954(tdone,ends);
                thread210955(tdone,ends);
                thread210956(tdone,ends);
                int biggest210957 = 0;
                if(ends[91]>=biggest210957){
                  biggest210957=ends[91];
                }
                if(ends[92]>=biggest210957){
                  biggest210957=ends[92];
                }
                if(ends[93]>=biggest210957){
                  biggest210957=ends[93];
                }
                if(ends[94]>=biggest210957){
                  biggest210957=ends[94];
                }
                if(biggest210957 == 1){
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                break;
              
              case 4 : 
                if(autoMode_87.getprestatus()){//sysj\conveyor_controller.sysj line: 797, column: 12
                  lidLoaderReady_o.setPreempted();
                  S152076=0;
                  active[88]=1;
                  ends[88]=1;
                  tdone[88]=1;
                }
                else {
                  thread210958(tdone,ends);
                  thread210959(tdone,ends);
                  thread210960(tdone,ends);
                  thread210961(tdone,ends);
                  int biggest210962 = 0;
                  if(ends[91]>=biggest210962){
                    biggest210962=ends[91];
                  }
                  if(ends[92]>=biggest210962){
                    biggest210962=ends[92];
                  }
                  if(ends[93]>=biggest210962){
                    biggest210962=ends[93];
                  }
                  if(ends[94]>=biggest210962){
                    biggest210962=ends[94];
                  }
                  if(biggest210962 == 1){
                    active[88]=1;
                    ends[88]=1;
                    tdone[88]=1;
                  }
                  //FINXME code
                  if(biggest210962 == 0){
                    S152076=0;
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

  public void thread210943(int [] tdone, int [] ends){
        S210096=1;
    active[99]=1;
    ends[99]=1;
    tdone[99]=1;
  }

  public void thread210942(int [] tdone, int [] ends){
        S210093=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 840, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[98]=1;
    ends[98]=1;
    tdone[98]=1;
  }

  public void thread210941(int [] tdone, int [] ends){
        S210126=1;
    S210100=0;
    if(bottleAtPos3_87.getprestatus()){//sysj\conveyor_controller.sysj line: 837, column: 20
      thread210942(tdone,ends);
      thread210943(tdone,ends);
      int biggest210944 = 0;
      if(ends[98]>=biggest210944){
        biggest210944=ends[98];
      }
      if(ends[99]>=biggest210944){
        biggest210944=ends[99];
      }
      if(biggest210944 == 1){
        active[97]=1;
        ends[97]=1;
        tdone[97]=1;
      }
    }
    else {
      S210100=1;
      active[97]=1;
      ends[97]=1;
      tdone[97]=1;
    }
  }

  public void thread210940(int [] tdone, int [] ends){
        S210088=1;
    S210032=0;
    S210012=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 827, column: 6
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 827, column: 6
      S210012=1;
      active[96]=1;
      ends[96]=1;
      tdone[96]=1;
    }
    else {
      S210007=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 827, column: 6
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 827, column: 6
        S210007=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 827, column: 6
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 827, column: 6
          ends[96]=2;
          ;//sysj\conveyor_controller.sysj line: 827, column: 6
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 828, column: 9
            bottleAtPos3_87.setPresent();//sysj\conveyor_controller.sysj line: 829, column: 7
            currsigs.addElement(bottleAtPos3_87);
            S210032=1;
            active[96]=1;
            ends[96]=1;
            tdone[96]=1;
          }
          else {
            S210032=1;
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

  public void thread210939(int [] tdone, int [] ends){
        S210005=1;
    S210004=0;
    active[95]=1;
    ends[95]=1;
    tdone[95]=1;
  }

  public void thread210938(int [] tdone, int [] ends){
        S209984=1;
    S209983=0;
    S152015=0;
    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 5
      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 728, column: 5
      S152015=1;
      active[88]=1;
      ends[88]=1;
      tdone[88]=1;
    }
    else {
      S152010=0;
      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 728, column: 5
        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 728, column: 5
        S152010=1;
        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 728, column: 5
          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 728, column: 5
          ends[88]=2;
          ;//sysj\conveyor_controller.sysj line: 728, column: 5
          S209983=1;
          S152076=0;
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
      switch(S210128){
        case 0 : 
          S210128=0;
          break RUN;
        
        case 1 : 
          S210128=2;
          S210128=2;
          manualMode_87.setClear();//sysj\conveyor_controller.sysj line: 726, column: 4
          autoMode_87.setClear();//sysj\conveyor_controller.sysj line: 726, column: 4
          bottleAtPos3_87.setClear();//sysj\conveyor_controller.sysj line: 726, column: 4
          done_87.setClear();//sysj\conveyor_controller.sysj line: 726, column: 4
          thread210938(tdone,ends);
          thread210939(tdone,ends);
          thread210940(tdone,ends);
          thread210941(tdone,ends);
          int biggest210945 = 0;
          if(ends[88]>=biggest210945){
            biggest210945=ends[88];
          }
          if(ends[95]>=biggest210945){
            biggest210945=ends[95];
          }
          if(ends[96]>=biggest210945){
            biggest210945=ends[96];
          }
          if(ends[97]>=biggest210945){
            biggest210945=ends[97];
          }
          if(biggest210945 == 1){
            active[87]=1;
            ends[87]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_87.setClear();//sysj\conveyor_controller.sysj line: 726, column: 4
          autoMode_87.setClear();//sysj\conveyor_controller.sysj line: 726, column: 4
          bottleAtPos3_87.setClear();//sysj\conveyor_controller.sysj line: 726, column: 4
          done_87.setClear();//sysj\conveyor_controller.sysj line: 726, column: 4
          thread210946(tdone,ends);
          thread210963(tdone,ends);
          thread210964(tdone,ends);
          thread210965(tdone,ends);
          int biggest210972 = 0;
          if(ends[88]>=biggest210972){
            biggest210972=ends[88];
          }
          if(ends[95]>=biggest210972){
            biggest210972=ends[95];
          }
          if(ends[96]>=biggest210972){
            biggest210972=ends[96];
          }
          if(ends[97]>=biggest210972){
            biggest210972=ends[97];
          }
          if(biggest210972 == 1){
            active[87]=1;
            ends[87]=1;
            break RUN;
          }
          //FINXME code
          if(biggest210972 == 0){
            S210128=0;
            active[87]=0;
            ends[87]=0;
            S210128=0;
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
