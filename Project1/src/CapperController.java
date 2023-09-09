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
  private int S29643 = 1;
  private int S29642 = 1;
  private int S23886 = 1;
  private int S23881 = 1;
  private int S25183 = 1;
  private int S23904 = 1;
  private int S23911 = 1;
  private int S23906 = 1;
  private int S23973 = 1;
  private int S24008 = 1;
  private int S23975 = 1;
  private int S23980 = 1;
  private int S23988 = 1;
  private int S23991 = 1;
  private int S24060 = 1;
  private int S24055 = 1;
  private int S24111 = 1;
  private int S25266 = 1;
  private int S25210 = 1;
  private int S25190 = 1;
  private int S25185 = 1;
  private int S25301 = 1;
  private int S25277 = 1;
  private int S25271 = 1;
  private int S25274 = 1;
  private int S25336 = 1;
  private int S25312 = 1;
  private int S25306 = 1;
  private int S25309 = 1;
  
  private int[] ends = new int[60];
  private int[] tdone = new int[60];
  
  public void thread30098(int [] tdone, int [] ends){
        S25309=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread30097(int [] tdone, int [] ends){
        S25306=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 490, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread30095(int [] tdone, int [] ends){
        switch(S25309){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 494, column: 36
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

  public void thread30094(int [] tdone, int [] ends){
        switch(S25306){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 490, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread30093(int [] tdone, int [] ends){
        switch(S25336){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        switch(S25312){
          case 0 : 
            thread30094(tdone,ends);
            thread30095(tdone,ends);
            int biggest30096 = 0;
            if(ends[58]>=biggest30096){
              biggest30096=ends[58];
            }
            if(ends[59]>=biggest30096){
              biggest30096=ends[59];
            }
            if(biggest30096 == 1){
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            if(biggest30096 == 2){
              ends[57]=2;
              ;//sysj\conveyor_controller.sysj line: 488, column: 19
              S25312=1;
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            //FINXME code
            if(biggest30096 == 0){
              S25312=1;
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            break;
          
          case 1 : 
            S25312=1;
            S25312=0;
            if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 487, column: 27
              thread30097(tdone,ends);
              thread30098(tdone,ends);
              int biggest30099 = 0;
              if(ends[58]>=biggest30099){
                biggest30099=ends[58];
              }
              if(ends[59]>=biggest30099){
                biggest30099=ends[59];
              }
              if(biggest30099 == 1){
                active[57]=1;
                ends[57]=1;
                tdone[57]=1;
              }
            }
            else {
              S25312=1;
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread30091(int [] tdone, int [] ends){
        S25274=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread30090(int [] tdone, int [] ends){
        S25271=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 471, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread30088(int [] tdone, int [] ends){
        switch(S25274){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 475, column: 37
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

  public void thread30087(int [] tdone, int [] ends){
        switch(S25271){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 471, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread30086(int [] tdone, int [] ends){
        switch(S25301){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S25277){
          case 0 : 
            thread30087(tdone,ends);
            thread30088(tdone,ends);
            int biggest30089 = 0;
            if(ends[55]>=biggest30089){
              biggest30089=ends[55];
            }
            if(ends[56]>=biggest30089){
              biggest30089=ends[56];
            }
            if(biggest30089 == 1){
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            if(biggest30089 == 2){
              ends[54]=2;
              ;//sysj\conveyor_controller.sysj line: 469, column: 20
              S25277=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            //FINXME code
            if(biggest30089 == 0){
              S25277=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 1 : 
            S25277=1;
            S25277=0;
            if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 468, column: 39
              thread30090(tdone,ends);
              thread30091(tdone,ends);
              int biggest30092 = 0;
              if(ends[55]>=biggest30092){
                biggest30092=ends[55];
              }
              if(ends[56]>=biggest30092){
                biggest30092=ends[56];
              }
              if(biggest30092 == 1){
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
            }
            else {
              S25277=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread30085(int [] tdone, int [] ends){
        switch(S25266){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        switch(S25210){
          case 0 : 
            switch(S25190){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 458, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
                  S25190=1;
                  active[53]=1;
                  ends[53]=1;
                  tdone[53]=1;
                }
                else {
                  switch(S25185){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 458, column: 13
                        S25185=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
                          ends[53]=2;
                          ;//sysj\conveyor_controller.sysj line: 458, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 459, column: 16
                            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 14
                            currsigs.addElement(bottleAtPos4_46);
                            S25210=1;
                            active[53]=1;
                            ends[53]=1;
                            tdone[53]=1;
                          }
                          else {
                            S25210=1;
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
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
                        ends[53]=2;
                        ;//sysj\conveyor_controller.sysj line: 458, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 459, column: 16
                          bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 14
                          currsigs.addElement(bottleAtPos4_46);
                          S25210=1;
                          active[53]=1;
                          ends[53]=1;
                          tdone[53]=1;
                        }
                        else {
                          S25210=1;
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
                S25190=1;
                S25190=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 458, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
                  S25190=1;
                  active[53]=1;
                  ends[53]=1;
                  tdone[53]=1;
                }
                else {
                  S25185=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 458, column: 13
                    S25185=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
                      ends[53]=2;
                      ;//sysj\conveyor_controller.sysj line: 458, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 459, column: 16
                        bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 14
                        currsigs.addElement(bottleAtPos4_46);
                        S25210=1;
                        active[53]=1;
                        ends[53]=1;
                        tdone[53]=1;
                      }
                      else {
                        S25210=1;
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
            S25210=1;
            S25210=0;
            S25190=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 458, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
              S25190=1;
              active[53]=1;
              ends[53]=1;
              tdone[53]=1;
            }
            else {
              S25185=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 458, column: 13
                S25185=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
                  ends[53]=2;
                  ;//sysj\conveyor_controller.sysj line: 458, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 459, column: 16
                    bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 14
                    currsigs.addElement(bottleAtPos4_46);
                    S25210=1;
                    active[53]=1;
                    ends[53]=1;
                    tdone[53]=1;
                  }
                  else {
                    S25210=1;
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

  public void thread30082(int [] tdone, int [] ends){
        switch(S23991){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 431, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 432, column: 16
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

  public void thread30081(int [] tdone, int [] ends){
        switch(S23988){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 427, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
        break;
      
    }
  }

  public void thread30080(int [] tdone, int [] ends){
        switch(S23980){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
        break;
      
    }
  }

  public void thread30078(int [] tdone, int [] ends){
        S23991=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread30077(int [] tdone, int [] ends){
        S23988=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 426, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 427, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread30076(int [] tdone, int [] ends){
        S23980=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread30075(int [] tdone, int [] ends){
        switch(S24008){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        switch(S23975){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 419, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 420, column: 15
              S23975=1;
              thread30076(tdone,ends);
              thread30077(tdone,ends);
              thread30078(tdone,ends);
              int biggest30079 = 0;
              if(ends[50]>=biggest30079){
                biggest30079=ends[50];
              }
              if(ends[51]>=biggest30079){
                biggest30079=ends[51];
              }
              if(ends[52]>=biggest30079){
                biggest30079=ends[52];
              }
              if(biggest30079 == 1){
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
            thread30080(tdone,ends);
            thread30081(tdone,ends);
            thread30082(tdone,ends);
            int biggest30083 = 0;
            if(ends[50]>=biggest30083){
              biggest30083=ends[50];
            }
            if(ends[51]>=biggest30083){
              biggest30083=ends[51];
            }
            if(ends[52]>=biggest30083){
              biggest30083=ends[52];
            }
            if(biggest30083 == 1){
              active[49]=1;
              ends[49]=1;
              tdone[49]=1;
            }
            if(biggest30083 == 2){
              ends[49]=2;
              tdone[49]=1;
            }
            //FINXME code
            if(biggest30083 == 0){
              S24008=0;
              active[49]=0;
              ends[49]=0;
              tdone[49]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread30074(int [] tdone, int [] ends){
        switch(S23973){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 415, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
        break;
      
    }
  }

  public void thread30072(int [] tdone, int [] ends){
        S24008=1;
    S23975=0;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread30071(int [] tdone, int [] ends){
        S23973=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 415, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread30070(int [] tdone, int [] ends){
        switch(S25183){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        switch(S23904){
          case 0 : 
            if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 394, column: 19
              S23904=1;
              S23911=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 395, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 395, column: 13
                S23911=1;
                active[47]=1;
                ends[47]=1;
                tdone[47]=1;
              }
              else {
                S23906=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 395, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 395, column: 13
                  S23906=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 395, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 395, column: 13
                    ends[47]=2;
                    ;//sysj\conveyor_controller.sysj line: 395, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 396, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 397, column: 13
                    S23904=2;
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
            switch(S23911){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 395, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 395, column: 13
                  S23911=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  switch(S23906){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 395, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 395, column: 13
                        S23906=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 395, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 395, column: 13
                          ends[47]=2;
                          ;//sysj\conveyor_controller.sysj line: 395, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 396, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 397, column: 13
                          S23904=2;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 395, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 395, column: 13
                        ends[47]=2;
                        ;//sysj\conveyor_controller.sysj line: 395, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 396, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 397, column: 13
                        S23904=2;
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
                S23911=1;
                S23911=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 395, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 395, column: 13
                  S23911=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  S23906=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 395, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 395, column: 13
                    S23906=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 395, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 395, column: 13
                      ends[47]=2;
                      ;//sysj\conveyor_controller.sysj line: 395, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 396, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 397, column: 13
                      S23904=2;
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
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 398, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 402, column: 13
              S23904=3;
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
            S23904=3;
            S23904=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 408, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 409, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 406, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 411, column: 13
              S23904=5;
              thread30071(tdone,ends);
              thread30072(tdone,ends);
              int biggest30073 = 0;
              if(ends[48]>=biggest30073){
                biggest30073=ends[48];
              }
              if(ends[49]>=biggest30073){
                biggest30073=ends[49];
              }
              if(biggest30073 == 1){
                active[47]=1;
                ends[47]=1;
                tdone[47]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 409, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 5 : 
            thread30074(tdone,ends);
            thread30075(tdone,ends);
            int biggest30084 = 0;
            if(ends[48]>=biggest30084){
              biggest30084=ends[48];
            }
            if(ends[49]>=biggest30084){
              biggest30084=ends[49];
            }
            if(biggest30084 == 1){
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            if(biggest30084 == 2){
              ends[47]=2;
              ;//sysj\conveyor_controller.sysj line: 414, column: 13
              S23904=6;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            //FINXME code
            if(biggest30084 == 0){
              S23904=6;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 438, column: 19
              S23904=7;
              S24060=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 440, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 440, column: 13
                S24060=1;
                active[47]=1;
                ends[47]=1;
                tdone[47]=1;
              }
              else {
                S24055=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 440, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 440, column: 13
                  S24055=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 440, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 440, column: 13
                    ends[47]=2;
                    ;//sysj\conveyor_controller.sysj line: 440, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 441, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 442, column: 13
                    S23904=8;
                    S24111=0;
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
            switch(S24060){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 440, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 440, column: 13
                  S24060=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  switch(S24055){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 440, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 440, column: 13
                        S24055=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 440, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 440, column: 13
                          ends[47]=2;
                          ;//sysj\conveyor_controller.sysj line: 440, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 441, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 442, column: 13
                          S23904=8;
                          S24111=0;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 440, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 440, column: 13
                        ends[47]=2;
                        ;//sysj\conveyor_controller.sysj line: 440, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 441, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 442, column: 13
                        S23904=8;
                        S24111=0;
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
                S24060=1;
                S24060=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 440, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 440, column: 13
                  S24060=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  S24055=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 440, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 440, column: 13
                    S24055=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 440, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 440, column: 13
                      ends[47]=2;
                      ;//sysj\conveyor_controller.sysj line: 440, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 441, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 442, column: 13
                      S23904=8;
                      S24111=0;
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
            switch(S24111){
              case 0 : 
                if(!bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 443, column: 29
                  S24111=1;
                  if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 445, column: 23
                    active[47]=1;
                    ends[47]=1;
                    tdone[47]=1;
                  }
                  else {
                    ends[47]=2;
                    ;//sysj\conveyor_controller.sysj line: 443, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 393, column: 13
                    S23904=0;
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
                if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 445, column: 23
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  ends[47]=2;
                  ;//sysj\conveyor_controller.sysj line: 443, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 393, column: 13
                  S23904=0;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread30067(int [] tdone, int [] ends){
        S25309=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread30066(int [] tdone, int [] ends){
        S25306=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 490, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread30065(int [] tdone, int [] ends){
        S25336=1;
    S25312=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 487, column: 27
      thread30066(tdone,ends);
      thread30067(tdone,ends);
      int biggest30068 = 0;
      if(ends[58]>=biggest30068){
        biggest30068=ends[58];
      }
      if(ends[59]>=biggest30068){
        biggest30068=ends[59];
      }
      if(biggest30068 == 1){
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
    else {
      S25312=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread30063(int [] tdone, int [] ends){
        S25274=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread30062(int [] tdone, int [] ends){
        S25271=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 471, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread30061(int [] tdone, int [] ends){
        S25301=1;
    S25277=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 468, column: 39
      thread30062(tdone,ends);
      thread30063(tdone,ends);
      int biggest30064 = 0;
      if(ends[55]>=biggest30064){
        biggest30064=ends[55];
      }
      if(ends[56]>=biggest30064){
        biggest30064=ends[56];
      }
      if(biggest30064 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S25277=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread30060(int [] tdone, int [] ends){
        S25266=1;
    S25210=0;
    S25190=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 458, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
      S25190=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      S25185=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 458, column: 13
        S25185=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
          ends[53]=2;
          ;//sysj\conveyor_controller.sysj line: 458, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 459, column: 16
            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 14
            currsigs.addElement(bottleAtPos4_46);
            S25210=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
          else {
            S25210=1;
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

  public void thread30059(int [] tdone, int [] ends){
        S25183=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 393, column: 13
    S23904=0;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread30056(int [] tdone, int [] ends){
        S25309=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread30055(int [] tdone, int [] ends){
        S25306=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 490, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread30054(int [] tdone, int [] ends){
        S25336=1;
    S25312=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 487, column: 27
      thread30055(tdone,ends);
      thread30056(tdone,ends);
      int biggest30057 = 0;
      if(ends[58]>=biggest30057){
        biggest30057=ends[58];
      }
      if(ends[59]>=biggest30057){
        biggest30057=ends[59];
      }
      if(biggest30057 == 1){
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
    else {
      S25312=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread30052(int [] tdone, int [] ends){
        S25274=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread30051(int [] tdone, int [] ends){
        S25271=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 471, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread30050(int [] tdone, int [] ends){
        S25301=1;
    S25277=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 468, column: 39
      thread30051(tdone,ends);
      thread30052(tdone,ends);
      int biggest30053 = 0;
      if(ends[55]>=biggest30053){
        biggest30053=ends[55];
      }
      if(ends[56]>=biggest30053){
        biggest30053=ends[56];
      }
      if(biggest30053 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S25277=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread30049(int [] tdone, int [] ends){
        S25266=1;
    S25210=0;
    S25190=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 458, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
      S25190=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      S25185=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 458, column: 13
        S25185=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
          ends[53]=2;
          ;//sysj\conveyor_controller.sysj line: 458, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 459, column: 16
            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 14
            currsigs.addElement(bottleAtPos4_46);
            S25210=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
          else {
            S25210=1;
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

  public void thread30048(int [] tdone, int [] ends){
        S25183=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 393, column: 13
    S23904=0;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread30045(int [] tdone, int [] ends){
        S25309=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread30044(int [] tdone, int [] ends){
        S25306=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 490, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread30043(int [] tdone, int [] ends){
        S25336=1;
    S25312=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 487, column: 27
      thread30044(tdone,ends);
      thread30045(tdone,ends);
      int biggest30046 = 0;
      if(ends[58]>=biggest30046){
        biggest30046=ends[58];
      }
      if(ends[59]>=biggest30046){
        biggest30046=ends[59];
      }
      if(biggest30046 == 1){
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
    else {
      S25312=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread30041(int [] tdone, int [] ends){
        S25274=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread30040(int [] tdone, int [] ends){
        S25271=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 471, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread30039(int [] tdone, int [] ends){
        S25301=1;
    S25277=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 468, column: 39
      thread30040(tdone,ends);
      thread30041(tdone,ends);
      int biggest30042 = 0;
      if(ends[55]>=biggest30042){
        biggest30042=ends[55];
      }
      if(ends[56]>=biggest30042){
        biggest30042=ends[56];
      }
      if(biggest30042 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S25277=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread30038(int [] tdone, int [] ends){
        S25266=1;
    S25210=0;
    S25190=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 458, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
      S25190=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      S25185=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 458, column: 13
        S25185=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
          ends[53]=2;
          ;//sysj\conveyor_controller.sysj line: 458, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 459, column: 16
            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 14
            currsigs.addElement(bottleAtPos4_46);
            S25210=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
          else {
            S25210=1;
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

  public void thread30037(int [] tdone, int [] ends){
        S25183=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 393, column: 13
    S23904=0;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread30034(int [] tdone, int [] ends){
        S25309=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread30033(int [] tdone, int [] ends){
        S25306=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 490, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread30032(int [] tdone, int [] ends){
        S25336=1;
    S25312=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 487, column: 27
      thread30033(tdone,ends);
      thread30034(tdone,ends);
      int biggest30035 = 0;
      if(ends[58]>=biggest30035){
        biggest30035=ends[58];
      }
      if(ends[59]>=biggest30035){
        biggest30035=ends[59];
      }
      if(biggest30035 == 1){
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
    else {
      S25312=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread30030(int [] tdone, int [] ends){
        S25274=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread30029(int [] tdone, int [] ends){
        S25271=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 471, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread30028(int [] tdone, int [] ends){
        S25301=1;
    S25277=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 468, column: 39
      thread30029(tdone,ends);
      thread30030(tdone,ends);
      int biggest30031 = 0;
      if(ends[55]>=biggest30031){
        biggest30031=ends[55];
      }
      if(ends[56]>=biggest30031){
        biggest30031=ends[56];
      }
      if(biggest30031 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S25277=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread30027(int [] tdone, int [] ends){
        S25266=1;
    S25210=0;
    S25190=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 458, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
      S25190=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      S25185=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 458, column: 13
        S25185=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 458, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 458, column: 13
          ends[53]=2;
          ;//sysj\conveyor_controller.sysj line: 458, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 459, column: 16
            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 14
            currsigs.addElement(bottleAtPos4_46);
            S25210=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
          else {
            S25210=1;
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

  public void thread30026(int [] tdone, int [] ends){
        S25183=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 393, column: 13
    S23904=0;
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
      switch(S29643){
        case 0 : 
          S29643=0;
          break RUN;
        
        case 1 : 
          S29643=2;
          S29643=2;
          bottleAtPos4_46.setClear();//sysj\conveyor_controller.sysj line: 387, column: 11
          S29642=0;
          S23886=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 388, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 11
            S23886=1;
            active[46]=1;
            ends[46]=1;
            break RUN;
          }
          else {
            S23881=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 388, column: 11
              S23881=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 11
                ends[46]=2;
                ;//sysj\conveyor_controller.sysj line: 388, column: 11
                S29642=1;
                thread30026(tdone,ends);
                thread30027(tdone,ends);
                thread30028(tdone,ends);
                thread30032(tdone,ends);
                int biggest30036 = 0;
                if(ends[47]>=biggest30036){
                  biggest30036=ends[47];
                }
                if(ends[53]>=biggest30036){
                  biggest30036=ends[53];
                }
                if(ends[54]>=biggest30036){
                  biggest30036=ends[54];
                }
                if(ends[57]>=biggest30036){
                  biggest30036=ends[57];
                }
                if(biggest30036 == 1){
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
          bottleAtPos4_46.setClear();//sysj\conveyor_controller.sysj line: 387, column: 11
          switch(S29642){
            case 0 : 
              switch(S23886){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 388, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 11
                    S23886=1;
                    active[46]=1;
                    ends[46]=1;
                    break RUN;
                  }
                  else {
                    switch(S23881){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 388, column: 11
                          S23881=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 11
                            ends[46]=2;
                            ;//sysj\conveyor_controller.sysj line: 388, column: 11
                            S29642=1;
                            thread30037(tdone,ends);
                            thread30038(tdone,ends);
                            thread30039(tdone,ends);
                            thread30043(tdone,ends);
                            int biggest30047 = 0;
                            if(ends[47]>=biggest30047){
                              biggest30047=ends[47];
                            }
                            if(ends[53]>=biggest30047){
                              biggest30047=ends[53];
                            }
                            if(ends[54]>=biggest30047){
                              biggest30047=ends[54];
                            }
                            if(ends[57]>=biggest30047){
                              biggest30047=ends[57];
                            }
                            if(biggest30047 == 1){
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
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 11
                          ends[46]=2;
                          ;//sysj\conveyor_controller.sysj line: 388, column: 11
                          S29642=1;
                          thread30048(tdone,ends);
                          thread30049(tdone,ends);
                          thread30050(tdone,ends);
                          thread30054(tdone,ends);
                          int biggest30058 = 0;
                          if(ends[47]>=biggest30058){
                            biggest30058=ends[47];
                          }
                          if(ends[53]>=biggest30058){
                            biggest30058=ends[53];
                          }
                          if(ends[54]>=biggest30058){
                            biggest30058=ends[54];
                          }
                          if(ends[57]>=biggest30058){
                            biggest30058=ends[57];
                          }
                          if(biggest30058 == 1){
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
                  S23886=1;
                  S23886=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 388, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 11
                    S23886=1;
                    active[46]=1;
                    ends[46]=1;
                    break RUN;
                  }
                  else {
                    S23881=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 388, column: 11
                      S23881=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 11
                        ends[46]=2;
                        ;//sysj\conveyor_controller.sysj line: 388, column: 11
                        S29642=1;
                        thread30059(tdone,ends);
                        thread30060(tdone,ends);
                        thread30061(tdone,ends);
                        thread30065(tdone,ends);
                        int biggest30069 = 0;
                        if(ends[47]>=biggest30069){
                          biggest30069=ends[47];
                        }
                        if(ends[53]>=biggest30069){
                          biggest30069=ends[53];
                        }
                        if(ends[54]>=biggest30069){
                          biggest30069=ends[54];
                        }
                        if(ends[57]>=biggest30069){
                          biggest30069=ends[57];
                        }
                        if(biggest30069 == 1){
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
              thread30070(tdone,ends);
              thread30085(tdone,ends);
              thread30086(tdone,ends);
              thread30093(tdone,ends);
              int biggest30100 = 0;
              if(ends[47]>=biggest30100){
                biggest30100=ends[47];
              }
              if(ends[53]>=biggest30100){
                biggest30100=ends[53];
              }
              if(ends[54]>=biggest30100){
                biggest30100=ends[54];
              }
              if(ends[57]>=biggest30100){
                biggest30100=ends[57];
              }
              if(biggest30100 == 1){
                active[46]=1;
                ends[46]=1;
                break RUN;
              }
              //FINXME code
              if(biggest30100 == 0){
                S29643=0;
                active[46]=0;
                ends[46]=0;
                S29643=0;
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
