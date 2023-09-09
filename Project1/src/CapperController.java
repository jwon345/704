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
  private Signal bottleAtPos4_46;
  private int S30923 = 1;
  private int S30922 = 1;
  private int S27886 = 1;
  private int S27881 = 1;
  private int S28503 = 1;
  private int S27904 = 1;
  private int S27911 = 1;
  private int S27906 = 1;
  private int S27973 = 1;
  private int S28008 = 1;
  private int S27975 = 1;
  private int S27980 = 1;
  private int S27988 = 1;
  private int S27991 = 1;
  private int S28060 = 1;
  private int S28055 = 1;
  private int S28586 = 1;
  private int S28530 = 1;
  private int S28510 = 1;
  private int S28505 = 1;
  private int S28621 = 1;
  private int S28597 = 1;
  private int S28591 = 1;
  private int S28594 = 1;
  private int S28656 = 1;
  private int S28632 = 1;
  private int S28626 = 1;
  private int S28629 = 1;
  
  private int[] ends = new int[60];
  private int[] tdone = new int[60];
  
  public void thread31386(int [] tdone, int [] ends){
        S28629=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread31385(int [] tdone, int [] ends){
        S28626=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31383(int [] tdone, int [] ends){
        switch(S28629){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 482, column: 36
          ends[59]=2;
          tdone[59]=1;
        }
        else {
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
        break;
      
    }
  }

  public void thread31382(int [] tdone, int [] ends){
        switch(S28626){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread31381(int [] tdone, int [] ends){
        switch(S28656){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        switch(S28632){
          case 0 : 
            thread31382(tdone,ends);
            thread31383(tdone,ends);
            int biggest31384 = 0;
            if(ends[58]>=biggest31384){
              biggest31384=ends[58];
            }
            if(ends[59]>=biggest31384){
              biggest31384=ends[59];
            }
            if(biggest31384 == 1){
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            if(biggest31384 == 2){
              ends[57]=2;
              ;//sysj\conveyor_controller.sysj line: 476, column: 19
              S28632=1;
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            //FINXME code
            if(biggest31384 == 0){
              S28632=1;
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            break;
          
          case 1 : 
            S28632=1;
            S28632=0;
            if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 475, column: 27
              thread31385(tdone,ends);
              thread31386(tdone,ends);
              int biggest31387 = 0;
              if(ends[58]>=biggest31387){
                biggest31387=ends[58];
              }
              if(ends[59]>=biggest31387){
                biggest31387=ends[59];
              }
              if(biggest31387 == 1){
                active[57]=1;
                ends[57]=1;
                tdone[57]=1;
              }
            }
            else {
              S28632=1;
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31379(int [] tdone, int [] ends){
        S28594=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31378(int [] tdone, int [] ends){
        S28591=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 459, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31376(int [] tdone, int [] ends){
        switch(S28594){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 463, column: 37
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

  public void thread31375(int [] tdone, int [] ends){
        switch(S28591){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 459, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread31374(int [] tdone, int [] ends){
        switch(S28621){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S28597){
          case 0 : 
            thread31375(tdone,ends);
            thread31376(tdone,ends);
            int biggest31377 = 0;
            if(ends[55]>=biggest31377){
              biggest31377=ends[55];
            }
            if(ends[56]>=biggest31377){
              biggest31377=ends[56];
            }
            if(biggest31377 == 1){
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            if(biggest31377 == 2){
              ends[54]=2;
              ;//sysj\conveyor_controller.sysj line: 457, column: 20
              S28597=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            //FINXME code
            if(biggest31377 == 0){
              S28597=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 1 : 
            S28597=1;
            S28597=0;
            if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 456, column: 39
              thread31378(tdone,ends);
              thread31379(tdone,ends);
              int biggest31380 = 0;
              if(ends[55]>=biggest31380){
                biggest31380=ends[55];
              }
              if(ends[56]>=biggest31380){
                biggest31380=ends[56];
              }
              if(biggest31380 == 1){
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
            }
            else {
              S28597=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31373(int [] tdone, int [] ends){
        switch(S28586){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        switch(S28530){
          case 0 : 
            switch(S28510){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
                  S28510=1;
                  active[53]=1;
                  ends[53]=1;
                  tdone[53]=1;
                }
                else {
                  switch(S28505){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 13
                        S28505=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
                          ends[53]=2;
                          ;//sysj\conveyor_controller.sysj line: 446, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 16
                            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 14
                            currsigs.addElement(bottleAtPos4_46);
                            S28530=1;
                            active[53]=1;
                            ends[53]=1;
                            tdone[53]=1;
                          }
                          else {
                            S28530=1;
                            active[53]=1;
                            ends[53]=1;
                            tdone[53]=1;
                          }
                        }
                        else {
                          active[53]=1;
                          ends[53]=1;
                          tdone[53]=1;
                        }
                      }
                      else {
                        active[53]=1;
                        ends[53]=1;
                        tdone[53]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
                        ends[53]=2;
                        ;//sysj\conveyor_controller.sysj line: 446, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 16
                          bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 14
                          currsigs.addElement(bottleAtPos4_46);
                          S28530=1;
                          active[53]=1;
                          ends[53]=1;
                          tdone[53]=1;
                        }
                        else {
                          S28530=1;
                          active[53]=1;
                          ends[53]=1;
                          tdone[53]=1;
                        }
                      }
                      else {
                        active[53]=1;
                        ends[53]=1;
                        tdone[53]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S28510=1;
                S28510=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
                  S28510=1;
                  active[53]=1;
                  ends[53]=1;
                  tdone[53]=1;
                }
                else {
                  S28505=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 13
                    S28505=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
                      ends[53]=2;
                      ;//sysj\conveyor_controller.sysj line: 446, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 16
                        bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 14
                        currsigs.addElement(bottleAtPos4_46);
                        S28530=1;
                        active[53]=1;
                        ends[53]=1;
                        tdone[53]=1;
                      }
                      else {
                        S28530=1;
                        active[53]=1;
                        ends[53]=1;
                        tdone[53]=1;
                      }
                    }
                    else {
                      active[53]=1;
                      ends[53]=1;
                      tdone[53]=1;
                    }
                  }
                  else {
                    active[53]=1;
                    ends[53]=1;
                    tdone[53]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S28530=1;
            S28530=0;
            S28510=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
              S28510=1;
              active[53]=1;
              ends[53]=1;
              tdone[53]=1;
            }
            else {
              S28505=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 13
                S28505=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
                  ends[53]=2;
                  ;//sysj\conveyor_controller.sysj line: 446, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 16
                    bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 14
                    currsigs.addElement(bottleAtPos4_46);
                    S28530=1;
                    active[53]=1;
                    ends[53]=1;
                    tdone[53]=1;
                  }
                  else {
                    S28530=1;
                    active[53]=1;
                    ends[53]=1;
                    tdone[53]=1;
                  }
                }
                else {
                  active[53]=1;
                  ends[53]=1;
                  tdone[53]=1;
                }
              }
              else {
                active[53]=1;
                ends[53]=1;
                tdone[53]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31370(int [] tdone, int [] ends){
        switch(S27991){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 425, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 426, column: 16
          ends[52]=2;
          tdone[52]=1;
        }
        else {
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        break;
      
    }
  }

  public void thread31369(int [] tdone, int [] ends){
        switch(S27988){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 421, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
        break;
      
    }
  }

  public void thread31368(int [] tdone, int [] ends){
        switch(S27980){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 416, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
        break;
      
    }
  }

  public void thread31366(int [] tdone, int [] ends){
        S27991=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread31365(int [] tdone, int [] ends){
        S27988=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 420, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 421, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread31364(int [] tdone, int [] ends){
        S27980=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 416, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread31363(int [] tdone, int [] ends){
        switch(S28008){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        switch(S27975){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 413, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 414, column: 15
              S27975=1;
              thread31364(tdone,ends);
              thread31365(tdone,ends);
              thread31366(tdone,ends);
              int biggest31367 = 0;
              if(ends[50]>=biggest31367){
                biggest31367=ends[50];
              }
              if(ends[51]>=biggest31367){
                biggest31367=ends[51];
              }
              if(ends[52]>=biggest31367){
                biggest31367=ends[52];
              }
              if(biggest31367 == 1){
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
            thread31368(tdone,ends);
            thread31369(tdone,ends);
            thread31370(tdone,ends);
            int biggest31371 = 0;
            if(ends[50]>=biggest31371){
              biggest31371=ends[50];
            }
            if(ends[51]>=biggest31371){
              biggest31371=ends[51];
            }
            if(ends[52]>=biggest31371){
              biggest31371=ends[52];
            }
            if(biggest31371 == 1){
              active[49]=1;
              ends[49]=1;
              tdone[49]=1;
            }
            if(biggest31371 == 2){
              ends[49]=2;
              tdone[49]=1;
            }
            //FINXME code
            if(biggest31371 == 0){
              S28008=0;
              active[49]=0;
              ends[49]=0;
              tdone[49]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31362(int [] tdone, int [] ends){
        switch(S27973){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 409, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
        break;
      
    }
  }

  public void thread31360(int [] tdone, int [] ends){
        S28008=1;
    S27975=0;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread31359(int [] tdone, int [] ends){
        S27973=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 409, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread31358(int [] tdone, int [] ends){
        switch(S28503){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        switch(S27904){
          case 0 : 
            if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 388, column: 19
              S27904=1;
              S27911=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 389, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 389, column: 13
                S27911=1;
                active[47]=1;
                ends[47]=1;
                tdone[47]=1;
              }
              else {
                S27906=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 389, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 389, column: 13
                  S27906=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 389, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 389, column: 13
                    ends[47]=2;
                    ;//sysj\conveyor_controller.sysj line: 389, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 390, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 391, column: 13
                    S27904=2;
                    active[47]=1;
                    ends[47]=1;
                    tdone[47]=1;
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
            else {
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 1 : 
            switch(S27911){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 389, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 389, column: 13
                  S27911=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  switch(S27906){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 389, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 389, column: 13
                        S27906=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 389, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 389, column: 13
                          ends[47]=2;
                          ;//sysj\conveyor_controller.sysj line: 389, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 390, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 391, column: 13
                          S27904=2;
                          active[47]=1;
                          ends[47]=1;
                          tdone[47]=1;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 389, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 389, column: 13
                        ends[47]=2;
                        ;//sysj\conveyor_controller.sysj line: 389, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 390, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 391, column: 13
                        S27904=2;
                        active[47]=1;
                        ends[47]=1;
                        tdone[47]=1;
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
                S27911=1;
                S27911=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 389, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 389, column: 13
                  S27911=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  S27906=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 389, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 389, column: 13
                    S27906=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 389, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 389, column: 13
                      ends[47]=2;
                      ;//sysj\conveyor_controller.sysj line: 389, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 390, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 391, column: 13
                      S27904=2;
                      active[47]=1;
                      ends[47]=1;
                      tdone[47]=1;
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
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 396, column: 13
              S27904=3;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            else {
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 3 : 
            S27904=3;
            S27904=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 402, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 403, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 400, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 405, column: 13
              S27904=5;
              thread31359(tdone,ends);
              thread31360(tdone,ends);
              int biggest31361 = 0;
              if(ends[48]>=biggest31361){
                biggest31361=ends[48];
              }
              if(ends[49]>=biggest31361){
                biggest31361=ends[49];
              }
              if(biggest31361 == 1){
                active[47]=1;
                ends[47]=1;
                tdone[47]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 403, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 5 : 
            thread31362(tdone,ends);
            thread31363(tdone,ends);
            int biggest31372 = 0;
            if(ends[48]>=biggest31372){
              biggest31372=ends[48];
            }
            if(ends[49]>=biggest31372){
              biggest31372=ends[49];
            }
            if(biggest31372 == 1){
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            if(biggest31372 == 2){
              ends[47]=2;
              ;//sysj\conveyor_controller.sysj line: 408, column: 13
              S27904=6;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            //FINXME code
            if(biggest31372 == 0){
              S27904=6;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 432, column: 19
              S27904=7;
              S28060=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 434, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 434, column: 13
                S28060=1;
                active[47]=1;
                ends[47]=1;
                tdone[47]=1;
              }
              else {
                S28055=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 434, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 434, column: 13
                  S28055=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 434, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 434, column: 13
                    ends[47]=2;
                    ;//sysj\conveyor_controller.sysj line: 434, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 435, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 436, column: 13
                    S27904=8;
                    active[47]=1;
                    ends[47]=1;
                    tdone[47]=1;
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
            else {
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 7 : 
            switch(S28060){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 434, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 434, column: 13
                  S28060=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  switch(S28055){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 434, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 434, column: 13
                        S28055=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 434, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 434, column: 13
                          ends[47]=2;
                          ;//sysj\conveyor_controller.sysj line: 434, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 435, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 436, column: 13
                          S27904=8;
                          active[47]=1;
                          ends[47]=1;
                          tdone[47]=1;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 434, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 434, column: 13
                        ends[47]=2;
                        ;//sysj\conveyor_controller.sysj line: 434, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 435, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 436, column: 13
                        S27904=8;
                        active[47]=1;
                        ends[47]=1;
                        tdone[47]=1;
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
                S28060=1;
                S28060=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 434, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 434, column: 13
                  S28060=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  S28055=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 434, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 434, column: 13
                    S28055=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 434, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 434, column: 13
                      ends[47]=2;
                      ;//sysj\conveyor_controller.sysj line: 434, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 435, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 436, column: 13
                      S27904=8;
                      active[47]=1;
                      ends[47]=1;
                      tdone[47]=1;
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
          
          case 8 : 
            if(!bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 437, column: 19
              System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 387, column: 13
              S27904=0;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            else {
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31355(int [] tdone, int [] ends){
        S28629=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread31354(int [] tdone, int [] ends){
        S28626=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31353(int [] tdone, int [] ends){
        S28656=1;
    S28632=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 475, column: 27
      thread31354(tdone,ends);
      thread31355(tdone,ends);
      int biggest31356 = 0;
      if(ends[58]>=biggest31356){
        biggest31356=ends[58];
      }
      if(ends[59]>=biggest31356){
        biggest31356=ends[59];
      }
      if(biggest31356 == 1){
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
    else {
      S28632=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread31351(int [] tdone, int [] ends){
        S28594=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31350(int [] tdone, int [] ends){
        S28591=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 459, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31349(int [] tdone, int [] ends){
        S28621=1;
    S28597=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 456, column: 39
      thread31350(tdone,ends);
      thread31351(tdone,ends);
      int biggest31352 = 0;
      if(ends[55]>=biggest31352){
        biggest31352=ends[55];
      }
      if(ends[56]>=biggest31352){
        biggest31352=ends[56];
      }
      if(biggest31352 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S28597=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread31348(int [] tdone, int [] ends){
        S28586=1;
    S28530=0;
    S28510=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
      S28510=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      S28505=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 13
        S28505=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
          ends[53]=2;
          ;//sysj\conveyor_controller.sysj line: 446, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 16
            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 14
            currsigs.addElement(bottleAtPos4_46);
            S28530=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
          else {
            S28530=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        else {
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
      }
      else {
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
      }
    }
  }

  public void thread31347(int [] tdone, int [] ends){
        S28503=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 387, column: 13
    S27904=0;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread31344(int [] tdone, int [] ends){
        S28629=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread31343(int [] tdone, int [] ends){
        S28626=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31342(int [] tdone, int [] ends){
        S28656=1;
    S28632=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 475, column: 27
      thread31343(tdone,ends);
      thread31344(tdone,ends);
      int biggest31345 = 0;
      if(ends[58]>=biggest31345){
        biggest31345=ends[58];
      }
      if(ends[59]>=biggest31345){
        biggest31345=ends[59];
      }
      if(biggest31345 == 1){
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
    else {
      S28632=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread31340(int [] tdone, int [] ends){
        S28594=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31339(int [] tdone, int [] ends){
        S28591=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 459, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31338(int [] tdone, int [] ends){
        S28621=1;
    S28597=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 456, column: 39
      thread31339(tdone,ends);
      thread31340(tdone,ends);
      int biggest31341 = 0;
      if(ends[55]>=biggest31341){
        biggest31341=ends[55];
      }
      if(ends[56]>=biggest31341){
        biggest31341=ends[56];
      }
      if(biggest31341 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S28597=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread31337(int [] tdone, int [] ends){
        S28586=1;
    S28530=0;
    S28510=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
      S28510=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      S28505=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 13
        S28505=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
          ends[53]=2;
          ;//sysj\conveyor_controller.sysj line: 446, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 16
            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 14
            currsigs.addElement(bottleAtPos4_46);
            S28530=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
          else {
            S28530=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        else {
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
      }
      else {
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
      }
    }
  }

  public void thread31336(int [] tdone, int [] ends){
        S28503=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 387, column: 13
    S27904=0;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread31333(int [] tdone, int [] ends){
        S28629=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread31332(int [] tdone, int [] ends){
        S28626=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31331(int [] tdone, int [] ends){
        S28656=1;
    S28632=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 475, column: 27
      thread31332(tdone,ends);
      thread31333(tdone,ends);
      int biggest31334 = 0;
      if(ends[58]>=biggest31334){
        biggest31334=ends[58];
      }
      if(ends[59]>=biggest31334){
        biggest31334=ends[59];
      }
      if(biggest31334 == 1){
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
    else {
      S28632=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread31329(int [] tdone, int [] ends){
        S28594=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31328(int [] tdone, int [] ends){
        S28591=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 459, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31327(int [] tdone, int [] ends){
        S28621=1;
    S28597=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 456, column: 39
      thread31328(tdone,ends);
      thread31329(tdone,ends);
      int biggest31330 = 0;
      if(ends[55]>=biggest31330){
        biggest31330=ends[55];
      }
      if(ends[56]>=biggest31330){
        biggest31330=ends[56];
      }
      if(biggest31330 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S28597=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread31326(int [] tdone, int [] ends){
        S28586=1;
    S28530=0;
    S28510=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
      S28510=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      S28505=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 13
        S28505=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
          ends[53]=2;
          ;//sysj\conveyor_controller.sysj line: 446, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 16
            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 14
            currsigs.addElement(bottleAtPos4_46);
            S28530=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
          else {
            S28530=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        else {
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
      }
      else {
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
      }
    }
  }

  public void thread31325(int [] tdone, int [] ends){
        S28503=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 387, column: 13
    S27904=0;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread31322(int [] tdone, int [] ends){
        S28629=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread31321(int [] tdone, int [] ends){
        S28626=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31320(int [] tdone, int [] ends){
        S28656=1;
    S28632=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 475, column: 27
      thread31321(tdone,ends);
      thread31322(tdone,ends);
      int biggest31323 = 0;
      if(ends[58]>=biggest31323){
        biggest31323=ends[58];
      }
      if(ends[59]>=biggest31323){
        biggest31323=ends[59];
      }
      if(biggest31323 == 1){
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
    else {
      S28632=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread31318(int [] tdone, int [] ends){
        S28594=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31317(int [] tdone, int [] ends){
        S28591=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 459, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31316(int [] tdone, int [] ends){
        S28621=1;
    S28597=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 456, column: 39
      thread31317(tdone,ends);
      thread31318(tdone,ends);
      int biggest31319 = 0;
      if(ends[55]>=biggest31319){
        biggest31319=ends[55];
      }
      if(ends[56]>=biggest31319){
        biggest31319=ends[56];
      }
      if(biggest31319 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S28597=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread31315(int [] tdone, int [] ends){
        S28586=1;
    S28530=0;
    S28510=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
      S28510=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      S28505=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 13
        S28505=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 13
          ends[53]=2;
          ;//sysj\conveyor_controller.sysj line: 446, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 16
            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 14
            currsigs.addElement(bottleAtPos4_46);
            S28530=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
          else {
            S28530=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
        }
        else {
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
      }
      else {
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
      }
    }
  }

  public void thread31314(int [] tdone, int [] ends){
        S28503=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 387, column: 13
    S27904=0;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S30923){
        case 0 : 
          S30923=0;
          break RUN;
        
        case 1 : 
          S30923=2;
          S30923=2;
          bottleAtPos4_46.setClear();//sysj\conveyor_controller.sysj line: 381, column: 11
          S30922=0;
          S27886=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 382, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 11
            S27886=1;
            active[46]=1;
            ends[46]=1;
            break RUN;
          }
          else {
            S27881=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 382, column: 11
              S27881=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 11
                ends[46]=2;
                ;//sysj\conveyor_controller.sysj line: 382, column: 11
                S30922=1;
                thread31314(tdone,ends);
                thread31315(tdone,ends);
                thread31316(tdone,ends);
                thread31320(tdone,ends);
                int biggest31324 = 0;
                if(ends[47]>=biggest31324){
                  biggest31324=ends[47];
                }
                if(ends[53]>=biggest31324){
                  biggest31324=ends[53];
                }
                if(ends[54]>=biggest31324){
                  biggest31324=ends[54];
                }
                if(ends[57]>=biggest31324){
                  biggest31324=ends[57];
                }
                if(biggest31324 == 1){
                  active[46]=1;
                  ends[46]=1;
                  break RUN;
                }
              }
              else {
                active[46]=1;
                ends[46]=1;
                break RUN;
              }
            }
            else {
              active[46]=1;
              ends[46]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_46.setClear();//sysj\conveyor_controller.sysj line: 381, column: 11
          switch(S30922){
            case 0 : 
              switch(S27886){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 382, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 11
                    S27886=1;
                    active[46]=1;
                    ends[46]=1;
                    break RUN;
                  }
                  else {
                    switch(S27881){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 382, column: 11
                          S27881=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 11
                            ends[46]=2;
                            ;//sysj\conveyor_controller.sysj line: 382, column: 11
                            S30922=1;
                            thread31325(tdone,ends);
                            thread31326(tdone,ends);
                            thread31327(tdone,ends);
                            thread31331(tdone,ends);
                            int biggest31335 = 0;
                            if(ends[47]>=biggest31335){
                              biggest31335=ends[47];
                            }
                            if(ends[53]>=biggest31335){
                              biggest31335=ends[53];
                            }
                            if(ends[54]>=biggest31335){
                              biggest31335=ends[54];
                            }
                            if(ends[57]>=biggest31335){
                              biggest31335=ends[57];
                            }
                            if(biggest31335 == 1){
                              active[46]=1;
                              ends[46]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[46]=1;
                            ends[46]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[46]=1;
                          ends[46]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 11
                          ends[46]=2;
                          ;//sysj\conveyor_controller.sysj line: 382, column: 11
                          S30922=1;
                          thread31336(tdone,ends);
                          thread31337(tdone,ends);
                          thread31338(tdone,ends);
                          thread31342(tdone,ends);
                          int biggest31346 = 0;
                          if(ends[47]>=biggest31346){
                            biggest31346=ends[47];
                          }
                          if(ends[53]>=biggest31346){
                            biggest31346=ends[53];
                          }
                          if(ends[54]>=biggest31346){
                            biggest31346=ends[54];
                          }
                          if(ends[57]>=biggest31346){
                            biggest31346=ends[57];
                          }
                          if(biggest31346 == 1){
                            active[46]=1;
                            ends[46]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[46]=1;
                          ends[46]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S27886=1;
                  S27886=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 382, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 11
                    S27886=1;
                    active[46]=1;
                    ends[46]=1;
                    break RUN;
                  }
                  else {
                    S27881=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 382, column: 11
                      S27881=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 11
                        ends[46]=2;
                        ;//sysj\conveyor_controller.sysj line: 382, column: 11
                        S30922=1;
                        thread31347(tdone,ends);
                        thread31348(tdone,ends);
                        thread31349(tdone,ends);
                        thread31353(tdone,ends);
                        int biggest31357 = 0;
                        if(ends[47]>=biggest31357){
                          biggest31357=ends[47];
                        }
                        if(ends[53]>=biggest31357){
                          biggest31357=ends[53];
                        }
                        if(ends[54]>=biggest31357){
                          biggest31357=ends[54];
                        }
                        if(ends[57]>=biggest31357){
                          biggest31357=ends[57];
                        }
                        if(biggest31357 == 1){
                          active[46]=1;
                          ends[46]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[46]=1;
                        ends[46]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[46]=1;
                      ends[46]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread31358(tdone,ends);
              thread31373(tdone,ends);
              thread31374(tdone,ends);
              thread31381(tdone,ends);
              int biggest31388 = 0;
              if(ends[47]>=biggest31388){
                biggest31388=ends[47];
              }
              if(ends[53]>=biggest31388){
                biggest31388=ends[53];
              }
              if(ends[54]>=biggest31388){
                biggest31388=ends[54];
              }
              if(ends[57]>=biggest31388){
                biggest31388=ends[57];
              }
              if(biggest31388 == 1){
                active[46]=1;
                ends[46]=1;
                break RUN;
              }
              //FINXME code
              if(biggest31388 == 0){
                S30923=0;
                active[46]=0;
                ends[46]=0;
                S30923=0;
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
    bottleAtPos4_46 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[46] != 0){
      int index = 46;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[46]!=0 || suspended[46]!=0 || active[46]!=1);
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
      bottleAtPos4_46.setpreclear();
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
      bottleAtPos4_46.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[46]!=0 || suspended[46]!=0 || active[46]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[46] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
