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
  private Signal bottleAtPos4_78;
  private Signal done_78;
  private int S138637 = 1;
  private int S138636 = 1;
  private int S132880 = 1;
  private int S132875 = 1;
  private int S134177 = 1;
  private int S132898 = 1;
  private int S132905 = 1;
  private int S132900 = 1;
  private int S132967 = 1;
  private int S133002 = 1;
  private int S132969 = 1;
  private int S132974 = 1;
  private int S132982 = 1;
  private int S132985 = 1;
  private int S133054 = 1;
  private int S133049 = 1;
  private int S133105 = 1;
  private int S134260 = 1;
  private int S134204 = 1;
  private int S134184 = 1;
  private int S134179 = 1;
  private int S134295 = 1;
  private int S134271 = 1;
  private int S134265 = 1;
  private int S134268 = 1;
  private int S134330 = 1;
  private int S134306 = 1;
  private int S134300 = 1;
  private int S134303 = 1;
  
  private int[] ends = new int[105];
  private int[] tdone = new int[105];
  
  public void thread192247(int [] tdone, int [] ends){
        S134303=1;
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192246(int [] tdone, int [] ends){
        S134300=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 763, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192244(int [] tdone, int [] ends){
        switch(S134303){
      case 0 : 
        active[91]=0;
        ends[91]=0;
        tdone[91]=1;
        break;
      
      case 1 : 
        if(done_78.getprestatus()){//sysj\conveyor_controller.sysj line: 767, column: 36
          ends[91]=2;
          tdone[91]=1;
        }
        else {
          active[91]=1;
          ends[91]=1;
          tdone[91]=1;
        }
        break;
      
    }
  }

  public void thread192243(int [] tdone, int [] ends){
        switch(S134300){
      case 0 : 
        active[90]=0;
        ends[90]=0;
        tdone[90]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 763, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[90]=1;
        ends[90]=1;
        tdone[90]=1;
        break;
      
    }
  }

  public void thread192242(int [] tdone, int [] ends){
        switch(S134330){
      case 0 : 
        active[89]=0;
        ends[89]=0;
        tdone[89]=1;
        break;
      
      case 1 : 
        switch(S134306){
          case 0 : 
            thread192243(tdone,ends);
            thread192244(tdone,ends);
            int biggest192245 = 0;
            if(ends[90]>=biggest192245){
              biggest192245=ends[90];
            }
            if(ends[91]>=biggest192245){
              biggest192245=ends[91];
            }
            if(biggest192245 == 1){
              active[89]=1;
              ends[89]=1;
              tdone[89]=1;
            }
            if(biggest192245 == 2){
              ends[89]=2;
              ;//sysj\conveyor_controller.sysj line: 761, column: 19
              S134306=1;
              active[89]=1;
              ends[89]=1;
              tdone[89]=1;
            }
            //FINXME code
            if(biggest192245 == 0){
              S134306=1;
              active[89]=1;
              ends[89]=1;
              tdone[89]=1;
            }
            break;
          
          case 1 : 
            S134306=1;
            S134306=0;
            if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 760, column: 27
              thread192246(tdone,ends);
              thread192247(tdone,ends);
              int biggest192248 = 0;
              if(ends[90]>=biggest192248){
                biggest192248=ends[90];
              }
              if(ends[91]>=biggest192248){
                biggest192248=ends[91];
              }
              if(biggest192248 == 1){
                active[89]=1;
                ends[89]=1;
                tdone[89]=1;
              }
            }
            else {
              S134306=1;
              active[89]=1;
              ends[89]=1;
              tdone[89]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192240(int [] tdone, int [] ends){
        S134268=1;
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192239(int [] tdone, int [] ends){
        S134265=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 744, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192237(int [] tdone, int [] ends){
        switch(S134268){
      case 0 : 
        active[88]=0;
        ends[88]=0;
        tdone[88]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 748, column: 37
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

  public void thread192236(int [] tdone, int [] ends){
        switch(S134265){
      case 0 : 
        active[87]=0;
        ends[87]=0;
        tdone[87]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 744, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[87]=1;
        ends[87]=1;
        tdone[87]=1;
        break;
      
    }
  }

  public void thread192235(int [] tdone, int [] ends){
        switch(S134295){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        switch(S134271){
          case 0 : 
            thread192236(tdone,ends);
            thread192237(tdone,ends);
            int biggest192238 = 0;
            if(ends[87]>=biggest192238){
              biggest192238=ends[87];
            }
            if(ends[88]>=biggest192238){
              biggest192238=ends[88];
            }
            if(biggest192238 == 1){
              active[86]=1;
              ends[86]=1;
              tdone[86]=1;
            }
            if(biggest192238 == 2){
              ends[86]=2;
              ;//sysj\conveyor_controller.sysj line: 742, column: 20
              S134271=1;
              active[86]=1;
              ends[86]=1;
              tdone[86]=1;
            }
            //FINXME code
            if(biggest192238 == 0){
              S134271=1;
              active[86]=1;
              ends[86]=1;
              tdone[86]=1;
            }
            break;
          
          case 1 : 
            S134271=1;
            S134271=0;
            if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 741, column: 39
              thread192239(tdone,ends);
              thread192240(tdone,ends);
              int biggest192241 = 0;
              if(ends[87]>=biggest192241){
                biggest192241=ends[87];
              }
              if(ends[88]>=biggest192241){
                biggest192241=ends[88];
              }
              if(biggest192241 == 1){
                active[86]=1;
                ends[86]=1;
                tdone[86]=1;
              }
            }
            else {
              S134271=1;
              active[86]=1;
              ends[86]=1;
              tdone[86]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192234(int [] tdone, int [] ends){
        switch(S134260){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        switch(S134204){
          case 0 : 
            switch(S134184){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
                  S134184=1;
                  active[85]=1;
                  ends[85]=1;
                  tdone[85]=1;
                }
                else {
                  switch(S134179){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
                        S134179=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
                          ends[85]=2;
                          ;//sysj\conveyor_controller.sysj line: 728, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
                            bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
                            currsigs.addElement(bottleAtPos4_78);
                            S134204=1;
                            active[85]=1;
                            ends[85]=1;
                            tdone[85]=1;
                          }
                          else {
                            done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
                            currsigs.addElement(done_78);
                            S134204=1;
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
                      }
                      else {
                        active[85]=1;
                        ends[85]=1;
                        tdone[85]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
                        ends[85]=2;
                        ;//sysj\conveyor_controller.sysj line: 728, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
                          bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
                          currsigs.addElement(bottleAtPos4_78);
                          S134204=1;
                          active[85]=1;
                          ends[85]=1;
                          tdone[85]=1;
                        }
                        else {
                          done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
                          currsigs.addElement(done_78);
                          S134204=1;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S134184=1;
                S134184=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
                  S134184=1;
                  active[85]=1;
                  ends[85]=1;
                  tdone[85]=1;
                }
                else {
                  S134179=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
                    S134179=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
                      ends[85]=2;
                      ;//sysj\conveyor_controller.sysj line: 728, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
                        bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
                        currsigs.addElement(bottleAtPos4_78);
                        S134204=1;
                        active[85]=1;
                        ends[85]=1;
                        tdone[85]=1;
                      }
                      else {
                        done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
                        currsigs.addElement(done_78);
                        S134204=1;
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
                  }
                  else {
                    active[85]=1;
                    ends[85]=1;
                    tdone[85]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S134204=1;
            S134204=0;
            S134184=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
              S134184=1;
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            else {
              S134179=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
                S134179=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
                  ends[85]=2;
                  ;//sysj\conveyor_controller.sysj line: 728, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
                    bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
                    currsigs.addElement(bottleAtPos4_78);
                    S134204=1;
                    active[85]=1;
                    ends[85]=1;
                    tdone[85]=1;
                  }
                  else {
                    done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
                    currsigs.addElement(done_78);
                    S134204=1;
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
              }
              else {
                active[85]=1;
                ends[85]=1;
                tdone[85]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192231(int [] tdone, int [] ends){
        switch(S132985){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 698, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 699, column: 16
          ends[84]=2;
          tdone[84]=1;
        }
        else {
          active[84]=1;
          ends[84]=1;
          tdone[84]=1;
        }
        break;
      
    }
  }

  public void thread192230(int [] tdone, int [] ends){
        switch(S132982){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 694, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[83]=1;
        ends[83]=1;
        tdone[83]=1;
        break;
      
    }
  }

  public void thread192229(int [] tdone, int [] ends){
        switch(S132974){
      case 0 : 
        active[82]=0;
        ends[82]=0;
        tdone[82]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 689, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[82]=1;
        ends[82]=1;
        tdone[82]=1;
        break;
      
    }
  }

  public void thread192227(int [] tdone, int [] ends){
        S132985=1;
    active[84]=1;
    ends[84]=1;
    tdone[84]=1;
  }

  public void thread192226(int [] tdone, int [] ends){
        S132982=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 693, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 694, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread192225(int [] tdone, int [] ends){
        S132974=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 689, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread192224(int [] tdone, int [] ends){
        switch(S133002){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        switch(S132969){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 686, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 687, column: 15
              S132969=1;
              thread192225(tdone,ends);
              thread192226(tdone,ends);
              thread192227(tdone,ends);
              int biggest192228 = 0;
              if(ends[82]>=biggest192228){
                biggest192228=ends[82];
              }
              if(ends[83]>=biggest192228){
                biggest192228=ends[83];
              }
              if(ends[84]>=biggest192228){
                biggest192228=ends[84];
              }
              if(biggest192228 == 1){
                active[81]=1;
                ends[81]=1;
                tdone[81]=1;
              }
            }
            else {
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            break;
          
          case 1 : 
            thread192229(tdone,ends);
            thread192230(tdone,ends);
            thread192231(tdone,ends);
            int biggest192232 = 0;
            if(ends[82]>=biggest192232){
              biggest192232=ends[82];
            }
            if(ends[83]>=biggest192232){
              biggest192232=ends[83];
            }
            if(ends[84]>=biggest192232){
              biggest192232=ends[84];
            }
            if(biggest192232 == 1){
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            if(biggest192232 == 2){
              ends[81]=2;
              tdone[81]=1;
            }
            //FINXME code
            if(biggest192232 == 0){
              S133002=0;
              active[81]=0;
              ends[81]=0;
              tdone[81]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192223(int [] tdone, int [] ends){
        switch(S132967){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 682, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[80]=1;
        ends[80]=1;
        tdone[80]=1;
        break;
      
    }
  }

  public void thread192221(int [] tdone, int [] ends){
        S133002=1;
    S132969=0;
    active[81]=1;
    ends[81]=1;
    tdone[81]=1;
  }

  public void thread192220(int [] tdone, int [] ends){
        S132967=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 682, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread192219(int [] tdone, int [] ends){
        switch(S134177){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        switch(S132898){
          case 0 : 
            if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 661, column: 19
              S132898=1;
              S132905=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                S132905=1;
                active[79]=1;
                ends[79]=1;
                tdone[79]=1;
              }
              else {
                S132900=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 662, column: 13
                  S132900=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                    ends[79]=2;
                    ;//sysj\conveyor_controller.sysj line: 662, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 663, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 664, column: 13
                    S132898=2;
                    active[79]=1;
                    ends[79]=1;
                    tdone[79]=1;
                  }
                  else {
                    active[79]=1;
                    ends[79]=1;
                    tdone[79]=1;
                  }
                }
                else {
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
              }
            }
            else {
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            break;
          
          case 1 : 
            switch(S132905){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                  S132905=1;
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
                else {
                  switch(S132900){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 662, column: 13
                        S132900=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                          ends[79]=2;
                          ;//sysj\conveyor_controller.sysj line: 662, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 663, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 664, column: 13
                          S132898=2;
                          active[79]=1;
                          ends[79]=1;
                          tdone[79]=1;
                        }
                        else {
                          active[79]=1;
                          ends[79]=1;
                          tdone[79]=1;
                        }
                      }
                      else {
                        active[79]=1;
                        ends[79]=1;
                        tdone[79]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                        ends[79]=2;
                        ;//sysj\conveyor_controller.sysj line: 662, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 663, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 664, column: 13
                        S132898=2;
                        active[79]=1;
                        ends[79]=1;
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
                break;
              
              case 1 : 
                S132905=1;
                S132905=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                  S132905=1;
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
                else {
                  S132900=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 662, column: 13
                    S132900=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                      ends[79]=2;
                      ;//sysj\conveyor_controller.sysj line: 662, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 663, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 664, column: 13
                      S132898=2;
                      active[79]=1;
                      ends[79]=1;
                      tdone[79]=1;
                    }
                    else {
                      active[79]=1;
                      ends[79]=1;
                      tdone[79]=1;
                    }
                  }
                  else {
                    active[79]=1;
                    ends[79]=1;
                    tdone[79]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 665, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 669, column: 13
              S132898=3;
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            else {
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            break;
          
          case 3 : 
            S132898=3;
            S132898=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 675, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 676, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[79]=1;
            ends[79]=1;
            tdone[79]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 673, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 678, column: 13
              S132898=5;
              thread192220(tdone,ends);
              thread192221(tdone,ends);
              int biggest192222 = 0;
              if(ends[80]>=biggest192222){
                biggest192222=ends[80];
              }
              if(ends[81]>=biggest192222){
                biggest192222=ends[81];
              }
              if(biggest192222 == 1){
                active[79]=1;
                ends[79]=1;
                tdone[79]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 676, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            break;
          
          case 5 : 
            thread192223(tdone,ends);
            thread192224(tdone,ends);
            int biggest192233 = 0;
            if(ends[80]>=biggest192233){
              biggest192233=ends[80];
            }
            if(ends[81]>=biggest192233){
              biggest192233=ends[81];
            }
            if(biggest192233 == 1){
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            if(biggest192233 == 2){
              ends[79]=2;
              ;//sysj\conveyor_controller.sysj line: 681, column: 13
              S132898=6;
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            //FINXME code
            if(biggest192233 == 0){
              S132898=6;
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 705, column: 19
              S132898=7;
              S133054=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 707, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 707, column: 13
                S133054=1;
                active[79]=1;
                ends[79]=1;
                tdone[79]=1;
              }
              else {
                S133049=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 707, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 707, column: 13
                  S133049=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 707, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 707, column: 13
                    ends[79]=2;
                    ;//sysj\conveyor_controller.sysj line: 707, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 708, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 709, column: 13
                    S132898=8;
                    S133105=0;
                    active[79]=1;
                    ends[79]=1;
                    tdone[79]=1;
                  }
                  else {
                    active[79]=1;
                    ends[79]=1;
                    tdone[79]=1;
                  }
                }
                else {
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
              }
            }
            else {
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            break;
          
          case 7 : 
            switch(S133054){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 707, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 707, column: 13
                  S133054=1;
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
                else {
                  switch(S133049){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 707, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 707, column: 13
                        S133049=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 707, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 707, column: 13
                          ends[79]=2;
                          ;//sysj\conveyor_controller.sysj line: 707, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 708, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 709, column: 13
                          S132898=8;
                          S133105=0;
                          active[79]=1;
                          ends[79]=1;
                          tdone[79]=1;
                        }
                        else {
                          active[79]=1;
                          ends[79]=1;
                          tdone[79]=1;
                        }
                      }
                      else {
                        active[79]=1;
                        ends[79]=1;
                        tdone[79]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 707, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 707, column: 13
                        ends[79]=2;
                        ;//sysj\conveyor_controller.sysj line: 707, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 708, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 709, column: 13
                        S132898=8;
                        S133105=0;
                        active[79]=1;
                        ends[79]=1;
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
                break;
              
              case 1 : 
                S133054=1;
                S133054=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 707, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 707, column: 13
                  S133054=1;
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
                else {
                  S133049=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 707, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 707, column: 13
                    S133049=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 707, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 707, column: 13
                      ends[79]=2;
                      ;//sysj\conveyor_controller.sysj line: 707, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 708, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 709, column: 13
                      S132898=8;
                      S133105=0;
                      active[79]=1;
                      ends[79]=1;
                      tdone[79]=1;
                    }
                    else {
                      active[79]=1;
                      ends[79]=1;
                      tdone[79]=1;
                    }
                  }
                  else {
                    active[79]=1;
                    ends[79]=1;
                    tdone[79]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S133105){
              case 0 : 
                if(!bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 710, column: 29
                  S133105=1;
                  if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 712, column: 23
                    active[79]=1;
                    ends[79]=1;
                    tdone[79]=1;
                  }
                  else {
                    ends[79]=2;
                    ;//sysj\conveyor_controller.sysj line: 710, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 660, column: 13
                    S132898=0;
                    active[79]=1;
                    ends[79]=1;
                    tdone[79]=1;
                  }
                }
                else {
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 712, column: 23
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
                else {
                  ends[79]=2;
                  ;//sysj\conveyor_controller.sysj line: 710, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 660, column: 13
                  S132898=0;
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192216(int [] tdone, int [] ends){
        S134303=1;
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192215(int [] tdone, int [] ends){
        S134300=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 763, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192214(int [] tdone, int [] ends){
        S134330=1;
    S134306=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 760, column: 27
      thread192215(tdone,ends);
      thread192216(tdone,ends);
      int biggest192217 = 0;
      if(ends[90]>=biggest192217){
        biggest192217=ends[90];
      }
      if(ends[91]>=biggest192217){
        biggest192217=ends[91];
      }
      if(biggest192217 == 1){
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
      }
    }
    else {
      S134306=1;
      active[89]=1;
      ends[89]=1;
      tdone[89]=1;
    }
  }

  public void thread192212(int [] tdone, int [] ends){
        S134268=1;
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192211(int [] tdone, int [] ends){
        S134265=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 744, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192210(int [] tdone, int [] ends){
        S134295=1;
    S134271=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 741, column: 39
      thread192211(tdone,ends);
      thread192212(tdone,ends);
      int biggest192213 = 0;
      if(ends[87]>=biggest192213){
        biggest192213=ends[87];
      }
      if(ends[88]>=biggest192213){
        biggest192213=ends[88];
      }
      if(biggest192213 == 1){
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
      }
    }
    else {
      S134271=1;
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
  }

  public void thread192209(int [] tdone, int [] ends){
        S134260=1;
    S134204=0;
    S134184=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
      S134184=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
    else {
      S134179=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
        S134179=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
          ends[85]=2;
          ;//sysj\conveyor_controller.sysj line: 728, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
            bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
            currsigs.addElement(bottleAtPos4_78);
            S134204=1;
            active[85]=1;
            ends[85]=1;
            tdone[85]=1;
          }
          else {
            done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
            currsigs.addElement(done_78);
            S134204=1;
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
      }
      else {
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
      }
    }
  }

  public void thread192208(int [] tdone, int [] ends){
        S134177=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 660, column: 13
    S132898=0;
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread192205(int [] tdone, int [] ends){
        S134303=1;
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192204(int [] tdone, int [] ends){
        S134300=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 763, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192203(int [] tdone, int [] ends){
        S134330=1;
    S134306=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 760, column: 27
      thread192204(tdone,ends);
      thread192205(tdone,ends);
      int biggest192206 = 0;
      if(ends[90]>=biggest192206){
        biggest192206=ends[90];
      }
      if(ends[91]>=biggest192206){
        biggest192206=ends[91];
      }
      if(biggest192206 == 1){
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
      }
    }
    else {
      S134306=1;
      active[89]=1;
      ends[89]=1;
      tdone[89]=1;
    }
  }

  public void thread192201(int [] tdone, int [] ends){
        S134268=1;
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192200(int [] tdone, int [] ends){
        S134265=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 744, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192199(int [] tdone, int [] ends){
        S134295=1;
    S134271=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 741, column: 39
      thread192200(tdone,ends);
      thread192201(tdone,ends);
      int biggest192202 = 0;
      if(ends[87]>=biggest192202){
        biggest192202=ends[87];
      }
      if(ends[88]>=biggest192202){
        biggest192202=ends[88];
      }
      if(biggest192202 == 1){
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
      }
    }
    else {
      S134271=1;
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
  }

  public void thread192198(int [] tdone, int [] ends){
        S134260=1;
    S134204=0;
    S134184=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
      S134184=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
    else {
      S134179=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
        S134179=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
          ends[85]=2;
          ;//sysj\conveyor_controller.sysj line: 728, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
            bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
            currsigs.addElement(bottleAtPos4_78);
            S134204=1;
            active[85]=1;
            ends[85]=1;
            tdone[85]=1;
          }
          else {
            done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
            currsigs.addElement(done_78);
            S134204=1;
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
      }
      else {
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
      }
    }
  }

  public void thread192197(int [] tdone, int [] ends){
        S134177=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 660, column: 13
    S132898=0;
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread192194(int [] tdone, int [] ends){
        S134303=1;
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192193(int [] tdone, int [] ends){
        S134300=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 763, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192192(int [] tdone, int [] ends){
        S134330=1;
    S134306=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 760, column: 27
      thread192193(tdone,ends);
      thread192194(tdone,ends);
      int biggest192195 = 0;
      if(ends[90]>=biggest192195){
        biggest192195=ends[90];
      }
      if(ends[91]>=biggest192195){
        biggest192195=ends[91];
      }
      if(biggest192195 == 1){
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
      }
    }
    else {
      S134306=1;
      active[89]=1;
      ends[89]=1;
      tdone[89]=1;
    }
  }

  public void thread192190(int [] tdone, int [] ends){
        S134268=1;
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192189(int [] tdone, int [] ends){
        S134265=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 744, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192188(int [] tdone, int [] ends){
        S134295=1;
    S134271=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 741, column: 39
      thread192189(tdone,ends);
      thread192190(tdone,ends);
      int biggest192191 = 0;
      if(ends[87]>=biggest192191){
        biggest192191=ends[87];
      }
      if(ends[88]>=biggest192191){
        biggest192191=ends[88];
      }
      if(biggest192191 == 1){
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
      }
    }
    else {
      S134271=1;
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
  }

  public void thread192187(int [] tdone, int [] ends){
        S134260=1;
    S134204=0;
    S134184=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
      S134184=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
    else {
      S134179=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
        S134179=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
          ends[85]=2;
          ;//sysj\conveyor_controller.sysj line: 728, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
            bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
            currsigs.addElement(bottleAtPos4_78);
            S134204=1;
            active[85]=1;
            ends[85]=1;
            tdone[85]=1;
          }
          else {
            done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
            currsigs.addElement(done_78);
            S134204=1;
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
      }
      else {
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
      }
    }
  }

  public void thread192186(int [] tdone, int [] ends){
        S134177=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 660, column: 13
    S132898=0;
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread192183(int [] tdone, int [] ends){
        S134303=1;
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192182(int [] tdone, int [] ends){
        S134300=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 763, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192181(int [] tdone, int [] ends){
        S134330=1;
    S134306=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 760, column: 27
      thread192182(tdone,ends);
      thread192183(tdone,ends);
      int biggest192184 = 0;
      if(ends[90]>=biggest192184){
        biggest192184=ends[90];
      }
      if(ends[91]>=biggest192184){
        biggest192184=ends[91];
      }
      if(biggest192184 == 1){
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
      }
    }
    else {
      S134306=1;
      active[89]=1;
      ends[89]=1;
      tdone[89]=1;
    }
  }

  public void thread192179(int [] tdone, int [] ends){
        S134268=1;
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192178(int [] tdone, int [] ends){
        S134265=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 744, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192177(int [] tdone, int [] ends){
        S134295=1;
    S134271=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 741, column: 39
      thread192178(tdone,ends);
      thread192179(tdone,ends);
      int biggest192180 = 0;
      if(ends[87]>=biggest192180){
        biggest192180=ends[87];
      }
      if(ends[88]>=biggest192180){
        biggest192180=ends[88];
      }
      if(biggest192180 == 1){
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
      }
    }
    else {
      S134271=1;
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
  }

  public void thread192176(int [] tdone, int [] ends){
        S134260=1;
    S134204=0;
    S134184=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
      S134184=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
    else {
      S134179=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
        S134179=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
          ends[85]=2;
          ;//sysj\conveyor_controller.sysj line: 728, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
            bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
            currsigs.addElement(bottleAtPos4_78);
            S134204=1;
            active[85]=1;
            ends[85]=1;
            tdone[85]=1;
          }
          else {
            done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
            currsigs.addElement(done_78);
            S134204=1;
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
      }
      else {
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
      }
    }
  }

  public void thread192175(int [] tdone, int [] ends){
        S134177=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 660, column: 13
    S132898=0;
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S138637){
        case 0 : 
          S138637=0;
          break RUN;
        
        case 1 : 
          S138637=2;
          S138637=2;
          bottleAtPos4_78.setClear();//sysj\conveyor_controller.sysj line: 654, column: 11
          done_78.setClear();//sysj\conveyor_controller.sysj line: 654, column: 11
          S138636=0;
          S132880=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 655, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 655, column: 11
            S132880=1;
            active[78]=1;
            ends[78]=1;
            break RUN;
          }
          else {
            S132875=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 655, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 655, column: 11
              S132875=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 655, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 655, column: 11
                ends[78]=2;
                ;//sysj\conveyor_controller.sysj line: 655, column: 11
                S138636=1;
                thread192175(tdone,ends);
                thread192176(tdone,ends);
                thread192177(tdone,ends);
                thread192181(tdone,ends);
                int biggest192185 = 0;
                if(ends[79]>=biggest192185){
                  biggest192185=ends[79];
                }
                if(ends[85]>=biggest192185){
                  biggest192185=ends[85];
                }
                if(ends[86]>=biggest192185){
                  biggest192185=ends[86];
                }
                if(ends[89]>=biggest192185){
                  biggest192185=ends[89];
                }
                if(biggest192185 == 1){
                  active[78]=1;
                  ends[78]=1;
                  break RUN;
                }
              }
              else {
                active[78]=1;
                ends[78]=1;
                break RUN;
              }
            }
            else {
              active[78]=1;
              ends[78]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_78.setClear();//sysj\conveyor_controller.sysj line: 654, column: 11
          done_78.setClear();//sysj\conveyor_controller.sysj line: 654, column: 11
          switch(S138636){
            case 0 : 
              switch(S132880){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 655, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 655, column: 11
                    S132880=1;
                    active[78]=1;
                    ends[78]=1;
                    break RUN;
                  }
                  else {
                    switch(S132875){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 655, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 655, column: 11
                          S132875=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 655, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 655, column: 11
                            ends[78]=2;
                            ;//sysj\conveyor_controller.sysj line: 655, column: 11
                            S138636=1;
                            thread192186(tdone,ends);
                            thread192187(tdone,ends);
                            thread192188(tdone,ends);
                            thread192192(tdone,ends);
                            int biggest192196 = 0;
                            if(ends[79]>=biggest192196){
                              biggest192196=ends[79];
                            }
                            if(ends[85]>=biggest192196){
                              biggest192196=ends[85];
                            }
                            if(ends[86]>=biggest192196){
                              biggest192196=ends[86];
                            }
                            if(ends[89]>=biggest192196){
                              biggest192196=ends[89];
                            }
                            if(biggest192196 == 1){
                              active[78]=1;
                              ends[78]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[78]=1;
                            ends[78]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[78]=1;
                          ends[78]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 655, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 655, column: 11
                          ends[78]=2;
                          ;//sysj\conveyor_controller.sysj line: 655, column: 11
                          S138636=1;
                          thread192197(tdone,ends);
                          thread192198(tdone,ends);
                          thread192199(tdone,ends);
                          thread192203(tdone,ends);
                          int biggest192207 = 0;
                          if(ends[79]>=biggest192207){
                            biggest192207=ends[79];
                          }
                          if(ends[85]>=biggest192207){
                            biggest192207=ends[85];
                          }
                          if(ends[86]>=biggest192207){
                            biggest192207=ends[86];
                          }
                          if(ends[89]>=biggest192207){
                            biggest192207=ends[89];
                          }
                          if(biggest192207 == 1){
                            active[78]=1;
                            ends[78]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[78]=1;
                          ends[78]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S132880=1;
                  S132880=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 655, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 655, column: 11
                    S132880=1;
                    active[78]=1;
                    ends[78]=1;
                    break RUN;
                  }
                  else {
                    S132875=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 655, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 655, column: 11
                      S132875=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 655, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 655, column: 11
                        ends[78]=2;
                        ;//sysj\conveyor_controller.sysj line: 655, column: 11
                        S138636=1;
                        thread192208(tdone,ends);
                        thread192209(tdone,ends);
                        thread192210(tdone,ends);
                        thread192214(tdone,ends);
                        int biggest192218 = 0;
                        if(ends[79]>=biggest192218){
                          biggest192218=ends[79];
                        }
                        if(ends[85]>=biggest192218){
                          biggest192218=ends[85];
                        }
                        if(ends[86]>=biggest192218){
                          biggest192218=ends[86];
                        }
                        if(ends[89]>=biggest192218){
                          biggest192218=ends[89];
                        }
                        if(biggest192218 == 1){
                          active[78]=1;
                          ends[78]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[78]=1;
                        ends[78]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[78]=1;
                      ends[78]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread192219(tdone,ends);
              thread192234(tdone,ends);
              thread192235(tdone,ends);
              thread192242(tdone,ends);
              int biggest192249 = 0;
              if(ends[79]>=biggest192249){
                biggest192249=ends[79];
              }
              if(ends[85]>=biggest192249){
                biggest192249=ends[85];
              }
              if(ends[86]>=biggest192249){
                biggest192249=ends[86];
              }
              if(ends[89]>=biggest192249){
                biggest192249=ends[89];
              }
              if(biggest192249 == 1){
                active[78]=1;
                ends[78]=1;
                break RUN;
              }
              //FINXME code
              if(biggest192249 == 0){
                S138637=0;
                active[78]=0;
                ends[78]=0;
                S138637=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos4_78 = new Signal();
    done_78 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[78] != 0){
      int index = 78;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[78]!=0 || suspended[78]!=0 || active[78]!=1);
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
      bottleAtPos4_78.setpreclear();
      done_78.setpreclear();
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
      bottleAtPos4_78.setClear();
      done_78.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[78]!=0 || suspended[78]!=0 || active[78]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[78] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
