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
  
  public void thread212763(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212762(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212760(int [] tdone, int [] ends){
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

  public void thread212759(int [] tdone, int [] ends){
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

  public void thread212758(int [] tdone, int [] ends){
        switch(S7472){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        switch(S7446){
          case 0 : 
            thread212759(tdone,ends);
            thread212760(tdone,ends);
            int biggest212761 = 0;
            if(ends[49]>=biggest212761){
              biggest212761=ends[49];
            }
            if(ends[50]>=biggest212761){
              biggest212761=ends[50];
            }
            if(biggest212761 == 1){
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            if(biggest212761 == 2){
              ends[48]=2;
              ;//sysj\conveyor_controller.sysj line: 337, column: 34
              S7446=1;
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            //FINXME code
            if(biggest212761 == 0){
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
              thread212762(tdone,ends);
              thread212763(tdone,ends);
              int biggest212764 = 0;
              if(ends[49]>=biggest212764){
                biggest212764=ends[49];
              }
              if(ends[50]>=biggest212764){
                biggest212764=ends[50];
              }
              if(biggest212764 == 1){
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

  public void thread212757(int [] tdone, int [] ends){
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

  public void thread212754(int [] tdone, int [] ends){
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

  public void thread212753(int [] tdone, int [] ends){
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

  public void thread212751(int [] tdone, int [] ends){
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

  public void thread212750(int [] tdone, int [] ends){
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

  public void thread212749(int [] tdone, int [] ends){
        switch(S7349){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        switch(S7283){
          case 0 : 
            thread212750(tdone,ends);
            thread212751(tdone,ends);
            int biggest212752 = 0;
            if(ends[45]>=biggest212752){
              biggest212752=ends[45];
            }
            if(ends[46]>=biggest212752){
              biggest212752=ends[46];
            }
            if(biggest212752 == 1){
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            if(biggest212752 == 2){
              ends[44]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S7283=1;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            //FINXME code
            if(biggest212752 == 0){
              S7283=1;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
          case 1 : 
            S7283=1;
            S7283=0;
            thread212753(tdone,ends);
            thread212754(tdone,ends);
            int biggest212755 = 0;
            if(ends[45]>=biggest212755){
              biggest212755=ends[45];
            }
            if(ends[46]>=biggest212755){
              biggest212755=ends[46];
            }
            if(biggest212755 == 1){
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212747(int [] tdone, int [] ends){
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

  public void thread212746(int [] tdone, int [] ends){
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

  public void thread212744(int [] tdone, int [] ends){
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

  public void thread212743(int [] tdone, int [] ends){
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

  public void thread212742(int [] tdone, int [] ends){
        switch(S7250){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        switch(S7184){
          case 0 : 
            thread212743(tdone,ends);
            thread212744(tdone,ends);
            int biggest212745 = 0;
            if(ends[42]>=biggest212745){
              biggest212745=ends[42];
            }
            if(ends[43]>=biggest212745){
              biggest212745=ends[43];
            }
            if(biggest212745 == 1){
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            if(biggest212745 == 2){
              ends[41]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S7184=1;
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            //FINXME code
            if(biggest212745 == 0){
              S7184=1;
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            break;
          
          case 1 : 
            S7184=1;
            S7184=0;
            thread212746(tdone,ends);
            thread212747(tdone,ends);
            int biggest212748 = 0;
            if(ends[42]>=biggest212748){
              biggest212748=ends[42];
            }
            if(ends[43]>=biggest212748){
              biggest212748=ends[43];
            }
            if(biggest212748 == 1){
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212740(int [] tdone, int [] ends){
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

  public void thread212739(int [] tdone, int [] ends){
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

  public void thread212737(int [] tdone, int [] ends){
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

  public void thread212736(int [] tdone, int [] ends){
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

  public void thread212735(int [] tdone, int [] ends){
        switch(S7151){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S7085){
          case 0 : 
            thread212736(tdone,ends);
            thread212737(tdone,ends);
            int biggest212738 = 0;
            if(ends[39]>=biggest212738){
              biggest212738=ends[39];
            }
            if(ends[40]>=biggest212738){
              biggest212738=ends[40];
            }
            if(biggest212738 == 1){
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            if(biggest212738 == 2){
              ends[38]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S7085=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            //FINXME code
            if(biggest212738 == 0){
              S7085=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 1 : 
            S7085=1;
            S7085=0;
            thread212739(tdone,ends);
            thread212740(tdone,ends);
            int biggest212741 = 0;
            if(ends[39]>=biggest212741){
              biggest212741=ends[39];
            }
            if(ends[40]>=biggest212741){
              biggest212741=ends[40];
            }
            if(biggest212741 == 1){
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212733(int [] tdone, int [] ends){
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

  public void thread212732(int [] tdone, int [] ends){
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

  public void thread212730(int [] tdone, int [] ends){
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

  public void thread212729(int [] tdone, int [] ends){
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

  public void thread212728(int [] tdone, int [] ends){
        switch(S7052){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S6986){
          case 0 : 
            thread212729(tdone,ends);
            thread212730(tdone,ends);
            int biggest212731 = 0;
            if(ends[36]>=biggest212731){
              biggest212731=ends[36];
            }
            if(ends[37]>=biggest212731){
              biggest212731=ends[37];
            }
            if(biggest212731 == 1){
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            if(biggest212731 == 2){
              ends[35]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S6986=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            //FINXME code
            if(biggest212731 == 0){
              S6986=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            break;
          
          case 1 : 
            S6986=1;
            S6986=0;
            thread212732(tdone,ends);
            thread212733(tdone,ends);
            int biggest212734 = 0;
            if(ends[36]>=biggest212734){
              biggest212734=ends[36];
            }
            if(ends[37]>=biggest212734){
              biggest212734=ends[37];
            }
            if(biggest212734 == 1){
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212727(int [] tdone, int [] ends){
        switch(S7351){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        thread212728(tdone,ends);
        thread212735(tdone,ends);
        thread212742(tdone,ends);
        thread212749(tdone,ends);
        int biggest212756 = 0;
        if(ends[35]>=biggest212756){
          biggest212756=ends[35];
        }
        if(ends[38]>=biggest212756){
          biggest212756=ends[38];
        }
        if(ends[41]>=biggest212756){
          biggest212756=ends[41];
        }
        if(ends[44]>=biggest212756){
          biggest212756=ends[44];
        }
        if(biggest212756 == 1){
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        //FINXME code
        if(biggest212756 == 0){
          S7351=0;
          active[34]=0;
          ends[34]=0;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread212725(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212724(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212723(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212722(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212720(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212719(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212718(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212717(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212715(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212714(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212713(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212712(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212710(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212709(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212708(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212707(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212705(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212704(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212703(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212702(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212700(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212699(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212698(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212697(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212695(int [] tdone, int [] ends){
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

  public void thread212694(int [] tdone, int [] ends){
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

  public void thread212692(int [] tdone, int [] ends){
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

  public void thread212691(int [] tdone, int [] ends){
        S4103=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread212689(int [] tdone, int [] ends){
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

  public void thread212688(int [] tdone, int [] ends){
        S4103=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread212686(int [] tdone, int [] ends){
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

  public void thread212685(int [] tdone, int [] ends){
        S4103=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread212683(int [] tdone, int [] ends){
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

  public void thread212682(int [] tdone, int [] ends){
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

  public void thread212681(int [] tdone, int [] ends){
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

  public void thread212680(int [] tdone, int [] ends){
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

  public void thread212679(int [] tdone, int [] ends){
        switch(S6953){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S4066){
          case 0 : 
            thread212680(tdone,ends);
            thread212681(tdone,ends);
            thread212682(tdone,ends);
            thread212683(tdone,ends);
            int biggest212684 = 0;
            if(ends[28]>=biggest212684){
              biggest212684=ends[28];
            }
            if(ends[29]>=biggest212684){
              biggest212684=ends[29];
            }
            if(ends[30]>=biggest212684){
              biggest212684=ends[30];
            }
            if(ends[31]>=biggest212684){
              biggest212684=ends[31];
            }
            if(biggest212684 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest212684 == 0){
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
                thread212685(tdone,ends);
                thread212686(tdone,ends);
                int biggest212687 = 0;
                if(ends[32]>=biggest212687){
                  biggest212687=ends[32];
                }
                if(ends[33]>=biggest212687){
                  biggest212687=ends[33];
                }
                if(biggest212687 == 1){
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                if(biggest212687 == 2){
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
                    thread212688(tdone,ends);
                    thread212689(tdone,ends);
                    int biggest212690 = 0;
                    if(ends[32]>=biggest212690){
                      biggest212690=ends[32];
                    }
                    if(ends[33]>=biggest212690){
                      biggest212690=ends[33];
                    }
                    if(biggest212690 == 1){
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                    if(biggest212690 == 2){
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
                  thread212691(tdone,ends);
                  thread212692(tdone,ends);
                  int biggest212693 = 0;
                  if(ends[32]>=biggest212693){
                    biggest212693=ends[32];
                  }
                  if(ends[33]>=biggest212693){
                    biggest212693=ends[33];
                  }
                  if(biggest212693 == 1){
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  if(biggest212693 == 2){
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
            thread212694(tdone,ends);
            thread212695(tdone,ends);
            int biggest212696 = 0;
            if(ends[32]>=biggest212696){
              biggest212696=ends[32];
            }
            if(ends[33]>=biggest212696){
              biggest212696=ends[33];
            }
            if(biggest212696 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            if(biggest212696 == 2){
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 284, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
              S4066=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest212696 == 0){
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
                        thread212697(tdone,ends);
                        thread212698(tdone,ends);
                        thread212699(tdone,ends);
                        thread212700(tdone,ends);
                        int biggest212701 = 0;
                        if(ends[28]>=biggest212701){
                          biggest212701=ends[28];
                        }
                        if(ends[29]>=biggest212701){
                          biggest212701=ends[29];
                        }
                        if(ends[30]>=biggest212701){
                          biggest212701=ends[30];
                        }
                        if(ends[31]>=biggest212701){
                          biggest212701=ends[31];
                        }
                        if(biggest212701 == 1){
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
                              thread212702(tdone,ends);
                              thread212703(tdone,ends);
                              thread212704(tdone,ends);
                              thread212705(tdone,ends);
                              int biggest212706 = 0;
                              if(ends[28]>=biggest212706){
                                biggest212706=ends[28];
                              }
                              if(ends[29]>=biggest212706){
                                biggest212706=ends[29];
                              }
                              if(ends[30]>=biggest212706){
                                biggest212706=ends[30];
                              }
                              if(ends[31]>=biggest212706){
                                biggest212706=ends[31];
                              }
                              if(biggest212706 == 1){
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
                            thread212707(tdone,ends);
                            thread212708(tdone,ends);
                            thread212709(tdone,ends);
                            thread212710(tdone,ends);
                            int biggest212711 = 0;
                            if(ends[28]>=biggest212711){
                              biggest212711=ends[28];
                            }
                            if(ends[29]>=biggest212711){
                              biggest212711=ends[29];
                            }
                            if(ends[30]>=biggest212711){
                              biggest212711=ends[30];
                            }
                            if(ends[31]>=biggest212711){
                              biggest212711=ends[31];
                            }
                            if(biggest212711 == 1){
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
                          thread212712(tdone,ends);
                          thread212713(tdone,ends);
                          thread212714(tdone,ends);
                          thread212715(tdone,ends);
                          int biggest212716 = 0;
                          if(ends[28]>=biggest212716){
                            biggest212716=ends[28];
                          }
                          if(ends[29]>=biggest212716){
                            biggest212716=ends[29];
                          }
                          if(ends[30]>=biggest212716){
                            biggest212716=ends[30];
                          }
                          if(ends[31]>=biggest212716){
                            biggest212716=ends[31];
                          }
                          if(biggest212716 == 1){
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
                thread212717(tdone,ends);
                thread212718(tdone,ends);
                thread212719(tdone,ends);
                thread212720(tdone,ends);
                int biggest212721 = 0;
                if(ends[28]>=biggest212721){
                  biggest212721=ends[28];
                }
                if(ends[29]>=biggest212721){
                  biggest212721=ends[29];
                }
                if(ends[30]>=biggest212721){
                  biggest212721=ends[30];
                }
                if(ends[31]>=biggest212721){
                  biggest212721=ends[31];
                }
                if(biggest212721 == 1){
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
              thread212722(tdone,ends);
              thread212723(tdone,ends);
              thread212724(tdone,ends);
              thread212725(tdone,ends);
              int biggest212726 = 0;
              if(ends[28]>=biggest212726){
                biggest212726=ends[28];
              }
              if(ends[29]>=biggest212726){
                biggest212726=ends[29];
              }
              if(ends[30]>=biggest212726){
                biggest212726=ends[30];
              }
              if(ends[31]>=biggest212726){
                biggest212726=ends[31];
              }
              if(biggest212726 == 1){
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

  public void thread212676(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212675(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212674(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212675(tdone,ends);
      thread212676(tdone,ends);
      int biggest212677 = 0;
      if(ends[49]>=biggest212677){
        biggest212677=ends[49];
      }
      if(ends[50]>=biggest212677){
        biggest212677=ends[50];
      }
      if(biggest212677 == 1){
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

  public void thread212673(int [] tdone, int [] ends){
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

  public void thread212670(int [] tdone, int [] ends){
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

  public void thread212669(int [] tdone, int [] ends){
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

  public void thread212668(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212669(tdone,ends);
    thread212670(tdone,ends);
    int biggest212671 = 0;
    if(ends[45]>=biggest212671){
      biggest212671=ends[45];
    }
    if(ends[46]>=biggest212671){
      biggest212671=ends[46];
    }
    if(biggest212671 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212666(int [] tdone, int [] ends){
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

  public void thread212665(int [] tdone, int [] ends){
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

  public void thread212664(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212665(tdone,ends);
    thread212666(tdone,ends);
    int biggest212667 = 0;
    if(ends[42]>=biggest212667){
      biggest212667=ends[42];
    }
    if(ends[43]>=biggest212667){
      biggest212667=ends[43];
    }
    if(biggest212667 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212662(int [] tdone, int [] ends){
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

  public void thread212661(int [] tdone, int [] ends){
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

  public void thread212660(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212661(tdone,ends);
    thread212662(tdone,ends);
    int biggest212663 = 0;
    if(ends[39]>=biggest212663){
      biggest212663=ends[39];
    }
    if(ends[40]>=biggest212663){
      biggest212663=ends[40];
    }
    if(biggest212663 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212658(int [] tdone, int [] ends){
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

  public void thread212657(int [] tdone, int [] ends){
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

  public void thread212656(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212657(tdone,ends);
    thread212658(tdone,ends);
    int biggest212659 = 0;
    if(ends[36]>=biggest212659){
      biggest212659=ends[36];
    }
    if(ends[37]>=biggest212659){
      biggest212659=ends[37];
    }
    if(biggest212659 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212655(int [] tdone, int [] ends){
        S7351=1;
    thread212656(tdone,ends);
    thread212660(tdone,ends);
    thread212664(tdone,ends);
    thread212668(tdone,ends);
    int biggest212672 = 0;
    if(ends[35]>=biggest212672){
      biggest212672=ends[35];
    }
    if(ends[38]>=biggest212672){
      biggest212672=ends[38];
    }
    if(ends[41]>=biggest212672){
      biggest212672=ends[41];
    }
    if(ends[44]>=biggest212672){
      biggest212672=ends[44];
    }
    if(biggest212672 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212672 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212672 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212672 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212653(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212652(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212651(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212650(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212649(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212650(tdone,ends);
    thread212651(tdone,ends);
    thread212652(tdone,ends);
    thread212653(tdone,ends);
    int biggest212654 = 0;
    if(ends[28]>=biggest212654){
      biggest212654=ends[28];
    }
    if(ends[29]>=biggest212654){
      biggest212654=ends[29];
    }
    if(ends[30]>=biggest212654){
      biggest212654=ends[30];
    }
    if(ends[31]>=biggest212654){
      biggest212654=ends[31];
    }
    if(biggest212654 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212646(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212645(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212644(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212645(tdone,ends);
      thread212646(tdone,ends);
      int biggest212647 = 0;
      if(ends[49]>=biggest212647){
        biggest212647=ends[49];
      }
      if(ends[50]>=biggest212647){
        biggest212647=ends[50];
      }
      if(biggest212647 == 1){
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

  public void thread212643(int [] tdone, int [] ends){
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

  public void thread212640(int [] tdone, int [] ends){
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

  public void thread212639(int [] tdone, int [] ends){
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

  public void thread212638(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212639(tdone,ends);
    thread212640(tdone,ends);
    int biggest212641 = 0;
    if(ends[45]>=biggest212641){
      biggest212641=ends[45];
    }
    if(ends[46]>=biggest212641){
      biggest212641=ends[46];
    }
    if(biggest212641 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212636(int [] tdone, int [] ends){
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

  public void thread212635(int [] tdone, int [] ends){
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

  public void thread212634(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212635(tdone,ends);
    thread212636(tdone,ends);
    int biggest212637 = 0;
    if(ends[42]>=biggest212637){
      biggest212637=ends[42];
    }
    if(ends[43]>=biggest212637){
      biggest212637=ends[43];
    }
    if(biggest212637 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212632(int [] tdone, int [] ends){
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

  public void thread212631(int [] tdone, int [] ends){
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

  public void thread212630(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212631(tdone,ends);
    thread212632(tdone,ends);
    int biggest212633 = 0;
    if(ends[39]>=biggest212633){
      biggest212633=ends[39];
    }
    if(ends[40]>=biggest212633){
      biggest212633=ends[40];
    }
    if(biggest212633 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212628(int [] tdone, int [] ends){
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

  public void thread212627(int [] tdone, int [] ends){
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

  public void thread212626(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212627(tdone,ends);
    thread212628(tdone,ends);
    int biggest212629 = 0;
    if(ends[36]>=biggest212629){
      biggest212629=ends[36];
    }
    if(ends[37]>=biggest212629){
      biggest212629=ends[37];
    }
    if(biggest212629 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212625(int [] tdone, int [] ends){
        S7351=1;
    thread212626(tdone,ends);
    thread212630(tdone,ends);
    thread212634(tdone,ends);
    thread212638(tdone,ends);
    int biggest212642 = 0;
    if(ends[35]>=biggest212642){
      biggest212642=ends[35];
    }
    if(ends[38]>=biggest212642){
      biggest212642=ends[38];
    }
    if(ends[41]>=biggest212642){
      biggest212642=ends[41];
    }
    if(ends[44]>=biggest212642){
      biggest212642=ends[44];
    }
    if(biggest212642 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212642 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212642 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212642 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212623(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212622(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212621(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212620(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212619(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212620(tdone,ends);
    thread212621(tdone,ends);
    thread212622(tdone,ends);
    thread212623(tdone,ends);
    int biggest212624 = 0;
    if(ends[28]>=biggest212624){
      biggest212624=ends[28];
    }
    if(ends[29]>=biggest212624){
      biggest212624=ends[29];
    }
    if(ends[30]>=biggest212624){
      biggest212624=ends[30];
    }
    if(ends[31]>=biggest212624){
      biggest212624=ends[31];
    }
    if(biggest212624 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212616(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212615(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212614(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212615(tdone,ends);
      thread212616(tdone,ends);
      int biggest212617 = 0;
      if(ends[49]>=biggest212617){
        biggest212617=ends[49];
      }
      if(ends[50]>=biggest212617){
        biggest212617=ends[50];
      }
      if(biggest212617 == 1){
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

  public void thread212613(int [] tdone, int [] ends){
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

  public void thread212610(int [] tdone, int [] ends){
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

  public void thread212609(int [] tdone, int [] ends){
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

  public void thread212608(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212609(tdone,ends);
    thread212610(tdone,ends);
    int biggest212611 = 0;
    if(ends[45]>=biggest212611){
      biggest212611=ends[45];
    }
    if(ends[46]>=biggest212611){
      biggest212611=ends[46];
    }
    if(biggest212611 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212606(int [] tdone, int [] ends){
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

  public void thread212605(int [] tdone, int [] ends){
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

  public void thread212604(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212605(tdone,ends);
    thread212606(tdone,ends);
    int biggest212607 = 0;
    if(ends[42]>=biggest212607){
      biggest212607=ends[42];
    }
    if(ends[43]>=biggest212607){
      biggest212607=ends[43];
    }
    if(biggest212607 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212602(int [] tdone, int [] ends){
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

  public void thread212601(int [] tdone, int [] ends){
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

  public void thread212600(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212601(tdone,ends);
    thread212602(tdone,ends);
    int biggest212603 = 0;
    if(ends[39]>=biggest212603){
      biggest212603=ends[39];
    }
    if(ends[40]>=biggest212603){
      biggest212603=ends[40];
    }
    if(biggest212603 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212598(int [] tdone, int [] ends){
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

  public void thread212597(int [] tdone, int [] ends){
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

  public void thread212596(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212597(tdone,ends);
    thread212598(tdone,ends);
    int biggest212599 = 0;
    if(ends[36]>=biggest212599){
      biggest212599=ends[36];
    }
    if(ends[37]>=biggest212599){
      biggest212599=ends[37];
    }
    if(biggest212599 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212595(int [] tdone, int [] ends){
        S7351=1;
    thread212596(tdone,ends);
    thread212600(tdone,ends);
    thread212604(tdone,ends);
    thread212608(tdone,ends);
    int biggest212612 = 0;
    if(ends[35]>=biggest212612){
      biggest212612=ends[35];
    }
    if(ends[38]>=biggest212612){
      biggest212612=ends[38];
    }
    if(ends[41]>=biggest212612){
      biggest212612=ends[41];
    }
    if(ends[44]>=biggest212612){
      biggest212612=ends[44];
    }
    if(biggest212612 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212612 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212612 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212612 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212593(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212592(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212591(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212590(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212589(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212590(tdone,ends);
    thread212591(tdone,ends);
    thread212592(tdone,ends);
    thread212593(tdone,ends);
    int biggest212594 = 0;
    if(ends[28]>=biggest212594){
      biggest212594=ends[28];
    }
    if(ends[29]>=biggest212594){
      biggest212594=ends[29];
    }
    if(ends[30]>=biggest212594){
      biggest212594=ends[30];
    }
    if(ends[31]>=biggest212594){
      biggest212594=ends[31];
    }
    if(biggest212594 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212586(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212585(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212584(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212585(tdone,ends);
      thread212586(tdone,ends);
      int biggest212587 = 0;
      if(ends[49]>=biggest212587){
        biggest212587=ends[49];
      }
      if(ends[50]>=biggest212587){
        biggest212587=ends[50];
      }
      if(biggest212587 == 1){
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

  public void thread212583(int [] tdone, int [] ends){
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

  public void thread212580(int [] tdone, int [] ends){
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

  public void thread212579(int [] tdone, int [] ends){
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

  public void thread212578(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212579(tdone,ends);
    thread212580(tdone,ends);
    int biggest212581 = 0;
    if(ends[45]>=biggest212581){
      biggest212581=ends[45];
    }
    if(ends[46]>=biggest212581){
      biggest212581=ends[46];
    }
    if(biggest212581 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212576(int [] tdone, int [] ends){
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

  public void thread212575(int [] tdone, int [] ends){
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

  public void thread212574(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212575(tdone,ends);
    thread212576(tdone,ends);
    int biggest212577 = 0;
    if(ends[42]>=biggest212577){
      biggest212577=ends[42];
    }
    if(ends[43]>=biggest212577){
      biggest212577=ends[43];
    }
    if(biggest212577 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212572(int [] tdone, int [] ends){
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

  public void thread212571(int [] tdone, int [] ends){
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

  public void thread212570(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212571(tdone,ends);
    thread212572(tdone,ends);
    int biggest212573 = 0;
    if(ends[39]>=biggest212573){
      biggest212573=ends[39];
    }
    if(ends[40]>=biggest212573){
      biggest212573=ends[40];
    }
    if(biggest212573 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212568(int [] tdone, int [] ends){
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

  public void thread212567(int [] tdone, int [] ends){
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

  public void thread212566(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212567(tdone,ends);
    thread212568(tdone,ends);
    int biggest212569 = 0;
    if(ends[36]>=biggest212569){
      biggest212569=ends[36];
    }
    if(ends[37]>=biggest212569){
      biggest212569=ends[37];
    }
    if(biggest212569 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212565(int [] tdone, int [] ends){
        S7351=1;
    thread212566(tdone,ends);
    thread212570(tdone,ends);
    thread212574(tdone,ends);
    thread212578(tdone,ends);
    int biggest212582 = 0;
    if(ends[35]>=biggest212582){
      biggest212582=ends[35];
    }
    if(ends[38]>=biggest212582){
      biggest212582=ends[38];
    }
    if(ends[41]>=biggest212582){
      biggest212582=ends[41];
    }
    if(ends[44]>=biggest212582){
      biggest212582=ends[44];
    }
    if(biggest212582 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212582 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212582 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212582 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212563(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212562(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212561(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212560(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212559(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212560(tdone,ends);
    thread212561(tdone,ends);
    thread212562(tdone,ends);
    thread212563(tdone,ends);
    int biggest212564 = 0;
    if(ends[28]>=biggest212564){
      biggest212564=ends[28];
    }
    if(ends[29]>=biggest212564){
      biggest212564=ends[29];
    }
    if(ends[30]>=biggest212564){
      biggest212564=ends[30];
    }
    if(ends[31]>=biggest212564){
      biggest212564=ends[31];
    }
    if(biggest212564 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212556(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212555(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212554(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212555(tdone,ends);
      thread212556(tdone,ends);
      int biggest212557 = 0;
      if(ends[49]>=biggest212557){
        biggest212557=ends[49];
      }
      if(ends[50]>=biggest212557){
        biggest212557=ends[50];
      }
      if(biggest212557 == 1){
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

  public void thread212553(int [] tdone, int [] ends){
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

  public void thread212550(int [] tdone, int [] ends){
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

  public void thread212549(int [] tdone, int [] ends){
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

  public void thread212548(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212549(tdone,ends);
    thread212550(tdone,ends);
    int biggest212551 = 0;
    if(ends[45]>=biggest212551){
      biggest212551=ends[45];
    }
    if(ends[46]>=biggest212551){
      biggest212551=ends[46];
    }
    if(biggest212551 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212546(int [] tdone, int [] ends){
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

  public void thread212545(int [] tdone, int [] ends){
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

  public void thread212544(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212545(tdone,ends);
    thread212546(tdone,ends);
    int biggest212547 = 0;
    if(ends[42]>=biggest212547){
      biggest212547=ends[42];
    }
    if(ends[43]>=biggest212547){
      biggest212547=ends[43];
    }
    if(biggest212547 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212542(int [] tdone, int [] ends){
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

  public void thread212541(int [] tdone, int [] ends){
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

  public void thread212540(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212541(tdone,ends);
    thread212542(tdone,ends);
    int biggest212543 = 0;
    if(ends[39]>=biggest212543){
      biggest212543=ends[39];
    }
    if(ends[40]>=biggest212543){
      biggest212543=ends[40];
    }
    if(biggest212543 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212538(int [] tdone, int [] ends){
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

  public void thread212537(int [] tdone, int [] ends){
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

  public void thread212536(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212537(tdone,ends);
    thread212538(tdone,ends);
    int biggest212539 = 0;
    if(ends[36]>=biggest212539){
      biggest212539=ends[36];
    }
    if(ends[37]>=biggest212539){
      biggest212539=ends[37];
    }
    if(biggest212539 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212535(int [] tdone, int [] ends){
        S7351=1;
    thread212536(tdone,ends);
    thread212540(tdone,ends);
    thread212544(tdone,ends);
    thread212548(tdone,ends);
    int biggest212552 = 0;
    if(ends[35]>=biggest212552){
      biggest212552=ends[35];
    }
    if(ends[38]>=biggest212552){
      biggest212552=ends[38];
    }
    if(ends[41]>=biggest212552){
      biggest212552=ends[41];
    }
    if(ends[44]>=biggest212552){
      biggest212552=ends[44];
    }
    if(biggest212552 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212552 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212552 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212552 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212533(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212532(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212531(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212530(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212529(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212530(tdone,ends);
    thread212531(tdone,ends);
    thread212532(tdone,ends);
    thread212533(tdone,ends);
    int biggest212534 = 0;
    if(ends[28]>=biggest212534){
      biggest212534=ends[28];
    }
    if(ends[29]>=biggest212534){
      biggest212534=ends[29];
    }
    if(ends[30]>=biggest212534){
      biggest212534=ends[30];
    }
    if(ends[31]>=biggest212534){
      biggest212534=ends[31];
    }
    if(biggest212534 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212526(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212525(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212524(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212525(tdone,ends);
      thread212526(tdone,ends);
      int biggest212527 = 0;
      if(ends[49]>=biggest212527){
        biggest212527=ends[49];
      }
      if(ends[50]>=biggest212527){
        biggest212527=ends[50];
      }
      if(biggest212527 == 1){
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

  public void thread212523(int [] tdone, int [] ends){
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

  public void thread212520(int [] tdone, int [] ends){
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

  public void thread212519(int [] tdone, int [] ends){
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

  public void thread212518(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212519(tdone,ends);
    thread212520(tdone,ends);
    int biggest212521 = 0;
    if(ends[45]>=biggest212521){
      biggest212521=ends[45];
    }
    if(ends[46]>=biggest212521){
      biggest212521=ends[46];
    }
    if(biggest212521 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212516(int [] tdone, int [] ends){
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

  public void thread212515(int [] tdone, int [] ends){
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

  public void thread212514(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212515(tdone,ends);
    thread212516(tdone,ends);
    int biggest212517 = 0;
    if(ends[42]>=biggest212517){
      biggest212517=ends[42];
    }
    if(ends[43]>=biggest212517){
      biggest212517=ends[43];
    }
    if(biggest212517 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212512(int [] tdone, int [] ends){
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

  public void thread212511(int [] tdone, int [] ends){
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

  public void thread212510(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212511(tdone,ends);
    thread212512(tdone,ends);
    int biggest212513 = 0;
    if(ends[39]>=biggest212513){
      biggest212513=ends[39];
    }
    if(ends[40]>=biggest212513){
      biggest212513=ends[40];
    }
    if(biggest212513 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212508(int [] tdone, int [] ends){
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

  public void thread212507(int [] tdone, int [] ends){
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

  public void thread212506(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212507(tdone,ends);
    thread212508(tdone,ends);
    int biggest212509 = 0;
    if(ends[36]>=biggest212509){
      biggest212509=ends[36];
    }
    if(ends[37]>=biggest212509){
      biggest212509=ends[37];
    }
    if(biggest212509 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212505(int [] tdone, int [] ends){
        S7351=1;
    thread212506(tdone,ends);
    thread212510(tdone,ends);
    thread212514(tdone,ends);
    thread212518(tdone,ends);
    int biggest212522 = 0;
    if(ends[35]>=biggest212522){
      biggest212522=ends[35];
    }
    if(ends[38]>=biggest212522){
      biggest212522=ends[38];
    }
    if(ends[41]>=biggest212522){
      biggest212522=ends[41];
    }
    if(ends[44]>=biggest212522){
      biggest212522=ends[44];
    }
    if(biggest212522 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212522 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212522 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212522 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212503(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212502(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212501(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212500(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212499(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212500(tdone,ends);
    thread212501(tdone,ends);
    thread212502(tdone,ends);
    thread212503(tdone,ends);
    int biggest212504 = 0;
    if(ends[28]>=biggest212504){
      biggest212504=ends[28];
    }
    if(ends[29]>=biggest212504){
      biggest212504=ends[29];
    }
    if(ends[30]>=biggest212504){
      biggest212504=ends[30];
    }
    if(ends[31]>=biggest212504){
      biggest212504=ends[31];
    }
    if(biggest212504 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212496(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212495(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212494(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212495(tdone,ends);
      thread212496(tdone,ends);
      int biggest212497 = 0;
      if(ends[49]>=biggest212497){
        biggest212497=ends[49];
      }
      if(ends[50]>=biggest212497){
        biggest212497=ends[50];
      }
      if(biggest212497 == 1){
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

  public void thread212493(int [] tdone, int [] ends){
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

  public void thread212490(int [] tdone, int [] ends){
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

  public void thread212489(int [] tdone, int [] ends){
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

  public void thread212488(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212489(tdone,ends);
    thread212490(tdone,ends);
    int biggest212491 = 0;
    if(ends[45]>=biggest212491){
      biggest212491=ends[45];
    }
    if(ends[46]>=biggest212491){
      biggest212491=ends[46];
    }
    if(biggest212491 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212486(int [] tdone, int [] ends){
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

  public void thread212485(int [] tdone, int [] ends){
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

  public void thread212484(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212485(tdone,ends);
    thread212486(tdone,ends);
    int biggest212487 = 0;
    if(ends[42]>=biggest212487){
      biggest212487=ends[42];
    }
    if(ends[43]>=biggest212487){
      biggest212487=ends[43];
    }
    if(biggest212487 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212482(int [] tdone, int [] ends){
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

  public void thread212481(int [] tdone, int [] ends){
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

  public void thread212480(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212481(tdone,ends);
    thread212482(tdone,ends);
    int biggest212483 = 0;
    if(ends[39]>=biggest212483){
      biggest212483=ends[39];
    }
    if(ends[40]>=biggest212483){
      biggest212483=ends[40];
    }
    if(biggest212483 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212478(int [] tdone, int [] ends){
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

  public void thread212477(int [] tdone, int [] ends){
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

  public void thread212476(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212477(tdone,ends);
    thread212478(tdone,ends);
    int biggest212479 = 0;
    if(ends[36]>=biggest212479){
      biggest212479=ends[36];
    }
    if(ends[37]>=biggest212479){
      biggest212479=ends[37];
    }
    if(biggest212479 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212475(int [] tdone, int [] ends){
        S7351=1;
    thread212476(tdone,ends);
    thread212480(tdone,ends);
    thread212484(tdone,ends);
    thread212488(tdone,ends);
    int biggest212492 = 0;
    if(ends[35]>=biggest212492){
      biggest212492=ends[35];
    }
    if(ends[38]>=biggest212492){
      biggest212492=ends[38];
    }
    if(ends[41]>=biggest212492){
      biggest212492=ends[41];
    }
    if(ends[44]>=biggest212492){
      biggest212492=ends[44];
    }
    if(biggest212492 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212492 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212492 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212492 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212473(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212472(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212471(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212470(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212469(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212470(tdone,ends);
    thread212471(tdone,ends);
    thread212472(tdone,ends);
    thread212473(tdone,ends);
    int biggest212474 = 0;
    if(ends[28]>=biggest212474){
      biggest212474=ends[28];
    }
    if(ends[29]>=biggest212474){
      biggest212474=ends[29];
    }
    if(ends[30]>=biggest212474){
      biggest212474=ends[30];
    }
    if(ends[31]>=biggest212474){
      biggest212474=ends[31];
    }
    if(biggest212474 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212466(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212465(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212464(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212465(tdone,ends);
      thread212466(tdone,ends);
      int biggest212467 = 0;
      if(ends[49]>=biggest212467){
        biggest212467=ends[49];
      }
      if(ends[50]>=biggest212467){
        biggest212467=ends[50];
      }
      if(biggest212467 == 1){
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

  public void thread212463(int [] tdone, int [] ends){
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

  public void thread212460(int [] tdone, int [] ends){
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

  public void thread212459(int [] tdone, int [] ends){
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

  public void thread212458(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212459(tdone,ends);
    thread212460(tdone,ends);
    int biggest212461 = 0;
    if(ends[45]>=biggest212461){
      biggest212461=ends[45];
    }
    if(ends[46]>=biggest212461){
      biggest212461=ends[46];
    }
    if(biggest212461 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212456(int [] tdone, int [] ends){
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

  public void thread212455(int [] tdone, int [] ends){
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

  public void thread212454(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212455(tdone,ends);
    thread212456(tdone,ends);
    int biggest212457 = 0;
    if(ends[42]>=biggest212457){
      biggest212457=ends[42];
    }
    if(ends[43]>=biggest212457){
      biggest212457=ends[43];
    }
    if(biggest212457 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212452(int [] tdone, int [] ends){
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

  public void thread212451(int [] tdone, int [] ends){
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

  public void thread212450(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212451(tdone,ends);
    thread212452(tdone,ends);
    int biggest212453 = 0;
    if(ends[39]>=biggest212453){
      biggest212453=ends[39];
    }
    if(ends[40]>=biggest212453){
      biggest212453=ends[40];
    }
    if(biggest212453 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212448(int [] tdone, int [] ends){
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

  public void thread212447(int [] tdone, int [] ends){
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

  public void thread212446(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212447(tdone,ends);
    thread212448(tdone,ends);
    int biggest212449 = 0;
    if(ends[36]>=biggest212449){
      biggest212449=ends[36];
    }
    if(ends[37]>=biggest212449){
      biggest212449=ends[37];
    }
    if(biggest212449 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212445(int [] tdone, int [] ends){
        S7351=1;
    thread212446(tdone,ends);
    thread212450(tdone,ends);
    thread212454(tdone,ends);
    thread212458(tdone,ends);
    int biggest212462 = 0;
    if(ends[35]>=biggest212462){
      biggest212462=ends[35];
    }
    if(ends[38]>=biggest212462){
      biggest212462=ends[38];
    }
    if(ends[41]>=biggest212462){
      biggest212462=ends[41];
    }
    if(ends[44]>=biggest212462){
      biggest212462=ends[44];
    }
    if(biggest212462 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212462 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212462 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212462 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212443(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212442(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212441(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212440(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212439(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212440(tdone,ends);
    thread212441(tdone,ends);
    thread212442(tdone,ends);
    thread212443(tdone,ends);
    int biggest212444 = 0;
    if(ends[28]>=biggest212444){
      biggest212444=ends[28];
    }
    if(ends[29]>=biggest212444){
      biggest212444=ends[29];
    }
    if(ends[30]>=biggest212444){
      biggest212444=ends[30];
    }
    if(ends[31]>=biggest212444){
      biggest212444=ends[31];
    }
    if(biggest212444 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212436(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212435(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212434(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212435(tdone,ends);
      thread212436(tdone,ends);
      int biggest212437 = 0;
      if(ends[49]>=biggest212437){
        biggest212437=ends[49];
      }
      if(ends[50]>=biggest212437){
        biggest212437=ends[50];
      }
      if(biggest212437 == 1){
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

  public void thread212433(int [] tdone, int [] ends){
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

  public void thread212430(int [] tdone, int [] ends){
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

  public void thread212429(int [] tdone, int [] ends){
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

  public void thread212428(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212429(tdone,ends);
    thread212430(tdone,ends);
    int biggest212431 = 0;
    if(ends[45]>=biggest212431){
      biggest212431=ends[45];
    }
    if(ends[46]>=biggest212431){
      biggest212431=ends[46];
    }
    if(biggest212431 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212426(int [] tdone, int [] ends){
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

  public void thread212425(int [] tdone, int [] ends){
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

  public void thread212424(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212425(tdone,ends);
    thread212426(tdone,ends);
    int biggest212427 = 0;
    if(ends[42]>=biggest212427){
      biggest212427=ends[42];
    }
    if(ends[43]>=biggest212427){
      biggest212427=ends[43];
    }
    if(biggest212427 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212422(int [] tdone, int [] ends){
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

  public void thread212421(int [] tdone, int [] ends){
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

  public void thread212420(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212421(tdone,ends);
    thread212422(tdone,ends);
    int biggest212423 = 0;
    if(ends[39]>=biggest212423){
      biggest212423=ends[39];
    }
    if(ends[40]>=biggest212423){
      biggest212423=ends[40];
    }
    if(biggest212423 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212418(int [] tdone, int [] ends){
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

  public void thread212417(int [] tdone, int [] ends){
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

  public void thread212416(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212417(tdone,ends);
    thread212418(tdone,ends);
    int biggest212419 = 0;
    if(ends[36]>=biggest212419){
      biggest212419=ends[36];
    }
    if(ends[37]>=biggest212419){
      biggest212419=ends[37];
    }
    if(biggest212419 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212415(int [] tdone, int [] ends){
        S7351=1;
    thread212416(tdone,ends);
    thread212420(tdone,ends);
    thread212424(tdone,ends);
    thread212428(tdone,ends);
    int biggest212432 = 0;
    if(ends[35]>=biggest212432){
      biggest212432=ends[35];
    }
    if(ends[38]>=biggest212432){
      biggest212432=ends[38];
    }
    if(ends[41]>=biggest212432){
      biggest212432=ends[41];
    }
    if(ends[44]>=biggest212432){
      biggest212432=ends[44];
    }
    if(biggest212432 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212432 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212432 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212432 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212413(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212412(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212411(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212410(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212409(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212410(tdone,ends);
    thread212411(tdone,ends);
    thread212412(tdone,ends);
    thread212413(tdone,ends);
    int biggest212414 = 0;
    if(ends[28]>=biggest212414){
      biggest212414=ends[28];
    }
    if(ends[29]>=biggest212414){
      biggest212414=ends[29];
    }
    if(ends[30]>=biggest212414){
      biggest212414=ends[30];
    }
    if(ends[31]>=biggest212414){
      biggest212414=ends[31];
    }
    if(biggest212414 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212406(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212405(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212404(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212405(tdone,ends);
      thread212406(tdone,ends);
      int biggest212407 = 0;
      if(ends[49]>=biggest212407){
        biggest212407=ends[49];
      }
      if(ends[50]>=biggest212407){
        biggest212407=ends[50];
      }
      if(biggest212407 == 1){
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

  public void thread212403(int [] tdone, int [] ends){
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

  public void thread212400(int [] tdone, int [] ends){
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

  public void thread212399(int [] tdone, int [] ends){
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

  public void thread212398(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212399(tdone,ends);
    thread212400(tdone,ends);
    int biggest212401 = 0;
    if(ends[45]>=biggest212401){
      biggest212401=ends[45];
    }
    if(ends[46]>=biggest212401){
      biggest212401=ends[46];
    }
    if(biggest212401 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212396(int [] tdone, int [] ends){
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

  public void thread212395(int [] tdone, int [] ends){
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

  public void thread212394(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212395(tdone,ends);
    thread212396(tdone,ends);
    int biggest212397 = 0;
    if(ends[42]>=biggest212397){
      biggest212397=ends[42];
    }
    if(ends[43]>=biggest212397){
      biggest212397=ends[43];
    }
    if(biggest212397 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212392(int [] tdone, int [] ends){
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

  public void thread212391(int [] tdone, int [] ends){
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

  public void thread212390(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212391(tdone,ends);
    thread212392(tdone,ends);
    int biggest212393 = 0;
    if(ends[39]>=biggest212393){
      biggest212393=ends[39];
    }
    if(ends[40]>=biggest212393){
      biggest212393=ends[40];
    }
    if(biggest212393 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212388(int [] tdone, int [] ends){
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

  public void thread212387(int [] tdone, int [] ends){
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

  public void thread212386(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212387(tdone,ends);
    thread212388(tdone,ends);
    int biggest212389 = 0;
    if(ends[36]>=biggest212389){
      biggest212389=ends[36];
    }
    if(ends[37]>=biggest212389){
      biggest212389=ends[37];
    }
    if(biggest212389 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212385(int [] tdone, int [] ends){
        S7351=1;
    thread212386(tdone,ends);
    thread212390(tdone,ends);
    thread212394(tdone,ends);
    thread212398(tdone,ends);
    int biggest212402 = 0;
    if(ends[35]>=biggest212402){
      biggest212402=ends[35];
    }
    if(ends[38]>=biggest212402){
      biggest212402=ends[38];
    }
    if(ends[41]>=biggest212402){
      biggest212402=ends[41];
    }
    if(ends[44]>=biggest212402){
      biggest212402=ends[44];
    }
    if(biggest212402 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212402 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212402 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212402 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212383(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212382(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212381(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212380(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212379(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212380(tdone,ends);
    thread212381(tdone,ends);
    thread212382(tdone,ends);
    thread212383(tdone,ends);
    int biggest212384 = 0;
    if(ends[28]>=biggest212384){
      biggest212384=ends[28];
    }
    if(ends[29]>=biggest212384){
      biggest212384=ends[29];
    }
    if(ends[30]>=biggest212384){
      biggest212384=ends[30];
    }
    if(ends[31]>=biggest212384){
      biggest212384=ends[31];
    }
    if(biggest212384 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212376(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212375(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212374(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212375(tdone,ends);
      thread212376(tdone,ends);
      int biggest212377 = 0;
      if(ends[49]>=biggest212377){
        biggest212377=ends[49];
      }
      if(ends[50]>=biggest212377){
        biggest212377=ends[50];
      }
      if(biggest212377 == 1){
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

  public void thread212373(int [] tdone, int [] ends){
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

  public void thread212370(int [] tdone, int [] ends){
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

  public void thread212369(int [] tdone, int [] ends){
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

  public void thread212368(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212369(tdone,ends);
    thread212370(tdone,ends);
    int biggest212371 = 0;
    if(ends[45]>=biggest212371){
      biggest212371=ends[45];
    }
    if(ends[46]>=biggest212371){
      biggest212371=ends[46];
    }
    if(biggest212371 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212366(int [] tdone, int [] ends){
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

  public void thread212365(int [] tdone, int [] ends){
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

  public void thread212364(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212365(tdone,ends);
    thread212366(tdone,ends);
    int biggest212367 = 0;
    if(ends[42]>=biggest212367){
      biggest212367=ends[42];
    }
    if(ends[43]>=biggest212367){
      biggest212367=ends[43];
    }
    if(biggest212367 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212362(int [] tdone, int [] ends){
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

  public void thread212361(int [] tdone, int [] ends){
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

  public void thread212360(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212361(tdone,ends);
    thread212362(tdone,ends);
    int biggest212363 = 0;
    if(ends[39]>=biggest212363){
      biggest212363=ends[39];
    }
    if(ends[40]>=biggest212363){
      biggest212363=ends[40];
    }
    if(biggest212363 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212358(int [] tdone, int [] ends){
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

  public void thread212357(int [] tdone, int [] ends){
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

  public void thread212356(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212357(tdone,ends);
    thread212358(tdone,ends);
    int biggest212359 = 0;
    if(ends[36]>=biggest212359){
      biggest212359=ends[36];
    }
    if(ends[37]>=biggest212359){
      biggest212359=ends[37];
    }
    if(biggest212359 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212355(int [] tdone, int [] ends){
        S7351=1;
    thread212356(tdone,ends);
    thread212360(tdone,ends);
    thread212364(tdone,ends);
    thread212368(tdone,ends);
    int biggest212372 = 0;
    if(ends[35]>=biggest212372){
      biggest212372=ends[35];
    }
    if(ends[38]>=biggest212372){
      biggest212372=ends[38];
    }
    if(ends[41]>=biggest212372){
      biggest212372=ends[41];
    }
    if(ends[44]>=biggest212372){
      biggest212372=ends[44];
    }
    if(biggest212372 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212372 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212372 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212372 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212353(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212352(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212351(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212350(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212349(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212350(tdone,ends);
    thread212351(tdone,ends);
    thread212352(tdone,ends);
    thread212353(tdone,ends);
    int biggest212354 = 0;
    if(ends[28]>=biggest212354){
      biggest212354=ends[28];
    }
    if(ends[29]>=biggest212354){
      biggest212354=ends[29];
    }
    if(ends[30]>=biggest212354){
      biggest212354=ends[30];
    }
    if(ends[31]>=biggest212354){
      biggest212354=ends[31];
    }
    if(biggest212354 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212346(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212345(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212344(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212345(tdone,ends);
      thread212346(tdone,ends);
      int biggest212347 = 0;
      if(ends[49]>=biggest212347){
        biggest212347=ends[49];
      }
      if(ends[50]>=biggest212347){
        biggest212347=ends[50];
      }
      if(biggest212347 == 1){
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

  public void thread212343(int [] tdone, int [] ends){
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

  public void thread212340(int [] tdone, int [] ends){
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

  public void thread212339(int [] tdone, int [] ends){
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

  public void thread212338(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212339(tdone,ends);
    thread212340(tdone,ends);
    int biggest212341 = 0;
    if(ends[45]>=biggest212341){
      biggest212341=ends[45];
    }
    if(ends[46]>=biggest212341){
      biggest212341=ends[46];
    }
    if(biggest212341 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212336(int [] tdone, int [] ends){
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

  public void thread212335(int [] tdone, int [] ends){
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

  public void thread212334(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212335(tdone,ends);
    thread212336(tdone,ends);
    int biggest212337 = 0;
    if(ends[42]>=biggest212337){
      biggest212337=ends[42];
    }
    if(ends[43]>=biggest212337){
      biggest212337=ends[43];
    }
    if(biggest212337 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212332(int [] tdone, int [] ends){
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

  public void thread212331(int [] tdone, int [] ends){
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

  public void thread212330(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212331(tdone,ends);
    thread212332(tdone,ends);
    int biggest212333 = 0;
    if(ends[39]>=biggest212333){
      biggest212333=ends[39];
    }
    if(ends[40]>=biggest212333){
      biggest212333=ends[40];
    }
    if(biggest212333 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212328(int [] tdone, int [] ends){
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

  public void thread212327(int [] tdone, int [] ends){
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

  public void thread212326(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212327(tdone,ends);
    thread212328(tdone,ends);
    int biggest212329 = 0;
    if(ends[36]>=biggest212329){
      biggest212329=ends[36];
    }
    if(ends[37]>=biggest212329){
      biggest212329=ends[37];
    }
    if(biggest212329 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212325(int [] tdone, int [] ends){
        S7351=1;
    thread212326(tdone,ends);
    thread212330(tdone,ends);
    thread212334(tdone,ends);
    thread212338(tdone,ends);
    int biggest212342 = 0;
    if(ends[35]>=biggest212342){
      biggest212342=ends[35];
    }
    if(ends[38]>=biggest212342){
      biggest212342=ends[38];
    }
    if(ends[41]>=biggest212342){
      biggest212342=ends[41];
    }
    if(ends[44]>=biggest212342){
      biggest212342=ends[44];
    }
    if(biggest212342 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212342 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212342 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212342 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212323(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212322(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212321(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212320(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212319(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212320(tdone,ends);
    thread212321(tdone,ends);
    thread212322(tdone,ends);
    thread212323(tdone,ends);
    int biggest212324 = 0;
    if(ends[28]>=biggest212324){
      biggest212324=ends[28];
    }
    if(ends[29]>=biggest212324){
      biggest212324=ends[29];
    }
    if(ends[30]>=biggest212324){
      biggest212324=ends[30];
    }
    if(ends[31]>=biggest212324){
      biggest212324=ends[31];
    }
    if(biggest212324 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread212316(int [] tdone, int [] ends){
        S7442=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread212315(int [] tdone, int [] ends){
        S7439=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 339, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread212314(int [] tdone, int [] ends){
        S7472=1;
    S7446=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 337, column: 21
      thread212315(tdone,ends);
      thread212316(tdone,ends);
      int biggest212317 = 0;
      if(ends[49]>=biggest212317){
        biggest212317=ends[49];
      }
      if(ends[50]>=biggest212317){
        biggest212317=ends[50];
      }
      if(biggest212317 == 1){
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

  public void thread212313(int [] tdone, int [] ends){
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

  public void thread212310(int [] tdone, int [] ends){
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

  public void thread212309(int [] tdone, int [] ends){
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

  public void thread212308(int [] tdone, int [] ends){
        S7349=1;
    S7283=0;
    thread212309(tdone,ends);
    thread212310(tdone,ends);
    int biggest212311 = 0;
    if(ends[45]>=biggest212311){
      biggest212311=ends[45];
    }
    if(ends[46]>=biggest212311){
      biggest212311=ends[46];
    }
    if(biggest212311 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread212306(int [] tdone, int [] ends){
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

  public void thread212305(int [] tdone, int [] ends){
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

  public void thread212304(int [] tdone, int [] ends){
        S7250=1;
    S7184=0;
    thread212305(tdone,ends);
    thread212306(tdone,ends);
    int biggest212307 = 0;
    if(ends[42]>=biggest212307){
      biggest212307=ends[42];
    }
    if(ends[43]>=biggest212307){
      biggest212307=ends[43];
    }
    if(biggest212307 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread212302(int [] tdone, int [] ends){
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

  public void thread212301(int [] tdone, int [] ends){
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

  public void thread212300(int [] tdone, int [] ends){
        S7151=1;
    S7085=0;
    thread212301(tdone,ends);
    thread212302(tdone,ends);
    int biggest212303 = 0;
    if(ends[39]>=biggest212303){
      biggest212303=ends[39];
    }
    if(ends[40]>=biggest212303){
      biggest212303=ends[40];
    }
    if(biggest212303 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread212298(int [] tdone, int [] ends){
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

  public void thread212297(int [] tdone, int [] ends){
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

  public void thread212296(int [] tdone, int [] ends){
        S7052=1;
    S6986=0;
    thread212297(tdone,ends);
    thread212298(tdone,ends);
    int biggest212299 = 0;
    if(ends[36]>=biggest212299){
      biggest212299=ends[36];
    }
    if(ends[37]>=biggest212299){
      biggest212299=ends[37];
    }
    if(biggest212299 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread212295(int [] tdone, int [] ends){
        S7351=1;
    thread212296(tdone,ends);
    thread212300(tdone,ends);
    thread212304(tdone,ends);
    thread212308(tdone,ends);
    int biggest212312 = 0;
    if(ends[35]>=biggest212312){
      biggest212312=ends[35];
    }
    if(ends[38]>=biggest212312){
      biggest212312=ends[38];
    }
    if(ends[41]>=biggest212312){
      biggest212312=ends[41];
    }
    if(ends[44]>=biggest212312){
      biggest212312=ends[44];
    }
    if(biggest212312 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212312 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212312 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest212312 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread212293(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread212292(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread212291(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread212290(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread212289(int [] tdone, int [] ends){
        S6953=1;
    S4066=0;
    thread212290(tdone,ends);
    thread212291(tdone,ends);
    thread212292(tdone,ends);
    thread212293(tdone,ends);
    int biggest212294 = 0;
    if(ends[28]>=biggest212294){
      biggest212294=ends[28];
    }
    if(ends[29]>=biggest212294){
      biggest212294=ends[29];
    }
    if(ends[30]>=biggest212294){
      biggest212294=ends[30];
    }
    if(ends[31]>=biggest212294){
      biggest212294=ends[31];
    }
    if(biggest212294 == 1){
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
                                  thread212289(tdone,ends);
                                  thread212295(tdone,ends);
                                  thread212313(tdone,ends);
                                  thread212314(tdone,ends);
                                  int biggest212318 = 0;
                                  if(ends[27]>=biggest212318){
                                    biggest212318=ends[27];
                                  }
                                  if(ends[34]>=biggest212318){
                                    biggest212318=ends[34];
                                  }
                                  if(ends[47]>=biggest212318){
                                    biggest212318=ends[47];
                                  }
                                  if(ends[48]>=biggest212318){
                                    biggest212318=ends[48];
                                  }
                                  if(biggest212318 == 1){
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
                                              thread212319(tdone,ends);
                                              thread212325(tdone,ends);
                                              thread212343(tdone,ends);
                                              thread212344(tdone,ends);
                                              int biggest212348 = 0;
                                              if(ends[27]>=biggest212348){
                                                biggest212348=ends[27];
                                              }
                                              if(ends[34]>=biggest212348){
                                                biggest212348=ends[34];
                                              }
                                              if(ends[47]>=biggest212348){
                                                biggest212348=ends[47];
                                              }
                                              if(ends[48]>=biggest212348){
                                                biggest212348=ends[48];
                                              }
                                              if(biggest212348 == 1){
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
                                            thread212349(tdone,ends);
                                            thread212355(tdone,ends);
                                            thread212373(tdone,ends);
                                            thread212374(tdone,ends);
                                            int biggest212378 = 0;
                                            if(ends[27]>=biggest212378){
                                              biggest212378=ends[27];
                                            }
                                            if(ends[34]>=biggest212378){
                                              biggest212378=ends[34];
                                            }
                                            if(ends[47]>=biggest212378){
                                              biggest212378=ends[47];
                                            }
                                            if(ends[48]>=biggest212378){
                                              biggest212378=ends[48];
                                            }
                                            if(biggest212378 == 1){
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
                                          thread212379(tdone,ends);
                                          thread212385(tdone,ends);
                                          thread212403(tdone,ends);
                                          thread212404(tdone,ends);
                                          int biggest212408 = 0;
                                          if(ends[27]>=biggest212408){
                                            biggest212408=ends[27];
                                          }
                                          if(ends[34]>=biggest212408){
                                            biggest212408=ends[34];
                                          }
                                          if(ends[47]>=biggest212408){
                                            biggest212408=ends[47];
                                          }
                                          if(ends[48]>=biggest212408){
                                            biggest212408=ends[48];
                                          }
                                          if(biggest212408 == 1){
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
                                        thread212409(tdone,ends);
                                        thread212415(tdone,ends);
                                        thread212433(tdone,ends);
                                        thread212434(tdone,ends);
                                        int biggest212438 = 0;
                                        if(ends[27]>=biggest212438){
                                          biggest212438=ends[27];
                                        }
                                        if(ends[34]>=biggest212438){
                                          biggest212438=ends[34];
                                        }
                                        if(ends[47]>=biggest212438){
                                          biggest212438=ends[47];
                                        }
                                        if(ends[48]>=biggest212438){
                                          biggest212438=ends[48];
                                        }
                                        if(biggest212438 == 1){
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
                                      thread212439(tdone,ends);
                                      thread212445(tdone,ends);
                                      thread212463(tdone,ends);
                                      thread212464(tdone,ends);
                                      int biggest212468 = 0;
                                      if(ends[27]>=biggest212468){
                                        biggest212468=ends[27];
                                      }
                                      if(ends[34]>=biggest212468){
                                        biggest212468=ends[34];
                                      }
                                      if(ends[47]>=biggest212468){
                                        biggest212468=ends[47];
                                      }
                                      if(ends[48]>=biggest212468){
                                        biggest212468=ends[48];
                                      }
                                      if(biggest212468 == 1){
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
                                    thread212469(tdone,ends);
                                    thread212475(tdone,ends);
                                    thread212493(tdone,ends);
                                    thread212494(tdone,ends);
                                    int biggest212498 = 0;
                                    if(ends[27]>=biggest212498){
                                      biggest212498=ends[27];
                                    }
                                    if(ends[34]>=biggest212498){
                                      biggest212498=ends[34];
                                    }
                                    if(ends[47]>=biggest212498){
                                      biggest212498=ends[47];
                                    }
                                    if(ends[48]>=biggest212498){
                                      biggest212498=ends[48];
                                    }
                                    if(biggest212498 == 1){
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
                                  thread212499(tdone,ends);
                                  thread212505(tdone,ends);
                                  thread212523(tdone,ends);
                                  thread212524(tdone,ends);
                                  int biggest212528 = 0;
                                  if(ends[27]>=biggest212528){
                                    biggest212528=ends[27];
                                  }
                                  if(ends[34]>=biggest212528){
                                    biggest212528=ends[34];
                                  }
                                  if(ends[47]>=biggest212528){
                                    biggest212528=ends[47];
                                  }
                                  if(ends[48]>=biggest212528){
                                    biggest212528=ends[48];
                                  }
                                  if(biggest212528 == 1){
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
                                thread212529(tdone,ends);
                                thread212535(tdone,ends);
                                thread212553(tdone,ends);
                                thread212554(tdone,ends);
                                int biggest212558 = 0;
                                if(ends[27]>=biggest212558){
                                  biggest212558=ends[27];
                                }
                                if(ends[34]>=biggest212558){
                                  biggest212558=ends[34];
                                }
                                if(ends[47]>=biggest212558){
                                  biggest212558=ends[47];
                                }
                                if(ends[48]>=biggest212558){
                                  biggest212558=ends[48];
                                }
                                if(biggest212558 == 1){
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
                              thread212559(tdone,ends);
                              thread212565(tdone,ends);
                              thread212583(tdone,ends);
                              thread212584(tdone,ends);
                              int biggest212588 = 0;
                              if(ends[27]>=biggest212588){
                                biggest212588=ends[27];
                              }
                              if(ends[34]>=biggest212588){
                                biggest212588=ends[34];
                              }
                              if(ends[47]>=biggest212588){
                                biggest212588=ends[47];
                              }
                              if(ends[48]>=biggest212588){
                                biggest212588=ends[48];
                              }
                              if(biggest212588 == 1){
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
                            thread212589(tdone,ends);
                            thread212595(tdone,ends);
                            thread212613(tdone,ends);
                            thread212614(tdone,ends);
                            int biggest212618 = 0;
                            if(ends[27]>=biggest212618){
                              biggest212618=ends[27];
                            }
                            if(ends[34]>=biggest212618){
                              biggest212618=ends[34];
                            }
                            if(ends[47]>=biggest212618){
                              biggest212618=ends[47];
                            }
                            if(ends[48]>=biggest212618){
                              biggest212618=ends[48];
                            }
                            if(biggest212618 == 1){
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
                          thread212619(tdone,ends);
                          thread212625(tdone,ends);
                          thread212643(tdone,ends);
                          thread212644(tdone,ends);
                          int biggest212648 = 0;
                          if(ends[27]>=biggest212648){
                            biggest212648=ends[27];
                          }
                          if(ends[34]>=biggest212648){
                            biggest212648=ends[34];
                          }
                          if(ends[47]>=biggest212648){
                            biggest212648=ends[47];
                          }
                          if(ends[48]>=biggest212648){
                            biggest212648=ends[48];
                          }
                          if(biggest212648 == 1){
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
                        thread212649(tdone,ends);
                        thread212655(tdone,ends);
                        thread212673(tdone,ends);
                        thread212674(tdone,ends);
                        int biggest212678 = 0;
                        if(ends[27]>=biggest212678){
                          biggest212678=ends[27];
                        }
                        if(ends[34]>=biggest212678){
                          biggest212678=ends[34];
                        }
                        if(ends[47]>=biggest212678){
                          biggest212678=ends[47];
                        }
                        if(ends[48]>=biggest212678){
                          biggest212678=ends[48];
                        }
                        if(biggest212678 == 1){
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
              thread212679(tdone,ends);
              thread212727(tdone,ends);
              thread212757(tdone,ends);
              thread212758(tdone,ends);
              int biggest212765 = 0;
              if(ends[27]>=biggest212765){
                biggest212765=ends[27];
              }
              if(ends[34]>=biggest212765){
                biggest212765=ends[34];
              }
              if(ends[47]>=biggest212765){
                biggest212765=ends[47];
              }
              if(ends[48]>=biggest212765){
                biggest212765=ends[48];
              }
              if(biggest212765 == 1){
                active[26]=1;
                ends[26]=1;
                break RUN;
              }
              //FINXME code
              if(biggest212765 == 0){
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
