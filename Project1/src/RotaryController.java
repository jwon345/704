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
  public input_Channel convReady_in = new input_Channel();
  public input_Channel fillerReady_in = new input_Channel();
  public input_Channel capperReady_in = new input_Channel();
  public input_Channel checkFive_in = new input_Channel();
  public output_Channel rotated_o = new output_Channel();
  private Signal cvR_18;
  private Signal fR_18;
  private Signal cR_18;
  private Signal bottleAtPos5_18;
  private long __start_thread_19;//sysj\conveyor_controller.sysj line: 214, column: 32
  private long __start_thread_24;//sysj\conveyor_controller.sysj line: 229, column: 44
  private int S19973 = 1;
  private int S3848 = 1;
  private int S3744 = 1;
  private int S3739 = 1;
  private int S3766 = 1;
  private int S3761 = 1;
  private int S3855 = 1;
  private int S3850 = 1;
  private int S5597 = 1;
  private int S3990 = 1;
  private int S3983 = 1;
  private int S3986 = 1;
  private int S3989 = 1;
  private int S4065 = 1;
  private int S4018 = 1;
  private int S4147 = 1;
  private int S4163 = 1;
  private int S4266 = 1;
  private int S4261 = 1;
  private int S5896 = 1;
  private int S5696 = 1;
  private int S5630 = 1;
  private int S5622 = 1;
  private int S5621 = 1;
  private int S5605 = 1;
  private int S5600 = 1;
  private int S5628 = 1;
  private int S5795 = 1;
  private int S5729 = 1;
  private int S5721 = 1;
  private int S5720 = 1;
  private int S5704 = 1;
  private int S5699 = 1;
  private int S5727 = 1;
  private int S5894 = 1;
  private int S5828 = 1;
  private int S5820 = 1;
  private int S5819 = 1;
  private int S5803 = 1;
  private int S5798 = 1;
  private int S5826 = 1;
  private int S5979 = 1;
  private int S5923 = 1;
  private int S5903 = 1;
  private int S5898 = 1;
  
  private int[] ends = new int[60];
  private int[] tdone = new int[60];
  
  public void thread31567(int [] tdone, int [] ends){
        switch(S5979){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S5923){
          case 0 : 
            switch(S5903){
              case 0 : 
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 255, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
                  S5903=1;
                  active[35]=1;
                  ends[35]=1;
                  tdone[35]=1;
                }
                else {
                  switch(S5898){
                    case 0 : 
                      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
                        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 255, column: 7
                        S5898=1;
                        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
                          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
                          ends[35]=2;
                          ;//sysj\conveyor_controller.sysj line: 255, column: 7
                          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
                            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
                            currsigs.addElement(bottleAtPos5_18);
                            S5923=1;
                            active[35]=1;
                            ends[35]=1;
                            tdone[35]=1;
                          }
                          else {
                            S5923=1;
                            active[35]=1;
                            ends[35]=1;
                            tdone[35]=1;
                          }
                        }
                        else {
                          active[35]=1;
                          ends[35]=1;
                          tdone[35]=1;
                        }
                      }
                      else {
                        active[35]=1;
                        ends[35]=1;
                        tdone[35]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
                        checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
                        ends[35]=2;
                        ;//sysj\conveyor_controller.sysj line: 255, column: 7
                        if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
                          bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
                          currsigs.addElement(bottleAtPos5_18);
                          S5923=1;
                          active[35]=1;
                          ends[35]=1;
                          tdone[35]=1;
                        }
                        else {
                          S5923=1;
                          active[35]=1;
                          ends[35]=1;
                          tdone[35]=1;
                        }
                      }
                      else {
                        active[35]=1;
                        ends[35]=1;
                        tdone[35]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S5903=1;
                S5903=0;
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 255, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
                  S5903=1;
                  active[35]=1;
                  ends[35]=1;
                  tdone[35]=1;
                }
                else {
                  S5898=0;
                  if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
                    checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 255, column: 7
                    S5898=1;
                    if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
                      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
                      ends[35]=2;
                      ;//sysj\conveyor_controller.sysj line: 255, column: 7
                      if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
                        bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
                        currsigs.addElement(bottleAtPos5_18);
                        S5923=1;
                        active[35]=1;
                        ends[35]=1;
                        tdone[35]=1;
                      }
                      else {
                        S5923=1;
                        active[35]=1;
                        ends[35]=1;
                        tdone[35]=1;
                      }
                    }
                    else {
                      active[35]=1;
                      ends[35]=1;
                      tdone[35]=1;
                    }
                  }
                  else {
                    active[35]=1;
                    ends[35]=1;
                    tdone[35]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5923=1;
            S5923=0;
            S5903=0;
            if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 255, column: 7
              checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
              S5903=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            else {
              S5898=0;
              if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
                checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 255, column: 7
                S5898=1;
                if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
                  ends[35]=2;
                  ;//sysj\conveyor_controller.sysj line: 255, column: 7
                  if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
                    bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
                    currsigs.addElement(bottleAtPos5_18);
                    S5923=1;
                    active[35]=1;
                    ends[35]=1;
                    tdone[35]=1;
                  }
                  else {
                    S5923=1;
                    active[35]=1;
                    ends[35]=1;
                    tdone[35]=1;
                  }
                }
                else {
                  active[35]=1;
                  ends[35]=1;
                  tdone[35]=1;
                }
              }
              else {
                active[35]=1;
                ends[35]=1;
                tdone[35]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31564(int [] tdone, int [] ends){
        S5826=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5826=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31563(int [] tdone, int [] ends){
        S5820=1;
    S5819=0;
    S5803=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5803=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5798=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5798=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5819=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread31561(int [] tdone, int [] ends){
        switch(S5826){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
        currsigs.addElement(cR_18);
        active[34]=1;
        ends[34]=1;
        tdone[34]=1;
        break;
      
    }
  }

  public void thread31560(int [] tdone, int [] ends){
        switch(S5820){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        switch(S5819){
          case 0 : 
            switch(S5803){
              case 0 : 
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                  S5803=1;
                  active[33]=1;
                  ends[33]=1;
                  tdone[33]=1;
                }
                else {
                  switch(S5798){
                    case 0 : 
                      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
                        S5798=1;
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                          ends[33]=2;
                          ;//sysj\conveyor_controller.sysj line: 61, column: 5
                          S5819=1;
                          active[33]=1;
                          ends[33]=1;
                          tdone[33]=1;
                        }
                        else {
                          active[33]=1;
                          ends[33]=1;
                          tdone[33]=1;
                        }
                      }
                      else {
                        active[33]=1;
                        ends[33]=1;
                        tdone[33]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                        ends[33]=2;
                        ;//sysj\conveyor_controller.sysj line: 61, column: 5
                        S5819=1;
                        active[33]=1;
                        ends[33]=1;
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
                break;
              
              case 1 : 
                S5803=1;
                S5803=0;
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                  S5803=1;
                  active[33]=1;
                  ends[33]=1;
                  tdone[33]=1;
                }
                else {
                  S5798=0;
                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
                    S5798=1;
                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                      ends[33]=2;
                      ;//sysj\conveyor_controller.sysj line: 61, column: 5
                      S5819=1;
                      active[33]=1;
                      ends[33]=1;
                      tdone[33]=1;
                    }
                    else {
                      active[33]=1;
                      ends[33]=1;
                      tdone[33]=1;
                    }
                  }
                  else {
                    active[33]=1;
                    ends[33]=1;
                    tdone[33]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5819=1;
            S5819=2;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
            break;
          
          case 2 : 
            S5819=2;
            capperReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 61, column: 36
            ends[33]=2;
            tdone[33]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread31559(int [] tdone, int [] ends){
        switch(S5894){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        switch(S5828){
          case 0 : 
            thread31560(tdone,ends);
            thread31561(tdone,ends);
            int biggest31562 = 0;
            if(ends[33]>=biggest31562){
              biggest31562=ends[33];
            }
            if(ends[34]>=biggest31562){
              biggest31562=ends[34];
            }
            if(biggest31562 == 1){
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            if(biggest31562 == 2){
              ends[32]=2;
              ;//sysj\conveyor_controller.sysj line: 60, column: 3
              S5828=1;
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            //FINXME code
            if(biggest31562 == 0){
              S5828=1;
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
          case 1 : 
            S5828=1;
            S5828=0;
            thread31563(tdone,ends);
            thread31564(tdone,ends);
            int biggest31565 = 0;
            if(ends[33]>=biggest31565){
              biggest31565=ends[33];
            }
            if(ends[34]>=biggest31565){
              biggest31565=ends[34];
            }
            if(biggest31565 == 1){
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31557(int [] tdone, int [] ends){
        S5727=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5727=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31556(int [] tdone, int [] ends){
        S5721=1;
    S5720=0;
    S5704=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5704=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5699=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5699=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5720=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread31554(int [] tdone, int [] ends){
        switch(S5727){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
        currsigs.addElement(fR_18);
        active[31]=1;
        ends[31]=1;
        tdone[31]=1;
        break;
      
    }
  }

  public void thread31553(int [] tdone, int [] ends){
        switch(S5721){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S5720){
          case 0 : 
            switch(S5704){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                  S5704=1;
                  active[30]=1;
                  ends[30]=1;
                  tdone[30]=1;
                }
                else {
                  switch(S5699){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
                        S5699=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                          ends[30]=2;
                          ;//sysj\conveyor_controller.sysj line: 61, column: 5
                          S5720=1;
                          active[30]=1;
                          ends[30]=1;
                          tdone[30]=1;
                        }
                        else {
                          active[30]=1;
                          ends[30]=1;
                          tdone[30]=1;
                        }
                      }
                      else {
                        active[30]=1;
                        ends[30]=1;
                        tdone[30]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                        ends[30]=2;
                        ;//sysj\conveyor_controller.sysj line: 61, column: 5
                        S5720=1;
                        active[30]=1;
                        ends[30]=1;
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
                break;
              
              case 1 : 
                S5704=1;
                S5704=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                  S5704=1;
                  active[30]=1;
                  ends[30]=1;
                  tdone[30]=1;
                }
                else {
                  S5699=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
                    S5699=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                      ends[30]=2;
                      ;//sysj\conveyor_controller.sysj line: 61, column: 5
                      S5720=1;
                      active[30]=1;
                      ends[30]=1;
                      tdone[30]=1;
                    }
                    else {
                      active[30]=1;
                      ends[30]=1;
                      tdone[30]=1;
                    }
                  }
                  else {
                    active[30]=1;
                    ends[30]=1;
                    tdone[30]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5720=1;
            S5720=2;
            active[30]=1;
            ends[30]=1;
            tdone[30]=1;
            break;
          
          case 2 : 
            S5720=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 61, column: 36
            ends[30]=2;
            tdone[30]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread31552(int [] tdone, int [] ends){
        switch(S5795){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S5729){
          case 0 : 
            thread31553(tdone,ends);
            thread31554(tdone,ends);
            int biggest31555 = 0;
            if(ends[30]>=biggest31555){
              biggest31555=ends[30];
            }
            if(ends[31]>=biggest31555){
              biggest31555=ends[31];
            }
            if(biggest31555 == 1){
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            if(biggest31555 == 2){
              ends[29]=2;
              ;//sysj\conveyor_controller.sysj line: 60, column: 3
              S5729=1;
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            //FINXME code
            if(biggest31555 == 0){
              S5729=1;
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            break;
          
          case 1 : 
            S5729=1;
            S5729=0;
            thread31556(tdone,ends);
            thread31557(tdone,ends);
            int biggest31558 = 0;
            if(ends[30]>=biggest31558){
              biggest31558=ends[30];
            }
            if(ends[31]>=biggest31558){
              biggest31558=ends[31];
            }
            if(biggest31558 == 1){
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31550(int [] tdone, int [] ends){
        S5628=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5628=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread31549(int [] tdone, int [] ends){
        S5622=1;
    S5621=0;
    S5605=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5605=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5600=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5600=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5621=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
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

  public void thread31547(int [] tdone, int [] ends){
        switch(S5628){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
        currsigs.addElement(cvR_18);
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
        break;
      
    }
  }

  public void thread31546(int [] tdone, int [] ends){
        switch(S5622){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S5621){
          case 0 : 
            switch(S5605){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                  S5605=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  switch(S5600){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
                        S5600=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 61, column: 5
                          S5621=1;
                          active[27]=1;
                          ends[27]=1;
                          tdone[27]=1;
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
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 61, column: 5
                        S5621=1;
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
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
                S5605=1;
                S5605=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                  S5605=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  S5600=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
                    S5600=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 61, column: 5
                      S5621=1;
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
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
          
          case 1 : 
            S5621=1;
            S5621=2;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
            break;
          
          case 2 : 
            S5621=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 61, column: 36
            ends[27]=2;
            tdone[27]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread31545(int [] tdone, int [] ends){
        switch(S5696){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S5630){
          case 0 : 
            thread31546(tdone,ends);
            thread31547(tdone,ends);
            int biggest31548 = 0;
            if(ends[27]>=biggest31548){
              biggest31548=ends[27];
            }
            if(ends[28]>=biggest31548){
              biggest31548=ends[28];
            }
            if(biggest31548 == 1){
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            if(biggest31548 == 2){
              ends[26]=2;
              ;//sysj\conveyor_controller.sysj line: 60, column: 3
              S5630=1;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            //FINXME code
            if(biggest31548 == 0){
              S5630=1;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 1 : 
            S5630=1;
            S5630=0;
            thread31549(tdone,ends);
            thread31550(tdone,ends);
            int biggest31551 = 0;
            if(ends[27]>=biggest31551){
              biggest31551=ends[27];
            }
            if(ends[28]>=biggest31551){
              biggest31551=ends[28];
            }
            if(biggest31551 == 1){
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31544(int [] tdone, int [] ends){
        switch(S5896){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        thread31545(tdone,ends);
        thread31552(tdone,ends);
        thread31559(tdone,ends);
        int biggest31566 = 0;
        if(ends[26]>=biggest31566){
          biggest31566=ends[26];
        }
        if(ends[29]>=biggest31566){
          biggest31566=ends[29];
        }
        if(ends[32]>=biggest31566){
          biggest31566=ends[32];
        }
        if(biggest31566 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        //FINXME code
        if(biggest31566 == 0){
          S5896=0;
          active[25]=0;
          ends[25]=0;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread31542(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31541(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31540(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31538(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31537(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31536(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31534(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31533(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31532(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31530(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31529(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31528(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31526(int [] tdone, int [] ends){
        switch(S4163){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_24 >= 100){//sysj\conveyor_controller.sysj line: 229, column: 44
          ends[24]=3;
          ;//sysj\conveyor_controller.sysj line: 229, column: 44
          ends[24]=2;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread31525(int [] tdone, int [] ends){
        switch(S4147){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 229, column: 14
        currsigs.addElement(rotaryTableTrigger);
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
        break;
      
    }
  }

  public void thread31523(int [] tdone, int [] ends){
        S4163=1;
    __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 229, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_24 >= 100){//sysj\conveyor_controller.sysj line: 229, column: 44
      ends[24]=3;
      ;//sysj\conveyor_controller.sysj line: 229, column: 44
      ends[24]=2;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread31522(int [] tdone, int [] ends){
        S4147=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 229, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread31520(int [] tdone, int [] ends){
        S4163=1;
    __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 229, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_24 >= 100){//sysj\conveyor_controller.sysj line: 229, column: 44
      ends[24]=3;
      ;//sysj\conveyor_controller.sysj line: 229, column: 44
      ends[24]=2;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread31519(int [] tdone, int [] ends){
        S4147=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 229, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread31517(int [] tdone, int [] ends){
        S4163=1;
    __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 229, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_24 >= 100){//sysj\conveyor_controller.sysj line: 229, column: 44
      ends[24]=3;
      ;//sysj\conveyor_controller.sysj line: 229, column: 44
      ends[24]=2;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread31516(int [] tdone, int [] ends){
        S4147=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 229, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread31514(int [] tdone, int [] ends){
        switch(S3989){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(cR_18.getprestatus()){//sysj\conveyor_controller.sysj line: 205, column: 17
          System.out.println("*Rotary - Capper Ready*");//sysj\conveyor_controller.sysj line: 206, column: 11
          S3989=0;
          active[22]=0;
          ends[22]=0;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread31513(int [] tdone, int [] ends){
        switch(S3986){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(cvR_18.getprestatus()){//sysj\conveyor_controller.sysj line: 199, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 200, column: 11
          S3986=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread31512(int [] tdone, int [] ends){
        switch(S3983){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(fR_18.getprestatus()){//sysj\conveyor_controller.sysj line: 194, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\conveyor_controller.sysj line: 195, column: 11
          S3983=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread31511(int [] tdone, int [] ends){
        switch(S5597){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S3990){
          case 0 : 
            thread31512(tdone,ends);
            thread31513(tdone,ends);
            thread31514(tdone,ends);
            int biggest31515 = 0;
            if(ends[20]>=biggest31515){
              biggest31515=ends[20];
            }
            if(ends[21]>=biggest31515){
              biggest31515=ends[21];
            }
            if(ends[22]>=biggest31515){
              biggest31515=ends[22];
            }
            if(biggest31515 == 1){
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            //FINXME code
            if(biggest31515 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 211, column: 10
              S3990=1;
              if(bottleAtPos5_18.getprestatus()){//sysj\conveyor_controller.sysj line: 214, column: 18
                S4065=0;
                __start_thread_19 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 214, column: 32
                if(com.systemj.Timer.getMs() - __start_thread_19 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 214, column: 32
                  ends[19]=2;
                  ;//sysj\conveyor_controller.sysj line: 214, column: 32
                  S4065=1;
                  S4018=0;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
              }
              else {
                S3990=2;
                thread31516(tdone,ends);
                thread31517(tdone,ends);
                int biggest31518 = 0;
                if(ends[23]>=biggest31518){
                  biggest31518=ends[23];
                }
                if(ends[24]>=biggest31518){
                  biggest31518=ends[24];
                }
                if(biggest31518 == 1){
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                if(biggest31518 == 2){
                  ends[19]=2;
                  ;//sysj\conveyor_controller.sysj line: 228, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 232, column: 16
                  S3990=3;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
              }
            }
            break;
          
          case 1 : 
            switch(S4065){
              case 0 : 
                if(com.systemj.Timer.getMs() - __start_thread_19 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 214, column: 32
                  ends[19]=2;
                  ;//sysj\conveyor_controller.sysj line: 214, column: 32
                  S4065=1;
                  S4018=0;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                break;
              
              case 1 : 
                switch(S4018){
                  case 0 : 
                    if(!bottleAtPos5_18.getprestatus()){//sysj\conveyor_controller.sysj line: 217, column: 20
                      S4018=1;
                      if(bottleAtPos5_18.getprestatus()){//sysj\conveyor_controller.sysj line: 219, column: 23
                        System.out.println("*at pos5*");//sysj\conveyor_controller.sysj line: 220, column: 17
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      else {
                        ends[19]=2;
                        ;//sysj\conveyor_controller.sysj line: 216, column: 13
                        S3990=2;
                        thread31519(tdone,ends);
                        thread31520(tdone,ends);
                        int biggest31521 = 0;
                        if(ends[23]>=biggest31521){
                          biggest31521=ends[23];
                        }
                        if(ends[24]>=biggest31521){
                          biggest31521=ends[24];
                        }
                        if(biggest31521 == 1){
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                        if(biggest31521 == 2){
                          ends[19]=2;
                          ;//sysj\conveyor_controller.sysj line: 228, column: 12
                          System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 232, column: 16
                          S3990=3;
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                      }
                    }
                    else {
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(bottleAtPos5_18.getprestatus()){//sysj\conveyor_controller.sysj line: 219, column: 23
                      System.out.println("*at pos5*");//sysj\conveyor_controller.sysj line: 220, column: 17
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                    else {
                      ends[19]=2;
                      ;//sysj\conveyor_controller.sysj line: 216, column: 13
                      S3990=2;
                      thread31522(tdone,ends);
                      thread31523(tdone,ends);
                      int biggest31524 = 0;
                      if(ends[23]>=biggest31524){
                        biggest31524=ends[23];
                      }
                      if(ends[24]>=biggest31524){
                        biggest31524=ends[24];
                      }
                      if(biggest31524 == 1){
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      if(biggest31524 == 2){
                        ends[19]=2;
                        ;//sysj\conveyor_controller.sysj line: 228, column: 12
                        System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 232, column: 16
                        S3990=3;
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread31525(tdone,ends);
            thread31526(tdone,ends);
            int biggest31527 = 0;
            if(ends[23]>=biggest31527){
              biggest31527=ends[23];
            }
            if(ends[24]>=biggest31527){
              biggest31527=ends[24];
            }
            if(biggest31527 == 1){
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            if(biggest31527 == 2){
              ends[19]=2;
              ;//sysj\conveyor_controller.sysj line: 228, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 232, column: 16
              S3990=3;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            //FINXME code
            if(biggest31527 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 232, column: 16
              S3990=3;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 233, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 235, column: 16
              S3990=4;
              S4266=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 236, column: 13
                rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 236, column: 13
                S4266=1;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S4261=0;
                if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 236, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 236, column: 13
                  S4261=1;
                  if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 236, column: 13
                    rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 236, column: 13
                    ends[19]=2;
                    ;//sysj\conveyor_controller.sysj line: 236, column: 13
                    S3990=0;
                    thread31528(tdone,ends);
                    thread31529(tdone,ends);
                    thread31530(tdone,ends);
                    int biggest31531 = 0;
                    if(ends[20]>=biggest31531){
                      biggest31531=ends[20];
                    }
                    if(ends[21]>=biggest31531){
                      biggest31531=ends[21];
                    }
                    if(ends[22]>=biggest31531){
                      biggest31531=ends[22];
                    }
                    if(biggest31531 == 1){
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                  }
                  else {
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                }
                else {
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
              }
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 4 : 
            switch(S4266){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 236, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 236, column: 13
                  S4266=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  switch(S4261){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 236, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 236, column: 13
                        S4261=1;
                        if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 236, column: 13
                          rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 236, column: 13
                          ends[19]=2;
                          ;//sysj\conveyor_controller.sysj line: 236, column: 13
                          S3990=0;
                          thread31532(tdone,ends);
                          thread31533(tdone,ends);
                          thread31534(tdone,ends);
                          int biggest31535 = 0;
                          if(ends[20]>=biggest31535){
                            biggest31535=ends[20];
                          }
                          if(ends[21]>=biggest31535){
                            biggest31535=ends[21];
                          }
                          if(ends[22]>=biggest31535){
                            biggest31535=ends[22];
                          }
                          if(biggest31535 == 1){
                            active[19]=1;
                            ends[19]=1;
                            tdone[19]=1;
                          }
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 236, column: 13
                        rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 236, column: 13
                        ends[19]=2;
                        ;//sysj\conveyor_controller.sysj line: 236, column: 13
                        S3990=0;
                        thread31536(tdone,ends);
                        thread31537(tdone,ends);
                        thread31538(tdone,ends);
                        int biggest31539 = 0;
                        if(ends[20]>=biggest31539){
                          biggest31539=ends[20];
                        }
                        if(ends[21]>=biggest31539){
                          biggest31539=ends[21];
                        }
                        if(ends[22]>=biggest31539){
                          biggest31539=ends[22];
                        }
                        if(biggest31539 == 1){
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4266=1;
                S4266=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 236, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 236, column: 13
                  S4266=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S4261=0;
                  if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 236, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 236, column: 13
                    S4261=1;
                    if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 236, column: 13
                      rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 236, column: 13
                      ends[19]=2;
                      ;//sysj\conveyor_controller.sysj line: 236, column: 13
                      S3990=0;
                      thread31540(tdone,ends);
                      thread31541(tdone,ends);
                      thread31542(tdone,ends);
                      int biggest31543 = 0;
                      if(ends[20]>=biggest31543){
                        biggest31543=ends[20];
                      }
                      if(ends[21]>=biggest31543){
                        biggest31543=ends[21];
                      }
                      if(ends[22]>=biggest31543){
                        biggest31543=ends[22];
                      }
                      if(biggest31543 == 1){
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                    }
                    else {
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                  }
                  else {
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31509(int [] tdone, int [] ends){
        S5979=1;
    S5923=0;
    S5903=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 255, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
      S5903=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5898=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 255, column: 7
        S5898=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 255, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread31506(int [] tdone, int [] ends){
        S5826=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5826=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31505(int [] tdone, int [] ends){
        S5820=1;
    S5819=0;
    S5803=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5803=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5798=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5798=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5819=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread31504(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31505(tdone,ends);
    thread31506(tdone,ends);
    int biggest31507 = 0;
    if(ends[33]>=biggest31507){
      biggest31507=ends[33];
    }
    if(ends[34]>=biggest31507){
      biggest31507=ends[34];
    }
    if(biggest31507 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31502(int [] tdone, int [] ends){
        S5727=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5727=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31501(int [] tdone, int [] ends){
        S5721=1;
    S5720=0;
    S5704=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5704=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5699=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5699=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5720=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread31500(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31501(tdone,ends);
    thread31502(tdone,ends);
    int biggest31503 = 0;
    if(ends[30]>=biggest31503){
      biggest31503=ends[30];
    }
    if(ends[31]>=biggest31503){
      biggest31503=ends[31];
    }
    if(biggest31503 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31498(int [] tdone, int [] ends){
        S5628=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5628=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread31497(int [] tdone, int [] ends){
        S5622=1;
    S5621=0;
    S5605=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5605=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5600=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5600=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5621=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
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

  public void thread31496(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31497(tdone,ends);
    thread31498(tdone,ends);
    int biggest31499 = 0;
    if(ends[27]>=biggest31499){
      biggest31499=ends[27];
    }
    if(ends[28]>=biggest31499){
      biggest31499=ends[28];
    }
    if(biggest31499 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31495(int [] tdone, int [] ends){
        S5896=1;
    thread31496(tdone,ends);
    thread31500(tdone,ends);
    thread31504(tdone,ends);
    int biggest31508 = 0;
    if(ends[26]>=biggest31508){
      biggest31508=ends[26];
    }
    if(ends[29]>=biggest31508){
      biggest31508=ends[29];
    }
    if(ends[32]>=biggest31508){
      biggest31508=ends[32];
    }
    if(biggest31508 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31508 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31508 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31493(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31492(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31491(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31490(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31491(tdone,ends);
    thread31492(tdone,ends);
    thread31493(tdone,ends);
    int biggest31494 = 0;
    if(ends[20]>=biggest31494){
      biggest31494=ends[20];
    }
    if(ends[21]>=biggest31494){
      biggest31494=ends[21];
    }
    if(ends[22]>=biggest31494){
      biggest31494=ends[22];
    }
    if(biggest31494 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31488(int [] tdone, int [] ends){
        S5979=1;
    S5923=0;
    S5903=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 255, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
      S5903=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5898=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 255, column: 7
        S5898=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 255, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread31485(int [] tdone, int [] ends){
        S5826=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5826=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31484(int [] tdone, int [] ends){
        S5820=1;
    S5819=0;
    S5803=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5803=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5798=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5798=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5819=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread31483(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31484(tdone,ends);
    thread31485(tdone,ends);
    int biggest31486 = 0;
    if(ends[33]>=biggest31486){
      biggest31486=ends[33];
    }
    if(ends[34]>=biggest31486){
      biggest31486=ends[34];
    }
    if(biggest31486 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31481(int [] tdone, int [] ends){
        S5727=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5727=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31480(int [] tdone, int [] ends){
        S5721=1;
    S5720=0;
    S5704=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5704=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5699=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5699=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5720=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread31479(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31480(tdone,ends);
    thread31481(tdone,ends);
    int biggest31482 = 0;
    if(ends[30]>=biggest31482){
      biggest31482=ends[30];
    }
    if(ends[31]>=biggest31482){
      biggest31482=ends[31];
    }
    if(biggest31482 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31477(int [] tdone, int [] ends){
        S5628=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5628=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread31476(int [] tdone, int [] ends){
        S5622=1;
    S5621=0;
    S5605=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5605=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5600=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5600=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5621=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
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

  public void thread31475(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31476(tdone,ends);
    thread31477(tdone,ends);
    int biggest31478 = 0;
    if(ends[27]>=biggest31478){
      biggest31478=ends[27];
    }
    if(ends[28]>=biggest31478){
      biggest31478=ends[28];
    }
    if(biggest31478 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31474(int [] tdone, int [] ends){
        S5896=1;
    thread31475(tdone,ends);
    thread31479(tdone,ends);
    thread31483(tdone,ends);
    int biggest31487 = 0;
    if(ends[26]>=biggest31487){
      biggest31487=ends[26];
    }
    if(ends[29]>=biggest31487){
      biggest31487=ends[29];
    }
    if(ends[32]>=biggest31487){
      biggest31487=ends[32];
    }
    if(biggest31487 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31487 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31487 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31472(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31471(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31470(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31469(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31470(tdone,ends);
    thread31471(tdone,ends);
    thread31472(tdone,ends);
    int biggest31473 = 0;
    if(ends[20]>=biggest31473){
      biggest31473=ends[20];
    }
    if(ends[21]>=biggest31473){
      biggest31473=ends[21];
    }
    if(ends[22]>=biggest31473){
      biggest31473=ends[22];
    }
    if(biggest31473 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31467(int [] tdone, int [] ends){
        S5979=1;
    S5923=0;
    S5903=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 255, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
      S5903=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5898=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 255, column: 7
        S5898=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 255, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread31464(int [] tdone, int [] ends){
        S5826=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5826=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31463(int [] tdone, int [] ends){
        S5820=1;
    S5819=0;
    S5803=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5803=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5798=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5798=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5819=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread31462(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31463(tdone,ends);
    thread31464(tdone,ends);
    int biggest31465 = 0;
    if(ends[33]>=biggest31465){
      biggest31465=ends[33];
    }
    if(ends[34]>=biggest31465){
      biggest31465=ends[34];
    }
    if(biggest31465 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31460(int [] tdone, int [] ends){
        S5727=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5727=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31459(int [] tdone, int [] ends){
        S5721=1;
    S5720=0;
    S5704=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5704=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5699=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5699=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5720=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread31458(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31459(tdone,ends);
    thread31460(tdone,ends);
    int biggest31461 = 0;
    if(ends[30]>=biggest31461){
      biggest31461=ends[30];
    }
    if(ends[31]>=biggest31461){
      biggest31461=ends[31];
    }
    if(biggest31461 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31456(int [] tdone, int [] ends){
        S5628=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5628=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread31455(int [] tdone, int [] ends){
        S5622=1;
    S5621=0;
    S5605=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5605=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5600=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5600=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5621=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
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

  public void thread31454(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31455(tdone,ends);
    thread31456(tdone,ends);
    int biggest31457 = 0;
    if(ends[27]>=biggest31457){
      biggest31457=ends[27];
    }
    if(ends[28]>=biggest31457){
      biggest31457=ends[28];
    }
    if(biggest31457 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31453(int [] tdone, int [] ends){
        S5896=1;
    thread31454(tdone,ends);
    thread31458(tdone,ends);
    thread31462(tdone,ends);
    int biggest31466 = 0;
    if(ends[26]>=biggest31466){
      biggest31466=ends[26];
    }
    if(ends[29]>=biggest31466){
      biggest31466=ends[29];
    }
    if(ends[32]>=biggest31466){
      biggest31466=ends[32];
    }
    if(biggest31466 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31466 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31466 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31451(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31450(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31449(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31448(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31449(tdone,ends);
    thread31450(tdone,ends);
    thread31451(tdone,ends);
    int biggest31452 = 0;
    if(ends[20]>=biggest31452){
      biggest31452=ends[20];
    }
    if(ends[21]>=biggest31452){
      biggest31452=ends[21];
    }
    if(ends[22]>=biggest31452){
      biggest31452=ends[22];
    }
    if(biggest31452 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31446(int [] tdone, int [] ends){
        S5979=1;
    S5923=0;
    S5903=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 255, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
      S5903=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5898=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 255, column: 7
        S5898=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 255, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread31443(int [] tdone, int [] ends){
        S5826=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5826=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31442(int [] tdone, int [] ends){
        S5820=1;
    S5819=0;
    S5803=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5803=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5798=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5798=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5819=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread31441(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31442(tdone,ends);
    thread31443(tdone,ends);
    int biggest31444 = 0;
    if(ends[33]>=biggest31444){
      biggest31444=ends[33];
    }
    if(ends[34]>=biggest31444){
      biggest31444=ends[34];
    }
    if(biggest31444 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31439(int [] tdone, int [] ends){
        S5727=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5727=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31438(int [] tdone, int [] ends){
        S5721=1;
    S5720=0;
    S5704=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5704=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5699=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5699=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5720=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread31437(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31438(tdone,ends);
    thread31439(tdone,ends);
    int biggest31440 = 0;
    if(ends[30]>=biggest31440){
      biggest31440=ends[30];
    }
    if(ends[31]>=biggest31440){
      biggest31440=ends[31];
    }
    if(biggest31440 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31435(int [] tdone, int [] ends){
        S5628=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5628=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread31434(int [] tdone, int [] ends){
        S5622=1;
    S5621=0;
    S5605=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5605=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5600=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5600=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5621=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
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

  public void thread31433(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31434(tdone,ends);
    thread31435(tdone,ends);
    int biggest31436 = 0;
    if(ends[27]>=biggest31436){
      biggest31436=ends[27];
    }
    if(ends[28]>=biggest31436){
      biggest31436=ends[28];
    }
    if(biggest31436 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31432(int [] tdone, int [] ends){
        S5896=1;
    thread31433(tdone,ends);
    thread31437(tdone,ends);
    thread31441(tdone,ends);
    int biggest31445 = 0;
    if(ends[26]>=biggest31445){
      biggest31445=ends[26];
    }
    if(ends[29]>=biggest31445){
      biggest31445=ends[29];
    }
    if(ends[32]>=biggest31445){
      biggest31445=ends[32];
    }
    if(biggest31445 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31445 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31445 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31430(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31429(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31428(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31427(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31428(tdone,ends);
    thread31429(tdone,ends);
    thread31430(tdone,ends);
    int biggest31431 = 0;
    if(ends[20]>=biggest31431){
      biggest31431=ends[20];
    }
    if(ends[21]>=biggest31431){
      biggest31431=ends[21];
    }
    if(ends[22]>=biggest31431){
      biggest31431=ends[22];
    }
    if(biggest31431 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31425(int [] tdone, int [] ends){
        S5979=1;
    S5923=0;
    S5903=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 255, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
      S5903=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5898=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 255, column: 7
        S5898=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 255, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread31422(int [] tdone, int [] ends){
        S5826=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5826=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31421(int [] tdone, int [] ends){
        S5820=1;
    S5819=0;
    S5803=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5803=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5798=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5798=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5819=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread31420(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31421(tdone,ends);
    thread31422(tdone,ends);
    int biggest31423 = 0;
    if(ends[33]>=biggest31423){
      biggest31423=ends[33];
    }
    if(ends[34]>=biggest31423){
      biggest31423=ends[34];
    }
    if(biggest31423 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31418(int [] tdone, int [] ends){
        S5727=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5727=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31417(int [] tdone, int [] ends){
        S5721=1;
    S5720=0;
    S5704=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5704=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5699=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5699=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5720=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread31416(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31417(tdone,ends);
    thread31418(tdone,ends);
    int biggest31419 = 0;
    if(ends[30]>=biggest31419){
      biggest31419=ends[30];
    }
    if(ends[31]>=biggest31419){
      biggest31419=ends[31];
    }
    if(biggest31419 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31414(int [] tdone, int [] ends){
        S5628=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5628=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread31413(int [] tdone, int [] ends){
        S5622=1;
    S5621=0;
    S5605=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5605=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5600=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5600=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5621=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
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

  public void thread31412(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31413(tdone,ends);
    thread31414(tdone,ends);
    int biggest31415 = 0;
    if(ends[27]>=biggest31415){
      biggest31415=ends[27];
    }
    if(ends[28]>=biggest31415){
      biggest31415=ends[28];
    }
    if(biggest31415 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31411(int [] tdone, int [] ends){
        S5896=1;
    thread31412(tdone,ends);
    thread31416(tdone,ends);
    thread31420(tdone,ends);
    int biggest31424 = 0;
    if(ends[26]>=biggest31424){
      biggest31424=ends[26];
    }
    if(ends[29]>=biggest31424){
      biggest31424=ends[29];
    }
    if(ends[32]>=biggest31424){
      biggest31424=ends[32];
    }
    if(biggest31424 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31424 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31424 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31409(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31408(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31407(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31406(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31407(tdone,ends);
    thread31408(tdone,ends);
    thread31409(tdone,ends);
    int biggest31410 = 0;
    if(ends[20]>=biggest31410){
      biggest31410=ends[20];
    }
    if(ends[21]>=biggest31410){
      biggest31410=ends[21];
    }
    if(ends[22]>=biggest31410){
      biggest31410=ends[22];
    }
    if(biggest31410 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31404(int [] tdone, int [] ends){
        S5979=1;
    S5923=0;
    S5903=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 255, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
      S5903=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5898=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 255, column: 7
        S5898=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 255, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread31401(int [] tdone, int [] ends){
        S5826=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5826=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31400(int [] tdone, int [] ends){
        S5820=1;
    S5819=0;
    S5803=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5803=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5798=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5798=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5819=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread31399(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31400(tdone,ends);
    thread31401(tdone,ends);
    int biggest31402 = 0;
    if(ends[33]>=biggest31402){
      biggest31402=ends[33];
    }
    if(ends[34]>=biggest31402){
      biggest31402=ends[34];
    }
    if(biggest31402 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31397(int [] tdone, int [] ends){
        S5727=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5727=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31396(int [] tdone, int [] ends){
        S5721=1;
    S5720=0;
    S5704=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5704=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5699=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5699=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5720=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread31395(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31396(tdone,ends);
    thread31397(tdone,ends);
    int biggest31398 = 0;
    if(ends[30]>=biggest31398){
      biggest31398=ends[30];
    }
    if(ends[31]>=biggest31398){
      biggest31398=ends[31];
    }
    if(biggest31398 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31393(int [] tdone, int [] ends){
        S5628=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5628=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread31392(int [] tdone, int [] ends){
        S5622=1;
    S5621=0;
    S5605=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5605=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5600=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5600=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5621=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
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

  public void thread31391(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31392(tdone,ends);
    thread31393(tdone,ends);
    int biggest31394 = 0;
    if(ends[27]>=biggest31394){
      biggest31394=ends[27];
    }
    if(ends[28]>=biggest31394){
      biggest31394=ends[28];
    }
    if(biggest31394 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31390(int [] tdone, int [] ends){
        S5896=1;
    thread31391(tdone,ends);
    thread31395(tdone,ends);
    thread31399(tdone,ends);
    int biggest31403 = 0;
    if(ends[26]>=biggest31403){
      biggest31403=ends[26];
    }
    if(ends[29]>=biggest31403){
      biggest31403=ends[29];
    }
    if(ends[32]>=biggest31403){
      biggest31403=ends[32];
    }
    if(biggest31403 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31403 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31403 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31388(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31387(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31386(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31385(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31386(tdone,ends);
    thread31387(tdone,ends);
    thread31388(tdone,ends);
    int biggest31389 = 0;
    if(ends[20]>=biggest31389){
      biggest31389=ends[20];
    }
    if(ends[21]>=biggest31389){
      biggest31389=ends[21];
    }
    if(ends[22]>=biggest31389){
      biggest31389=ends[22];
    }
    if(biggest31389 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31383(int [] tdone, int [] ends){
        S5979=1;
    S5923=0;
    S5903=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 255, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
      S5903=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5898=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 255, column: 7
        S5898=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 255, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread31380(int [] tdone, int [] ends){
        S5826=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5826=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31379(int [] tdone, int [] ends){
        S5820=1;
    S5819=0;
    S5803=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5803=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5798=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5798=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5819=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread31378(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31379(tdone,ends);
    thread31380(tdone,ends);
    int biggest31381 = 0;
    if(ends[33]>=biggest31381){
      biggest31381=ends[33];
    }
    if(ends[34]>=biggest31381){
      biggest31381=ends[34];
    }
    if(biggest31381 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31376(int [] tdone, int [] ends){
        S5727=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5727=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31375(int [] tdone, int [] ends){
        S5721=1;
    S5720=0;
    S5704=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5704=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5699=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5699=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5720=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread31374(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31375(tdone,ends);
    thread31376(tdone,ends);
    int biggest31377 = 0;
    if(ends[30]>=biggest31377){
      biggest31377=ends[30];
    }
    if(ends[31]>=biggest31377){
      biggest31377=ends[31];
    }
    if(biggest31377 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31372(int [] tdone, int [] ends){
        S5628=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5628=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread31371(int [] tdone, int [] ends){
        S5622=1;
    S5621=0;
    S5605=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5605=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5600=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5600=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5621=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
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

  public void thread31370(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31371(tdone,ends);
    thread31372(tdone,ends);
    int biggest31373 = 0;
    if(ends[27]>=biggest31373){
      biggest31373=ends[27];
    }
    if(ends[28]>=biggest31373){
      biggest31373=ends[28];
    }
    if(biggest31373 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31369(int [] tdone, int [] ends){
        S5896=1;
    thread31370(tdone,ends);
    thread31374(tdone,ends);
    thread31378(tdone,ends);
    int biggest31382 = 0;
    if(ends[26]>=biggest31382){
      biggest31382=ends[26];
    }
    if(ends[29]>=biggest31382){
      biggest31382=ends[29];
    }
    if(ends[32]>=biggest31382){
      biggest31382=ends[32];
    }
    if(biggest31382 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31382 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31382 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31367(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31366(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31365(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31364(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31365(tdone,ends);
    thread31366(tdone,ends);
    thread31367(tdone,ends);
    int biggest31368 = 0;
    if(ends[20]>=biggest31368){
      biggest31368=ends[20];
    }
    if(ends[21]>=biggest31368){
      biggest31368=ends[21];
    }
    if(ends[22]>=biggest31368){
      biggest31368=ends[22];
    }
    if(biggest31368 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31362(int [] tdone, int [] ends){
        S5979=1;
    S5923=0;
    S5903=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 255, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
      S5903=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5898=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 255, column: 7
        S5898=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 255, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread31359(int [] tdone, int [] ends){
        S5826=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5826=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31358(int [] tdone, int [] ends){
        S5820=1;
    S5819=0;
    S5803=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5803=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5798=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5798=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5819=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread31357(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31358(tdone,ends);
    thread31359(tdone,ends);
    int biggest31360 = 0;
    if(ends[33]>=biggest31360){
      biggest31360=ends[33];
    }
    if(ends[34]>=biggest31360){
      biggest31360=ends[34];
    }
    if(biggest31360 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31355(int [] tdone, int [] ends){
        S5727=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5727=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31354(int [] tdone, int [] ends){
        S5721=1;
    S5720=0;
    S5704=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5704=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5699=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5699=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5720=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread31353(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31354(tdone,ends);
    thread31355(tdone,ends);
    int biggest31356 = 0;
    if(ends[30]>=biggest31356){
      biggest31356=ends[30];
    }
    if(ends[31]>=biggest31356){
      biggest31356=ends[31];
    }
    if(biggest31356 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31351(int [] tdone, int [] ends){
        S5628=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5628=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread31350(int [] tdone, int [] ends){
        S5622=1;
    S5621=0;
    S5605=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5605=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5600=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5600=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5621=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
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

  public void thread31349(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31350(tdone,ends);
    thread31351(tdone,ends);
    int biggest31352 = 0;
    if(ends[27]>=biggest31352){
      biggest31352=ends[27];
    }
    if(ends[28]>=biggest31352){
      biggest31352=ends[28];
    }
    if(biggest31352 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31348(int [] tdone, int [] ends){
        S5896=1;
    thread31349(tdone,ends);
    thread31353(tdone,ends);
    thread31357(tdone,ends);
    int biggest31361 = 0;
    if(ends[26]>=biggest31361){
      biggest31361=ends[26];
    }
    if(ends[29]>=biggest31361){
      biggest31361=ends[29];
    }
    if(ends[32]>=biggest31361){
      biggest31361=ends[32];
    }
    if(biggest31361 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31361 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31361 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31346(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31345(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31344(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31343(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31344(tdone,ends);
    thread31345(tdone,ends);
    thread31346(tdone,ends);
    int biggest31347 = 0;
    if(ends[20]>=biggest31347){
      biggest31347=ends[20];
    }
    if(ends[21]>=biggest31347){
      biggest31347=ends[21];
    }
    if(ends[22]>=biggest31347){
      biggest31347=ends[22];
    }
    if(biggest31347 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31341(int [] tdone, int [] ends){
        S5979=1;
    S5923=0;
    S5903=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 255, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
      S5903=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5898=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 255, column: 7
        S5898=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 255, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread31338(int [] tdone, int [] ends){
        S5826=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5826=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31337(int [] tdone, int [] ends){
        S5820=1;
    S5819=0;
    S5803=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5803=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5798=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5798=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5819=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread31336(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31337(tdone,ends);
    thread31338(tdone,ends);
    int biggest31339 = 0;
    if(ends[33]>=biggest31339){
      biggest31339=ends[33];
    }
    if(ends[34]>=biggest31339){
      biggest31339=ends[34];
    }
    if(biggest31339 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31334(int [] tdone, int [] ends){
        S5727=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5727=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31333(int [] tdone, int [] ends){
        S5721=1;
    S5720=0;
    S5704=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5704=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5699=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5699=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5720=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread31332(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31333(tdone,ends);
    thread31334(tdone,ends);
    int biggest31335 = 0;
    if(ends[30]>=biggest31335){
      biggest31335=ends[30];
    }
    if(ends[31]>=biggest31335){
      biggest31335=ends[31];
    }
    if(biggest31335 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31330(int [] tdone, int [] ends){
        S5628=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5628=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread31329(int [] tdone, int [] ends){
        S5622=1;
    S5621=0;
    S5605=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5605=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5600=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5600=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5621=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
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

  public void thread31328(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31329(tdone,ends);
    thread31330(tdone,ends);
    int biggest31331 = 0;
    if(ends[27]>=biggest31331){
      biggest31331=ends[27];
    }
    if(ends[28]>=biggest31331){
      biggest31331=ends[28];
    }
    if(biggest31331 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31327(int [] tdone, int [] ends){
        S5896=1;
    thread31328(tdone,ends);
    thread31332(tdone,ends);
    thread31336(tdone,ends);
    int biggest31340 = 0;
    if(ends[26]>=biggest31340){
      biggest31340=ends[26];
    }
    if(ends[29]>=biggest31340){
      biggest31340=ends[29];
    }
    if(ends[32]>=biggest31340){
      biggest31340=ends[32];
    }
    if(biggest31340 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31340 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31340 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31325(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31324(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31323(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31322(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31323(tdone,ends);
    thread31324(tdone,ends);
    thread31325(tdone,ends);
    int biggest31326 = 0;
    if(ends[20]>=biggest31326){
      biggest31326=ends[20];
    }
    if(ends[21]>=biggest31326){
      biggest31326=ends[21];
    }
    if(ends[22]>=biggest31326){
      biggest31326=ends[22];
    }
    if(biggest31326 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31320(int [] tdone, int [] ends){
        S5979=1;
    S5923=0;
    S5903=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 255, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
      S5903=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5898=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 255, column: 7
        S5898=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 255, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 255, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 255, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 256, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 257, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5923=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread31317(int [] tdone, int [] ends){
        S5826=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5826=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31316(int [] tdone, int [] ends){
        S5820=1;
    S5819=0;
    S5803=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5803=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5798=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5798=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5819=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread31315(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31316(tdone,ends);
    thread31317(tdone,ends);
    int biggest31318 = 0;
    if(ends[33]>=biggest31318){
      biggest31318=ends[33];
    }
    if(ends[34]>=biggest31318){
      biggest31318=ends[34];
    }
    if(biggest31318 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31313(int [] tdone, int [] ends){
        S5727=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5727=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31312(int [] tdone, int [] ends){
        S5721=1;
    S5720=0;
    S5704=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5704=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5699=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5699=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5720=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread31311(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31312(tdone,ends);
    thread31313(tdone,ends);
    int biggest31314 = 0;
    if(ends[30]>=biggest31314){
      biggest31314=ends[30];
    }
    if(ends[31]>=biggest31314){
      biggest31314=ends[31];
    }
    if(biggest31314 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31309(int [] tdone, int [] ends){
        S5628=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5628=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread31308(int [] tdone, int [] ends){
        S5622=1;
    S5621=0;
    S5605=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5605=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5600=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5600=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5621=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
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

  public void thread31307(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31308(tdone,ends);
    thread31309(tdone,ends);
    int biggest31310 = 0;
    if(ends[27]>=biggest31310){
      biggest31310=ends[27];
    }
    if(ends[28]>=biggest31310){
      biggest31310=ends[28];
    }
    if(biggest31310 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31306(int [] tdone, int [] ends){
        S5896=1;
    thread31307(tdone,ends);
    thread31311(tdone,ends);
    thread31315(tdone,ends);
    int biggest31319 = 0;
    if(ends[26]>=biggest31319){
      biggest31319=ends[26];
    }
    if(ends[29]>=biggest31319){
      biggest31319=ends[29];
    }
    if(ends[32]>=biggest31319){
      biggest31319=ends[32];
    }
    if(biggest31319 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31319 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31319 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31304(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31303(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31302(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31301(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31302(tdone,ends);
    thread31303(tdone,ends);
    thread31304(tdone,ends);
    int biggest31305 = 0;
    if(ends[20]>=biggest31305){
      biggest31305=ends[20];
    }
    if(ends[21]>=biggest31305){
      biggest31305=ends[21];
    }
    if(ends[22]>=biggest31305){
      biggest31305=ends[22];
    }
    if(biggest31305 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S19973){
        case 0 : 
          S19973=0;
          break RUN;
        
        case 1 : 
          S19973=2;
          S19973=2;
          cvR_18.setClear();//sysj\conveyor_controller.sysj line: 185, column: 7
          fR_18.setClear();//sysj\conveyor_controller.sysj line: 185, column: 7
          cR_18.setClear();//sysj\conveyor_controller.sysj line: 185, column: 7
          bottleAtPos5_18.setClear();//sysj\conveyor_controller.sysj line: 186, column: 7
          S3848=0;
          S3744=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 187, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
            S3744=1;
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
          else {
            S3739=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 187, column: 7
              S3739=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
                ends[18]=2;
                ;//sysj\conveyor_controller.sysj line: 187, column: 7
                S3848=1;
                S3766=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 188, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                  S3766=1;
                  active[18]=1;
                  ends[18]=1;
                  break RUN;
                }
                else {
                  S3761=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 188, column: 7
                    S3761=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                      ends[18]=2;
                      ;//sysj\conveyor_controller.sysj line: 188, column: 7
                      S3848=2;
                      S3855=0;
                      if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                        S3855=1;
                        active[18]=1;
                        ends[18]=1;
                        break RUN;
                      }
                      else {
                        S3850=0;
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                          S3850=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                            ends[18]=2;
                            ;//sysj\conveyor_controller.sysj line: 189, column: 7
                            S3848=3;
                            thread31301(tdone,ends);
                            thread31306(tdone,ends);
                            thread31320(tdone,ends);
                            int biggest31321 = 0;
                            if(ends[19]>=biggest31321){
                              biggest31321=ends[19];
                            }
                            if(ends[25]>=biggest31321){
                              biggest31321=ends[25];
                            }
                            if(ends[35]>=biggest31321){
                              biggest31321=ends[35];
                            }
                            if(biggest31321 == 1){
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      active[18]=1;
                      ends[18]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                }
              }
              else {
                active[18]=1;
                ends[18]=1;
                break RUN;
              }
            }
            else {
              active[18]=1;
              ends[18]=1;
              break RUN;
            }
          }
        
        case 2 : 
          cvR_18.setClear();//sysj\conveyor_controller.sysj line: 185, column: 7
          fR_18.setClear();//sysj\conveyor_controller.sysj line: 185, column: 7
          cR_18.setClear();//sysj\conveyor_controller.sysj line: 185, column: 7
          bottleAtPos5_18.setClear();//sysj\conveyor_controller.sysj line: 186, column: 7
          switch(S3848){
            case 0 : 
              switch(S3744){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 187, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
                    S3744=1;
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                  else {
                    switch(S3739){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 187, column: 7
                          S3739=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
                            ends[18]=2;
                            ;//sysj\conveyor_controller.sysj line: 187, column: 7
                            S3848=1;
                            S3766=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 188, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                              S3766=1;
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                            else {
                              S3761=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 188, column: 7
                                S3761=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                                  ends[18]=2;
                                  ;//sysj\conveyor_controller.sysj line: 188, column: 7
                                  S3848=2;
                                  S3855=0;
                                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                    S3855=1;
                                    active[18]=1;
                                    ends[18]=1;
                                    break RUN;
                                  }
                                  else {
                                    S3850=0;
                                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                                      S3850=1;
                                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                        ends[18]=2;
                                        ;//sysj\conveyor_controller.sysj line: 189, column: 7
                                        S3848=3;
                                        thread31322(tdone,ends);
                                        thread31327(tdone,ends);
                                        thread31341(tdone,ends);
                                        int biggest31342 = 0;
                                        if(ends[19]>=biggest31342){
                                          biggest31342=ends[19];
                                        }
                                        if(ends[25]>=biggest31342){
                                          biggest31342=ends[25];
                                        }
                                        if(ends[35]>=biggest31342){
                                          biggest31342=ends[35];
                                        }
                                        if(biggest31342 == 1){
                                          active[18]=1;
                                          ends[18]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[18]=1;
                                        ends[18]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[18]=1;
                                      ends[18]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[18]=1;
                                  ends[18]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[18]=1;
                                ends[18]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
                          ends[18]=2;
                          ;//sysj\conveyor_controller.sysj line: 187, column: 7
                          S3848=1;
                          S3766=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 188, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                            S3766=1;
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                          else {
                            S3761=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 188, column: 7
                              S3761=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                                ends[18]=2;
                                ;//sysj\conveyor_controller.sysj line: 188, column: 7
                                S3848=2;
                                S3855=0;
                                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                  S3855=1;
                                  active[18]=1;
                                  ends[18]=1;
                                  break RUN;
                                }
                                else {
                                  S3850=0;
                                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                                    S3850=1;
                                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                      ends[18]=2;
                                      ;//sysj\conveyor_controller.sysj line: 189, column: 7
                                      S3848=3;
                                      thread31343(tdone,ends);
                                      thread31348(tdone,ends);
                                      thread31362(tdone,ends);
                                      int biggest31363 = 0;
                                      if(ends[19]>=biggest31363){
                                        biggest31363=ends[19];
                                      }
                                      if(ends[25]>=biggest31363){
                                        biggest31363=ends[25];
                                      }
                                      if(ends[35]>=biggest31363){
                                        biggest31363=ends[35];
                                      }
                                      if(biggest31363 == 1){
                                        active[18]=1;
                                        ends[18]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[18]=1;
                                      ends[18]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[18]=1;
                                    ends[18]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[18]=1;
                                ends[18]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3744=1;
                  S3744=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 187, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
                    S3744=1;
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                  else {
                    S3739=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 187, column: 7
                      S3739=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
                        ends[18]=2;
                        ;//sysj\conveyor_controller.sysj line: 187, column: 7
                        S3848=1;
                        S3766=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 188, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                          S3766=1;
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                        else {
                          S3761=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 188, column: 7
                            S3761=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                              ends[18]=2;
                              ;//sysj\conveyor_controller.sysj line: 188, column: 7
                              S3848=2;
                              S3855=0;
                              if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                S3855=1;
                                active[18]=1;
                                ends[18]=1;
                                break RUN;
                              }
                              else {
                                S3850=0;
                                if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                  capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                                  S3850=1;
                                  if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                    ends[18]=2;
                                    ;//sysj\conveyor_controller.sysj line: 189, column: 7
                                    S3848=3;
                                    thread31364(tdone,ends);
                                    thread31369(tdone,ends);
                                    thread31383(tdone,ends);
                                    int biggest31384 = 0;
                                    if(ends[19]>=biggest31384){
                                      biggest31384=ends[19];
                                    }
                                    if(ends[25]>=biggest31384){
                                      biggest31384=ends[25];
                                    }
                                    if(ends[35]>=biggest31384){
                                      biggest31384=ends[35];
                                    }
                                    if(biggest31384 == 1){
                                      active[18]=1;
                                      ends[18]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[18]=1;
                                    ends[18]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[18]=1;
                                  ends[18]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[18]=1;
                        ends[18]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[18]=1;
                      ends[18]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S3766){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 188, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                    S3766=1;
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                  else {
                    switch(S3761){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 188, column: 7
                          S3761=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                            ends[18]=2;
                            ;//sysj\conveyor_controller.sysj line: 188, column: 7
                            S3848=2;
                            S3855=0;
                            if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                              S3855=1;
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                            else {
                              S3850=0;
                              if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                                S3850=1;
                                if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                  ends[18]=2;
                                  ;//sysj\conveyor_controller.sysj line: 189, column: 7
                                  S3848=3;
                                  thread31385(tdone,ends);
                                  thread31390(tdone,ends);
                                  thread31404(tdone,ends);
                                  int biggest31405 = 0;
                                  if(ends[19]>=biggest31405){
                                    biggest31405=ends[19];
                                  }
                                  if(ends[25]>=biggest31405){
                                    biggest31405=ends[25];
                                  }
                                  if(ends[35]>=biggest31405){
                                    biggest31405=ends[35];
                                  }
                                  if(biggest31405 == 1){
                                    active[18]=1;
                                    ends[18]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[18]=1;
                                  ends[18]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[18]=1;
                                ends[18]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                          ends[18]=2;
                          ;//sysj\conveyor_controller.sysj line: 188, column: 7
                          S3848=2;
                          S3855=0;
                          if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                            S3855=1;
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                          else {
                            S3850=0;
                            if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                              capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                              S3850=1;
                              if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                ends[18]=2;
                                ;//sysj\conveyor_controller.sysj line: 189, column: 7
                                S3848=3;
                                thread31406(tdone,ends);
                                thread31411(tdone,ends);
                                thread31425(tdone,ends);
                                int biggest31426 = 0;
                                if(ends[19]>=biggest31426){
                                  biggest31426=ends[19];
                                }
                                if(ends[25]>=biggest31426){
                                  biggest31426=ends[25];
                                }
                                if(ends[35]>=biggest31426){
                                  biggest31426=ends[35];
                                }
                                if(biggest31426 == 1){
                                  active[18]=1;
                                  ends[18]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[18]=1;
                                ends[18]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3766=1;
                  S3766=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 188, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                    S3766=1;
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                  else {
                    S3761=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 188, column: 7
                      S3761=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                        ends[18]=2;
                        ;//sysj\conveyor_controller.sysj line: 188, column: 7
                        S3848=2;
                        S3855=0;
                        if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                          S3855=1;
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                        else {
                          S3850=0;
                          if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                            capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                            S3850=1;
                            if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                              ends[18]=2;
                              ;//sysj\conveyor_controller.sysj line: 189, column: 7
                              S3848=3;
                              thread31427(tdone,ends);
                              thread31432(tdone,ends);
                              thread31446(tdone,ends);
                              int biggest31447 = 0;
                              if(ends[19]>=biggest31447){
                                biggest31447=ends[19];
                              }
                              if(ends[25]>=biggest31447){
                                biggest31447=ends[25];
                              }
                              if(ends[35]>=biggest31447){
                                biggest31447=ends[35];
                              }
                              if(biggest31447 == 1){
                                active[18]=1;
                                ends[18]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[18]=1;
                        ends[18]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[18]=1;
                      ends[18]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 2 : 
              switch(S3855){
                case 0 : 
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                    S3855=1;
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                  else {
                    switch(S3850){
                      case 0 : 
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                          S3850=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                            ends[18]=2;
                            ;//sysj\conveyor_controller.sysj line: 189, column: 7
                            S3848=3;
                            thread31448(tdone,ends);
                            thread31453(tdone,ends);
                            thread31467(tdone,ends);
                            int biggest31468 = 0;
                            if(ends[19]>=biggest31468){
                              biggest31468=ends[19];
                            }
                            if(ends[25]>=biggest31468){
                              biggest31468=ends[25];
                            }
                            if(ends[35]>=biggest31468){
                              biggest31468=ends[35];
                            }
                            if(biggest31468 == 1){
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                          ends[18]=2;
                          ;//sysj\conveyor_controller.sysj line: 189, column: 7
                          S3848=3;
                          thread31469(tdone,ends);
                          thread31474(tdone,ends);
                          thread31488(tdone,ends);
                          int biggest31489 = 0;
                          if(ends[19]>=biggest31489){
                            biggest31489=ends[19];
                          }
                          if(ends[25]>=biggest31489){
                            biggest31489=ends[25];
                          }
                          if(ends[35]>=biggest31489){
                            biggest31489=ends[35];
                          }
                          if(biggest31489 == 1){
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3855=1;
                  S3855=0;
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                    S3855=1;
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                  else {
                    S3850=0;
                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                      S3850=1;
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                        ends[18]=2;
                        ;//sysj\conveyor_controller.sysj line: 189, column: 7
                        S3848=3;
                        thread31490(tdone,ends);
                        thread31495(tdone,ends);
                        thread31509(tdone,ends);
                        int biggest31510 = 0;
                        if(ends[19]>=biggest31510){
                          biggest31510=ends[19];
                        }
                        if(ends[25]>=biggest31510){
                          biggest31510=ends[25];
                        }
                        if(ends[35]>=biggest31510){
                          biggest31510=ends[35];
                        }
                        if(biggest31510 == 1){
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[18]=1;
                        ends[18]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[18]=1;
                      ends[18]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 3 : 
              thread31511(tdone,ends);
              thread31544(tdone,ends);
              thread31567(tdone,ends);
              int biggest31568 = 0;
              if(ends[19]>=biggest31568){
                biggest31568=ends[19];
              }
              if(ends[25]>=biggest31568){
                biggest31568=ends[25];
              }
              if(ends[35]>=biggest31568){
                biggest31568=ends[35];
              }
              if(biggest31568 == 1){
                active[18]=1;
                ends[18]=1;
                break RUN;
              }
              //FINXME code
              if(biggest31568 == 0){
                S19973=0;
                active[18]=0;
                ends[18]=0;
                S19973=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    cvR_18 = new Signal();
    fR_18 = new Signal();
    cR_18 = new Signal();
    bottleAtPos5_18 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[18] != 0){
      int index = 18;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[18]!=0 || suspended[18]!=0 || active[18]!=1);
      else{
        if(!df){
          convReady_in.gethook();
          fillerReady_in.gethook();
          capperReady_in.gethook();
          checkFive_in.gethook();
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
      cvR_18.setpreclear();
      fR_18.setpreclear();
      cR_18.setpreclear();
      bottleAtPos5_18.setpreclear();
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
      cvR_18.setClear();
      fR_18.setClear();
      cR_18.setClear();
      bottleAtPos5_18.setClear();
      convReady_in.sethook();
      fillerReady_in.sethook();
      capperReady_in.sethook();
      checkFive_in.sethook();
      rotated_o.sethook();
      if(paused[18]!=0 || suspended[18]!=0 || active[18]!=1);
      else{
        convReady_in.gethook();
        fillerReady_in.gethook();
        capperReady_in.gethook();
        checkFive_in.gethook();
        rotated_o.gethook();
        tableAlignedWithSensor.gethook();
        capOnBottleAtPos1.gethook();
      }
      runFinisher();
      if(active[18] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
