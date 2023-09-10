import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CapperController extends ClockDomain{
  public CapperController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.INPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.INPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.INPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.INPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.OUTPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.OUTPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.OUTPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.OUTPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.OUTPUT);
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  public input_Channel simCapper_in = new input_Channel();
  public output_Channel capperReady_o = new output_Channel();
  private Signal bottleAtPos4_67;
  private int S38285 = 1;
  private int S38284 = 1;
  private int S32528 = 1;
  private int S32523 = 1;
  private int S33825 = 1;
  private int S32546 = 1;
  private int S32553 = 1;
  private int S32548 = 1;
  private int S32615 = 1;
  private int S32650 = 1;
  private int S32617 = 1;
  private int S32622 = 1;
  private int S32630 = 1;
  private int S32633 = 1;
  private int S32702 = 1;
  private int S32697 = 1;
  private int S32753 = 1;
  private int S33908 = 1;
  private int S33852 = 1;
  private int S33832 = 1;
  private int S33827 = 1;
  private int S33943 = 1;
  private int S33919 = 1;
  private int S33913 = 1;
  private int S33916 = 1;
  private int S33978 = 1;
  private int S33954 = 1;
  private int S33948 = 1;
  private int S33951 = 1;
  
  private int[] ends = new int[90];
  private int[] tdone = new int[90];
  
  public void thread47698(int [] tdone, int [] ends){
        S33951=1;
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread47697(int [] tdone, int [] ends){
        S33948=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 607, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread47695(int [] tdone, int [] ends){
        switch(S33951){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 611, column: 36
          ends[80]=2;
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

  public void thread47694(int [] tdone, int [] ends){
        switch(S33948){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 607, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[79]=1;
        ends[79]=1;
        tdone[79]=1;
        break;
      
    }
  }

  public void thread47693(int [] tdone, int [] ends){
        switch(S33978){
      case 0 : 
        active[78]=0;
        ends[78]=0;
        tdone[78]=1;
        break;
      
      case 1 : 
        switch(S33954){
          case 0 : 
            thread47694(tdone,ends);
            thread47695(tdone,ends);
            int biggest47696 = 0;
            if(ends[79]>=biggest47696){
              biggest47696=ends[79];
            }
            if(ends[80]>=biggest47696){
              biggest47696=ends[80];
            }
            if(biggest47696 == 1){
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            if(biggest47696 == 2){
              ends[78]=2;
              ;//sysj\conveyor_controller.sysj line: 605, column: 19
              S33954=1;
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            //FINXME code
            if(biggest47696 == 0){
              S33954=1;
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            break;
          
          case 1 : 
            S33954=1;
            S33954=0;
            if(bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 604, column: 27
              thread47697(tdone,ends);
              thread47698(tdone,ends);
              int biggest47699 = 0;
              if(ends[79]>=biggest47699){
                biggest47699=ends[79];
              }
              if(ends[80]>=biggest47699){
                biggest47699=ends[80];
              }
              if(biggest47699 == 1){
                active[78]=1;
                ends[78]=1;
                tdone[78]=1;
              }
            }
            else {
              S33954=1;
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47691(int [] tdone, int [] ends){
        S33916=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread47690(int [] tdone, int [] ends){
        S33913=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 588, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread47688(int [] tdone, int [] ends){
        switch(S33916){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 592, column: 37
          ends[77]=2;
          tdone[77]=1;
        }
        else {
          active[77]=1;
          ends[77]=1;
          tdone[77]=1;
        }
        break;
      
    }
  }

  public void thread47687(int [] tdone, int [] ends){
        switch(S33913){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 588, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[76]=1;
        ends[76]=1;
        tdone[76]=1;
        break;
      
    }
  }

  public void thread47686(int [] tdone, int [] ends){
        switch(S33943){
      case 0 : 
        active[75]=0;
        ends[75]=0;
        tdone[75]=1;
        break;
      
      case 1 : 
        switch(S33919){
          case 0 : 
            thread47687(tdone,ends);
            thread47688(tdone,ends);
            int biggest47689 = 0;
            if(ends[76]>=biggest47689){
              biggest47689=ends[76];
            }
            if(ends[77]>=biggest47689){
              biggest47689=ends[77];
            }
            if(biggest47689 == 1){
              active[75]=1;
              ends[75]=1;
              tdone[75]=1;
            }
            if(biggest47689 == 2){
              ends[75]=2;
              ;//sysj\conveyor_controller.sysj line: 586, column: 20
              S33919=1;
              active[75]=1;
              ends[75]=1;
              tdone[75]=1;
            }
            //FINXME code
            if(biggest47689 == 0){
              S33919=1;
              active[75]=1;
              ends[75]=1;
              tdone[75]=1;
            }
            break;
          
          case 1 : 
            S33919=1;
            S33919=0;
            if(bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 585, column: 39
              thread47690(tdone,ends);
              thread47691(tdone,ends);
              int biggest47692 = 0;
              if(ends[76]>=biggest47692){
                biggest47692=ends[76];
              }
              if(ends[77]>=biggest47692){
                biggest47692=ends[77];
              }
              if(biggest47692 == 1){
                active[75]=1;
                ends[75]=1;
                tdone[75]=1;
              }
            }
            else {
              S33919=1;
              active[75]=1;
              ends[75]=1;
              tdone[75]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47685(int [] tdone, int [] ends){
        switch(S33908){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        switch(S33852){
          case 0 : 
            switch(S33832){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 575, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
                  S33832=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  switch(S33827){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 575, column: 13
                        S33827=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
                          ends[74]=2;
                          ;//sysj\conveyor_controller.sysj line: 575, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 576, column: 16
                            bottleAtPos4_67.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 14
                            currsigs.addElement(bottleAtPos4_67);
                            S33852=1;
                            active[74]=1;
                            ends[74]=1;
                            tdone[74]=1;
                          }
                          else {
                            S33852=1;
                            active[74]=1;
                            ends[74]=1;
                            tdone[74]=1;
                          }
                        }
                        else {
                          active[74]=1;
                          ends[74]=1;
                          tdone[74]=1;
                        }
                      }
                      else {
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
                        ends[74]=2;
                        ;//sysj\conveyor_controller.sysj line: 575, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 576, column: 16
                          bottleAtPos4_67.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 14
                          currsigs.addElement(bottleAtPos4_67);
                          S33852=1;
                          active[74]=1;
                          ends[74]=1;
                          tdone[74]=1;
                        }
                        else {
                          S33852=1;
                          active[74]=1;
                          ends[74]=1;
                          tdone[74]=1;
                        }
                      }
                      else {
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S33832=1;
                S33832=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 575, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
                  S33832=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  S33827=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 575, column: 13
                    S33827=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
                      ends[74]=2;
                      ;//sysj\conveyor_controller.sysj line: 575, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 576, column: 16
                        bottleAtPos4_67.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 14
                        currsigs.addElement(bottleAtPos4_67);
                        S33852=1;
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
                      }
                      else {
                        S33852=1;
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
                      }
                    }
                    else {
                      active[74]=1;
                      ends[74]=1;
                      tdone[74]=1;
                    }
                  }
                  else {
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S33852=1;
            S33852=0;
            S33832=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 575, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
              S33832=1;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            else {
              S33827=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 575, column: 13
                S33827=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
                  ends[74]=2;
                  ;//sysj\conveyor_controller.sysj line: 575, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 576, column: 16
                    bottleAtPos4_67.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 14
                    currsigs.addElement(bottleAtPos4_67);
                    S33852=1;
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                  else {
                    S33852=1;
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                }
                else {
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
              }
              else {
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47682(int [] tdone, int [] ends){
        switch(S32633){
      case 0 : 
        active[73]=0;
        ends[73]=0;
        tdone[73]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 548, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 549, column: 16
          ends[73]=2;
          tdone[73]=1;
        }
        else {
          active[73]=1;
          ends[73]=1;
          tdone[73]=1;
        }
        break;
      
    }
  }

  public void thread47681(int [] tdone, int [] ends){
        switch(S32630){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
        break;
      
    }
  }

  public void thread47680(int [] tdone, int [] ends){
        switch(S32622){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 539, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
        break;
      
    }
  }

  public void thread47678(int [] tdone, int [] ends){
        S32633=1;
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread47677(int [] tdone, int [] ends){
        S32630=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 543, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread47676(int [] tdone, int [] ends){
        S32622=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 539, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread47675(int [] tdone, int [] ends){
        switch(S32650){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        switch(S32617){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 536, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 537, column: 15
              S32617=1;
              thread47676(tdone,ends);
              thread47677(tdone,ends);
              thread47678(tdone,ends);
              int biggest47679 = 0;
              if(ends[71]>=biggest47679){
                biggest47679=ends[71];
              }
              if(ends[72]>=biggest47679){
                biggest47679=ends[72];
              }
              if(ends[73]>=biggest47679){
                biggest47679=ends[73];
              }
              if(biggest47679 == 1){
                active[70]=1;
                ends[70]=1;
                tdone[70]=1;
              }
            }
            else {
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            break;
          
          case 1 : 
            thread47680(tdone,ends);
            thread47681(tdone,ends);
            thread47682(tdone,ends);
            int biggest47683 = 0;
            if(ends[71]>=biggest47683){
              biggest47683=ends[71];
            }
            if(ends[72]>=biggest47683){
              biggest47683=ends[72];
            }
            if(ends[73]>=biggest47683){
              biggest47683=ends[73];
            }
            if(biggest47683 == 1){
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            if(biggest47683 == 2){
              ends[70]=2;
              tdone[70]=1;
            }
            //FINXME code
            if(biggest47683 == 0){
              S32650=0;
              active[70]=0;
              ends[70]=0;
              tdone[70]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47674(int [] tdone, int [] ends){
        switch(S32615){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
        break;
      
    }
  }

  public void thread47672(int [] tdone, int [] ends){
        S32650=1;
    S32617=0;
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread47671(int [] tdone, int [] ends){
        S32615=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread47670(int [] tdone, int [] ends){
        switch(S33825){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        switch(S32546){
          case 0 : 
            if(bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 511, column: 19
              S32546=1;
              S32553=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 512, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 512, column: 13
                S32553=1;
                active[68]=1;
                ends[68]=1;
                tdone[68]=1;
              }
              else {
                S32548=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 512, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 512, column: 13
                  S32548=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 512, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 512, column: 13
                    ends[68]=2;
                    ;//sysj\conveyor_controller.sysj line: 512, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 513, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 514, column: 13
                    S32546=2;
                    active[68]=1;
                    ends[68]=1;
                    tdone[68]=1;
                  }
                  else {
                    active[68]=1;
                    ends[68]=1;
                    tdone[68]=1;
                  }
                }
                else {
                  active[68]=1;
                  ends[68]=1;
                  tdone[68]=1;
                }
              }
            }
            else {
              active[68]=1;
              ends[68]=1;
              tdone[68]=1;
            }
            break;
          
          case 1 : 
            switch(S32553){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 512, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 512, column: 13
                  S32553=1;
                  active[68]=1;
                  ends[68]=1;
                  tdone[68]=1;
                }
                else {
                  switch(S32548){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 512, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 512, column: 13
                        S32548=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 512, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 512, column: 13
                          ends[68]=2;
                          ;//sysj\conveyor_controller.sysj line: 512, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 513, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 514, column: 13
                          S32546=2;
                          active[68]=1;
                          ends[68]=1;
                          tdone[68]=1;
                        }
                        else {
                          active[68]=1;
                          ends[68]=1;
                          tdone[68]=1;
                        }
                      }
                      else {
                        active[68]=1;
                        ends[68]=1;
                        tdone[68]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 512, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 512, column: 13
                        ends[68]=2;
                        ;//sysj\conveyor_controller.sysj line: 512, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 513, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 514, column: 13
                        S32546=2;
                        active[68]=1;
                        ends[68]=1;
                        tdone[68]=1;
                      }
                      else {
                        active[68]=1;
                        ends[68]=1;
                        tdone[68]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S32553=1;
                S32553=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 512, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 512, column: 13
                  S32553=1;
                  active[68]=1;
                  ends[68]=1;
                  tdone[68]=1;
                }
                else {
                  S32548=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 512, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 512, column: 13
                    S32548=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 512, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 512, column: 13
                      ends[68]=2;
                      ;//sysj\conveyor_controller.sysj line: 512, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 513, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 514, column: 13
                      S32546=2;
                      active[68]=1;
                      ends[68]=1;
                      tdone[68]=1;
                    }
                    else {
                      active[68]=1;
                      ends[68]=1;
                      tdone[68]=1;
                    }
                  }
                  else {
                    active[68]=1;
                    ends[68]=1;
                    tdone[68]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 515, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 519, column: 13
              S32546=3;
              active[68]=1;
              ends[68]=1;
              tdone[68]=1;
            }
            else {
              active[68]=1;
              ends[68]=1;
              tdone[68]=1;
            }
            break;
          
          case 3 : 
            S32546=3;
            S32546=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 525, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 526, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[68]=1;
            ends[68]=1;
            tdone[68]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 523, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 528, column: 13
              S32546=5;
              thread47671(tdone,ends);
              thread47672(tdone,ends);
              int biggest47673 = 0;
              if(ends[69]>=biggest47673){
                biggest47673=ends[69];
              }
              if(ends[70]>=biggest47673){
                biggest47673=ends[70];
              }
              if(biggest47673 == 1){
                active[68]=1;
                ends[68]=1;
                tdone[68]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 526, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[68]=1;
              ends[68]=1;
              tdone[68]=1;
            }
            break;
          
          case 5 : 
            thread47674(tdone,ends);
            thread47675(tdone,ends);
            int biggest47684 = 0;
            if(ends[69]>=biggest47684){
              biggest47684=ends[69];
            }
            if(ends[70]>=biggest47684){
              biggest47684=ends[70];
            }
            if(biggest47684 == 1){
              active[68]=1;
              ends[68]=1;
              tdone[68]=1;
            }
            if(biggest47684 == 2){
              ends[68]=2;
              ;//sysj\conveyor_controller.sysj line: 531, column: 13
              S32546=6;
              active[68]=1;
              ends[68]=1;
              tdone[68]=1;
            }
            //FINXME code
            if(biggest47684 == 0){
              S32546=6;
              active[68]=1;
              ends[68]=1;
              tdone[68]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 555, column: 19
              S32546=7;
              S32702=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 557, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 557, column: 13
                S32702=1;
                active[68]=1;
                ends[68]=1;
                tdone[68]=1;
              }
              else {
                S32697=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 557, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 557, column: 13
                  S32697=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 557, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 557, column: 13
                    ends[68]=2;
                    ;//sysj\conveyor_controller.sysj line: 557, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 558, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 559, column: 13
                    S32546=8;
                    S32753=0;
                    active[68]=1;
                    ends[68]=1;
                    tdone[68]=1;
                  }
                  else {
                    active[68]=1;
                    ends[68]=1;
                    tdone[68]=1;
                  }
                }
                else {
                  active[68]=1;
                  ends[68]=1;
                  tdone[68]=1;
                }
              }
            }
            else {
              active[68]=1;
              ends[68]=1;
              tdone[68]=1;
            }
            break;
          
          case 7 : 
            switch(S32702){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 557, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 557, column: 13
                  S32702=1;
                  active[68]=1;
                  ends[68]=1;
                  tdone[68]=1;
                }
                else {
                  switch(S32697){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 557, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 557, column: 13
                        S32697=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 557, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 557, column: 13
                          ends[68]=2;
                          ;//sysj\conveyor_controller.sysj line: 557, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 558, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 559, column: 13
                          S32546=8;
                          S32753=0;
                          active[68]=1;
                          ends[68]=1;
                          tdone[68]=1;
                        }
                        else {
                          active[68]=1;
                          ends[68]=1;
                          tdone[68]=1;
                        }
                      }
                      else {
                        active[68]=1;
                        ends[68]=1;
                        tdone[68]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 557, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 557, column: 13
                        ends[68]=2;
                        ;//sysj\conveyor_controller.sysj line: 557, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 558, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 559, column: 13
                        S32546=8;
                        S32753=0;
                        active[68]=1;
                        ends[68]=1;
                        tdone[68]=1;
                      }
                      else {
                        active[68]=1;
                        ends[68]=1;
                        tdone[68]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S32702=1;
                S32702=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 557, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 557, column: 13
                  S32702=1;
                  active[68]=1;
                  ends[68]=1;
                  tdone[68]=1;
                }
                else {
                  S32697=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 557, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 557, column: 13
                    S32697=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 557, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 557, column: 13
                      ends[68]=2;
                      ;//sysj\conveyor_controller.sysj line: 557, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 558, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 559, column: 13
                      S32546=8;
                      S32753=0;
                      active[68]=1;
                      ends[68]=1;
                      tdone[68]=1;
                    }
                    else {
                      active[68]=1;
                      ends[68]=1;
                      tdone[68]=1;
                    }
                  }
                  else {
                    active[68]=1;
                    ends[68]=1;
                    tdone[68]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S32753){
              case 0 : 
                if(!bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 560, column: 29
                  S32753=1;
                  if(bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 562, column: 23
                    active[68]=1;
                    ends[68]=1;
                    tdone[68]=1;
                  }
                  else {
                    ends[68]=2;
                    ;//sysj\conveyor_controller.sysj line: 560, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 510, column: 13
                    S32546=0;
                    active[68]=1;
                    ends[68]=1;
                    tdone[68]=1;
                  }
                }
                else {
                  active[68]=1;
                  ends[68]=1;
                  tdone[68]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 562, column: 23
                  active[68]=1;
                  ends[68]=1;
                  tdone[68]=1;
                }
                else {
                  ends[68]=2;
                  ;//sysj\conveyor_controller.sysj line: 560, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 510, column: 13
                  S32546=0;
                  active[68]=1;
                  ends[68]=1;
                  tdone[68]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47667(int [] tdone, int [] ends){
        S33951=1;
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread47666(int [] tdone, int [] ends){
        S33948=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 607, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread47665(int [] tdone, int [] ends){
        S33978=1;
    S33954=0;
    if(bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 604, column: 27
      thread47666(tdone,ends);
      thread47667(tdone,ends);
      int biggest47668 = 0;
      if(ends[79]>=biggest47668){
        biggest47668=ends[79];
      }
      if(ends[80]>=biggest47668){
        biggest47668=ends[80];
      }
      if(biggest47668 == 1){
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
      }
    }
    else {
      S33954=1;
      active[78]=1;
      ends[78]=1;
      tdone[78]=1;
    }
  }

  public void thread47663(int [] tdone, int [] ends){
        S33916=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread47662(int [] tdone, int [] ends){
        S33913=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 588, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread47661(int [] tdone, int [] ends){
        S33943=1;
    S33919=0;
    if(bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 585, column: 39
      thread47662(tdone,ends);
      thread47663(tdone,ends);
      int biggest47664 = 0;
      if(ends[76]>=biggest47664){
        biggest47664=ends[76];
      }
      if(ends[77]>=biggest47664){
        biggest47664=ends[77];
      }
      if(biggest47664 == 1){
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
    else {
      S33919=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
  }

  public void thread47660(int [] tdone, int [] ends){
        S33908=1;
    S33852=0;
    S33832=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 575, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
      S33832=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
    else {
      S33827=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 575, column: 13
        S33827=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
          ends[74]=2;
          ;//sysj\conveyor_controller.sysj line: 575, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 576, column: 16
            bottleAtPos4_67.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 14
            currsigs.addElement(bottleAtPos4_67);
            S33852=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
          else {
            S33852=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
        }
        else {
          active[74]=1;
          ends[74]=1;
          tdone[74]=1;
        }
      }
      else {
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
  }

  public void thread47659(int [] tdone, int [] ends){
        S33825=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 510, column: 13
    S32546=0;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread47656(int [] tdone, int [] ends){
        S33951=1;
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread47655(int [] tdone, int [] ends){
        S33948=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 607, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread47654(int [] tdone, int [] ends){
        S33978=1;
    S33954=0;
    if(bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 604, column: 27
      thread47655(tdone,ends);
      thread47656(tdone,ends);
      int biggest47657 = 0;
      if(ends[79]>=biggest47657){
        biggest47657=ends[79];
      }
      if(ends[80]>=biggest47657){
        biggest47657=ends[80];
      }
      if(biggest47657 == 1){
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
      }
    }
    else {
      S33954=1;
      active[78]=1;
      ends[78]=1;
      tdone[78]=1;
    }
  }

  public void thread47652(int [] tdone, int [] ends){
        S33916=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread47651(int [] tdone, int [] ends){
        S33913=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 588, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread47650(int [] tdone, int [] ends){
        S33943=1;
    S33919=0;
    if(bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 585, column: 39
      thread47651(tdone,ends);
      thread47652(tdone,ends);
      int biggest47653 = 0;
      if(ends[76]>=biggest47653){
        biggest47653=ends[76];
      }
      if(ends[77]>=biggest47653){
        biggest47653=ends[77];
      }
      if(biggest47653 == 1){
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
    else {
      S33919=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
  }

  public void thread47649(int [] tdone, int [] ends){
        S33908=1;
    S33852=0;
    S33832=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 575, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
      S33832=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
    else {
      S33827=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 575, column: 13
        S33827=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
          ends[74]=2;
          ;//sysj\conveyor_controller.sysj line: 575, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 576, column: 16
            bottleAtPos4_67.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 14
            currsigs.addElement(bottleAtPos4_67);
            S33852=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
          else {
            S33852=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
        }
        else {
          active[74]=1;
          ends[74]=1;
          tdone[74]=1;
        }
      }
      else {
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
  }

  public void thread47648(int [] tdone, int [] ends){
        S33825=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 510, column: 13
    S32546=0;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread47645(int [] tdone, int [] ends){
        S33951=1;
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread47644(int [] tdone, int [] ends){
        S33948=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 607, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread47643(int [] tdone, int [] ends){
        S33978=1;
    S33954=0;
    if(bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 604, column: 27
      thread47644(tdone,ends);
      thread47645(tdone,ends);
      int biggest47646 = 0;
      if(ends[79]>=biggest47646){
        biggest47646=ends[79];
      }
      if(ends[80]>=biggest47646){
        biggest47646=ends[80];
      }
      if(biggest47646 == 1){
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
      }
    }
    else {
      S33954=1;
      active[78]=1;
      ends[78]=1;
      tdone[78]=1;
    }
  }

  public void thread47641(int [] tdone, int [] ends){
        S33916=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread47640(int [] tdone, int [] ends){
        S33913=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 588, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread47639(int [] tdone, int [] ends){
        S33943=1;
    S33919=0;
    if(bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 585, column: 39
      thread47640(tdone,ends);
      thread47641(tdone,ends);
      int biggest47642 = 0;
      if(ends[76]>=biggest47642){
        biggest47642=ends[76];
      }
      if(ends[77]>=biggest47642){
        biggest47642=ends[77];
      }
      if(biggest47642 == 1){
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
    else {
      S33919=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
  }

  public void thread47638(int [] tdone, int [] ends){
        S33908=1;
    S33852=0;
    S33832=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 575, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
      S33832=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
    else {
      S33827=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 575, column: 13
        S33827=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
          ends[74]=2;
          ;//sysj\conveyor_controller.sysj line: 575, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 576, column: 16
            bottleAtPos4_67.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 14
            currsigs.addElement(bottleAtPos4_67);
            S33852=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
          else {
            S33852=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
        }
        else {
          active[74]=1;
          ends[74]=1;
          tdone[74]=1;
        }
      }
      else {
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
  }

  public void thread47637(int [] tdone, int [] ends){
        S33825=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 510, column: 13
    S32546=0;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread47634(int [] tdone, int [] ends){
        S33951=1;
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread47633(int [] tdone, int [] ends){
        S33948=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 607, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread47632(int [] tdone, int [] ends){
        S33978=1;
    S33954=0;
    if(bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 604, column: 27
      thread47633(tdone,ends);
      thread47634(tdone,ends);
      int biggest47635 = 0;
      if(ends[79]>=biggest47635){
        biggest47635=ends[79];
      }
      if(ends[80]>=biggest47635){
        biggest47635=ends[80];
      }
      if(biggest47635 == 1){
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
      }
    }
    else {
      S33954=1;
      active[78]=1;
      ends[78]=1;
      tdone[78]=1;
    }
  }

  public void thread47630(int [] tdone, int [] ends){
        S33916=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread47629(int [] tdone, int [] ends){
        S33913=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 588, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread47628(int [] tdone, int [] ends){
        S33943=1;
    S33919=0;
    if(bottleAtPos4_67.getprestatus()){//sysj\conveyor_controller.sysj line: 585, column: 39
      thread47629(tdone,ends);
      thread47630(tdone,ends);
      int biggest47631 = 0;
      if(ends[76]>=biggest47631){
        biggest47631=ends[76];
      }
      if(ends[77]>=biggest47631){
        biggest47631=ends[77];
      }
      if(biggest47631 == 1){
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
    else {
      S33919=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
  }

  public void thread47627(int [] tdone, int [] ends){
        S33908=1;
    S33852=0;
    S33832=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 575, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
      S33832=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
    else {
      S33827=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 575, column: 13
        S33827=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 575, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 575, column: 13
          ends[74]=2;
          ;//sysj\conveyor_controller.sysj line: 575, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 576, column: 16
            bottleAtPos4_67.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 14
            currsigs.addElement(bottleAtPos4_67);
            S33852=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
          else {
            S33852=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
        }
        else {
          active[74]=1;
          ends[74]=1;
          tdone[74]=1;
        }
      }
      else {
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
  }

  public void thread47626(int [] tdone, int [] ends){
        S33825=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 510, column: 13
    S32546=0;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S38285){
        case 0 : 
          S38285=0;
          break RUN;
        
        case 1 : 
          S38285=2;
          S38285=2;
          bottleAtPos4_67.setClear();//sysj\conveyor_controller.sysj line: 504, column: 11
          S38284=0;
          S32528=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 505, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 505, column: 11
            S32528=1;
            active[67]=1;
            ends[67]=1;
            break RUN;
          }
          else {
            S32523=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 505, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 505, column: 11
              S32523=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 505, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 505, column: 11
                ends[67]=2;
                ;//sysj\conveyor_controller.sysj line: 505, column: 11
                S38284=1;
                thread47626(tdone,ends);
                thread47627(tdone,ends);
                thread47628(tdone,ends);
                thread47632(tdone,ends);
                int biggest47636 = 0;
                if(ends[68]>=biggest47636){
                  biggest47636=ends[68];
                }
                if(ends[74]>=biggest47636){
                  biggest47636=ends[74];
                }
                if(ends[75]>=biggest47636){
                  biggest47636=ends[75];
                }
                if(ends[78]>=biggest47636){
                  biggest47636=ends[78];
                }
                if(biggest47636 == 1){
                  active[67]=1;
                  ends[67]=1;
                  break RUN;
                }
              }
              else {
                active[67]=1;
                ends[67]=1;
                break RUN;
              }
            }
            else {
              active[67]=1;
              ends[67]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_67.setClear();//sysj\conveyor_controller.sysj line: 504, column: 11
          switch(S38284){
            case 0 : 
              switch(S32528){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 505, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 505, column: 11
                    S32528=1;
                    active[67]=1;
                    ends[67]=1;
                    break RUN;
                  }
                  else {
                    switch(S32523){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 505, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 505, column: 11
                          S32523=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 505, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 505, column: 11
                            ends[67]=2;
                            ;//sysj\conveyor_controller.sysj line: 505, column: 11
                            S38284=1;
                            thread47637(tdone,ends);
                            thread47638(tdone,ends);
                            thread47639(tdone,ends);
                            thread47643(tdone,ends);
                            int biggest47647 = 0;
                            if(ends[68]>=biggest47647){
                              biggest47647=ends[68];
                            }
                            if(ends[74]>=biggest47647){
                              biggest47647=ends[74];
                            }
                            if(ends[75]>=biggest47647){
                              biggest47647=ends[75];
                            }
                            if(ends[78]>=biggest47647){
                              biggest47647=ends[78];
                            }
                            if(biggest47647 == 1){
                              active[67]=1;
                              ends[67]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[67]=1;
                            ends[67]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[67]=1;
                          ends[67]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 505, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 505, column: 11
                          ends[67]=2;
                          ;//sysj\conveyor_controller.sysj line: 505, column: 11
                          S38284=1;
                          thread47648(tdone,ends);
                          thread47649(tdone,ends);
                          thread47650(tdone,ends);
                          thread47654(tdone,ends);
                          int biggest47658 = 0;
                          if(ends[68]>=biggest47658){
                            biggest47658=ends[68];
                          }
                          if(ends[74]>=biggest47658){
                            biggest47658=ends[74];
                          }
                          if(ends[75]>=biggest47658){
                            biggest47658=ends[75];
                          }
                          if(ends[78]>=biggest47658){
                            biggest47658=ends[78];
                          }
                          if(biggest47658 == 1){
                            active[67]=1;
                            ends[67]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[67]=1;
                          ends[67]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S32528=1;
                  S32528=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 505, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 505, column: 11
                    S32528=1;
                    active[67]=1;
                    ends[67]=1;
                    break RUN;
                  }
                  else {
                    S32523=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 505, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 505, column: 11
                      S32523=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 505, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 505, column: 11
                        ends[67]=2;
                        ;//sysj\conveyor_controller.sysj line: 505, column: 11
                        S38284=1;
                        thread47659(tdone,ends);
                        thread47660(tdone,ends);
                        thread47661(tdone,ends);
                        thread47665(tdone,ends);
                        int biggest47669 = 0;
                        if(ends[68]>=biggest47669){
                          biggest47669=ends[68];
                        }
                        if(ends[74]>=biggest47669){
                          biggest47669=ends[74];
                        }
                        if(ends[75]>=biggest47669){
                          biggest47669=ends[75];
                        }
                        if(ends[78]>=biggest47669){
                          biggest47669=ends[78];
                        }
                        if(biggest47669 == 1){
                          active[67]=1;
                          ends[67]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[67]=1;
                        ends[67]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[67]=1;
                      ends[67]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread47670(tdone,ends);
              thread47685(tdone,ends);
              thread47686(tdone,ends);
              thread47693(tdone,ends);
              int biggest47700 = 0;
              if(ends[68]>=biggest47700){
                biggest47700=ends[68];
              }
              if(ends[74]>=biggest47700){
                biggest47700=ends[74];
              }
              if(ends[75]>=biggest47700){
                biggest47700=ends[75];
              }
              if(ends[78]>=biggest47700){
                biggest47700=ends[78];
              }
              if(biggest47700 == 1){
                active[67]=1;
                ends[67]=1;
                break RUN;
              }
              //FINXME code
              if(biggest47700 == 0){
                S38285=0;
                active[67]=0;
                ends[67]=0;
                S38285=0;
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
    bottleAtPos4_67 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[67] != 0){
      int index = 67;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[67]!=0 || suspended[67]!=0 || active[67]!=1);
      else{
        if(!df){
          simCapper_in.gethook();
          capperReady_o.gethook();
          gripperZAxisLowered.gethook();
          gripperZAxisLifted.gethook();
          gripperTurnHomePos.gethook();
          gripperTurnFinalPos.gethook();
          df = true;
        }
        runClockDomain();
      }
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      bottleAtPos4E.setpreclear();
      bottleAtPos4_67.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = gripperZAxisLowered.getStatus() ? gripperZAxisLowered.setprepresent() : gripperZAxisLowered.setpreclear();
      gripperZAxisLowered.setpreval(gripperZAxisLowered.getValue());
      gripperZAxisLowered.setClear();
      dummyint = gripperZAxisLifted.getStatus() ? gripperZAxisLifted.setprepresent() : gripperZAxisLifted.setpreclear();
      gripperZAxisLifted.setpreval(gripperZAxisLifted.getValue());
      gripperZAxisLifted.setClear();
      dummyint = gripperTurnHomePos.getStatus() ? gripperTurnHomePos.setprepresent() : gripperTurnHomePos.setpreclear();
      gripperTurnHomePos.setpreval(gripperTurnHomePos.getValue());
      gripperTurnHomePos.setClear();
      dummyint = gripperTurnFinalPos.getStatus() ? gripperTurnFinalPos.setprepresent() : gripperTurnFinalPos.setpreclear();
      gripperTurnFinalPos.setpreval(gripperTurnFinalPos.getValue());
      gripperTurnFinalPos.setClear();
      cylPos5ZaxisExtend.sethook();
      cylPos5ZaxisExtend.setClear();
      gripperTurnRetract.sethook();
      gripperTurnRetract.setClear();
      gripperTurnExtend.sethook();
      gripperTurnExtend.setClear();
      capGripperPos5Extend.sethook();
      capGripperPos5Extend.setClear();
      cylClampBottleExtend.sethook();
      cylClampBottleExtend.setClear();
      bottleAtPos4E.sethook();
      bottleAtPos4E.setClear();
      bottleAtPos4_67.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[67]!=0 || suspended[67]!=0 || active[67]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[67] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
