import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class RotaryController extends ClockDomain{
  public RotaryController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public input_Channel convReady_in = new input_Channel();
  public input_Channel fillerReady_in = new input_Channel();
  public input_Channel capperReady_in = new input_Channel();
  public input_Channel lidLoaderReady_in = new input_Channel();
  public input_Channel checkFive_in = new input_Channel();
  public input_Channel checkOne_in = new input_Channel();
  public output_Channel rotated_o = new output_Channel();
  private Signal cvR_26;
  private Signal fR_26;
  private Signal cR_26;
  private Signal lR_26;
  private Signal bottleAtPos5_26;
  private long __start_thread_33;//sysj\conveyor_controller.sysj line: 285, column: 44
  private long __start_thread_27;//sysj\conveyor_controller.sysj line: 244, column: 7
  private int i_thread_27;//sysj\conveyor_controller.sysj line: 293, column: 10
  private int S38244 = 1;
  private int S3745 = 1;
  private int S3641 = 1;
  private int S3636 = 1;
  private int S3663 = 1;
  private int S3658 = 1;
  private int S3752 = 1;
  private int S3747 = 1;
  private int S3884 = 1;
  private int S3879 = 1;
  private int S6953 = 1;
  private int S4066 = 1;
  private int S4056 = 1;
  private int S4059 = 1;
  private int S4062 = 1;
  private int S4065 = 1;
  private int S4080 = 1;
  private int S4103 = 1;
  private int S4119 = 1;
  private int S4222 = 1;
  private int S4217 = 1;
  private int S7351 = 1;
  private int S7052 = 1;
  private int S6986 = 1;
  private int S6978 = 1;
  private int S6977 = 1;
  private int S6961 = 1;
  private int S6956 = 1;
  private int S6984 = 1;
  private int S7151 = 1;
  private int S7085 = 1;
  private int S7077 = 1;
  private int S7076 = 1;
  private int S7060 = 1;
  private int S7055 = 1;
  private int S7083 = 1;
  private int S7250 = 1;
  private int S7184 = 1;
  private int S7176 = 1;
  private int S7175 = 1;
  private int S7159 = 1;
  private int S7154 = 1;
  private int S7182 = 1;
  private int S7349 = 1;
  private int S7283 = 1;
  private int S7275 = 1;
  private int S7274 = 1;
  private int S7258 = 1;
  private int S7253 = 1;
  private int S7281 = 1;
  private int S7434 = 1;
  private int S7378 = 1;
  private int S7358 = 1;
  private int S7353 = 1;
  private int S7472 = 1;
  private int S7446 = 1;
  private int S7439 = 1;
  private int S7442 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread212923(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212922(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212920(int [] tdone, int [] ends){
        switch(S7442){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_controller.sysj line: 343, column: 29
          ends[50]=2;
          tdone[50]=1;
        }
        else {
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        break;
      
    }
  }

  public void thread212919(int [] tdone, int [] ends){
        switch(S7439){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
        currsigs.addElement(bottleAtPos5E);
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
        break;
      
    }
  }

  public void thread212918(int [] tdone, int [] ends){
        switch(S7472){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        switch(S7446){
          case 0 : 
            thread212919(tdone,ends);
            thread212920(tdone,ends);
            int biggest212921 = 0;
            if(ends[49]>=biggest212921){
              biggest212921=ends[49];
            }
            if(ends[50]>=biggest212921){
              biggest212921=ends[50];
            }
            if(biggest212921 == 1){
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            if(biggest212921 == 2){
              ends[48]=2;
              ;//sysj\conveyor_controller.sysj line: 337, column: 34
              S7446=1;
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            //FINXME code
            if(biggest212921 == 0){
              ;//sysj\conveyor_controller.sysj line: 345, column: 20
              S7446=1;
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            break;
          
          case 1 : 
            S7446=1;
            S7446=0;
            if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
              thread212922(tdone,ends);
              thread212923(tdone,ends);
              int biggest212924 = 0;
              if(ends[49]>=biggest212924){
                biggest212924=ends[49];
              }
              if(ends[50]>=biggest212924){
                biggest212924=ends[50];
              }
              if(biggest212924 == 1){
                active[48]=1;
                ends[48]=1;
                tdone[48]=1;
              }
            }
            else {
              S7446=1;
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212917(int [] tdone, int [] ends){
        switch(S7434){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        switch(S7378){
          case 0 : 
            switch(S7358){
              case 0 : 
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
                  S7358=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  switch(S7353){
                    case 0 : 
                      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
                        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
                        S7353=1;
                        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
                          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
                          ends[47]=2;
                          ;//sysj\conveyor_controller.sysj line: 321, column: 7
                          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
                            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
                            currsigs.addElement(bottleAtPos5_26);
                            S7378=1;
                            active[47]=1;
                            ends[47]=1;
                            tdone[47]=1;
                          }
                          else {
                            S7378=1;
                            active[47]=1;
                            ends[47]=1;
                            tdone[47]=1;
                          }
                        }
                        else {
                          active[47]=1;
                          ends[47]=1;
                          tdone[47]=1;
                        }
                      }
                      else {
                        active[47]=1;
                        ends[47]=1;
                        tdone[47]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
                        checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
                        ends[47]=2;
                        ;//sysj\conveyor_controller.sysj line: 321, column: 7
                        if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
                          bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
                          currsigs.addElement(bottleAtPos5_26);
                          S7378=1;
                          active[47]=1;
                          ends[47]=1;
                          tdone[47]=1;
                        }
                        else {
                          S7378=1;
                          active[47]=1;
                          ends[47]=1;
                          tdone[47]=1;
                        }
                      }
                      else {
                        active[47]=1;
                        ends[47]=1;
                        tdone[47]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7358=1;
                S7358=0;
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
                  S7358=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  S7353=0;
                  if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
                    checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
                    S7353=1;
                    if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
                      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
                      ends[47]=2;
                      ;//sysj\conveyor_controller.sysj line: 321, column: 7
                      if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
                        bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
                        currsigs.addElement(bottleAtPos5_26);
                        S7378=1;
                        active[47]=1;
                        ends[47]=1;
                        tdone[47]=1;
                      }
                      else {
                        S7378=1;
                        active[47]=1;
                        ends[47]=1;
                        tdone[47]=1;
                      }
                    }
                    else {
                      active[47]=1;
                      ends[47]=1;
                      tdone[47]=1;
                    }
                  }
                  else {
                    active[47]=1;
                    ends[47]=1;
                    tdone[47]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S7378=1;
            S7378=0;
            S7358=0;
            if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
              checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
              S7358=1;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            else {
              S7353=0;
              if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
                checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
                S7353=1;
                if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
                  ends[47]=2;
                  ;//sysj\conveyor_controller.sysj line: 321, column: 7
                  if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
                    bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
                    currsigs.addElement(bottleAtPos5_26);
                    S7378=1;
                    active[47]=1;
                    ends[47]=1;
                    tdone[47]=1;
                  }
                  else {
                    S7378=1;
                    active[47]=1;
                    ends[47]=1;
                    tdone[47]=1;
                  }
                }
                else {
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
              }
              else {
                active[47]=1;
                ends[47]=1;
                tdone[47]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212914(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212913(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212911(int [] tdone, int [] ends){
        switch(S7281){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
        currsigs.addElement(lR_26);
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
        break;
      
    }
  }

  public void thread212910(int [] tdone, int [] ends){
        switch(S7275){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S7274){
          case 0 : 
            switch(S7258){
              case 0 : 
                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7258=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
                else {
                  switch(S7253){
                    case 0 : 
                      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7253=1;
                        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[45]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S7274=1;
                          active[45]=1;
                          ends[45]=1;
                          tdone[45]=1;
                        }
                        else {
                          active[45]=1;
                          ends[45]=1;
                          tdone[45]=1;
                        }
                      }
                      else {
                        active[45]=1;
                        ends[45]=1;
                        tdone[45]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                        ends[45]=2;
                        ;//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7274=1;
                        active[45]=1;
                        ends[45]=1;
                        tdone[45]=1;
                      }
                      else {
                        active[45]=1;
                        ends[45]=1;
                        tdone[45]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7258=1;
                S7258=0;
                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7258=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
                else {
                  S7253=0;
                  if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S7253=1;
                    if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[45]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S7274=1;
                      active[45]=1;
                      ends[45]=1;
                      tdone[45]=1;
                    }
                    else {
                      active[45]=1;
                      ends[45]=1;
                      tdone[45]=1;
                    }
                  }
                  else {
                    active[45]=1;
                    ends[45]=1;
                    tdone[45]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S7274=1;
            S7274=2;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
            break;
          
          case 2 : 
            S7274=2;
            lidLoaderReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[45]=2;
            tdone[45]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread212909(int [] tdone, int [] ends){
        switch(S7349){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        switch(S7283){
          case 0 : 
            thread212910(tdone,ends);
            thread212911(tdone,ends);
            int biggest212912 = 0;
            if(ends[45]>=biggest212912){
              biggest212912=ends[45];
            }
            if(ends[46]>=biggest212912){
              biggest212912=ends[46];
            }
            if(biggest212912 == 1){
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            if(biggest212912 == 2){
              ends[44]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S7283=1;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            //FINXME code
            if(biggest212912 == 0){
              S7283=1;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
          case 1 : 
            S7283=1;
            S7283=0;
            thread212913(tdone,ends);
            thread212914(tdone,ends);
            int biggest212915 = 0;
            if(ends[45]>=biggest212915){
              biggest212915=ends[45];
            }
            if(ends[46]>=biggest212915){
              biggest212915=ends[46];
            }
            if(biggest212915 == 1){
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212907(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212906(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212904(int [] tdone, int [] ends){
        switch(S7182){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
        currsigs.addElement(cR_26);
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
        break;
      
    }
  }

  public void thread212903(int [] tdone, int [] ends){
        switch(S7176){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S7175){
          case 0 : 
            switch(S7159){
              case 0 : 
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7159=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  switch(S7154){
                    case 0 : 
                      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7154=1;
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[42]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S7175=1;
                          active[42]=1;
                          ends[42]=1;
                          tdone[42]=1;
                        }
                        else {
                          active[42]=1;
                          ends[42]=1;
                          tdone[42]=1;
                        }
                      }
                      else {
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                        ends[42]=2;
                        ;//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7175=1;
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      else {
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7159=1;
                S7159=0;
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7159=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  S7154=0;
                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S7154=1;
                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[42]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S7175=1;
                      active[42]=1;
                      ends[42]=1;
                      tdone[42]=1;
                    }
                    else {
                      active[42]=1;
                      ends[42]=1;
                      tdone[42]=1;
                    }
                  }
                  else {
                    active[42]=1;
                    ends[42]=1;
                    tdone[42]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S7175=1;
            S7175=2;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
            break;
          
          case 2 : 
            S7175=2;
            capperReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[42]=2;
            tdone[42]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread212902(int [] tdone, int [] ends){
        switch(S7250){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        switch(S7184){
          case 0 : 
            thread212903(tdone,ends);
            thread212904(tdone,ends);
            int biggest212905 = 0;
            if(ends[42]>=biggest212905){
              biggest212905=ends[42];
            }
            if(ends[43]>=biggest212905){
              biggest212905=ends[43];
            }
            if(biggest212905 == 1){
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            if(biggest212905 == 2){
              ends[41]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S7184=1;
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            //FINXME code
            if(biggest212905 == 0){
              S7184=1;
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            break;
          
          case 1 : 
            S7184=1;
            S7184=0;
            thread212906(tdone,ends);
            thread212907(tdone,ends);
            int biggest212908 = 0;
            if(ends[42]>=biggest212908){
              biggest212908=ends[42];
            }
            if(ends[43]>=biggest212908){
              biggest212908=ends[43];
            }
            if(biggest212908 == 1){
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212900(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212899(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212897(int [] tdone, int [] ends){
        switch(S7083){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
        currsigs.addElement(fR_26);
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
        break;
      
    }
  }

  public void thread212896(int [] tdone, int [] ends){
        switch(S7077){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S7076){
          case 0 : 
            switch(S7060){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7060=1;
                  active[39]=1;
                  ends[39]=1;
                  tdone[39]=1;
                }
                else {
                  switch(S7055){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7055=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[39]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S7076=1;
                          active[39]=1;
                          ends[39]=1;
                          tdone[39]=1;
                        }
                        else {
                          active[39]=1;
                          ends[39]=1;
                          tdone[39]=1;
                        }
                      }
                      else {
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                        ends[39]=2;
                        ;//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7076=1;
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                      else {
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7060=1;
                S7060=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7060=1;
                  active[39]=1;
                  ends[39]=1;
                  tdone[39]=1;
                }
                else {
                  S7055=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S7055=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[39]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S7076=1;
                      active[39]=1;
                      ends[39]=1;
                      tdone[39]=1;
                    }
                    else {
                      active[39]=1;
                      ends[39]=1;
                      tdone[39]=1;
                    }
                  }
                  else {
                    active[39]=1;
                    ends[39]=1;
                    tdone[39]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S7076=1;
            S7076=2;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
            break;
          
          case 2 : 
            S7076=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[39]=2;
            tdone[39]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread212895(int [] tdone, int [] ends){
        switch(S7151){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S7085){
          case 0 : 
            thread212896(tdone,ends);
            thread212897(tdone,ends);
            int biggest212898 = 0;
            if(ends[39]>=biggest212898){
              biggest212898=ends[39];
            }
            if(ends[40]>=biggest212898){
              biggest212898=ends[40];
            }
            if(biggest212898 == 1){
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            if(biggest212898 == 2){
              ends[38]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S7085=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            //FINXME code
            if(biggest212898 == 0){
              S7085=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 1 : 
            S7085=1;
            S7085=0;
            thread212899(tdone,ends);
            thread212900(tdone,ends);
            int biggest212901 = 0;
            if(ends[39]>=biggest212901){
              biggest212901=ends[39];
            }
            if(ends[40]>=biggest212901){
              biggest212901=ends[40];
            }
            if(biggest212901 == 1){
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212893(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212892(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212890(int [] tdone, int [] ends){
        switch(S6984){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
        currsigs.addElement(cvR_26);
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
        break;
      
    }
  }

  public void thread212889(int [] tdone, int [] ends){
        switch(S6978){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S6977){
          case 0 : 
            switch(S6961){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S6961=1;
                  active[36]=1;
                  ends[36]=1;
                  tdone[36]=1;
                }
                else {
                  switch(S6956){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S6956=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[36]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S6977=1;
                          active[36]=1;
                          ends[36]=1;
                          tdone[36]=1;
                        }
                        else {
                          active[36]=1;
                          ends[36]=1;
                          tdone[36]=1;
                        }
                      }
                      else {
                        active[36]=1;
                        ends[36]=1;
                        tdone[36]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                        ends[36]=2;
                        ;//sysj\conveyor_controller.sysj line: 73, column: 5
                        S6977=1;
                        active[36]=1;
                        ends[36]=1;
                        tdone[36]=1;
                      }
                      else {
                        active[36]=1;
                        ends[36]=1;
                        tdone[36]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S6961=1;
                S6961=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S6961=1;
                  active[36]=1;
                  ends[36]=1;
                  tdone[36]=1;
                }
                else {
                  S6956=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S6956=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[36]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S6977=1;
                      active[36]=1;
                      ends[36]=1;
                      tdone[36]=1;
                    }
                    else {
                      active[36]=1;
                      ends[36]=1;
                      tdone[36]=1;
                    }
                  }
                  else {
                    active[36]=1;
                    ends[36]=1;
                    tdone[36]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S6977=1;
            S6977=2;
            active[36]=1;
            ends[36]=1;
            tdone[36]=1;
            break;
          
          case 2 : 
            S6977=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[36]=2;
            tdone[36]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread212888(int [] tdone, int [] ends){
        switch(S7052){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S6986){
          case 0 : 
            thread212889(tdone,ends);
            thread212890(tdone,ends);
            int biggest212891 = 0;
            if(ends[36]>=biggest212891){
              biggest212891=ends[36];
            }
            if(ends[37]>=biggest212891){
              biggest212891=ends[37];
            }
            if(biggest212891 == 1){
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            if(biggest212891 == 2){
              ends[35]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S6986=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            //FINXME code
            if(biggest212891 == 0){
              S6986=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            break;
          
          case 1 : 
            S6986=1;
            S6986=0;
            thread212892(tdone,ends);
            thread212893(tdone,ends);
            int biggest212894 = 0;
            if(ends[36]>=biggest212894){
              biggest212894=ends[36];
            }
            if(ends[37]>=biggest212894){
              biggest212894=ends[37];
            }
            if(biggest212894 == 1){
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212887(int [] tdone, int [] ends){
        switch(S7351){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        thread212888(tdone,ends);
        thread212895(tdone,ends);
        thread212902(tdone,ends);
        thread212909(tdone,ends);
        int biggest212916 = 0;
        if(ends[35]>=biggest212916){
          biggest212916=ends[35];
        }
        if(ends[38]>=biggest212916){
          biggest212916=ends[38];
        }
        if(ends[41]>=biggest212916){
          biggest212916=ends[41];
        }
        if(ends[44]>=biggest212916){
          biggest212916=ends[44];
        }
        if(biggest212916 == 1){
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        //FINXME code
        if(biggest212916 == 0){
          S7351=0;
          active[34]=0;
          ends[34]=0;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread212885(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212884(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212883(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212882(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212880(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212879(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212878(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212877(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212875(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212874(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212873(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212872(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212870(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212869(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212868(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212867(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212865(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212864(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212863(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212862(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212860(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212859(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212858(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212857(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212855(int [] tdone, int [] ends){
        switch(S4119){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_33 >= 100){//sysj\conveyor_controller.sysj line: 285, column: 44
          ends[33]=3;
          ;//sysj\conveyor_controller.sysj line: 285, column: 44
          ends[33]=2;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread212854(int [] tdone, int [] ends){
        switch(S4103){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
        currsigs.addElement(rotaryTableTrigger);
        active[32]=1;
        ends[32]=1;
        tdone[32]=1;
        break;
      
    }
  }

  public void thread212852(int [] tdone, int [] ends){
        S4119=1;
    __start_thread_33 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 285, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_33 >= 100){//sysj\conveyor_controller.sysj line: 285, column: 44
      ends[33]=3;
      ;//sysj\conveyor_controller.sysj line: 285, column: 44
      ends[33]=2;
      tdone[33]=1;
    }
    else {
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread212851(int [] tdone, int [] ends){
        S4103=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread212849(int [] tdone, int [] ends){
        S4119=1;
    __start_thread_33 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 285, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_33 >= 100){//sysj\conveyor_controller.sysj line: 285, column: 44
      ends[33]=3;
      ;//sysj\conveyor_controller.sysj line: 285, column: 44
      ends[33]=2;
      tdone[33]=1;
    }
    else {
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread212848(int [] tdone, int [] ends){
        S4103=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread212846(int [] tdone, int [] ends){
        S4119=1;
    __start_thread_33 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 285, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_33 >= 100){//sysj\conveyor_controller.sysj line: 285, column: 44
      ends[33]=3;
      ;//sysj\conveyor_controller.sysj line: 285, column: 44
      ends[33]=2;
      tdone[33]=1;
    }
    else {
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread212845(int [] tdone, int [] ends){
        S4103=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread212843(int [] tdone, int [] ends){
        switch(S4065){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(lR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 265, column: 17
          System.out.println("*Rotary - LidLoader Ready*");//sysj\conveyor_controller.sysj line: 266, column: 11
          S4065=0;
          active[31]=0;
          ends[31]=0;
          tdone[31]=1;
        }
        else {
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        break;
      
    }
  }

  public void thread212842(int [] tdone, int [] ends){
        switch(S4062){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(cR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 259, column: 17
          System.out.println("*Rotary - Capper Ready*");//sysj\conveyor_controller.sysj line: 260, column: 11
          S4062=0;
          active[30]=0;
          ends[30]=0;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread212841(int [] tdone, int [] ends){
        switch(S4059){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(cvR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 253, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 254, column: 11
          S4059=0;
          active[29]=0;
          ends[29]=0;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread212840(int [] tdone, int [] ends){
        switch(S4056){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(fR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 248, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\conveyor_controller.sysj line: 249, column: 11
          S4056=0;
          active[28]=0;
          ends[28]=0;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread212839(int [] tdone, int [] ends){
        switch(S6953){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S4066){
          case 0 : 
            thread212840(tdone,ends);
            thread212841(tdone,ends);
            thread212842(tdone,ends);
            thread212843(tdone,ends);
            int biggest212844 = 0;
            if(ends[28]>=biggest212844){
              biggest212844=ends[28];
            }
            if(ends[29]>=biggest212844){
              biggest212844=ends[29];
            }
            if(ends[30]>=biggest212844){
              biggest212844=ends[30];
            }
            if(ends[31]>=biggest212844){
              biggest212844=ends[31];
            }
            if(biggest212844 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest212844 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 269, column: 10
              S4066=1;
              if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 272, column: 18
                S4080=0;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S4066=2;
                thread212845(tdone,ends);
                thread212846(tdone,ends);
                int biggest212847 = 0;
                if(ends[32]>=biggest212847){
                  biggest212847=ends[32];
                }
                if(ends[33]>=biggest212847){
                  biggest212847=ends[33];
                }
                if(biggest212847 == 1){
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                if(biggest212847 == 2){
                  ends[27]=2;
                  ;//sysj\conveyor_controller.sysj line: 284, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
                  S4066=3;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
              }
            }
            break;
          
          case 1 : 
            switch(S4080){
              case 0 : 
                if(!bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 274, column: 20
                  S4080=1;
                  if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 276, column: 23
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 273, column: 13
                    S4066=2;
                    thread212848(tdone,ends);
                    thread212849(tdone,ends);
                    int biggest212850 = 0;
                    if(ends[32]>=biggest212850){
                      biggest212850=ends[32];
                    }
                    if(ends[33]>=biggest212850){
                      biggest212850=ends[33];
                    }
                    if(biggest212850 == 1){
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                    if(biggest212850 == 2){
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 284, column: 12
                      System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
                      S4066=3;
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                  }
                }
                else {
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 276, column: 23
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  ends[27]=2;
                  ;//sysj\conveyor_controller.sysj line: 273, column: 13
                  S4066=2;
                  thread212851(tdone,ends);
                  thread212852(tdone,ends);
                  int biggest212853 = 0;
                  if(ends[32]>=biggest212853){
                    biggest212853=ends[32];
                  }
                  if(ends[33]>=biggest212853){
                    biggest212853=ends[33];
                  }
                  if(biggest212853 == 1){
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  if(biggest212853 == 2){
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 284, column: 12
                    System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
                    S4066=3;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread212854(tdone,ends);
            thread212855(tdone,ends);
            int biggest212856 = 0;
            if(ends[32]>=biggest212856){
              biggest212856=ends[32];
            }
            if(ends[33]>=biggest212856){
              biggest212856=ends[33];
            }
            if(biggest212856 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            if(biggest212856 == 2){
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 284, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
              S4066=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest212856 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
              S4066=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 289, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 290, column: 16
              S4066=4;
              S4222=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 291, column: 13
                rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                S4222=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S4217=0;
                if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 291, column: 13
                  S4217=1;
                  if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                    rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 291, column: 13
                    S4066=5;
                    __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                    if(com.systemj.Timer.getMs() - __start_thread_27 >= 5){//sysj\conveyor_controller.sysj line: 244, column: 7
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 244, column: 7
                      i_thread_27 = 0;//sysj\conveyor_controller.sysj line: 293, column: 10
                      S4066=6;
                      i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 296, column: 12
                      if(i_thread_27 > 15){//sysj\conveyor_controller.sysj line: 297, column: 15
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 294, column: 10
                        S4066=0;
                        thread212857(tdone,ends);
                        thread212858(tdone,ends);
                        thread212859(tdone,ends);
                        thread212860(tdone,ends);
                        int biggest212861 = 0;
                        if(ends[28]>=biggest212861){
                          biggest212861=ends[28];
                        }
                        if(ends[29]>=biggest212861){
                          biggest212861=ends[29];
                        }
                        if(ends[30]>=biggest212861){
                          biggest212861=ends[30];
                        }
                        if(ends[31]>=biggest212861){
                          biggest212861=ends[31];
                        }
                        if(biggest212861 == 1){
                          active[27]=1;
                          ends[27]=1;
                          tdone[27]=1;
                        }
                      }
                      else {
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                    }
                    else {
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                  }
                  else {
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                }
                else {
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 4 : 
            switch(S4222){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 291, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                  S4222=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  switch(S4217){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 291, column: 13
                        S4217=1;
                        if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                          rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 291, column: 13
                          S4066=5;
                          __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                          if(com.systemj.Timer.getMs() - __start_thread_27 >= 5){//sysj\conveyor_controller.sysj line: 244, column: 7
                            ends[27]=2;
                            ;//sysj\conveyor_controller.sysj line: 244, column: 7
                            i_thread_27 = 0;//sysj\conveyor_controller.sysj line: 293, column: 10
                            S4066=6;
                            i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 296, column: 12
                            if(i_thread_27 > 15){//sysj\conveyor_controller.sysj line: 297, column: 15
                              ends[27]=2;
                              ;//sysj\conveyor_controller.sysj line: 294, column: 10
                              S4066=0;
                              thread212862(tdone,ends);
                              thread212863(tdone,ends);
                              thread212864(tdone,ends);
                              thread212865(tdone,ends);
                              int biggest212866 = 0;
                              if(ends[28]>=biggest212866){
                                biggest212866=ends[28];
                              }
                              if(ends[29]>=biggest212866){
                                biggest212866=ends[29];
                              }
                              if(ends[30]>=biggest212866){
                                biggest212866=ends[30];
                              }
                              if(ends[31]>=biggest212866){
                                biggest212866=ends[31];
                              }
                              if(biggest212866 == 1){
                                active[27]=1;
                                ends[27]=1;
                                tdone[27]=1;
                              }
                            }
                            else {
                              active[27]=1;
                              ends[27]=1;
                              tdone[27]=1;
                            }
                          }
                          else {
                            active[27]=1;
                            ends[27]=1;
                            tdone[27]=1;
                          }
                        }
                        else {
                          active[27]=1;
                          ends[27]=1;
                          tdone[27]=1;
                        }
                      }
                      else {
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                        rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 291, column: 13
                        S4066=5;
                        __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                        if(com.systemj.Timer.getMs() - __start_thread_27 >= 5){//sysj\conveyor_controller.sysj line: 244, column: 7
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 244, column: 7
                          i_thread_27 = 0;//sysj\conveyor_controller.sysj line: 293, column: 10
                          S4066=6;
                          i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 296, column: 12
                          if(i_thread_27 > 15){//sysj\conveyor_controller.sysj line: 297, column: 15
                            ends[27]=2;
                            ;//sysj\conveyor_controller.sysj line: 294, column: 10
                            S4066=0;
                            thread212867(tdone,ends);
                            thread212868(tdone,ends);
                            thread212869(tdone,ends);
                            thread212870(tdone,ends);
                            int biggest212871 = 0;
                            if(ends[28]>=biggest212871){
                              biggest212871=ends[28];
                            }
                            if(ends[29]>=biggest212871){
                              biggest212871=ends[29];
                            }
                            if(ends[30]>=biggest212871){
                              biggest212871=ends[30];
                            }
                            if(ends[31]>=biggest212871){
                              biggest212871=ends[31];
                            }
                            if(biggest212871 == 1){
                              active[27]=1;
                              ends[27]=1;
                              tdone[27]=1;
                            }
                          }
                          else {
                            active[27]=1;
                            ends[27]=1;
                            tdone[27]=1;
                          }
                        }
                        else {
                          active[27]=1;
                          ends[27]=1;
                          tdone[27]=1;
                        }
                      }
                      else {
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4222=1;
                S4222=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 291, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                  S4222=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  S4217=0;
                  if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 291, column: 13
                    S4217=1;
                    if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                      rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 291, column: 13
                      S4066=5;
                      __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                      if(com.systemj.Timer.getMs() - __start_thread_27 >= 5){//sysj\conveyor_controller.sysj line: 244, column: 7
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 244, column: 7
                        i_thread_27 = 0;//sysj\conveyor_controller.sysj line: 293, column: 10
                        S4066=6;
                        i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 296, column: 12
                        if(i_thread_27 > 15){//sysj\conveyor_controller.sysj line: 297, column: 15
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 294, column: 10
                          S4066=0;
                          thread212872(tdone,ends);
                          thread212873(tdone,ends);
                          thread212874(tdone,ends);
                          thread212875(tdone,ends);
                          int biggest212876 = 0;
                          if(ends[28]>=biggest212876){
                            biggest212876=ends[28];
                          }
                          if(ends[29]>=biggest212876){
                            biggest212876=ends[29];
                          }
                          if(ends[30]>=biggest212876){
                            biggest212876=ends[30];
                          }
                          if(ends[31]>=biggest212876){
                            biggest212876=ends[31];
                          }
                          if(biggest212876 == 1){
                            active[27]=1;
                            ends[27]=1;
                            tdone[27]=1;
                          }
                        }
                        else {
                          active[27]=1;
                          ends[27]=1;
                          tdone[27]=1;
                        }
                      }
                      else {
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                    }
                    else {
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                  }
                  else {
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            if(com.systemj.Timer.getMs() - __start_thread_27 >= 5){//sysj\conveyor_controller.sysj line: 244, column: 7
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 244, column: 7
              i_thread_27 = 0;//sysj\conveyor_controller.sysj line: 293, column: 10
              S4066=6;
              i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 296, column: 12
              if(i_thread_27 > 15){//sysj\conveyor_controller.sysj line: 297, column: 15
                ends[27]=2;
                ;//sysj\conveyor_controller.sysj line: 294, column: 10
                S4066=0;
                thread212877(tdone,ends);
                thread212878(tdone,ends);
                thread212879(tdone,ends);
                thread212880(tdone,ends);
                int biggest212881 = 0;
                if(ends[28]>=biggest212881){
                  biggest212881=ends[28];
                }
                if(ends[29]>=biggest212881){
                  biggest212881=ends[29];
                }
                if(ends[30]>=biggest212881){
                  biggest212881=ends[30];
                }
                if(ends[31]>=biggest212881){
                  biggest212881=ends[31];
                }
                if(biggest212881 == 1){
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
              }
              else {
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 6 : 
            i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 296, column: 12
            if(i_thread_27 > 15){//sysj\conveyor_controller.sysj line: 297, column: 15
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 294, column: 10
              S4066=0;
              thread212882(tdone,ends);
              thread212883(tdone,ends);
              thread212884(tdone,ends);
              thread212885(tdone,ends);
              int biggest212886 = 0;
              if(ends[28]>=biggest212886){
                biggest212886=ends[28];
              }
              if(ends[29]>=biggest212886){
                biggest212886=ends[29];
              }
              if(ends[30]>=biggest212886){
                biggest212886=ends[30];
              }
              if(ends[31]>=biggest212886){
                biggest212886=ends[31];
              }
              if(biggest212886 == 1){
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212836(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212835(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212834(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212835(tdone,ends);
      thread212836(tdone,ends);
      int biggest212837 = 0;
      if(ends[49]>=biggest212837){
        biggest212837=ends[49];
      }
      if(ends[50]>=biggest212837){
        biggest212837=ends[50];
      }
      if(biggest212837 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S7446=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread212833(int [] tdone, int [] ends){
        S7434=1;
    S7378=0;
    S7358=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
      S7358=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7353=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
        S7353=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 321, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread212830(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212829(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212828(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212829(tdone,ends);
    thread212830(tdone,ends);
    int biggest212831 = 0;
    if(ends[45]>=biggest212831){
      biggest212831=ends[45];
    }
    if(ends[46]>=biggest212831){
      biggest212831=ends[46];
    }
    if(biggest212831 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212826(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212825(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212824(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212825(tdone,ends);
    thread212826(tdone,ends);
    int biggest212827 = 0;
    if(ends[42]>=biggest212827){
      biggest212827=ends[42];
    }
    if(ends[43]>=biggest212827){
      biggest212827=ends[43];
    }
    if(biggest212827 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212822(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212821(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212820(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212821(tdone,ends);
    thread212822(tdone,ends);
    int biggest212823 = 0;
    if(ends[39]>=biggest212823){
      biggest212823=ends[39];
    }
    if(ends[40]>=biggest212823){
      biggest212823=ends[40];
    }
    if(biggest212823 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212818(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212817(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212816(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212817(tdone,ends);
    thread212818(tdone,ends);
    int biggest212819 = 0;
    if(ends[36]>=biggest212819){
      biggest212819=ends[36];
    }
    if(ends[37]>=biggest212819){
      biggest212819=ends[37];
    }
    if(biggest212819 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212815(int [] tdone, int [] ends){
        S7351=1;
    thread212816(tdone,ends);
    thread212820(tdone,ends);
    thread212824(tdone,ends);
    thread212828(tdone,ends);
    int biggest212832 = 0;
    if(ends[35]>=biggest212832){
      biggest212832=ends[35];
    }
    if(ends[38]>=biggest212832){
      biggest212832=ends[38];
    }
    if(ends[41]>=biggest212832){
      biggest212832=ends[41];
    }
    if(ends[44]>=biggest212832){
      biggest212832=ends[44];
    }
    if(biggest212832 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212832 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212832 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212832 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212813(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212812(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212811(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212810(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212809(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212810(tdone,ends);
    thread212811(tdone,ends);
    thread212812(tdone,ends);
    thread212813(tdone,ends);
    int biggest212814 = 0;
    if(ends[28]>=biggest212814){
      biggest212814=ends[28];
    }
    if(ends[29]>=biggest212814){
      biggest212814=ends[29];
    }
    if(ends[30]>=biggest212814){
      biggest212814=ends[30];
    }
    if(ends[31]>=biggest212814){
      biggest212814=ends[31];
    }
    if(biggest212814 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212806(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212805(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212804(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212805(tdone,ends);
      thread212806(tdone,ends);
      int biggest212807 = 0;
      if(ends[49]>=biggest212807){
        biggest212807=ends[49];
      }
      if(ends[50]>=biggest212807){
        biggest212807=ends[50];
      }
      if(biggest212807 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S7446=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread212803(int [] tdone, int [] ends){
        S7434=1;
    S7378=0;
    S7358=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
      S7358=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7353=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
        S7353=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 321, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread212800(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212799(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212798(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212799(tdone,ends);
    thread212800(tdone,ends);
    int biggest212801 = 0;
    if(ends[45]>=biggest212801){
      biggest212801=ends[45];
    }
    if(ends[46]>=biggest212801){
      biggest212801=ends[46];
    }
    if(biggest212801 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212796(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212795(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212794(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212795(tdone,ends);
    thread212796(tdone,ends);
    int biggest212797 = 0;
    if(ends[42]>=biggest212797){
      biggest212797=ends[42];
    }
    if(ends[43]>=biggest212797){
      biggest212797=ends[43];
    }
    if(biggest212797 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212792(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212791(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212790(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212791(tdone,ends);
    thread212792(tdone,ends);
    int biggest212793 = 0;
    if(ends[39]>=biggest212793){
      biggest212793=ends[39];
    }
    if(ends[40]>=biggest212793){
      biggest212793=ends[40];
    }
    if(biggest212793 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212788(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212787(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212786(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212787(tdone,ends);
    thread212788(tdone,ends);
    int biggest212789 = 0;
    if(ends[36]>=biggest212789){
      biggest212789=ends[36];
    }
    if(ends[37]>=biggest212789){
      biggest212789=ends[37];
    }
    if(biggest212789 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212785(int [] tdone, int [] ends){
        S7351=1;
    thread212786(tdone,ends);
    thread212790(tdone,ends);
    thread212794(tdone,ends);
    thread212798(tdone,ends);
    int biggest212802 = 0;
    if(ends[35]>=biggest212802){
      biggest212802=ends[35];
    }
    if(ends[38]>=biggest212802){
      biggest212802=ends[38];
    }
    if(ends[41]>=biggest212802){
      biggest212802=ends[41];
    }
    if(ends[44]>=biggest212802){
      biggest212802=ends[44];
    }
    if(biggest212802 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212802 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212802 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212802 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212783(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212782(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212781(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212780(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212779(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212780(tdone,ends);
    thread212781(tdone,ends);
    thread212782(tdone,ends);
    thread212783(tdone,ends);
    int biggest212784 = 0;
    if(ends[28]>=biggest212784){
      biggest212784=ends[28];
    }
    if(ends[29]>=biggest212784){
      biggest212784=ends[29];
    }
    if(ends[30]>=biggest212784){
      biggest212784=ends[30];
    }
    if(ends[31]>=biggest212784){
      biggest212784=ends[31];
    }
    if(biggest212784 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212776(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212775(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212774(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212775(tdone,ends);
      thread212776(tdone,ends);
      int biggest212777 = 0;
      if(ends[49]>=biggest212777){
        biggest212777=ends[49];
      }
      if(ends[50]>=biggest212777){
        biggest212777=ends[50];
      }
      if(biggest212777 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S7446=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread212773(int [] tdone, int [] ends){
        S7434=1;
    S7378=0;
    S7358=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
      S7358=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7353=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
        S7353=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 321, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread212770(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212769(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212768(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212769(tdone,ends);
    thread212770(tdone,ends);
    int biggest212771 = 0;
    if(ends[45]>=biggest212771){
      biggest212771=ends[45];
    }
    if(ends[46]>=biggest212771){
      biggest212771=ends[46];
    }
    if(biggest212771 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212766(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212765(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212764(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212765(tdone,ends);
    thread212766(tdone,ends);
    int biggest212767 = 0;
    if(ends[42]>=biggest212767){
      biggest212767=ends[42];
    }
    if(ends[43]>=biggest212767){
      biggest212767=ends[43];
    }
    if(biggest212767 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212762(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212761(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212760(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212761(tdone,ends);
    thread212762(tdone,ends);
    int biggest212763 = 0;
    if(ends[39]>=biggest212763){
      biggest212763=ends[39];
    }
    if(ends[40]>=biggest212763){
      biggest212763=ends[40];
    }
    if(biggest212763 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212758(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212757(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212756(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212757(tdone,ends);
    thread212758(tdone,ends);
    int biggest212759 = 0;
    if(ends[36]>=biggest212759){
      biggest212759=ends[36];
    }
    if(ends[37]>=biggest212759){
      biggest212759=ends[37];
    }
    if(biggest212759 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212755(int [] tdone, int [] ends){
        S7351=1;
    thread212756(tdone,ends);
    thread212760(tdone,ends);
    thread212764(tdone,ends);
    thread212768(tdone,ends);
    int biggest212772 = 0;
    if(ends[35]>=biggest212772){
      biggest212772=ends[35];
    }
    if(ends[38]>=biggest212772){
      biggest212772=ends[38];
    }
    if(ends[41]>=biggest212772){
      biggest212772=ends[41];
    }
    if(ends[44]>=biggest212772){
      biggest212772=ends[44];
    }
    if(biggest212772 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212772 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212772 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212772 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212753(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212752(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212751(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212750(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212749(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212750(tdone,ends);
    thread212751(tdone,ends);
    thread212752(tdone,ends);
    thread212753(tdone,ends);
    int biggest212754 = 0;
    if(ends[28]>=biggest212754){
      biggest212754=ends[28];
    }
    if(ends[29]>=biggest212754){
      biggest212754=ends[29];
    }
    if(ends[30]>=biggest212754){
      biggest212754=ends[30];
    }
    if(ends[31]>=biggest212754){
      biggest212754=ends[31];
    }
    if(biggest212754 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212746(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212745(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212744(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212745(tdone,ends);
      thread212746(tdone,ends);
      int biggest212747 = 0;
      if(ends[49]>=biggest212747){
        biggest212747=ends[49];
      }
      if(ends[50]>=biggest212747){
        biggest212747=ends[50];
      }
      if(biggest212747 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S7446=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread212743(int [] tdone, int [] ends){
        S7434=1;
    S7378=0;
    S7358=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
      S7358=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7353=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
        S7353=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 321, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread212740(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212739(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212738(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212739(tdone,ends);
    thread212740(tdone,ends);
    int biggest212741 = 0;
    if(ends[45]>=biggest212741){
      biggest212741=ends[45];
    }
    if(ends[46]>=biggest212741){
      biggest212741=ends[46];
    }
    if(biggest212741 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212736(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212735(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212734(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212735(tdone,ends);
    thread212736(tdone,ends);
    int biggest212737 = 0;
    if(ends[42]>=biggest212737){
      biggest212737=ends[42];
    }
    if(ends[43]>=biggest212737){
      biggest212737=ends[43];
    }
    if(biggest212737 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212732(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212731(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212730(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212731(tdone,ends);
    thread212732(tdone,ends);
    int biggest212733 = 0;
    if(ends[39]>=biggest212733){
      biggest212733=ends[39];
    }
    if(ends[40]>=biggest212733){
      biggest212733=ends[40];
    }
    if(biggest212733 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212728(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212727(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212726(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212727(tdone,ends);
    thread212728(tdone,ends);
    int biggest212729 = 0;
    if(ends[36]>=biggest212729){
      biggest212729=ends[36];
    }
    if(ends[37]>=biggest212729){
      biggest212729=ends[37];
    }
    if(biggest212729 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212725(int [] tdone, int [] ends){
        S7351=1;
    thread212726(tdone,ends);
    thread212730(tdone,ends);
    thread212734(tdone,ends);
    thread212738(tdone,ends);
    int biggest212742 = 0;
    if(ends[35]>=biggest212742){
      biggest212742=ends[35];
    }
    if(ends[38]>=biggest212742){
      biggest212742=ends[38];
    }
    if(ends[41]>=biggest212742){
      biggest212742=ends[41];
    }
    if(ends[44]>=biggest212742){
      biggest212742=ends[44];
    }
    if(biggest212742 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212742 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212742 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212742 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212723(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212722(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212721(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212720(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212719(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212720(tdone,ends);
    thread212721(tdone,ends);
    thread212722(tdone,ends);
    thread212723(tdone,ends);
    int biggest212724 = 0;
    if(ends[28]>=biggest212724){
      biggest212724=ends[28];
    }
    if(ends[29]>=biggest212724){
      biggest212724=ends[29];
    }
    if(ends[30]>=biggest212724){
      biggest212724=ends[30];
    }
    if(ends[31]>=biggest212724){
      biggest212724=ends[31];
    }
    if(biggest212724 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212716(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212715(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212714(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212715(tdone,ends);
      thread212716(tdone,ends);
      int biggest212717 = 0;
      if(ends[49]>=biggest212717){
        biggest212717=ends[49];
      }
      if(ends[50]>=biggest212717){
        biggest212717=ends[50];
      }
      if(biggest212717 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S7446=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread212713(int [] tdone, int [] ends){
        S7434=1;
    S7378=0;
    S7358=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
      S7358=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7353=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
        S7353=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 321, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread212710(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212709(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212708(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212709(tdone,ends);
    thread212710(tdone,ends);
    int biggest212711 = 0;
    if(ends[45]>=biggest212711){
      biggest212711=ends[45];
    }
    if(ends[46]>=biggest212711){
      biggest212711=ends[46];
    }
    if(biggest212711 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212706(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212705(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212704(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212705(tdone,ends);
    thread212706(tdone,ends);
    int biggest212707 = 0;
    if(ends[42]>=biggest212707){
      biggest212707=ends[42];
    }
    if(ends[43]>=biggest212707){
      biggest212707=ends[43];
    }
    if(biggest212707 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212702(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212701(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212700(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212701(tdone,ends);
    thread212702(tdone,ends);
    int biggest212703 = 0;
    if(ends[39]>=biggest212703){
      biggest212703=ends[39];
    }
    if(ends[40]>=biggest212703){
      biggest212703=ends[40];
    }
    if(biggest212703 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212698(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212697(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212696(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212697(tdone,ends);
    thread212698(tdone,ends);
    int biggest212699 = 0;
    if(ends[36]>=biggest212699){
      biggest212699=ends[36];
    }
    if(ends[37]>=biggest212699){
      biggest212699=ends[37];
    }
    if(biggest212699 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212695(int [] tdone, int [] ends){
        S7351=1;
    thread212696(tdone,ends);
    thread212700(tdone,ends);
    thread212704(tdone,ends);
    thread212708(tdone,ends);
    int biggest212712 = 0;
    if(ends[35]>=biggest212712){
      biggest212712=ends[35];
    }
    if(ends[38]>=biggest212712){
      biggest212712=ends[38];
    }
    if(ends[41]>=biggest212712){
      biggest212712=ends[41];
    }
    if(ends[44]>=biggest212712){
      biggest212712=ends[44];
    }
    if(biggest212712 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212712 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212712 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212712 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212693(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212692(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212691(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212690(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212689(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212690(tdone,ends);
    thread212691(tdone,ends);
    thread212692(tdone,ends);
    thread212693(tdone,ends);
    int biggest212694 = 0;
    if(ends[28]>=biggest212694){
      biggest212694=ends[28];
    }
    if(ends[29]>=biggest212694){
      biggest212694=ends[29];
    }
    if(ends[30]>=biggest212694){
      biggest212694=ends[30];
    }
    if(ends[31]>=biggest212694){
      biggest212694=ends[31];
    }
    if(biggest212694 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212686(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212685(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212684(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212685(tdone,ends);
      thread212686(tdone,ends);
      int biggest212687 = 0;
      if(ends[49]>=biggest212687){
        biggest212687=ends[49];
      }
      if(ends[50]>=biggest212687){
        biggest212687=ends[50];
      }
      if(biggest212687 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S7446=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread212683(int [] tdone, int [] ends){
        S7434=1;
    S7378=0;
    S7358=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
      S7358=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7353=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
        S7353=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 321, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread212680(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212679(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212678(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212679(tdone,ends);
    thread212680(tdone,ends);
    int biggest212681 = 0;
    if(ends[45]>=biggest212681){
      biggest212681=ends[45];
    }
    if(ends[46]>=biggest212681){
      biggest212681=ends[46];
    }
    if(biggest212681 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212676(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212675(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212674(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212675(tdone,ends);
    thread212676(tdone,ends);
    int biggest212677 = 0;
    if(ends[42]>=biggest212677){
      biggest212677=ends[42];
    }
    if(ends[43]>=biggest212677){
      biggest212677=ends[43];
    }
    if(biggest212677 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212672(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212671(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212670(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212671(tdone,ends);
    thread212672(tdone,ends);
    int biggest212673 = 0;
    if(ends[39]>=biggest212673){
      biggest212673=ends[39];
    }
    if(ends[40]>=biggest212673){
      biggest212673=ends[40];
    }
    if(biggest212673 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212668(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212667(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212666(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212667(tdone,ends);
    thread212668(tdone,ends);
    int biggest212669 = 0;
    if(ends[36]>=biggest212669){
      biggest212669=ends[36];
    }
    if(ends[37]>=biggest212669){
      biggest212669=ends[37];
    }
    if(biggest212669 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212665(int [] tdone, int [] ends){
        S7351=1;
    thread212666(tdone,ends);
    thread212670(tdone,ends);
    thread212674(tdone,ends);
    thread212678(tdone,ends);
    int biggest212682 = 0;
    if(ends[35]>=biggest212682){
      biggest212682=ends[35];
    }
    if(ends[38]>=biggest212682){
      biggest212682=ends[38];
    }
    if(ends[41]>=biggest212682){
      biggest212682=ends[41];
    }
    if(ends[44]>=biggest212682){
      biggest212682=ends[44];
    }
    if(biggest212682 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212682 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212682 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212682 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212663(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212662(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212661(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212660(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212659(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212660(tdone,ends);
    thread212661(tdone,ends);
    thread212662(tdone,ends);
    thread212663(tdone,ends);
    int biggest212664 = 0;
    if(ends[28]>=biggest212664){
      biggest212664=ends[28];
    }
    if(ends[29]>=biggest212664){
      biggest212664=ends[29];
    }
    if(ends[30]>=biggest212664){
      biggest212664=ends[30];
    }
    if(ends[31]>=biggest212664){
      biggest212664=ends[31];
    }
    if(biggest212664 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212656(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212655(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212654(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212655(tdone,ends);
      thread212656(tdone,ends);
      int biggest212657 = 0;
      if(ends[49]>=biggest212657){
        biggest212657=ends[49];
      }
      if(ends[50]>=biggest212657){
        biggest212657=ends[50];
      }
      if(biggest212657 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S7446=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread212653(int [] tdone, int [] ends){
        S7434=1;
    S7378=0;
    S7358=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
      S7358=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7353=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
        S7353=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 321, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread212650(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212649(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212648(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212649(tdone,ends);
    thread212650(tdone,ends);
    int biggest212651 = 0;
    if(ends[45]>=biggest212651){
      biggest212651=ends[45];
    }
    if(ends[46]>=biggest212651){
      biggest212651=ends[46];
    }
    if(biggest212651 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212646(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212645(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212644(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212645(tdone,ends);
    thread212646(tdone,ends);
    int biggest212647 = 0;
    if(ends[42]>=biggest212647){
      biggest212647=ends[42];
    }
    if(ends[43]>=biggest212647){
      biggest212647=ends[43];
    }
    if(biggest212647 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212642(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212641(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212640(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212641(tdone,ends);
    thread212642(tdone,ends);
    int biggest212643 = 0;
    if(ends[39]>=biggest212643){
      biggest212643=ends[39];
    }
    if(ends[40]>=biggest212643){
      biggest212643=ends[40];
    }
    if(biggest212643 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212638(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212637(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212636(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212637(tdone,ends);
    thread212638(tdone,ends);
    int biggest212639 = 0;
    if(ends[36]>=biggest212639){
      biggest212639=ends[36];
    }
    if(ends[37]>=biggest212639){
      biggest212639=ends[37];
    }
    if(biggest212639 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212635(int [] tdone, int [] ends){
        S7351=1;
    thread212636(tdone,ends);
    thread212640(tdone,ends);
    thread212644(tdone,ends);
    thread212648(tdone,ends);
    int biggest212652 = 0;
    if(ends[35]>=biggest212652){
      biggest212652=ends[35];
    }
    if(ends[38]>=biggest212652){
      biggest212652=ends[38];
    }
    if(ends[41]>=biggest212652){
      biggest212652=ends[41];
    }
    if(ends[44]>=biggest212652){
      biggest212652=ends[44];
    }
    if(biggest212652 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212652 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212652 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212652 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212633(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212632(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212631(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212630(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212629(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212630(tdone,ends);
    thread212631(tdone,ends);
    thread212632(tdone,ends);
    thread212633(tdone,ends);
    int biggest212634 = 0;
    if(ends[28]>=biggest212634){
      biggest212634=ends[28];
    }
    if(ends[29]>=biggest212634){
      biggest212634=ends[29];
    }
    if(ends[30]>=biggest212634){
      biggest212634=ends[30];
    }
    if(ends[31]>=biggest212634){
      biggest212634=ends[31];
    }
    if(biggest212634 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212626(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212625(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212624(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212625(tdone,ends);
      thread212626(tdone,ends);
      int biggest212627 = 0;
      if(ends[49]>=biggest212627){
        biggest212627=ends[49];
      }
      if(ends[50]>=biggest212627){
        biggest212627=ends[50];
      }
      if(biggest212627 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S7446=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread212623(int [] tdone, int [] ends){
        S7434=1;
    S7378=0;
    S7358=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
      S7358=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7353=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
        S7353=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 321, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread212620(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212619(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212618(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212619(tdone,ends);
    thread212620(tdone,ends);
    int biggest212621 = 0;
    if(ends[45]>=biggest212621){
      biggest212621=ends[45];
    }
    if(ends[46]>=biggest212621){
      biggest212621=ends[46];
    }
    if(biggest212621 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212616(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212615(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212614(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212615(tdone,ends);
    thread212616(tdone,ends);
    int biggest212617 = 0;
    if(ends[42]>=biggest212617){
      biggest212617=ends[42];
    }
    if(ends[43]>=biggest212617){
      biggest212617=ends[43];
    }
    if(biggest212617 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212612(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212611(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212610(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212611(tdone,ends);
    thread212612(tdone,ends);
    int biggest212613 = 0;
    if(ends[39]>=biggest212613){
      biggest212613=ends[39];
    }
    if(ends[40]>=biggest212613){
      biggest212613=ends[40];
    }
    if(biggest212613 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212608(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212607(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212606(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212607(tdone,ends);
    thread212608(tdone,ends);
    int biggest212609 = 0;
    if(ends[36]>=biggest212609){
      biggest212609=ends[36];
    }
    if(ends[37]>=biggest212609){
      biggest212609=ends[37];
    }
    if(biggest212609 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212605(int [] tdone, int [] ends){
        S7351=1;
    thread212606(tdone,ends);
    thread212610(tdone,ends);
    thread212614(tdone,ends);
    thread212618(tdone,ends);
    int biggest212622 = 0;
    if(ends[35]>=biggest212622){
      biggest212622=ends[35];
    }
    if(ends[38]>=biggest212622){
      biggest212622=ends[38];
    }
    if(ends[41]>=biggest212622){
      biggest212622=ends[41];
    }
    if(ends[44]>=biggest212622){
      biggest212622=ends[44];
    }
    if(biggest212622 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212622 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212622 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212622 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212603(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212602(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212601(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212600(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212599(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212600(tdone,ends);
    thread212601(tdone,ends);
    thread212602(tdone,ends);
    thread212603(tdone,ends);
    int biggest212604 = 0;
    if(ends[28]>=biggest212604){
      biggest212604=ends[28];
    }
    if(ends[29]>=biggest212604){
      biggest212604=ends[29];
    }
    if(ends[30]>=biggest212604){
      biggest212604=ends[30];
    }
    if(ends[31]>=biggest212604){
      biggest212604=ends[31];
    }
    if(biggest212604 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212596(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212595(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212594(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212595(tdone,ends);
      thread212596(tdone,ends);
      int biggest212597 = 0;
      if(ends[49]>=biggest212597){
        biggest212597=ends[49];
      }
      if(ends[50]>=biggest212597){
        biggest212597=ends[50];
      }
      if(biggest212597 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S7446=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread212593(int [] tdone, int [] ends){
        S7434=1;
    S7378=0;
    S7358=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
      S7358=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7353=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
        S7353=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 321, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread212590(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212589(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212588(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212589(tdone,ends);
    thread212590(tdone,ends);
    int biggest212591 = 0;
    if(ends[45]>=biggest212591){
      biggest212591=ends[45];
    }
    if(ends[46]>=biggest212591){
      biggest212591=ends[46];
    }
    if(biggest212591 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212586(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212585(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212584(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212585(tdone,ends);
    thread212586(tdone,ends);
    int biggest212587 = 0;
    if(ends[42]>=biggest212587){
      biggest212587=ends[42];
    }
    if(ends[43]>=biggest212587){
      biggest212587=ends[43];
    }
    if(biggest212587 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212582(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212581(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212580(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212581(tdone,ends);
    thread212582(tdone,ends);
    int biggest212583 = 0;
    if(ends[39]>=biggest212583){
      biggest212583=ends[39];
    }
    if(ends[40]>=biggest212583){
      biggest212583=ends[40];
    }
    if(biggest212583 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212578(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212577(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212576(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212577(tdone,ends);
    thread212578(tdone,ends);
    int biggest212579 = 0;
    if(ends[36]>=biggest212579){
      biggest212579=ends[36];
    }
    if(ends[37]>=biggest212579){
      biggest212579=ends[37];
    }
    if(biggest212579 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212575(int [] tdone, int [] ends){
        S7351=1;
    thread212576(tdone,ends);
    thread212580(tdone,ends);
    thread212584(tdone,ends);
    thread212588(tdone,ends);
    int biggest212592 = 0;
    if(ends[35]>=biggest212592){
      biggest212592=ends[35];
    }
    if(ends[38]>=biggest212592){
      biggest212592=ends[38];
    }
    if(ends[41]>=biggest212592){
      biggest212592=ends[41];
    }
    if(ends[44]>=biggest212592){
      biggest212592=ends[44];
    }
    if(biggest212592 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212592 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212592 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212592 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212573(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212572(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212571(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212570(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212569(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212570(tdone,ends);
    thread212571(tdone,ends);
    thread212572(tdone,ends);
    thread212573(tdone,ends);
    int biggest212574 = 0;
    if(ends[28]>=biggest212574){
      biggest212574=ends[28];
    }
    if(ends[29]>=biggest212574){
      biggest212574=ends[29];
    }
    if(ends[30]>=biggest212574){
      biggest212574=ends[30];
    }
    if(ends[31]>=biggest212574){
      biggest212574=ends[31];
    }
    if(biggest212574 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212566(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212565(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212564(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212565(tdone,ends);
      thread212566(tdone,ends);
      int biggest212567 = 0;
      if(ends[49]>=biggest212567){
        biggest212567=ends[49];
      }
      if(ends[50]>=biggest212567){
        biggest212567=ends[50];
      }
      if(biggest212567 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S7446=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread212563(int [] tdone, int [] ends){
        S7434=1;
    S7378=0;
    S7358=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
      S7358=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7353=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
        S7353=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 321, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread212560(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212559(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212558(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212559(tdone,ends);
    thread212560(tdone,ends);
    int biggest212561 = 0;
    if(ends[45]>=biggest212561){
      biggest212561=ends[45];
    }
    if(ends[46]>=biggest212561){
      biggest212561=ends[46];
    }
    if(biggest212561 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212556(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212555(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212554(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212555(tdone,ends);
    thread212556(tdone,ends);
    int biggest212557 = 0;
    if(ends[42]>=biggest212557){
      biggest212557=ends[42];
    }
    if(ends[43]>=biggest212557){
      biggest212557=ends[43];
    }
    if(biggest212557 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212552(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212551(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212550(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212551(tdone,ends);
    thread212552(tdone,ends);
    int biggest212553 = 0;
    if(ends[39]>=biggest212553){
      biggest212553=ends[39];
    }
    if(ends[40]>=biggest212553){
      biggest212553=ends[40];
    }
    if(biggest212553 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212548(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212547(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212546(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212547(tdone,ends);
    thread212548(tdone,ends);
    int biggest212549 = 0;
    if(ends[36]>=biggest212549){
      biggest212549=ends[36];
    }
    if(ends[37]>=biggest212549){
      biggest212549=ends[37];
    }
    if(biggest212549 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212545(int [] tdone, int [] ends){
        S7351=1;
    thread212546(tdone,ends);
    thread212550(tdone,ends);
    thread212554(tdone,ends);
    thread212558(tdone,ends);
    int biggest212562 = 0;
    if(ends[35]>=biggest212562){
      biggest212562=ends[35];
    }
    if(ends[38]>=biggest212562){
      biggest212562=ends[38];
    }
    if(ends[41]>=biggest212562){
      biggest212562=ends[41];
    }
    if(ends[44]>=biggest212562){
      biggest212562=ends[44];
    }
    if(biggest212562 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212562 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212562 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212562 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212543(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212542(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212541(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212540(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212539(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212540(tdone,ends);
    thread212541(tdone,ends);
    thread212542(tdone,ends);
    thread212543(tdone,ends);
    int biggest212544 = 0;
    if(ends[28]>=biggest212544){
      biggest212544=ends[28];
    }
    if(ends[29]>=biggest212544){
      biggest212544=ends[29];
    }
    if(ends[30]>=biggest212544){
      biggest212544=ends[30];
    }
    if(ends[31]>=biggest212544){
      biggest212544=ends[31];
    }
    if(biggest212544 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212536(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212535(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212534(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212535(tdone,ends);
      thread212536(tdone,ends);
      int biggest212537 = 0;
      if(ends[49]>=biggest212537){
        biggest212537=ends[49];
      }
      if(ends[50]>=biggest212537){
        biggest212537=ends[50];
      }
      if(biggest212537 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S7446=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread212533(int [] tdone, int [] ends){
        S7434=1;
    S7378=0;
    S7358=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
      S7358=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7353=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
        S7353=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 321, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread212530(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212529(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212528(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212529(tdone,ends);
    thread212530(tdone,ends);
    int biggest212531 = 0;
    if(ends[45]>=biggest212531){
      biggest212531=ends[45];
    }
    if(ends[46]>=biggest212531){
      biggest212531=ends[46];
    }
    if(biggest212531 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212526(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212525(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212524(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212525(tdone,ends);
    thread212526(tdone,ends);
    int biggest212527 = 0;
    if(ends[42]>=biggest212527){
      biggest212527=ends[42];
    }
    if(ends[43]>=biggest212527){
      biggest212527=ends[43];
    }
    if(biggest212527 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212522(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212521(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212520(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212521(tdone,ends);
    thread212522(tdone,ends);
    int biggest212523 = 0;
    if(ends[39]>=biggest212523){
      biggest212523=ends[39];
    }
    if(ends[40]>=biggest212523){
      biggest212523=ends[40];
    }
    if(biggest212523 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212518(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212517(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212516(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212517(tdone,ends);
    thread212518(tdone,ends);
    int biggest212519 = 0;
    if(ends[36]>=biggest212519){
      biggest212519=ends[36];
    }
    if(ends[37]>=biggest212519){
      biggest212519=ends[37];
    }
    if(biggest212519 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212515(int [] tdone, int [] ends){
        S7351=1;
    thread212516(tdone,ends);
    thread212520(tdone,ends);
    thread212524(tdone,ends);
    thread212528(tdone,ends);
    int biggest212532 = 0;
    if(ends[35]>=biggest212532){
      biggest212532=ends[35];
    }
    if(ends[38]>=biggest212532){
      biggest212532=ends[38];
    }
    if(ends[41]>=biggest212532){
      biggest212532=ends[41];
    }
    if(ends[44]>=biggest212532){
      biggest212532=ends[44];
    }
    if(biggest212532 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212532 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212532 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212532 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212513(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212512(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212511(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212510(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212509(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212510(tdone,ends);
    thread212511(tdone,ends);
    thread212512(tdone,ends);
    thread212513(tdone,ends);
    int biggest212514 = 0;
    if(ends[28]>=biggest212514){
      biggest212514=ends[28];
    }
    if(ends[29]>=biggest212514){
      biggest212514=ends[29];
    }
    if(ends[30]>=biggest212514){
      biggest212514=ends[30];
    }
    if(ends[31]>=biggest212514){
      biggest212514=ends[31];
    }
    if(biggest212514 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212506(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212505(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212504(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212505(tdone,ends);
      thread212506(tdone,ends);
      int biggest212507 = 0;
      if(ends[49]>=biggest212507){
        biggest212507=ends[49];
      }
      if(ends[50]>=biggest212507){
        biggest212507=ends[50];
      }
      if(biggest212507 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S7446=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread212503(int [] tdone, int [] ends){
        S7434=1;
    S7378=0;
    S7358=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
      S7358=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7353=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
        S7353=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 321, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread212500(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212499(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212498(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212499(tdone,ends);
    thread212500(tdone,ends);
    int biggest212501 = 0;
    if(ends[45]>=biggest212501){
      biggest212501=ends[45];
    }
    if(ends[46]>=biggest212501){
      biggest212501=ends[46];
    }
    if(biggest212501 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212496(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212495(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212494(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212495(tdone,ends);
    thread212496(tdone,ends);
    int biggest212497 = 0;
    if(ends[42]>=biggest212497){
      biggest212497=ends[42];
    }
    if(ends[43]>=biggest212497){
      biggest212497=ends[43];
    }
    if(biggest212497 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212492(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212491(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212490(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212491(tdone,ends);
    thread212492(tdone,ends);
    int biggest212493 = 0;
    if(ends[39]>=biggest212493){
      biggest212493=ends[39];
    }
    if(ends[40]>=biggest212493){
      biggest212493=ends[40];
    }
    if(biggest212493 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212488(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212487(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212486(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212487(tdone,ends);
    thread212488(tdone,ends);
    int biggest212489 = 0;
    if(ends[36]>=biggest212489){
      biggest212489=ends[36];
    }
    if(ends[37]>=biggest212489){
      biggest212489=ends[37];
    }
    if(biggest212489 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212485(int [] tdone, int [] ends){
        S7351=1;
    thread212486(tdone,ends);
    thread212490(tdone,ends);
    thread212494(tdone,ends);
    thread212498(tdone,ends);
    int biggest212502 = 0;
    if(ends[35]>=biggest212502){
      biggest212502=ends[35];
    }
    if(ends[38]>=biggest212502){
      biggest212502=ends[38];
    }
    if(ends[41]>=biggest212502){
      biggest212502=ends[41];
    }
    if(ends[44]>=biggest212502){
      biggest212502=ends[44];
    }
    if(biggest212502 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212502 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212502 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212502 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212483(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212482(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212481(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212480(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212479(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212480(tdone,ends);
    thread212481(tdone,ends);
    thread212482(tdone,ends);
    thread212483(tdone,ends);
    int biggest212484 = 0;
    if(ends[28]>=biggest212484){
      biggest212484=ends[28];
    }
    if(ends[29]>=biggest212484){
      biggest212484=ends[29];
    }
    if(ends[30]>=biggest212484){
      biggest212484=ends[30];
    }
    if(ends[31]>=biggest212484){
      biggest212484=ends[31];
    }
    if(biggest212484 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212476(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212475(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212474(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212475(tdone,ends);
      thread212476(tdone,ends);
      int biggest212477 = 0;
      if(ends[49]>=biggest212477){
        biggest212477=ends[49];
      }
      if(ends[50]>=biggest212477){
        biggest212477=ends[50];
      }
      if(biggest212477 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S7446=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread212473(int [] tdone, int [] ends){
        S7434=1;
    S7378=0;
    S7358=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 321, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
      S7358=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7353=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 321, column: 7
        S7353=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 321, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 321, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 321, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 322, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 323, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S7378=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread212470(int [] tdone, int [] ends){
        S7281=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7281=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread212469(int [] tdone, int [] ends){
        S7275=1;
    S7274=0;
    S7258=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7258=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7253=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7253=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7274=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread212468(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212469(tdone,ends);
    thread212470(tdone,ends);
    int biggest212471 = 0;
    if(ends[45]>=biggest212471){
      biggest212471=ends[45];
    }
    if(ends[46]>=biggest212471){
      biggest212471=ends[46];
    }
    if(biggest212471 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212466(int [] tdone, int [] ends){
        S7182=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7182=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread212465(int [] tdone, int [] ends){
        S7176=1;
    S7175=0;
    S7159=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7159=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7154=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7154=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7175=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread212464(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212465(tdone,ends);
    thread212466(tdone,ends);
    int biggest212467 = 0;
    if(ends[42]>=biggest212467){
      biggest212467=ends[42];
    }
    if(ends[43]>=biggest212467){
      biggest212467=ends[43];
    }
    if(biggest212467 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212462(int [] tdone, int [] ends){
        S7083=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7083=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread212461(int [] tdone, int [] ends){
        S7077=1;
    S7076=0;
    S7060=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7060=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7055=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7055=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7076=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread212460(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212461(tdone,ends);
    thread212462(tdone,ends);
    int biggest212463 = 0;
    if(ends[39]>=biggest212463){
      biggest212463=ends[39];
    }
    if(ends[40]>=biggest212463){
      biggest212463=ends[40];
    }
    if(biggest212463 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212458(int [] tdone, int [] ends){
        S6984=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6984=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread212457(int [] tdone, int [] ends){
        S6978=1;
    S6977=0;
    S6961=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S6961=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6956=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S6956=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S6977=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread212456(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212457(tdone,ends);
    thread212458(tdone,ends);
    int biggest212459 = 0;
    if(ends[36]>=biggest212459){
      biggest212459=ends[36];
    }
    if(ends[37]>=biggest212459){
      biggest212459=ends[37];
    }
    if(biggest212459 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212455(int [] tdone, int [] ends){
        S7351=1;
    thread212456(tdone,ends);
    thread212460(tdone,ends);
    thread212464(tdone,ends);
    thread212468(tdone,ends);
    int biggest212472 = 0;
    if(ends[35]>=biggest212472){
      biggest212472=ends[35];
    }
    if(ends[38]>=biggest212472){
      biggest212472=ends[38];
    }
    if(ends[41]>=biggest212472){
      biggest212472=ends[41];
    }
    if(ends[44]>=biggest212472){
      biggest212472=ends[44];
    }
    if(biggest212472 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212472 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212472 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212472 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212453(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212452(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212451(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212450(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212449(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212450(tdone,ends);
    thread212451(tdone,ends);
    thread212452(tdone,ends);
    thread212453(tdone,ends);
    int biggest212454 = 0;
    if(ends[28]>=biggest212454){
      biggest212454=ends[28];
    }
    if(ends[29]>=biggest212454){
      biggest212454=ends[29];
    }
    if(ends[30]>=biggest212454){
      biggest212454=ends[30];
    }
    if(ends[31]>=biggest212454){
      biggest212454=ends[31];
    }
    if(biggest212454 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S38244){
        case 0 : 
          S38244=0;
          break RUN;
        
        case 1 : 
          S38244=2;
          S38244=2;
          cvR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          fR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          cR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          lR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          bottleAtPos5_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          S3745=0;
          S3641=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 240, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
            S3641=1;
            active[26]=1;
            ends[26]=1;
            break RUN;
          }
          else {
            S3636=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 240, column: 7
              S3636=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                ends[26]=2;
                ;//sysj\conveyor_controller.sysj line: 240, column: 7
                S3745=1;
                S3663=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                  S3663=1;
                  active[26]=1;
                  ends[26]=1;
                  break RUN;
                }
                else {
                  S3658=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S3658=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                      ends[26]=2;
                      ;//sysj\conveyor_controller.sysj line: 241, column: 7
                      S3745=2;
                      S3752=0;
                      if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                        S3752=1;
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                      else {
                        S3747=0;
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S3747=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 242, column: 7
                            S3745=3;
                            S3884=0;
                            if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                              S3884=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3879=0;
                              if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                S3879=1;
                                if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S3745=4;
                                  thread212449(tdone,ends);
                                  thread212455(tdone,ends);
                                  thread212473(tdone,ends);
                                  thread212474(tdone,ends);
                                  int biggest212478 = 0;
                                  if(ends[27]>=biggest212478){
                                    biggest212478=ends[27];
                                  }
                                  if(ends[34]>=biggest212478){
                                    biggest212478=ends[34];
                                  }
                                  if(ends[47]>=biggest212478){
                                    biggest212478=ends[47];
                                  }
                                  if(ends[48]>=biggest212478){
                                    biggest212478=ends[48];
                                  }
                                  if(biggest212478 == 1){
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                }
              }
              else {
                active[26]=1;
                ends[26]=1;
                break RUN;
              }
            }
            else {
              active[26]=1;
              ends[26]=1;
              break RUN;
            }
          }
        
        case 2 : 
          cvR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          fR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          cR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          lR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          bottleAtPos5_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          switch(S3745){
            case 0 : 
              switch(S3641){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 240, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                    S3641=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3636){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 240, column: 7
                          S3636=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 240, column: 7
                            S3745=1;
                            S3663=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                              S3663=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3658=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                                S3658=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 241, column: 7
                                  S3745=2;
                                  S3752=0;
                                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                    S3752=1;
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                  else {
                                    S3747=0;
                                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                      S3747=1;
                                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                        ends[26]=2;
                                        ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                        S3745=3;
                                        S3884=0;
                                        if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                          S3884=1;
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                        else {
                                          S3879=0;
                                          if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                            lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                            S3879=1;
                                            if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                              ends[26]=2;
                                              ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                              S3745=4;
                                              thread212479(tdone,ends);
                                              thread212485(tdone,ends);
                                              thread212503(tdone,ends);
                                              thread212504(tdone,ends);
                                              int biggest212508 = 0;
                                              if(ends[27]>=biggest212508){
                                                biggest212508=ends[27];
                                              }
                                              if(ends[34]>=biggest212508){
                                                biggest212508=ends[34];
                                              }
                                              if(ends[47]>=biggest212508){
                                                biggest212508=ends[47];
                                              }
                                              if(ends[48]>=biggest212508){
                                                biggest212508=ends[48];
                                              }
                                              if(biggest212508 == 1){
                                                active[26]=1;
                                                ends[26]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              active[26]=1;
                                              ends[26]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[26]=1;
                                            ends[26]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                      else {
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 240, column: 7
                          S3745=1;
                          S3663=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                            S3663=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S3658=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                              S3658=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 241, column: 7
                                S3745=2;
                                S3752=0;
                                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                  S3752=1;
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                                else {
                                  S3747=0;
                                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                    S3747=1;
                                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                      ends[26]=2;
                                      ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                      S3745=3;
                                      S3884=0;
                                      if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                        S3884=1;
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                      else {
                                        S3879=0;
                                        if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                          lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                          S3879=1;
                                          if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                            lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                            ends[26]=2;
                                            ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                            S3745=4;
                                            thread212509(tdone,ends);
                                            thread212515(tdone,ends);
                                            thread212533(tdone,ends);
                                            thread212534(tdone,ends);
                                            int biggest212538 = 0;
                                            if(ends[27]>=biggest212538){
                                              biggest212538=ends[27];
                                            }
                                            if(ends[34]>=biggest212538){
                                              biggest212538=ends[34];
                                            }
                                            if(ends[47]>=biggest212538){
                                              biggest212538=ends[47];
                                            }
                                            if(ends[48]>=biggest212538){
                                              biggest212538=ends[48];
                                            }
                                            if(biggest212538 == 1){
                                              active[26]=1;
                                              ends[26]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[26]=1;
                                            ends[26]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3641=1;
                  S3641=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 240, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                    S3641=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3636=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 240, column: 7
                      S3636=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 240, column: 7
                        S3745=1;
                        S3663=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                          S3663=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S3658=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                            S3658=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 241, column: 7
                              S3745=2;
                              S3752=0;
                              if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                S3752=1;
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                              else {
                                S3747=0;
                                if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                  capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                  S3747=1;
                                  if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                    ends[26]=2;
                                    ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                    S3745=3;
                                    S3884=0;
                                    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                      S3884=1;
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                    else {
                                      S3879=0;
                                      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                        S3879=1;
                                        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                          ends[26]=2;
                                          ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                          S3745=4;
                                          thread212539(tdone,ends);
                                          thread212545(tdone,ends);
                                          thread212563(tdone,ends);
                                          thread212564(tdone,ends);
                                          int biggest212568 = 0;
                                          if(ends[27]>=biggest212568){
                                            biggest212568=ends[27];
                                          }
                                          if(ends[34]>=biggest212568){
                                            biggest212568=ends[34];
                                          }
                                          if(ends[47]>=biggest212568){
                                            biggest212568=ends[47];
                                          }
                                          if(ends[48]>=biggest212568){
                                            biggest212568=ends[48];
                                          }
                                          if(biggest212568 == 1){
                                            active[26]=1;
                                            ends[26]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S3663){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S3663=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3658){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                          S3658=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 241, column: 7
                            S3745=2;
                            S3752=0;
                            if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                              S3752=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3747=0;
                              if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                S3747=1;
                                if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                  S3745=3;
                                  S3884=0;
                                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                    S3884=1;
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                  else {
                                    S3879=0;
                                    if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                      lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                      S3879=1;
                                      if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                        ends[26]=2;
                                        ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                        S3745=4;
                                        thread212569(tdone,ends);
                                        thread212575(tdone,ends);
                                        thread212593(tdone,ends);
                                        thread212594(tdone,ends);
                                        int biggest212598 = 0;
                                        if(ends[27]>=biggest212598){
                                          biggest212598=ends[27];
                                        }
                                        if(ends[34]>=biggest212598){
                                          biggest212598=ends[34];
                                        }
                                        if(ends[47]>=biggest212598){
                                          biggest212598=ends[47];
                                        }
                                        if(ends[48]>=biggest212598){
                                          biggest212598=ends[48];
                                        }
                                        if(biggest212598 == 1){
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 241, column: 7
                          S3745=2;
                          S3752=0;
                          if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            S3752=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S3747=0;
                            if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                              S3747=1;
                              if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                S3745=3;
                                S3884=0;
                                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S3884=1;
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                                else {
                                  S3879=0;
                                  if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                    lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                    S3879=1;
                                    if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                      ends[26]=2;
                                      ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                      S3745=4;
                                      thread212599(tdone,ends);
                                      thread212605(tdone,ends);
                                      thread212623(tdone,ends);
                                      thread212624(tdone,ends);
                                      int biggest212628 = 0;
                                      if(ends[27]>=biggest212628){
                                        biggest212628=ends[27];
                                      }
                                      if(ends[34]>=biggest212628){
                                        biggest212628=ends[34];
                                      }
                                      if(ends[47]>=biggest212628){
                                        biggest212628=ends[47];
                                      }
                                      if(ends[48]>=biggest212628){
                                        biggest212628=ends[48];
                                      }
                                      if(biggest212628 == 1){
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3663=1;
                  S3663=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S3663=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3658=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                      S3658=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 241, column: 7
                        S3745=2;
                        S3752=0;
                        if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S3752=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S3747=0;
                          if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                            S3747=1;
                            if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 242, column: 7
                              S3745=3;
                              S3884=0;
                              if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                S3884=1;
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                              else {
                                S3879=0;
                                if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S3879=1;
                                  if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                    ends[26]=2;
                                    ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                    S3745=4;
                                    thread212629(tdone,ends);
                                    thread212635(tdone,ends);
                                    thread212653(tdone,ends);
                                    thread212654(tdone,ends);
                                    int biggest212658 = 0;
                                    if(ends[27]>=biggest212658){
                                      biggest212658=ends[27];
                                    }
                                    if(ends[34]>=biggest212658){
                                      biggest212658=ends[34];
                                    }
                                    if(ends[47]>=biggest212658){
                                      biggest212658=ends[47];
                                    }
                                    if(ends[48]>=biggest212658){
                                      biggest212658=ends[48];
                                    }
                                    if(biggest212658 == 1){
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 2 : 
              switch(S3752){
                case 0 : 
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                    S3752=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3747){
                      case 0 : 
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S3747=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 242, column: 7
                            S3745=3;
                            S3884=0;
                            if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                              S3884=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3879=0;
                              if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                S3879=1;
                                if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S3745=4;
                                  thread212659(tdone,ends);
                                  thread212665(tdone,ends);
                                  thread212683(tdone,ends);
                                  thread212684(tdone,ends);
                                  int biggest212688 = 0;
                                  if(ends[27]>=biggest212688){
                                    biggest212688=ends[27];
                                  }
                                  if(ends[34]>=biggest212688){
                                    biggest212688=ends[34];
                                  }
                                  if(ends[47]>=biggest212688){
                                    biggest212688=ends[47];
                                  }
                                  if(ends[48]>=biggest212688){
                                    biggest212688=ends[48];
                                  }
                                  if(biggest212688 == 1){
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 242, column: 7
                          S3745=3;
                          S3884=0;
                          if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                            lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                            S3884=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S3879=0;
                            if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                              S3879=1;
                              if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                S3745=4;
                                thread212689(tdone,ends);
                                thread212695(tdone,ends);
                                thread212713(tdone,ends);
                                thread212714(tdone,ends);
                                int biggest212718 = 0;
                                if(ends[27]>=biggest212718){
                                  biggest212718=ends[27];
                                }
                                if(ends[34]>=biggest212718){
                                  biggest212718=ends[34];
                                }
                                if(ends[47]>=biggest212718){
                                  biggest212718=ends[47];
                                }
                                if(ends[48]>=biggest212718){
                                  biggest212718=ends[48];
                                }
                                if(biggest212718 == 1){
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3752=1;
                  S3752=0;
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                    S3752=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3747=0;
                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                      S3747=1;
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 242, column: 7
                        S3745=3;
                        S3884=0;
                        if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                          S3884=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S3879=0;
                          if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                            lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                            S3879=1;
                            if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 243, column: 7
                              S3745=4;
                              thread212719(tdone,ends);
                              thread212725(tdone,ends);
                              thread212743(tdone,ends);
                              thread212744(tdone,ends);
                              int biggest212748 = 0;
                              if(ends[27]>=biggest212748){
                                biggest212748=ends[27];
                              }
                              if(ends[34]>=biggest212748){
                                biggest212748=ends[34];
                              }
                              if(ends[47]>=biggest212748){
                                biggest212748=ends[47];
                              }
                              if(ends[48]>=biggest212748){
                                biggest212748=ends[48];
                              }
                              if(biggest212748 == 1){
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 3 : 
              switch(S3884){
                case 0 : 
                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                    S3884=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3879){
                      case 0 : 
                        if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                          lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                          S3879=1;
                          if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                            lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 243, column: 7
                            S3745=4;
                            thread212749(tdone,ends);
                            thread212755(tdone,ends);
                            thread212773(tdone,ends);
                            thread212774(tdone,ends);
                            int biggest212778 = 0;
                            if(ends[27]>=biggest212778){
                              biggest212778=ends[27];
                            }
                            if(ends[34]>=biggest212778){
                              biggest212778=ends[34];
                            }
                            if(ends[47]>=biggest212778){
                              biggest212778=ends[47];
                            }
                            if(ends[48]>=biggest212778){
                              biggest212778=ends[48];
                            }
                            if(biggest212778 == 1){
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 243, column: 7
                          S3745=4;
                          thread212779(tdone,ends);
                          thread212785(tdone,ends);
                          thread212803(tdone,ends);
                          thread212804(tdone,ends);
                          int biggest212808 = 0;
                          if(ends[27]>=biggest212808){
                            biggest212808=ends[27];
                          }
                          if(ends[34]>=biggest212808){
                            biggest212808=ends[34];
                          }
                          if(ends[47]>=biggest212808){
                            biggest212808=ends[47];
                          }
                          if(ends[48]>=biggest212808){
                            biggest212808=ends[48];
                          }
                          if(biggest212808 == 1){
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3884=1;
                  S3884=0;
                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                    S3884=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3879=0;
                    if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                      lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                      S3879=1;
                      if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 243, column: 7
                        S3745=4;
                        thread212809(tdone,ends);
                        thread212815(tdone,ends);
                        thread212833(tdone,ends);
                        thread212834(tdone,ends);
                        int biggest212838 = 0;
                        if(ends[27]>=biggest212838){
                          biggest212838=ends[27];
                        }
                        if(ends[34]>=biggest212838){
                          biggest212838=ends[34];
                        }
                        if(ends[47]>=biggest212838){
                          biggest212838=ends[47];
                        }
                        if(ends[48]>=biggest212838){
                          biggest212838=ends[48];
                        }
                        if(biggest212838 == 1){
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 4 : 
              thread212839(tdone,ends);
              thread212887(tdone,ends);
              thread212917(tdone,ends);
              thread212918(tdone,ends);
              int biggest212925 = 0;
              if(ends[27]>=biggest212925){
                biggest212925=ends[27];
              }
              if(ends[34]>=biggest212925){
                biggest212925=ends[34];
              }
              if(ends[47]>=biggest212925){
                biggest212925=ends[47];
              }
              if(ends[48]>=biggest212925){
                biggest212925=ends[48];
              }
              if(biggest212925 == 1){
                active[26]=1;
                ends[26]=1;
                break RUN;
              }
              //FINXME code
              if(biggest212925 == 0){
                S38244=0;
                active[26]=0;
                ends[26]=0;
                S38244=0;
                break RUN;
              }
            
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
    cvR_26 = new Signal();
    fR_26 = new Signal();
    cR_26 = new Signal();
    lR_26 = new Signal();
    bottleAtPos5_26 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[26] != 0){
      int index = 26;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[26]!=0 || suspended[26]!=0 || active[26]!=1);
      else{
        if(!df){
          convReady_in.gethook();
          fillerReady_in.gethook();
          capperReady_in.gethook();
          lidLoaderReady_in.gethook();
          checkFive_in.gethook();
          checkOne_in.gethook();
          rotated_o.gethook();
          tableAlignedWithSensor.gethook();
          capOnBottleAtPos1.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      capOnBottleAtPos1.setpreclear();
      rotaryTableTrigger.setpreclear();
      bottleAtPos5E.setpreclear();
      cvR_26.setpreclear();
      fR_26.setpreclear();
      cR_26.setpreclear();
      lR_26.setpreclear();
      bottleAtPos5_26.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      cvR_26.setClear();
      fR_26.setClear();
      cR_26.setClear();
      lR_26.setClear();
      bottleAtPos5_26.setClear();
      convReady_in.sethook();
      fillerReady_in.sethook();
      capperReady_in.sethook();
      lidLoaderReady_in.sethook();
      checkFive_in.sethook();
      checkOne_in.sethook();
      rotated_o.sethook();
      if(paused[26]!=0 || suspended[26]!=0 || active[26]!=1);
      else{
        convReady_in.gethook();
        fillerReady_in.gethook();
        capperReady_in.gethook();
        lidLoaderReady_in.gethook();
        checkFive_in.gethook();
        checkOne_in.gethook();
        rotated_o.gethook();
        tableAlignedWithSensor.gethook();
        capOnBottleAtPos1.gethook();
      }
      runFinisher();
      if(active[26] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
