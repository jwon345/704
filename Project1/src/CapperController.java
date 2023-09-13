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
  private Signal bottleAtPos4_77;
  private Signal done_77;
  private int S138737 = 1;
  private int S138736 = 1;
  private int S132980 = 1;
  private int S132975 = 1;
  private int S134277 = 1;
  private int S132998 = 1;
  private int S133005 = 1;
  private int S133000 = 1;
  private int S133067 = 1;
  private int S133102 = 1;
  private int S133069 = 1;
  private int S133074 = 1;
  private int S133082 = 1;
  private int S133085 = 1;
  private int S133154 = 1;
  private int S133149 = 1;
  private int S133205 = 1;
  private int S134360 = 1;
  private int S134304 = 1;
  private int S134284 = 1;
  private int S134279 = 1;
  private int S134395 = 1;
  private int S134371 = 1;
  private int S134365 = 1;
  private int S134368 = 1;
  private int S134430 = 1;
  private int S134406 = 1;
  private int S134400 = 1;
  private int S134403 = 1;
  
  private int[] ends = new int[104];
  private int[] tdone = new int[104];
  
  public void thread192342(int [] tdone, int [] ends){
        S134403=1;
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192341(int [] tdone, int [] ends){
        S134400=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 762, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread192339(int [] tdone, int [] ends){
        switch(S134403){
      case 0 : 
        active[90]=0;
        ends[90]=0;
        tdone[90]=1;
        break;
      
      case 1 : 
        if(done_77.getprestatus()){//sysj\conveyor_controller.sysj line: 766, column: 36
          ends[90]=2;
          tdone[90]=1;
        }
        else {
          active[90]=1;
          ends[90]=1;
          tdone[90]=1;
        }
        break;
      
    }
  }

  public void thread192338(int [] tdone, int [] ends){
        switch(S134400){
      case 0 : 
        active[89]=0;
        ends[89]=0;
        tdone[89]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 762, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
        break;
      
    }
  }

  public void thread192337(int [] tdone, int [] ends){
        switch(S134430){
      case 0 : 
        active[88]=0;
        ends[88]=0;
        tdone[88]=1;
        break;
      
      case 1 : 
        switch(S134406){
          case 0 : 
            thread192338(tdone,ends);
            thread192339(tdone,ends);
            int biggest192340 = 0;
            if(ends[89]>=biggest192340){
              biggest192340=ends[89];
            }
            if(ends[90]>=biggest192340){
              biggest192340=ends[90];
            }
            if(biggest192340 == 1){
              active[88]=1;
              ends[88]=1;
              tdone[88]=1;
            }
            if(biggest192340 == 2){
              ends[88]=2;
              ;//sysj\conveyor_controller.sysj line: 760, column: 19
              S134406=1;
              active[88]=1;
              ends[88]=1;
              tdone[88]=1;
            }
            //FINXME code
            if(biggest192340 == 0){
              S134406=1;
              active[88]=1;
              ends[88]=1;
              tdone[88]=1;
            }
            break;
          
          case 1 : 
            S134406=1;
            S134406=0;
            if(bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 759, column: 27
              thread192341(tdone,ends);
              thread192342(tdone,ends);
              int biggest192343 = 0;
              if(ends[89]>=biggest192343){
                biggest192343=ends[89];
              }
              if(ends[90]>=biggest192343){
                biggest192343=ends[90];
              }
              if(biggest192343 == 1){
                active[88]=1;
                ends[88]=1;
                tdone[88]=1;
              }
            }
            else {
              S134406=1;
              active[88]=1;
              ends[88]=1;
              tdone[88]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192335(int [] tdone, int [] ends){
        S134368=1;
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192334(int [] tdone, int [] ends){
        S134365=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 743, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread192332(int [] tdone, int [] ends){
        switch(S134368){
      case 0 : 
        active[87]=0;
        ends[87]=0;
        tdone[87]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 747, column: 37
          ends[87]=2;
          tdone[87]=1;
        }
        else {
          active[87]=1;
          ends[87]=1;
          tdone[87]=1;
        }
        break;
      
    }
  }

  public void thread192331(int [] tdone, int [] ends){
        switch(S134365){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 743, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
        break;
      
    }
  }

  public void thread192330(int [] tdone, int [] ends){
        switch(S134395){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        switch(S134371){
          case 0 : 
            thread192331(tdone,ends);
            thread192332(tdone,ends);
            int biggest192333 = 0;
            if(ends[86]>=biggest192333){
              biggest192333=ends[86];
            }
            if(ends[87]>=biggest192333){
              biggest192333=ends[87];
            }
            if(biggest192333 == 1){
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            if(biggest192333 == 2){
              ends[85]=2;
              ;//sysj\conveyor_controller.sysj line: 741, column: 20
              S134371=1;
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            //FINXME code
            if(biggest192333 == 0){
              S134371=1;
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            break;
          
          case 1 : 
            S134371=1;
            S134371=0;
            if(bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 740, column: 39
              thread192334(tdone,ends);
              thread192335(tdone,ends);
              int biggest192336 = 0;
              if(ends[86]>=biggest192336){
                biggest192336=ends[86];
              }
              if(ends[87]>=biggest192336){
                biggest192336=ends[87];
              }
              if(biggest192336 == 1){
                active[85]=1;
                ends[85]=1;
                tdone[85]=1;
              }
            }
            else {
              S134371=1;
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192329(int [] tdone, int [] ends){
        switch(S134360){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        switch(S134304){
          case 0 : 
            switch(S134284){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 727, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
                  S134284=1;
                  active[84]=1;
                  ends[84]=1;
                  tdone[84]=1;
                }
                else {
                  switch(S134279){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 727, column: 13
                        S134279=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
                          ends[84]=2;
                          ;//sysj\conveyor_controller.sysj line: 727, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 728, column: 16
                            bottleAtPos4_77.setPresent();//sysj\conveyor_controller.sysj line: 729, column: 14
                            currsigs.addElement(bottleAtPos4_77);
                            S134304=1;
                            active[84]=1;
                            ends[84]=1;
                            tdone[84]=1;
                          }
                          else {
                            done_77.setPresent();//sysj\conveyor_controller.sysj line: 732, column: 14
                            currsigs.addElement(done_77);
                            S134304=1;
                            active[84]=1;
                            ends[84]=1;
                            tdone[84]=1;
                          }
                        }
                        else {
                          active[84]=1;
                          ends[84]=1;
                          tdone[84]=1;
                        }
                      }
                      else {
                        active[84]=1;
                        ends[84]=1;
                        tdone[84]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
                        ends[84]=2;
                        ;//sysj\conveyor_controller.sysj line: 727, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 728, column: 16
                          bottleAtPos4_77.setPresent();//sysj\conveyor_controller.sysj line: 729, column: 14
                          currsigs.addElement(bottleAtPos4_77);
                          S134304=1;
                          active[84]=1;
                          ends[84]=1;
                          tdone[84]=1;
                        }
                        else {
                          done_77.setPresent();//sysj\conveyor_controller.sysj line: 732, column: 14
                          currsigs.addElement(done_77);
                          S134304=1;
                          active[84]=1;
                          ends[84]=1;
                          tdone[84]=1;
                        }
                      }
                      else {
                        active[84]=1;
                        ends[84]=1;
                        tdone[84]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S134284=1;
                S134284=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 727, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
                  S134284=1;
                  active[84]=1;
                  ends[84]=1;
                  tdone[84]=1;
                }
                else {
                  S134279=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 727, column: 13
                    S134279=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
                      ends[84]=2;
                      ;//sysj\conveyor_controller.sysj line: 727, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 728, column: 16
                        bottleAtPos4_77.setPresent();//sysj\conveyor_controller.sysj line: 729, column: 14
                        currsigs.addElement(bottleAtPos4_77);
                        S134304=1;
                        active[84]=1;
                        ends[84]=1;
                        tdone[84]=1;
                      }
                      else {
                        done_77.setPresent();//sysj\conveyor_controller.sysj line: 732, column: 14
                        currsigs.addElement(done_77);
                        S134304=1;
                        active[84]=1;
                        ends[84]=1;
                        tdone[84]=1;
                      }
                    }
                    else {
                      active[84]=1;
                      ends[84]=1;
                      tdone[84]=1;
                    }
                  }
                  else {
                    active[84]=1;
                    ends[84]=1;
                    tdone[84]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S134304=1;
            S134304=0;
            S134284=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 727, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
              S134284=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            else {
              S134279=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 727, column: 13
                S134279=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
                  ends[84]=2;
                  ;//sysj\conveyor_controller.sysj line: 727, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 728, column: 16
                    bottleAtPos4_77.setPresent();//sysj\conveyor_controller.sysj line: 729, column: 14
                    currsigs.addElement(bottleAtPos4_77);
                    S134304=1;
                    active[84]=1;
                    ends[84]=1;
                    tdone[84]=1;
                  }
                  else {
                    done_77.setPresent();//sysj\conveyor_controller.sysj line: 732, column: 14
                    currsigs.addElement(done_77);
                    S134304=1;
                    active[84]=1;
                    ends[84]=1;
                    tdone[84]=1;
                  }
                }
                else {
                  active[84]=1;
                  ends[84]=1;
                  tdone[84]=1;
                }
              }
              else {
                active[84]=1;
                ends[84]=1;
                tdone[84]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192326(int [] tdone, int [] ends){
        switch(S133085){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 697, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 698, column: 16
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

  public void thread192325(int [] tdone, int [] ends){
        switch(S133082){
      case 0 : 
        active[82]=0;
        ends[82]=0;
        tdone[82]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 693, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[82]=1;
        ends[82]=1;
        tdone[82]=1;
        break;
      
    }
  }

  public void thread192324(int [] tdone, int [] ends){
        switch(S133074){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 688, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
        break;
      
    }
  }

  public void thread192322(int [] tdone, int [] ends){
        S133085=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread192321(int [] tdone, int [] ends){
        S133082=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 692, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 693, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread192320(int [] tdone, int [] ends){
        S133074=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 688, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[81]=1;
    ends[81]=1;
    tdone[81]=1;
  }

  public void thread192319(int [] tdone, int [] ends){
        switch(S133102){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        switch(S133069){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 685, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 686, column: 15
              S133069=1;
              thread192320(tdone,ends);
              thread192321(tdone,ends);
              thread192322(tdone,ends);
              int biggest192323 = 0;
              if(ends[81]>=biggest192323){
                biggest192323=ends[81];
              }
              if(ends[82]>=biggest192323){
                biggest192323=ends[82];
              }
              if(ends[83]>=biggest192323){
                biggest192323=ends[83];
              }
              if(biggest192323 == 1){
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
            thread192324(tdone,ends);
            thread192325(tdone,ends);
            thread192326(tdone,ends);
            int biggest192327 = 0;
            if(ends[81]>=biggest192327){
              biggest192327=ends[81];
            }
            if(ends[82]>=biggest192327){
              biggest192327=ends[82];
            }
            if(ends[83]>=biggest192327){
              biggest192327=ends[83];
            }
            if(biggest192327 == 1){
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            if(biggest192327 == 2){
              ends[80]=2;
              tdone[80]=1;
            }
            //FINXME code
            if(biggest192327 == 0){
              S133102=0;
              active[80]=0;
              ends[80]=0;
              tdone[80]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192318(int [] tdone, int [] ends){
        switch(S133067){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 681, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[79]=1;
        ends[79]=1;
        tdone[79]=1;
        break;
      
    }
  }

  public void thread192316(int [] tdone, int [] ends){
        S133102=1;
    S133069=0;
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread192315(int [] tdone, int [] ends){
        S133067=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 681, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread192314(int [] tdone, int [] ends){
        switch(S134277){
      case 0 : 
        active[78]=0;
        ends[78]=0;
        tdone[78]=1;
        break;
      
      case 1 : 
        switch(S132998){
          case 0 : 
            if(bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 660, column: 19
              S132998=1;
              S133005=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 661, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 13
                S133005=1;
                active[78]=1;
                ends[78]=1;
                tdone[78]=1;
              }
              else {
                S133000=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 661, column: 13
                  S133000=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 13
                    ends[78]=2;
                    ;//sysj\conveyor_controller.sysj line: 661, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 662, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 663, column: 13
                    S132998=2;
                    active[78]=1;
                    ends[78]=1;
                    tdone[78]=1;
                  }
                  else {
                    active[78]=1;
                    ends[78]=1;
                    tdone[78]=1;
                  }
                }
                else {
                  active[78]=1;
                  ends[78]=1;
                  tdone[78]=1;
                }
              }
            }
            else {
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            break;
          
          case 1 : 
            switch(S133005){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 661, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 13
                  S133005=1;
                  active[78]=1;
                  ends[78]=1;
                  tdone[78]=1;
                }
                else {
                  switch(S133000){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 661, column: 13
                        S133000=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 13
                          ends[78]=2;
                          ;//sysj\conveyor_controller.sysj line: 661, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 662, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 663, column: 13
                          S132998=2;
                          active[78]=1;
                          ends[78]=1;
                          tdone[78]=1;
                        }
                        else {
                          active[78]=1;
                          ends[78]=1;
                          tdone[78]=1;
                        }
                      }
                      else {
                        active[78]=1;
                        ends[78]=1;
                        tdone[78]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 13
                        ends[78]=2;
                        ;//sysj\conveyor_controller.sysj line: 661, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 662, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 663, column: 13
                        S132998=2;
                        active[78]=1;
                        ends[78]=1;
                        tdone[78]=1;
                      }
                      else {
                        active[78]=1;
                        ends[78]=1;
                        tdone[78]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S133005=1;
                S133005=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 661, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 13
                  S133005=1;
                  active[78]=1;
                  ends[78]=1;
                  tdone[78]=1;
                }
                else {
                  S133000=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 661, column: 13
                    S133000=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 13
                      ends[78]=2;
                      ;//sysj\conveyor_controller.sysj line: 661, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 662, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 663, column: 13
                      S132998=2;
                      active[78]=1;
                      ends[78]=1;
                      tdone[78]=1;
                    }
                    else {
                      active[78]=1;
                      ends[78]=1;
                      tdone[78]=1;
                    }
                  }
                  else {
                    active[78]=1;
                    ends[78]=1;
                    tdone[78]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 664, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 668, column: 13
              S132998=3;
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            else {
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            break;
          
          case 3 : 
            S132998=3;
            S132998=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 674, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 675, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[78]=1;
            ends[78]=1;
            tdone[78]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 672, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 677, column: 13
              S132998=5;
              thread192315(tdone,ends);
              thread192316(tdone,ends);
              int biggest192317 = 0;
              if(ends[79]>=biggest192317){
                biggest192317=ends[79];
              }
              if(ends[80]>=biggest192317){
                biggest192317=ends[80];
              }
              if(biggest192317 == 1){
                active[78]=1;
                ends[78]=1;
                tdone[78]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 675, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            break;
          
          case 5 : 
            thread192318(tdone,ends);
            thread192319(tdone,ends);
            int biggest192328 = 0;
            if(ends[79]>=biggest192328){
              biggest192328=ends[79];
            }
            if(ends[80]>=biggest192328){
              biggest192328=ends[80];
            }
            if(biggest192328 == 1){
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            if(biggest192328 == 2){
              ends[78]=2;
              ;//sysj\conveyor_controller.sysj line: 680, column: 13
              S132998=6;
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            //FINXME code
            if(biggest192328 == 0){
              S132998=6;
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 704, column: 19
              S132998=7;
              S133154=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 706, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 706, column: 13
                S133154=1;
                active[78]=1;
                ends[78]=1;
                tdone[78]=1;
              }
              else {
                S133149=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 706, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 706, column: 13
                  S133149=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 706, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 706, column: 13
                    ends[78]=2;
                    ;//sysj\conveyor_controller.sysj line: 706, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 707, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 708, column: 13
                    S132998=8;
                    S133205=0;
                    active[78]=1;
                    ends[78]=1;
                    tdone[78]=1;
                  }
                  else {
                    active[78]=1;
                    ends[78]=1;
                    tdone[78]=1;
                  }
                }
                else {
                  active[78]=1;
                  ends[78]=1;
                  tdone[78]=1;
                }
              }
            }
            else {
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            break;
          
          case 7 : 
            switch(S133154){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 706, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 706, column: 13
                  S133154=1;
                  active[78]=1;
                  ends[78]=1;
                  tdone[78]=1;
                }
                else {
                  switch(S133149){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 706, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 706, column: 13
                        S133149=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 706, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 706, column: 13
                          ends[78]=2;
                          ;//sysj\conveyor_controller.sysj line: 706, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 707, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 708, column: 13
                          S132998=8;
                          S133205=0;
                          active[78]=1;
                          ends[78]=1;
                          tdone[78]=1;
                        }
                        else {
                          active[78]=1;
                          ends[78]=1;
                          tdone[78]=1;
                        }
                      }
                      else {
                        active[78]=1;
                        ends[78]=1;
                        tdone[78]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 706, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 706, column: 13
                        ends[78]=2;
                        ;//sysj\conveyor_controller.sysj line: 706, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 707, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 708, column: 13
                        S132998=8;
                        S133205=0;
                        active[78]=1;
                        ends[78]=1;
                        tdone[78]=1;
                      }
                      else {
                        active[78]=1;
                        ends[78]=1;
                        tdone[78]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S133154=1;
                S133154=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 706, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 706, column: 13
                  S133154=1;
                  active[78]=1;
                  ends[78]=1;
                  tdone[78]=1;
                }
                else {
                  S133149=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 706, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 706, column: 13
                    S133149=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 706, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 706, column: 13
                      ends[78]=2;
                      ;//sysj\conveyor_controller.sysj line: 706, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 707, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 708, column: 13
                      S132998=8;
                      S133205=0;
                      active[78]=1;
                      ends[78]=1;
                      tdone[78]=1;
                    }
                    else {
                      active[78]=1;
                      ends[78]=1;
                      tdone[78]=1;
                    }
                  }
                  else {
                    active[78]=1;
                    ends[78]=1;
                    tdone[78]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S133205){
              case 0 : 
                if(!bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 709, column: 29
                  S133205=1;
                  if(bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 711, column: 23
                    active[78]=1;
                    ends[78]=1;
                    tdone[78]=1;
                  }
                  else {
                    ends[78]=2;
                    ;//sysj\conveyor_controller.sysj line: 709, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 659, column: 13
                    S132998=0;
                    active[78]=1;
                    ends[78]=1;
                    tdone[78]=1;
                  }
                }
                else {
                  active[78]=1;
                  ends[78]=1;
                  tdone[78]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 711, column: 23
                  active[78]=1;
                  ends[78]=1;
                  tdone[78]=1;
                }
                else {
                  ends[78]=2;
                  ;//sysj\conveyor_controller.sysj line: 709, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 659, column: 13
                  S132998=0;
                  active[78]=1;
                  ends[78]=1;
                  tdone[78]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192311(int [] tdone, int [] ends){
        S134403=1;
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192310(int [] tdone, int [] ends){
        S134400=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 762, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread192309(int [] tdone, int [] ends){
        S134430=1;
    S134406=0;
    if(bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 759, column: 27
      thread192310(tdone,ends);
      thread192311(tdone,ends);
      int biggest192312 = 0;
      if(ends[89]>=biggest192312){
        biggest192312=ends[89];
      }
      if(ends[90]>=biggest192312){
        biggest192312=ends[90];
      }
      if(biggest192312 == 1){
        active[88]=1;
        ends[88]=1;
        tdone[88]=1;
      }
    }
    else {
      S134406=1;
      active[88]=1;
      ends[88]=1;
      tdone[88]=1;
    }
  }

  public void thread192307(int [] tdone, int [] ends){
        S134368=1;
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192306(int [] tdone, int [] ends){
        S134365=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 743, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread192305(int [] tdone, int [] ends){
        S134395=1;
    S134371=0;
    if(bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 740, column: 39
      thread192306(tdone,ends);
      thread192307(tdone,ends);
      int biggest192308 = 0;
      if(ends[86]>=biggest192308){
        biggest192308=ends[86];
      }
      if(ends[87]>=biggest192308){
        biggest192308=ends[87];
      }
      if(biggest192308 == 1){
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
      }
    }
    else {
      S134371=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
  }

  public void thread192304(int [] tdone, int [] ends){
        S134360=1;
    S134304=0;
    S134284=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 727, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
      S134284=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
    else {
      S134279=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 727, column: 13
        S134279=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
          ends[84]=2;
          ;//sysj\conveyor_controller.sysj line: 727, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 728, column: 16
            bottleAtPos4_77.setPresent();//sysj\conveyor_controller.sysj line: 729, column: 14
            currsigs.addElement(bottleAtPos4_77);
            S134304=1;
            active[84]=1;
            ends[84]=1;
            tdone[84]=1;
          }
          else {
            done_77.setPresent();//sysj\conveyor_controller.sysj line: 732, column: 14
            currsigs.addElement(done_77);
            S134304=1;
            active[84]=1;
            ends[84]=1;
            tdone[84]=1;
          }
        }
        else {
          active[84]=1;
          ends[84]=1;
          tdone[84]=1;
        }
      }
      else {
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
  }

  public void thread192303(int [] tdone, int [] ends){
        S134277=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 659, column: 13
    S132998=0;
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread192300(int [] tdone, int [] ends){
        S134403=1;
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192299(int [] tdone, int [] ends){
        S134400=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 762, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread192298(int [] tdone, int [] ends){
        S134430=1;
    S134406=0;
    if(bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 759, column: 27
      thread192299(tdone,ends);
      thread192300(tdone,ends);
      int biggest192301 = 0;
      if(ends[89]>=biggest192301){
        biggest192301=ends[89];
      }
      if(ends[90]>=biggest192301){
        biggest192301=ends[90];
      }
      if(biggest192301 == 1){
        active[88]=1;
        ends[88]=1;
        tdone[88]=1;
      }
    }
    else {
      S134406=1;
      active[88]=1;
      ends[88]=1;
      tdone[88]=1;
    }
  }

  public void thread192296(int [] tdone, int [] ends){
        S134368=1;
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192295(int [] tdone, int [] ends){
        S134365=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 743, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread192294(int [] tdone, int [] ends){
        S134395=1;
    S134371=0;
    if(bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 740, column: 39
      thread192295(tdone,ends);
      thread192296(tdone,ends);
      int biggest192297 = 0;
      if(ends[86]>=biggest192297){
        biggest192297=ends[86];
      }
      if(ends[87]>=biggest192297){
        biggest192297=ends[87];
      }
      if(biggest192297 == 1){
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
      }
    }
    else {
      S134371=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
  }

  public void thread192293(int [] tdone, int [] ends){
        S134360=1;
    S134304=0;
    S134284=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 727, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
      S134284=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
    else {
      S134279=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 727, column: 13
        S134279=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
          ends[84]=2;
          ;//sysj\conveyor_controller.sysj line: 727, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 728, column: 16
            bottleAtPos4_77.setPresent();//sysj\conveyor_controller.sysj line: 729, column: 14
            currsigs.addElement(bottleAtPos4_77);
            S134304=1;
            active[84]=1;
            ends[84]=1;
            tdone[84]=1;
          }
          else {
            done_77.setPresent();//sysj\conveyor_controller.sysj line: 732, column: 14
            currsigs.addElement(done_77);
            S134304=1;
            active[84]=1;
            ends[84]=1;
            tdone[84]=1;
          }
        }
        else {
          active[84]=1;
          ends[84]=1;
          tdone[84]=1;
        }
      }
      else {
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
  }

  public void thread192292(int [] tdone, int [] ends){
        S134277=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 659, column: 13
    S132998=0;
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread192289(int [] tdone, int [] ends){
        S134403=1;
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192288(int [] tdone, int [] ends){
        S134400=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 762, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread192287(int [] tdone, int [] ends){
        S134430=1;
    S134406=0;
    if(bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 759, column: 27
      thread192288(tdone,ends);
      thread192289(tdone,ends);
      int biggest192290 = 0;
      if(ends[89]>=biggest192290){
        biggest192290=ends[89];
      }
      if(ends[90]>=biggest192290){
        biggest192290=ends[90];
      }
      if(biggest192290 == 1){
        active[88]=1;
        ends[88]=1;
        tdone[88]=1;
      }
    }
    else {
      S134406=1;
      active[88]=1;
      ends[88]=1;
      tdone[88]=1;
    }
  }

  public void thread192285(int [] tdone, int [] ends){
        S134368=1;
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192284(int [] tdone, int [] ends){
        S134365=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 743, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread192283(int [] tdone, int [] ends){
        S134395=1;
    S134371=0;
    if(bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 740, column: 39
      thread192284(tdone,ends);
      thread192285(tdone,ends);
      int biggest192286 = 0;
      if(ends[86]>=biggest192286){
        biggest192286=ends[86];
      }
      if(ends[87]>=biggest192286){
        biggest192286=ends[87];
      }
      if(biggest192286 == 1){
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
      }
    }
    else {
      S134371=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
  }

  public void thread192282(int [] tdone, int [] ends){
        S134360=1;
    S134304=0;
    S134284=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 727, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
      S134284=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
    else {
      S134279=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 727, column: 13
        S134279=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
          ends[84]=2;
          ;//sysj\conveyor_controller.sysj line: 727, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 728, column: 16
            bottleAtPos4_77.setPresent();//sysj\conveyor_controller.sysj line: 729, column: 14
            currsigs.addElement(bottleAtPos4_77);
            S134304=1;
            active[84]=1;
            ends[84]=1;
            tdone[84]=1;
          }
          else {
            done_77.setPresent();//sysj\conveyor_controller.sysj line: 732, column: 14
            currsigs.addElement(done_77);
            S134304=1;
            active[84]=1;
            ends[84]=1;
            tdone[84]=1;
          }
        }
        else {
          active[84]=1;
          ends[84]=1;
          tdone[84]=1;
        }
      }
      else {
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
  }

  public void thread192281(int [] tdone, int [] ends){
        S134277=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 659, column: 13
    S132998=0;
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread192278(int [] tdone, int [] ends){
        S134403=1;
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192277(int [] tdone, int [] ends){
        S134400=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 762, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread192276(int [] tdone, int [] ends){
        S134430=1;
    S134406=0;
    if(bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 759, column: 27
      thread192277(tdone,ends);
      thread192278(tdone,ends);
      int biggest192279 = 0;
      if(ends[89]>=biggest192279){
        biggest192279=ends[89];
      }
      if(ends[90]>=biggest192279){
        biggest192279=ends[90];
      }
      if(biggest192279 == 1){
        active[88]=1;
        ends[88]=1;
        tdone[88]=1;
      }
    }
    else {
      S134406=1;
      active[88]=1;
      ends[88]=1;
      tdone[88]=1;
    }
  }

  public void thread192274(int [] tdone, int [] ends){
        S134368=1;
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192273(int [] tdone, int [] ends){
        S134365=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 743, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread192272(int [] tdone, int [] ends){
        S134395=1;
    S134371=0;
    if(bottleAtPos4_77.getprestatus()){//sysj\conveyor_controller.sysj line: 740, column: 39
      thread192273(tdone,ends);
      thread192274(tdone,ends);
      int biggest192275 = 0;
      if(ends[86]>=biggest192275){
        biggest192275=ends[86];
      }
      if(ends[87]>=biggest192275){
        biggest192275=ends[87];
      }
      if(biggest192275 == 1){
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
      }
    }
    else {
      S134371=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
  }

  public void thread192271(int [] tdone, int [] ends){
        S134360=1;
    S134304=0;
    S134284=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 727, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
      S134284=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
    else {
      S134279=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 727, column: 13
        S134279=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 727, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 727, column: 13
          ends[84]=2;
          ;//sysj\conveyor_controller.sysj line: 727, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 728, column: 16
            bottleAtPos4_77.setPresent();//sysj\conveyor_controller.sysj line: 729, column: 14
            currsigs.addElement(bottleAtPos4_77);
            S134304=1;
            active[84]=1;
            ends[84]=1;
            tdone[84]=1;
          }
          else {
            done_77.setPresent();//sysj\conveyor_controller.sysj line: 732, column: 14
            currsigs.addElement(done_77);
            S134304=1;
            active[84]=1;
            ends[84]=1;
            tdone[84]=1;
          }
        }
        else {
          active[84]=1;
          ends[84]=1;
          tdone[84]=1;
        }
      }
      else {
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
  }

  public void thread192270(int [] tdone, int [] ends){
        S134277=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 659, column: 13
    S132998=0;
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S138737){
        case 0 : 
          S138737=0;
          break RUN;
        
        case 1 : 
          S138737=2;
          S138737=2;
          bottleAtPos4_77.setClear();//sysj\conveyor_controller.sysj line: 653, column: 11
          done_77.setClear();//sysj\conveyor_controller.sysj line: 653, column: 11
          S138736=0;
          S132980=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 654, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 654, column: 11
            S132980=1;
            active[77]=1;
            ends[77]=1;
            break RUN;
          }
          else {
            S132975=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 654, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 654, column: 11
              S132975=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 654, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 654, column: 11
                ends[77]=2;
                ;//sysj\conveyor_controller.sysj line: 654, column: 11
                S138736=1;
                thread192270(tdone,ends);
                thread192271(tdone,ends);
                thread192272(tdone,ends);
                thread192276(tdone,ends);
                int biggest192280 = 0;
                if(ends[78]>=biggest192280){
                  biggest192280=ends[78];
                }
                if(ends[84]>=biggest192280){
                  biggest192280=ends[84];
                }
                if(ends[85]>=biggest192280){
                  biggest192280=ends[85];
                }
                if(ends[88]>=biggest192280){
                  biggest192280=ends[88];
                }
                if(biggest192280 == 1){
                  active[77]=1;
                  ends[77]=1;
                  break RUN;
                }
              }
              else {
                active[77]=1;
                ends[77]=1;
                break RUN;
              }
            }
            else {
              active[77]=1;
              ends[77]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_77.setClear();//sysj\conveyor_controller.sysj line: 653, column: 11
          done_77.setClear();//sysj\conveyor_controller.sysj line: 653, column: 11
          switch(S138736){
            case 0 : 
              switch(S132980){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 654, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 654, column: 11
                    S132980=1;
                    active[77]=1;
                    ends[77]=1;
                    break RUN;
                  }
                  else {
                    switch(S132975){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 654, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 654, column: 11
                          S132975=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 654, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 654, column: 11
                            ends[77]=2;
                            ;//sysj\conveyor_controller.sysj line: 654, column: 11
                            S138736=1;
                            thread192281(tdone,ends);
                            thread192282(tdone,ends);
                            thread192283(tdone,ends);
                            thread192287(tdone,ends);
                            int biggest192291 = 0;
                            if(ends[78]>=biggest192291){
                              biggest192291=ends[78];
                            }
                            if(ends[84]>=biggest192291){
                              biggest192291=ends[84];
                            }
                            if(ends[85]>=biggest192291){
                              biggest192291=ends[85];
                            }
                            if(ends[88]>=biggest192291){
                              biggest192291=ends[88];
                            }
                            if(biggest192291 == 1){
                              active[77]=1;
                              ends[77]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[77]=1;
                            ends[77]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[77]=1;
                          ends[77]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 654, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 654, column: 11
                          ends[77]=2;
                          ;//sysj\conveyor_controller.sysj line: 654, column: 11
                          S138736=1;
                          thread192292(tdone,ends);
                          thread192293(tdone,ends);
                          thread192294(tdone,ends);
                          thread192298(tdone,ends);
                          int biggest192302 = 0;
                          if(ends[78]>=biggest192302){
                            biggest192302=ends[78];
                          }
                          if(ends[84]>=biggest192302){
                            biggest192302=ends[84];
                          }
                          if(ends[85]>=biggest192302){
                            biggest192302=ends[85];
                          }
                          if(ends[88]>=biggest192302){
                            biggest192302=ends[88];
                          }
                          if(biggest192302 == 1){
                            active[77]=1;
                            ends[77]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[77]=1;
                          ends[77]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S132980=1;
                  S132980=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 654, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 654, column: 11
                    S132980=1;
                    active[77]=1;
                    ends[77]=1;
                    break RUN;
                  }
                  else {
                    S132975=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 654, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 654, column: 11
                      S132975=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 654, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 654, column: 11
                        ends[77]=2;
                        ;//sysj\conveyor_controller.sysj line: 654, column: 11
                        S138736=1;
                        thread192303(tdone,ends);
                        thread192304(tdone,ends);
                        thread192305(tdone,ends);
                        thread192309(tdone,ends);
                        int biggest192313 = 0;
                        if(ends[78]>=biggest192313){
                          biggest192313=ends[78];
                        }
                        if(ends[84]>=biggest192313){
                          biggest192313=ends[84];
                        }
                        if(ends[85]>=biggest192313){
                          biggest192313=ends[85];
                        }
                        if(ends[88]>=biggest192313){
                          biggest192313=ends[88];
                        }
                        if(biggest192313 == 1){
                          active[77]=1;
                          ends[77]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[77]=1;
                        ends[77]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[77]=1;
                      ends[77]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread192314(tdone,ends);
              thread192329(tdone,ends);
              thread192330(tdone,ends);
              thread192337(tdone,ends);
              int biggest192344 = 0;
              if(ends[78]>=biggest192344){
                biggest192344=ends[78];
              }
              if(ends[84]>=biggest192344){
                biggest192344=ends[84];
              }
              if(ends[85]>=biggest192344){
                biggest192344=ends[85];
              }
              if(ends[88]>=biggest192344){
                biggest192344=ends[88];
              }
              if(biggest192344 == 1){
                active[77]=1;
                ends[77]=1;
                break RUN;
              }
              //FINXME code
              if(biggest192344 == 0){
                S138737=0;
                active[77]=0;
                ends[77]=0;
                S138737=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos4_77 = new Signal();
    done_77 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[77] != 0){
      int index = 77;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[77]!=0 || suspended[77]!=0 || active[77]!=1);
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
      bottleAtPos4_77.setpreclear();
      done_77.setpreclear();
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
      bottleAtPos4_77.setClear();
      done_77.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[77]!=0 || suspended[77]!=0 || active[77]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[77] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
