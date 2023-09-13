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
  private Signal bottleAtPos4_82;
  private Signal done_82;
  private int S148218 = 1;
  private int S148217 = 1;
  private int S142461 = 1;
  private int S142456 = 1;
  private int S143758 = 1;
  private int S142479 = 1;
  private int S142486 = 1;
  private int S142481 = 1;
  private int S142548 = 1;
  private int S142583 = 1;
  private int S142550 = 1;
  private int S142555 = 1;
  private int S142563 = 1;
  private int S142566 = 1;
  private int S142635 = 1;
  private int S142630 = 1;
  private int S142686 = 1;
  private int S143841 = 1;
  private int S143785 = 1;
  private int S143765 = 1;
  private int S143760 = 1;
  private int S143876 = 1;
  private int S143852 = 1;
  private int S143846 = 1;
  private int S143849 = 1;
  private int S143911 = 1;
  private int S143887 = 1;
  private int S143881 = 1;
  private int S143884 = 1;
  
  private int[] ends = new int[109];
  private int[] tdone = new int[109];
  
  public void thread202025(int [] tdone, int [] ends){
        S143884=1;
    active[95]=1;
    ends[95]=1;
    tdone[95]=1;
  }

  public void thread202024(int [] tdone, int [] ends){
        S143881=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 770, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[94]=1;
    ends[94]=1;
    tdone[94]=1;
  }

  public void thread202022(int [] tdone, int [] ends){
        switch(S143884){
      case 0 : 
        active[95]=0;
        ends[95]=0;
        tdone[95]=1;
        break;
      
      case 1 : 
        if(done_82.getprestatus()){//sysj\conveyor_controller.sysj line: 774, column: 36
          ends[95]=2;
          tdone[95]=1;
        }
        else {
          active[95]=1;
          ends[95]=1;
          tdone[95]=1;
        }
        break;
      
    }
  }

  public void thread202021(int [] tdone, int [] ends){
        switch(S143881){
      case 0 : 
        active[94]=0;
        ends[94]=0;
        tdone[94]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 770, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[94]=1;
        ends[94]=1;
        tdone[94]=1;
        break;
      
    }
  }

  public void thread202020(int [] tdone, int [] ends){
        switch(S143911){
      case 0 : 
        active[93]=0;
        ends[93]=0;
        tdone[93]=1;
        break;
      
      case 1 : 
        switch(S143887){
          case 0 : 
            thread202021(tdone,ends);
            thread202022(tdone,ends);
            int biggest202023 = 0;
            if(ends[94]>=biggest202023){
              biggest202023=ends[94];
            }
            if(ends[95]>=biggest202023){
              biggest202023=ends[95];
            }
            if(biggest202023 == 1){
              active[93]=1;
              ends[93]=1;
              tdone[93]=1;
            }
            if(biggest202023 == 2){
              ends[93]=2;
              ;//sysj\conveyor_controller.sysj line: 768, column: 19
              S143887=1;
              active[93]=1;
              ends[93]=1;
              tdone[93]=1;
            }
            //FINXME code
            if(biggest202023 == 0){
              S143887=1;
              active[93]=1;
              ends[93]=1;
              tdone[93]=1;
            }
            break;
          
          case 1 : 
            S143887=1;
            S143887=0;
            if(bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 767, column: 27
              thread202024(tdone,ends);
              thread202025(tdone,ends);
              int biggest202026 = 0;
              if(ends[94]>=biggest202026){
                biggest202026=ends[94];
              }
              if(ends[95]>=biggest202026){
                biggest202026=ends[95];
              }
              if(biggest202026 == 1){
                active[93]=1;
                ends[93]=1;
                tdone[93]=1;
              }
            }
            else {
              S143887=1;
              active[93]=1;
              ends[93]=1;
              tdone[93]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202018(int [] tdone, int [] ends){
        S143849=1;
    active[92]=1;
    ends[92]=1;
    tdone[92]=1;
  }

  public void thread202017(int [] tdone, int [] ends){
        S143846=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 751, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread202015(int [] tdone, int [] ends){
        switch(S143849){
      case 0 : 
        active[92]=0;
        ends[92]=0;
        tdone[92]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 755, column: 37
          ends[92]=2;
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

  public void thread202014(int [] tdone, int [] ends){
        switch(S143846){
      case 0 : 
        active[91]=0;
        ends[91]=0;
        tdone[91]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 751, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[91]=1;
        ends[91]=1;
        tdone[91]=1;
        break;
      
    }
  }

  public void thread202013(int [] tdone, int [] ends){
        switch(S143876){
      case 0 : 
        active[90]=0;
        ends[90]=0;
        tdone[90]=1;
        break;
      
      case 1 : 
        switch(S143852){
          case 0 : 
            thread202014(tdone,ends);
            thread202015(tdone,ends);
            int biggest202016 = 0;
            if(ends[91]>=biggest202016){
              biggest202016=ends[91];
            }
            if(ends[92]>=biggest202016){
              biggest202016=ends[92];
            }
            if(biggest202016 == 1){
              active[90]=1;
              ends[90]=1;
              tdone[90]=1;
            }
            if(biggest202016 == 2){
              ends[90]=2;
              ;//sysj\conveyor_controller.sysj line: 749, column: 20
              S143852=1;
              active[90]=1;
              ends[90]=1;
              tdone[90]=1;
            }
            //FINXME code
            if(biggest202016 == 0){
              S143852=1;
              active[90]=1;
              ends[90]=1;
              tdone[90]=1;
            }
            break;
          
          case 1 : 
            S143852=1;
            S143852=0;
            if(bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 748, column: 39
              thread202017(tdone,ends);
              thread202018(tdone,ends);
              int biggest202019 = 0;
              if(ends[91]>=biggest202019){
                biggest202019=ends[91];
              }
              if(ends[92]>=biggest202019){
                biggest202019=ends[92];
              }
              if(biggest202019 == 1){
                active[90]=1;
                ends[90]=1;
                tdone[90]=1;
              }
            }
            else {
              S143852=1;
              active[90]=1;
              ends[90]=1;
              tdone[90]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202012(int [] tdone, int [] ends){
        switch(S143841){
      case 0 : 
        active[89]=0;
        ends[89]=0;
        tdone[89]=1;
        break;
      
      case 1 : 
        switch(S143785){
          case 0 : 
            switch(S143765){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 735, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
                  S143765=1;
                  active[89]=1;
                  ends[89]=1;
                  tdone[89]=1;
                }
                else {
                  switch(S143760){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 735, column: 13
                        S143760=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
                          ends[89]=2;
                          ;//sysj\conveyor_controller.sysj line: 735, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 736, column: 16
                            bottleAtPos4_82.setPresent();//sysj\conveyor_controller.sysj line: 737, column: 14
                            currsigs.addElement(bottleAtPos4_82);
                            S143785=1;
                            active[89]=1;
                            ends[89]=1;
                            tdone[89]=1;
                          }
                          else {
                            done_82.setPresent();//sysj\conveyor_controller.sysj line: 740, column: 14
                            currsigs.addElement(done_82);
                            S143785=1;
                            active[89]=1;
                            ends[89]=1;
                            tdone[89]=1;
                          }
                        }
                        else {
                          active[89]=1;
                          ends[89]=1;
                          tdone[89]=1;
                        }
                      }
                      else {
                        active[89]=1;
                        ends[89]=1;
                        tdone[89]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
                        ends[89]=2;
                        ;//sysj\conveyor_controller.sysj line: 735, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 736, column: 16
                          bottleAtPos4_82.setPresent();//sysj\conveyor_controller.sysj line: 737, column: 14
                          currsigs.addElement(bottleAtPos4_82);
                          S143785=1;
                          active[89]=1;
                          ends[89]=1;
                          tdone[89]=1;
                        }
                        else {
                          done_82.setPresent();//sysj\conveyor_controller.sysj line: 740, column: 14
                          currsigs.addElement(done_82);
                          S143785=1;
                          active[89]=1;
                          ends[89]=1;
                          tdone[89]=1;
                        }
                      }
                      else {
                        active[89]=1;
                        ends[89]=1;
                        tdone[89]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S143765=1;
                S143765=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 735, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
                  S143765=1;
                  active[89]=1;
                  ends[89]=1;
                  tdone[89]=1;
                }
                else {
                  S143760=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 735, column: 13
                    S143760=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
                      ends[89]=2;
                      ;//sysj\conveyor_controller.sysj line: 735, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 736, column: 16
                        bottleAtPos4_82.setPresent();//sysj\conveyor_controller.sysj line: 737, column: 14
                        currsigs.addElement(bottleAtPos4_82);
                        S143785=1;
                        active[89]=1;
                        ends[89]=1;
                        tdone[89]=1;
                      }
                      else {
                        done_82.setPresent();//sysj\conveyor_controller.sysj line: 740, column: 14
                        currsigs.addElement(done_82);
                        S143785=1;
                        active[89]=1;
                        ends[89]=1;
                        tdone[89]=1;
                      }
                    }
                    else {
                      active[89]=1;
                      ends[89]=1;
                      tdone[89]=1;
                    }
                  }
                  else {
                    active[89]=1;
                    ends[89]=1;
                    tdone[89]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S143785=1;
            S143785=0;
            S143765=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 735, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
              S143765=1;
              active[89]=1;
              ends[89]=1;
              tdone[89]=1;
            }
            else {
              S143760=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 735, column: 13
                S143760=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
                  ends[89]=2;
                  ;//sysj\conveyor_controller.sysj line: 735, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 736, column: 16
                    bottleAtPos4_82.setPresent();//sysj\conveyor_controller.sysj line: 737, column: 14
                    currsigs.addElement(bottleAtPos4_82);
                    S143785=1;
                    active[89]=1;
                    ends[89]=1;
                    tdone[89]=1;
                  }
                  else {
                    done_82.setPresent();//sysj\conveyor_controller.sysj line: 740, column: 14
                    currsigs.addElement(done_82);
                    S143785=1;
                    active[89]=1;
                    ends[89]=1;
                    tdone[89]=1;
                  }
                }
                else {
                  active[89]=1;
                  ends[89]=1;
                  tdone[89]=1;
                }
              }
              else {
                active[89]=1;
                ends[89]=1;
                tdone[89]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202009(int [] tdone, int [] ends){
        switch(S142566){
      case 0 : 
        active[88]=0;
        ends[88]=0;
        tdone[88]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 705, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 706, column: 16
          ends[88]=2;
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

  public void thread202008(int [] tdone, int [] ends){
        switch(S142563){
      case 0 : 
        active[87]=0;
        ends[87]=0;
        tdone[87]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 701, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[87]=1;
        ends[87]=1;
        tdone[87]=1;
        break;
      
    }
  }

  public void thread202007(int [] tdone, int [] ends){
        switch(S142555){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 696, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
        break;
      
    }
  }

  public void thread202005(int [] tdone, int [] ends){
        S142566=1;
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread202004(int [] tdone, int [] ends){
        S142563=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 700, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 701, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread202003(int [] tdone, int [] ends){
        S142555=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 696, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread202002(int [] tdone, int [] ends){
        switch(S142583){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        switch(S142550){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 693, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 694, column: 15
              S142550=1;
              thread202003(tdone,ends);
              thread202004(tdone,ends);
              thread202005(tdone,ends);
              int biggest202006 = 0;
              if(ends[86]>=biggest202006){
                biggest202006=ends[86];
              }
              if(ends[87]>=biggest202006){
                biggest202006=ends[87];
              }
              if(ends[88]>=biggest202006){
                biggest202006=ends[88];
              }
              if(biggest202006 == 1){
                active[85]=1;
                ends[85]=1;
                tdone[85]=1;
              }
            }
            else {
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            break;
          
          case 1 : 
            thread202007(tdone,ends);
            thread202008(tdone,ends);
            thread202009(tdone,ends);
            int biggest202010 = 0;
            if(ends[86]>=biggest202010){
              biggest202010=ends[86];
            }
            if(ends[87]>=biggest202010){
              biggest202010=ends[87];
            }
            if(ends[88]>=biggest202010){
              biggest202010=ends[88];
            }
            if(biggest202010 == 1){
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            if(biggest202010 == 2){
              ends[85]=2;
              tdone[85]=1;
            }
            //FINXME code
            if(biggest202010 == 0){
              S142583=0;
              active[85]=0;
              ends[85]=0;
              tdone[85]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202001(int [] tdone, int [] ends){
        switch(S142548){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 689, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
        break;
      
    }
  }

  public void thread201999(int [] tdone, int [] ends){
        S142583=1;
    S142550=0;
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread201998(int [] tdone, int [] ends){
        S142548=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 689, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[84]=1;
    ends[84]=1;
    tdone[84]=1;
  }

  public void thread201997(int [] tdone, int [] ends){
        switch(S143758){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        switch(S142479){
          case 0 : 
            if(bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 668, column: 19
              S142479=1;
              S142486=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 669, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 669, column: 13
                S142486=1;
                active[83]=1;
                ends[83]=1;
                tdone[83]=1;
              }
              else {
                S142481=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 669, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 669, column: 13
                  S142481=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 669, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 669, column: 13
                    ends[83]=2;
                    ;//sysj\conveyor_controller.sysj line: 669, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 670, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 671, column: 13
                    S142479=2;
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
            switch(S142486){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 669, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 669, column: 13
                  S142486=1;
                  active[83]=1;
                  ends[83]=1;
                  tdone[83]=1;
                }
                else {
                  switch(S142481){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 669, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 669, column: 13
                        S142481=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 669, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 669, column: 13
                          ends[83]=2;
                          ;//sysj\conveyor_controller.sysj line: 669, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 670, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 671, column: 13
                          S142479=2;
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
                      else {
                        active[83]=1;
                        ends[83]=1;
                        tdone[83]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 669, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 669, column: 13
                        ends[83]=2;
                        ;//sysj\conveyor_controller.sysj line: 669, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 670, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 671, column: 13
                        S142479=2;
                        active[83]=1;
                        ends[83]=1;
                        tdone[83]=1;
                      }
                      else {
                        active[83]=1;
                        ends[83]=1;
                        tdone[83]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S142486=1;
                S142486=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 669, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 669, column: 13
                  S142486=1;
                  active[83]=1;
                  ends[83]=1;
                  tdone[83]=1;
                }
                else {
                  S142481=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 669, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 669, column: 13
                    S142481=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 669, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 669, column: 13
                      ends[83]=2;
                      ;//sysj\conveyor_controller.sysj line: 669, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 670, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 671, column: 13
                      S142479=2;
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
                  else {
                    active[83]=1;
                    ends[83]=1;
                    tdone[83]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 672, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 676, column: 13
              S142479=3;
              active[83]=1;
              ends[83]=1;
              tdone[83]=1;
            }
            else {
              active[83]=1;
              ends[83]=1;
              tdone[83]=1;
            }
            break;
          
          case 3 : 
            S142479=3;
            S142479=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 682, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 683, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[83]=1;
            ends[83]=1;
            tdone[83]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 680, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 685, column: 13
              S142479=5;
              thread201998(tdone,ends);
              thread201999(tdone,ends);
              int biggest202000 = 0;
              if(ends[84]>=biggest202000){
                biggest202000=ends[84];
              }
              if(ends[85]>=biggest202000){
                biggest202000=ends[85];
              }
              if(biggest202000 == 1){
                active[83]=1;
                ends[83]=1;
                tdone[83]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 683, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[83]=1;
              ends[83]=1;
              tdone[83]=1;
            }
            break;
          
          case 5 : 
            thread202001(tdone,ends);
            thread202002(tdone,ends);
            int biggest202011 = 0;
            if(ends[84]>=biggest202011){
              biggest202011=ends[84];
            }
            if(ends[85]>=biggest202011){
              biggest202011=ends[85];
            }
            if(biggest202011 == 1){
              active[83]=1;
              ends[83]=1;
              tdone[83]=1;
            }
            if(biggest202011 == 2){
              ends[83]=2;
              ;//sysj\conveyor_controller.sysj line: 688, column: 13
              S142479=6;
              active[83]=1;
              ends[83]=1;
              tdone[83]=1;
            }
            //FINXME code
            if(biggest202011 == 0){
              S142479=6;
              active[83]=1;
              ends[83]=1;
              tdone[83]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 712, column: 19
              S142479=7;
              S142635=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 714, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 714, column: 13
                S142635=1;
                active[83]=1;
                ends[83]=1;
                tdone[83]=1;
              }
              else {
                S142630=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 714, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 714, column: 13
                  S142630=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 714, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 714, column: 13
                    ends[83]=2;
                    ;//sysj\conveyor_controller.sysj line: 714, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 715, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 716, column: 13
                    S142479=8;
                    S142686=0;
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
          
          case 7 : 
            switch(S142635){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 714, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 714, column: 13
                  S142635=1;
                  active[83]=1;
                  ends[83]=1;
                  tdone[83]=1;
                }
                else {
                  switch(S142630){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 714, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 714, column: 13
                        S142630=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 714, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 714, column: 13
                          ends[83]=2;
                          ;//sysj\conveyor_controller.sysj line: 714, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 715, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 716, column: 13
                          S142479=8;
                          S142686=0;
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
                      else {
                        active[83]=1;
                        ends[83]=1;
                        tdone[83]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 714, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 714, column: 13
                        ends[83]=2;
                        ;//sysj\conveyor_controller.sysj line: 714, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 715, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 716, column: 13
                        S142479=8;
                        S142686=0;
                        active[83]=1;
                        ends[83]=1;
                        tdone[83]=1;
                      }
                      else {
                        active[83]=1;
                        ends[83]=1;
                        tdone[83]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S142635=1;
                S142635=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 714, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 714, column: 13
                  S142635=1;
                  active[83]=1;
                  ends[83]=1;
                  tdone[83]=1;
                }
                else {
                  S142630=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 714, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 714, column: 13
                    S142630=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 714, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 714, column: 13
                      ends[83]=2;
                      ;//sysj\conveyor_controller.sysj line: 714, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 715, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 716, column: 13
                      S142479=8;
                      S142686=0;
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
                  else {
                    active[83]=1;
                    ends[83]=1;
                    tdone[83]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S142686){
              case 0 : 
                if(!bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 717, column: 29
                  S142686=1;
                  if(bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 719, column: 23
                    active[83]=1;
                    ends[83]=1;
                    tdone[83]=1;
                  }
                  else {
                    ends[83]=2;
                    ;//sysj\conveyor_controller.sysj line: 717, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 667, column: 13
                    S142479=0;
                    active[83]=1;
                    ends[83]=1;
                    tdone[83]=1;
                  }
                }
                else {
                  active[83]=1;
                  ends[83]=1;
                  tdone[83]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 719, column: 23
                  active[83]=1;
                  ends[83]=1;
                  tdone[83]=1;
                }
                else {
                  ends[83]=2;
                  ;//sysj\conveyor_controller.sysj line: 717, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 667, column: 13
                  S142479=0;
                  active[83]=1;
                  ends[83]=1;
                  tdone[83]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread201994(int [] tdone, int [] ends){
        S143884=1;
    active[95]=1;
    ends[95]=1;
    tdone[95]=1;
  }

  public void thread201993(int [] tdone, int [] ends){
        S143881=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 770, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[94]=1;
    ends[94]=1;
    tdone[94]=1;
  }

  public void thread201992(int [] tdone, int [] ends){
        S143911=1;
    S143887=0;
    if(bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 767, column: 27
      thread201993(tdone,ends);
      thread201994(tdone,ends);
      int biggest201995 = 0;
      if(ends[94]>=biggest201995){
        biggest201995=ends[94];
      }
      if(ends[95]>=biggest201995){
        biggest201995=ends[95];
      }
      if(biggest201995 == 1){
        active[93]=1;
        ends[93]=1;
        tdone[93]=1;
      }
    }
    else {
      S143887=1;
      active[93]=1;
      ends[93]=1;
      tdone[93]=1;
    }
  }

  public void thread201990(int [] tdone, int [] ends){
        S143849=1;
    active[92]=1;
    ends[92]=1;
    tdone[92]=1;
  }

  public void thread201989(int [] tdone, int [] ends){
        S143846=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 751, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread201988(int [] tdone, int [] ends){
        S143876=1;
    S143852=0;
    if(bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 748, column: 39
      thread201989(tdone,ends);
      thread201990(tdone,ends);
      int biggest201991 = 0;
      if(ends[91]>=biggest201991){
        biggest201991=ends[91];
      }
      if(ends[92]>=biggest201991){
        biggest201991=ends[92];
      }
      if(biggest201991 == 1){
        active[90]=1;
        ends[90]=1;
        tdone[90]=1;
      }
    }
    else {
      S143852=1;
      active[90]=1;
      ends[90]=1;
      tdone[90]=1;
    }
  }

  public void thread201987(int [] tdone, int [] ends){
        S143841=1;
    S143785=0;
    S143765=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 735, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
      S143765=1;
      active[89]=1;
      ends[89]=1;
      tdone[89]=1;
    }
    else {
      S143760=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 735, column: 13
        S143760=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
          ends[89]=2;
          ;//sysj\conveyor_controller.sysj line: 735, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 736, column: 16
            bottleAtPos4_82.setPresent();//sysj\conveyor_controller.sysj line: 737, column: 14
            currsigs.addElement(bottleAtPos4_82);
            S143785=1;
            active[89]=1;
            ends[89]=1;
            tdone[89]=1;
          }
          else {
            done_82.setPresent();//sysj\conveyor_controller.sysj line: 740, column: 14
            currsigs.addElement(done_82);
            S143785=1;
            active[89]=1;
            ends[89]=1;
            tdone[89]=1;
          }
        }
        else {
          active[89]=1;
          ends[89]=1;
          tdone[89]=1;
        }
      }
      else {
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
      }
    }
  }

  public void thread201986(int [] tdone, int [] ends){
        S143758=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 667, column: 13
    S142479=0;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread201983(int [] tdone, int [] ends){
        S143884=1;
    active[95]=1;
    ends[95]=1;
    tdone[95]=1;
  }

  public void thread201982(int [] tdone, int [] ends){
        S143881=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 770, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[94]=1;
    ends[94]=1;
    tdone[94]=1;
  }

  public void thread201981(int [] tdone, int [] ends){
        S143911=1;
    S143887=0;
    if(bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 767, column: 27
      thread201982(tdone,ends);
      thread201983(tdone,ends);
      int biggest201984 = 0;
      if(ends[94]>=biggest201984){
        biggest201984=ends[94];
      }
      if(ends[95]>=biggest201984){
        biggest201984=ends[95];
      }
      if(biggest201984 == 1){
        active[93]=1;
        ends[93]=1;
        tdone[93]=1;
      }
    }
    else {
      S143887=1;
      active[93]=1;
      ends[93]=1;
      tdone[93]=1;
    }
  }

  public void thread201979(int [] tdone, int [] ends){
        S143849=1;
    active[92]=1;
    ends[92]=1;
    tdone[92]=1;
  }

  public void thread201978(int [] tdone, int [] ends){
        S143846=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 751, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread201977(int [] tdone, int [] ends){
        S143876=1;
    S143852=0;
    if(bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 748, column: 39
      thread201978(tdone,ends);
      thread201979(tdone,ends);
      int biggest201980 = 0;
      if(ends[91]>=biggest201980){
        biggest201980=ends[91];
      }
      if(ends[92]>=biggest201980){
        biggest201980=ends[92];
      }
      if(biggest201980 == 1){
        active[90]=1;
        ends[90]=1;
        tdone[90]=1;
      }
    }
    else {
      S143852=1;
      active[90]=1;
      ends[90]=1;
      tdone[90]=1;
    }
  }

  public void thread201976(int [] tdone, int [] ends){
        S143841=1;
    S143785=0;
    S143765=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 735, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
      S143765=1;
      active[89]=1;
      ends[89]=1;
      tdone[89]=1;
    }
    else {
      S143760=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 735, column: 13
        S143760=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
          ends[89]=2;
          ;//sysj\conveyor_controller.sysj line: 735, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 736, column: 16
            bottleAtPos4_82.setPresent();//sysj\conveyor_controller.sysj line: 737, column: 14
            currsigs.addElement(bottleAtPos4_82);
            S143785=1;
            active[89]=1;
            ends[89]=1;
            tdone[89]=1;
          }
          else {
            done_82.setPresent();//sysj\conveyor_controller.sysj line: 740, column: 14
            currsigs.addElement(done_82);
            S143785=1;
            active[89]=1;
            ends[89]=1;
            tdone[89]=1;
          }
        }
        else {
          active[89]=1;
          ends[89]=1;
          tdone[89]=1;
        }
      }
      else {
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
      }
    }
  }

  public void thread201975(int [] tdone, int [] ends){
        S143758=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 667, column: 13
    S142479=0;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread201972(int [] tdone, int [] ends){
        S143884=1;
    active[95]=1;
    ends[95]=1;
    tdone[95]=1;
  }

  public void thread201971(int [] tdone, int [] ends){
        S143881=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 770, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[94]=1;
    ends[94]=1;
    tdone[94]=1;
  }

  public void thread201970(int [] tdone, int [] ends){
        S143911=1;
    S143887=0;
    if(bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 767, column: 27
      thread201971(tdone,ends);
      thread201972(tdone,ends);
      int biggest201973 = 0;
      if(ends[94]>=biggest201973){
        biggest201973=ends[94];
      }
      if(ends[95]>=biggest201973){
        biggest201973=ends[95];
      }
      if(biggest201973 == 1){
        active[93]=1;
        ends[93]=1;
        tdone[93]=1;
      }
    }
    else {
      S143887=1;
      active[93]=1;
      ends[93]=1;
      tdone[93]=1;
    }
  }

  public void thread201968(int [] tdone, int [] ends){
        S143849=1;
    active[92]=1;
    ends[92]=1;
    tdone[92]=1;
  }

  public void thread201967(int [] tdone, int [] ends){
        S143846=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 751, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread201966(int [] tdone, int [] ends){
        S143876=1;
    S143852=0;
    if(bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 748, column: 39
      thread201967(tdone,ends);
      thread201968(tdone,ends);
      int biggest201969 = 0;
      if(ends[91]>=biggest201969){
        biggest201969=ends[91];
      }
      if(ends[92]>=biggest201969){
        biggest201969=ends[92];
      }
      if(biggest201969 == 1){
        active[90]=1;
        ends[90]=1;
        tdone[90]=1;
      }
    }
    else {
      S143852=1;
      active[90]=1;
      ends[90]=1;
      tdone[90]=1;
    }
  }

  public void thread201965(int [] tdone, int [] ends){
        S143841=1;
    S143785=0;
    S143765=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 735, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
      S143765=1;
      active[89]=1;
      ends[89]=1;
      tdone[89]=1;
    }
    else {
      S143760=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 735, column: 13
        S143760=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
          ends[89]=2;
          ;//sysj\conveyor_controller.sysj line: 735, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 736, column: 16
            bottleAtPos4_82.setPresent();//sysj\conveyor_controller.sysj line: 737, column: 14
            currsigs.addElement(bottleAtPos4_82);
            S143785=1;
            active[89]=1;
            ends[89]=1;
            tdone[89]=1;
          }
          else {
            done_82.setPresent();//sysj\conveyor_controller.sysj line: 740, column: 14
            currsigs.addElement(done_82);
            S143785=1;
            active[89]=1;
            ends[89]=1;
            tdone[89]=1;
          }
        }
        else {
          active[89]=1;
          ends[89]=1;
          tdone[89]=1;
        }
      }
      else {
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
      }
    }
  }

  public void thread201964(int [] tdone, int [] ends){
        S143758=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 667, column: 13
    S142479=0;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread201961(int [] tdone, int [] ends){
        S143884=1;
    active[95]=1;
    ends[95]=1;
    tdone[95]=1;
  }

  public void thread201960(int [] tdone, int [] ends){
        S143881=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 770, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[94]=1;
    ends[94]=1;
    tdone[94]=1;
  }

  public void thread201959(int [] tdone, int [] ends){
        S143911=1;
    S143887=0;
    if(bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 767, column: 27
      thread201960(tdone,ends);
      thread201961(tdone,ends);
      int biggest201962 = 0;
      if(ends[94]>=biggest201962){
        biggest201962=ends[94];
      }
      if(ends[95]>=biggest201962){
        biggest201962=ends[95];
      }
      if(biggest201962 == 1){
        active[93]=1;
        ends[93]=1;
        tdone[93]=1;
      }
    }
    else {
      S143887=1;
      active[93]=1;
      ends[93]=1;
      tdone[93]=1;
    }
  }

  public void thread201957(int [] tdone, int [] ends){
        S143849=1;
    active[92]=1;
    ends[92]=1;
    tdone[92]=1;
  }

  public void thread201956(int [] tdone, int [] ends){
        S143846=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 751, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread201955(int [] tdone, int [] ends){
        S143876=1;
    S143852=0;
    if(bottleAtPos4_82.getprestatus()){//sysj\conveyor_controller.sysj line: 748, column: 39
      thread201956(tdone,ends);
      thread201957(tdone,ends);
      int biggest201958 = 0;
      if(ends[91]>=biggest201958){
        biggest201958=ends[91];
      }
      if(ends[92]>=biggest201958){
        biggest201958=ends[92];
      }
      if(biggest201958 == 1){
        active[90]=1;
        ends[90]=1;
        tdone[90]=1;
      }
    }
    else {
      S143852=1;
      active[90]=1;
      ends[90]=1;
      tdone[90]=1;
    }
  }

  public void thread201954(int [] tdone, int [] ends){
        S143841=1;
    S143785=0;
    S143765=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 735, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
      S143765=1;
      active[89]=1;
      ends[89]=1;
      tdone[89]=1;
    }
    else {
      S143760=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 735, column: 13
        S143760=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 735, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 735, column: 13
          ends[89]=2;
          ;//sysj\conveyor_controller.sysj line: 735, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 736, column: 16
            bottleAtPos4_82.setPresent();//sysj\conveyor_controller.sysj line: 737, column: 14
            currsigs.addElement(bottleAtPos4_82);
            S143785=1;
            active[89]=1;
            ends[89]=1;
            tdone[89]=1;
          }
          else {
            done_82.setPresent();//sysj\conveyor_controller.sysj line: 740, column: 14
            currsigs.addElement(done_82);
            S143785=1;
            active[89]=1;
            ends[89]=1;
            tdone[89]=1;
          }
        }
        else {
          active[89]=1;
          ends[89]=1;
          tdone[89]=1;
        }
      }
      else {
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
      }
    }
  }

  public void thread201953(int [] tdone, int [] ends){
        S143758=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 667, column: 13
    S142479=0;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S148218){
        case 0 : 
          S148218=0;
          break RUN;
        
        case 1 : 
          S148218=2;
          S148218=2;
          bottleAtPos4_82.setClear();//sysj\conveyor_controller.sysj line: 661, column: 11
          done_82.setClear();//sysj\conveyor_controller.sysj line: 661, column: 11
          S148217=0;
          S142461=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 11
            S142461=1;
            active[82]=1;
            ends[82]=1;
            break RUN;
          }
          else {
            S142456=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 662, column: 11
              S142456=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 11
                ends[82]=2;
                ;//sysj\conveyor_controller.sysj line: 662, column: 11
                S148217=1;
                thread201953(tdone,ends);
                thread201954(tdone,ends);
                thread201955(tdone,ends);
                thread201959(tdone,ends);
                int biggest201963 = 0;
                if(ends[83]>=biggest201963){
                  biggest201963=ends[83];
                }
                if(ends[89]>=biggest201963){
                  biggest201963=ends[89];
                }
                if(ends[90]>=biggest201963){
                  biggest201963=ends[90];
                }
                if(ends[93]>=biggest201963){
                  biggest201963=ends[93];
                }
                if(biggest201963 == 1){
                  active[82]=1;
                  ends[82]=1;
                  break RUN;
                }
              }
              else {
                active[82]=1;
                ends[82]=1;
                break RUN;
              }
            }
            else {
              active[82]=1;
              ends[82]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_82.setClear();//sysj\conveyor_controller.sysj line: 661, column: 11
          done_82.setClear();//sysj\conveyor_controller.sysj line: 661, column: 11
          switch(S148217){
            case 0 : 
              switch(S142461){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 11
                    S142461=1;
                    active[82]=1;
                    ends[82]=1;
                    break RUN;
                  }
                  else {
                    switch(S142456){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 662, column: 11
                          S142456=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 11
                            ends[82]=2;
                            ;//sysj\conveyor_controller.sysj line: 662, column: 11
                            S148217=1;
                            thread201964(tdone,ends);
                            thread201965(tdone,ends);
                            thread201966(tdone,ends);
                            thread201970(tdone,ends);
                            int biggest201974 = 0;
                            if(ends[83]>=biggest201974){
                              biggest201974=ends[83];
                            }
                            if(ends[89]>=biggest201974){
                              biggest201974=ends[89];
                            }
                            if(ends[90]>=biggest201974){
                              biggest201974=ends[90];
                            }
                            if(ends[93]>=biggest201974){
                              biggest201974=ends[93];
                            }
                            if(biggest201974 == 1){
                              active[82]=1;
                              ends[82]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[82]=1;
                            ends[82]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[82]=1;
                          ends[82]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 11
                          ends[82]=2;
                          ;//sysj\conveyor_controller.sysj line: 662, column: 11
                          S148217=1;
                          thread201975(tdone,ends);
                          thread201976(tdone,ends);
                          thread201977(tdone,ends);
                          thread201981(tdone,ends);
                          int biggest201985 = 0;
                          if(ends[83]>=biggest201985){
                            biggest201985=ends[83];
                          }
                          if(ends[89]>=biggest201985){
                            biggest201985=ends[89];
                          }
                          if(ends[90]>=biggest201985){
                            biggest201985=ends[90];
                          }
                          if(ends[93]>=biggest201985){
                            biggest201985=ends[93];
                          }
                          if(biggest201985 == 1){
                            active[82]=1;
                            ends[82]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[82]=1;
                          ends[82]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S142461=1;
                  S142461=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 11
                    S142461=1;
                    active[82]=1;
                    ends[82]=1;
                    break RUN;
                  }
                  else {
                    S142456=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 662, column: 11
                      S142456=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 11
                        ends[82]=2;
                        ;//sysj\conveyor_controller.sysj line: 662, column: 11
                        S148217=1;
                        thread201986(tdone,ends);
                        thread201987(tdone,ends);
                        thread201988(tdone,ends);
                        thread201992(tdone,ends);
                        int biggest201996 = 0;
                        if(ends[83]>=biggest201996){
                          biggest201996=ends[83];
                        }
                        if(ends[89]>=biggest201996){
                          biggest201996=ends[89];
                        }
                        if(ends[90]>=biggest201996){
                          biggest201996=ends[90];
                        }
                        if(ends[93]>=biggest201996){
                          biggest201996=ends[93];
                        }
                        if(biggest201996 == 1){
                          active[82]=1;
                          ends[82]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[82]=1;
                        ends[82]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[82]=1;
                      ends[82]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread201997(tdone,ends);
              thread202012(tdone,ends);
              thread202013(tdone,ends);
              thread202020(tdone,ends);
              int biggest202027 = 0;
              if(ends[83]>=biggest202027){
                biggest202027=ends[83];
              }
              if(ends[89]>=biggest202027){
                biggest202027=ends[89];
              }
              if(ends[90]>=biggest202027){
                biggest202027=ends[90];
              }
              if(ends[93]>=biggest202027){
                biggest202027=ends[93];
              }
              if(biggest202027 == 1){
                active[82]=1;
                ends[82]=1;
                break RUN;
              }
              //FINXME code
              if(biggest202027 == 0){
                S148218=0;
                active[82]=0;
                ends[82]=0;
                S148218=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos4_82 = new Signal();
    done_82 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[82] != 0){
      int index = 82;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[82]!=0 || suspended[82]!=0 || active[82]!=1);
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
      bottleAtPos4_82.setpreclear();
      done_82.setpreclear();
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
      bottleAtPos4_82.setClear();
      done_82.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[82]!=0 || suspended[82]!=0 || active[82]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[82] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
