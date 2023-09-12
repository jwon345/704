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
  private Signal bottleAtPos4_61;
  private int S42678 = 1;
  private int S42677 = 1;
  private int S36921 = 1;
  private int S36916 = 1;
  private int S38218 = 1;
  private int S36939 = 1;
  private int S36946 = 1;
  private int S36941 = 1;
  private int S37008 = 1;
  private int S37043 = 1;
  private int S37010 = 1;
  private int S37015 = 1;
  private int S37023 = 1;
  private int S37026 = 1;
  private int S37095 = 1;
  private int S37090 = 1;
  private int S37146 = 1;
  private int S38301 = 1;
  private int S38245 = 1;
  private int S38225 = 1;
  private int S38220 = 1;
  private int S38336 = 1;
  private int S38312 = 1;
  private int S38306 = 1;
  private int S38309 = 1;
  private int S38371 = 1;
  private int S38347 = 1;
  private int S38341 = 1;
  private int S38344 = 1;
  
  private int[] ends = new int[88];
  private int[] tdone = new int[88];
  
  public void thread101482(int [] tdone, int [] ends){
        S38344=1;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread101481(int [] tdone, int [] ends){
        S38341=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 586, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread101479(int [] tdone, int [] ends){
        switch(S38344){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 590, column: 36
          ends[74]=2;
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

  public void thread101478(int [] tdone, int [] ends){
        switch(S38341){
      case 0 : 
        active[73]=0;
        ends[73]=0;
        tdone[73]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 586, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[73]=1;
        ends[73]=1;
        tdone[73]=1;
        break;
      
    }
  }

  public void thread101477(int [] tdone, int [] ends){
        switch(S38371){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        switch(S38347){
          case 0 : 
            thread101478(tdone,ends);
            thread101479(tdone,ends);
            int biggest101480 = 0;
            if(ends[73]>=biggest101480){
              biggest101480=ends[73];
            }
            if(ends[74]>=biggest101480){
              biggest101480=ends[74];
            }
            if(biggest101480 == 1){
              active[72]=1;
              ends[72]=1;
              tdone[72]=1;
            }
            if(biggest101480 == 2){
              ends[72]=2;
              ;//sysj\conveyor_controller.sysj line: 584, column: 19
              S38347=1;
              active[72]=1;
              ends[72]=1;
              tdone[72]=1;
            }
            //FINXME code
            if(biggest101480 == 0){
              S38347=1;
              active[72]=1;
              ends[72]=1;
              tdone[72]=1;
            }
            break;
          
          case 1 : 
            S38347=1;
            S38347=0;
            if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 583, column: 27
              thread101481(tdone,ends);
              thread101482(tdone,ends);
              int biggest101483 = 0;
              if(ends[73]>=biggest101483){
                biggest101483=ends[73];
              }
              if(ends[74]>=biggest101483){
                biggest101483=ends[74];
              }
              if(biggest101483 == 1){
                active[72]=1;
                ends[72]=1;
                tdone[72]=1;
              }
            }
            else {
              S38347=1;
              active[72]=1;
              ends[72]=1;
              tdone[72]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread101475(int [] tdone, int [] ends){
        S38309=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread101474(int [] tdone, int [] ends){
        S38306=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 567, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread101472(int [] tdone, int [] ends){
        switch(S38309){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 571, column: 37
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

  public void thread101471(int [] tdone, int [] ends){
        switch(S38306){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 567, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
        break;
      
    }
  }

  public void thread101470(int [] tdone, int [] ends){
        switch(S38336){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        switch(S38312){
          case 0 : 
            thread101471(tdone,ends);
            thread101472(tdone,ends);
            int biggest101473 = 0;
            if(ends[70]>=biggest101473){
              biggest101473=ends[70];
            }
            if(ends[71]>=biggest101473){
              biggest101473=ends[71];
            }
            if(biggest101473 == 1){
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            if(biggest101473 == 2){
              ends[69]=2;
              ;//sysj\conveyor_controller.sysj line: 565, column: 20
              S38312=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            //FINXME code
            if(biggest101473 == 0){
              S38312=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            break;
          
          case 1 : 
            S38312=1;
            S38312=0;
            if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 564, column: 39
              thread101474(tdone,ends);
              thread101475(tdone,ends);
              int biggest101476 = 0;
              if(ends[70]>=biggest101476){
                biggest101476=ends[70];
              }
              if(ends[71]>=biggest101476){
                biggest101476=ends[71];
              }
              if(biggest101476 == 1){
                active[69]=1;
                ends[69]=1;
                tdone[69]=1;
              }
            }
            else {
              S38312=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread101469(int [] tdone, int [] ends){
        switch(S38301){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        switch(S38245){
          case 0 : 
            switch(S38225){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 554, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
                  S38225=1;
                  active[68]=1;
                  ends[68]=1;
                  tdone[68]=1;
                }
                else {
                  switch(S38220){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 554, column: 13
                        S38220=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
                          ends[68]=2;
                          ;//sysj\conveyor_controller.sysj line: 554, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 555, column: 16
                            bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 14
                            currsigs.addElement(bottleAtPos4_61);
                            S38245=1;
                            active[68]=1;
                            ends[68]=1;
                            tdone[68]=1;
                          }
                          else {
                            S38245=1;
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
                      else {
                        active[68]=1;
                        ends[68]=1;
                        tdone[68]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
                        ends[68]=2;
                        ;//sysj\conveyor_controller.sysj line: 554, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 555, column: 16
                          bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 14
                          currsigs.addElement(bottleAtPos4_61);
                          S38245=1;
                          active[68]=1;
                          ends[68]=1;
                          tdone[68]=1;
                        }
                        else {
                          S38245=1;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S38225=1;
                S38225=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 554, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
                  S38225=1;
                  active[68]=1;
                  ends[68]=1;
                  tdone[68]=1;
                }
                else {
                  S38220=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 554, column: 13
                    S38220=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
                      ends[68]=2;
                      ;//sysj\conveyor_controller.sysj line: 554, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 555, column: 16
                        bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 14
                        currsigs.addElement(bottleAtPos4_61);
                        S38245=1;
                        active[68]=1;
                        ends[68]=1;
                        tdone[68]=1;
                      }
                      else {
                        S38245=1;
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
                  else {
                    active[68]=1;
                    ends[68]=1;
                    tdone[68]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S38245=1;
            S38245=0;
            S38225=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 554, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
              S38225=1;
              active[68]=1;
              ends[68]=1;
              tdone[68]=1;
            }
            else {
              S38220=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 554, column: 13
                S38220=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
                  ends[68]=2;
                  ;//sysj\conveyor_controller.sysj line: 554, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 555, column: 16
                    bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 14
                    currsigs.addElement(bottleAtPos4_61);
                    S38245=1;
                    active[68]=1;
                    ends[68]=1;
                    tdone[68]=1;
                  }
                  else {
                    S38245=1;
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
              else {
                active[68]=1;
                ends[68]=1;
                tdone[68]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread101466(int [] tdone, int [] ends){
        switch(S37026){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 527, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 528, column: 16
          ends[67]=2;
          tdone[67]=1;
        }
        else {
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
        break;
      
    }
  }

  public void thread101465(int [] tdone, int [] ends){
        switch(S37023){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 523, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread101464(int [] tdone, int [] ends){
        switch(S37015){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
        break;
      
    }
  }

  public void thread101462(int [] tdone, int [] ends){
        S37026=1;
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread101461(int [] tdone, int [] ends){
        S37023=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 522, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 523, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread101460(int [] tdone, int [] ends){
        S37015=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread101459(int [] tdone, int [] ends){
        switch(S37043){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        switch(S37010){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 515, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 516, column: 15
              S37010=1;
              thread101460(tdone,ends);
              thread101461(tdone,ends);
              thread101462(tdone,ends);
              int biggest101463 = 0;
              if(ends[65]>=biggest101463){
                biggest101463=ends[65];
              }
              if(ends[66]>=biggest101463){
                biggest101463=ends[66];
              }
              if(ends[67]>=biggest101463){
                biggest101463=ends[67];
              }
              if(biggest101463 == 1){
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
            thread101464(tdone,ends);
            thread101465(tdone,ends);
            thread101466(tdone,ends);
            int biggest101467 = 0;
            if(ends[65]>=biggest101467){
              biggest101467=ends[65];
            }
            if(ends[66]>=biggest101467){
              biggest101467=ends[66];
            }
            if(ends[67]>=biggest101467){
              biggest101467=ends[67];
            }
            if(biggest101467 == 1){
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            if(biggest101467 == 2){
              ends[64]=2;
              tdone[64]=1;
            }
            //FINXME code
            if(biggest101467 == 0){
              S37043=0;
              active[64]=0;
              ends[64]=0;
              tdone[64]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread101458(int [] tdone, int [] ends){
        switch(S37008){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
        break;
      
    }
  }

  public void thread101456(int [] tdone, int [] ends){
        S37043=1;
    S37010=0;
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread101455(int [] tdone, int [] ends){
        S37008=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread101454(int [] tdone, int [] ends){
        switch(S38218){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        switch(S36939){
          case 0 : 
            if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 490, column: 19
              S36939=1;
              S36946=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 491, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 491, column: 13
                S36946=1;
                active[62]=1;
                ends[62]=1;
                tdone[62]=1;
              }
              else {
                S36941=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 491, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 491, column: 13
                  S36941=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 491, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 491, column: 13
                    ends[62]=2;
                    ;//sysj\conveyor_controller.sysj line: 491, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 492, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 493, column: 13
                    S36939=2;
                    active[62]=1;
                    ends[62]=1;
                    tdone[62]=1;
                  }
                  else {
                    active[62]=1;
                    ends[62]=1;
                    tdone[62]=1;
                  }
                }
                else {
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
              }
            }
            else {
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            break;
          
          case 1 : 
            switch(S36946){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 491, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 491, column: 13
                  S36946=1;
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                else {
                  switch(S36941){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 491, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 491, column: 13
                        S36941=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 491, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 491, column: 13
                          ends[62]=2;
                          ;//sysj\conveyor_controller.sysj line: 491, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 492, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 493, column: 13
                          S36939=2;
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                        else {
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                      }
                      else {
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 491, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 491, column: 13
                        ends[62]=2;
                        ;//sysj\conveyor_controller.sysj line: 491, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 492, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 493, column: 13
                        S36939=2;
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                      else {
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S36946=1;
                S36946=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 491, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 491, column: 13
                  S36946=1;
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                else {
                  S36941=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 491, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 491, column: 13
                    S36941=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 491, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 491, column: 13
                      ends[62]=2;
                      ;//sysj\conveyor_controller.sysj line: 491, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 492, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 493, column: 13
                      S36939=2;
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    else {
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                  }
                  else {
                    active[62]=1;
                    ends[62]=1;
                    tdone[62]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 494, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 498, column: 13
              S36939=3;
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            else {
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            break;
          
          case 3 : 
            S36939=3;
            S36939=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 504, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 505, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[62]=1;
            ends[62]=1;
            tdone[62]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 502, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 507, column: 13
              S36939=5;
              thread101455(tdone,ends);
              thread101456(tdone,ends);
              int biggest101457 = 0;
              if(ends[63]>=biggest101457){
                biggest101457=ends[63];
              }
              if(ends[64]>=biggest101457){
                biggest101457=ends[64];
              }
              if(biggest101457 == 1){
                active[62]=1;
                ends[62]=1;
                tdone[62]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 505, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            break;
          
          case 5 : 
            thread101458(tdone,ends);
            thread101459(tdone,ends);
            int biggest101468 = 0;
            if(ends[63]>=biggest101468){
              biggest101468=ends[63];
            }
            if(ends[64]>=biggest101468){
              biggest101468=ends[64];
            }
            if(biggest101468 == 1){
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            if(biggest101468 == 2){
              ends[62]=2;
              ;//sysj\conveyor_controller.sysj line: 510, column: 13
              S36939=6;
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            //FINXME code
            if(biggest101468 == 0){
              S36939=6;
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 534, column: 19
              S36939=7;
              S37095=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 536, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 536, column: 13
                S37095=1;
                active[62]=1;
                ends[62]=1;
                tdone[62]=1;
              }
              else {
                S37090=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 536, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 536, column: 13
                  S37090=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 536, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 536, column: 13
                    ends[62]=2;
                    ;//sysj\conveyor_controller.sysj line: 536, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 537, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 538, column: 13
                    S36939=8;
                    S37146=0;
                    active[62]=1;
                    ends[62]=1;
                    tdone[62]=1;
                  }
                  else {
                    active[62]=1;
                    ends[62]=1;
                    tdone[62]=1;
                  }
                }
                else {
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
              }
            }
            else {
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            break;
          
          case 7 : 
            switch(S37095){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 536, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 536, column: 13
                  S37095=1;
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                else {
                  switch(S37090){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 536, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 536, column: 13
                        S37090=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 536, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 536, column: 13
                          ends[62]=2;
                          ;//sysj\conveyor_controller.sysj line: 536, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 537, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 538, column: 13
                          S36939=8;
                          S37146=0;
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                        else {
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                      }
                      else {
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 536, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 536, column: 13
                        ends[62]=2;
                        ;//sysj\conveyor_controller.sysj line: 536, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 537, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 538, column: 13
                        S36939=8;
                        S37146=0;
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                      else {
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S37095=1;
                S37095=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 536, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 536, column: 13
                  S37095=1;
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                else {
                  S37090=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 536, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 536, column: 13
                    S37090=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 536, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 536, column: 13
                      ends[62]=2;
                      ;//sysj\conveyor_controller.sysj line: 536, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 537, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 538, column: 13
                      S36939=8;
                      S37146=0;
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    else {
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                  }
                  else {
                    active[62]=1;
                    ends[62]=1;
                    tdone[62]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S37146){
              case 0 : 
                if(!bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 539, column: 29
                  S37146=1;
                  if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 541, column: 23
                    active[62]=1;
                    ends[62]=1;
                    tdone[62]=1;
                  }
                  else {
                    ends[62]=2;
                    ;//sysj\conveyor_controller.sysj line: 539, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 489, column: 13
                    S36939=0;
                    active[62]=1;
                    ends[62]=1;
                    tdone[62]=1;
                  }
                }
                else {
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 541, column: 23
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                else {
                  ends[62]=2;
                  ;//sysj\conveyor_controller.sysj line: 539, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 489, column: 13
                  S36939=0;
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread101451(int [] tdone, int [] ends){
        S38344=1;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread101450(int [] tdone, int [] ends){
        S38341=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 586, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread101449(int [] tdone, int [] ends){
        S38371=1;
    S38347=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 583, column: 27
      thread101450(tdone,ends);
      thread101451(tdone,ends);
      int biggest101452 = 0;
      if(ends[73]>=biggest101452){
        biggest101452=ends[73];
      }
      if(ends[74]>=biggest101452){
        biggest101452=ends[74];
      }
      if(biggest101452 == 1){
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
      }
    }
    else {
      S38347=1;
      active[72]=1;
      ends[72]=1;
      tdone[72]=1;
    }
  }

  public void thread101447(int [] tdone, int [] ends){
        S38309=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread101446(int [] tdone, int [] ends){
        S38306=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 567, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread101445(int [] tdone, int [] ends){
        S38336=1;
    S38312=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 564, column: 39
      thread101446(tdone,ends);
      thread101447(tdone,ends);
      int biggest101448 = 0;
      if(ends[70]>=biggest101448){
        biggest101448=ends[70];
      }
      if(ends[71]>=biggest101448){
        biggest101448=ends[71];
      }
      if(biggest101448 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S38312=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread101444(int [] tdone, int [] ends){
        S38301=1;
    S38245=0;
    S38225=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 554, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
      S38225=1;
      active[68]=1;
      ends[68]=1;
      tdone[68]=1;
    }
    else {
      S38220=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 554, column: 13
        S38220=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
          ends[68]=2;
          ;//sysj\conveyor_controller.sysj line: 554, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 555, column: 16
            bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 14
            currsigs.addElement(bottleAtPos4_61);
            S38245=1;
            active[68]=1;
            ends[68]=1;
            tdone[68]=1;
          }
          else {
            S38245=1;
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
      else {
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
      }
    }
  }

  public void thread101443(int [] tdone, int [] ends){
        S38218=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 489, column: 13
    S36939=0;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread101440(int [] tdone, int [] ends){
        S38344=1;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread101439(int [] tdone, int [] ends){
        S38341=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 586, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread101438(int [] tdone, int [] ends){
        S38371=1;
    S38347=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 583, column: 27
      thread101439(tdone,ends);
      thread101440(tdone,ends);
      int biggest101441 = 0;
      if(ends[73]>=biggest101441){
        biggest101441=ends[73];
      }
      if(ends[74]>=biggest101441){
        biggest101441=ends[74];
      }
      if(biggest101441 == 1){
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
      }
    }
    else {
      S38347=1;
      active[72]=1;
      ends[72]=1;
      tdone[72]=1;
    }
  }

  public void thread101436(int [] tdone, int [] ends){
        S38309=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread101435(int [] tdone, int [] ends){
        S38306=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 567, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread101434(int [] tdone, int [] ends){
        S38336=1;
    S38312=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 564, column: 39
      thread101435(tdone,ends);
      thread101436(tdone,ends);
      int biggest101437 = 0;
      if(ends[70]>=biggest101437){
        biggest101437=ends[70];
      }
      if(ends[71]>=biggest101437){
        biggest101437=ends[71];
      }
      if(biggest101437 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S38312=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread101433(int [] tdone, int [] ends){
        S38301=1;
    S38245=0;
    S38225=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 554, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
      S38225=1;
      active[68]=1;
      ends[68]=1;
      tdone[68]=1;
    }
    else {
      S38220=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 554, column: 13
        S38220=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
          ends[68]=2;
          ;//sysj\conveyor_controller.sysj line: 554, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 555, column: 16
            bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 14
            currsigs.addElement(bottleAtPos4_61);
            S38245=1;
            active[68]=1;
            ends[68]=1;
            tdone[68]=1;
          }
          else {
            S38245=1;
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
      else {
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
      }
    }
  }

  public void thread101432(int [] tdone, int [] ends){
        S38218=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 489, column: 13
    S36939=0;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread101429(int [] tdone, int [] ends){
        S38344=1;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread101428(int [] tdone, int [] ends){
        S38341=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 586, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread101427(int [] tdone, int [] ends){
        S38371=1;
    S38347=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 583, column: 27
      thread101428(tdone,ends);
      thread101429(tdone,ends);
      int biggest101430 = 0;
      if(ends[73]>=biggest101430){
        biggest101430=ends[73];
      }
      if(ends[74]>=biggest101430){
        biggest101430=ends[74];
      }
      if(biggest101430 == 1){
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
      }
    }
    else {
      S38347=1;
      active[72]=1;
      ends[72]=1;
      tdone[72]=1;
    }
  }

  public void thread101425(int [] tdone, int [] ends){
        S38309=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread101424(int [] tdone, int [] ends){
        S38306=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 567, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread101423(int [] tdone, int [] ends){
        S38336=1;
    S38312=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 564, column: 39
      thread101424(tdone,ends);
      thread101425(tdone,ends);
      int biggest101426 = 0;
      if(ends[70]>=biggest101426){
        biggest101426=ends[70];
      }
      if(ends[71]>=biggest101426){
        biggest101426=ends[71];
      }
      if(biggest101426 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S38312=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread101422(int [] tdone, int [] ends){
        S38301=1;
    S38245=0;
    S38225=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 554, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
      S38225=1;
      active[68]=1;
      ends[68]=1;
      tdone[68]=1;
    }
    else {
      S38220=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 554, column: 13
        S38220=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
          ends[68]=2;
          ;//sysj\conveyor_controller.sysj line: 554, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 555, column: 16
            bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 14
            currsigs.addElement(bottleAtPos4_61);
            S38245=1;
            active[68]=1;
            ends[68]=1;
            tdone[68]=1;
          }
          else {
            S38245=1;
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
      else {
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
      }
    }
  }

  public void thread101421(int [] tdone, int [] ends){
        S38218=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 489, column: 13
    S36939=0;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread101418(int [] tdone, int [] ends){
        S38344=1;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread101417(int [] tdone, int [] ends){
        S38341=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 586, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread101416(int [] tdone, int [] ends){
        S38371=1;
    S38347=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 583, column: 27
      thread101417(tdone,ends);
      thread101418(tdone,ends);
      int biggest101419 = 0;
      if(ends[73]>=biggest101419){
        biggest101419=ends[73];
      }
      if(ends[74]>=biggest101419){
        biggest101419=ends[74];
      }
      if(biggest101419 == 1){
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
      }
    }
    else {
      S38347=1;
      active[72]=1;
      ends[72]=1;
      tdone[72]=1;
    }
  }

  public void thread101414(int [] tdone, int [] ends){
        S38309=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread101413(int [] tdone, int [] ends){
        S38306=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 567, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread101412(int [] tdone, int [] ends){
        S38336=1;
    S38312=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 564, column: 39
      thread101413(tdone,ends);
      thread101414(tdone,ends);
      int biggest101415 = 0;
      if(ends[70]>=biggest101415){
        biggest101415=ends[70];
      }
      if(ends[71]>=biggest101415){
        biggest101415=ends[71];
      }
      if(biggest101415 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S38312=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread101411(int [] tdone, int [] ends){
        S38301=1;
    S38245=0;
    S38225=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 554, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
      S38225=1;
      active[68]=1;
      ends[68]=1;
      tdone[68]=1;
    }
    else {
      S38220=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 554, column: 13
        S38220=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 554, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 554, column: 13
          ends[68]=2;
          ;//sysj\conveyor_controller.sysj line: 554, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 555, column: 16
            bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 14
            currsigs.addElement(bottleAtPos4_61);
            S38245=1;
            active[68]=1;
            ends[68]=1;
            tdone[68]=1;
          }
          else {
            S38245=1;
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
      else {
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
      }
    }
  }

  public void thread101410(int [] tdone, int [] ends){
        S38218=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 489, column: 13
    S36939=0;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S42678){
        case 0 : 
          S42678=0;
          break RUN;
        
        case 1 : 
          S42678=2;
          S42678=2;
          bottleAtPos4_61.setClear();//sysj\conveyor_controller.sysj line: 483, column: 11
          S42677=0;
          S36921=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 484, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 484, column: 11
            S36921=1;
            active[61]=1;
            ends[61]=1;
            break RUN;
          }
          else {
            S36916=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 484, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 484, column: 11
              S36916=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 484, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 484, column: 11
                ends[61]=2;
                ;//sysj\conveyor_controller.sysj line: 484, column: 11
                S42677=1;
                thread101410(tdone,ends);
                thread101411(tdone,ends);
                thread101412(tdone,ends);
                thread101416(tdone,ends);
                int biggest101420 = 0;
                if(ends[62]>=biggest101420){
                  biggest101420=ends[62];
                }
                if(ends[68]>=biggest101420){
                  biggest101420=ends[68];
                }
                if(ends[69]>=biggest101420){
                  biggest101420=ends[69];
                }
                if(ends[72]>=biggest101420){
                  biggest101420=ends[72];
                }
                if(biggest101420 == 1){
                  active[61]=1;
                  ends[61]=1;
                  break RUN;
                }
              }
              else {
                active[61]=1;
                ends[61]=1;
                break RUN;
              }
            }
            else {
              active[61]=1;
              ends[61]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_61.setClear();//sysj\conveyor_controller.sysj line: 483, column: 11
          switch(S42677){
            case 0 : 
              switch(S36921){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 484, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 484, column: 11
                    S36921=1;
                    active[61]=1;
                    ends[61]=1;
                    break RUN;
                  }
                  else {
                    switch(S36916){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 484, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 484, column: 11
                          S36916=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 484, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 484, column: 11
                            ends[61]=2;
                            ;//sysj\conveyor_controller.sysj line: 484, column: 11
                            S42677=1;
                            thread101421(tdone,ends);
                            thread101422(tdone,ends);
                            thread101423(tdone,ends);
                            thread101427(tdone,ends);
                            int biggest101431 = 0;
                            if(ends[62]>=biggest101431){
                              biggest101431=ends[62];
                            }
                            if(ends[68]>=biggest101431){
                              biggest101431=ends[68];
                            }
                            if(ends[69]>=biggest101431){
                              biggest101431=ends[69];
                            }
                            if(ends[72]>=biggest101431){
                              biggest101431=ends[72];
                            }
                            if(biggest101431 == 1){
                              active[61]=1;
                              ends[61]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[61]=1;
                            ends[61]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[61]=1;
                          ends[61]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 484, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 484, column: 11
                          ends[61]=2;
                          ;//sysj\conveyor_controller.sysj line: 484, column: 11
                          S42677=1;
                          thread101432(tdone,ends);
                          thread101433(tdone,ends);
                          thread101434(tdone,ends);
                          thread101438(tdone,ends);
                          int biggest101442 = 0;
                          if(ends[62]>=biggest101442){
                            biggest101442=ends[62];
                          }
                          if(ends[68]>=biggest101442){
                            biggest101442=ends[68];
                          }
                          if(ends[69]>=biggest101442){
                            biggest101442=ends[69];
                          }
                          if(ends[72]>=biggest101442){
                            biggest101442=ends[72];
                          }
                          if(biggest101442 == 1){
                            active[61]=1;
                            ends[61]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[61]=1;
                          ends[61]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S36921=1;
                  S36921=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 484, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 484, column: 11
                    S36921=1;
                    active[61]=1;
                    ends[61]=1;
                    break RUN;
                  }
                  else {
                    S36916=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 484, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 484, column: 11
                      S36916=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 484, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 484, column: 11
                        ends[61]=2;
                        ;//sysj\conveyor_controller.sysj line: 484, column: 11
                        S42677=1;
                        thread101443(tdone,ends);
                        thread101444(tdone,ends);
                        thread101445(tdone,ends);
                        thread101449(tdone,ends);
                        int biggest101453 = 0;
                        if(ends[62]>=biggest101453){
                          biggest101453=ends[62];
                        }
                        if(ends[68]>=biggest101453){
                          biggest101453=ends[68];
                        }
                        if(ends[69]>=biggest101453){
                          biggest101453=ends[69];
                        }
                        if(ends[72]>=biggest101453){
                          biggest101453=ends[72];
                        }
                        if(biggest101453 == 1){
                          active[61]=1;
                          ends[61]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[61]=1;
                        ends[61]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[61]=1;
                      ends[61]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread101454(tdone,ends);
              thread101469(tdone,ends);
              thread101470(tdone,ends);
              thread101477(tdone,ends);
              int biggest101484 = 0;
              if(ends[62]>=biggest101484){
                biggest101484=ends[62];
              }
              if(ends[68]>=biggest101484){
                biggest101484=ends[68];
              }
              if(ends[69]>=biggest101484){
                biggest101484=ends[69];
              }
              if(ends[72]>=biggest101484){
                biggest101484=ends[72];
              }
              if(biggest101484 == 1){
                active[61]=1;
                ends[61]=1;
                break RUN;
              }
              //FINXME code
              if(biggest101484 == 0){
                S42678=0;
                active[61]=0;
                ends[61]=0;
                S42678=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos4_61 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[61] != 0){
      int index = 61;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[61]!=0 || suspended[61]!=0 || active[61]!=1);
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
      bottleAtPos4_61.setpreclear();
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
      bottleAtPos4_61.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[61]!=0 || suspended[61]!=0 || active[61]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[61] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
