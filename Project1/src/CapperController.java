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
  private int S37034 = 1;
  private int S37033 = 1;
  private int S31277 = 1;
  private int S31272 = 1;
  private int S32574 = 1;
  private int S31295 = 1;
  private int S31302 = 1;
  private int S31297 = 1;
  private int S31364 = 1;
  private int S31399 = 1;
  private int S31366 = 1;
  private int S31371 = 1;
  private int S31379 = 1;
  private int S31382 = 1;
  private int S31451 = 1;
  private int S31446 = 1;
  private int S31502 = 1;
  private int S32657 = 1;
  private int S32601 = 1;
  private int S32581 = 1;
  private int S32576 = 1;
  private int S32692 = 1;
  private int S32668 = 1;
  private int S32662 = 1;
  private int S32665 = 1;
  private int S32727 = 1;
  private int S32703 = 1;
  private int S32697 = 1;
  private int S32700 = 1;
  
  private int[] ends = new int[88];
  private int[] tdone = new int[88];
  
  public void thread95833(int [] tdone, int [] ends){
        S32700=1;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread95832(int [] tdone, int [] ends){
        S32697=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread95830(int [] tdone, int [] ends){
        switch(S32700){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 584, column: 36
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

  public void thread95829(int [] tdone, int [] ends){
        switch(S32697){
      case 0 : 
        active[73]=0;
        ends[73]=0;
        tdone[73]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[73]=1;
        ends[73]=1;
        tdone[73]=1;
        break;
      
    }
  }

  public void thread95828(int [] tdone, int [] ends){
        switch(S32727){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        switch(S32703){
          case 0 : 
            thread95829(tdone,ends);
            thread95830(tdone,ends);
            int biggest95831 = 0;
            if(ends[73]>=biggest95831){
              biggest95831=ends[73];
            }
            if(ends[74]>=biggest95831){
              biggest95831=ends[74];
            }
            if(biggest95831 == 1){
              active[72]=1;
              ends[72]=1;
              tdone[72]=1;
            }
            if(biggest95831 == 2){
              ends[72]=2;
              ;//sysj\conveyor_controller.sysj line: 578, column: 19
              S32703=1;
              active[72]=1;
              ends[72]=1;
              tdone[72]=1;
            }
            //FINXME code
            if(biggest95831 == 0){
              S32703=1;
              active[72]=1;
              ends[72]=1;
              tdone[72]=1;
            }
            break;
          
          case 1 : 
            S32703=1;
            S32703=0;
            if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 577, column: 27
              thread95832(tdone,ends);
              thread95833(tdone,ends);
              int biggest95834 = 0;
              if(ends[73]>=biggest95834){
                biggest95834=ends[73];
              }
              if(ends[74]>=biggest95834){
                biggest95834=ends[74];
              }
              if(biggest95834 == 1){
                active[72]=1;
                ends[72]=1;
                tdone[72]=1;
              }
            }
            else {
              S32703=1;
              active[72]=1;
              ends[72]=1;
              tdone[72]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95826(int [] tdone, int [] ends){
        S32665=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread95825(int [] tdone, int [] ends){
        S32662=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread95823(int [] tdone, int [] ends){
        switch(S32665){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 565, column: 37
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

  public void thread95822(int [] tdone, int [] ends){
        switch(S32662){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
        break;
      
    }
  }

  public void thread95821(int [] tdone, int [] ends){
        switch(S32692){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        switch(S32668){
          case 0 : 
            thread95822(tdone,ends);
            thread95823(tdone,ends);
            int biggest95824 = 0;
            if(ends[70]>=biggest95824){
              biggest95824=ends[70];
            }
            if(ends[71]>=biggest95824){
              biggest95824=ends[71];
            }
            if(biggest95824 == 1){
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            if(biggest95824 == 2){
              ends[69]=2;
              ;//sysj\conveyor_controller.sysj line: 559, column: 20
              S32668=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            //FINXME code
            if(biggest95824 == 0){
              S32668=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            break;
          
          case 1 : 
            S32668=1;
            S32668=0;
            if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 558, column: 39
              thread95825(tdone,ends);
              thread95826(tdone,ends);
              int biggest95827 = 0;
              if(ends[70]>=biggest95827){
                biggest95827=ends[70];
              }
              if(ends[71]>=biggest95827){
                biggest95827=ends[71];
              }
              if(biggest95827 == 1){
                active[69]=1;
                ends[69]=1;
                tdone[69]=1;
              }
            }
            else {
              S32668=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95820(int [] tdone, int [] ends){
        switch(S32657){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        switch(S32601){
          case 0 : 
            switch(S32581){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 548, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
                  S32581=1;
                  active[68]=1;
                  ends[68]=1;
                  tdone[68]=1;
                }
                else {
                  switch(S32576){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 548, column: 13
                        S32576=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
                          ends[68]=2;
                          ;//sysj\conveyor_controller.sysj line: 548, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 549, column: 16
                            bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 14
                            currsigs.addElement(bottleAtPos4_61);
                            S32601=1;
                            active[68]=1;
                            ends[68]=1;
                            tdone[68]=1;
                          }
                          else {
                            S32601=1;
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
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
                        ends[68]=2;
                        ;//sysj\conveyor_controller.sysj line: 548, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 549, column: 16
                          bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 14
                          currsigs.addElement(bottleAtPos4_61);
                          S32601=1;
                          active[68]=1;
                          ends[68]=1;
                          tdone[68]=1;
                        }
                        else {
                          S32601=1;
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
                S32581=1;
                S32581=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 548, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
                  S32581=1;
                  active[68]=1;
                  ends[68]=1;
                  tdone[68]=1;
                }
                else {
                  S32576=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 548, column: 13
                    S32576=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
                      ends[68]=2;
                      ;//sysj\conveyor_controller.sysj line: 548, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 549, column: 16
                        bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 14
                        currsigs.addElement(bottleAtPos4_61);
                        S32601=1;
                        active[68]=1;
                        ends[68]=1;
                        tdone[68]=1;
                      }
                      else {
                        S32601=1;
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
            S32601=1;
            S32601=0;
            S32581=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 548, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
              S32581=1;
              active[68]=1;
              ends[68]=1;
              tdone[68]=1;
            }
            else {
              S32576=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 548, column: 13
                S32576=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
                  ends[68]=2;
                  ;//sysj\conveyor_controller.sysj line: 548, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 549, column: 16
                    bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 14
                    currsigs.addElement(bottleAtPos4_61);
                    S32601=1;
                    active[68]=1;
                    ends[68]=1;
                    tdone[68]=1;
                  }
                  else {
                    S32601=1;
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

  public void thread95817(int [] tdone, int [] ends){
        switch(S31382){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 521, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 522, column: 16
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

  public void thread95816(int [] tdone, int [] ends){
        switch(S31379){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 517, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread95815(int [] tdone, int [] ends){
        switch(S31371){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 512, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
        break;
      
    }
  }

  public void thread95813(int [] tdone, int [] ends){
        S31382=1;
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread95812(int [] tdone, int [] ends){
        S31379=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 516, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 517, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread95811(int [] tdone, int [] ends){
        S31371=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 512, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread95810(int [] tdone, int [] ends){
        switch(S31399){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        switch(S31366){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 509, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 510, column: 15
              S31366=1;
              thread95811(tdone,ends);
              thread95812(tdone,ends);
              thread95813(tdone,ends);
              int biggest95814 = 0;
              if(ends[65]>=biggest95814){
                biggest95814=ends[65];
              }
              if(ends[66]>=biggest95814){
                biggest95814=ends[66];
              }
              if(ends[67]>=biggest95814){
                biggest95814=ends[67];
              }
              if(biggest95814 == 1){
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
            thread95815(tdone,ends);
            thread95816(tdone,ends);
            thread95817(tdone,ends);
            int biggest95818 = 0;
            if(ends[65]>=biggest95818){
              biggest95818=ends[65];
            }
            if(ends[66]>=biggest95818){
              biggest95818=ends[66];
            }
            if(ends[67]>=biggest95818){
              biggest95818=ends[67];
            }
            if(biggest95818 == 1){
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            if(biggest95818 == 2){
              ends[64]=2;
              tdone[64]=1;
            }
            //FINXME code
            if(biggest95818 == 0){
              S31399=0;
              active[64]=0;
              ends[64]=0;
              tdone[64]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95809(int [] tdone, int [] ends){
        switch(S31364){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 505, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
        break;
      
    }
  }

  public void thread95807(int [] tdone, int [] ends){
        S31399=1;
    S31366=0;
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread95806(int [] tdone, int [] ends){
        S31364=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 505, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread95805(int [] tdone, int [] ends){
        switch(S32574){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        switch(S31295){
          case 0 : 
            if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 484, column: 19
              S31295=1;
              S31302=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 485, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 485, column: 13
                S31302=1;
                active[62]=1;
                ends[62]=1;
                tdone[62]=1;
              }
              else {
                S31297=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 485, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 485, column: 13
                  S31297=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 485, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 485, column: 13
                    ends[62]=2;
                    ;//sysj\conveyor_controller.sysj line: 485, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 486, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 487, column: 13
                    S31295=2;
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
            switch(S31302){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 485, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 485, column: 13
                  S31302=1;
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                else {
                  switch(S31297){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 485, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 485, column: 13
                        S31297=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 485, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 485, column: 13
                          ends[62]=2;
                          ;//sysj\conveyor_controller.sysj line: 485, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 486, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 487, column: 13
                          S31295=2;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 485, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 485, column: 13
                        ends[62]=2;
                        ;//sysj\conveyor_controller.sysj line: 485, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 486, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 487, column: 13
                        S31295=2;
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
                S31302=1;
                S31302=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 485, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 485, column: 13
                  S31302=1;
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                else {
                  S31297=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 485, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 485, column: 13
                    S31297=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 485, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 485, column: 13
                      ends[62]=2;
                      ;//sysj\conveyor_controller.sysj line: 485, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 486, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 487, column: 13
                      S31295=2;
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
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 488, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 492, column: 13
              S31295=3;
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
            S31295=3;
            S31295=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 498, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[62]=1;
            ends[62]=1;
            tdone[62]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 496, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 501, column: 13
              S31295=5;
              thread95806(tdone,ends);
              thread95807(tdone,ends);
              int biggest95808 = 0;
              if(ends[63]>=biggest95808){
                biggest95808=ends[63];
              }
              if(ends[64]>=biggest95808){
                biggest95808=ends[64];
              }
              if(biggest95808 == 1){
                active[62]=1;
                ends[62]=1;
                tdone[62]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            break;
          
          case 5 : 
            thread95809(tdone,ends);
            thread95810(tdone,ends);
            int biggest95819 = 0;
            if(ends[63]>=biggest95819){
              biggest95819=ends[63];
            }
            if(ends[64]>=biggest95819){
              biggest95819=ends[64];
            }
            if(biggest95819 == 1){
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            if(biggest95819 == 2){
              ends[62]=2;
              ;//sysj\conveyor_controller.sysj line: 504, column: 13
              S31295=6;
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            //FINXME code
            if(biggest95819 == 0){
              S31295=6;
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 528, column: 19
              S31295=7;
              S31451=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 530, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 530, column: 13
                S31451=1;
                active[62]=1;
                ends[62]=1;
                tdone[62]=1;
              }
              else {
                S31446=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 530, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 530, column: 13
                  S31446=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 530, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 530, column: 13
                    ends[62]=2;
                    ;//sysj\conveyor_controller.sysj line: 530, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 531, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 532, column: 13
                    S31295=8;
                    S31502=0;
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
            switch(S31451){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 530, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 530, column: 13
                  S31451=1;
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                else {
                  switch(S31446){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 530, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 530, column: 13
                        S31446=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 530, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 530, column: 13
                          ends[62]=2;
                          ;//sysj\conveyor_controller.sysj line: 530, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 531, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 532, column: 13
                          S31295=8;
                          S31502=0;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 530, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 530, column: 13
                        ends[62]=2;
                        ;//sysj\conveyor_controller.sysj line: 530, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 531, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 532, column: 13
                        S31295=8;
                        S31502=0;
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
                S31451=1;
                S31451=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 530, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 530, column: 13
                  S31451=1;
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                else {
                  S31446=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 530, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 530, column: 13
                    S31446=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 530, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 530, column: 13
                      ends[62]=2;
                      ;//sysj\conveyor_controller.sysj line: 530, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 531, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 532, column: 13
                      S31295=8;
                      S31502=0;
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
            switch(S31502){
              case 0 : 
                if(!bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 533, column: 29
                  S31502=1;
                  if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 535, column: 23
                    active[62]=1;
                    ends[62]=1;
                    tdone[62]=1;
                  }
                  else {
                    ends[62]=2;
                    ;//sysj\conveyor_controller.sysj line: 533, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 483, column: 13
                    S31295=0;
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
                if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 535, column: 23
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                else {
                  ends[62]=2;
                  ;//sysj\conveyor_controller.sysj line: 533, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 483, column: 13
                  S31295=0;
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

  public void thread95802(int [] tdone, int [] ends){
        S32700=1;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread95801(int [] tdone, int [] ends){
        S32697=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread95800(int [] tdone, int [] ends){
        S32727=1;
    S32703=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 577, column: 27
      thread95801(tdone,ends);
      thread95802(tdone,ends);
      int biggest95803 = 0;
      if(ends[73]>=biggest95803){
        biggest95803=ends[73];
      }
      if(ends[74]>=biggest95803){
        biggest95803=ends[74];
      }
      if(biggest95803 == 1){
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
      }
    }
    else {
      S32703=1;
      active[72]=1;
      ends[72]=1;
      tdone[72]=1;
    }
  }

  public void thread95798(int [] tdone, int [] ends){
        S32665=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread95797(int [] tdone, int [] ends){
        S32662=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread95796(int [] tdone, int [] ends){
        S32692=1;
    S32668=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 558, column: 39
      thread95797(tdone,ends);
      thread95798(tdone,ends);
      int biggest95799 = 0;
      if(ends[70]>=biggest95799){
        biggest95799=ends[70];
      }
      if(ends[71]>=biggest95799){
        biggest95799=ends[71];
      }
      if(biggest95799 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S32668=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread95795(int [] tdone, int [] ends){
        S32657=1;
    S32601=0;
    S32581=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 548, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
      S32581=1;
      active[68]=1;
      ends[68]=1;
      tdone[68]=1;
    }
    else {
      S32576=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 548, column: 13
        S32576=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
          ends[68]=2;
          ;//sysj\conveyor_controller.sysj line: 548, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 549, column: 16
            bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 14
            currsigs.addElement(bottleAtPos4_61);
            S32601=1;
            active[68]=1;
            ends[68]=1;
            tdone[68]=1;
          }
          else {
            S32601=1;
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

  public void thread95794(int [] tdone, int [] ends){
        S32574=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 483, column: 13
    S31295=0;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread95791(int [] tdone, int [] ends){
        S32700=1;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread95790(int [] tdone, int [] ends){
        S32697=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread95789(int [] tdone, int [] ends){
        S32727=1;
    S32703=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 577, column: 27
      thread95790(tdone,ends);
      thread95791(tdone,ends);
      int biggest95792 = 0;
      if(ends[73]>=biggest95792){
        biggest95792=ends[73];
      }
      if(ends[74]>=biggest95792){
        biggest95792=ends[74];
      }
      if(biggest95792 == 1){
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
      }
    }
    else {
      S32703=1;
      active[72]=1;
      ends[72]=1;
      tdone[72]=1;
    }
  }

  public void thread95787(int [] tdone, int [] ends){
        S32665=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread95786(int [] tdone, int [] ends){
        S32662=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread95785(int [] tdone, int [] ends){
        S32692=1;
    S32668=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 558, column: 39
      thread95786(tdone,ends);
      thread95787(tdone,ends);
      int biggest95788 = 0;
      if(ends[70]>=biggest95788){
        biggest95788=ends[70];
      }
      if(ends[71]>=biggest95788){
        biggest95788=ends[71];
      }
      if(biggest95788 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S32668=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread95784(int [] tdone, int [] ends){
        S32657=1;
    S32601=0;
    S32581=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 548, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
      S32581=1;
      active[68]=1;
      ends[68]=1;
      tdone[68]=1;
    }
    else {
      S32576=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 548, column: 13
        S32576=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
          ends[68]=2;
          ;//sysj\conveyor_controller.sysj line: 548, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 549, column: 16
            bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 14
            currsigs.addElement(bottleAtPos4_61);
            S32601=1;
            active[68]=1;
            ends[68]=1;
            tdone[68]=1;
          }
          else {
            S32601=1;
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

  public void thread95783(int [] tdone, int [] ends){
        S32574=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 483, column: 13
    S31295=0;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread95780(int [] tdone, int [] ends){
        S32700=1;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread95779(int [] tdone, int [] ends){
        S32697=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread95778(int [] tdone, int [] ends){
        S32727=1;
    S32703=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 577, column: 27
      thread95779(tdone,ends);
      thread95780(tdone,ends);
      int biggest95781 = 0;
      if(ends[73]>=biggest95781){
        biggest95781=ends[73];
      }
      if(ends[74]>=biggest95781){
        biggest95781=ends[74];
      }
      if(biggest95781 == 1){
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
      }
    }
    else {
      S32703=1;
      active[72]=1;
      ends[72]=1;
      tdone[72]=1;
    }
  }

  public void thread95776(int [] tdone, int [] ends){
        S32665=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread95775(int [] tdone, int [] ends){
        S32662=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread95774(int [] tdone, int [] ends){
        S32692=1;
    S32668=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 558, column: 39
      thread95775(tdone,ends);
      thread95776(tdone,ends);
      int biggest95777 = 0;
      if(ends[70]>=biggest95777){
        biggest95777=ends[70];
      }
      if(ends[71]>=biggest95777){
        biggest95777=ends[71];
      }
      if(biggest95777 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S32668=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread95773(int [] tdone, int [] ends){
        S32657=1;
    S32601=0;
    S32581=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 548, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
      S32581=1;
      active[68]=1;
      ends[68]=1;
      tdone[68]=1;
    }
    else {
      S32576=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 548, column: 13
        S32576=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
          ends[68]=2;
          ;//sysj\conveyor_controller.sysj line: 548, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 549, column: 16
            bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 14
            currsigs.addElement(bottleAtPos4_61);
            S32601=1;
            active[68]=1;
            ends[68]=1;
            tdone[68]=1;
          }
          else {
            S32601=1;
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

  public void thread95772(int [] tdone, int [] ends){
        S32574=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 483, column: 13
    S31295=0;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread95769(int [] tdone, int [] ends){
        S32700=1;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread95768(int [] tdone, int [] ends){
        S32697=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread95767(int [] tdone, int [] ends){
        S32727=1;
    S32703=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 577, column: 27
      thread95768(tdone,ends);
      thread95769(tdone,ends);
      int biggest95770 = 0;
      if(ends[73]>=biggest95770){
        biggest95770=ends[73];
      }
      if(ends[74]>=biggest95770){
        biggest95770=ends[74];
      }
      if(biggest95770 == 1){
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
      }
    }
    else {
      S32703=1;
      active[72]=1;
      ends[72]=1;
      tdone[72]=1;
    }
  }

  public void thread95765(int [] tdone, int [] ends){
        S32665=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread95764(int [] tdone, int [] ends){
        S32662=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread95763(int [] tdone, int [] ends){
        S32692=1;
    S32668=0;
    if(bottleAtPos4_61.getprestatus()){//sysj\conveyor_controller.sysj line: 558, column: 39
      thread95764(tdone,ends);
      thread95765(tdone,ends);
      int biggest95766 = 0;
      if(ends[70]>=biggest95766){
        biggest95766=ends[70];
      }
      if(ends[71]>=biggest95766){
        biggest95766=ends[71];
      }
      if(biggest95766 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S32668=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread95762(int [] tdone, int [] ends){
        S32657=1;
    S32601=0;
    S32581=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 548, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
      S32581=1;
      active[68]=1;
      ends[68]=1;
      tdone[68]=1;
    }
    else {
      S32576=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 548, column: 13
        S32576=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 548, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 548, column: 13
          ends[68]=2;
          ;//sysj\conveyor_controller.sysj line: 548, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 549, column: 16
            bottleAtPos4_61.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 14
            currsigs.addElement(bottleAtPos4_61);
            S32601=1;
            active[68]=1;
            ends[68]=1;
            tdone[68]=1;
          }
          else {
            S32601=1;
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

  public void thread95761(int [] tdone, int [] ends){
        S32574=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 483, column: 13
    S31295=0;
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
      switch(S37034){
        case 0 : 
          S37034=0;
          break RUN;
        
        case 1 : 
          S37034=2;
          S37034=2;
          bottleAtPos4_61.setClear();//sysj\conveyor_controller.sysj line: 477, column: 11
          S37033=0;
          S31277=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 478, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 478, column: 11
            S31277=1;
            active[61]=1;
            ends[61]=1;
            break RUN;
          }
          else {
            S31272=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 478, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 478, column: 11
              S31272=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 478, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 478, column: 11
                ends[61]=2;
                ;//sysj\conveyor_controller.sysj line: 478, column: 11
                S37033=1;
                thread95761(tdone,ends);
                thread95762(tdone,ends);
                thread95763(tdone,ends);
                thread95767(tdone,ends);
                int biggest95771 = 0;
                if(ends[62]>=biggest95771){
                  biggest95771=ends[62];
                }
                if(ends[68]>=biggest95771){
                  biggest95771=ends[68];
                }
                if(ends[69]>=biggest95771){
                  biggest95771=ends[69];
                }
                if(ends[72]>=biggest95771){
                  biggest95771=ends[72];
                }
                if(biggest95771 == 1){
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
          bottleAtPos4_61.setClear();//sysj\conveyor_controller.sysj line: 477, column: 11
          switch(S37033){
            case 0 : 
              switch(S31277){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 478, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 478, column: 11
                    S31277=1;
                    active[61]=1;
                    ends[61]=1;
                    break RUN;
                  }
                  else {
                    switch(S31272){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 478, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 478, column: 11
                          S31272=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 478, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 478, column: 11
                            ends[61]=2;
                            ;//sysj\conveyor_controller.sysj line: 478, column: 11
                            S37033=1;
                            thread95772(tdone,ends);
                            thread95773(tdone,ends);
                            thread95774(tdone,ends);
                            thread95778(tdone,ends);
                            int biggest95782 = 0;
                            if(ends[62]>=biggest95782){
                              biggest95782=ends[62];
                            }
                            if(ends[68]>=biggest95782){
                              biggest95782=ends[68];
                            }
                            if(ends[69]>=biggest95782){
                              biggest95782=ends[69];
                            }
                            if(ends[72]>=biggest95782){
                              biggest95782=ends[72];
                            }
                            if(biggest95782 == 1){
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
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 478, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 478, column: 11
                          ends[61]=2;
                          ;//sysj\conveyor_controller.sysj line: 478, column: 11
                          S37033=1;
                          thread95783(tdone,ends);
                          thread95784(tdone,ends);
                          thread95785(tdone,ends);
                          thread95789(tdone,ends);
                          int biggest95793 = 0;
                          if(ends[62]>=biggest95793){
                            biggest95793=ends[62];
                          }
                          if(ends[68]>=biggest95793){
                            biggest95793=ends[68];
                          }
                          if(ends[69]>=biggest95793){
                            biggest95793=ends[69];
                          }
                          if(ends[72]>=biggest95793){
                            biggest95793=ends[72];
                          }
                          if(biggest95793 == 1){
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
                  S31277=1;
                  S31277=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 478, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 478, column: 11
                    S31277=1;
                    active[61]=1;
                    ends[61]=1;
                    break RUN;
                  }
                  else {
                    S31272=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 478, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 478, column: 11
                      S31272=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 478, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 478, column: 11
                        ends[61]=2;
                        ;//sysj\conveyor_controller.sysj line: 478, column: 11
                        S37033=1;
                        thread95794(tdone,ends);
                        thread95795(tdone,ends);
                        thread95796(tdone,ends);
                        thread95800(tdone,ends);
                        int biggest95804 = 0;
                        if(ends[62]>=biggest95804){
                          biggest95804=ends[62];
                        }
                        if(ends[68]>=biggest95804){
                          biggest95804=ends[68];
                        }
                        if(ends[69]>=biggest95804){
                          biggest95804=ends[69];
                        }
                        if(ends[72]>=biggest95804){
                          biggest95804=ends[72];
                        }
                        if(biggest95804 == 1){
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
              thread95805(tdone,ends);
              thread95820(tdone,ends);
              thread95821(tdone,ends);
              thread95828(tdone,ends);
              int biggest95835 = 0;
              if(ends[62]>=biggest95835){
                biggest95835=ends[62];
              }
              if(ends[68]>=biggest95835){
                biggest95835=ends[68];
              }
              if(ends[69]>=biggest95835){
                biggest95835=ends[69];
              }
              if(ends[72]>=biggest95835){
                biggest95835=ends[72];
              }
              if(biggest95835 == 1){
                active[61]=1;
                ends[61]=1;
                break RUN;
              }
              //FINXME code
              if(biggest95835 == 0){
                S37034=0;
                active[61]=0;
                ends[61]=0;
                S37034=0;
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
