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
  private Signal bottleAtPos4_63;
  private int S35274 = 1;
  private int S35273 = 1;
  private int S29517 = 1;
  private int S29512 = 1;
  private int S30814 = 1;
  private int S29535 = 1;
  private int S29542 = 1;
  private int S29537 = 1;
  private int S29604 = 1;
  private int S29639 = 1;
  private int S29606 = 1;
  private int S29611 = 1;
  private int S29619 = 1;
  private int S29622 = 1;
  private int S29691 = 1;
  private int S29686 = 1;
  private int S29742 = 1;
  private int S30897 = 1;
  private int S30841 = 1;
  private int S30821 = 1;
  private int S30816 = 1;
  private int S30932 = 1;
  private int S30908 = 1;
  private int S30902 = 1;
  private int S30905 = 1;
  private int S30967 = 1;
  private int S30943 = 1;
  private int S30937 = 1;
  private int S30940 = 1;
  
  private int[] ends = new int[77];
  private int[] tdone = new int[77];
  
  public void thread35901(int [] tdone, int [] ends){
        S30940=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread35900(int [] tdone, int [] ends){
        S30937=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread35898(int [] tdone, int [] ends){
        switch(S30940){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 605, column: 36
          ends[76]=2;
          tdone[76]=1;
        }
        else {
          active[76]=1;
          ends[76]=1;
          tdone[76]=1;
        }
        break;
      
    }
  }

  public void thread35897(int [] tdone, int [] ends){
        switch(S30937){
      case 0 : 
        active[75]=0;
        ends[75]=0;
        tdone[75]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
        break;
      
    }
  }

  public void thread35896(int [] tdone, int [] ends){
        switch(S30967){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        switch(S30943){
          case 0 : 
            thread35897(tdone,ends);
            thread35898(tdone,ends);
            int biggest35899 = 0;
            if(ends[75]>=biggest35899){
              biggest35899=ends[75];
            }
            if(ends[76]>=biggest35899){
              biggest35899=ends[76];
            }
            if(biggest35899 == 1){
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            if(biggest35899 == 2){
              ends[74]=2;
              ;//sysj\conveyor_controller.sysj line: 599, column: 19
              S30943=1;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            //FINXME code
            if(biggest35899 == 0){
              S30943=1;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 1 : 
            S30943=1;
            S30943=0;
            if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 598, column: 27
              thread35900(tdone,ends);
              thread35901(tdone,ends);
              int biggest35902 = 0;
              if(ends[75]>=biggest35902){
                biggest35902=ends[75];
              }
              if(ends[76]>=biggest35902){
                biggest35902=ends[76];
              }
              if(biggest35902 == 1){
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
            }
            else {
              S30943=1;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35894(int [] tdone, int [] ends){
        S30905=1;
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread35893(int [] tdone, int [] ends){
        S30902=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 582, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread35891(int [] tdone, int [] ends){
        switch(S30905){
      case 0 : 
        active[73]=0;
        ends[73]=0;
        tdone[73]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 586, column: 37
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

  public void thread35890(int [] tdone, int [] ends){
        switch(S30902){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 582, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
        break;
      
    }
  }

  public void thread35889(int [] tdone, int [] ends){
        switch(S30932){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        switch(S30908){
          case 0 : 
            thread35890(tdone,ends);
            thread35891(tdone,ends);
            int biggest35892 = 0;
            if(ends[72]>=biggest35892){
              biggest35892=ends[72];
            }
            if(ends[73]>=biggest35892){
              biggest35892=ends[73];
            }
            if(biggest35892 == 1){
              active[71]=1;
              ends[71]=1;
              tdone[71]=1;
            }
            if(biggest35892 == 2){
              ends[71]=2;
              ;//sysj\conveyor_controller.sysj line: 580, column: 20
              S30908=1;
              active[71]=1;
              ends[71]=1;
              tdone[71]=1;
            }
            //FINXME code
            if(biggest35892 == 0){
              S30908=1;
              active[71]=1;
              ends[71]=1;
              tdone[71]=1;
            }
            break;
          
          case 1 : 
            S30908=1;
            S30908=0;
            if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 579, column: 39
              thread35893(tdone,ends);
              thread35894(tdone,ends);
              int biggest35895 = 0;
              if(ends[72]>=biggest35895){
                biggest35895=ends[72];
              }
              if(ends[73]>=biggest35895){
                biggest35895=ends[73];
              }
              if(biggest35895 == 1){
                active[71]=1;
                ends[71]=1;
                tdone[71]=1;
              }
            }
            else {
              S30908=1;
              active[71]=1;
              ends[71]=1;
              tdone[71]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35888(int [] tdone, int [] ends){
        switch(S30897){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        switch(S30841){
          case 0 : 
            switch(S30821){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
                  S30821=1;
                  active[70]=1;
                  ends[70]=1;
                  tdone[70]=1;
                }
                else {
                  switch(S30816){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
                        S30816=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
                          ends[70]=2;
                          ;//sysj\conveyor_controller.sysj line: 569, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
                            bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
                            currsigs.addElement(bottleAtPos4_63);
                            S30841=1;
                            active[70]=1;
                            ends[70]=1;
                            tdone[70]=1;
                          }
                          else {
                            S30841=1;
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
                      }
                      else {
                        active[70]=1;
                        ends[70]=1;
                        tdone[70]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
                        ends[70]=2;
                        ;//sysj\conveyor_controller.sysj line: 569, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
                          bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
                          currsigs.addElement(bottleAtPos4_63);
                          S30841=1;
                          active[70]=1;
                          ends[70]=1;
                          tdone[70]=1;
                        }
                        else {
                          S30841=1;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S30821=1;
                S30821=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
                  S30821=1;
                  active[70]=1;
                  ends[70]=1;
                  tdone[70]=1;
                }
                else {
                  S30816=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
                    S30816=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
                      ends[70]=2;
                      ;//sysj\conveyor_controller.sysj line: 569, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
                        bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
                        currsigs.addElement(bottleAtPos4_63);
                        S30841=1;
                        active[70]=1;
                        ends[70]=1;
                        tdone[70]=1;
                      }
                      else {
                        S30841=1;
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
                  }
                  else {
                    active[70]=1;
                    ends[70]=1;
                    tdone[70]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S30841=1;
            S30841=0;
            S30821=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
              S30821=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            else {
              S30816=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
                S30816=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
                  ends[70]=2;
                  ;//sysj\conveyor_controller.sysj line: 569, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
                    bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
                    currsigs.addElement(bottleAtPos4_63);
                    S30841=1;
                    active[70]=1;
                    ends[70]=1;
                    tdone[70]=1;
                  }
                  else {
                    S30841=1;
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
              }
              else {
                active[70]=1;
                ends[70]=1;
                tdone[70]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35885(int [] tdone, int [] ends){
        switch(S29622){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 542, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 543, column: 16
          ends[69]=2;
          tdone[69]=1;
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
        break;
      
    }
  }

  public void thread35884(int [] tdone, int [] ends){
        switch(S29619){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 538, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
        break;
      
    }
  }

  public void thread35883(int [] tdone, int [] ends){
        switch(S29611){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 533, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread35881(int [] tdone, int [] ends){
        S29622=1;
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread35880(int [] tdone, int [] ends){
        S29619=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 537, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 538, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread35879(int [] tdone, int [] ends){
        S29611=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 533, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread35878(int [] tdone, int [] ends){
        switch(S29639){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        switch(S29606){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 530, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 531, column: 15
              S29606=1;
              thread35879(tdone,ends);
              thread35880(tdone,ends);
              thread35881(tdone,ends);
              int biggest35882 = 0;
              if(ends[67]>=biggest35882){
                biggest35882=ends[67];
              }
              if(ends[68]>=biggest35882){
                biggest35882=ends[68];
              }
              if(ends[69]>=biggest35882){
                biggest35882=ends[69];
              }
              if(biggest35882 == 1){
                active[66]=1;
                ends[66]=1;
                tdone[66]=1;
              }
            }
            else {
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            break;
          
          case 1 : 
            thread35883(tdone,ends);
            thread35884(tdone,ends);
            thread35885(tdone,ends);
            int biggest35886 = 0;
            if(ends[67]>=biggest35886){
              biggest35886=ends[67];
            }
            if(ends[68]>=biggest35886){
              biggest35886=ends[68];
            }
            if(ends[69]>=biggest35886){
              biggest35886=ends[69];
            }
            if(biggest35886 == 1){
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            if(biggest35886 == 2){
              ends[66]=2;
              tdone[66]=1;
            }
            //FINXME code
            if(biggest35886 == 0){
              S29639=0;
              active[66]=0;
              ends[66]=0;
              tdone[66]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35877(int [] tdone, int [] ends){
        switch(S29604){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 526, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
        break;
      
    }
  }

  public void thread35875(int [] tdone, int [] ends){
        S29639=1;
    S29606=0;
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread35874(int [] tdone, int [] ends){
        S29604=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 526, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread35873(int [] tdone, int [] ends){
        switch(S30814){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        switch(S29535){
          case 0 : 
            if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 505, column: 19
              S29535=1;
              S29542=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 506, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 506, column: 13
                S29542=1;
                active[64]=1;
                ends[64]=1;
                tdone[64]=1;
              }
              else {
                S29537=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 506, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 506, column: 13
                  S29537=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 506, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 506, column: 13
                    ends[64]=2;
                    ;//sysj\conveyor_controller.sysj line: 506, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 507, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 508, column: 13
                    S29535=2;
                    active[64]=1;
                    ends[64]=1;
                    tdone[64]=1;
                  }
                  else {
                    active[64]=1;
                    ends[64]=1;
                    tdone[64]=1;
                  }
                }
                else {
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
              }
            }
            else {
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            break;
          
          case 1 : 
            switch(S29542){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 506, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 506, column: 13
                  S29542=1;
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                else {
                  switch(S29537){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 506, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 506, column: 13
                        S29537=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 506, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 506, column: 13
                          ends[64]=2;
                          ;//sysj\conveyor_controller.sysj line: 506, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 507, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 508, column: 13
                          S29535=2;
                          active[64]=1;
                          ends[64]=1;
                          tdone[64]=1;
                        }
                        else {
                          active[64]=1;
                          ends[64]=1;
                          tdone[64]=1;
                        }
                      }
                      else {
                        active[64]=1;
                        ends[64]=1;
                        tdone[64]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 506, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 506, column: 13
                        ends[64]=2;
                        ;//sysj\conveyor_controller.sysj line: 506, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 507, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 508, column: 13
                        S29535=2;
                        active[64]=1;
                        ends[64]=1;
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
                break;
              
              case 1 : 
                S29542=1;
                S29542=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 506, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 506, column: 13
                  S29542=1;
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                else {
                  S29537=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 506, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 506, column: 13
                    S29537=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 506, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 506, column: 13
                      ends[64]=2;
                      ;//sysj\conveyor_controller.sysj line: 506, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 507, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 508, column: 13
                      S29535=2;
                      active[64]=1;
                      ends[64]=1;
                      tdone[64]=1;
                    }
                    else {
                      active[64]=1;
                      ends[64]=1;
                      tdone[64]=1;
                    }
                  }
                  else {
                    active[64]=1;
                    ends[64]=1;
                    tdone[64]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 509, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 513, column: 13
              S29535=3;
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            else {
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            break;
          
          case 3 : 
            S29535=3;
            S29535=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 519, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 520, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[64]=1;
            ends[64]=1;
            tdone[64]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 517, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 522, column: 13
              S29535=5;
              thread35874(tdone,ends);
              thread35875(tdone,ends);
              int biggest35876 = 0;
              if(ends[65]>=biggest35876){
                biggest35876=ends[65];
              }
              if(ends[66]>=biggest35876){
                biggest35876=ends[66];
              }
              if(biggest35876 == 1){
                active[64]=1;
                ends[64]=1;
                tdone[64]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 520, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            break;
          
          case 5 : 
            thread35877(tdone,ends);
            thread35878(tdone,ends);
            int biggest35887 = 0;
            if(ends[65]>=biggest35887){
              biggest35887=ends[65];
            }
            if(ends[66]>=biggest35887){
              biggest35887=ends[66];
            }
            if(biggest35887 == 1){
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            if(biggest35887 == 2){
              ends[64]=2;
              ;//sysj\conveyor_controller.sysj line: 525, column: 13
              S29535=6;
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            //FINXME code
            if(biggest35887 == 0){
              S29535=6;
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 549, column: 19
              S29535=7;
              S29691=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 551, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 551, column: 13
                S29691=1;
                active[64]=1;
                ends[64]=1;
                tdone[64]=1;
              }
              else {
                S29686=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 551, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 551, column: 13
                  S29686=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 551, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 551, column: 13
                    ends[64]=2;
                    ;//sysj\conveyor_controller.sysj line: 551, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 552, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 553, column: 13
                    S29535=8;
                    S29742=0;
                    active[64]=1;
                    ends[64]=1;
                    tdone[64]=1;
                  }
                  else {
                    active[64]=1;
                    ends[64]=1;
                    tdone[64]=1;
                  }
                }
                else {
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
              }
            }
            else {
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            break;
          
          case 7 : 
            switch(S29691){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 551, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 551, column: 13
                  S29691=1;
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                else {
                  switch(S29686){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 551, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 551, column: 13
                        S29686=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 551, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 551, column: 13
                          ends[64]=2;
                          ;//sysj\conveyor_controller.sysj line: 551, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 552, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 553, column: 13
                          S29535=8;
                          S29742=0;
                          active[64]=1;
                          ends[64]=1;
                          tdone[64]=1;
                        }
                        else {
                          active[64]=1;
                          ends[64]=1;
                          tdone[64]=1;
                        }
                      }
                      else {
                        active[64]=1;
                        ends[64]=1;
                        tdone[64]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 551, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 551, column: 13
                        ends[64]=2;
                        ;//sysj\conveyor_controller.sysj line: 551, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 552, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 553, column: 13
                        S29535=8;
                        S29742=0;
                        active[64]=1;
                        ends[64]=1;
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
                break;
              
              case 1 : 
                S29691=1;
                S29691=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 551, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 551, column: 13
                  S29691=1;
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                else {
                  S29686=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 551, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 551, column: 13
                    S29686=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 551, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 551, column: 13
                      ends[64]=2;
                      ;//sysj\conveyor_controller.sysj line: 551, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 552, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 553, column: 13
                      S29535=8;
                      S29742=0;
                      active[64]=1;
                      ends[64]=1;
                      tdone[64]=1;
                    }
                    else {
                      active[64]=1;
                      ends[64]=1;
                      tdone[64]=1;
                    }
                  }
                  else {
                    active[64]=1;
                    ends[64]=1;
                    tdone[64]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S29742){
              case 0 : 
                if(!bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 554, column: 29
                  S29742=1;
                  if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 556, column: 23
                    active[64]=1;
                    ends[64]=1;
                    tdone[64]=1;
                  }
                  else {
                    ends[64]=2;
                    ;//sysj\conveyor_controller.sysj line: 554, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 504, column: 13
                    S29535=0;
                    active[64]=1;
                    ends[64]=1;
                    tdone[64]=1;
                  }
                }
                else {
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 556, column: 23
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                else {
                  ends[64]=2;
                  ;//sysj\conveyor_controller.sysj line: 554, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 504, column: 13
                  S29535=0;
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35870(int [] tdone, int [] ends){
        S30940=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread35869(int [] tdone, int [] ends){
        S30937=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread35868(int [] tdone, int [] ends){
        S30967=1;
    S30943=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 598, column: 27
      thread35869(tdone,ends);
      thread35870(tdone,ends);
      int biggest35871 = 0;
      if(ends[75]>=biggest35871){
        biggest35871=ends[75];
      }
      if(ends[76]>=biggest35871){
        biggest35871=ends[76];
      }
      if(biggest35871 == 1){
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
    else {
      S30943=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread35866(int [] tdone, int [] ends){
        S30905=1;
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread35865(int [] tdone, int [] ends){
        S30902=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 582, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread35864(int [] tdone, int [] ends){
        S30932=1;
    S30908=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 579, column: 39
      thread35865(tdone,ends);
      thread35866(tdone,ends);
      int biggest35867 = 0;
      if(ends[72]>=biggest35867){
        biggest35867=ends[72];
      }
      if(ends[73]>=biggest35867){
        biggest35867=ends[73];
      }
      if(biggest35867 == 1){
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
      }
    }
    else {
      S30908=1;
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
  }

  public void thread35863(int [] tdone, int [] ends){
        S30897=1;
    S30841=0;
    S30821=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
      S30821=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
    else {
      S30816=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
        S30816=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
          ends[70]=2;
          ;//sysj\conveyor_controller.sysj line: 569, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
            bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
            currsigs.addElement(bottleAtPos4_63);
            S30841=1;
            active[70]=1;
            ends[70]=1;
            tdone[70]=1;
          }
          else {
            S30841=1;
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
      }
      else {
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
  }

  public void thread35862(int [] tdone, int [] ends){
        S30814=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 504, column: 13
    S29535=0;
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread35859(int [] tdone, int [] ends){
        S30940=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread35858(int [] tdone, int [] ends){
        S30937=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread35857(int [] tdone, int [] ends){
        S30967=1;
    S30943=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 598, column: 27
      thread35858(tdone,ends);
      thread35859(tdone,ends);
      int biggest35860 = 0;
      if(ends[75]>=biggest35860){
        biggest35860=ends[75];
      }
      if(ends[76]>=biggest35860){
        biggest35860=ends[76];
      }
      if(biggest35860 == 1){
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
    else {
      S30943=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread35855(int [] tdone, int [] ends){
        S30905=1;
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread35854(int [] tdone, int [] ends){
        S30902=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 582, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread35853(int [] tdone, int [] ends){
        S30932=1;
    S30908=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 579, column: 39
      thread35854(tdone,ends);
      thread35855(tdone,ends);
      int biggest35856 = 0;
      if(ends[72]>=biggest35856){
        biggest35856=ends[72];
      }
      if(ends[73]>=biggest35856){
        biggest35856=ends[73];
      }
      if(biggest35856 == 1){
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
      }
    }
    else {
      S30908=1;
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
  }

  public void thread35852(int [] tdone, int [] ends){
        S30897=1;
    S30841=0;
    S30821=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
      S30821=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
    else {
      S30816=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
        S30816=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
          ends[70]=2;
          ;//sysj\conveyor_controller.sysj line: 569, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
            bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
            currsigs.addElement(bottleAtPos4_63);
            S30841=1;
            active[70]=1;
            ends[70]=1;
            tdone[70]=1;
          }
          else {
            S30841=1;
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
      }
      else {
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
  }

  public void thread35851(int [] tdone, int [] ends){
        S30814=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 504, column: 13
    S29535=0;
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread35848(int [] tdone, int [] ends){
        S30940=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread35847(int [] tdone, int [] ends){
        S30937=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread35846(int [] tdone, int [] ends){
        S30967=1;
    S30943=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 598, column: 27
      thread35847(tdone,ends);
      thread35848(tdone,ends);
      int biggest35849 = 0;
      if(ends[75]>=biggest35849){
        biggest35849=ends[75];
      }
      if(ends[76]>=biggest35849){
        biggest35849=ends[76];
      }
      if(biggest35849 == 1){
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
    else {
      S30943=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread35844(int [] tdone, int [] ends){
        S30905=1;
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread35843(int [] tdone, int [] ends){
        S30902=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 582, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread35842(int [] tdone, int [] ends){
        S30932=1;
    S30908=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 579, column: 39
      thread35843(tdone,ends);
      thread35844(tdone,ends);
      int biggest35845 = 0;
      if(ends[72]>=biggest35845){
        biggest35845=ends[72];
      }
      if(ends[73]>=biggest35845){
        biggest35845=ends[73];
      }
      if(biggest35845 == 1){
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
      }
    }
    else {
      S30908=1;
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
  }

  public void thread35841(int [] tdone, int [] ends){
        S30897=1;
    S30841=0;
    S30821=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
      S30821=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
    else {
      S30816=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
        S30816=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
          ends[70]=2;
          ;//sysj\conveyor_controller.sysj line: 569, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
            bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
            currsigs.addElement(bottleAtPos4_63);
            S30841=1;
            active[70]=1;
            ends[70]=1;
            tdone[70]=1;
          }
          else {
            S30841=1;
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
      }
      else {
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
  }

  public void thread35840(int [] tdone, int [] ends){
        S30814=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 504, column: 13
    S29535=0;
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread35837(int [] tdone, int [] ends){
        S30940=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread35836(int [] tdone, int [] ends){
        S30937=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread35835(int [] tdone, int [] ends){
        S30967=1;
    S30943=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 598, column: 27
      thread35836(tdone,ends);
      thread35837(tdone,ends);
      int biggest35838 = 0;
      if(ends[75]>=biggest35838){
        biggest35838=ends[75];
      }
      if(ends[76]>=biggest35838){
        biggest35838=ends[76];
      }
      if(biggest35838 == 1){
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
    else {
      S30943=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread35833(int [] tdone, int [] ends){
        S30905=1;
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread35832(int [] tdone, int [] ends){
        S30902=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 582, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread35831(int [] tdone, int [] ends){
        S30932=1;
    S30908=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 579, column: 39
      thread35832(tdone,ends);
      thread35833(tdone,ends);
      int biggest35834 = 0;
      if(ends[72]>=biggest35834){
        biggest35834=ends[72];
      }
      if(ends[73]>=biggest35834){
        biggest35834=ends[73];
      }
      if(biggest35834 == 1){
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
      }
    }
    else {
      S30908=1;
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
  }

  public void thread35830(int [] tdone, int [] ends){
        S30897=1;
    S30841=0;
    S30821=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
      S30821=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
    else {
      S30816=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
        S30816=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
          ends[70]=2;
          ;//sysj\conveyor_controller.sysj line: 569, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
            bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
            currsigs.addElement(bottleAtPos4_63);
            S30841=1;
            active[70]=1;
            ends[70]=1;
            tdone[70]=1;
          }
          else {
            S30841=1;
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
      }
      else {
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
  }

  public void thread35829(int [] tdone, int [] ends){
        S30814=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 504, column: 13
    S29535=0;
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S35274){
        case 0 : 
          S35274=0;
          break RUN;
        
        case 1 : 
          S35274=2;
          S35274=2;
          bottleAtPos4_63.setClear();//sysj\conveyor_controller.sysj line: 498, column: 11
          S35273=0;
          S29517=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 499, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 499, column: 11
            S29517=1;
            active[63]=1;
            ends[63]=1;
            break RUN;
          }
          else {
            S29512=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 499, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 499, column: 11
              S29512=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 499, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 499, column: 11
                ends[63]=2;
                ;//sysj\conveyor_controller.sysj line: 499, column: 11
                S35273=1;
                thread35829(tdone,ends);
                thread35830(tdone,ends);
                thread35831(tdone,ends);
                thread35835(tdone,ends);
                int biggest35839 = 0;
                if(ends[64]>=biggest35839){
                  biggest35839=ends[64];
                }
                if(ends[70]>=biggest35839){
                  biggest35839=ends[70];
                }
                if(ends[71]>=biggest35839){
                  biggest35839=ends[71];
                }
                if(ends[74]>=biggest35839){
                  biggest35839=ends[74];
                }
                if(biggest35839 == 1){
                  active[63]=1;
                  ends[63]=1;
                  break RUN;
                }
              }
              else {
                active[63]=1;
                ends[63]=1;
                break RUN;
              }
            }
            else {
              active[63]=1;
              ends[63]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_63.setClear();//sysj\conveyor_controller.sysj line: 498, column: 11
          switch(S35273){
            case 0 : 
              switch(S29517){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 499, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 499, column: 11
                    S29517=1;
                    active[63]=1;
                    ends[63]=1;
                    break RUN;
                  }
                  else {
                    switch(S29512){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 499, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 499, column: 11
                          S29512=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 499, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 499, column: 11
                            ends[63]=2;
                            ;//sysj\conveyor_controller.sysj line: 499, column: 11
                            S35273=1;
                            thread35840(tdone,ends);
                            thread35841(tdone,ends);
                            thread35842(tdone,ends);
                            thread35846(tdone,ends);
                            int biggest35850 = 0;
                            if(ends[64]>=biggest35850){
                              biggest35850=ends[64];
                            }
                            if(ends[70]>=biggest35850){
                              biggest35850=ends[70];
                            }
                            if(ends[71]>=biggest35850){
                              biggest35850=ends[71];
                            }
                            if(ends[74]>=biggest35850){
                              biggest35850=ends[74];
                            }
                            if(biggest35850 == 1){
                              active[63]=1;
                              ends[63]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[63]=1;
                            ends[63]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[63]=1;
                          ends[63]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 499, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 499, column: 11
                          ends[63]=2;
                          ;//sysj\conveyor_controller.sysj line: 499, column: 11
                          S35273=1;
                          thread35851(tdone,ends);
                          thread35852(tdone,ends);
                          thread35853(tdone,ends);
                          thread35857(tdone,ends);
                          int biggest35861 = 0;
                          if(ends[64]>=biggest35861){
                            biggest35861=ends[64];
                          }
                          if(ends[70]>=biggest35861){
                            biggest35861=ends[70];
                          }
                          if(ends[71]>=biggest35861){
                            biggest35861=ends[71];
                          }
                          if(ends[74]>=biggest35861){
                            biggest35861=ends[74];
                          }
                          if(biggest35861 == 1){
                            active[63]=1;
                            ends[63]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[63]=1;
                          ends[63]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S29517=1;
                  S29517=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 499, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 499, column: 11
                    S29517=1;
                    active[63]=1;
                    ends[63]=1;
                    break RUN;
                  }
                  else {
                    S29512=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 499, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 499, column: 11
                      S29512=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 499, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 499, column: 11
                        ends[63]=2;
                        ;//sysj\conveyor_controller.sysj line: 499, column: 11
                        S35273=1;
                        thread35862(tdone,ends);
                        thread35863(tdone,ends);
                        thread35864(tdone,ends);
                        thread35868(tdone,ends);
                        int biggest35872 = 0;
                        if(ends[64]>=biggest35872){
                          biggest35872=ends[64];
                        }
                        if(ends[70]>=biggest35872){
                          biggest35872=ends[70];
                        }
                        if(ends[71]>=biggest35872){
                          biggest35872=ends[71];
                        }
                        if(ends[74]>=biggest35872){
                          biggest35872=ends[74];
                        }
                        if(biggest35872 == 1){
                          active[63]=1;
                          ends[63]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[63]=1;
                        ends[63]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[63]=1;
                      ends[63]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread35873(tdone,ends);
              thread35888(tdone,ends);
              thread35889(tdone,ends);
              thread35896(tdone,ends);
              int biggest35903 = 0;
              if(ends[64]>=biggest35903){
                biggest35903=ends[64];
              }
              if(ends[70]>=biggest35903){
                biggest35903=ends[70];
              }
              if(ends[71]>=biggest35903){
                biggest35903=ends[71];
              }
              if(ends[74]>=biggest35903){
                biggest35903=ends[74];
              }
              if(biggest35903 == 1){
                active[63]=1;
                ends[63]=1;
                break RUN;
              }
              //FINXME code
              if(biggest35903 == 0){
                S35274=0;
                active[63]=0;
                ends[63]=0;
                S35274=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos4_63 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[63] != 0){
      int index = 63;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[63]!=0 || suspended[63]!=0 || active[63]!=1);
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
      bottleAtPos4_63.setpreclear();
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
      bottleAtPos4_63.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[63]!=0 || suspended[63]!=0 || active[63]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[63] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
