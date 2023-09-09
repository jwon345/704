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
  private int S31243 = 1;
  private int S31242 = 1;
  private int S28206 = 1;
  private int S28201 = 1;
  private int S28823 = 1;
  private int S28224 = 1;
  private int S28231 = 1;
  private int S28226 = 1;
  private int S28293 = 1;
  private int S28328 = 1;
  private int S28295 = 1;
  private int S28300 = 1;
  private int S28308 = 1;
  private int S28311 = 1;
  private int S28380 = 1;
  private int S28375 = 1;
  private int S28906 = 1;
  private int S28850 = 1;
  private int S28830 = 1;
  private int S28825 = 1;
  private int S28941 = 1;
  private int S28917 = 1;
  private int S28911 = 1;
  private int S28914 = 1;
  private int S28976 = 1;
  private int S28952 = 1;
  private int S28946 = 1;
  private int S28949 = 1;
  
  private int[] ends = new int[60];
  private int[] tdone = new int[60];
  
  public void thread31706(int [] tdone, int [] ends){
        S28949=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread31705(int [] tdone, int [] ends){
        S28946=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 477, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31703(int [] tdone, int [] ends){
        switch(S28949){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 481, column: 36
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

  public void thread31702(int [] tdone, int [] ends){
        switch(S28946){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 477, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread31701(int [] tdone, int [] ends){
        switch(S28976){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        switch(S28952){
          case 0 : 
            thread31702(tdone,ends);
            thread31703(tdone,ends);
            int biggest31704 = 0;
            if(ends[58]>=biggest31704){
              biggest31704=ends[58];
            }
            if(ends[59]>=biggest31704){
              biggest31704=ends[59];
            }
            if(biggest31704 == 1){
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            if(biggest31704 == 2){
              ends[57]=2;
              ;//sysj\conveyor_controller.sysj line: 475, column: 19
              S28952=1;
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            //FINXME code
            if(biggest31704 == 0){
              S28952=1;
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            break;
          
          case 1 : 
            S28952=1;
            S28952=0;
            if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 474, column: 27
              thread31705(tdone,ends);
              thread31706(tdone,ends);
              int biggest31707 = 0;
              if(ends[58]>=biggest31707){
                biggest31707=ends[58];
              }
              if(ends[59]>=biggest31707){
                biggest31707=ends[59];
              }
              if(biggest31707 == 1){
                active[57]=1;
                ends[57]=1;
                tdone[57]=1;
              }
            }
            else {
              S28952=1;
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31699(int [] tdone, int [] ends){
        S28914=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31698(int [] tdone, int [] ends){
        S28911=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31696(int [] tdone, int [] ends){
        switch(S28914){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 462, column: 37
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

  public void thread31695(int [] tdone, int [] ends){
        switch(S28911){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread31694(int [] tdone, int [] ends){
        switch(S28941){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S28917){
          case 0 : 
            thread31695(tdone,ends);
            thread31696(tdone,ends);
            int biggest31697 = 0;
            if(ends[55]>=biggest31697){
              biggest31697=ends[55];
            }
            if(ends[56]>=biggest31697){
              biggest31697=ends[56];
            }
            if(biggest31697 == 1){
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            if(biggest31697 == 2){
              ends[54]=2;
              ;//sysj\conveyor_controller.sysj line: 456, column: 20
              S28917=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            //FINXME code
            if(biggest31697 == 0){
              S28917=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 1 : 
            S28917=1;
            S28917=0;
            if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 455, column: 39
              thread31698(tdone,ends);
              thread31699(tdone,ends);
              int biggest31700 = 0;
              if(ends[55]>=biggest31700){
                biggest31700=ends[55];
              }
              if(ends[56]>=biggest31700){
                biggest31700=ends[56];
              }
              if(biggest31700 == 1){
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
            }
            else {
              S28917=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31693(int [] tdone, int [] ends){
        switch(S28906){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        switch(S28850){
          case 0 : 
            switch(S28830){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 445, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
                  S28830=1;
                  active[53]=1;
                  ends[53]=1;
                  tdone[53]=1;
                }
                else {
                  switch(S28825){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 445, column: 13
                        S28825=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
                          ends[53]=2;
                          ;//sysj\conveyor_controller.sysj line: 445, column: 13
                          if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 446, column: 16
                            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 14
                            currsigs.addElement(bottleAtPos4_46);
                            S28850=1;
                            active[53]=1;
                            ends[53]=1;
                            tdone[53]=1;
                          }
                          else {
                            S28850=1;
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
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
                        ends[53]=2;
                        ;//sysj\conveyor_controller.sysj line: 445, column: 13
                        if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 446, column: 16
                          bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 14
                          currsigs.addElement(bottleAtPos4_46);
                          S28850=1;
                          active[53]=1;
                          ends[53]=1;
                          tdone[53]=1;
                        }
                        else {
                          S28850=1;
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
                S28830=1;
                S28830=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 445, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
                  S28830=1;
                  active[53]=1;
                  ends[53]=1;
                  tdone[53]=1;
                }
                else {
                  S28825=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 445, column: 13
                    S28825=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
                      ends[53]=2;
                      ;//sysj\conveyor_controller.sysj line: 445, column: 13
                      if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 446, column: 16
                        bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 14
                        currsigs.addElement(bottleAtPos4_46);
                        S28850=1;
                        active[53]=1;
                        ends[53]=1;
                        tdone[53]=1;
                      }
                      else {
                        S28850=1;
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
            S28850=1;
            S28850=0;
            S28830=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 445, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
              S28830=1;
              active[53]=1;
              ends[53]=1;
              tdone[53]=1;
            }
            else {
              S28825=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 445, column: 13
                S28825=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
                  ends[53]=2;
                  ;//sysj\conveyor_controller.sysj line: 445, column: 13
                  if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 446, column: 16
                    bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 14
                    currsigs.addElement(bottleAtPos4_46);
                    S28850=1;
                    active[53]=1;
                    ends[53]=1;
                    tdone[53]=1;
                  }
                  else {
                    S28850=1;
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

  public void thread31690(int [] tdone, int [] ends){
        switch(S28311){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 424, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 425, column: 16
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

  public void thread31689(int [] tdone, int [] ends){
        switch(S28308){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 420, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
        break;
      
    }
  }

  public void thread31688(int [] tdone, int [] ends){
        switch(S28300){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 415, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
        break;
      
    }
  }

  public void thread31686(int [] tdone, int [] ends){
        S28311=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread31685(int [] tdone, int [] ends){
        S28308=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 419, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 420, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread31684(int [] tdone, int [] ends){
        S28300=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 415, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread31683(int [] tdone, int [] ends){
        switch(S28328){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        switch(S28295){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 412, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 413, column: 15
              S28295=1;
              thread31684(tdone,ends);
              thread31685(tdone,ends);
              thread31686(tdone,ends);
              int biggest31687 = 0;
              if(ends[50]>=biggest31687){
                biggest31687=ends[50];
              }
              if(ends[51]>=biggest31687){
                biggest31687=ends[51];
              }
              if(ends[52]>=biggest31687){
                biggest31687=ends[52];
              }
              if(biggest31687 == 1){
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
            thread31688(tdone,ends);
            thread31689(tdone,ends);
            thread31690(tdone,ends);
            int biggest31691 = 0;
            if(ends[50]>=biggest31691){
              biggest31691=ends[50];
            }
            if(ends[51]>=biggest31691){
              biggest31691=ends[51];
            }
            if(ends[52]>=biggest31691){
              biggest31691=ends[52];
            }
            if(biggest31691 == 1){
              active[49]=1;
              ends[49]=1;
              tdone[49]=1;
            }
            if(biggest31691 == 2){
              ends[49]=2;
              tdone[49]=1;
            }
            //FINXME code
            if(biggest31691 == 0){
              S28328=0;
              active[49]=0;
              ends[49]=0;
              tdone[49]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31682(int [] tdone, int [] ends){
        switch(S28293){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 408, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
        break;
      
    }
  }

  public void thread31680(int [] tdone, int [] ends){
        S28328=1;
    S28295=0;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread31679(int [] tdone, int [] ends){
        S28293=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 408, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread31678(int [] tdone, int [] ends){
        switch(S28823){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        switch(S28224){
          case 0 : 
            if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 387, column: 19
              S28224=1;
              S28231=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 388, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 13
                S28231=1;
                active[47]=1;
                ends[47]=1;
                tdone[47]=1;
              }
              else {
                S28226=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 388, column: 13
                  S28226=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 13
                    ends[47]=2;
                    ;//sysj\conveyor_controller.sysj line: 388, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 389, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 390, column: 13
                    S28224=2;
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
            switch(S28231){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 388, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 13
                  S28231=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  switch(S28226){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 388, column: 13
                        S28226=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 13
                          ends[47]=2;
                          ;//sysj\conveyor_controller.sysj line: 388, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 389, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 390, column: 13
                          S28224=2;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 13
                        ends[47]=2;
                        ;//sysj\conveyor_controller.sysj line: 388, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 389, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 390, column: 13
                        S28224=2;
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
                S28231=1;
                S28231=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 388, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 13
                  S28231=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  S28226=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 388, column: 13
                    S28226=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 388, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 388, column: 13
                      ends[47]=2;
                      ;//sysj\conveyor_controller.sysj line: 388, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 389, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 390, column: 13
                      S28224=2;
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
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 391, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 395, column: 13
              S28224=3;
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
            S28224=3;
            S28224=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 401, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 399, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 404, column: 13
              S28224=5;
              thread31679(tdone,ends);
              thread31680(tdone,ends);
              int biggest31681 = 0;
              if(ends[48]>=biggest31681){
                biggest31681=ends[48];
              }
              if(ends[49]>=biggest31681){
                biggest31681=ends[49];
              }
              if(biggest31681 == 1){
                active[47]=1;
                ends[47]=1;
                tdone[47]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 5 : 
            thread31682(tdone,ends);
            thread31683(tdone,ends);
            int biggest31692 = 0;
            if(ends[48]>=biggest31692){
              biggest31692=ends[48];
            }
            if(ends[49]>=biggest31692){
              biggest31692=ends[49];
            }
            if(biggest31692 == 1){
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            if(biggest31692 == 2){
              ends[47]=2;
              ;//sysj\conveyor_controller.sysj line: 407, column: 13
              S28224=6;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            //FINXME code
            if(biggest31692 == 0){
              S28224=6;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 431, column: 19
              S28224=7;
              S28380=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 433, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 433, column: 13
                S28380=1;
                active[47]=1;
                ends[47]=1;
                tdone[47]=1;
              }
              else {
                S28375=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 433, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 433, column: 13
                  S28375=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 433, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 433, column: 13
                    ends[47]=2;
                    ;//sysj\conveyor_controller.sysj line: 433, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 434, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 435, column: 13
                    S28224=8;
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
            switch(S28380){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 433, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 433, column: 13
                  S28380=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  switch(S28375){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 433, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 433, column: 13
                        S28375=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 433, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 433, column: 13
                          ends[47]=2;
                          ;//sysj\conveyor_controller.sysj line: 433, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 434, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 435, column: 13
                          S28224=8;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 433, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 433, column: 13
                        ends[47]=2;
                        ;//sysj\conveyor_controller.sysj line: 433, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 434, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 435, column: 13
                        S28224=8;
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
                S28380=1;
                S28380=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 433, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 433, column: 13
                  S28380=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  S28375=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 433, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 433, column: 13
                    S28375=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 433, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 433, column: 13
                      ends[47]=2;
                      ;//sysj\conveyor_controller.sysj line: 433, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 434, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 435, column: 13
                      S28224=8;
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
            if(!bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 436, column: 19
              System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 386, column: 13
              S28224=0;
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

  public void thread31675(int [] tdone, int [] ends){
        S28949=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread31674(int [] tdone, int [] ends){
        S28946=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 477, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31673(int [] tdone, int [] ends){
        S28976=1;
    S28952=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 474, column: 27
      thread31674(tdone,ends);
      thread31675(tdone,ends);
      int biggest31676 = 0;
      if(ends[58]>=biggest31676){
        biggest31676=ends[58];
      }
      if(ends[59]>=biggest31676){
        biggest31676=ends[59];
      }
      if(biggest31676 == 1){
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
    else {
      S28952=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread31671(int [] tdone, int [] ends){
        S28914=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31670(int [] tdone, int [] ends){
        S28911=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31669(int [] tdone, int [] ends){
        S28941=1;
    S28917=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 455, column: 39
      thread31670(tdone,ends);
      thread31671(tdone,ends);
      int biggest31672 = 0;
      if(ends[55]>=biggest31672){
        biggest31672=ends[55];
      }
      if(ends[56]>=biggest31672){
        biggest31672=ends[56];
      }
      if(biggest31672 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S28917=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread31668(int [] tdone, int [] ends){
        S28906=1;
    S28850=0;
    S28830=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 445, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
      S28830=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      S28825=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 445, column: 13
        S28825=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
          ends[53]=2;
          ;//sysj\conveyor_controller.sysj line: 445, column: 13
          if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 446, column: 16
            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 14
            currsigs.addElement(bottleAtPos4_46);
            S28850=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
          else {
            S28850=1;
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

  public void thread31667(int [] tdone, int [] ends){
        S28823=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 386, column: 13
    S28224=0;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread31664(int [] tdone, int [] ends){
        S28949=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread31663(int [] tdone, int [] ends){
        S28946=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 477, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31662(int [] tdone, int [] ends){
        S28976=1;
    S28952=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 474, column: 27
      thread31663(tdone,ends);
      thread31664(tdone,ends);
      int biggest31665 = 0;
      if(ends[58]>=biggest31665){
        biggest31665=ends[58];
      }
      if(ends[59]>=biggest31665){
        biggest31665=ends[59];
      }
      if(biggest31665 == 1){
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
    else {
      S28952=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread31660(int [] tdone, int [] ends){
        S28914=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31659(int [] tdone, int [] ends){
        S28911=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31658(int [] tdone, int [] ends){
        S28941=1;
    S28917=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 455, column: 39
      thread31659(tdone,ends);
      thread31660(tdone,ends);
      int biggest31661 = 0;
      if(ends[55]>=biggest31661){
        biggest31661=ends[55];
      }
      if(ends[56]>=biggest31661){
        biggest31661=ends[56];
      }
      if(biggest31661 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S28917=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread31657(int [] tdone, int [] ends){
        S28906=1;
    S28850=0;
    S28830=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 445, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
      S28830=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      S28825=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 445, column: 13
        S28825=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
          ends[53]=2;
          ;//sysj\conveyor_controller.sysj line: 445, column: 13
          if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 446, column: 16
            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 14
            currsigs.addElement(bottleAtPos4_46);
            S28850=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
          else {
            S28850=1;
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

  public void thread31656(int [] tdone, int [] ends){
        S28823=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 386, column: 13
    S28224=0;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread31653(int [] tdone, int [] ends){
        S28949=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread31652(int [] tdone, int [] ends){
        S28946=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 477, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31651(int [] tdone, int [] ends){
        S28976=1;
    S28952=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 474, column: 27
      thread31652(tdone,ends);
      thread31653(tdone,ends);
      int biggest31654 = 0;
      if(ends[58]>=biggest31654){
        biggest31654=ends[58];
      }
      if(ends[59]>=biggest31654){
        biggest31654=ends[59];
      }
      if(biggest31654 == 1){
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
    else {
      S28952=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread31649(int [] tdone, int [] ends){
        S28914=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31648(int [] tdone, int [] ends){
        S28911=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31647(int [] tdone, int [] ends){
        S28941=1;
    S28917=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 455, column: 39
      thread31648(tdone,ends);
      thread31649(tdone,ends);
      int biggest31650 = 0;
      if(ends[55]>=biggest31650){
        biggest31650=ends[55];
      }
      if(ends[56]>=biggest31650){
        biggest31650=ends[56];
      }
      if(biggest31650 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S28917=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread31646(int [] tdone, int [] ends){
        S28906=1;
    S28850=0;
    S28830=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 445, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
      S28830=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      S28825=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 445, column: 13
        S28825=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
          ends[53]=2;
          ;//sysj\conveyor_controller.sysj line: 445, column: 13
          if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 446, column: 16
            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 14
            currsigs.addElement(bottleAtPos4_46);
            S28850=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
          else {
            S28850=1;
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

  public void thread31645(int [] tdone, int [] ends){
        S28823=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 386, column: 13
    S28224=0;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread31642(int [] tdone, int [] ends){
        S28949=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread31641(int [] tdone, int [] ends){
        S28946=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 477, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31640(int [] tdone, int [] ends){
        S28976=1;
    S28952=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 474, column: 27
      thread31641(tdone,ends);
      thread31642(tdone,ends);
      int biggest31643 = 0;
      if(ends[58]>=biggest31643){
        biggest31643=ends[58];
      }
      if(ends[59]>=biggest31643){
        biggest31643=ends[59];
      }
      if(biggest31643 == 1){
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
    else {
      S28952=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread31638(int [] tdone, int [] ends){
        S28914=1;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31637(int [] tdone, int [] ends){
        S28911=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31636(int [] tdone, int [] ends){
        S28941=1;
    S28917=0;
    if(bottleAtPos4_46.getprestatus()){//sysj\conveyor_controller.sysj line: 455, column: 39
      thread31637(tdone,ends);
      thread31638(tdone,ends);
      int biggest31639 = 0;
      if(ends[55]>=biggest31639){
        biggest31639=ends[55];
      }
      if(ends[56]>=biggest31639){
        biggest31639=ends[56];
      }
      if(biggest31639 == 1){
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
    else {
      S28917=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread31635(int [] tdone, int [] ends){
        S28906=1;
    S28850=0;
    S28830=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 445, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
      S28830=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      S28825=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 445, column: 13
        S28825=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 445, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 445, column: 13
          ends[53]=2;
          ;//sysj\conveyor_controller.sysj line: 445, column: 13
          if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 446, column: 16
            bottleAtPos4_46.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 14
            currsigs.addElement(bottleAtPos4_46);
            S28850=1;
            active[53]=1;
            ends[53]=1;
            tdone[53]=1;
          }
          else {
            S28850=1;
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

  public void thread31634(int [] tdone, int [] ends){
        S28823=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 386, column: 13
    S28224=0;
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
      switch(S31243){
        case 0 : 
          S31243=0;
          break RUN;
        
        case 1 : 
          S31243=2;
          S31243=2;
          bottleAtPos4_46.setClear();//sysj\conveyor_controller.sysj line: 380, column: 11
          S31242=0;
          S28206=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 381, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
            S28206=1;
            active[46]=1;
            ends[46]=1;
            break RUN;
          }
          else {
            S28201=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 381, column: 11
              S28201=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
                ends[46]=2;
                ;//sysj\conveyor_controller.sysj line: 381, column: 11
                S31242=1;
                thread31634(tdone,ends);
                thread31635(tdone,ends);
                thread31636(tdone,ends);
                thread31640(tdone,ends);
                int biggest31644 = 0;
                if(ends[47]>=biggest31644){
                  biggest31644=ends[47];
                }
                if(ends[53]>=biggest31644){
                  biggest31644=ends[53];
                }
                if(ends[54]>=biggest31644){
                  biggest31644=ends[54];
                }
                if(ends[57]>=biggest31644){
                  biggest31644=ends[57];
                }
                if(biggest31644 == 1){
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
          bottleAtPos4_46.setClear();//sysj\conveyor_controller.sysj line: 380, column: 11
          switch(S31242){
            case 0 : 
              switch(S28206){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 381, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
                    S28206=1;
                    active[46]=1;
                    ends[46]=1;
                    break RUN;
                  }
                  else {
                    switch(S28201){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 381, column: 11
                          S28201=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
                            ends[46]=2;
                            ;//sysj\conveyor_controller.sysj line: 381, column: 11
                            S31242=1;
                            thread31645(tdone,ends);
                            thread31646(tdone,ends);
                            thread31647(tdone,ends);
                            thread31651(tdone,ends);
                            int biggest31655 = 0;
                            if(ends[47]>=biggest31655){
                              biggest31655=ends[47];
                            }
                            if(ends[53]>=biggest31655){
                              biggest31655=ends[53];
                            }
                            if(ends[54]>=biggest31655){
                              biggest31655=ends[54];
                            }
                            if(ends[57]>=biggest31655){
                              biggest31655=ends[57];
                            }
                            if(biggest31655 == 1){
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
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
                          ends[46]=2;
                          ;//sysj\conveyor_controller.sysj line: 381, column: 11
                          S31242=1;
                          thread31656(tdone,ends);
                          thread31657(tdone,ends);
                          thread31658(tdone,ends);
                          thread31662(tdone,ends);
                          int biggest31666 = 0;
                          if(ends[47]>=biggest31666){
                            biggest31666=ends[47];
                          }
                          if(ends[53]>=biggest31666){
                            biggest31666=ends[53];
                          }
                          if(ends[54]>=biggest31666){
                            biggest31666=ends[54];
                          }
                          if(ends[57]>=biggest31666){
                            biggest31666=ends[57];
                          }
                          if(biggest31666 == 1){
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
                  S28206=1;
                  S28206=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 381, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
                    S28206=1;
                    active[46]=1;
                    ends[46]=1;
                    break RUN;
                  }
                  else {
                    S28201=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 381, column: 11
                      S28201=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
                        ends[46]=2;
                        ;//sysj\conveyor_controller.sysj line: 381, column: 11
                        S31242=1;
                        thread31667(tdone,ends);
                        thread31668(tdone,ends);
                        thread31669(tdone,ends);
                        thread31673(tdone,ends);
                        int biggest31677 = 0;
                        if(ends[47]>=biggest31677){
                          biggest31677=ends[47];
                        }
                        if(ends[53]>=biggest31677){
                          biggest31677=ends[53];
                        }
                        if(ends[54]>=biggest31677){
                          biggest31677=ends[54];
                        }
                        if(ends[57]>=biggest31677){
                          biggest31677=ends[57];
                        }
                        if(biggest31677 == 1){
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
              thread31678(tdone,ends);
              thread31693(tdone,ends);
              thread31694(tdone,ends);
              thread31701(tdone,ends);
              int biggest31708 = 0;
              if(ends[47]>=biggest31708){
                biggest31708=ends[47];
              }
              if(ends[53]>=biggest31708){
                biggest31708=ends[53];
              }
              if(ends[54]>=biggest31708){
                biggest31708=ends[54];
              }
              if(ends[57]>=biggest31708){
                biggest31708=ends[57];
              }
              if(biggest31708 == 1){
                active[46]=1;
                ends[46]=1;
                break RUN;
              }
              //FINXME code
              if(biggest31708 == 0){
                S31243=0;
                active[46]=0;
                ends[46]=0;
                S31243=0;
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
