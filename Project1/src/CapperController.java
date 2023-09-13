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
  private Signal bottleAtPos4_73;
  private int S124444 = 1;
  private int S124443 = 1;
  private int S118687 = 1;
  private int S118682 = 1;
  private int S119984 = 1;
  private int S118705 = 1;
  private int S118712 = 1;
  private int S118707 = 1;
  private int S118774 = 1;
  private int S118809 = 1;
  private int S118776 = 1;
  private int S118781 = 1;
  private int S118789 = 1;
  private int S118792 = 1;
  private int S118861 = 1;
  private int S118856 = 1;
  private int S118912 = 1;
  private int S120067 = 1;
  private int S120011 = 1;
  private int S119991 = 1;
  private int S119986 = 1;
  private int S120102 = 1;
  private int S120078 = 1;
  private int S120072 = 1;
  private int S120075 = 1;
  private int S120137 = 1;
  private int S120113 = 1;
  private int S120107 = 1;
  private int S120110 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread183347(int [] tdone, int [] ends){
        S120110=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread183346(int [] tdone, int [] ends){
        S120107=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 708, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread183344(int [] tdone, int [] ends){
        switch(S120110){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 712, column: 36
          ends[86]=2;
          tdone[86]=1;
        }
        else {
          active[86]=1;
          ends[86]=1;
          tdone[86]=1;
        }
        break;
      
    }
  }

  public void thread183343(int [] tdone, int [] ends){
        switch(S120107){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 708, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
        break;
      
    }
  }

  public void thread183342(int [] tdone, int [] ends){
        switch(S120137){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        switch(S120113){
          case 0 : 
            thread183343(tdone,ends);
            thread183344(tdone,ends);
            int biggest183345 = 0;
            if(ends[85]>=biggest183345){
              biggest183345=ends[85];
            }
            if(ends[86]>=biggest183345){
              biggest183345=ends[86];
            }
            if(biggest183345 == 1){
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            if(biggest183345 == 2){
              ends[84]=2;
              ;//sysj\conveyor_controller.sysj line: 706, column: 19
              S120113=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            //FINXME code
            if(biggest183345 == 0){
              S120113=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            break;
          
          case 1 : 
            S120113=1;
            S120113=0;
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 705, column: 27
              thread183346(tdone,ends);
              thread183347(tdone,ends);
              int biggest183348 = 0;
              if(ends[85]>=biggest183348){
                biggest183348=ends[85];
              }
              if(ends[86]>=biggest183348){
                biggest183348=ends[86];
              }
              if(biggest183348 == 1){
                active[84]=1;
                ends[84]=1;
                tdone[84]=1;
              }
            }
            else {
              S120113=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread183340(int [] tdone, int [] ends){
        S120075=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread183339(int [] tdone, int [] ends){
        S120072=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 689, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread183337(int [] tdone, int [] ends){
        switch(S120075){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 693, column: 37
          ends[83]=2;
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

  public void thread183336(int [] tdone, int [] ends){
        switch(S120072){
      case 0 : 
        active[82]=0;
        ends[82]=0;
        tdone[82]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 689, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[82]=1;
        ends[82]=1;
        tdone[82]=1;
        break;
      
    }
  }

  public void thread183335(int [] tdone, int [] ends){
        switch(S120102){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        switch(S120078){
          case 0 : 
            thread183336(tdone,ends);
            thread183337(tdone,ends);
            int biggest183338 = 0;
            if(ends[82]>=biggest183338){
              biggest183338=ends[82];
            }
            if(ends[83]>=biggest183338){
              biggest183338=ends[83];
            }
            if(biggest183338 == 1){
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            if(biggest183338 == 2){
              ends[81]=2;
              ;//sysj\conveyor_controller.sysj line: 687, column: 20
              S120078=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            //FINXME code
            if(biggest183338 == 0){
              S120078=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            break;
          
          case 1 : 
            S120078=1;
            S120078=0;
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 686, column: 39
              thread183339(tdone,ends);
              thread183340(tdone,ends);
              int biggest183341 = 0;
              if(ends[82]>=biggest183341){
                biggest183341=ends[82];
              }
              if(ends[83]>=biggest183341){
                biggest183341=ends[83];
              }
              if(biggest183341 == 1){
                active[81]=1;
                ends[81]=1;
                tdone[81]=1;
              }
            }
            else {
              S120078=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread183334(int [] tdone, int [] ends){
        switch(S120067){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        switch(S120011){
          case 0 : 
            switch(S119991){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 676, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
                  S119991=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  switch(S119986){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 676, column: 13
                        S119986=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
                          ends[80]=2;
                          ;//sysj\conveyor_controller.sysj line: 676, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 677, column: 16
                            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 678, column: 14
                            currsigs.addElement(bottleAtPos4_73);
                            S120011=1;
                            active[80]=1;
                            ends[80]=1;
                            tdone[80]=1;
                          }
                          else {
                            S120011=1;
                            active[80]=1;
                            ends[80]=1;
                            tdone[80]=1;
                          }
                        }
                        else {
                          active[80]=1;
                          ends[80]=1;
                          tdone[80]=1;
                        }
                      }
                      else {
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
                        ends[80]=2;
                        ;//sysj\conveyor_controller.sysj line: 676, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 677, column: 16
                          bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 678, column: 14
                          currsigs.addElement(bottleAtPos4_73);
                          S120011=1;
                          active[80]=1;
                          ends[80]=1;
                          tdone[80]=1;
                        }
                        else {
                          S120011=1;
                          active[80]=1;
                          ends[80]=1;
                          tdone[80]=1;
                        }
                      }
                      else {
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S119991=1;
                S119991=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 676, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
                  S119991=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  S119986=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 676, column: 13
                    S119986=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
                      ends[80]=2;
                      ;//sysj\conveyor_controller.sysj line: 676, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 677, column: 16
                        bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 678, column: 14
                        currsigs.addElement(bottleAtPos4_73);
                        S120011=1;
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      else {
                        S120011=1;
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                    }
                    else {
                      active[80]=1;
                      ends[80]=1;
                      tdone[80]=1;
                    }
                  }
                  else {
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S120011=1;
            S120011=0;
            S119991=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 676, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
              S119991=1;
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            else {
              S119986=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 676, column: 13
                S119986=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
                  ends[80]=2;
                  ;//sysj\conveyor_controller.sysj line: 676, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 677, column: 16
                    bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 678, column: 14
                    currsigs.addElement(bottleAtPos4_73);
                    S120011=1;
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                  else {
                    S120011=1;
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                }
                else {
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
              }
              else {
                active[80]=1;
                ends[80]=1;
                tdone[80]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread183331(int [] tdone, int [] ends){
        switch(S118792){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 649, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 650, column: 16
          ends[79]=2;
          tdone[79]=1;
        }
        else {
          active[79]=1;
          ends[79]=1;
          tdone[79]=1;
        }
        break;
      
    }
  }

  public void thread183330(int [] tdone, int [] ends){
        switch(S118789){
      case 0 : 
        active[78]=0;
        ends[78]=0;
        tdone[78]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 645, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
        break;
      
    }
  }

  public void thread183329(int [] tdone, int [] ends){
        switch(S118781){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 640, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[77]=1;
        ends[77]=1;
        tdone[77]=1;
        break;
      
    }
  }

  public void thread183327(int [] tdone, int [] ends){
        S118792=1;
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread183326(int [] tdone, int [] ends){
        S118789=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 644, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 645, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread183325(int [] tdone, int [] ends){
        S118781=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 640, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread183324(int [] tdone, int [] ends){
        switch(S118809){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        switch(S118776){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 637, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 638, column: 15
              S118776=1;
              thread183325(tdone,ends);
              thread183326(tdone,ends);
              thread183327(tdone,ends);
              int biggest183328 = 0;
              if(ends[77]>=biggest183328){
                biggest183328=ends[77];
              }
              if(ends[78]>=biggest183328){
                biggest183328=ends[78];
              }
              if(ends[79]>=biggest183328){
                biggest183328=ends[79];
              }
              if(biggest183328 == 1){
                active[76]=1;
                ends[76]=1;
                tdone[76]=1;
              }
            }
            else {
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
          case 1 : 
            thread183329(tdone,ends);
            thread183330(tdone,ends);
            thread183331(tdone,ends);
            int biggest183332 = 0;
            if(ends[77]>=biggest183332){
              biggest183332=ends[77];
            }
            if(ends[78]>=biggest183332){
              biggest183332=ends[78];
            }
            if(ends[79]>=biggest183332){
              biggest183332=ends[79];
            }
            if(biggest183332 == 1){
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            if(biggest183332 == 2){
              ends[76]=2;
              tdone[76]=1;
            }
            //FINXME code
            if(biggest183332 == 0){
              S118809=0;
              active[76]=0;
              ends[76]=0;
              tdone[76]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread183323(int [] tdone, int [] ends){
        switch(S118774){
      case 0 : 
        active[75]=0;
        ends[75]=0;
        tdone[75]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 633, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
        break;
      
    }
  }

  public void thread183321(int [] tdone, int [] ends){
        S118809=1;
    S118776=0;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread183320(int [] tdone, int [] ends){
        S118774=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 633, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread183319(int [] tdone, int [] ends){
        switch(S119984){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        switch(S118705){
          case 0 : 
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 612, column: 19
              S118705=1;
              S118712=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 613, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 613, column: 13
                S118712=1;
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
              else {
                S118707=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 613, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 613, column: 13
                  S118707=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 613, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 613, column: 13
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 613, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 614, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 615, column: 13
                    S118705=2;
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
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
            else {
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 1 : 
            switch(S118712){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 613, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 613, column: 13
                  S118712=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  switch(S118707){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 613, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 613, column: 13
                        S118707=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 613, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 613, column: 13
                          ends[74]=2;
                          ;//sysj\conveyor_controller.sysj line: 613, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 614, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 615, column: 13
                          S118705=2;
                          active[74]=1;
                          ends[74]=1;
                          tdone[74]=1;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 613, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 613, column: 13
                        ends[74]=2;
                        ;//sysj\conveyor_controller.sysj line: 613, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 614, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 615, column: 13
                        S118705=2;
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
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
                S118712=1;
                S118712=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 613, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 613, column: 13
                  S118712=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  S118707=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 613, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 613, column: 13
                    S118707=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 613, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 613, column: 13
                      ends[74]=2;
                      ;//sysj\conveyor_controller.sysj line: 613, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 614, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 615, column: 13
                      S118705=2;
                      active[74]=1;
                      ends[74]=1;
                      tdone[74]=1;
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
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 616, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 620, column: 13
              S118705=3;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            else {
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 3 : 
            S118705=3;
            S118705=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 626, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 627, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 624, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 629, column: 13
              S118705=5;
              thread183320(tdone,ends);
              thread183321(tdone,ends);
              int biggest183322 = 0;
              if(ends[75]>=biggest183322){
                biggest183322=ends[75];
              }
              if(ends[76]>=biggest183322){
                biggest183322=ends[76];
              }
              if(biggest183322 == 1){
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 627, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 5 : 
            thread183323(tdone,ends);
            thread183324(tdone,ends);
            int biggest183333 = 0;
            if(ends[75]>=biggest183333){
              biggest183333=ends[75];
            }
            if(ends[76]>=biggest183333){
              biggest183333=ends[76];
            }
            if(biggest183333 == 1){
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            if(biggest183333 == 2){
              ends[74]=2;
              ;//sysj\conveyor_controller.sysj line: 632, column: 13
              S118705=6;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            //FINXME code
            if(biggest183333 == 0){
              S118705=6;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 656, column: 19
              S118705=7;
              S118861=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 658, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 658, column: 13
                S118861=1;
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
              else {
                S118856=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 658, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 658, column: 13
                  S118856=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 658, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 658, column: 13
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 658, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 659, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 660, column: 13
                    S118705=8;
                    S118912=0;
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
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
            else {
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 7 : 
            switch(S118861){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 658, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 658, column: 13
                  S118861=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  switch(S118856){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 658, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 658, column: 13
                        S118856=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 658, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 658, column: 13
                          ends[74]=2;
                          ;//sysj\conveyor_controller.sysj line: 658, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 659, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 660, column: 13
                          S118705=8;
                          S118912=0;
                          active[74]=1;
                          ends[74]=1;
                          tdone[74]=1;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 658, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 658, column: 13
                        ends[74]=2;
                        ;//sysj\conveyor_controller.sysj line: 658, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 659, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 660, column: 13
                        S118705=8;
                        S118912=0;
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
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
                S118861=1;
                S118861=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 658, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 658, column: 13
                  S118861=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  S118856=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 658, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 658, column: 13
                    S118856=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 658, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 658, column: 13
                      ends[74]=2;
                      ;//sysj\conveyor_controller.sysj line: 658, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 659, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 660, column: 13
                      S118705=8;
                      S118912=0;
                      active[74]=1;
                      ends[74]=1;
                      tdone[74]=1;
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
          
          case 8 : 
            switch(S118912){
              case 0 : 
                if(!bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 661, column: 29
                  S118912=1;
                  if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 663, column: 23
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                  else {
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 661, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 611, column: 13
                    S118705=0;
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
                if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 663, column: 23
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  ends[74]=2;
                  ;//sysj\conveyor_controller.sysj line: 661, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 611, column: 13
                  S118705=0;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread183316(int [] tdone, int [] ends){
        S120110=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread183315(int [] tdone, int [] ends){
        S120107=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 708, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread183314(int [] tdone, int [] ends){
        S120137=1;
    S120113=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 705, column: 27
      thread183315(tdone,ends);
      thread183316(tdone,ends);
      int biggest183317 = 0;
      if(ends[85]>=biggest183317){
        biggest183317=ends[85];
      }
      if(ends[86]>=biggest183317){
        biggest183317=ends[86];
      }
      if(biggest183317 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S120113=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread183312(int [] tdone, int [] ends){
        S120075=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread183311(int [] tdone, int [] ends){
        S120072=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 689, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread183310(int [] tdone, int [] ends){
        S120102=1;
    S120078=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 686, column: 39
      thread183311(tdone,ends);
      thread183312(tdone,ends);
      int biggest183313 = 0;
      if(ends[82]>=biggest183313){
        biggest183313=ends[82];
      }
      if(ends[83]>=biggest183313){
        biggest183313=ends[83];
      }
      if(biggest183313 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S120078=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread183309(int [] tdone, int [] ends){
        S120067=1;
    S120011=0;
    S119991=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 676, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
      S119991=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S119986=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 676, column: 13
        S119986=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 676, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 677, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 678, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S120011=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S120011=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
        }
        else {
          active[80]=1;
          ends[80]=1;
          tdone[80]=1;
        }
      }
      else {
        active[80]=1;
        ends[80]=1;
        tdone[80]=1;
      }
    }
  }

  public void thread183308(int [] tdone, int [] ends){
        S119984=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 611, column: 13
    S118705=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread183305(int [] tdone, int [] ends){
        S120110=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread183304(int [] tdone, int [] ends){
        S120107=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 708, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread183303(int [] tdone, int [] ends){
        S120137=1;
    S120113=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 705, column: 27
      thread183304(tdone,ends);
      thread183305(tdone,ends);
      int biggest183306 = 0;
      if(ends[85]>=biggest183306){
        biggest183306=ends[85];
      }
      if(ends[86]>=biggest183306){
        biggest183306=ends[86];
      }
      if(biggest183306 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S120113=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread183301(int [] tdone, int [] ends){
        S120075=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread183300(int [] tdone, int [] ends){
        S120072=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 689, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread183299(int [] tdone, int [] ends){
        S120102=1;
    S120078=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 686, column: 39
      thread183300(tdone,ends);
      thread183301(tdone,ends);
      int biggest183302 = 0;
      if(ends[82]>=biggest183302){
        biggest183302=ends[82];
      }
      if(ends[83]>=biggest183302){
        biggest183302=ends[83];
      }
      if(biggest183302 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S120078=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread183298(int [] tdone, int [] ends){
        S120067=1;
    S120011=0;
    S119991=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 676, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
      S119991=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S119986=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 676, column: 13
        S119986=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 676, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 677, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 678, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S120011=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S120011=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
        }
        else {
          active[80]=1;
          ends[80]=1;
          tdone[80]=1;
        }
      }
      else {
        active[80]=1;
        ends[80]=1;
        tdone[80]=1;
      }
    }
  }

  public void thread183297(int [] tdone, int [] ends){
        S119984=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 611, column: 13
    S118705=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread183294(int [] tdone, int [] ends){
        S120110=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread183293(int [] tdone, int [] ends){
        S120107=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 708, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread183292(int [] tdone, int [] ends){
        S120137=1;
    S120113=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 705, column: 27
      thread183293(tdone,ends);
      thread183294(tdone,ends);
      int biggest183295 = 0;
      if(ends[85]>=biggest183295){
        biggest183295=ends[85];
      }
      if(ends[86]>=biggest183295){
        biggest183295=ends[86];
      }
      if(biggest183295 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S120113=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread183290(int [] tdone, int [] ends){
        S120075=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread183289(int [] tdone, int [] ends){
        S120072=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 689, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread183288(int [] tdone, int [] ends){
        S120102=1;
    S120078=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 686, column: 39
      thread183289(tdone,ends);
      thread183290(tdone,ends);
      int biggest183291 = 0;
      if(ends[82]>=biggest183291){
        biggest183291=ends[82];
      }
      if(ends[83]>=biggest183291){
        biggest183291=ends[83];
      }
      if(biggest183291 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S120078=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread183287(int [] tdone, int [] ends){
        S120067=1;
    S120011=0;
    S119991=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 676, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
      S119991=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S119986=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 676, column: 13
        S119986=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 676, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 677, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 678, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S120011=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S120011=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
        }
        else {
          active[80]=1;
          ends[80]=1;
          tdone[80]=1;
        }
      }
      else {
        active[80]=1;
        ends[80]=1;
        tdone[80]=1;
      }
    }
  }

  public void thread183286(int [] tdone, int [] ends){
        S119984=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 611, column: 13
    S118705=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread183283(int [] tdone, int [] ends){
        S120110=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread183282(int [] tdone, int [] ends){
        S120107=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 708, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread183281(int [] tdone, int [] ends){
        S120137=1;
    S120113=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 705, column: 27
      thread183282(tdone,ends);
      thread183283(tdone,ends);
      int biggest183284 = 0;
      if(ends[85]>=biggest183284){
        biggest183284=ends[85];
      }
      if(ends[86]>=biggest183284){
        biggest183284=ends[86];
      }
      if(biggest183284 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S120113=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread183279(int [] tdone, int [] ends){
        S120075=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread183278(int [] tdone, int [] ends){
        S120072=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 689, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread183277(int [] tdone, int [] ends){
        S120102=1;
    S120078=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 686, column: 39
      thread183278(tdone,ends);
      thread183279(tdone,ends);
      int biggest183280 = 0;
      if(ends[82]>=biggest183280){
        biggest183280=ends[82];
      }
      if(ends[83]>=biggest183280){
        biggest183280=ends[83];
      }
      if(biggest183280 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S120078=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread183276(int [] tdone, int [] ends){
        S120067=1;
    S120011=0;
    S119991=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 676, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
      S119991=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S119986=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 676, column: 13
        S119986=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 676, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 676, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 676, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 677, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 678, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S120011=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S120011=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
        }
        else {
          active[80]=1;
          ends[80]=1;
          tdone[80]=1;
        }
      }
      else {
        active[80]=1;
        ends[80]=1;
        tdone[80]=1;
      }
    }
  }

  public void thread183275(int [] tdone, int [] ends){
        S119984=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 611, column: 13
    S118705=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S124444){
        case 0 : 
          S124444=0;
          break RUN;
        
        case 1 : 
          S124444=2;
          S124444=2;
          bottleAtPos4_73.setClear();//sysj\conveyor_controller.sysj line: 605, column: 11
          S124443=0;
          S118687=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 606, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 606, column: 11
            S118687=1;
            active[73]=1;
            ends[73]=1;
            break RUN;
          }
          else {
            S118682=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 606, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 606, column: 11
              S118682=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 606, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 606, column: 11
                ends[73]=2;
                ;//sysj\conveyor_controller.sysj line: 606, column: 11
                S124443=1;
                thread183275(tdone,ends);
                thread183276(tdone,ends);
                thread183277(tdone,ends);
                thread183281(tdone,ends);
                int biggest183285 = 0;
                if(ends[74]>=biggest183285){
                  biggest183285=ends[74];
                }
                if(ends[80]>=biggest183285){
                  biggest183285=ends[80];
                }
                if(ends[81]>=biggest183285){
                  biggest183285=ends[81];
                }
                if(ends[84]>=biggest183285){
                  biggest183285=ends[84];
                }
                if(biggest183285 == 1){
                  active[73]=1;
                  ends[73]=1;
                  break RUN;
                }
              }
              else {
                active[73]=1;
                ends[73]=1;
                break RUN;
              }
            }
            else {
              active[73]=1;
              ends[73]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_73.setClear();//sysj\conveyor_controller.sysj line: 605, column: 11
          switch(S124443){
            case 0 : 
              switch(S118687){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 606, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 606, column: 11
                    S118687=1;
                    active[73]=1;
                    ends[73]=1;
                    break RUN;
                  }
                  else {
                    switch(S118682){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 606, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 606, column: 11
                          S118682=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 606, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 606, column: 11
                            ends[73]=2;
                            ;//sysj\conveyor_controller.sysj line: 606, column: 11
                            S124443=1;
                            thread183286(tdone,ends);
                            thread183287(tdone,ends);
                            thread183288(tdone,ends);
                            thread183292(tdone,ends);
                            int biggest183296 = 0;
                            if(ends[74]>=biggest183296){
                              biggest183296=ends[74];
                            }
                            if(ends[80]>=biggest183296){
                              biggest183296=ends[80];
                            }
                            if(ends[81]>=biggest183296){
                              biggest183296=ends[81];
                            }
                            if(ends[84]>=biggest183296){
                              biggest183296=ends[84];
                            }
                            if(biggest183296 == 1){
                              active[73]=1;
                              ends[73]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[73]=1;
                            ends[73]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[73]=1;
                          ends[73]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 606, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 606, column: 11
                          ends[73]=2;
                          ;//sysj\conveyor_controller.sysj line: 606, column: 11
                          S124443=1;
                          thread183297(tdone,ends);
                          thread183298(tdone,ends);
                          thread183299(tdone,ends);
                          thread183303(tdone,ends);
                          int biggest183307 = 0;
                          if(ends[74]>=biggest183307){
                            biggest183307=ends[74];
                          }
                          if(ends[80]>=biggest183307){
                            biggest183307=ends[80];
                          }
                          if(ends[81]>=biggest183307){
                            biggest183307=ends[81];
                          }
                          if(ends[84]>=biggest183307){
                            biggest183307=ends[84];
                          }
                          if(biggest183307 == 1){
                            active[73]=1;
                            ends[73]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[73]=1;
                          ends[73]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S118687=1;
                  S118687=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 606, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 606, column: 11
                    S118687=1;
                    active[73]=1;
                    ends[73]=1;
                    break RUN;
                  }
                  else {
                    S118682=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 606, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 606, column: 11
                      S118682=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 606, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 606, column: 11
                        ends[73]=2;
                        ;//sysj\conveyor_controller.sysj line: 606, column: 11
                        S124443=1;
                        thread183308(tdone,ends);
                        thread183309(tdone,ends);
                        thread183310(tdone,ends);
                        thread183314(tdone,ends);
                        int biggest183318 = 0;
                        if(ends[74]>=biggest183318){
                          biggest183318=ends[74];
                        }
                        if(ends[80]>=biggest183318){
                          biggest183318=ends[80];
                        }
                        if(ends[81]>=biggest183318){
                          biggest183318=ends[81];
                        }
                        if(ends[84]>=biggest183318){
                          biggest183318=ends[84];
                        }
                        if(biggest183318 == 1){
                          active[73]=1;
                          ends[73]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[73]=1;
                        ends[73]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[73]=1;
                      ends[73]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread183319(tdone,ends);
              thread183334(tdone,ends);
              thread183335(tdone,ends);
              thread183342(tdone,ends);
              int biggest183349 = 0;
              if(ends[74]>=biggest183349){
                biggest183349=ends[74];
              }
              if(ends[80]>=biggest183349){
                biggest183349=ends[80];
              }
              if(ends[81]>=biggest183349){
                biggest183349=ends[81];
              }
              if(ends[84]>=biggest183349){
                biggest183349=ends[84];
              }
              if(biggest183349 == 1){
                active[73]=1;
                ends[73]=1;
                break RUN;
              }
              //FINXME code
              if(biggest183349 == 0){
                S124444=0;
                active[73]=0;
                ends[73]=0;
                S124444=0;
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
    bottleAtPos4_73 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[73] != 0){
      int index = 73;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[73]!=0 || suspended[73]!=0 || active[73]!=1);
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
      bottleAtPos4_73.setpreclear();
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
      bottleAtPos4_73.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[73]!=0 || suspended[73]!=0 || active[73]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[73] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
