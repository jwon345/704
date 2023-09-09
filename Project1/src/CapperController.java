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
  private int S42118 = 1;
  private int S42117 = 1;
  private int S36361 = 1;
  private int S36356 = 1;
  private int S37658 = 1;
  private int S36379 = 1;
  private int S36386 = 1;
  private int S36381 = 1;
  private int S36448 = 1;
  private int S36483 = 1;
  private int S36450 = 1;
  private int S36455 = 1;
  private int S36463 = 1;
  private int S36466 = 1;
  private int S36535 = 1;
  private int S36530 = 1;
  private int S36586 = 1;
  private int S37741 = 1;
  private int S37685 = 1;
  private int S37665 = 1;
  private int S37660 = 1;
  private int S37776 = 1;
  private int S37752 = 1;
  private int S37746 = 1;
  private int S37749 = 1;
  private int S37811 = 1;
  private int S37787 = 1;
  private int S37781 = 1;
  private int S37784 = 1;
  
  private int[] ends = new int[77];
  private int[] tdone = new int[77];
  
  public void thread42752(int [] tdone, int [] ends){
        S37784=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread42751(int [] tdone, int [] ends){
        S37781=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread42749(int [] tdone, int [] ends){
        switch(S37784){
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

  public void thread42748(int [] tdone, int [] ends){
        switch(S37781){
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

  public void thread42747(int [] tdone, int [] ends){
        switch(S37811){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        switch(S37787){
          case 0 : 
            thread42748(tdone,ends);
            thread42749(tdone,ends);
            int biggest42750 = 0;
            if(ends[75]>=biggest42750){
              biggest42750=ends[75];
            }
            if(ends[76]>=biggest42750){
              biggest42750=ends[76];
            }
            if(biggest42750 == 1){
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            if(biggest42750 == 2){
              ends[74]=2;
              ;//sysj\conveyor_controller.sysj line: 599, column: 19
              S37787=1;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            //FINXME code
            if(biggest42750 == 0){
              S37787=1;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 1 : 
            S37787=1;
            S37787=0;
            if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 598, column: 27
              thread42751(tdone,ends);
              thread42752(tdone,ends);
              int biggest42753 = 0;
              if(ends[75]>=biggest42753){
                biggest42753=ends[75];
              }
              if(ends[76]>=biggest42753){
                biggest42753=ends[76];
              }
              if(biggest42753 == 1){
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
            }
            else {
              S37787=1;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread42745(int [] tdone, int [] ends){
        S37749=1;
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread42744(int [] tdone, int [] ends){
        S37746=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 582, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread42742(int [] tdone, int [] ends){
        switch(S37749){
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

  public void thread42741(int [] tdone, int [] ends){
        switch(S37746){
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

  public void thread42740(int [] tdone, int [] ends){
        switch(S37776){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        switch(S37752){
          case 0 : 
            thread42741(tdone,ends);
            thread42742(tdone,ends);
            int biggest42743 = 0;
            if(ends[72]>=biggest42743){
              biggest42743=ends[72];
            }
            if(ends[73]>=biggest42743){
              biggest42743=ends[73];
            }
            if(biggest42743 == 1){
              active[71]=1;
              ends[71]=1;
              tdone[71]=1;
            }
            if(biggest42743 == 2){
              ends[71]=2;
              ;//sysj\conveyor_controller.sysj line: 580, column: 20
              S37752=1;
              active[71]=1;
              ends[71]=1;
              tdone[71]=1;
            }
            //FINXME code
            if(biggest42743 == 0){
              S37752=1;
              active[71]=1;
              ends[71]=1;
              tdone[71]=1;
            }
            break;
          
          case 1 : 
            S37752=1;
            S37752=0;
            if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 579, column: 39
              thread42744(tdone,ends);
              thread42745(tdone,ends);
              int biggest42746 = 0;
              if(ends[72]>=biggest42746){
                biggest42746=ends[72];
              }
              if(ends[73]>=biggest42746){
                biggest42746=ends[73];
              }
              if(biggest42746 == 1){
                active[71]=1;
                ends[71]=1;
                tdone[71]=1;
              }
            }
            else {
              S37752=1;
              active[71]=1;
              ends[71]=1;
              tdone[71]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread42739(int [] tdone, int [] ends){
        switch(S37741){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        switch(S37685){
          case 0 : 
            switch(S37665){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
                  S37665=1;
                  active[70]=1;
                  ends[70]=1;
                  tdone[70]=1;
                }
                else {
                  switch(S37660){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
                        S37660=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
                          ends[70]=2;
                          ;//sysj\conveyor_controller.sysj line: 569, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
                            bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
                            currsigs.addElement(bottleAtPos4_63);
                            S37685=1;
                            active[70]=1;
                            ends[70]=1;
                            tdone[70]=1;
                          }
                          else {
                            S37685=1;
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
                          S37685=1;
                          active[70]=1;
                          ends[70]=1;
                          tdone[70]=1;
                        }
                        else {
                          S37685=1;
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
                S37665=1;
                S37665=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
                  S37665=1;
                  active[70]=1;
                  ends[70]=1;
                  tdone[70]=1;
                }
                else {
                  S37660=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
                    S37660=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
                      ends[70]=2;
                      ;//sysj\conveyor_controller.sysj line: 569, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
                        bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
                        currsigs.addElement(bottleAtPos4_63);
                        S37685=1;
                        active[70]=1;
                        ends[70]=1;
                        tdone[70]=1;
                      }
                      else {
                        S37685=1;
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
            S37685=1;
            S37685=0;
            S37665=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
              S37665=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            else {
              S37660=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
                S37660=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
                  ends[70]=2;
                  ;//sysj\conveyor_controller.sysj line: 569, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
                    bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
                    currsigs.addElement(bottleAtPos4_63);
                    S37685=1;
                    active[70]=1;
                    ends[70]=1;
                    tdone[70]=1;
                  }
                  else {
                    S37685=1;
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

  public void thread42736(int [] tdone, int [] ends){
        switch(S36466){
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

  public void thread42735(int [] tdone, int [] ends){
        switch(S36463){
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

  public void thread42734(int [] tdone, int [] ends){
        switch(S36455){
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

  public void thread42732(int [] tdone, int [] ends){
        S36466=1;
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread42731(int [] tdone, int [] ends){
        S36463=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 537, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 538, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread42730(int [] tdone, int [] ends){
        S36455=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 533, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread42729(int [] tdone, int [] ends){
        switch(S36483){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        switch(S36450){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 530, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 531, column: 15
              S36450=1;
              thread42730(tdone,ends);
              thread42731(tdone,ends);
              thread42732(tdone,ends);
              int biggest42733 = 0;
              if(ends[67]>=biggest42733){
                biggest42733=ends[67];
              }
              if(ends[68]>=biggest42733){
                biggest42733=ends[68];
              }
              if(ends[69]>=biggest42733){
                biggest42733=ends[69];
              }
              if(biggest42733 == 1){
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
            thread42734(tdone,ends);
            thread42735(tdone,ends);
            thread42736(tdone,ends);
            int biggest42737 = 0;
            if(ends[67]>=biggest42737){
              biggest42737=ends[67];
            }
            if(ends[68]>=biggest42737){
              biggest42737=ends[68];
            }
            if(ends[69]>=biggest42737){
              biggest42737=ends[69];
            }
            if(biggest42737 == 1){
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            if(biggest42737 == 2){
              ends[66]=2;
              tdone[66]=1;
            }
            //FINXME code
            if(biggest42737 == 0){
              S36483=0;
              active[66]=0;
              ends[66]=0;
              tdone[66]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread42728(int [] tdone, int [] ends){
        switch(S36448){
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

  public void thread42726(int [] tdone, int [] ends){
        S36483=1;
    S36450=0;
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread42725(int [] tdone, int [] ends){
        S36448=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 526, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread42724(int [] tdone, int [] ends){
        switch(S37658){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        switch(S36379){
          case 0 : 
            if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 505, column: 19
              S36379=1;
              S36386=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 506, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 506, column: 13
                S36386=1;
                active[64]=1;
                ends[64]=1;
                tdone[64]=1;
              }
              else {
                S36381=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 506, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 506, column: 13
                  S36381=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 506, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 506, column: 13
                    ends[64]=2;
                    ;//sysj\conveyor_controller.sysj line: 506, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 507, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 508, column: 13
                    S36379=2;
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
            switch(S36386){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 506, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 506, column: 13
                  S36386=1;
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                else {
                  switch(S36381){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 506, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 506, column: 13
                        S36381=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 506, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 506, column: 13
                          ends[64]=2;
                          ;//sysj\conveyor_controller.sysj line: 506, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 507, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 508, column: 13
                          S36379=2;
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
                        S36379=2;
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
                S36386=1;
                S36386=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 506, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 506, column: 13
                  S36386=1;
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                else {
                  S36381=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 506, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 506, column: 13
                    S36381=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 506, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 506, column: 13
                      ends[64]=2;
                      ;//sysj\conveyor_controller.sysj line: 506, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 507, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 508, column: 13
                      S36379=2;
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
              S36379=3;
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
            S36379=3;
            S36379=4;
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
              S36379=5;
              thread42725(tdone,ends);
              thread42726(tdone,ends);
              int biggest42727 = 0;
              if(ends[65]>=biggest42727){
                biggest42727=ends[65];
              }
              if(ends[66]>=biggest42727){
                biggest42727=ends[66];
              }
              if(biggest42727 == 1){
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
            thread42728(tdone,ends);
            thread42729(tdone,ends);
            int biggest42738 = 0;
            if(ends[65]>=biggest42738){
              biggest42738=ends[65];
            }
            if(ends[66]>=biggest42738){
              biggest42738=ends[66];
            }
            if(biggest42738 == 1){
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            if(biggest42738 == 2){
              ends[64]=2;
              ;//sysj\conveyor_controller.sysj line: 525, column: 13
              S36379=6;
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            //FINXME code
            if(biggest42738 == 0){
              S36379=6;
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 549, column: 19
              S36379=7;
              S36535=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 551, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 551, column: 13
                S36535=1;
                active[64]=1;
                ends[64]=1;
                tdone[64]=1;
              }
              else {
                S36530=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 551, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 551, column: 13
                  S36530=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 551, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 551, column: 13
                    ends[64]=2;
                    ;//sysj\conveyor_controller.sysj line: 551, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 552, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 553, column: 13
                    S36379=8;
                    S36586=0;
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
            switch(S36535){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 551, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 551, column: 13
                  S36535=1;
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                else {
                  switch(S36530){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 551, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 551, column: 13
                        S36530=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 551, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 551, column: 13
                          ends[64]=2;
                          ;//sysj\conveyor_controller.sysj line: 551, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 552, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 553, column: 13
                          S36379=8;
                          S36586=0;
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
                        S36379=8;
                        S36586=0;
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
                S36535=1;
                S36535=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 551, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 551, column: 13
                  S36535=1;
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                else {
                  S36530=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 551, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 551, column: 13
                    S36530=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 551, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 551, column: 13
                      ends[64]=2;
                      ;//sysj\conveyor_controller.sysj line: 551, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 552, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 553, column: 13
                      S36379=8;
                      S36586=0;
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
            switch(S36586){
              case 0 : 
                if(!bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 554, column: 29
                  S36586=1;
                  if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 556, column: 23
                    active[64]=1;
                    ends[64]=1;
                    tdone[64]=1;
                  }
                  else {
                    ends[64]=2;
                    ;//sysj\conveyor_controller.sysj line: 554, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 504, column: 13
                    S36379=0;
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
                  S36379=0;
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

  public void thread42721(int [] tdone, int [] ends){
        S37784=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread42720(int [] tdone, int [] ends){
        S37781=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread42719(int [] tdone, int [] ends){
        S37811=1;
    S37787=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 598, column: 27
      thread42720(tdone,ends);
      thread42721(tdone,ends);
      int biggest42722 = 0;
      if(ends[75]>=biggest42722){
        biggest42722=ends[75];
      }
      if(ends[76]>=biggest42722){
        biggest42722=ends[76];
      }
      if(biggest42722 == 1){
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
    else {
      S37787=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread42717(int [] tdone, int [] ends){
        S37749=1;
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread42716(int [] tdone, int [] ends){
        S37746=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 582, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread42715(int [] tdone, int [] ends){
        S37776=1;
    S37752=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 579, column: 39
      thread42716(tdone,ends);
      thread42717(tdone,ends);
      int biggest42718 = 0;
      if(ends[72]>=biggest42718){
        biggest42718=ends[72];
      }
      if(ends[73]>=biggest42718){
        biggest42718=ends[73];
      }
      if(biggest42718 == 1){
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
      }
    }
    else {
      S37752=1;
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
  }

  public void thread42714(int [] tdone, int [] ends){
        S37741=1;
    S37685=0;
    S37665=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
      S37665=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
    else {
      S37660=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
        S37660=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
          ends[70]=2;
          ;//sysj\conveyor_controller.sysj line: 569, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
            bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
            currsigs.addElement(bottleAtPos4_63);
            S37685=1;
            active[70]=1;
            ends[70]=1;
            tdone[70]=1;
          }
          else {
            S37685=1;
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

  public void thread42713(int [] tdone, int [] ends){
        S37658=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 504, column: 13
    S36379=0;
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread42710(int [] tdone, int [] ends){
        S37784=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread42709(int [] tdone, int [] ends){
        S37781=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread42708(int [] tdone, int [] ends){
        S37811=1;
    S37787=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 598, column: 27
      thread42709(tdone,ends);
      thread42710(tdone,ends);
      int biggest42711 = 0;
      if(ends[75]>=biggest42711){
        biggest42711=ends[75];
      }
      if(ends[76]>=biggest42711){
        biggest42711=ends[76];
      }
      if(biggest42711 == 1){
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
    else {
      S37787=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread42706(int [] tdone, int [] ends){
        S37749=1;
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread42705(int [] tdone, int [] ends){
        S37746=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 582, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread42704(int [] tdone, int [] ends){
        S37776=1;
    S37752=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 579, column: 39
      thread42705(tdone,ends);
      thread42706(tdone,ends);
      int biggest42707 = 0;
      if(ends[72]>=biggest42707){
        biggest42707=ends[72];
      }
      if(ends[73]>=biggest42707){
        biggest42707=ends[73];
      }
      if(biggest42707 == 1){
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
      }
    }
    else {
      S37752=1;
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
  }

  public void thread42703(int [] tdone, int [] ends){
        S37741=1;
    S37685=0;
    S37665=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
      S37665=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
    else {
      S37660=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
        S37660=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
          ends[70]=2;
          ;//sysj\conveyor_controller.sysj line: 569, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
            bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
            currsigs.addElement(bottleAtPos4_63);
            S37685=1;
            active[70]=1;
            ends[70]=1;
            tdone[70]=1;
          }
          else {
            S37685=1;
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

  public void thread42702(int [] tdone, int [] ends){
        S37658=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 504, column: 13
    S36379=0;
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread42699(int [] tdone, int [] ends){
        S37784=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread42698(int [] tdone, int [] ends){
        S37781=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread42697(int [] tdone, int [] ends){
        S37811=1;
    S37787=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 598, column: 27
      thread42698(tdone,ends);
      thread42699(tdone,ends);
      int biggest42700 = 0;
      if(ends[75]>=biggest42700){
        biggest42700=ends[75];
      }
      if(ends[76]>=biggest42700){
        biggest42700=ends[76];
      }
      if(biggest42700 == 1){
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
    else {
      S37787=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread42695(int [] tdone, int [] ends){
        S37749=1;
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread42694(int [] tdone, int [] ends){
        S37746=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 582, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread42693(int [] tdone, int [] ends){
        S37776=1;
    S37752=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 579, column: 39
      thread42694(tdone,ends);
      thread42695(tdone,ends);
      int biggest42696 = 0;
      if(ends[72]>=biggest42696){
        biggest42696=ends[72];
      }
      if(ends[73]>=biggest42696){
        biggest42696=ends[73];
      }
      if(biggest42696 == 1){
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
      }
    }
    else {
      S37752=1;
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
  }

  public void thread42692(int [] tdone, int [] ends){
        S37741=1;
    S37685=0;
    S37665=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
      S37665=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
    else {
      S37660=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
        S37660=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
          ends[70]=2;
          ;//sysj\conveyor_controller.sysj line: 569, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
            bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
            currsigs.addElement(bottleAtPos4_63);
            S37685=1;
            active[70]=1;
            ends[70]=1;
            tdone[70]=1;
          }
          else {
            S37685=1;
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

  public void thread42691(int [] tdone, int [] ends){
        S37658=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 504, column: 13
    S36379=0;
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread42688(int [] tdone, int [] ends){
        S37784=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread42687(int [] tdone, int [] ends){
        S37781=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread42686(int [] tdone, int [] ends){
        S37811=1;
    S37787=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 598, column: 27
      thread42687(tdone,ends);
      thread42688(tdone,ends);
      int biggest42689 = 0;
      if(ends[75]>=biggest42689){
        biggest42689=ends[75];
      }
      if(ends[76]>=biggest42689){
        biggest42689=ends[76];
      }
      if(biggest42689 == 1){
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
    else {
      S37787=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread42684(int [] tdone, int [] ends){
        S37749=1;
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread42683(int [] tdone, int [] ends){
        S37746=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 582, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread42682(int [] tdone, int [] ends){
        S37776=1;
    S37752=0;
    if(bottleAtPos4_63.getprestatus()){//sysj\conveyor_controller.sysj line: 579, column: 39
      thread42683(tdone,ends);
      thread42684(tdone,ends);
      int biggest42685 = 0;
      if(ends[72]>=biggest42685){
        biggest42685=ends[72];
      }
      if(ends[73]>=biggest42685){
        biggest42685=ends[73];
      }
      if(biggest42685 == 1){
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
      }
    }
    else {
      S37752=1;
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
  }

  public void thread42681(int [] tdone, int [] ends){
        S37741=1;
    S37685=0;
    S37665=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 569, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
      S37665=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
    else {
      S37660=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 569, column: 13
        S37660=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 569, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 569, column: 13
          ends[70]=2;
          ;//sysj\conveyor_controller.sysj line: 569, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 570, column: 16
            bottleAtPos4_63.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 14
            currsigs.addElement(bottleAtPos4_63);
            S37685=1;
            active[70]=1;
            ends[70]=1;
            tdone[70]=1;
          }
          else {
            S37685=1;
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

  public void thread42680(int [] tdone, int [] ends){
        S37658=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 504, column: 13
    S36379=0;
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
      switch(S42118){
        case 0 : 
          S42118=0;
          break RUN;
        
        case 1 : 
          S42118=2;
          S42118=2;
          bottleAtPos4_63.setClear();//sysj\conveyor_controller.sysj line: 498, column: 11
          S42117=0;
          S36361=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 499, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 499, column: 11
            S36361=1;
            active[63]=1;
            ends[63]=1;
            break RUN;
          }
          else {
            S36356=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 499, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 499, column: 11
              S36356=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 499, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 499, column: 11
                ends[63]=2;
                ;//sysj\conveyor_controller.sysj line: 499, column: 11
                S42117=1;
                thread42680(tdone,ends);
                thread42681(tdone,ends);
                thread42682(tdone,ends);
                thread42686(tdone,ends);
                int biggest42690 = 0;
                if(ends[64]>=biggest42690){
                  biggest42690=ends[64];
                }
                if(ends[70]>=biggest42690){
                  biggest42690=ends[70];
                }
                if(ends[71]>=biggest42690){
                  biggest42690=ends[71];
                }
                if(ends[74]>=biggest42690){
                  biggest42690=ends[74];
                }
                if(biggest42690 == 1){
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
          switch(S42117){
            case 0 : 
              switch(S36361){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 499, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 499, column: 11
                    S36361=1;
                    active[63]=1;
                    ends[63]=1;
                    break RUN;
                  }
                  else {
                    switch(S36356){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 499, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 499, column: 11
                          S36356=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 499, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 499, column: 11
                            ends[63]=2;
                            ;//sysj\conveyor_controller.sysj line: 499, column: 11
                            S42117=1;
                            thread42691(tdone,ends);
                            thread42692(tdone,ends);
                            thread42693(tdone,ends);
                            thread42697(tdone,ends);
                            int biggest42701 = 0;
                            if(ends[64]>=biggest42701){
                              biggest42701=ends[64];
                            }
                            if(ends[70]>=biggest42701){
                              biggest42701=ends[70];
                            }
                            if(ends[71]>=biggest42701){
                              biggest42701=ends[71];
                            }
                            if(ends[74]>=biggest42701){
                              biggest42701=ends[74];
                            }
                            if(biggest42701 == 1){
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
                          S42117=1;
                          thread42702(tdone,ends);
                          thread42703(tdone,ends);
                          thread42704(tdone,ends);
                          thread42708(tdone,ends);
                          int biggest42712 = 0;
                          if(ends[64]>=biggest42712){
                            biggest42712=ends[64];
                          }
                          if(ends[70]>=biggest42712){
                            biggest42712=ends[70];
                          }
                          if(ends[71]>=biggest42712){
                            biggest42712=ends[71];
                          }
                          if(ends[74]>=biggest42712){
                            biggest42712=ends[74];
                          }
                          if(biggest42712 == 1){
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
                  S36361=1;
                  S36361=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 499, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 499, column: 11
                    S36361=1;
                    active[63]=1;
                    ends[63]=1;
                    break RUN;
                  }
                  else {
                    S36356=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 499, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 499, column: 11
                      S36356=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 499, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 499, column: 11
                        ends[63]=2;
                        ;//sysj\conveyor_controller.sysj line: 499, column: 11
                        S42117=1;
                        thread42713(tdone,ends);
                        thread42714(tdone,ends);
                        thread42715(tdone,ends);
                        thread42719(tdone,ends);
                        int biggest42723 = 0;
                        if(ends[64]>=biggest42723){
                          biggest42723=ends[64];
                        }
                        if(ends[70]>=biggest42723){
                          biggest42723=ends[70];
                        }
                        if(ends[71]>=biggest42723){
                          biggest42723=ends[71];
                        }
                        if(ends[74]>=biggest42723){
                          biggest42723=ends[74];
                        }
                        if(biggest42723 == 1){
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
              thread42724(tdone,ends);
              thread42739(tdone,ends);
              thread42740(tdone,ends);
              thread42747(tdone,ends);
              int biggest42754 = 0;
              if(ends[64]>=biggest42754){
                biggest42754=ends[64];
              }
              if(ends[70]>=biggest42754){
                biggest42754=ends[70];
              }
              if(ends[71]>=biggest42754){
                biggest42754=ends[71];
              }
              if(ends[74]>=biggest42754){
                biggest42754=ends[74];
              }
              if(biggest42754 == 1){
                active[63]=1;
                ends[63]=1;
                break RUN;
              }
              //FINXME code
              if(biggest42754 == 0){
                S42118=0;
                active[63]=0;
                ends[63]=0;
                S42118=0;
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
