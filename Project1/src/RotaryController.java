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
  public Signal bottleAtPos3E = new Signal("bottleAtPos3E", Signal.OUTPUT);
  public input_Channel convReady_in = new input_Channel();
  public input_Channel fillerReady_in = new input_Channel();
  public input_Channel capperReady_in = new input_Channel();
  public input_Channel lidLoaderReady_in = new input_Channel();
  public input_Channel checkFive_in = new input_Channel();
  public input_Channel checkThree_in = new input_Channel();
  public input_Channel checkOne_in = new input_Channel();
  public output_Channel rotated_o = new output_Channel();
  private Signal cvR_26;
  private Signal fR_26;
  private Signal cR_26;
  private Signal lR_26;
  private Signal bottleAtPos5_26;
  private Signal bottleAtPos3_26;
  private long __start_thread_33;//sysj\conveyor_controller.sysj line: 285, column: 44
  private long __start_thread_27;//sysj\conveyor_controller.sysj line: 244, column: 7
  private int i_thread_27;//sysj\conveyor_controller.sysj line: 294, column: 10
  private int S24615 = 1;
  private int S3746 = 1;
  private int S3642 = 1;
  private int S3637 = 1;
  private int S3664 = 1;
  private int S3659 = 1;
  private int S3753 = 1;
  private int S3748 = 1;
  private int S3885 = 1;
  private int S3880 = 1;
  private int S5466 = 1;
  private int S4067 = 1;
  private int S4057 = 1;
  private int S4060 = 1;
  private int S4063 = 1;
  private int S4066 = 1;
  private int S4081 = 1;
  private int S4104 = 1;
  private int S4120 = 1;
  private int S4223 = 1;
  private int S4218 = 1;
  private int S5864 = 1;
  private int S5565 = 1;
  private int S5499 = 1;
  private int S5491 = 1;
  private int S5490 = 1;
  private int S5474 = 1;
  private int S5469 = 1;
  private int S5497 = 1;
  private int S5664 = 1;
  private int S5598 = 1;
  private int S5590 = 1;
  private int S5589 = 1;
  private int S5573 = 1;
  private int S5568 = 1;
  private int S5596 = 1;
  private int S5763 = 1;
  private int S5697 = 1;
  private int S5689 = 1;
  private int S5688 = 1;
  private int S5672 = 1;
  private int S5667 = 1;
  private int S5695 = 1;
  private int S5862 = 1;
  private int S5796 = 1;
  private int S5788 = 1;
  private int S5787 = 1;
  private int S5771 = 1;
  private int S5766 = 1;
  private int S5794 = 1;
  private int S6032 = 1;
  private int S5947 = 1;
  private int S5891 = 1;
  private int S5871 = 1;
  private int S5866 = 1;
  private int S6030 = 1;
  private int S5974 = 1;
  private int S5954 = 1;
  private int S5949 = 1;
  private int S6110 = 1;
  private int S6070 = 1;
  private int S6044 = 1;
  private int S6037 = 1;
  private int S6040 = 1;
  private int S6108 = 1;
  private int S6082 = 1;
  private int S6075 = 1;
  private int S6078 = 1;
  
  private int[] ends = new int[90];
  private int[] tdone = new int[90];
  
  public void thread47557(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47556(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47554(int [] tdone, int [] ends){
        switch(S6078){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_controller.sysj line: 371, column: 29
          ends[56]=2;
          tdone[56]=1;
        }
        else {
          active[56]=1;
          ends[56]=1;
          tdone[56]=1;
        }
        break;
      
    }
  }

  public void thread47553(int [] tdone, int [] ends){
        switch(S6075){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
        currsigs.addElement(bottleAtPos5E);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread47552(int [] tdone, int [] ends){
        switch(S6108){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S6082){
          case 0 : 
            thread47553(tdone,ends);
            thread47554(tdone,ends);
            int biggest47555 = 0;
            if(ends[55]>=biggest47555){
              biggest47555=ends[55];
            }
            if(ends[56]>=biggest47555){
              biggest47555=ends[56];
            }
            if(biggest47555 == 1){
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            if(biggest47555 == 2){
              ends[54]=2;
              ;//sysj\conveyor_controller.sysj line: 365, column: 34
              S6082=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            //FINXME code
            if(biggest47555 == 0){
              ;//sysj\conveyor_controller.sysj line: 373, column: 20
              S6082=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 1 : 
            S6082=1;
            S6082=0;
            if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
              thread47556(tdone,ends);
              thread47557(tdone,ends);
              int biggest47558 = 0;
              if(ends[55]>=biggest47558){
                biggest47558=ends[55];
              }
              if(ends[56]>=biggest47558){
                biggest47558=ends[56];
              }
              if(biggest47558 == 1){
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
            }
            else {
              S6082=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47550(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47549(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47547(int [] tdone, int [] ends){
        switch(S6040){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_controller.sysj line: 353, column: 29
          ends[53]=2;
          tdone[53]=1;
        }
        else {
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        break;
      
    }
  }

  public void thread47546(int [] tdone, int [] ends){
        switch(S6037){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
        currsigs.addElement(bottleAtPos3E);
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
        break;
      
    }
  }

  public void thread47545(int [] tdone, int [] ends){
        switch(S6070){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        switch(S6044){
          case 0 : 
            thread47546(tdone,ends);
            thread47547(tdone,ends);
            int biggest47548 = 0;
            if(ends[52]>=biggest47548){
              biggest47548=ends[52];
            }
            if(ends[53]>=biggest47548){
              biggest47548=ends[53];
            }
            if(biggest47548 == 1){
              active[51]=1;
              ends[51]=1;
              tdone[51]=1;
            }
            if(biggest47548 == 2){
              ends[51]=2;
              ;//sysj\conveyor_controller.sysj line: 347, column: 34
              S6044=1;
              active[51]=1;
              ends[51]=1;
              tdone[51]=1;
            }
            //FINXME code
            if(biggest47548 == 0){
              ;//sysj\conveyor_controller.sysj line: 355, column: 20
              S6044=1;
              active[51]=1;
              ends[51]=1;
              tdone[51]=1;
            }
            break;
          
          case 1 : 
            S6044=1;
            S6044=0;
            if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
              thread47549(tdone,ends);
              thread47550(tdone,ends);
              int biggest47551 = 0;
              if(ends[52]>=biggest47551){
                biggest47551=ends[52];
              }
              if(ends[53]>=biggest47551){
                biggest47551=ends[53];
              }
              if(biggest47551 == 1){
                active[51]=1;
                ends[51]=1;
                tdone[51]=1;
              }
            }
            else {
              S6044=1;
              active[51]=1;
              ends[51]=1;
              tdone[51]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47544(int [] tdone, int [] ends){
        switch(S6110){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        thread47545(tdone,ends);
        thread47552(tdone,ends);
        int biggest47559 = 0;
        if(ends[51]>=biggest47559){
          biggest47559=ends[51];
        }
        if(ends[54]>=biggest47559){
          biggest47559=ends[54];
        }
        if(biggest47559 == 1){
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        //FINXME code
        if(biggest47559 == 0){
          S6110=0;
          active[50]=0;
          ends[50]=0;
          tdone[50]=1;
        }
        break;
      
    }
  }

  public void thread47542(int [] tdone, int [] ends){
        switch(S6030){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        switch(S5974){
          case 0 : 
            switch(S5954){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
                  S5954=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  switch(S5949){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
                        S5949=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
                          ends[49]=2;
                          ;//sysj\conveyor_controller.sysj line: 332, column: 8
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
                            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
                            currsigs.addElement(bottleAtPos3_26);
                            S5974=1;
                            active[49]=1;
                            ends[49]=1;
                            tdone[49]=1;
                          }
                          else {
                            S5974=1;
                            active[49]=1;
                            ends[49]=1;
                            tdone[49]=1;
                          }
                        }
                        else {
                          active[49]=1;
                          ends[49]=1;
                          tdone[49]=1;
                        }
                      }
                      else {
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
                        ends[49]=2;
                        ;//sysj\conveyor_controller.sysj line: 332, column: 8
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
                          bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
                          currsigs.addElement(bottleAtPos3_26);
                          S5974=1;
                          active[49]=1;
                          ends[49]=1;
                          tdone[49]=1;
                        }
                        else {
                          S5974=1;
                          active[49]=1;
                          ends[49]=1;
                          tdone[49]=1;
                        }
                      }
                      else {
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S5954=1;
                S5954=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
                  S5954=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  S5949=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
                    S5949=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
                      ends[49]=2;
                      ;//sysj\conveyor_controller.sysj line: 332, column: 8
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
                        bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
                        currsigs.addElement(bottleAtPos3_26);
                        S5974=1;
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      else {
                        S5974=1;
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                    }
                    else {
                      active[49]=1;
                      ends[49]=1;
                      tdone[49]=1;
                    }
                  }
                  else {
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5974=1;
            S5974=0;
            S5954=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
              S5954=1;
              active[49]=1;
              ends[49]=1;
              tdone[49]=1;
            }
            else {
              S5949=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
                S5949=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
                  ends[49]=2;
                  ;//sysj\conveyor_controller.sysj line: 332, column: 8
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
                    bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
                    currsigs.addElement(bottleAtPos3_26);
                    S5974=1;
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                  else {
                    S5974=1;
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
                else {
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
              }
              else {
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47541(int [] tdone, int [] ends){
        switch(S5947){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        switch(S5891){
          case 0 : 
            switch(S5871){
              case 0 : 
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
                  S5871=1;
                  active[48]=1;
                  ends[48]=1;
                  tdone[48]=1;
                }
                else {
                  switch(S5866){
                    case 0 : 
                      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
                        S5866=1;
                        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
                          ends[48]=2;
                          ;//sysj\conveyor_controller.sysj line: 322, column: 7
                          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
                            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
                            currsigs.addElement(bottleAtPos5_26);
                            S5891=1;
                            active[48]=1;
                            ends[48]=1;
                            tdone[48]=1;
                          }
                          else {
                            S5891=1;
                            active[48]=1;
                            ends[48]=1;
                            tdone[48]=1;
                          }
                        }
                        else {
                          active[48]=1;
                          ends[48]=1;
                          tdone[48]=1;
                        }
                      }
                      else {
                        active[48]=1;
                        ends[48]=1;
                        tdone[48]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                        checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
                        ends[48]=2;
                        ;//sysj\conveyor_controller.sysj line: 322, column: 7
                        if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
                          bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
                          currsigs.addElement(bottleAtPos5_26);
                          S5891=1;
                          active[48]=1;
                          ends[48]=1;
                          tdone[48]=1;
                        }
                        else {
                          S5891=1;
                          active[48]=1;
                          ends[48]=1;
                          tdone[48]=1;
                        }
                      }
                      else {
                        active[48]=1;
                        ends[48]=1;
                        tdone[48]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S5871=1;
                S5871=0;
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
                  S5871=1;
                  active[48]=1;
                  ends[48]=1;
                  tdone[48]=1;
                }
                else {
                  S5866=0;
                  if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                    checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
                    S5866=1;
                    if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
                      ends[48]=2;
                      ;//sysj\conveyor_controller.sysj line: 322, column: 7
                      if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
                        bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
                        currsigs.addElement(bottleAtPos5_26);
                        S5891=1;
                        active[48]=1;
                        ends[48]=1;
                        tdone[48]=1;
                      }
                      else {
                        S5891=1;
                        active[48]=1;
                        ends[48]=1;
                        tdone[48]=1;
                      }
                    }
                    else {
                      active[48]=1;
                      ends[48]=1;
                      tdone[48]=1;
                    }
                  }
                  else {
                    active[48]=1;
                    ends[48]=1;
                    tdone[48]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5891=1;
            S5891=0;
            S5871=0;
            if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
              checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
              S5871=1;
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            else {
              S5866=0;
              if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
                S5866=1;
                if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
                  ends[48]=2;
                  ;//sysj\conveyor_controller.sysj line: 322, column: 7
                  if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
                    bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
                    currsigs.addElement(bottleAtPos5_26);
                    S5891=1;
                    active[48]=1;
                    ends[48]=1;
                    tdone[48]=1;
                  }
                  else {
                    S5891=1;
                    active[48]=1;
                    ends[48]=1;
                    tdone[48]=1;
                  }
                }
                else {
                  active[48]=1;
                  ends[48]=1;
                  tdone[48]=1;
                }
              }
              else {
                active[48]=1;
                ends[48]=1;
                tdone[48]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47540(int [] tdone, int [] ends){
        switch(S6032){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        thread47541(tdone,ends);
        thread47542(tdone,ends);
        int biggest47543 = 0;
        if(ends[48]>=biggest47543){
          biggest47543=ends[48];
        }
        if(ends[49]>=biggest47543){
          biggest47543=ends[49];
        }
        if(biggest47543 == 1){
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        //FINXME code
        if(biggest47543 == 0){
          S6032=0;
          active[47]=0;
          ends[47]=0;
          tdone[47]=1;
        }
        break;
      
    }
  }

  public void thread47537(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread47536(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread47534(int [] tdone, int [] ends){
        switch(S5794){
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

  public void thread47533(int [] tdone, int [] ends){
        switch(S5788){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S5787){
          case 0 : 
            switch(S5771){
              case 0 : 
                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5771=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
                else {
                  switch(S5766){
                    case 0 : 
                      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S5766=1;
                        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[45]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S5787=1;
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
                        S5787=1;
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
                S5771=1;
                S5771=0;
                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5771=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
                else {
                  S5766=0;
                  if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S5766=1;
                    if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[45]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S5787=1;
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
            S5787=1;
            S5787=2;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
            break;
          
          case 2 : 
            S5787=2;
            lidLoaderReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[45]=2;
            tdone[45]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread47532(int [] tdone, int [] ends){
        switch(S5862){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        switch(S5796){
          case 0 : 
            thread47533(tdone,ends);
            thread47534(tdone,ends);
            int biggest47535 = 0;
            if(ends[45]>=biggest47535){
              biggest47535=ends[45];
            }
            if(ends[46]>=biggest47535){
              biggest47535=ends[46];
            }
            if(biggest47535 == 1){
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            if(biggest47535 == 2){
              ends[44]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S5796=1;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            //FINXME code
            if(biggest47535 == 0){
              S5796=1;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
          case 1 : 
            S5796=1;
            S5796=0;
            thread47536(tdone,ends);
            thread47537(tdone,ends);
            int biggest47538 = 0;
            if(ends[45]>=biggest47538){
              biggest47538=ends[45];
            }
            if(ends[46]>=biggest47538){
              biggest47538=ends[46];
            }
            if(biggest47538 == 1){
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47530(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread47529(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread47527(int [] tdone, int [] ends){
        switch(S5695){
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

  public void thread47526(int [] tdone, int [] ends){
        switch(S5689){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S5688){
          case 0 : 
            switch(S5672){
              case 0 : 
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5672=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  switch(S5667){
                    case 0 : 
                      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S5667=1;
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[42]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S5688=1;
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
                        S5688=1;
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
                S5672=1;
                S5672=0;
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5672=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  S5667=0;
                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S5667=1;
                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[42]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S5688=1;
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
            S5688=1;
            S5688=2;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
            break;
          
          case 2 : 
            S5688=2;
            capperReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[42]=2;
            tdone[42]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread47525(int [] tdone, int [] ends){
        switch(S5763){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        switch(S5697){
          case 0 : 
            thread47526(tdone,ends);
            thread47527(tdone,ends);
            int biggest47528 = 0;
            if(ends[42]>=biggest47528){
              biggest47528=ends[42];
            }
            if(ends[43]>=biggest47528){
              biggest47528=ends[43];
            }
            if(biggest47528 == 1){
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            if(biggest47528 == 2){
              ends[41]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S5697=1;
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            //FINXME code
            if(biggest47528 == 0){
              S5697=1;
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            break;
          
          case 1 : 
            S5697=1;
            S5697=0;
            thread47529(tdone,ends);
            thread47530(tdone,ends);
            int biggest47531 = 0;
            if(ends[42]>=biggest47531){
              biggest47531=ends[42];
            }
            if(ends[43]>=biggest47531){
              biggest47531=ends[43];
            }
            if(biggest47531 == 1){
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47523(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread47522(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread47520(int [] tdone, int [] ends){
        switch(S5596){
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

  public void thread47519(int [] tdone, int [] ends){
        switch(S5590){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S5589){
          case 0 : 
            switch(S5573){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5573=1;
                  active[39]=1;
                  ends[39]=1;
                  tdone[39]=1;
                }
                else {
                  switch(S5568){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S5568=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[39]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S5589=1;
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
                        S5589=1;
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
                S5573=1;
                S5573=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5573=1;
                  active[39]=1;
                  ends[39]=1;
                  tdone[39]=1;
                }
                else {
                  S5568=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S5568=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[39]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S5589=1;
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
            S5589=1;
            S5589=2;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
            break;
          
          case 2 : 
            S5589=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[39]=2;
            tdone[39]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread47518(int [] tdone, int [] ends){
        switch(S5664){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S5598){
          case 0 : 
            thread47519(tdone,ends);
            thread47520(tdone,ends);
            int biggest47521 = 0;
            if(ends[39]>=biggest47521){
              biggest47521=ends[39];
            }
            if(ends[40]>=biggest47521){
              biggest47521=ends[40];
            }
            if(biggest47521 == 1){
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            if(biggest47521 == 2){
              ends[38]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S5598=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            //FINXME code
            if(biggest47521 == 0){
              S5598=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 1 : 
            S5598=1;
            S5598=0;
            thread47522(tdone,ends);
            thread47523(tdone,ends);
            int biggest47524 = 0;
            if(ends[39]>=biggest47524){
              biggest47524=ends[39];
            }
            if(ends[40]>=biggest47524){
              biggest47524=ends[40];
            }
            if(biggest47524 == 1){
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47516(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread47515(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread47513(int [] tdone, int [] ends){
        switch(S5497){
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

  public void thread47512(int [] tdone, int [] ends){
        switch(S5491){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S5490){
          case 0 : 
            switch(S5474){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5474=1;
                  active[36]=1;
                  ends[36]=1;
                  tdone[36]=1;
                }
                else {
                  switch(S5469){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S5469=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[36]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S5490=1;
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
                        S5490=1;
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
                S5474=1;
                S5474=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5474=1;
                  active[36]=1;
                  ends[36]=1;
                  tdone[36]=1;
                }
                else {
                  S5469=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S5469=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[36]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S5490=1;
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
            S5490=1;
            S5490=2;
            active[36]=1;
            ends[36]=1;
            tdone[36]=1;
            break;
          
          case 2 : 
            S5490=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[36]=2;
            tdone[36]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread47511(int [] tdone, int [] ends){
        switch(S5565){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S5499){
          case 0 : 
            thread47512(tdone,ends);
            thread47513(tdone,ends);
            int biggest47514 = 0;
            if(ends[36]>=biggest47514){
              biggest47514=ends[36];
            }
            if(ends[37]>=biggest47514){
              biggest47514=ends[37];
            }
            if(biggest47514 == 1){
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            if(biggest47514 == 2){
              ends[35]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S5499=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            //FINXME code
            if(biggest47514 == 0){
              S5499=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            break;
          
          case 1 : 
            S5499=1;
            S5499=0;
            thread47515(tdone,ends);
            thread47516(tdone,ends);
            int biggest47517 = 0;
            if(ends[36]>=biggest47517){
              biggest47517=ends[36];
            }
            if(ends[37]>=biggest47517){
              biggest47517=ends[37];
            }
            if(biggest47517 == 1){
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47510(int [] tdone, int [] ends){
        switch(S5864){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        thread47511(tdone,ends);
        thread47518(tdone,ends);
        thread47525(tdone,ends);
        thread47532(tdone,ends);
        int biggest47539 = 0;
        if(ends[35]>=biggest47539){
          biggest47539=ends[35];
        }
        if(ends[38]>=biggest47539){
          biggest47539=ends[38];
        }
        if(ends[41]>=biggest47539){
          biggest47539=ends[41];
        }
        if(ends[44]>=biggest47539){
          biggest47539=ends[44];
        }
        if(biggest47539 == 1){
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        //FINXME code
        if(biggest47539 == 0){
          S5864=0;
          active[34]=0;
          ends[34]=0;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread47508(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47507(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47506(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47505(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47503(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47502(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47501(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47500(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47498(int [] tdone, int [] ends){
        switch(S4120){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_33 >= 300){//sysj\conveyor_controller.sysj line: 285, column: 44
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

  public void thread47497(int [] tdone, int [] ends){
        switch(S4104){
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

  public void thread47495(int [] tdone, int [] ends){
        S4120=1;
    __start_thread_33 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 285, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_33 >= 300){//sysj\conveyor_controller.sysj line: 285, column: 44
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

  public void thread47494(int [] tdone, int [] ends){
        S4104=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread47492(int [] tdone, int [] ends){
        S4120=1;
    __start_thread_33 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 285, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_33 >= 300){//sysj\conveyor_controller.sysj line: 285, column: 44
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

  public void thread47491(int [] tdone, int [] ends){
        S4104=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread47489(int [] tdone, int [] ends){
        S4120=1;
    __start_thread_33 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 285, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_33 >= 300){//sysj\conveyor_controller.sysj line: 285, column: 44
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

  public void thread47488(int [] tdone, int [] ends){
        S4104=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread47486(int [] tdone, int [] ends){
        switch(S4066){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(lR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 265, column: 17
          System.out.println("*Rotary - LidLoader Ready*");//sysj\conveyor_controller.sysj line: 266, column: 11
          S4066=0;
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

  public void thread47485(int [] tdone, int [] ends){
        switch(S4063){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(cR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 259, column: 17
          System.out.println("*Rotary - Capper Ready*");//sysj\conveyor_controller.sysj line: 260, column: 11
          S4063=0;
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

  public void thread47484(int [] tdone, int [] ends){
        switch(S4060){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(cvR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 253, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 254, column: 11
          S4060=0;
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

  public void thread47483(int [] tdone, int [] ends){
        switch(S4057){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(fR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 248, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\conveyor_controller.sysj line: 249, column: 11
          S4057=0;
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

  public void thread47482(int [] tdone, int [] ends){
        switch(S5466){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S4067){
          case 0 : 
            thread47483(tdone,ends);
            thread47484(tdone,ends);
            thread47485(tdone,ends);
            thread47486(tdone,ends);
            int biggest47487 = 0;
            if(ends[28]>=biggest47487){
              biggest47487=ends[28];
            }
            if(ends[29]>=biggest47487){
              biggest47487=ends[29];
            }
            if(ends[30]>=biggest47487){
              biggest47487=ends[30];
            }
            if(ends[31]>=biggest47487){
              biggest47487=ends[31];
            }
            if(biggest47487 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest47487 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 269, column: 10
              S4067=1;
              if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 272, column: 18
                S4081=0;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S4067=2;
                thread47488(tdone,ends);
                thread47489(tdone,ends);
                int biggest47490 = 0;
                if(ends[32]>=biggest47490){
                  biggest47490=ends[32];
                }
                if(ends[33]>=biggest47490){
                  biggest47490=ends[33];
                }
                if(biggest47490 == 1){
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                if(biggest47490 == 2){
                  ends[27]=2;
                  ;//sysj\conveyor_controller.sysj line: 284, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
                  S4067=3;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
              }
            }
            break;
          
          case 1 : 
            switch(S4081){
              case 0 : 
                if(!bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 274, column: 20
                  S4081=1;
                  if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 276, column: 23
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 273, column: 13
                    S4067=2;
                    thread47491(tdone,ends);
                    thread47492(tdone,ends);
                    int biggest47493 = 0;
                    if(ends[32]>=biggest47493){
                      biggest47493=ends[32];
                    }
                    if(ends[33]>=biggest47493){
                      biggest47493=ends[33];
                    }
                    if(biggest47493 == 1){
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                    if(biggest47493 == 2){
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 284, column: 12
                      System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
                      S4067=3;
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
                  S4067=2;
                  thread47494(tdone,ends);
                  thread47495(tdone,ends);
                  int biggest47496 = 0;
                  if(ends[32]>=biggest47496){
                    biggest47496=ends[32];
                  }
                  if(ends[33]>=biggest47496){
                    biggest47496=ends[33];
                  }
                  if(biggest47496 == 1){
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  if(biggest47496 == 2){
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 284, column: 12
                    System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
                    S4067=3;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread47497(tdone,ends);
            thread47498(tdone,ends);
            int biggest47499 = 0;
            if(ends[32]>=biggest47499){
              biggest47499=ends[32];
            }
            if(ends[33]>=biggest47499){
              biggest47499=ends[33];
            }
            if(biggest47499 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            if(biggest47499 == 2){
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 284, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
              S4067=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest47499 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
              S4067=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 289, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 290, column: 16
              S4067=4;
              S4223=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 291, column: 13
                rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                S4223=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S4218=0;
                if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 291, column: 13
                  S4218=1;
                  if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                    rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 291, column: 13
                    S4067=5;
                    __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                    if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 244, column: 7
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 244, column: 7
                      S4067=6;
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
            switch(S4223){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 291, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                  S4223=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  switch(S4218){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 291, column: 13
                        S4218=1;
                        if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                          rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 291, column: 13
                          S4067=5;
                          __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                          if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 244, column: 7
                            ends[27]=2;
                            ;//sysj\conveyor_controller.sysj line: 244, column: 7
                            S4067=6;
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
                        S4067=5;
                        __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                        if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 244, column: 7
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 244, column: 7
                          S4067=6;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S4223=1;
                S4223=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 291, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                  S4223=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  S4218=0;
                  if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 291, column: 13
                    S4218=1;
                    if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                      rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 291, column: 13
                      S4067=5;
                      __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                      if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 244, column: 7
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 244, column: 7
                        S4067=6;
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
            if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 244, column: 7
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 244, column: 7
              S4067=6;
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
          
          case 6 : 
            S4067=6;
            i_thread_27 = 0;//sysj\conveyor_controller.sysj line: 294, column: 10
            S4067=7;
            i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 297, column: 12
            if(i_thread_27 > 100){//sysj\conveyor_controller.sysj line: 298, column: 15
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 295, column: 10
              S4067=0;
              thread47500(tdone,ends);
              thread47501(tdone,ends);
              thread47502(tdone,ends);
              thread47503(tdone,ends);
              int biggest47504 = 0;
              if(ends[28]>=biggest47504){
                biggest47504=ends[28];
              }
              if(ends[29]>=biggest47504){
                biggest47504=ends[29];
              }
              if(ends[30]>=biggest47504){
                biggest47504=ends[30];
              }
              if(ends[31]>=biggest47504){
                biggest47504=ends[31];
              }
              if(biggest47504 == 1){
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
          
          case 7 : 
            i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 297, column: 12
            if(i_thread_27 > 100){//sysj\conveyor_controller.sysj line: 298, column: 15
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 295, column: 10
              S4067=0;
              thread47505(tdone,ends);
              thread47506(tdone,ends);
              thread47507(tdone,ends);
              thread47508(tdone,ends);
              int biggest47509 = 0;
              if(ends[28]>=biggest47509){
                biggest47509=ends[28];
              }
              if(ends[29]>=biggest47509){
                biggest47509=ends[29];
              }
              if(ends[30]>=biggest47509){
                biggest47509=ends[30];
              }
              if(ends[31]>=biggest47509){
                biggest47509=ends[31];
              }
              if(biggest47509 == 1){
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

  public void thread47478(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47477(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47476(int [] tdone, int [] ends){
        S6108=1;
    S6082=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
      thread47477(tdone,ends);
      thread47478(tdone,ends);
      int biggest47479 = 0;
      if(ends[55]>=biggest47479){
        biggest47479=ends[55];
      }
      if(ends[56]>=biggest47479){
        biggest47479=ends[56];
      }
      if(biggest47479 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S6082=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread47474(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47473(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47472(int [] tdone, int [] ends){
        S6070=1;
    S6044=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
      thread47473(tdone,ends);
      thread47474(tdone,ends);
      int biggest47475 = 0;
      if(ends[52]>=biggest47475){
        biggest47475=ends[52];
      }
      if(ends[53]>=biggest47475){
        biggest47475=ends[53];
      }
      if(biggest47475 == 1){
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
    else {
      S6044=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread47471(int [] tdone, int [] ends){
        S6110=1;
    thread47472(tdone,ends);
    thread47476(tdone,ends);
    int biggest47480 = 0;
    if(ends[51]>=biggest47480){
      biggest47480=ends[51];
    }
    if(ends[54]>=biggest47480){
      biggest47480=ends[54];
    }
    if(biggest47480 == 1){
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread47469(int [] tdone, int [] ends){
        S6030=1;
    S5974=0;
    S5954=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
      S5954=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S5949=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
        S5949=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 332, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
          else {
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread47468(int [] tdone, int [] ends){
        S5947=1;
    S5891=0;
    S5871=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5871=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S5866=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5866=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread47467(int [] tdone, int [] ends){
        S6032=1;
    thread47468(tdone,ends);
    thread47469(tdone,ends);
    int biggest47470 = 0;
    if(ends[48]>=biggest47470){
      biggest47470=ends[48];
    }
    if(ends[49]>=biggest47470){
      biggest47470=ends[49];
    }
    if(biggest47470 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread47464(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread47463(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread47462(int [] tdone, int [] ends){
        S5862=1;
    S5796=0;
    thread47463(tdone,ends);
    thread47464(tdone,ends);
    int biggest47465 = 0;
    if(ends[45]>=biggest47465){
      biggest47465=ends[45];
    }
    if(ends[46]>=biggest47465){
      biggest47465=ends[46];
    }
    if(biggest47465 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread47460(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread47459(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread47458(int [] tdone, int [] ends){
        S5763=1;
    S5697=0;
    thread47459(tdone,ends);
    thread47460(tdone,ends);
    int biggest47461 = 0;
    if(ends[42]>=biggest47461){
      biggest47461=ends[42];
    }
    if(ends[43]>=biggest47461){
      biggest47461=ends[43];
    }
    if(biggest47461 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread47456(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread47455(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread47454(int [] tdone, int [] ends){
        S5664=1;
    S5598=0;
    thread47455(tdone,ends);
    thread47456(tdone,ends);
    int biggest47457 = 0;
    if(ends[39]>=biggest47457){
      biggest47457=ends[39];
    }
    if(ends[40]>=biggest47457){
      biggest47457=ends[40];
    }
    if(biggest47457 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread47452(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread47451(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread47450(int [] tdone, int [] ends){
        S5565=1;
    S5499=0;
    thread47451(tdone,ends);
    thread47452(tdone,ends);
    int biggest47453 = 0;
    if(ends[36]>=biggest47453){
      biggest47453=ends[36];
    }
    if(ends[37]>=biggest47453){
      biggest47453=ends[37];
    }
    if(biggest47453 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread47449(int [] tdone, int [] ends){
        S5864=1;
    thread47450(tdone,ends);
    thread47454(tdone,ends);
    thread47458(tdone,ends);
    thread47462(tdone,ends);
    int biggest47466 = 0;
    if(ends[35]>=biggest47466){
      biggest47466=ends[35];
    }
    if(ends[38]>=biggest47466){
      biggest47466=ends[38];
    }
    if(ends[41]>=biggest47466){
      biggest47466=ends[41];
    }
    if(ends[44]>=biggest47466){
      biggest47466=ends[44];
    }
    if(biggest47466 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47466 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47466 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47466 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread47447(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47446(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47445(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47444(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47443(int [] tdone, int [] ends){
        S5466=1;
    S4067=0;
    thread47444(tdone,ends);
    thread47445(tdone,ends);
    thread47446(tdone,ends);
    thread47447(tdone,ends);
    int biggest47448 = 0;
    if(ends[28]>=biggest47448){
      biggest47448=ends[28];
    }
    if(ends[29]>=biggest47448){
      biggest47448=ends[29];
    }
    if(ends[30]>=biggest47448){
      biggest47448=ends[30];
    }
    if(ends[31]>=biggest47448){
      biggest47448=ends[31];
    }
    if(biggest47448 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread47439(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47438(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47437(int [] tdone, int [] ends){
        S6108=1;
    S6082=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
      thread47438(tdone,ends);
      thread47439(tdone,ends);
      int biggest47440 = 0;
      if(ends[55]>=biggest47440){
        biggest47440=ends[55];
      }
      if(ends[56]>=biggest47440){
        biggest47440=ends[56];
      }
      if(biggest47440 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S6082=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread47435(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47434(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47433(int [] tdone, int [] ends){
        S6070=1;
    S6044=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
      thread47434(tdone,ends);
      thread47435(tdone,ends);
      int biggest47436 = 0;
      if(ends[52]>=biggest47436){
        biggest47436=ends[52];
      }
      if(ends[53]>=biggest47436){
        biggest47436=ends[53];
      }
      if(biggest47436 == 1){
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
    else {
      S6044=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread47432(int [] tdone, int [] ends){
        S6110=1;
    thread47433(tdone,ends);
    thread47437(tdone,ends);
    int biggest47441 = 0;
    if(ends[51]>=biggest47441){
      biggest47441=ends[51];
    }
    if(ends[54]>=biggest47441){
      biggest47441=ends[54];
    }
    if(biggest47441 == 1){
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread47430(int [] tdone, int [] ends){
        S6030=1;
    S5974=0;
    S5954=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
      S5954=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S5949=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
        S5949=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 332, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
          else {
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread47429(int [] tdone, int [] ends){
        S5947=1;
    S5891=0;
    S5871=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5871=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S5866=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5866=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread47428(int [] tdone, int [] ends){
        S6032=1;
    thread47429(tdone,ends);
    thread47430(tdone,ends);
    int biggest47431 = 0;
    if(ends[48]>=biggest47431){
      biggest47431=ends[48];
    }
    if(ends[49]>=biggest47431){
      biggest47431=ends[49];
    }
    if(biggest47431 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread47425(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread47424(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread47423(int [] tdone, int [] ends){
        S5862=1;
    S5796=0;
    thread47424(tdone,ends);
    thread47425(tdone,ends);
    int biggest47426 = 0;
    if(ends[45]>=biggest47426){
      biggest47426=ends[45];
    }
    if(ends[46]>=biggest47426){
      biggest47426=ends[46];
    }
    if(biggest47426 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread47421(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread47420(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread47419(int [] tdone, int [] ends){
        S5763=1;
    S5697=0;
    thread47420(tdone,ends);
    thread47421(tdone,ends);
    int biggest47422 = 0;
    if(ends[42]>=biggest47422){
      biggest47422=ends[42];
    }
    if(ends[43]>=biggest47422){
      biggest47422=ends[43];
    }
    if(biggest47422 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread47417(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread47416(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread47415(int [] tdone, int [] ends){
        S5664=1;
    S5598=0;
    thread47416(tdone,ends);
    thread47417(tdone,ends);
    int biggest47418 = 0;
    if(ends[39]>=biggest47418){
      biggest47418=ends[39];
    }
    if(ends[40]>=biggest47418){
      biggest47418=ends[40];
    }
    if(biggest47418 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread47413(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread47412(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread47411(int [] tdone, int [] ends){
        S5565=1;
    S5499=0;
    thread47412(tdone,ends);
    thread47413(tdone,ends);
    int biggest47414 = 0;
    if(ends[36]>=biggest47414){
      biggest47414=ends[36];
    }
    if(ends[37]>=biggest47414){
      biggest47414=ends[37];
    }
    if(biggest47414 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread47410(int [] tdone, int [] ends){
        S5864=1;
    thread47411(tdone,ends);
    thread47415(tdone,ends);
    thread47419(tdone,ends);
    thread47423(tdone,ends);
    int biggest47427 = 0;
    if(ends[35]>=biggest47427){
      biggest47427=ends[35];
    }
    if(ends[38]>=biggest47427){
      biggest47427=ends[38];
    }
    if(ends[41]>=biggest47427){
      biggest47427=ends[41];
    }
    if(ends[44]>=biggest47427){
      biggest47427=ends[44];
    }
    if(biggest47427 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47427 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47427 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47427 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread47408(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47407(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47406(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47405(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47404(int [] tdone, int [] ends){
        S5466=1;
    S4067=0;
    thread47405(tdone,ends);
    thread47406(tdone,ends);
    thread47407(tdone,ends);
    thread47408(tdone,ends);
    int biggest47409 = 0;
    if(ends[28]>=biggest47409){
      biggest47409=ends[28];
    }
    if(ends[29]>=biggest47409){
      biggest47409=ends[29];
    }
    if(ends[30]>=biggest47409){
      biggest47409=ends[30];
    }
    if(ends[31]>=biggest47409){
      biggest47409=ends[31];
    }
    if(biggest47409 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread47400(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47399(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47398(int [] tdone, int [] ends){
        S6108=1;
    S6082=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
      thread47399(tdone,ends);
      thread47400(tdone,ends);
      int biggest47401 = 0;
      if(ends[55]>=biggest47401){
        biggest47401=ends[55];
      }
      if(ends[56]>=biggest47401){
        biggest47401=ends[56];
      }
      if(biggest47401 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S6082=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread47396(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47395(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47394(int [] tdone, int [] ends){
        S6070=1;
    S6044=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
      thread47395(tdone,ends);
      thread47396(tdone,ends);
      int biggest47397 = 0;
      if(ends[52]>=biggest47397){
        biggest47397=ends[52];
      }
      if(ends[53]>=biggest47397){
        biggest47397=ends[53];
      }
      if(biggest47397 == 1){
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
    else {
      S6044=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread47393(int [] tdone, int [] ends){
        S6110=1;
    thread47394(tdone,ends);
    thread47398(tdone,ends);
    int biggest47402 = 0;
    if(ends[51]>=biggest47402){
      biggest47402=ends[51];
    }
    if(ends[54]>=biggest47402){
      biggest47402=ends[54];
    }
    if(biggest47402 == 1){
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread47391(int [] tdone, int [] ends){
        S6030=1;
    S5974=0;
    S5954=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
      S5954=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S5949=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
        S5949=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 332, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
          else {
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread47390(int [] tdone, int [] ends){
        S5947=1;
    S5891=0;
    S5871=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5871=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S5866=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5866=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread47389(int [] tdone, int [] ends){
        S6032=1;
    thread47390(tdone,ends);
    thread47391(tdone,ends);
    int biggest47392 = 0;
    if(ends[48]>=biggest47392){
      biggest47392=ends[48];
    }
    if(ends[49]>=biggest47392){
      biggest47392=ends[49];
    }
    if(biggest47392 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread47386(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread47385(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread47384(int [] tdone, int [] ends){
        S5862=1;
    S5796=0;
    thread47385(tdone,ends);
    thread47386(tdone,ends);
    int biggest47387 = 0;
    if(ends[45]>=biggest47387){
      biggest47387=ends[45];
    }
    if(ends[46]>=biggest47387){
      biggest47387=ends[46];
    }
    if(biggest47387 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread47382(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread47381(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread47380(int [] tdone, int [] ends){
        S5763=1;
    S5697=0;
    thread47381(tdone,ends);
    thread47382(tdone,ends);
    int biggest47383 = 0;
    if(ends[42]>=biggest47383){
      biggest47383=ends[42];
    }
    if(ends[43]>=biggest47383){
      biggest47383=ends[43];
    }
    if(biggest47383 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread47378(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread47377(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread47376(int [] tdone, int [] ends){
        S5664=1;
    S5598=0;
    thread47377(tdone,ends);
    thread47378(tdone,ends);
    int biggest47379 = 0;
    if(ends[39]>=biggest47379){
      biggest47379=ends[39];
    }
    if(ends[40]>=biggest47379){
      biggest47379=ends[40];
    }
    if(biggest47379 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread47374(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread47373(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread47372(int [] tdone, int [] ends){
        S5565=1;
    S5499=0;
    thread47373(tdone,ends);
    thread47374(tdone,ends);
    int biggest47375 = 0;
    if(ends[36]>=biggest47375){
      biggest47375=ends[36];
    }
    if(ends[37]>=biggest47375){
      biggest47375=ends[37];
    }
    if(biggest47375 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread47371(int [] tdone, int [] ends){
        S5864=1;
    thread47372(tdone,ends);
    thread47376(tdone,ends);
    thread47380(tdone,ends);
    thread47384(tdone,ends);
    int biggest47388 = 0;
    if(ends[35]>=biggest47388){
      biggest47388=ends[35];
    }
    if(ends[38]>=biggest47388){
      biggest47388=ends[38];
    }
    if(ends[41]>=biggest47388){
      biggest47388=ends[41];
    }
    if(ends[44]>=biggest47388){
      biggest47388=ends[44];
    }
    if(biggest47388 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47388 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47388 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47388 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread47369(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47368(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47367(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47366(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47365(int [] tdone, int [] ends){
        S5466=1;
    S4067=0;
    thread47366(tdone,ends);
    thread47367(tdone,ends);
    thread47368(tdone,ends);
    thread47369(tdone,ends);
    int biggest47370 = 0;
    if(ends[28]>=biggest47370){
      biggest47370=ends[28];
    }
    if(ends[29]>=biggest47370){
      biggest47370=ends[29];
    }
    if(ends[30]>=biggest47370){
      biggest47370=ends[30];
    }
    if(ends[31]>=biggest47370){
      biggest47370=ends[31];
    }
    if(biggest47370 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread47361(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47360(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47359(int [] tdone, int [] ends){
        S6108=1;
    S6082=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
      thread47360(tdone,ends);
      thread47361(tdone,ends);
      int biggest47362 = 0;
      if(ends[55]>=biggest47362){
        biggest47362=ends[55];
      }
      if(ends[56]>=biggest47362){
        biggest47362=ends[56];
      }
      if(biggest47362 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S6082=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread47357(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47356(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47355(int [] tdone, int [] ends){
        S6070=1;
    S6044=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
      thread47356(tdone,ends);
      thread47357(tdone,ends);
      int biggest47358 = 0;
      if(ends[52]>=biggest47358){
        biggest47358=ends[52];
      }
      if(ends[53]>=biggest47358){
        biggest47358=ends[53];
      }
      if(biggest47358 == 1){
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
    else {
      S6044=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread47354(int [] tdone, int [] ends){
        S6110=1;
    thread47355(tdone,ends);
    thread47359(tdone,ends);
    int biggest47363 = 0;
    if(ends[51]>=biggest47363){
      biggest47363=ends[51];
    }
    if(ends[54]>=biggest47363){
      biggest47363=ends[54];
    }
    if(biggest47363 == 1){
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread47352(int [] tdone, int [] ends){
        S6030=1;
    S5974=0;
    S5954=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
      S5954=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S5949=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
        S5949=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 332, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
          else {
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread47351(int [] tdone, int [] ends){
        S5947=1;
    S5891=0;
    S5871=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5871=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S5866=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5866=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread47350(int [] tdone, int [] ends){
        S6032=1;
    thread47351(tdone,ends);
    thread47352(tdone,ends);
    int biggest47353 = 0;
    if(ends[48]>=biggest47353){
      biggest47353=ends[48];
    }
    if(ends[49]>=biggest47353){
      biggest47353=ends[49];
    }
    if(biggest47353 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread47347(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread47346(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread47345(int [] tdone, int [] ends){
        S5862=1;
    S5796=0;
    thread47346(tdone,ends);
    thread47347(tdone,ends);
    int biggest47348 = 0;
    if(ends[45]>=biggest47348){
      biggest47348=ends[45];
    }
    if(ends[46]>=biggest47348){
      biggest47348=ends[46];
    }
    if(biggest47348 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread47343(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread47342(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread47341(int [] tdone, int [] ends){
        S5763=1;
    S5697=0;
    thread47342(tdone,ends);
    thread47343(tdone,ends);
    int biggest47344 = 0;
    if(ends[42]>=biggest47344){
      biggest47344=ends[42];
    }
    if(ends[43]>=biggest47344){
      biggest47344=ends[43];
    }
    if(biggest47344 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread47339(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread47338(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread47337(int [] tdone, int [] ends){
        S5664=1;
    S5598=0;
    thread47338(tdone,ends);
    thread47339(tdone,ends);
    int biggest47340 = 0;
    if(ends[39]>=biggest47340){
      biggest47340=ends[39];
    }
    if(ends[40]>=biggest47340){
      biggest47340=ends[40];
    }
    if(biggest47340 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread47335(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread47334(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread47333(int [] tdone, int [] ends){
        S5565=1;
    S5499=0;
    thread47334(tdone,ends);
    thread47335(tdone,ends);
    int biggest47336 = 0;
    if(ends[36]>=biggest47336){
      biggest47336=ends[36];
    }
    if(ends[37]>=biggest47336){
      biggest47336=ends[37];
    }
    if(biggest47336 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread47332(int [] tdone, int [] ends){
        S5864=1;
    thread47333(tdone,ends);
    thread47337(tdone,ends);
    thread47341(tdone,ends);
    thread47345(tdone,ends);
    int biggest47349 = 0;
    if(ends[35]>=biggest47349){
      biggest47349=ends[35];
    }
    if(ends[38]>=biggest47349){
      biggest47349=ends[38];
    }
    if(ends[41]>=biggest47349){
      biggest47349=ends[41];
    }
    if(ends[44]>=biggest47349){
      biggest47349=ends[44];
    }
    if(biggest47349 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47349 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47349 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47349 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread47330(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47329(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47328(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47327(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47326(int [] tdone, int [] ends){
        S5466=1;
    S4067=0;
    thread47327(tdone,ends);
    thread47328(tdone,ends);
    thread47329(tdone,ends);
    thread47330(tdone,ends);
    int biggest47331 = 0;
    if(ends[28]>=biggest47331){
      biggest47331=ends[28];
    }
    if(ends[29]>=biggest47331){
      biggest47331=ends[29];
    }
    if(ends[30]>=biggest47331){
      biggest47331=ends[30];
    }
    if(ends[31]>=biggest47331){
      biggest47331=ends[31];
    }
    if(biggest47331 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread47322(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47321(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47320(int [] tdone, int [] ends){
        S6108=1;
    S6082=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
      thread47321(tdone,ends);
      thread47322(tdone,ends);
      int biggest47323 = 0;
      if(ends[55]>=biggest47323){
        biggest47323=ends[55];
      }
      if(ends[56]>=biggest47323){
        biggest47323=ends[56];
      }
      if(biggest47323 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S6082=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread47318(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47317(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47316(int [] tdone, int [] ends){
        S6070=1;
    S6044=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
      thread47317(tdone,ends);
      thread47318(tdone,ends);
      int biggest47319 = 0;
      if(ends[52]>=biggest47319){
        biggest47319=ends[52];
      }
      if(ends[53]>=biggest47319){
        biggest47319=ends[53];
      }
      if(biggest47319 == 1){
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
    else {
      S6044=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread47315(int [] tdone, int [] ends){
        S6110=1;
    thread47316(tdone,ends);
    thread47320(tdone,ends);
    int biggest47324 = 0;
    if(ends[51]>=biggest47324){
      biggest47324=ends[51];
    }
    if(ends[54]>=biggest47324){
      biggest47324=ends[54];
    }
    if(biggest47324 == 1){
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread47313(int [] tdone, int [] ends){
        S6030=1;
    S5974=0;
    S5954=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
      S5954=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S5949=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
        S5949=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 332, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
          else {
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread47312(int [] tdone, int [] ends){
        S5947=1;
    S5891=0;
    S5871=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5871=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S5866=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5866=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread47311(int [] tdone, int [] ends){
        S6032=1;
    thread47312(tdone,ends);
    thread47313(tdone,ends);
    int biggest47314 = 0;
    if(ends[48]>=biggest47314){
      biggest47314=ends[48];
    }
    if(ends[49]>=biggest47314){
      biggest47314=ends[49];
    }
    if(biggest47314 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread47308(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread47307(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread47306(int [] tdone, int [] ends){
        S5862=1;
    S5796=0;
    thread47307(tdone,ends);
    thread47308(tdone,ends);
    int biggest47309 = 0;
    if(ends[45]>=biggest47309){
      biggest47309=ends[45];
    }
    if(ends[46]>=biggest47309){
      biggest47309=ends[46];
    }
    if(biggest47309 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread47304(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread47303(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread47302(int [] tdone, int [] ends){
        S5763=1;
    S5697=0;
    thread47303(tdone,ends);
    thread47304(tdone,ends);
    int biggest47305 = 0;
    if(ends[42]>=biggest47305){
      biggest47305=ends[42];
    }
    if(ends[43]>=biggest47305){
      biggest47305=ends[43];
    }
    if(biggest47305 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread47300(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread47299(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread47298(int [] tdone, int [] ends){
        S5664=1;
    S5598=0;
    thread47299(tdone,ends);
    thread47300(tdone,ends);
    int biggest47301 = 0;
    if(ends[39]>=biggest47301){
      biggest47301=ends[39];
    }
    if(ends[40]>=biggest47301){
      biggest47301=ends[40];
    }
    if(biggest47301 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread47296(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread47295(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread47294(int [] tdone, int [] ends){
        S5565=1;
    S5499=0;
    thread47295(tdone,ends);
    thread47296(tdone,ends);
    int biggest47297 = 0;
    if(ends[36]>=biggest47297){
      biggest47297=ends[36];
    }
    if(ends[37]>=biggest47297){
      biggest47297=ends[37];
    }
    if(biggest47297 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread47293(int [] tdone, int [] ends){
        S5864=1;
    thread47294(tdone,ends);
    thread47298(tdone,ends);
    thread47302(tdone,ends);
    thread47306(tdone,ends);
    int biggest47310 = 0;
    if(ends[35]>=biggest47310){
      biggest47310=ends[35];
    }
    if(ends[38]>=biggest47310){
      biggest47310=ends[38];
    }
    if(ends[41]>=biggest47310){
      biggest47310=ends[41];
    }
    if(ends[44]>=biggest47310){
      biggest47310=ends[44];
    }
    if(biggest47310 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47310 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47310 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47310 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread47291(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47290(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47289(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47288(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47287(int [] tdone, int [] ends){
        S5466=1;
    S4067=0;
    thread47288(tdone,ends);
    thread47289(tdone,ends);
    thread47290(tdone,ends);
    thread47291(tdone,ends);
    int biggest47292 = 0;
    if(ends[28]>=biggest47292){
      biggest47292=ends[28];
    }
    if(ends[29]>=biggest47292){
      biggest47292=ends[29];
    }
    if(ends[30]>=biggest47292){
      biggest47292=ends[30];
    }
    if(ends[31]>=biggest47292){
      biggest47292=ends[31];
    }
    if(biggest47292 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread47283(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47282(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47281(int [] tdone, int [] ends){
        S6108=1;
    S6082=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
      thread47282(tdone,ends);
      thread47283(tdone,ends);
      int biggest47284 = 0;
      if(ends[55]>=biggest47284){
        biggest47284=ends[55];
      }
      if(ends[56]>=biggest47284){
        biggest47284=ends[56];
      }
      if(biggest47284 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S6082=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread47279(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47278(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47277(int [] tdone, int [] ends){
        S6070=1;
    S6044=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
      thread47278(tdone,ends);
      thread47279(tdone,ends);
      int biggest47280 = 0;
      if(ends[52]>=biggest47280){
        biggest47280=ends[52];
      }
      if(ends[53]>=biggest47280){
        biggest47280=ends[53];
      }
      if(biggest47280 == 1){
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
    else {
      S6044=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread47276(int [] tdone, int [] ends){
        S6110=1;
    thread47277(tdone,ends);
    thread47281(tdone,ends);
    int biggest47285 = 0;
    if(ends[51]>=biggest47285){
      biggest47285=ends[51];
    }
    if(ends[54]>=biggest47285){
      biggest47285=ends[54];
    }
    if(biggest47285 == 1){
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread47274(int [] tdone, int [] ends){
        S6030=1;
    S5974=0;
    S5954=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
      S5954=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S5949=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
        S5949=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 332, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
          else {
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread47273(int [] tdone, int [] ends){
        S5947=1;
    S5891=0;
    S5871=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5871=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S5866=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5866=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread47272(int [] tdone, int [] ends){
        S6032=1;
    thread47273(tdone,ends);
    thread47274(tdone,ends);
    int biggest47275 = 0;
    if(ends[48]>=biggest47275){
      biggest47275=ends[48];
    }
    if(ends[49]>=biggest47275){
      biggest47275=ends[49];
    }
    if(biggest47275 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread47269(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread47268(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread47267(int [] tdone, int [] ends){
        S5862=1;
    S5796=0;
    thread47268(tdone,ends);
    thread47269(tdone,ends);
    int biggest47270 = 0;
    if(ends[45]>=biggest47270){
      biggest47270=ends[45];
    }
    if(ends[46]>=biggest47270){
      biggest47270=ends[46];
    }
    if(biggest47270 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread47265(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread47264(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread47263(int [] tdone, int [] ends){
        S5763=1;
    S5697=0;
    thread47264(tdone,ends);
    thread47265(tdone,ends);
    int biggest47266 = 0;
    if(ends[42]>=biggest47266){
      biggest47266=ends[42];
    }
    if(ends[43]>=biggest47266){
      biggest47266=ends[43];
    }
    if(biggest47266 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread47261(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread47260(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread47259(int [] tdone, int [] ends){
        S5664=1;
    S5598=0;
    thread47260(tdone,ends);
    thread47261(tdone,ends);
    int biggest47262 = 0;
    if(ends[39]>=biggest47262){
      biggest47262=ends[39];
    }
    if(ends[40]>=biggest47262){
      biggest47262=ends[40];
    }
    if(biggest47262 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread47257(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread47256(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread47255(int [] tdone, int [] ends){
        S5565=1;
    S5499=0;
    thread47256(tdone,ends);
    thread47257(tdone,ends);
    int biggest47258 = 0;
    if(ends[36]>=biggest47258){
      biggest47258=ends[36];
    }
    if(ends[37]>=biggest47258){
      biggest47258=ends[37];
    }
    if(biggest47258 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread47254(int [] tdone, int [] ends){
        S5864=1;
    thread47255(tdone,ends);
    thread47259(tdone,ends);
    thread47263(tdone,ends);
    thread47267(tdone,ends);
    int biggest47271 = 0;
    if(ends[35]>=biggest47271){
      biggest47271=ends[35];
    }
    if(ends[38]>=biggest47271){
      biggest47271=ends[38];
    }
    if(ends[41]>=biggest47271){
      biggest47271=ends[41];
    }
    if(ends[44]>=biggest47271){
      biggest47271=ends[44];
    }
    if(biggest47271 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47271 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47271 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47271 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread47252(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47251(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47250(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47249(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47248(int [] tdone, int [] ends){
        S5466=1;
    S4067=0;
    thread47249(tdone,ends);
    thread47250(tdone,ends);
    thread47251(tdone,ends);
    thread47252(tdone,ends);
    int biggest47253 = 0;
    if(ends[28]>=biggest47253){
      biggest47253=ends[28];
    }
    if(ends[29]>=biggest47253){
      biggest47253=ends[29];
    }
    if(ends[30]>=biggest47253){
      biggest47253=ends[30];
    }
    if(ends[31]>=biggest47253){
      biggest47253=ends[31];
    }
    if(biggest47253 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread47244(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47243(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47242(int [] tdone, int [] ends){
        S6108=1;
    S6082=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
      thread47243(tdone,ends);
      thread47244(tdone,ends);
      int biggest47245 = 0;
      if(ends[55]>=biggest47245){
        biggest47245=ends[55];
      }
      if(ends[56]>=biggest47245){
        biggest47245=ends[56];
      }
      if(biggest47245 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S6082=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread47240(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47239(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47238(int [] tdone, int [] ends){
        S6070=1;
    S6044=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
      thread47239(tdone,ends);
      thread47240(tdone,ends);
      int biggest47241 = 0;
      if(ends[52]>=biggest47241){
        biggest47241=ends[52];
      }
      if(ends[53]>=biggest47241){
        biggest47241=ends[53];
      }
      if(biggest47241 == 1){
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
    else {
      S6044=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread47237(int [] tdone, int [] ends){
        S6110=1;
    thread47238(tdone,ends);
    thread47242(tdone,ends);
    int biggest47246 = 0;
    if(ends[51]>=biggest47246){
      biggest47246=ends[51];
    }
    if(ends[54]>=biggest47246){
      biggest47246=ends[54];
    }
    if(biggest47246 == 1){
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread47235(int [] tdone, int [] ends){
        S6030=1;
    S5974=0;
    S5954=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
      S5954=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S5949=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
        S5949=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 332, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
          else {
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread47234(int [] tdone, int [] ends){
        S5947=1;
    S5891=0;
    S5871=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5871=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S5866=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5866=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread47233(int [] tdone, int [] ends){
        S6032=1;
    thread47234(tdone,ends);
    thread47235(tdone,ends);
    int biggest47236 = 0;
    if(ends[48]>=biggest47236){
      biggest47236=ends[48];
    }
    if(ends[49]>=biggest47236){
      biggest47236=ends[49];
    }
    if(biggest47236 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread47230(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread47229(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread47228(int [] tdone, int [] ends){
        S5862=1;
    S5796=0;
    thread47229(tdone,ends);
    thread47230(tdone,ends);
    int biggest47231 = 0;
    if(ends[45]>=biggest47231){
      biggest47231=ends[45];
    }
    if(ends[46]>=biggest47231){
      biggest47231=ends[46];
    }
    if(biggest47231 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread47226(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread47225(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread47224(int [] tdone, int [] ends){
        S5763=1;
    S5697=0;
    thread47225(tdone,ends);
    thread47226(tdone,ends);
    int biggest47227 = 0;
    if(ends[42]>=biggest47227){
      biggest47227=ends[42];
    }
    if(ends[43]>=biggest47227){
      biggest47227=ends[43];
    }
    if(biggest47227 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread47222(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread47221(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread47220(int [] tdone, int [] ends){
        S5664=1;
    S5598=0;
    thread47221(tdone,ends);
    thread47222(tdone,ends);
    int biggest47223 = 0;
    if(ends[39]>=biggest47223){
      biggest47223=ends[39];
    }
    if(ends[40]>=biggest47223){
      biggest47223=ends[40];
    }
    if(biggest47223 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread47218(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread47217(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread47216(int [] tdone, int [] ends){
        S5565=1;
    S5499=0;
    thread47217(tdone,ends);
    thread47218(tdone,ends);
    int biggest47219 = 0;
    if(ends[36]>=biggest47219){
      biggest47219=ends[36];
    }
    if(ends[37]>=biggest47219){
      biggest47219=ends[37];
    }
    if(biggest47219 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread47215(int [] tdone, int [] ends){
        S5864=1;
    thread47216(tdone,ends);
    thread47220(tdone,ends);
    thread47224(tdone,ends);
    thread47228(tdone,ends);
    int biggest47232 = 0;
    if(ends[35]>=biggest47232){
      biggest47232=ends[35];
    }
    if(ends[38]>=biggest47232){
      biggest47232=ends[38];
    }
    if(ends[41]>=biggest47232){
      biggest47232=ends[41];
    }
    if(ends[44]>=biggest47232){
      biggest47232=ends[44];
    }
    if(biggest47232 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47232 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47232 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47232 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread47213(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47212(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47211(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47210(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47209(int [] tdone, int [] ends){
        S5466=1;
    S4067=0;
    thread47210(tdone,ends);
    thread47211(tdone,ends);
    thread47212(tdone,ends);
    thread47213(tdone,ends);
    int biggest47214 = 0;
    if(ends[28]>=biggest47214){
      biggest47214=ends[28];
    }
    if(ends[29]>=biggest47214){
      biggest47214=ends[29];
    }
    if(ends[30]>=biggest47214){
      biggest47214=ends[30];
    }
    if(ends[31]>=biggest47214){
      biggest47214=ends[31];
    }
    if(biggest47214 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread47205(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47204(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47203(int [] tdone, int [] ends){
        S6108=1;
    S6082=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
      thread47204(tdone,ends);
      thread47205(tdone,ends);
      int biggest47206 = 0;
      if(ends[55]>=biggest47206){
        biggest47206=ends[55];
      }
      if(ends[56]>=biggest47206){
        biggest47206=ends[56];
      }
      if(biggest47206 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S6082=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread47201(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47200(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47199(int [] tdone, int [] ends){
        S6070=1;
    S6044=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
      thread47200(tdone,ends);
      thread47201(tdone,ends);
      int biggest47202 = 0;
      if(ends[52]>=biggest47202){
        biggest47202=ends[52];
      }
      if(ends[53]>=biggest47202){
        biggest47202=ends[53];
      }
      if(biggest47202 == 1){
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
    else {
      S6044=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread47198(int [] tdone, int [] ends){
        S6110=1;
    thread47199(tdone,ends);
    thread47203(tdone,ends);
    int biggest47207 = 0;
    if(ends[51]>=biggest47207){
      biggest47207=ends[51];
    }
    if(ends[54]>=biggest47207){
      biggest47207=ends[54];
    }
    if(biggest47207 == 1){
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread47196(int [] tdone, int [] ends){
        S6030=1;
    S5974=0;
    S5954=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
      S5954=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S5949=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
        S5949=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 332, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
          else {
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread47195(int [] tdone, int [] ends){
        S5947=1;
    S5891=0;
    S5871=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5871=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S5866=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5866=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread47194(int [] tdone, int [] ends){
        S6032=1;
    thread47195(tdone,ends);
    thread47196(tdone,ends);
    int biggest47197 = 0;
    if(ends[48]>=biggest47197){
      biggest47197=ends[48];
    }
    if(ends[49]>=biggest47197){
      biggest47197=ends[49];
    }
    if(biggest47197 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread47191(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread47190(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread47189(int [] tdone, int [] ends){
        S5862=1;
    S5796=0;
    thread47190(tdone,ends);
    thread47191(tdone,ends);
    int biggest47192 = 0;
    if(ends[45]>=biggest47192){
      biggest47192=ends[45];
    }
    if(ends[46]>=biggest47192){
      biggest47192=ends[46];
    }
    if(biggest47192 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread47187(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread47186(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread47185(int [] tdone, int [] ends){
        S5763=1;
    S5697=0;
    thread47186(tdone,ends);
    thread47187(tdone,ends);
    int biggest47188 = 0;
    if(ends[42]>=biggest47188){
      biggest47188=ends[42];
    }
    if(ends[43]>=biggest47188){
      biggest47188=ends[43];
    }
    if(biggest47188 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread47183(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread47182(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread47181(int [] tdone, int [] ends){
        S5664=1;
    S5598=0;
    thread47182(tdone,ends);
    thread47183(tdone,ends);
    int biggest47184 = 0;
    if(ends[39]>=biggest47184){
      biggest47184=ends[39];
    }
    if(ends[40]>=biggest47184){
      biggest47184=ends[40];
    }
    if(biggest47184 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread47179(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread47178(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread47177(int [] tdone, int [] ends){
        S5565=1;
    S5499=0;
    thread47178(tdone,ends);
    thread47179(tdone,ends);
    int biggest47180 = 0;
    if(ends[36]>=biggest47180){
      biggest47180=ends[36];
    }
    if(ends[37]>=biggest47180){
      biggest47180=ends[37];
    }
    if(biggest47180 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread47176(int [] tdone, int [] ends){
        S5864=1;
    thread47177(tdone,ends);
    thread47181(tdone,ends);
    thread47185(tdone,ends);
    thread47189(tdone,ends);
    int biggest47193 = 0;
    if(ends[35]>=biggest47193){
      biggest47193=ends[35];
    }
    if(ends[38]>=biggest47193){
      biggest47193=ends[38];
    }
    if(ends[41]>=biggest47193){
      biggest47193=ends[41];
    }
    if(ends[44]>=biggest47193){
      biggest47193=ends[44];
    }
    if(biggest47193 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47193 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47193 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47193 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread47174(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47173(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47172(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47171(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47170(int [] tdone, int [] ends){
        S5466=1;
    S4067=0;
    thread47171(tdone,ends);
    thread47172(tdone,ends);
    thread47173(tdone,ends);
    thread47174(tdone,ends);
    int biggest47175 = 0;
    if(ends[28]>=biggest47175){
      biggest47175=ends[28];
    }
    if(ends[29]>=biggest47175){
      biggest47175=ends[29];
    }
    if(ends[30]>=biggest47175){
      biggest47175=ends[30];
    }
    if(ends[31]>=biggest47175){
      biggest47175=ends[31];
    }
    if(biggest47175 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread47166(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47165(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47164(int [] tdone, int [] ends){
        S6108=1;
    S6082=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
      thread47165(tdone,ends);
      thread47166(tdone,ends);
      int biggest47167 = 0;
      if(ends[55]>=biggest47167){
        biggest47167=ends[55];
      }
      if(ends[56]>=biggest47167){
        biggest47167=ends[56];
      }
      if(biggest47167 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S6082=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread47162(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47161(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47160(int [] tdone, int [] ends){
        S6070=1;
    S6044=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
      thread47161(tdone,ends);
      thread47162(tdone,ends);
      int biggest47163 = 0;
      if(ends[52]>=biggest47163){
        biggest47163=ends[52];
      }
      if(ends[53]>=biggest47163){
        biggest47163=ends[53];
      }
      if(biggest47163 == 1){
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
    else {
      S6044=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread47159(int [] tdone, int [] ends){
        S6110=1;
    thread47160(tdone,ends);
    thread47164(tdone,ends);
    int biggest47168 = 0;
    if(ends[51]>=biggest47168){
      biggest47168=ends[51];
    }
    if(ends[54]>=biggest47168){
      biggest47168=ends[54];
    }
    if(biggest47168 == 1){
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread47157(int [] tdone, int [] ends){
        S6030=1;
    S5974=0;
    S5954=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
      S5954=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S5949=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
        S5949=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 332, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
          else {
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread47156(int [] tdone, int [] ends){
        S5947=1;
    S5891=0;
    S5871=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5871=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S5866=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5866=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread47155(int [] tdone, int [] ends){
        S6032=1;
    thread47156(tdone,ends);
    thread47157(tdone,ends);
    int biggest47158 = 0;
    if(ends[48]>=biggest47158){
      biggest47158=ends[48];
    }
    if(ends[49]>=biggest47158){
      biggest47158=ends[49];
    }
    if(biggest47158 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread47152(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread47151(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread47150(int [] tdone, int [] ends){
        S5862=1;
    S5796=0;
    thread47151(tdone,ends);
    thread47152(tdone,ends);
    int biggest47153 = 0;
    if(ends[45]>=biggest47153){
      biggest47153=ends[45];
    }
    if(ends[46]>=biggest47153){
      biggest47153=ends[46];
    }
    if(biggest47153 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread47148(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread47147(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread47146(int [] tdone, int [] ends){
        S5763=1;
    S5697=0;
    thread47147(tdone,ends);
    thread47148(tdone,ends);
    int biggest47149 = 0;
    if(ends[42]>=biggest47149){
      biggest47149=ends[42];
    }
    if(ends[43]>=biggest47149){
      biggest47149=ends[43];
    }
    if(biggest47149 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread47144(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread47143(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread47142(int [] tdone, int [] ends){
        S5664=1;
    S5598=0;
    thread47143(tdone,ends);
    thread47144(tdone,ends);
    int biggest47145 = 0;
    if(ends[39]>=biggest47145){
      biggest47145=ends[39];
    }
    if(ends[40]>=biggest47145){
      biggest47145=ends[40];
    }
    if(biggest47145 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread47140(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread47139(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread47138(int [] tdone, int [] ends){
        S5565=1;
    S5499=0;
    thread47139(tdone,ends);
    thread47140(tdone,ends);
    int biggest47141 = 0;
    if(ends[36]>=biggest47141){
      biggest47141=ends[36];
    }
    if(ends[37]>=biggest47141){
      biggest47141=ends[37];
    }
    if(biggest47141 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread47137(int [] tdone, int [] ends){
        S5864=1;
    thread47138(tdone,ends);
    thread47142(tdone,ends);
    thread47146(tdone,ends);
    thread47150(tdone,ends);
    int biggest47154 = 0;
    if(ends[35]>=biggest47154){
      biggest47154=ends[35];
    }
    if(ends[38]>=biggest47154){
      biggest47154=ends[38];
    }
    if(ends[41]>=biggest47154){
      biggest47154=ends[41];
    }
    if(ends[44]>=biggest47154){
      biggest47154=ends[44];
    }
    if(biggest47154 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47154 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47154 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47154 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread47135(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47134(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47133(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47132(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47131(int [] tdone, int [] ends){
        S5466=1;
    S4067=0;
    thread47132(tdone,ends);
    thread47133(tdone,ends);
    thread47134(tdone,ends);
    thread47135(tdone,ends);
    int biggest47136 = 0;
    if(ends[28]>=biggest47136){
      biggest47136=ends[28];
    }
    if(ends[29]>=biggest47136){
      biggest47136=ends[29];
    }
    if(ends[30]>=biggest47136){
      biggest47136=ends[30];
    }
    if(ends[31]>=biggest47136){
      biggest47136=ends[31];
    }
    if(biggest47136 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread47127(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47126(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47125(int [] tdone, int [] ends){
        S6108=1;
    S6082=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
      thread47126(tdone,ends);
      thread47127(tdone,ends);
      int biggest47128 = 0;
      if(ends[55]>=biggest47128){
        biggest47128=ends[55];
      }
      if(ends[56]>=biggest47128){
        biggest47128=ends[56];
      }
      if(biggest47128 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S6082=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread47123(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47122(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47121(int [] tdone, int [] ends){
        S6070=1;
    S6044=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
      thread47122(tdone,ends);
      thread47123(tdone,ends);
      int biggest47124 = 0;
      if(ends[52]>=biggest47124){
        biggest47124=ends[52];
      }
      if(ends[53]>=biggest47124){
        biggest47124=ends[53];
      }
      if(biggest47124 == 1){
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
    else {
      S6044=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread47120(int [] tdone, int [] ends){
        S6110=1;
    thread47121(tdone,ends);
    thread47125(tdone,ends);
    int biggest47129 = 0;
    if(ends[51]>=biggest47129){
      biggest47129=ends[51];
    }
    if(ends[54]>=biggest47129){
      biggest47129=ends[54];
    }
    if(biggest47129 == 1){
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread47118(int [] tdone, int [] ends){
        S6030=1;
    S5974=0;
    S5954=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
      S5954=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S5949=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
        S5949=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 332, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
          else {
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread47117(int [] tdone, int [] ends){
        S5947=1;
    S5891=0;
    S5871=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5871=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S5866=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5866=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread47116(int [] tdone, int [] ends){
        S6032=1;
    thread47117(tdone,ends);
    thread47118(tdone,ends);
    int biggest47119 = 0;
    if(ends[48]>=biggest47119){
      biggest47119=ends[48];
    }
    if(ends[49]>=biggest47119){
      biggest47119=ends[49];
    }
    if(biggest47119 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread47113(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread47112(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread47111(int [] tdone, int [] ends){
        S5862=1;
    S5796=0;
    thread47112(tdone,ends);
    thread47113(tdone,ends);
    int biggest47114 = 0;
    if(ends[45]>=biggest47114){
      biggest47114=ends[45];
    }
    if(ends[46]>=biggest47114){
      biggest47114=ends[46];
    }
    if(biggest47114 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread47109(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread47108(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread47107(int [] tdone, int [] ends){
        S5763=1;
    S5697=0;
    thread47108(tdone,ends);
    thread47109(tdone,ends);
    int biggest47110 = 0;
    if(ends[42]>=biggest47110){
      biggest47110=ends[42];
    }
    if(ends[43]>=biggest47110){
      biggest47110=ends[43];
    }
    if(biggest47110 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread47105(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread47104(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread47103(int [] tdone, int [] ends){
        S5664=1;
    S5598=0;
    thread47104(tdone,ends);
    thread47105(tdone,ends);
    int biggest47106 = 0;
    if(ends[39]>=biggest47106){
      biggest47106=ends[39];
    }
    if(ends[40]>=biggest47106){
      biggest47106=ends[40];
    }
    if(biggest47106 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread47101(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread47100(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread47099(int [] tdone, int [] ends){
        S5565=1;
    S5499=0;
    thread47100(tdone,ends);
    thread47101(tdone,ends);
    int biggest47102 = 0;
    if(ends[36]>=biggest47102){
      biggest47102=ends[36];
    }
    if(ends[37]>=biggest47102){
      biggest47102=ends[37];
    }
    if(biggest47102 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread47098(int [] tdone, int [] ends){
        S5864=1;
    thread47099(tdone,ends);
    thread47103(tdone,ends);
    thread47107(tdone,ends);
    thread47111(tdone,ends);
    int biggest47115 = 0;
    if(ends[35]>=biggest47115){
      biggest47115=ends[35];
    }
    if(ends[38]>=biggest47115){
      biggest47115=ends[38];
    }
    if(ends[41]>=biggest47115){
      biggest47115=ends[41];
    }
    if(ends[44]>=biggest47115){
      biggest47115=ends[44];
    }
    if(biggest47115 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47115 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47115 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47115 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread47096(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47095(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47094(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47093(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47092(int [] tdone, int [] ends){
        S5466=1;
    S4067=0;
    thread47093(tdone,ends);
    thread47094(tdone,ends);
    thread47095(tdone,ends);
    thread47096(tdone,ends);
    int biggest47097 = 0;
    if(ends[28]>=biggest47097){
      biggest47097=ends[28];
    }
    if(ends[29]>=biggest47097){
      biggest47097=ends[29];
    }
    if(ends[30]>=biggest47097){
      biggest47097=ends[30];
    }
    if(ends[31]>=biggest47097){
      biggest47097=ends[31];
    }
    if(biggest47097 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread47088(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47087(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47086(int [] tdone, int [] ends){
        S6108=1;
    S6082=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
      thread47087(tdone,ends);
      thread47088(tdone,ends);
      int biggest47089 = 0;
      if(ends[55]>=biggest47089){
        biggest47089=ends[55];
      }
      if(ends[56]>=biggest47089){
        biggest47089=ends[56];
      }
      if(biggest47089 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S6082=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread47084(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47083(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47082(int [] tdone, int [] ends){
        S6070=1;
    S6044=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
      thread47083(tdone,ends);
      thread47084(tdone,ends);
      int biggest47085 = 0;
      if(ends[52]>=biggest47085){
        biggest47085=ends[52];
      }
      if(ends[53]>=biggest47085){
        biggest47085=ends[53];
      }
      if(biggest47085 == 1){
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
    else {
      S6044=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread47081(int [] tdone, int [] ends){
        S6110=1;
    thread47082(tdone,ends);
    thread47086(tdone,ends);
    int biggest47090 = 0;
    if(ends[51]>=biggest47090){
      biggest47090=ends[51];
    }
    if(ends[54]>=biggest47090){
      biggest47090=ends[54];
    }
    if(biggest47090 == 1){
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread47079(int [] tdone, int [] ends){
        S6030=1;
    S5974=0;
    S5954=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
      S5954=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S5949=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
        S5949=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 332, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
          else {
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread47078(int [] tdone, int [] ends){
        S5947=1;
    S5891=0;
    S5871=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5871=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S5866=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5866=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread47077(int [] tdone, int [] ends){
        S6032=1;
    thread47078(tdone,ends);
    thread47079(tdone,ends);
    int biggest47080 = 0;
    if(ends[48]>=biggest47080){
      biggest47080=ends[48];
    }
    if(ends[49]>=biggest47080){
      biggest47080=ends[49];
    }
    if(biggest47080 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread47074(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread47073(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread47072(int [] tdone, int [] ends){
        S5862=1;
    S5796=0;
    thread47073(tdone,ends);
    thread47074(tdone,ends);
    int biggest47075 = 0;
    if(ends[45]>=biggest47075){
      biggest47075=ends[45];
    }
    if(ends[46]>=biggest47075){
      biggest47075=ends[46];
    }
    if(biggest47075 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread47070(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread47069(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread47068(int [] tdone, int [] ends){
        S5763=1;
    S5697=0;
    thread47069(tdone,ends);
    thread47070(tdone,ends);
    int biggest47071 = 0;
    if(ends[42]>=biggest47071){
      biggest47071=ends[42];
    }
    if(ends[43]>=biggest47071){
      biggest47071=ends[43];
    }
    if(biggest47071 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread47066(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread47065(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread47064(int [] tdone, int [] ends){
        S5664=1;
    S5598=0;
    thread47065(tdone,ends);
    thread47066(tdone,ends);
    int biggest47067 = 0;
    if(ends[39]>=biggest47067){
      biggest47067=ends[39];
    }
    if(ends[40]>=biggest47067){
      biggest47067=ends[40];
    }
    if(biggest47067 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread47062(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread47061(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread47060(int [] tdone, int [] ends){
        S5565=1;
    S5499=0;
    thread47061(tdone,ends);
    thread47062(tdone,ends);
    int biggest47063 = 0;
    if(ends[36]>=biggest47063){
      biggest47063=ends[36];
    }
    if(ends[37]>=biggest47063){
      biggest47063=ends[37];
    }
    if(biggest47063 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread47059(int [] tdone, int [] ends){
        S5864=1;
    thread47060(tdone,ends);
    thread47064(tdone,ends);
    thread47068(tdone,ends);
    thread47072(tdone,ends);
    int biggest47076 = 0;
    if(ends[35]>=biggest47076){
      biggest47076=ends[35];
    }
    if(ends[38]>=biggest47076){
      biggest47076=ends[38];
    }
    if(ends[41]>=biggest47076){
      biggest47076=ends[41];
    }
    if(ends[44]>=biggest47076){
      biggest47076=ends[44];
    }
    if(biggest47076 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47076 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47076 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47076 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread47057(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47056(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47055(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47054(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47053(int [] tdone, int [] ends){
        S5466=1;
    S4067=0;
    thread47054(tdone,ends);
    thread47055(tdone,ends);
    thread47056(tdone,ends);
    thread47057(tdone,ends);
    int biggest47058 = 0;
    if(ends[28]>=biggest47058){
      biggest47058=ends[28];
    }
    if(ends[29]>=biggest47058){
      biggest47058=ends[29];
    }
    if(ends[30]>=biggest47058){
      biggest47058=ends[30];
    }
    if(ends[31]>=biggest47058){
      biggest47058=ends[31];
    }
    if(biggest47058 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread47049(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47048(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47047(int [] tdone, int [] ends){
        S6108=1;
    S6082=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
      thread47048(tdone,ends);
      thread47049(tdone,ends);
      int biggest47050 = 0;
      if(ends[55]>=biggest47050){
        biggest47050=ends[55];
      }
      if(ends[56]>=biggest47050){
        biggest47050=ends[56];
      }
      if(biggest47050 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S6082=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread47045(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47044(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47043(int [] tdone, int [] ends){
        S6070=1;
    S6044=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
      thread47044(tdone,ends);
      thread47045(tdone,ends);
      int biggest47046 = 0;
      if(ends[52]>=biggest47046){
        biggest47046=ends[52];
      }
      if(ends[53]>=biggest47046){
        biggest47046=ends[53];
      }
      if(biggest47046 == 1){
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
    else {
      S6044=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread47042(int [] tdone, int [] ends){
        S6110=1;
    thread47043(tdone,ends);
    thread47047(tdone,ends);
    int biggest47051 = 0;
    if(ends[51]>=biggest47051){
      biggest47051=ends[51];
    }
    if(ends[54]>=biggest47051){
      biggest47051=ends[54];
    }
    if(biggest47051 == 1){
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread47040(int [] tdone, int [] ends){
        S6030=1;
    S5974=0;
    S5954=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
      S5954=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S5949=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
        S5949=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 332, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
          else {
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread47039(int [] tdone, int [] ends){
        S5947=1;
    S5891=0;
    S5871=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5871=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S5866=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5866=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread47038(int [] tdone, int [] ends){
        S6032=1;
    thread47039(tdone,ends);
    thread47040(tdone,ends);
    int biggest47041 = 0;
    if(ends[48]>=biggest47041){
      biggest47041=ends[48];
    }
    if(ends[49]>=biggest47041){
      biggest47041=ends[49];
    }
    if(biggest47041 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread47035(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread47034(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread47033(int [] tdone, int [] ends){
        S5862=1;
    S5796=0;
    thread47034(tdone,ends);
    thread47035(tdone,ends);
    int biggest47036 = 0;
    if(ends[45]>=biggest47036){
      biggest47036=ends[45];
    }
    if(ends[46]>=biggest47036){
      biggest47036=ends[46];
    }
    if(biggest47036 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread47031(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread47030(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread47029(int [] tdone, int [] ends){
        S5763=1;
    S5697=0;
    thread47030(tdone,ends);
    thread47031(tdone,ends);
    int biggest47032 = 0;
    if(ends[42]>=biggest47032){
      biggest47032=ends[42];
    }
    if(ends[43]>=biggest47032){
      biggest47032=ends[43];
    }
    if(biggest47032 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread47027(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread47026(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread47025(int [] tdone, int [] ends){
        S5664=1;
    S5598=0;
    thread47026(tdone,ends);
    thread47027(tdone,ends);
    int biggest47028 = 0;
    if(ends[39]>=biggest47028){
      biggest47028=ends[39];
    }
    if(ends[40]>=biggest47028){
      biggest47028=ends[40];
    }
    if(biggest47028 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread47023(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread47022(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread47021(int [] tdone, int [] ends){
        S5565=1;
    S5499=0;
    thread47022(tdone,ends);
    thread47023(tdone,ends);
    int biggest47024 = 0;
    if(ends[36]>=biggest47024){
      biggest47024=ends[36];
    }
    if(ends[37]>=biggest47024){
      biggest47024=ends[37];
    }
    if(biggest47024 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread47020(int [] tdone, int [] ends){
        S5864=1;
    thread47021(tdone,ends);
    thread47025(tdone,ends);
    thread47029(tdone,ends);
    thread47033(tdone,ends);
    int biggest47037 = 0;
    if(ends[35]>=biggest47037){
      biggest47037=ends[35];
    }
    if(ends[38]>=biggest47037){
      biggest47037=ends[38];
    }
    if(ends[41]>=biggest47037){
      biggest47037=ends[41];
    }
    if(ends[44]>=biggest47037){
      biggest47037=ends[44];
    }
    if(biggest47037 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47037 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47037 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest47037 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread47018(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread47017(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread47016(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread47015(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread47014(int [] tdone, int [] ends){
        S5466=1;
    S4067=0;
    thread47015(tdone,ends);
    thread47016(tdone,ends);
    thread47017(tdone,ends);
    thread47018(tdone,ends);
    int biggest47019 = 0;
    if(ends[28]>=biggest47019){
      biggest47019=ends[28];
    }
    if(ends[29]>=biggest47019){
      biggest47019=ends[29];
    }
    if(ends[30]>=biggest47019){
      biggest47019=ends[30];
    }
    if(ends[31]>=biggest47019){
      biggest47019=ends[31];
    }
    if(biggest47019 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread47010(int [] tdone, int [] ends){
        S6078=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread47009(int [] tdone, int [] ends){
        S6075=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread47008(int [] tdone, int [] ends){
        S6108=1;
    S6082=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 21
      thread47009(tdone,ends);
      thread47010(tdone,ends);
      int biggest47011 = 0;
      if(ends[55]>=biggest47011){
        biggest47011=ends[55];
      }
      if(ends[56]>=biggest47011){
        biggest47011=ends[56];
      }
      if(biggest47011 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S6082=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread47006(int [] tdone, int [] ends){
        S6040=1;
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread47005(int [] tdone, int [] ends){
        S6037=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread47004(int [] tdone, int [] ends){
        S6070=1;
    S6044=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 21
      thread47005(tdone,ends);
      thread47006(tdone,ends);
      int biggest47007 = 0;
      if(ends[52]>=biggest47007){
        biggest47007=ends[52];
      }
      if(ends[53]>=biggest47007){
        biggest47007=ends[53];
      }
      if(biggest47007 == 1){
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
    else {
      S6044=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread47003(int [] tdone, int [] ends){
        S6110=1;
    thread47004(tdone,ends);
    thread47008(tdone,ends);
    int biggest47012 = 0;
    if(ends[51]>=biggest47012){
      biggest47012=ends[51];
    }
    if(ends[54]>=biggest47012){
      biggest47012=ends[54];
    }
    if(biggest47012 == 1){
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread47001(int [] tdone, int [] ends){
        S6030=1;
    S5974=0;
    S5954=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 332, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
      S5954=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S5949=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 332, column: 8
        S5949=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 332, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 332, column: 8
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 332, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 333, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 334, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
          else {
            S5974=1;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
          }
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread47000(int [] tdone, int [] ends){
        S5947=1;
    S5891=0;
    S5871=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5871=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S5866=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5866=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S5891=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread46999(int [] tdone, int [] ends){
        S6032=1;
    thread47000(tdone,ends);
    thread47001(tdone,ends);
    int biggest47002 = 0;
    if(ends[48]>=biggest47002){
      biggest47002=ends[48];
    }
    if(ends[49]>=biggest47002){
      biggest47002=ends[49];
    }
    if(biggest47002 == 1){
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread46996(int [] tdone, int [] ends){
        S5794=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5794=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread46995(int [] tdone, int [] ends){
        S5788=1;
    S5787=0;
    S5771=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5771=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5766=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5766=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5787=1;
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

  public void thread46994(int [] tdone, int [] ends){
        S5862=1;
    S5796=0;
    thread46995(tdone,ends);
    thread46996(tdone,ends);
    int biggest46997 = 0;
    if(ends[45]>=biggest46997){
      biggest46997=ends[45];
    }
    if(ends[46]>=biggest46997){
      biggest46997=ends[46];
    }
    if(biggest46997 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread46992(int [] tdone, int [] ends){
        S5695=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5695=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread46991(int [] tdone, int [] ends){
        S5689=1;
    S5688=0;
    S5672=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5672=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5667=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5667=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5688=1;
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

  public void thread46990(int [] tdone, int [] ends){
        S5763=1;
    S5697=0;
    thread46991(tdone,ends);
    thread46992(tdone,ends);
    int biggest46993 = 0;
    if(ends[42]>=biggest46993){
      biggest46993=ends[42];
    }
    if(ends[43]>=biggest46993){
      biggest46993=ends[43];
    }
    if(biggest46993 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread46988(int [] tdone, int [] ends){
        S5596=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5596=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread46987(int [] tdone, int [] ends){
        S5590=1;
    S5589=0;
    S5573=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5573=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5568=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5568=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5589=1;
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

  public void thread46986(int [] tdone, int [] ends){
        S5664=1;
    S5598=0;
    thread46987(tdone,ends);
    thread46988(tdone,ends);
    int biggest46989 = 0;
    if(ends[39]>=biggest46989){
      biggest46989=ends[39];
    }
    if(ends[40]>=biggest46989){
      biggest46989=ends[40];
    }
    if(biggest46989 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread46984(int [] tdone, int [] ends){
        S5497=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5497=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread46983(int [] tdone, int [] ends){
        S5491=1;
    S5490=0;
    S5474=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5474=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5469=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5469=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5490=1;
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

  public void thread46982(int [] tdone, int [] ends){
        S5565=1;
    S5499=0;
    thread46983(tdone,ends);
    thread46984(tdone,ends);
    int biggest46985 = 0;
    if(ends[36]>=biggest46985){
      biggest46985=ends[36];
    }
    if(ends[37]>=biggest46985){
      biggest46985=ends[37];
    }
    if(biggest46985 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread46981(int [] tdone, int [] ends){
        S5864=1;
    thread46982(tdone,ends);
    thread46986(tdone,ends);
    thread46990(tdone,ends);
    thread46994(tdone,ends);
    int biggest46998 = 0;
    if(ends[35]>=biggest46998){
      biggest46998=ends[35];
    }
    if(ends[38]>=biggest46998){
      biggest46998=ends[38];
    }
    if(ends[41]>=biggest46998){
      biggest46998=ends[41];
    }
    if(ends[44]>=biggest46998){
      biggest46998=ends[44];
    }
    if(biggest46998 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest46998 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest46998 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest46998 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread46979(int [] tdone, int [] ends){
        S4066=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread46978(int [] tdone, int [] ends){
        S4063=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread46977(int [] tdone, int [] ends){
        S4060=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread46976(int [] tdone, int [] ends){
        S4057=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread46975(int [] tdone, int [] ends){
        S5466=1;
    S4067=0;
    thread46976(tdone,ends);
    thread46977(tdone,ends);
    thread46978(tdone,ends);
    thread46979(tdone,ends);
    int biggest46980 = 0;
    if(ends[28]>=biggest46980){
      biggest46980=ends[28];
    }
    if(ends[29]>=biggest46980){
      biggest46980=ends[29];
    }
    if(ends[30]>=biggest46980){
      biggest46980=ends[30];
    }
    if(ends[31]>=biggest46980){
      biggest46980=ends[31];
    }
    if(biggest46980 == 1){
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
      switch(S24615){
        case 0 : 
          S24615=0;
          break RUN;
        
        case 1 : 
          S24615=2;
          S24615=2;
          cvR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          fR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          cR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          lR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          bottleAtPos5_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          bottleAtPos3_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          S3746=0;
          S3642=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 240, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
            S3642=1;
            active[26]=1;
            ends[26]=1;
            break RUN;
          }
          else {
            S3637=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 240, column: 7
              S3637=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                ends[26]=2;
                ;//sysj\conveyor_controller.sysj line: 240, column: 7
                S3746=1;
                S3664=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                  S3664=1;
                  active[26]=1;
                  ends[26]=1;
                  break RUN;
                }
                else {
                  S3659=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S3659=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                      ends[26]=2;
                      ;//sysj\conveyor_controller.sysj line: 241, column: 7
                      S3746=2;
                      S3753=0;
                      if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                        S3753=1;
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                      else {
                        S3748=0;
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S3748=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 242, column: 7
                            S3746=3;
                            S3885=0;
                            if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                              S3885=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3880=0;
                              if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                S3880=1;
                                if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S3746=4;
                                  thread46975(tdone,ends);
                                  thread46981(tdone,ends);
                                  thread46999(tdone,ends);
                                  thread47003(tdone,ends);
                                  int biggest47013 = 0;
                                  if(ends[27]>=biggest47013){
                                    biggest47013=ends[27];
                                  }
                                  if(ends[34]>=biggest47013){
                                    biggest47013=ends[34];
                                  }
                                  if(ends[47]>=biggest47013){
                                    biggest47013=ends[47];
                                  }
                                  if(ends[50]>=biggest47013){
                                    biggest47013=ends[50];
                                  }
                                  if(biggest47013 == 1){
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
          bottleAtPos3_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          switch(S3746){
            case 0 : 
              switch(S3642){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 240, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                    S3642=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3637){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 240, column: 7
                          S3637=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 240, column: 7
                            S3746=1;
                            S3664=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                              S3664=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3659=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                                S3659=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 241, column: 7
                                  S3746=2;
                                  S3753=0;
                                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                    S3753=1;
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                  else {
                                    S3748=0;
                                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                      S3748=1;
                                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                        ends[26]=2;
                                        ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                        S3746=3;
                                        S3885=0;
                                        if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                          S3885=1;
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                        else {
                                          S3880=0;
                                          if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                            lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                            S3880=1;
                                            if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                              ends[26]=2;
                                              ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                              S3746=4;
                                              thread47014(tdone,ends);
                                              thread47020(tdone,ends);
                                              thread47038(tdone,ends);
                                              thread47042(tdone,ends);
                                              int biggest47052 = 0;
                                              if(ends[27]>=biggest47052){
                                                biggest47052=ends[27];
                                              }
                                              if(ends[34]>=biggest47052){
                                                biggest47052=ends[34];
                                              }
                                              if(ends[47]>=biggest47052){
                                                biggest47052=ends[47];
                                              }
                                              if(ends[50]>=biggest47052){
                                                biggest47052=ends[50];
                                              }
                                              if(biggest47052 == 1){
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
                          S3746=1;
                          S3664=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                            S3664=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S3659=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                              S3659=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 241, column: 7
                                S3746=2;
                                S3753=0;
                                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                  S3753=1;
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                                else {
                                  S3748=0;
                                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                    S3748=1;
                                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                      ends[26]=2;
                                      ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                      S3746=3;
                                      S3885=0;
                                      if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                        S3885=1;
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                      else {
                                        S3880=0;
                                        if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                          lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                          S3880=1;
                                          if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                            lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                            ends[26]=2;
                                            ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                            S3746=4;
                                            thread47053(tdone,ends);
                                            thread47059(tdone,ends);
                                            thread47077(tdone,ends);
                                            thread47081(tdone,ends);
                                            int biggest47091 = 0;
                                            if(ends[27]>=biggest47091){
                                              biggest47091=ends[27];
                                            }
                                            if(ends[34]>=biggest47091){
                                              biggest47091=ends[34];
                                            }
                                            if(ends[47]>=biggest47091){
                                              biggest47091=ends[47];
                                            }
                                            if(ends[50]>=biggest47091){
                                              biggest47091=ends[50];
                                            }
                                            if(biggest47091 == 1){
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
                  S3642=1;
                  S3642=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 240, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                    S3642=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3637=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 240, column: 7
                      S3637=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 240, column: 7
                        S3746=1;
                        S3664=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                          S3664=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S3659=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                            S3659=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 241, column: 7
                              S3746=2;
                              S3753=0;
                              if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                S3753=1;
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                              else {
                                S3748=0;
                                if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                  capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                  S3748=1;
                                  if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                    ends[26]=2;
                                    ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                    S3746=3;
                                    S3885=0;
                                    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                      S3885=1;
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                    else {
                                      S3880=0;
                                      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                        S3880=1;
                                        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                          ends[26]=2;
                                          ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                          S3746=4;
                                          thread47092(tdone,ends);
                                          thread47098(tdone,ends);
                                          thread47116(tdone,ends);
                                          thread47120(tdone,ends);
                                          int biggest47130 = 0;
                                          if(ends[27]>=biggest47130){
                                            biggest47130=ends[27];
                                          }
                                          if(ends[34]>=biggest47130){
                                            biggest47130=ends[34];
                                          }
                                          if(ends[47]>=biggest47130){
                                            biggest47130=ends[47];
                                          }
                                          if(ends[50]>=biggest47130){
                                            biggest47130=ends[50];
                                          }
                                          if(biggest47130 == 1){
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
              switch(S3664){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S3664=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3659){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                          S3659=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 241, column: 7
                            S3746=2;
                            S3753=0;
                            if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                              S3753=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3748=0;
                              if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                S3748=1;
                                if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                  S3746=3;
                                  S3885=0;
                                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                    S3885=1;
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                  else {
                                    S3880=0;
                                    if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                      lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                      S3880=1;
                                      if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                        ends[26]=2;
                                        ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                        S3746=4;
                                        thread47131(tdone,ends);
                                        thread47137(tdone,ends);
                                        thread47155(tdone,ends);
                                        thread47159(tdone,ends);
                                        int biggest47169 = 0;
                                        if(ends[27]>=biggest47169){
                                          biggest47169=ends[27];
                                        }
                                        if(ends[34]>=biggest47169){
                                          biggest47169=ends[34];
                                        }
                                        if(ends[47]>=biggest47169){
                                          biggest47169=ends[47];
                                        }
                                        if(ends[50]>=biggest47169){
                                          biggest47169=ends[50];
                                        }
                                        if(biggest47169 == 1){
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
                          S3746=2;
                          S3753=0;
                          if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            S3753=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S3748=0;
                            if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                              S3748=1;
                              if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                S3746=3;
                                S3885=0;
                                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S3885=1;
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                                else {
                                  S3880=0;
                                  if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                    lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                    S3880=1;
                                    if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                      ends[26]=2;
                                      ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                      S3746=4;
                                      thread47170(tdone,ends);
                                      thread47176(tdone,ends);
                                      thread47194(tdone,ends);
                                      thread47198(tdone,ends);
                                      int biggest47208 = 0;
                                      if(ends[27]>=biggest47208){
                                        biggest47208=ends[27];
                                      }
                                      if(ends[34]>=biggest47208){
                                        biggest47208=ends[34];
                                      }
                                      if(ends[47]>=biggest47208){
                                        biggest47208=ends[47];
                                      }
                                      if(ends[50]>=biggest47208){
                                        biggest47208=ends[50];
                                      }
                                      if(biggest47208 == 1){
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
                  S3664=1;
                  S3664=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S3664=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3659=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                      S3659=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 241, column: 7
                        S3746=2;
                        S3753=0;
                        if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S3753=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S3748=0;
                          if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                            S3748=1;
                            if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 242, column: 7
                              S3746=3;
                              S3885=0;
                              if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                S3885=1;
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                              else {
                                S3880=0;
                                if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S3880=1;
                                  if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                    ends[26]=2;
                                    ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                    S3746=4;
                                    thread47209(tdone,ends);
                                    thread47215(tdone,ends);
                                    thread47233(tdone,ends);
                                    thread47237(tdone,ends);
                                    int biggest47247 = 0;
                                    if(ends[27]>=biggest47247){
                                      biggest47247=ends[27];
                                    }
                                    if(ends[34]>=biggest47247){
                                      biggest47247=ends[34];
                                    }
                                    if(ends[47]>=biggest47247){
                                      biggest47247=ends[47];
                                    }
                                    if(ends[50]>=biggest47247){
                                      biggest47247=ends[50];
                                    }
                                    if(biggest47247 == 1){
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
              switch(S3753){
                case 0 : 
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                    S3753=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3748){
                      case 0 : 
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S3748=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 242, column: 7
                            S3746=3;
                            S3885=0;
                            if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                              S3885=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3880=0;
                              if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                S3880=1;
                                if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S3746=4;
                                  thread47248(tdone,ends);
                                  thread47254(tdone,ends);
                                  thread47272(tdone,ends);
                                  thread47276(tdone,ends);
                                  int biggest47286 = 0;
                                  if(ends[27]>=biggest47286){
                                    biggest47286=ends[27];
                                  }
                                  if(ends[34]>=biggest47286){
                                    biggest47286=ends[34];
                                  }
                                  if(ends[47]>=biggest47286){
                                    biggest47286=ends[47];
                                  }
                                  if(ends[50]>=biggest47286){
                                    biggest47286=ends[50];
                                  }
                                  if(biggest47286 == 1){
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
                          S3746=3;
                          S3885=0;
                          if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                            lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                            S3885=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S3880=0;
                            if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                              S3880=1;
                              if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                S3746=4;
                                thread47287(tdone,ends);
                                thread47293(tdone,ends);
                                thread47311(tdone,ends);
                                thread47315(tdone,ends);
                                int biggest47325 = 0;
                                if(ends[27]>=biggest47325){
                                  biggest47325=ends[27];
                                }
                                if(ends[34]>=biggest47325){
                                  biggest47325=ends[34];
                                }
                                if(ends[47]>=biggest47325){
                                  biggest47325=ends[47];
                                }
                                if(ends[50]>=biggest47325){
                                  biggest47325=ends[50];
                                }
                                if(biggest47325 == 1){
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
                  S3753=1;
                  S3753=0;
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                    S3753=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3748=0;
                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                      S3748=1;
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 242, column: 7
                        S3746=3;
                        S3885=0;
                        if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                          S3885=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S3880=0;
                          if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                            lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                            S3880=1;
                            if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 243, column: 7
                              S3746=4;
                              thread47326(tdone,ends);
                              thread47332(tdone,ends);
                              thread47350(tdone,ends);
                              thread47354(tdone,ends);
                              int biggest47364 = 0;
                              if(ends[27]>=biggest47364){
                                biggest47364=ends[27];
                              }
                              if(ends[34]>=biggest47364){
                                biggest47364=ends[34];
                              }
                              if(ends[47]>=biggest47364){
                                biggest47364=ends[47];
                              }
                              if(ends[50]>=biggest47364){
                                biggest47364=ends[50];
                              }
                              if(biggest47364 == 1){
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
              switch(S3885){
                case 0 : 
                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                    S3885=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3880){
                      case 0 : 
                        if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                          lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                          S3880=1;
                          if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                            lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 243, column: 7
                            S3746=4;
                            thread47365(tdone,ends);
                            thread47371(tdone,ends);
                            thread47389(tdone,ends);
                            thread47393(tdone,ends);
                            int biggest47403 = 0;
                            if(ends[27]>=biggest47403){
                              biggest47403=ends[27];
                            }
                            if(ends[34]>=biggest47403){
                              biggest47403=ends[34];
                            }
                            if(ends[47]>=biggest47403){
                              biggest47403=ends[47];
                            }
                            if(ends[50]>=biggest47403){
                              biggest47403=ends[50];
                            }
                            if(biggest47403 == 1){
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
                          S3746=4;
                          thread47404(tdone,ends);
                          thread47410(tdone,ends);
                          thread47428(tdone,ends);
                          thread47432(tdone,ends);
                          int biggest47442 = 0;
                          if(ends[27]>=biggest47442){
                            biggest47442=ends[27];
                          }
                          if(ends[34]>=biggest47442){
                            biggest47442=ends[34];
                          }
                          if(ends[47]>=biggest47442){
                            biggest47442=ends[47];
                          }
                          if(ends[50]>=biggest47442){
                            biggest47442=ends[50];
                          }
                          if(biggest47442 == 1){
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
                  S3885=1;
                  S3885=0;
                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                    S3885=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3880=0;
                    if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                      lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                      S3880=1;
                      if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 243, column: 7
                        S3746=4;
                        thread47443(tdone,ends);
                        thread47449(tdone,ends);
                        thread47467(tdone,ends);
                        thread47471(tdone,ends);
                        int biggest47481 = 0;
                        if(ends[27]>=biggest47481){
                          biggest47481=ends[27];
                        }
                        if(ends[34]>=biggest47481){
                          biggest47481=ends[34];
                        }
                        if(ends[47]>=biggest47481){
                          biggest47481=ends[47];
                        }
                        if(ends[50]>=biggest47481){
                          biggest47481=ends[50];
                        }
                        if(biggest47481 == 1){
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
              thread47482(tdone,ends);
              thread47510(tdone,ends);
              thread47540(tdone,ends);
              thread47544(tdone,ends);
              int biggest47560 = 0;
              if(ends[27]>=biggest47560){
                biggest47560=ends[27];
              }
              if(ends[34]>=biggest47560){
                biggest47560=ends[34];
              }
              if(ends[47]>=biggest47560){
                biggest47560=ends[47];
              }
              if(ends[50]>=biggest47560){
                biggest47560=ends[50];
              }
              if(biggest47560 == 1){
                active[26]=1;
                ends[26]=1;
                break RUN;
              }
              //FINXME code
              if(biggest47560 == 0){
                S24615=0;
                active[26]=0;
                ends[26]=0;
                S24615=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    cvR_26 = new Signal();
    fR_26 = new Signal();
    cR_26 = new Signal();
    lR_26 = new Signal();
    bottleAtPos5_26 = new Signal();
    bottleAtPos3_26 = new Signal();
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
          checkThree_in.gethook();
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
      bottleAtPos3E.setpreclear();
      cvR_26.setpreclear();
      fR_26.setpreclear();
      cR_26.setpreclear();
      lR_26.setpreclear();
      bottleAtPos5_26.setpreclear();
      bottleAtPos3_26.setpreclear();
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
      bottleAtPos3E.sethook();
      bottleAtPos3E.setClear();
      cvR_26.setClear();
      fR_26.setClear();
      cR_26.setClear();
      lR_26.setClear();
      bottleAtPos5_26.setClear();
      bottleAtPos3_26.setClear();
      convReady_in.sethook();
      fillerReady_in.sethook();
      capperReady_in.sethook();
      lidLoaderReady_in.sethook();
      checkFive_in.sethook();
      checkThree_in.sethook();
      checkOne_in.sethook();
      rotated_o.sethook();
      if(paused[26]!=0 || suspended[26]!=0 || active[26]!=1);
      else{
        convReady_in.gethook();
        fillerReady_in.gethook();
        capperReady_in.gethook();
        lidLoaderReady_in.gethook();
        checkFive_in.gethook();
        checkThree_in.gethook();
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
