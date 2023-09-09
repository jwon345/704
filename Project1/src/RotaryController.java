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
  
  public void thread31247(int [] tdone, int [] ends){
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

  public void thread31244(int [] tdone, int [] ends){
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

  public void thread31243(int [] tdone, int [] ends){
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

  public void thread31241(int [] tdone, int [] ends){
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

  public void thread31240(int [] tdone, int [] ends){
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

  public void thread31239(int [] tdone, int [] ends){
        switch(S5894){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        switch(S5828){
          case 0 : 
            thread31240(tdone,ends);
            thread31241(tdone,ends);
            int biggest31242 = 0;
            if(ends[33]>=biggest31242){
              biggest31242=ends[33];
            }
            if(ends[34]>=biggest31242){
              biggest31242=ends[34];
            }
            if(biggest31242 == 1){
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            if(biggest31242 == 2){
              ends[32]=2;
              ;//sysj\conveyor_controller.sysj line: 60, column: 3
              S5828=1;
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            //FINXME code
            if(biggest31242 == 0){
              S5828=1;
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
          case 1 : 
            S5828=1;
            S5828=0;
            thread31243(tdone,ends);
            thread31244(tdone,ends);
            int biggest31245 = 0;
            if(ends[33]>=biggest31245){
              biggest31245=ends[33];
            }
            if(ends[34]>=biggest31245){
              biggest31245=ends[34];
            }
            if(biggest31245 == 1){
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31237(int [] tdone, int [] ends){
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

  public void thread31236(int [] tdone, int [] ends){
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

  public void thread31234(int [] tdone, int [] ends){
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

  public void thread31233(int [] tdone, int [] ends){
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

  public void thread31232(int [] tdone, int [] ends){
        switch(S5795){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S5729){
          case 0 : 
            thread31233(tdone,ends);
            thread31234(tdone,ends);
            int biggest31235 = 0;
            if(ends[30]>=biggest31235){
              biggest31235=ends[30];
            }
            if(ends[31]>=biggest31235){
              biggest31235=ends[31];
            }
            if(biggest31235 == 1){
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            if(biggest31235 == 2){
              ends[29]=2;
              ;//sysj\conveyor_controller.sysj line: 60, column: 3
              S5729=1;
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            //FINXME code
            if(biggest31235 == 0){
              S5729=1;
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            break;
          
          case 1 : 
            S5729=1;
            S5729=0;
            thread31236(tdone,ends);
            thread31237(tdone,ends);
            int biggest31238 = 0;
            if(ends[30]>=biggest31238){
              biggest31238=ends[30];
            }
            if(ends[31]>=biggest31238){
              biggest31238=ends[31];
            }
            if(biggest31238 == 1){
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31230(int [] tdone, int [] ends){
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

  public void thread31229(int [] tdone, int [] ends){
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

  public void thread31227(int [] tdone, int [] ends){
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

  public void thread31226(int [] tdone, int [] ends){
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

  public void thread31225(int [] tdone, int [] ends){
        switch(S5696){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S5630){
          case 0 : 
            thread31226(tdone,ends);
            thread31227(tdone,ends);
            int biggest31228 = 0;
            if(ends[27]>=biggest31228){
              biggest31228=ends[27];
            }
            if(ends[28]>=biggest31228){
              biggest31228=ends[28];
            }
            if(biggest31228 == 1){
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            if(biggest31228 == 2){
              ends[26]=2;
              ;//sysj\conveyor_controller.sysj line: 60, column: 3
              S5630=1;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            //FINXME code
            if(biggest31228 == 0){
              S5630=1;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 1 : 
            S5630=1;
            S5630=0;
            thread31229(tdone,ends);
            thread31230(tdone,ends);
            int biggest31231 = 0;
            if(ends[27]>=biggest31231){
              biggest31231=ends[27];
            }
            if(ends[28]>=biggest31231){
              biggest31231=ends[28];
            }
            if(biggest31231 == 1){
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31224(int [] tdone, int [] ends){
        switch(S5896){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        thread31225(tdone,ends);
        thread31232(tdone,ends);
        thread31239(tdone,ends);
        int biggest31246 = 0;
        if(ends[26]>=biggest31246){
          biggest31246=ends[26];
        }
        if(ends[29]>=biggest31246){
          biggest31246=ends[29];
        }
        if(ends[32]>=biggest31246){
          biggest31246=ends[32];
        }
        if(biggest31246 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        //FINXME code
        if(biggest31246 == 0){
          S5896=0;
          active[25]=0;
          ends[25]=0;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread31222(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31221(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31220(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31218(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31217(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31216(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31214(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31213(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31212(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31210(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31209(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31208(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31206(int [] tdone, int [] ends){
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

  public void thread31205(int [] tdone, int [] ends){
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

  public void thread31203(int [] tdone, int [] ends){
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

  public void thread31202(int [] tdone, int [] ends){
        S4147=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 229, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread31200(int [] tdone, int [] ends){
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

  public void thread31199(int [] tdone, int [] ends){
        S4147=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 229, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread31197(int [] tdone, int [] ends){
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

  public void thread31196(int [] tdone, int [] ends){
        S4147=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 229, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread31194(int [] tdone, int [] ends){
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

  public void thread31193(int [] tdone, int [] ends){
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

  public void thread31192(int [] tdone, int [] ends){
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

  public void thread31191(int [] tdone, int [] ends){
        switch(S5597){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S3990){
          case 0 : 
            thread31192(tdone,ends);
            thread31193(tdone,ends);
            thread31194(tdone,ends);
            int biggest31195 = 0;
            if(ends[20]>=biggest31195){
              biggest31195=ends[20];
            }
            if(ends[21]>=biggest31195){
              biggest31195=ends[21];
            }
            if(ends[22]>=biggest31195){
              biggest31195=ends[22];
            }
            if(biggest31195 == 1){
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            //FINXME code
            if(biggest31195 == 0){
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
                thread31196(tdone,ends);
                thread31197(tdone,ends);
                int biggest31198 = 0;
                if(ends[23]>=biggest31198){
                  biggest31198=ends[23];
                }
                if(ends[24]>=biggest31198){
                  biggest31198=ends[24];
                }
                if(biggest31198 == 1){
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                if(biggest31198 == 2){
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
                        thread31199(tdone,ends);
                        thread31200(tdone,ends);
                        int biggest31201 = 0;
                        if(ends[23]>=biggest31201){
                          biggest31201=ends[23];
                        }
                        if(ends[24]>=biggest31201){
                          biggest31201=ends[24];
                        }
                        if(biggest31201 == 1){
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                        if(biggest31201 == 2){
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
                      thread31202(tdone,ends);
                      thread31203(tdone,ends);
                      int biggest31204 = 0;
                      if(ends[23]>=biggest31204){
                        biggest31204=ends[23];
                      }
                      if(ends[24]>=biggest31204){
                        biggest31204=ends[24];
                      }
                      if(biggest31204 == 1){
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      if(biggest31204 == 2){
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
            thread31205(tdone,ends);
            thread31206(tdone,ends);
            int biggest31207 = 0;
            if(ends[23]>=biggest31207){
              biggest31207=ends[23];
            }
            if(ends[24]>=biggest31207){
              biggest31207=ends[24];
            }
            if(biggest31207 == 1){
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            if(biggest31207 == 2){
              ends[19]=2;
              ;//sysj\conveyor_controller.sysj line: 228, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 232, column: 16
              S3990=3;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            //FINXME code
            if(biggest31207 == 0){
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
                    thread31208(tdone,ends);
                    thread31209(tdone,ends);
                    thread31210(tdone,ends);
                    int biggest31211 = 0;
                    if(ends[20]>=biggest31211){
                      biggest31211=ends[20];
                    }
                    if(ends[21]>=biggest31211){
                      biggest31211=ends[21];
                    }
                    if(ends[22]>=biggest31211){
                      biggest31211=ends[22];
                    }
                    if(biggest31211 == 1){
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
                          thread31212(tdone,ends);
                          thread31213(tdone,ends);
                          thread31214(tdone,ends);
                          int biggest31215 = 0;
                          if(ends[20]>=biggest31215){
                            biggest31215=ends[20];
                          }
                          if(ends[21]>=biggest31215){
                            biggest31215=ends[21];
                          }
                          if(ends[22]>=biggest31215){
                            biggest31215=ends[22];
                          }
                          if(biggest31215 == 1){
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
                        thread31216(tdone,ends);
                        thread31217(tdone,ends);
                        thread31218(tdone,ends);
                        int biggest31219 = 0;
                        if(ends[20]>=biggest31219){
                          biggest31219=ends[20];
                        }
                        if(ends[21]>=biggest31219){
                          biggest31219=ends[21];
                        }
                        if(ends[22]>=biggest31219){
                          biggest31219=ends[22];
                        }
                        if(biggest31219 == 1){
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
                      thread31220(tdone,ends);
                      thread31221(tdone,ends);
                      thread31222(tdone,ends);
                      int biggest31223 = 0;
                      if(ends[20]>=biggest31223){
                        biggest31223=ends[20];
                      }
                      if(ends[21]>=biggest31223){
                        biggest31223=ends[21];
                      }
                      if(ends[22]>=biggest31223){
                        biggest31223=ends[22];
                      }
                      if(biggest31223 == 1){
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

  public void thread31189(int [] tdone, int [] ends){
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

  public void thread31186(int [] tdone, int [] ends){
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

  public void thread31185(int [] tdone, int [] ends){
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

  public void thread31184(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31185(tdone,ends);
    thread31186(tdone,ends);
    int biggest31187 = 0;
    if(ends[33]>=biggest31187){
      biggest31187=ends[33];
    }
    if(ends[34]>=biggest31187){
      biggest31187=ends[34];
    }
    if(biggest31187 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31182(int [] tdone, int [] ends){
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

  public void thread31181(int [] tdone, int [] ends){
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

  public void thread31180(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31181(tdone,ends);
    thread31182(tdone,ends);
    int biggest31183 = 0;
    if(ends[30]>=biggest31183){
      biggest31183=ends[30];
    }
    if(ends[31]>=biggest31183){
      biggest31183=ends[31];
    }
    if(biggest31183 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31178(int [] tdone, int [] ends){
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

  public void thread31177(int [] tdone, int [] ends){
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

  public void thread31176(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31177(tdone,ends);
    thread31178(tdone,ends);
    int biggest31179 = 0;
    if(ends[27]>=biggest31179){
      biggest31179=ends[27];
    }
    if(ends[28]>=biggest31179){
      biggest31179=ends[28];
    }
    if(biggest31179 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31175(int [] tdone, int [] ends){
        S5896=1;
    thread31176(tdone,ends);
    thread31180(tdone,ends);
    thread31184(tdone,ends);
    int biggest31188 = 0;
    if(ends[26]>=biggest31188){
      biggest31188=ends[26];
    }
    if(ends[29]>=biggest31188){
      biggest31188=ends[29];
    }
    if(ends[32]>=biggest31188){
      biggest31188=ends[32];
    }
    if(biggest31188 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31188 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31188 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31173(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31172(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31171(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31170(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31171(tdone,ends);
    thread31172(tdone,ends);
    thread31173(tdone,ends);
    int biggest31174 = 0;
    if(ends[20]>=biggest31174){
      biggest31174=ends[20];
    }
    if(ends[21]>=biggest31174){
      biggest31174=ends[21];
    }
    if(ends[22]>=biggest31174){
      biggest31174=ends[22];
    }
    if(biggest31174 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31168(int [] tdone, int [] ends){
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

  public void thread31165(int [] tdone, int [] ends){
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

  public void thread31164(int [] tdone, int [] ends){
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

  public void thread31163(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31164(tdone,ends);
    thread31165(tdone,ends);
    int biggest31166 = 0;
    if(ends[33]>=biggest31166){
      biggest31166=ends[33];
    }
    if(ends[34]>=biggest31166){
      biggest31166=ends[34];
    }
    if(biggest31166 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31161(int [] tdone, int [] ends){
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

  public void thread31160(int [] tdone, int [] ends){
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

  public void thread31159(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31160(tdone,ends);
    thread31161(tdone,ends);
    int biggest31162 = 0;
    if(ends[30]>=biggest31162){
      biggest31162=ends[30];
    }
    if(ends[31]>=biggest31162){
      biggest31162=ends[31];
    }
    if(biggest31162 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31157(int [] tdone, int [] ends){
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

  public void thread31156(int [] tdone, int [] ends){
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

  public void thread31155(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31156(tdone,ends);
    thread31157(tdone,ends);
    int biggest31158 = 0;
    if(ends[27]>=biggest31158){
      biggest31158=ends[27];
    }
    if(ends[28]>=biggest31158){
      biggest31158=ends[28];
    }
    if(biggest31158 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31154(int [] tdone, int [] ends){
        S5896=1;
    thread31155(tdone,ends);
    thread31159(tdone,ends);
    thread31163(tdone,ends);
    int biggest31167 = 0;
    if(ends[26]>=biggest31167){
      biggest31167=ends[26];
    }
    if(ends[29]>=biggest31167){
      biggest31167=ends[29];
    }
    if(ends[32]>=biggest31167){
      biggest31167=ends[32];
    }
    if(biggest31167 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31167 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31167 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31152(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31151(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31150(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31149(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31150(tdone,ends);
    thread31151(tdone,ends);
    thread31152(tdone,ends);
    int biggest31153 = 0;
    if(ends[20]>=biggest31153){
      biggest31153=ends[20];
    }
    if(ends[21]>=biggest31153){
      biggest31153=ends[21];
    }
    if(ends[22]>=biggest31153){
      biggest31153=ends[22];
    }
    if(biggest31153 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31147(int [] tdone, int [] ends){
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

  public void thread31144(int [] tdone, int [] ends){
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

  public void thread31143(int [] tdone, int [] ends){
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

  public void thread31142(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31143(tdone,ends);
    thread31144(tdone,ends);
    int biggest31145 = 0;
    if(ends[33]>=biggest31145){
      biggest31145=ends[33];
    }
    if(ends[34]>=biggest31145){
      biggest31145=ends[34];
    }
    if(biggest31145 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31140(int [] tdone, int [] ends){
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

  public void thread31139(int [] tdone, int [] ends){
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

  public void thread31138(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31139(tdone,ends);
    thread31140(tdone,ends);
    int biggest31141 = 0;
    if(ends[30]>=biggest31141){
      biggest31141=ends[30];
    }
    if(ends[31]>=biggest31141){
      biggest31141=ends[31];
    }
    if(biggest31141 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31136(int [] tdone, int [] ends){
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

  public void thread31135(int [] tdone, int [] ends){
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

  public void thread31134(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31135(tdone,ends);
    thread31136(tdone,ends);
    int biggest31137 = 0;
    if(ends[27]>=biggest31137){
      biggest31137=ends[27];
    }
    if(ends[28]>=biggest31137){
      biggest31137=ends[28];
    }
    if(biggest31137 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31133(int [] tdone, int [] ends){
        S5896=1;
    thread31134(tdone,ends);
    thread31138(tdone,ends);
    thread31142(tdone,ends);
    int biggest31146 = 0;
    if(ends[26]>=biggest31146){
      biggest31146=ends[26];
    }
    if(ends[29]>=biggest31146){
      biggest31146=ends[29];
    }
    if(ends[32]>=biggest31146){
      biggest31146=ends[32];
    }
    if(biggest31146 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31146 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31146 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31131(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31130(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31129(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31128(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31129(tdone,ends);
    thread31130(tdone,ends);
    thread31131(tdone,ends);
    int biggest31132 = 0;
    if(ends[20]>=biggest31132){
      biggest31132=ends[20];
    }
    if(ends[21]>=biggest31132){
      biggest31132=ends[21];
    }
    if(ends[22]>=biggest31132){
      biggest31132=ends[22];
    }
    if(biggest31132 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31126(int [] tdone, int [] ends){
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

  public void thread31123(int [] tdone, int [] ends){
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

  public void thread31122(int [] tdone, int [] ends){
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

  public void thread31121(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31122(tdone,ends);
    thread31123(tdone,ends);
    int biggest31124 = 0;
    if(ends[33]>=biggest31124){
      biggest31124=ends[33];
    }
    if(ends[34]>=biggest31124){
      biggest31124=ends[34];
    }
    if(biggest31124 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31119(int [] tdone, int [] ends){
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

  public void thread31118(int [] tdone, int [] ends){
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

  public void thread31117(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31118(tdone,ends);
    thread31119(tdone,ends);
    int biggest31120 = 0;
    if(ends[30]>=biggest31120){
      biggest31120=ends[30];
    }
    if(ends[31]>=biggest31120){
      biggest31120=ends[31];
    }
    if(biggest31120 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31115(int [] tdone, int [] ends){
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

  public void thread31114(int [] tdone, int [] ends){
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

  public void thread31113(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31114(tdone,ends);
    thread31115(tdone,ends);
    int biggest31116 = 0;
    if(ends[27]>=biggest31116){
      biggest31116=ends[27];
    }
    if(ends[28]>=biggest31116){
      biggest31116=ends[28];
    }
    if(biggest31116 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31112(int [] tdone, int [] ends){
        S5896=1;
    thread31113(tdone,ends);
    thread31117(tdone,ends);
    thread31121(tdone,ends);
    int biggest31125 = 0;
    if(ends[26]>=biggest31125){
      biggest31125=ends[26];
    }
    if(ends[29]>=biggest31125){
      biggest31125=ends[29];
    }
    if(ends[32]>=biggest31125){
      biggest31125=ends[32];
    }
    if(biggest31125 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31125 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31125 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31110(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31109(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31108(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31107(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31108(tdone,ends);
    thread31109(tdone,ends);
    thread31110(tdone,ends);
    int biggest31111 = 0;
    if(ends[20]>=biggest31111){
      biggest31111=ends[20];
    }
    if(ends[21]>=biggest31111){
      biggest31111=ends[21];
    }
    if(ends[22]>=biggest31111){
      biggest31111=ends[22];
    }
    if(biggest31111 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31105(int [] tdone, int [] ends){
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

  public void thread31102(int [] tdone, int [] ends){
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

  public void thread31101(int [] tdone, int [] ends){
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

  public void thread31100(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31101(tdone,ends);
    thread31102(tdone,ends);
    int biggest31103 = 0;
    if(ends[33]>=biggest31103){
      biggest31103=ends[33];
    }
    if(ends[34]>=biggest31103){
      biggest31103=ends[34];
    }
    if(biggest31103 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31098(int [] tdone, int [] ends){
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

  public void thread31097(int [] tdone, int [] ends){
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

  public void thread31096(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31097(tdone,ends);
    thread31098(tdone,ends);
    int biggest31099 = 0;
    if(ends[30]>=biggest31099){
      biggest31099=ends[30];
    }
    if(ends[31]>=biggest31099){
      biggest31099=ends[31];
    }
    if(biggest31099 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31094(int [] tdone, int [] ends){
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

  public void thread31093(int [] tdone, int [] ends){
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

  public void thread31092(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31093(tdone,ends);
    thread31094(tdone,ends);
    int biggest31095 = 0;
    if(ends[27]>=biggest31095){
      biggest31095=ends[27];
    }
    if(ends[28]>=biggest31095){
      biggest31095=ends[28];
    }
    if(biggest31095 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31091(int [] tdone, int [] ends){
        S5896=1;
    thread31092(tdone,ends);
    thread31096(tdone,ends);
    thread31100(tdone,ends);
    int biggest31104 = 0;
    if(ends[26]>=biggest31104){
      biggest31104=ends[26];
    }
    if(ends[29]>=biggest31104){
      biggest31104=ends[29];
    }
    if(ends[32]>=biggest31104){
      biggest31104=ends[32];
    }
    if(biggest31104 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31104 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31104 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31089(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31088(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31087(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31086(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31087(tdone,ends);
    thread31088(tdone,ends);
    thread31089(tdone,ends);
    int biggest31090 = 0;
    if(ends[20]>=biggest31090){
      biggest31090=ends[20];
    }
    if(ends[21]>=biggest31090){
      biggest31090=ends[21];
    }
    if(ends[22]>=biggest31090){
      biggest31090=ends[22];
    }
    if(biggest31090 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31084(int [] tdone, int [] ends){
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

  public void thread31081(int [] tdone, int [] ends){
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

  public void thread31080(int [] tdone, int [] ends){
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

  public void thread31079(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31080(tdone,ends);
    thread31081(tdone,ends);
    int biggest31082 = 0;
    if(ends[33]>=biggest31082){
      biggest31082=ends[33];
    }
    if(ends[34]>=biggest31082){
      biggest31082=ends[34];
    }
    if(biggest31082 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31077(int [] tdone, int [] ends){
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

  public void thread31076(int [] tdone, int [] ends){
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

  public void thread31075(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31076(tdone,ends);
    thread31077(tdone,ends);
    int biggest31078 = 0;
    if(ends[30]>=biggest31078){
      biggest31078=ends[30];
    }
    if(ends[31]>=biggest31078){
      biggest31078=ends[31];
    }
    if(biggest31078 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31073(int [] tdone, int [] ends){
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

  public void thread31072(int [] tdone, int [] ends){
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

  public void thread31071(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31072(tdone,ends);
    thread31073(tdone,ends);
    int biggest31074 = 0;
    if(ends[27]>=biggest31074){
      biggest31074=ends[27];
    }
    if(ends[28]>=biggest31074){
      biggest31074=ends[28];
    }
    if(biggest31074 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31070(int [] tdone, int [] ends){
        S5896=1;
    thread31071(tdone,ends);
    thread31075(tdone,ends);
    thread31079(tdone,ends);
    int biggest31083 = 0;
    if(ends[26]>=biggest31083){
      biggest31083=ends[26];
    }
    if(ends[29]>=biggest31083){
      biggest31083=ends[29];
    }
    if(ends[32]>=biggest31083){
      biggest31083=ends[32];
    }
    if(biggest31083 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31083 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31083 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31068(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31067(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31066(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31065(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31066(tdone,ends);
    thread31067(tdone,ends);
    thread31068(tdone,ends);
    int biggest31069 = 0;
    if(ends[20]>=biggest31069){
      biggest31069=ends[20];
    }
    if(ends[21]>=biggest31069){
      biggest31069=ends[21];
    }
    if(ends[22]>=biggest31069){
      biggest31069=ends[22];
    }
    if(biggest31069 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31063(int [] tdone, int [] ends){
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

  public void thread31060(int [] tdone, int [] ends){
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

  public void thread31059(int [] tdone, int [] ends){
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

  public void thread31058(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31059(tdone,ends);
    thread31060(tdone,ends);
    int biggest31061 = 0;
    if(ends[33]>=biggest31061){
      biggest31061=ends[33];
    }
    if(ends[34]>=biggest31061){
      biggest31061=ends[34];
    }
    if(biggest31061 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31056(int [] tdone, int [] ends){
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

  public void thread31055(int [] tdone, int [] ends){
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

  public void thread31054(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31055(tdone,ends);
    thread31056(tdone,ends);
    int biggest31057 = 0;
    if(ends[30]>=biggest31057){
      biggest31057=ends[30];
    }
    if(ends[31]>=biggest31057){
      biggest31057=ends[31];
    }
    if(biggest31057 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31052(int [] tdone, int [] ends){
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

  public void thread31051(int [] tdone, int [] ends){
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

  public void thread31050(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31051(tdone,ends);
    thread31052(tdone,ends);
    int biggest31053 = 0;
    if(ends[27]>=biggest31053){
      biggest31053=ends[27];
    }
    if(ends[28]>=biggest31053){
      biggest31053=ends[28];
    }
    if(biggest31053 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31049(int [] tdone, int [] ends){
        S5896=1;
    thread31050(tdone,ends);
    thread31054(tdone,ends);
    thread31058(tdone,ends);
    int biggest31062 = 0;
    if(ends[26]>=biggest31062){
      biggest31062=ends[26];
    }
    if(ends[29]>=biggest31062){
      biggest31062=ends[29];
    }
    if(ends[32]>=biggest31062){
      biggest31062=ends[32];
    }
    if(biggest31062 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31062 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31062 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31047(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31046(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31045(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31044(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31045(tdone,ends);
    thread31046(tdone,ends);
    thread31047(tdone,ends);
    int biggest31048 = 0;
    if(ends[20]>=biggest31048){
      biggest31048=ends[20];
    }
    if(ends[21]>=biggest31048){
      biggest31048=ends[21];
    }
    if(ends[22]>=biggest31048){
      biggest31048=ends[22];
    }
    if(biggest31048 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31042(int [] tdone, int [] ends){
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

  public void thread31039(int [] tdone, int [] ends){
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

  public void thread31038(int [] tdone, int [] ends){
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

  public void thread31037(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31038(tdone,ends);
    thread31039(tdone,ends);
    int biggest31040 = 0;
    if(ends[33]>=biggest31040){
      biggest31040=ends[33];
    }
    if(ends[34]>=biggest31040){
      biggest31040=ends[34];
    }
    if(biggest31040 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31035(int [] tdone, int [] ends){
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

  public void thread31034(int [] tdone, int [] ends){
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

  public void thread31033(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31034(tdone,ends);
    thread31035(tdone,ends);
    int biggest31036 = 0;
    if(ends[30]>=biggest31036){
      biggest31036=ends[30];
    }
    if(ends[31]>=biggest31036){
      biggest31036=ends[31];
    }
    if(biggest31036 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31031(int [] tdone, int [] ends){
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

  public void thread31030(int [] tdone, int [] ends){
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

  public void thread31029(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31030(tdone,ends);
    thread31031(tdone,ends);
    int biggest31032 = 0;
    if(ends[27]>=biggest31032){
      biggest31032=ends[27];
    }
    if(ends[28]>=biggest31032){
      biggest31032=ends[28];
    }
    if(biggest31032 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31028(int [] tdone, int [] ends){
        S5896=1;
    thread31029(tdone,ends);
    thread31033(tdone,ends);
    thread31037(tdone,ends);
    int biggest31041 = 0;
    if(ends[26]>=biggest31041){
      biggest31041=ends[26];
    }
    if(ends[29]>=biggest31041){
      biggest31041=ends[29];
    }
    if(ends[32]>=biggest31041){
      biggest31041=ends[32];
    }
    if(biggest31041 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31041 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31041 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31026(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31025(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31024(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31023(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31024(tdone,ends);
    thread31025(tdone,ends);
    thread31026(tdone,ends);
    int biggest31027 = 0;
    if(ends[20]>=biggest31027){
      biggest31027=ends[20];
    }
    if(ends[21]>=biggest31027){
      biggest31027=ends[21];
    }
    if(ends[22]>=biggest31027){
      biggest31027=ends[22];
    }
    if(biggest31027 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31021(int [] tdone, int [] ends){
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

  public void thread31018(int [] tdone, int [] ends){
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

  public void thread31017(int [] tdone, int [] ends){
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

  public void thread31016(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread31017(tdone,ends);
    thread31018(tdone,ends);
    int biggest31019 = 0;
    if(ends[33]>=biggest31019){
      biggest31019=ends[33];
    }
    if(ends[34]>=biggest31019){
      biggest31019=ends[34];
    }
    if(biggest31019 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread31014(int [] tdone, int [] ends){
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

  public void thread31013(int [] tdone, int [] ends){
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

  public void thread31012(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread31013(tdone,ends);
    thread31014(tdone,ends);
    int biggest31015 = 0;
    if(ends[30]>=biggest31015){
      biggest31015=ends[30];
    }
    if(ends[31]>=biggest31015){
      biggest31015=ends[31];
    }
    if(biggest31015 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread31010(int [] tdone, int [] ends){
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

  public void thread31009(int [] tdone, int [] ends){
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

  public void thread31008(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread31009(tdone,ends);
    thread31010(tdone,ends);
    int biggest31011 = 0;
    if(ends[27]>=biggest31011){
      biggest31011=ends[27];
    }
    if(ends[28]>=biggest31011){
      biggest31011=ends[28];
    }
    if(biggest31011 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31007(int [] tdone, int [] ends){
        S5896=1;
    thread31008(tdone,ends);
    thread31012(tdone,ends);
    thread31016(tdone,ends);
    int biggest31020 = 0;
    if(ends[26]>=biggest31020){
      biggest31020=ends[26];
    }
    if(ends[29]>=biggest31020){
      biggest31020=ends[29];
    }
    if(ends[32]>=biggest31020){
      biggest31020=ends[32];
    }
    if(biggest31020 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31020 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest31020 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31005(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31004(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31003(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31002(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread31003(tdone,ends);
    thread31004(tdone,ends);
    thread31005(tdone,ends);
    int biggest31006 = 0;
    if(ends[20]>=biggest31006){
      biggest31006=ends[20];
    }
    if(ends[21]>=biggest31006){
      biggest31006=ends[21];
    }
    if(ends[22]>=biggest31006){
      biggest31006=ends[22];
    }
    if(biggest31006 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31000(int [] tdone, int [] ends){
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

  public void thread30997(int [] tdone, int [] ends){
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

  public void thread30996(int [] tdone, int [] ends){
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

  public void thread30995(int [] tdone, int [] ends){
        S5894=1;
    S5828=0;
    thread30996(tdone,ends);
    thread30997(tdone,ends);
    int biggest30998 = 0;
    if(ends[33]>=biggest30998){
      biggest30998=ends[33];
    }
    if(ends[34]>=biggest30998){
      biggest30998=ends[34];
    }
    if(biggest30998 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread30993(int [] tdone, int [] ends){
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

  public void thread30992(int [] tdone, int [] ends){
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

  public void thread30991(int [] tdone, int [] ends){
        S5795=1;
    S5729=0;
    thread30992(tdone,ends);
    thread30993(tdone,ends);
    int biggest30994 = 0;
    if(ends[30]>=biggest30994){
      biggest30994=ends[30];
    }
    if(ends[31]>=biggest30994){
      biggest30994=ends[31];
    }
    if(biggest30994 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread30989(int [] tdone, int [] ends){
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

  public void thread30988(int [] tdone, int [] ends){
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

  public void thread30987(int [] tdone, int [] ends){
        S5696=1;
    S5630=0;
    thread30988(tdone,ends);
    thread30989(tdone,ends);
    int biggest30990 = 0;
    if(ends[27]>=biggest30990){
      biggest30990=ends[27];
    }
    if(ends[28]>=biggest30990){
      biggest30990=ends[28];
    }
    if(biggest30990 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread30986(int [] tdone, int [] ends){
        S5896=1;
    thread30987(tdone,ends);
    thread30991(tdone,ends);
    thread30995(tdone,ends);
    int biggest30999 = 0;
    if(ends[26]>=biggest30999){
      biggest30999=ends[26];
    }
    if(ends[29]>=biggest30999){
      biggest30999=ends[29];
    }
    if(ends[32]>=biggest30999){
      biggest30999=ends[32];
    }
    if(biggest30999 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest30999 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest30999 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread30984(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread30983(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread30982(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread30981(int [] tdone, int [] ends){
        S5597=1;
    S3990=0;
    thread30982(tdone,ends);
    thread30983(tdone,ends);
    thread30984(tdone,ends);
    int biggest30985 = 0;
    if(ends[20]>=biggest30985){
      biggest30985=ends[20];
    }
    if(ends[21]>=biggest30985){
      biggest30985=ends[21];
    }
    if(ends[22]>=biggest30985){
      biggest30985=ends[22];
    }
    if(biggest30985 == 1){
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
                            thread30981(tdone,ends);
                            thread30986(tdone,ends);
                            thread31000(tdone,ends);
                            int biggest31001 = 0;
                            if(ends[19]>=biggest31001){
                              biggest31001=ends[19];
                            }
                            if(ends[25]>=biggest31001){
                              biggest31001=ends[25];
                            }
                            if(ends[35]>=biggest31001){
                              biggest31001=ends[35];
                            }
                            if(biggest31001 == 1){
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
                                        thread31002(tdone,ends);
                                        thread31007(tdone,ends);
                                        thread31021(tdone,ends);
                                        int biggest31022 = 0;
                                        if(ends[19]>=biggest31022){
                                          biggest31022=ends[19];
                                        }
                                        if(ends[25]>=biggest31022){
                                          biggest31022=ends[25];
                                        }
                                        if(ends[35]>=biggest31022){
                                          biggest31022=ends[35];
                                        }
                                        if(biggest31022 == 1){
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
                                      thread31023(tdone,ends);
                                      thread31028(tdone,ends);
                                      thread31042(tdone,ends);
                                      int biggest31043 = 0;
                                      if(ends[19]>=biggest31043){
                                        biggest31043=ends[19];
                                      }
                                      if(ends[25]>=biggest31043){
                                        biggest31043=ends[25];
                                      }
                                      if(ends[35]>=biggest31043){
                                        biggest31043=ends[35];
                                      }
                                      if(biggest31043 == 1){
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
                                    thread31044(tdone,ends);
                                    thread31049(tdone,ends);
                                    thread31063(tdone,ends);
                                    int biggest31064 = 0;
                                    if(ends[19]>=biggest31064){
                                      biggest31064=ends[19];
                                    }
                                    if(ends[25]>=biggest31064){
                                      biggest31064=ends[25];
                                    }
                                    if(ends[35]>=biggest31064){
                                      biggest31064=ends[35];
                                    }
                                    if(biggest31064 == 1){
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
                                  thread31065(tdone,ends);
                                  thread31070(tdone,ends);
                                  thread31084(tdone,ends);
                                  int biggest31085 = 0;
                                  if(ends[19]>=biggest31085){
                                    biggest31085=ends[19];
                                  }
                                  if(ends[25]>=biggest31085){
                                    biggest31085=ends[25];
                                  }
                                  if(ends[35]>=biggest31085){
                                    biggest31085=ends[35];
                                  }
                                  if(biggest31085 == 1){
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
                                thread31086(tdone,ends);
                                thread31091(tdone,ends);
                                thread31105(tdone,ends);
                                int biggest31106 = 0;
                                if(ends[19]>=biggest31106){
                                  biggest31106=ends[19];
                                }
                                if(ends[25]>=biggest31106){
                                  biggest31106=ends[25];
                                }
                                if(ends[35]>=biggest31106){
                                  biggest31106=ends[35];
                                }
                                if(biggest31106 == 1){
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
                              thread31107(tdone,ends);
                              thread31112(tdone,ends);
                              thread31126(tdone,ends);
                              int biggest31127 = 0;
                              if(ends[19]>=biggest31127){
                                biggest31127=ends[19];
                              }
                              if(ends[25]>=biggest31127){
                                biggest31127=ends[25];
                              }
                              if(ends[35]>=biggest31127){
                                biggest31127=ends[35];
                              }
                              if(biggest31127 == 1){
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
                            thread31128(tdone,ends);
                            thread31133(tdone,ends);
                            thread31147(tdone,ends);
                            int biggest31148 = 0;
                            if(ends[19]>=biggest31148){
                              biggest31148=ends[19];
                            }
                            if(ends[25]>=biggest31148){
                              biggest31148=ends[25];
                            }
                            if(ends[35]>=biggest31148){
                              biggest31148=ends[35];
                            }
                            if(biggest31148 == 1){
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
                          thread31149(tdone,ends);
                          thread31154(tdone,ends);
                          thread31168(tdone,ends);
                          int biggest31169 = 0;
                          if(ends[19]>=biggest31169){
                            biggest31169=ends[19];
                          }
                          if(ends[25]>=biggest31169){
                            biggest31169=ends[25];
                          }
                          if(ends[35]>=biggest31169){
                            biggest31169=ends[35];
                          }
                          if(biggest31169 == 1){
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
                        thread31170(tdone,ends);
                        thread31175(tdone,ends);
                        thread31189(tdone,ends);
                        int biggest31190 = 0;
                        if(ends[19]>=biggest31190){
                          biggest31190=ends[19];
                        }
                        if(ends[25]>=biggest31190){
                          biggest31190=ends[25];
                        }
                        if(ends[35]>=biggest31190){
                          biggest31190=ends[35];
                        }
                        if(biggest31190 == 1){
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
              thread31191(tdone,ends);
              thread31224(tdone,ends);
              thread31247(tdone,ends);
              int biggest31248 = 0;
              if(ends[19]>=biggest31248){
                biggest31248=ends[19];
              }
              if(ends[25]>=biggest31248){
                biggest31248=ends[25];
              }
              if(ends[35]>=biggest31248){
                biggest31248=ends[35];
              }
              if(biggest31248 == 1){
                active[18]=1;
                ends[18]=1;
                break RUN;
              }
              //FINXME code
              if(biggest31248 == 0){
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
