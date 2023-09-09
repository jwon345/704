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
  private Signal bottleAtPos4_58;
  private int S38215 = 1;
  private int S38214 = 1;
  private int S32458 = 1;
  private int S32453 = 1;
  private int S33755 = 1;
  private int S32476 = 1;
  private int S32483 = 1;
  private int S32478 = 1;
  private int S32545 = 1;
  private int S32580 = 1;
  private int S32547 = 1;
  private int S32552 = 1;
  private int S32560 = 1;
  private int S32563 = 1;
  private int S32632 = 1;
  private int S32627 = 1;
  private int S32683 = 1;
  private int S33838 = 1;
  private int S33782 = 1;
  private int S33762 = 1;
  private int S33757 = 1;
  private int S33873 = 1;
  private int S33849 = 1;
  private int S33843 = 1;
  private int S33846 = 1;
  private int S33908 = 1;
  private int S33884 = 1;
  private int S33878 = 1;
  private int S33881 = 1;
  
  private int[] ends = new int[72];
  private int[] tdone = new int[72];
  
  public void thread38829(int [] tdone, int [] ends){
        S33881=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread38828(int [] tdone, int [] ends){
        S33878=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread38826(int [] tdone, int [] ends){
        switch(S33881){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 568, column: 36
          ends[71]=2;
          tdone[71]=1;
        }
        else {
          active[71]=1;
          ends[71]=1;
          tdone[71]=1;
        }
        break;
      
    }
  }

  public void thread38825(int [] tdone, int [] ends){
        switch(S33878){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
        break;
      
    }
  }

  public void thread38824(int [] tdone, int [] ends){
        switch(S33908){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        switch(S33884){
          case 0 : 
            thread38825(tdone,ends);
            thread38826(tdone,ends);
            int biggest38827 = 0;
            if(ends[70]>=biggest38827){
              biggest38827=ends[70];
            }
            if(ends[71]>=biggest38827){
              biggest38827=ends[71];
            }
            if(biggest38827 == 1){
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            if(biggest38827 == 2){
              ends[69]=2;
              ;//sysj\conveyor_controller.sysj line: 562, column: 19
              S33884=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            //FINXME code
            if(biggest38827 == 0){
              S33884=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            break;
          
          case 1 : 
            S33884=1;
            S33884=0;
            if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 561, column: 27
              thread38828(tdone,ends);
              thread38829(tdone,ends);
              int biggest38830 = 0;
              if(ends[70]>=biggest38830){
                biggest38830=ends[70];
              }
              if(ends[71]>=biggest38830){
                biggest38830=ends[71];
              }
              if(biggest38830 == 1){
                active[69]=1;
                ends[69]=1;
                tdone[69]=1;
              }
            }
            else {
              S33884=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38822(int [] tdone, int [] ends){
        S33846=1;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread38821(int [] tdone, int [] ends){
        S33843=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 545, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread38819(int [] tdone, int [] ends){
        switch(S33846){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 549, column: 37
          ends[68]=2;
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

  public void thread38818(int [] tdone, int [] ends){
        switch(S33843){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 545, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread38817(int [] tdone, int [] ends){
        switch(S33873){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        switch(S33849){
          case 0 : 
            thread38818(tdone,ends);
            thread38819(tdone,ends);
            int biggest38820 = 0;
            if(ends[67]>=biggest38820){
              biggest38820=ends[67];
            }
            if(ends[68]>=biggest38820){
              biggest38820=ends[68];
            }
            if(biggest38820 == 1){
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            if(biggest38820 == 2){
              ends[66]=2;
              ;//sysj\conveyor_controller.sysj line: 543, column: 20
              S33849=1;
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            //FINXME code
            if(biggest38820 == 0){
              S33849=1;
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            break;
          
          case 1 : 
            S33849=1;
            S33849=0;
            if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 542, column: 39
              thread38821(tdone,ends);
              thread38822(tdone,ends);
              int biggest38823 = 0;
              if(ends[67]>=biggest38823){
                biggest38823=ends[67];
              }
              if(ends[68]>=biggest38823){
                biggest38823=ends[68];
              }
              if(biggest38823 == 1){
                active[66]=1;
                ends[66]=1;
                tdone[66]=1;
              }
            }
            else {
              S33849=1;
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38816(int [] tdone, int [] ends){
        switch(S33838){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        switch(S33782){
          case 0 : 
            switch(S33762){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
                  S33762=1;
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
                else {
                  switch(S33757){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
                        S33757=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
                          ends[65]=2;
                          ;//sysj\conveyor_controller.sysj line: 532, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
                            bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
                            currsigs.addElement(bottleAtPos4_58);
                            S33782=1;
                            active[65]=1;
                            ends[65]=1;
                            tdone[65]=1;
                          }
                          else {
                            S33782=1;
                            active[65]=1;
                            ends[65]=1;
                            tdone[65]=1;
                          }
                        }
                        else {
                          active[65]=1;
                          ends[65]=1;
                          tdone[65]=1;
                        }
                      }
                      else {
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
                        ends[65]=2;
                        ;//sysj\conveyor_controller.sysj line: 532, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
                          bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
                          currsigs.addElement(bottleAtPos4_58);
                          S33782=1;
                          active[65]=1;
                          ends[65]=1;
                          tdone[65]=1;
                        }
                        else {
                          S33782=1;
                          active[65]=1;
                          ends[65]=1;
                          tdone[65]=1;
                        }
                      }
                      else {
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S33762=1;
                S33762=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
                  S33762=1;
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
                else {
                  S33757=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
                    S33757=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
                      ends[65]=2;
                      ;//sysj\conveyor_controller.sysj line: 532, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
                        bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
                        currsigs.addElement(bottleAtPos4_58);
                        S33782=1;
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      else {
                        S33782=1;
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                    }
                    else {
                      active[65]=1;
                      ends[65]=1;
                      tdone[65]=1;
                    }
                  }
                  else {
                    active[65]=1;
                    ends[65]=1;
                    tdone[65]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S33782=1;
            S33782=0;
            S33762=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
              S33762=1;
              active[65]=1;
              ends[65]=1;
              tdone[65]=1;
            }
            else {
              S33757=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
                S33757=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
                  ends[65]=2;
                  ;//sysj\conveyor_controller.sysj line: 532, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
                    bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
                    currsigs.addElement(bottleAtPos4_58);
                    S33782=1;
                    active[65]=1;
                    ends[65]=1;
                    tdone[65]=1;
                  }
                  else {
                    S33782=1;
                    active[65]=1;
                    ends[65]=1;
                    tdone[65]=1;
                  }
                }
                else {
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
              }
              else {
                active[65]=1;
                ends[65]=1;
                tdone[65]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38813(int [] tdone, int [] ends){
        switch(S32563){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 505, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 506, column: 16
          ends[64]=2;
          tdone[64]=1;
        }
        else {
          active[64]=1;
          ends[64]=1;
          tdone[64]=1;
        }
        break;
      
    }
  }

  public void thread38812(int [] tdone, int [] ends){
        switch(S32560){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 501, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
        break;
      
    }
  }

  public void thread38811(int [] tdone, int [] ends){
        switch(S32552){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 496, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
        break;
      
    }
  }

  public void thread38809(int [] tdone, int [] ends){
        S32563=1;
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread38808(int [] tdone, int [] ends){
        S32560=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 500, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 501, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread38807(int [] tdone, int [] ends){
        S32552=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 496, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread38806(int [] tdone, int [] ends){
        switch(S32580){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        switch(S32547){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 493, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 494, column: 15
              S32547=1;
              thread38807(tdone,ends);
              thread38808(tdone,ends);
              thread38809(tdone,ends);
              int biggest38810 = 0;
              if(ends[62]>=biggest38810){
                biggest38810=ends[62];
              }
              if(ends[63]>=biggest38810){
                biggest38810=ends[63];
              }
              if(ends[64]>=biggest38810){
                biggest38810=ends[64];
              }
              if(biggest38810 == 1){
                active[61]=1;
                ends[61]=1;
                tdone[61]=1;
              }
            }
            else {
              active[61]=1;
              ends[61]=1;
              tdone[61]=1;
            }
            break;
          
          case 1 : 
            thread38811(tdone,ends);
            thread38812(tdone,ends);
            thread38813(tdone,ends);
            int biggest38814 = 0;
            if(ends[62]>=biggest38814){
              biggest38814=ends[62];
            }
            if(ends[63]>=biggest38814){
              biggest38814=ends[63];
            }
            if(ends[64]>=biggest38814){
              biggest38814=ends[64];
            }
            if(biggest38814 == 1){
              active[61]=1;
              ends[61]=1;
              tdone[61]=1;
            }
            if(biggest38814 == 2){
              ends[61]=2;
              tdone[61]=1;
            }
            //FINXME code
            if(biggest38814 == 0){
              S32580=0;
              active[61]=0;
              ends[61]=0;
              tdone[61]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38805(int [] tdone, int [] ends){
        switch(S32545){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 489, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
        break;
      
    }
  }

  public void thread38803(int [] tdone, int [] ends){
        S32580=1;
    S32547=0;
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread38802(int [] tdone, int [] ends){
        S32545=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 489, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread38801(int [] tdone, int [] ends){
        switch(S33755){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        switch(S32476){
          case 0 : 
            if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 468, column: 19
              S32476=1;
              S32483=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 469, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                S32483=1;
                active[59]=1;
                ends[59]=1;
                tdone[59]=1;
              }
              else {
                S32478=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 469, column: 13
                  S32478=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                    ends[59]=2;
                    ;//sysj\conveyor_controller.sysj line: 469, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 470, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 471, column: 13
                    S32476=2;
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                  else {
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                }
                else {
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
              }
            }
            else {
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
          case 1 : 
            switch(S32483){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 469, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                  S32483=1;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  switch(S32478){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 469, column: 13
                        S32478=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                          ends[59]=2;
                          ;//sysj\conveyor_controller.sysj line: 469, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 470, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 471, column: 13
                          S32476=2;
                          active[59]=1;
                          ends[59]=1;
                          tdone[59]=1;
                        }
                        else {
                          active[59]=1;
                          ends[59]=1;
                          tdone[59]=1;
                        }
                      }
                      else {
                        active[59]=1;
                        ends[59]=1;
                        tdone[59]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                        ends[59]=2;
                        ;//sysj\conveyor_controller.sysj line: 469, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 470, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 471, column: 13
                        S32476=2;
                        active[59]=1;
                        ends[59]=1;
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
                break;
              
              case 1 : 
                S32483=1;
                S32483=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 469, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                  S32483=1;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  S32478=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 469, column: 13
                    S32478=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                      ends[59]=2;
                      ;//sysj\conveyor_controller.sysj line: 469, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 470, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 471, column: 13
                      S32476=2;
                      active[59]=1;
                      ends[59]=1;
                      tdone[59]=1;
                    }
                    else {
                      active[59]=1;
                      ends[59]=1;
                      tdone[59]=1;
                    }
                  }
                  else {
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 472, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 476, column: 13
              S32476=3;
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            else {
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
          case 3 : 
            S32476=3;
            S32476=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 482, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 480, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 485, column: 13
              S32476=5;
              thread38802(tdone,ends);
              thread38803(tdone,ends);
              int biggest38804 = 0;
              if(ends[60]>=biggest38804){
                biggest38804=ends[60];
              }
              if(ends[61]>=biggest38804){
                biggest38804=ends[61];
              }
              if(biggest38804 == 1){
                active[59]=1;
                ends[59]=1;
                tdone[59]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
          case 5 : 
            thread38805(tdone,ends);
            thread38806(tdone,ends);
            int biggest38815 = 0;
            if(ends[60]>=biggest38815){
              biggest38815=ends[60];
            }
            if(ends[61]>=biggest38815){
              biggest38815=ends[61];
            }
            if(biggest38815 == 1){
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            if(biggest38815 == 2){
              ends[59]=2;
              ;//sysj\conveyor_controller.sysj line: 488, column: 13
              S32476=6;
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            //FINXME code
            if(biggest38815 == 0){
              S32476=6;
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 512, column: 19
              S32476=7;
              S32632=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 514, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                S32632=1;
                active[59]=1;
                ends[59]=1;
                tdone[59]=1;
              }
              else {
                S32627=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 514, column: 13
                  S32627=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                    ends[59]=2;
                    ;//sysj\conveyor_controller.sysj line: 514, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 515, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 516, column: 13
                    S32476=8;
                    S32683=0;
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                  else {
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                }
                else {
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
              }
            }
            else {
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
          case 7 : 
            switch(S32632){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 514, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                  S32632=1;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  switch(S32627){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 514, column: 13
                        S32627=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                          ends[59]=2;
                          ;//sysj\conveyor_controller.sysj line: 514, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 515, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 516, column: 13
                          S32476=8;
                          S32683=0;
                          active[59]=1;
                          ends[59]=1;
                          tdone[59]=1;
                        }
                        else {
                          active[59]=1;
                          ends[59]=1;
                          tdone[59]=1;
                        }
                      }
                      else {
                        active[59]=1;
                        ends[59]=1;
                        tdone[59]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                        ends[59]=2;
                        ;//sysj\conveyor_controller.sysj line: 514, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 515, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 516, column: 13
                        S32476=8;
                        S32683=0;
                        active[59]=1;
                        ends[59]=1;
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
                break;
              
              case 1 : 
                S32632=1;
                S32632=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 514, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                  S32632=1;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  S32627=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 514, column: 13
                    S32627=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                      ends[59]=2;
                      ;//sysj\conveyor_controller.sysj line: 514, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 515, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 516, column: 13
                      S32476=8;
                      S32683=0;
                      active[59]=1;
                      ends[59]=1;
                      tdone[59]=1;
                    }
                    else {
                      active[59]=1;
                      ends[59]=1;
                      tdone[59]=1;
                    }
                  }
                  else {
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S32683){
              case 0 : 
                if(!bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 517, column: 29
                  S32683=1;
                  if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 519, column: 23
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                  else {
                    ends[59]=2;
                    ;//sysj\conveyor_controller.sysj line: 517, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 467, column: 13
                    S32476=0;
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                }
                else {
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 519, column: 23
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  ends[59]=2;
                  ;//sysj\conveyor_controller.sysj line: 517, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 467, column: 13
                  S32476=0;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38798(int [] tdone, int [] ends){
        S33881=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread38797(int [] tdone, int [] ends){
        S33878=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread38796(int [] tdone, int [] ends){
        S33908=1;
    S33884=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 561, column: 27
      thread38797(tdone,ends);
      thread38798(tdone,ends);
      int biggest38799 = 0;
      if(ends[70]>=biggest38799){
        biggest38799=ends[70];
      }
      if(ends[71]>=biggest38799){
        biggest38799=ends[71];
      }
      if(biggest38799 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S33884=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread38794(int [] tdone, int [] ends){
        S33846=1;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread38793(int [] tdone, int [] ends){
        S33843=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 545, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread38792(int [] tdone, int [] ends){
        S33873=1;
    S33849=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 542, column: 39
      thread38793(tdone,ends);
      thread38794(tdone,ends);
      int biggest38795 = 0;
      if(ends[67]>=biggest38795){
        biggest38795=ends[67];
      }
      if(ends[68]>=biggest38795){
        biggest38795=ends[68];
      }
      if(biggest38795 == 1){
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
      }
    }
    else {
      S33849=1;
      active[66]=1;
      ends[66]=1;
      tdone[66]=1;
    }
  }

  public void thread38791(int [] tdone, int [] ends){
        S33838=1;
    S33782=0;
    S33762=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
      S33762=1;
      active[65]=1;
      ends[65]=1;
      tdone[65]=1;
    }
    else {
      S33757=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
        S33757=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
          ends[65]=2;
          ;//sysj\conveyor_controller.sysj line: 532, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
            bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
            currsigs.addElement(bottleAtPos4_58);
            S33782=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
          else {
            S33782=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
        }
        else {
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
      }
      else {
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
      }
    }
  }

  public void thread38790(int [] tdone, int [] ends){
        S33755=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 467, column: 13
    S32476=0;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread38787(int [] tdone, int [] ends){
        S33881=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread38786(int [] tdone, int [] ends){
        S33878=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread38785(int [] tdone, int [] ends){
        S33908=1;
    S33884=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 561, column: 27
      thread38786(tdone,ends);
      thread38787(tdone,ends);
      int biggest38788 = 0;
      if(ends[70]>=biggest38788){
        biggest38788=ends[70];
      }
      if(ends[71]>=biggest38788){
        biggest38788=ends[71];
      }
      if(biggest38788 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S33884=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread38783(int [] tdone, int [] ends){
        S33846=1;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread38782(int [] tdone, int [] ends){
        S33843=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 545, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread38781(int [] tdone, int [] ends){
        S33873=1;
    S33849=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 542, column: 39
      thread38782(tdone,ends);
      thread38783(tdone,ends);
      int biggest38784 = 0;
      if(ends[67]>=biggest38784){
        biggest38784=ends[67];
      }
      if(ends[68]>=biggest38784){
        biggest38784=ends[68];
      }
      if(biggest38784 == 1){
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
      }
    }
    else {
      S33849=1;
      active[66]=1;
      ends[66]=1;
      tdone[66]=1;
    }
  }

  public void thread38780(int [] tdone, int [] ends){
        S33838=1;
    S33782=0;
    S33762=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
      S33762=1;
      active[65]=1;
      ends[65]=1;
      tdone[65]=1;
    }
    else {
      S33757=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
        S33757=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
          ends[65]=2;
          ;//sysj\conveyor_controller.sysj line: 532, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
            bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
            currsigs.addElement(bottleAtPos4_58);
            S33782=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
          else {
            S33782=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
        }
        else {
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
      }
      else {
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
      }
    }
  }

  public void thread38779(int [] tdone, int [] ends){
        S33755=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 467, column: 13
    S32476=0;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread38776(int [] tdone, int [] ends){
        S33881=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread38775(int [] tdone, int [] ends){
        S33878=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread38774(int [] tdone, int [] ends){
        S33908=1;
    S33884=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 561, column: 27
      thread38775(tdone,ends);
      thread38776(tdone,ends);
      int biggest38777 = 0;
      if(ends[70]>=biggest38777){
        biggest38777=ends[70];
      }
      if(ends[71]>=biggest38777){
        biggest38777=ends[71];
      }
      if(biggest38777 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S33884=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread38772(int [] tdone, int [] ends){
        S33846=1;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread38771(int [] tdone, int [] ends){
        S33843=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 545, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread38770(int [] tdone, int [] ends){
        S33873=1;
    S33849=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 542, column: 39
      thread38771(tdone,ends);
      thread38772(tdone,ends);
      int biggest38773 = 0;
      if(ends[67]>=biggest38773){
        biggest38773=ends[67];
      }
      if(ends[68]>=biggest38773){
        biggest38773=ends[68];
      }
      if(biggest38773 == 1){
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
      }
    }
    else {
      S33849=1;
      active[66]=1;
      ends[66]=1;
      tdone[66]=1;
    }
  }

  public void thread38769(int [] tdone, int [] ends){
        S33838=1;
    S33782=0;
    S33762=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
      S33762=1;
      active[65]=1;
      ends[65]=1;
      tdone[65]=1;
    }
    else {
      S33757=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
        S33757=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
          ends[65]=2;
          ;//sysj\conveyor_controller.sysj line: 532, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
            bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
            currsigs.addElement(bottleAtPos4_58);
            S33782=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
          else {
            S33782=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
        }
        else {
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
      }
      else {
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
      }
    }
  }

  public void thread38768(int [] tdone, int [] ends){
        S33755=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 467, column: 13
    S32476=0;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread38765(int [] tdone, int [] ends){
        S33881=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread38764(int [] tdone, int [] ends){
        S33878=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread38763(int [] tdone, int [] ends){
        S33908=1;
    S33884=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 561, column: 27
      thread38764(tdone,ends);
      thread38765(tdone,ends);
      int biggest38766 = 0;
      if(ends[70]>=biggest38766){
        biggest38766=ends[70];
      }
      if(ends[71]>=biggest38766){
        biggest38766=ends[71];
      }
      if(biggest38766 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S33884=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread38761(int [] tdone, int [] ends){
        S33846=1;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread38760(int [] tdone, int [] ends){
        S33843=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 545, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread38759(int [] tdone, int [] ends){
        S33873=1;
    S33849=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 542, column: 39
      thread38760(tdone,ends);
      thread38761(tdone,ends);
      int biggest38762 = 0;
      if(ends[67]>=biggest38762){
        biggest38762=ends[67];
      }
      if(ends[68]>=biggest38762){
        biggest38762=ends[68];
      }
      if(biggest38762 == 1){
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
      }
    }
    else {
      S33849=1;
      active[66]=1;
      ends[66]=1;
      tdone[66]=1;
    }
  }

  public void thread38758(int [] tdone, int [] ends){
        S33838=1;
    S33782=0;
    S33762=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
      S33762=1;
      active[65]=1;
      ends[65]=1;
      tdone[65]=1;
    }
    else {
      S33757=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
        S33757=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
          ends[65]=2;
          ;//sysj\conveyor_controller.sysj line: 532, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
            bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
            currsigs.addElement(bottleAtPos4_58);
            S33782=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
          else {
            S33782=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
        }
        else {
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
      }
      else {
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
      }
    }
  }

  public void thread38757(int [] tdone, int [] ends){
        S33755=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 467, column: 13
    S32476=0;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S38215){
        case 0 : 
          S38215=0;
          break RUN;
        
        case 1 : 
          S38215=2;
          S38215=2;
          bottleAtPos4_58.setClear();//sysj\conveyor_controller.sysj line: 461, column: 11
          S38214=0;
          S32458=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 462, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
            S32458=1;
            active[58]=1;
            ends[58]=1;
            break RUN;
          }
          else {
            S32453=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 462, column: 11
              S32453=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
                ends[58]=2;
                ;//sysj\conveyor_controller.sysj line: 462, column: 11
                S38214=1;
                thread38757(tdone,ends);
                thread38758(tdone,ends);
                thread38759(tdone,ends);
                thread38763(tdone,ends);
                int biggest38767 = 0;
                if(ends[59]>=biggest38767){
                  biggest38767=ends[59];
                }
                if(ends[65]>=biggest38767){
                  biggest38767=ends[65];
                }
                if(ends[66]>=biggest38767){
                  biggest38767=ends[66];
                }
                if(ends[69]>=biggest38767){
                  biggest38767=ends[69];
                }
                if(biggest38767 == 1){
                  active[58]=1;
                  ends[58]=1;
                  break RUN;
                }
              }
              else {
                active[58]=1;
                ends[58]=1;
                break RUN;
              }
            }
            else {
              active[58]=1;
              ends[58]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_58.setClear();//sysj\conveyor_controller.sysj line: 461, column: 11
          switch(S38214){
            case 0 : 
              switch(S32458){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 462, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
                    S32458=1;
                    active[58]=1;
                    ends[58]=1;
                    break RUN;
                  }
                  else {
                    switch(S32453){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 462, column: 11
                          S32453=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
                            ends[58]=2;
                            ;//sysj\conveyor_controller.sysj line: 462, column: 11
                            S38214=1;
                            thread38768(tdone,ends);
                            thread38769(tdone,ends);
                            thread38770(tdone,ends);
                            thread38774(tdone,ends);
                            int biggest38778 = 0;
                            if(ends[59]>=biggest38778){
                              biggest38778=ends[59];
                            }
                            if(ends[65]>=biggest38778){
                              biggest38778=ends[65];
                            }
                            if(ends[66]>=biggest38778){
                              biggest38778=ends[66];
                            }
                            if(ends[69]>=biggest38778){
                              biggest38778=ends[69];
                            }
                            if(biggest38778 == 1){
                              active[58]=1;
                              ends[58]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[58]=1;
                            ends[58]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[58]=1;
                          ends[58]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
                          ends[58]=2;
                          ;//sysj\conveyor_controller.sysj line: 462, column: 11
                          S38214=1;
                          thread38779(tdone,ends);
                          thread38780(tdone,ends);
                          thread38781(tdone,ends);
                          thread38785(tdone,ends);
                          int biggest38789 = 0;
                          if(ends[59]>=biggest38789){
                            biggest38789=ends[59];
                          }
                          if(ends[65]>=biggest38789){
                            biggest38789=ends[65];
                          }
                          if(ends[66]>=biggest38789){
                            biggest38789=ends[66];
                          }
                          if(ends[69]>=biggest38789){
                            biggest38789=ends[69];
                          }
                          if(biggest38789 == 1){
                            active[58]=1;
                            ends[58]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[58]=1;
                          ends[58]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S32458=1;
                  S32458=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 462, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
                    S32458=1;
                    active[58]=1;
                    ends[58]=1;
                    break RUN;
                  }
                  else {
                    S32453=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 462, column: 11
                      S32453=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
                        ends[58]=2;
                        ;//sysj\conveyor_controller.sysj line: 462, column: 11
                        S38214=1;
                        thread38790(tdone,ends);
                        thread38791(tdone,ends);
                        thread38792(tdone,ends);
                        thread38796(tdone,ends);
                        int biggest38800 = 0;
                        if(ends[59]>=biggest38800){
                          biggest38800=ends[59];
                        }
                        if(ends[65]>=biggest38800){
                          biggest38800=ends[65];
                        }
                        if(ends[66]>=biggest38800){
                          biggest38800=ends[66];
                        }
                        if(ends[69]>=biggest38800){
                          biggest38800=ends[69];
                        }
                        if(biggest38800 == 1){
                          active[58]=1;
                          ends[58]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[58]=1;
                        ends[58]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[58]=1;
                      ends[58]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread38801(tdone,ends);
              thread38816(tdone,ends);
              thread38817(tdone,ends);
              thread38824(tdone,ends);
              int biggest38831 = 0;
              if(ends[59]>=biggest38831){
                biggest38831=ends[59];
              }
              if(ends[65]>=biggest38831){
                biggest38831=ends[65];
              }
              if(ends[66]>=biggest38831){
                biggest38831=ends[66];
              }
              if(ends[69]>=biggest38831){
                biggest38831=ends[69];
              }
              if(biggest38831 == 1){
                active[58]=1;
                ends[58]=1;
                break RUN;
              }
              //FINXME code
              if(biggest38831 == 0){
                S38215=0;
                active[58]=0;
                ends[58]=0;
                S38215=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos4_58 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[58] != 0){
      int index = 58;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[58]!=0 || suspended[58]!=0 || active[58]!=1);
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
      bottleAtPos4_58.setpreclear();
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
      bottleAtPos4_58.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[58]!=0 || suspended[58]!=0 || active[58]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[58] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
