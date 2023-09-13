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
  private int S138757 = 1;
  private int S138756 = 1;
  private int S133000 = 1;
  private int S132995 = 1;
  private int S134297 = 1;
  private int S133018 = 1;
  private int S133025 = 1;
  private int S133020 = 1;
  private int S133087 = 1;
  private int S133122 = 1;
  private int S133089 = 1;
  private int S133094 = 1;
  private int S133102 = 1;
  private int S133105 = 1;
  private int S133174 = 1;
  private int S133169 = 1;
  private int S133225 = 1;
  private int S134380 = 1;
  private int S134324 = 1;
  private int S134304 = 1;
  private int S134299 = 1;
  private int S134415 = 1;
  private int S134391 = 1;
  private int S134385 = 1;
  private int S134388 = 1;
  private int S134450 = 1;
  private int S134426 = 1;
  private int S134420 = 1;
  private int S134423 = 1;
  
  private int[] ends = new int[105];
  private int[] tdone = new int[105];
  
  public void thread192367(int [] tdone, int [] ends){
        S134423=1;
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192366(int [] tdone, int [] ends){
        S134420=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 763, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192364(int [] tdone, int [] ends){
        switch(S134423){
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

  public void thread192363(int [] tdone, int [] ends){
        switch(S134420){
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

  public void thread192362(int [] tdone, int [] ends){
        switch(S134450){
      case 0 : 
        active[89]=0;
        ends[89]=0;
        tdone[89]=1;
        break;
      
      case 1 : 
        switch(S134426){
          case 0 : 
            thread192363(tdone,ends);
            thread192364(tdone,ends);
            int biggest192365 = 0;
            if(ends[90]>=biggest192365){
              biggest192365=ends[90];
            }
            if(ends[91]>=biggest192365){
              biggest192365=ends[91];
            }
            if(biggest192365 == 1){
              active[89]=1;
              ends[89]=1;
              tdone[89]=1;
            }
            if(biggest192365 == 2){
              ends[89]=2;
              ;//sysj\conveyor_controller.sysj line: 761, column: 19
              S134426=1;
              active[89]=1;
              ends[89]=1;
              tdone[89]=1;
            }
            //FINXME code
            if(biggest192365 == 0){
              S134426=1;
              active[89]=1;
              ends[89]=1;
              tdone[89]=1;
            }
            break;
          
          case 1 : 
            S134426=1;
            S134426=0;
            if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 760, column: 27
              thread192366(tdone,ends);
              thread192367(tdone,ends);
              int biggest192368 = 0;
              if(ends[90]>=biggest192368){
                biggest192368=ends[90];
              }
              if(ends[91]>=biggest192368){
                biggest192368=ends[91];
              }
              if(biggest192368 == 1){
                active[89]=1;
                ends[89]=1;
                tdone[89]=1;
              }
            }
            else {
              S134426=1;
              active[89]=1;
              ends[89]=1;
              tdone[89]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192360(int [] tdone, int [] ends){
        S134388=1;
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192359(int [] tdone, int [] ends){
        S134385=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 744, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192357(int [] tdone, int [] ends){
        switch(S134388){
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

  public void thread192356(int [] tdone, int [] ends){
        switch(S134385){
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

  public void thread192355(int [] tdone, int [] ends){
        switch(S134415){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        switch(S134391){
          case 0 : 
            thread192356(tdone,ends);
            thread192357(tdone,ends);
            int biggest192358 = 0;
            if(ends[87]>=biggest192358){
              biggest192358=ends[87];
            }
            if(ends[88]>=biggest192358){
              biggest192358=ends[88];
            }
            if(biggest192358 == 1){
              active[86]=1;
              ends[86]=1;
              tdone[86]=1;
            }
            if(biggest192358 == 2){
              ends[86]=2;
              ;//sysj\conveyor_controller.sysj line: 742, column: 20
              S134391=1;
              active[86]=1;
              ends[86]=1;
              tdone[86]=1;
            }
            //FINXME code
            if(biggest192358 == 0){
              S134391=1;
              active[86]=1;
              ends[86]=1;
              tdone[86]=1;
            }
            break;
          
          case 1 : 
            S134391=1;
            S134391=0;
            if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 741, column: 39
              thread192359(tdone,ends);
              thread192360(tdone,ends);
              int biggest192361 = 0;
              if(ends[87]>=biggest192361){
                biggest192361=ends[87];
              }
              if(ends[88]>=biggest192361){
                biggest192361=ends[88];
              }
              if(biggest192361 == 1){
                active[86]=1;
                ends[86]=1;
                tdone[86]=1;
              }
            }
            else {
              S134391=1;
              active[86]=1;
              ends[86]=1;
              tdone[86]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192354(int [] tdone, int [] ends){
        switch(S134380){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        switch(S134324){
          case 0 : 
            switch(S134304){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
                  S134304=1;
                  active[85]=1;
                  ends[85]=1;
                  tdone[85]=1;
                }
                else {
                  switch(S134299){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
                        S134299=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
                          ends[85]=2;
                          ;//sysj\conveyor_controller.sysj line: 728, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
                            bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
                            currsigs.addElement(bottleAtPos4_78);
                            S134324=1;
                            active[85]=1;
                            ends[85]=1;
                            tdone[85]=1;
                          }
                          else {
                            done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
                            currsigs.addElement(done_78);
                            S134324=1;
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
                          S134324=1;
                          active[85]=1;
                          ends[85]=1;
                          tdone[85]=1;
                        }
                        else {
                          done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
                          currsigs.addElement(done_78);
                          S134324=1;
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
                S134304=1;
                S134304=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
                  S134304=1;
                  active[85]=1;
                  ends[85]=1;
                  tdone[85]=1;
                }
                else {
                  S134299=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
                    S134299=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
                      ends[85]=2;
                      ;//sysj\conveyor_controller.sysj line: 728, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
                        bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
                        currsigs.addElement(bottleAtPos4_78);
                        S134324=1;
                        active[85]=1;
                        ends[85]=1;
                        tdone[85]=1;
                      }
                      else {
                        done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
                        currsigs.addElement(done_78);
                        S134324=1;
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
            S134324=1;
            S134324=0;
            S134304=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
              S134304=1;
              active[85]=1;
              ends[85]=1;
              tdone[85]=1;
            }
            else {
              S134299=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
                S134299=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
                  ends[85]=2;
                  ;//sysj\conveyor_controller.sysj line: 728, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
                    bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
                    currsigs.addElement(bottleAtPos4_78);
                    S134324=1;
                    active[85]=1;
                    ends[85]=1;
                    tdone[85]=1;
                  }
                  else {
                    done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
                    currsigs.addElement(done_78);
                    S134324=1;
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

  public void thread192351(int [] tdone, int [] ends){
        switch(S133105){
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

  public void thread192350(int [] tdone, int [] ends){
        switch(S133102){
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

  public void thread192349(int [] tdone, int [] ends){
        switch(S133094){
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

  public void thread192347(int [] tdone, int [] ends){
        S133105=1;
    active[84]=1;
    ends[84]=1;
    tdone[84]=1;
  }

  public void thread192346(int [] tdone, int [] ends){
        S133102=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 693, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 694, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread192345(int [] tdone, int [] ends){
        S133094=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 689, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread192344(int [] tdone, int [] ends){
        switch(S133122){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        switch(S133089){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 686, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 687, column: 15
              S133089=1;
              thread192345(tdone,ends);
              thread192346(tdone,ends);
              thread192347(tdone,ends);
              int biggest192348 = 0;
              if(ends[82]>=biggest192348){
                biggest192348=ends[82];
              }
              if(ends[83]>=biggest192348){
                biggest192348=ends[83];
              }
              if(ends[84]>=biggest192348){
                biggest192348=ends[84];
              }
              if(biggest192348 == 1){
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
            thread192349(tdone,ends);
            thread192350(tdone,ends);
            thread192351(tdone,ends);
            int biggest192352 = 0;
            if(ends[82]>=biggest192352){
              biggest192352=ends[82];
            }
            if(ends[83]>=biggest192352){
              biggest192352=ends[83];
            }
            if(ends[84]>=biggest192352){
              biggest192352=ends[84];
            }
            if(biggest192352 == 1){
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            if(biggest192352 == 2){
              ends[81]=2;
              tdone[81]=1;
            }
            //FINXME code
            if(biggest192352 == 0){
              S133122=0;
              active[81]=0;
              ends[81]=0;
              tdone[81]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192343(int [] tdone, int [] ends){
        switch(S133087){
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

  public void thread192341(int [] tdone, int [] ends){
        S133122=1;
    S133089=0;
    active[81]=1;
    ends[81]=1;
    tdone[81]=1;
  }

  public void thread192340(int [] tdone, int [] ends){
        S133087=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 682, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread192339(int [] tdone, int [] ends){
        switch(S134297){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        switch(S133018){
          case 0 : 
            if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 661, column: 19
              S133018=1;
              S133025=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                S133025=1;
                active[79]=1;
                ends[79]=1;
                tdone[79]=1;
              }
              else {
                S133020=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 662, column: 13
                  S133020=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                    ends[79]=2;
                    ;//sysj\conveyor_controller.sysj line: 662, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 663, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 664, column: 13
                    S133018=2;
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
            switch(S133025){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                  S133025=1;
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
                else {
                  switch(S133020){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 662, column: 13
                        S133020=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                          ends[79]=2;
                          ;//sysj\conveyor_controller.sysj line: 662, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 663, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 664, column: 13
                          S133018=2;
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
                        S133018=2;
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
                S133025=1;
                S133025=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                  S133025=1;
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
                else {
                  S133020=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 662, column: 13
                    S133020=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 662, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                      ends[79]=2;
                      ;//sysj\conveyor_controller.sysj line: 662, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 663, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 664, column: 13
                      S133018=2;
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
              S133018=3;
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
            S133018=3;
            S133018=4;
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
              S133018=5;
              thread192340(tdone,ends);
              thread192341(tdone,ends);
              int biggest192342 = 0;
              if(ends[80]>=biggest192342){
                biggest192342=ends[80];
              }
              if(ends[81]>=biggest192342){
                biggest192342=ends[81];
              }
              if(biggest192342 == 1){
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
            thread192343(tdone,ends);
            thread192344(tdone,ends);
            int biggest192353 = 0;
            if(ends[80]>=biggest192353){
              biggest192353=ends[80];
            }
            if(ends[81]>=biggest192353){
              biggest192353=ends[81];
            }
            if(biggest192353 == 1){
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            if(biggest192353 == 2){
              ends[79]=2;
              ;//sysj\conveyor_controller.sysj line: 681, column: 13
              S133018=6;
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            //FINXME code
            if(biggest192353 == 0){
              S133018=6;
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 705, column: 19
              S133018=7;
              S133174=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 707, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 707, column: 13
                S133174=1;
                active[79]=1;
                ends[79]=1;
                tdone[79]=1;
              }
              else {
                S133169=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 707, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 707, column: 13
                  S133169=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 707, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 707, column: 13
                    ends[79]=2;
                    ;//sysj\conveyor_controller.sysj line: 707, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 708, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 709, column: 13
                    S133018=8;
                    S133225=0;
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
            switch(S133174){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 707, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 707, column: 13
                  S133174=1;
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
                else {
                  switch(S133169){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 707, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 707, column: 13
                        S133169=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 707, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 707, column: 13
                          ends[79]=2;
                          ;//sysj\conveyor_controller.sysj line: 707, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 708, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 709, column: 13
                          S133018=8;
                          S133225=0;
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
                        S133018=8;
                        S133225=0;
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
                S133174=1;
                S133174=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 707, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 707, column: 13
                  S133174=1;
                  active[79]=1;
                  ends[79]=1;
                  tdone[79]=1;
                }
                else {
                  S133169=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 707, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 707, column: 13
                    S133169=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 707, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 707, column: 13
                      ends[79]=2;
                      ;//sysj\conveyor_controller.sysj line: 707, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 708, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 709, column: 13
                      S133018=8;
                      S133225=0;
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
            switch(S133225){
              case 0 : 
                if(!bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 710, column: 29
                  S133225=1;
                  if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 712, column: 23
                    active[79]=1;
                    ends[79]=1;
                    tdone[79]=1;
                  }
                  else {
                    ends[79]=2;
                    ;//sysj\conveyor_controller.sysj line: 710, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 660, column: 13
                    S133018=0;
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
                  S133018=0;
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

  public void thread192336(int [] tdone, int [] ends){
        S134423=1;
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192335(int [] tdone, int [] ends){
        S134420=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 763, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192334(int [] tdone, int [] ends){
        S134450=1;
    S134426=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 760, column: 27
      thread192335(tdone,ends);
      thread192336(tdone,ends);
      int biggest192337 = 0;
      if(ends[90]>=biggest192337){
        biggest192337=ends[90];
      }
      if(ends[91]>=biggest192337){
        biggest192337=ends[91];
      }
      if(biggest192337 == 1){
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
      }
    }
    else {
      S134426=1;
      active[89]=1;
      ends[89]=1;
      tdone[89]=1;
    }
  }

  public void thread192332(int [] tdone, int [] ends){
        S134388=1;
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192331(int [] tdone, int [] ends){
        S134385=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 744, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192330(int [] tdone, int [] ends){
        S134415=1;
    S134391=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 741, column: 39
      thread192331(tdone,ends);
      thread192332(tdone,ends);
      int biggest192333 = 0;
      if(ends[87]>=biggest192333){
        biggest192333=ends[87];
      }
      if(ends[88]>=biggest192333){
        biggest192333=ends[88];
      }
      if(biggest192333 == 1){
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
      }
    }
    else {
      S134391=1;
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
  }

  public void thread192329(int [] tdone, int [] ends){
        S134380=1;
    S134324=0;
    S134304=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
      S134304=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
    else {
      S134299=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
        S134299=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
          ends[85]=2;
          ;//sysj\conveyor_controller.sysj line: 728, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
            bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
            currsigs.addElement(bottleAtPos4_78);
            S134324=1;
            active[85]=1;
            ends[85]=1;
            tdone[85]=1;
          }
          else {
            done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
            currsigs.addElement(done_78);
            S134324=1;
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

  public void thread192328(int [] tdone, int [] ends){
        S134297=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 660, column: 13
    S133018=0;
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread192325(int [] tdone, int [] ends){
        S134423=1;
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192324(int [] tdone, int [] ends){
        S134420=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 763, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192323(int [] tdone, int [] ends){
        S134450=1;
    S134426=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 760, column: 27
      thread192324(tdone,ends);
      thread192325(tdone,ends);
      int biggest192326 = 0;
      if(ends[90]>=biggest192326){
        biggest192326=ends[90];
      }
      if(ends[91]>=biggest192326){
        biggest192326=ends[91];
      }
      if(biggest192326 == 1){
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
      }
    }
    else {
      S134426=1;
      active[89]=1;
      ends[89]=1;
      tdone[89]=1;
    }
  }

  public void thread192321(int [] tdone, int [] ends){
        S134388=1;
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192320(int [] tdone, int [] ends){
        S134385=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 744, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192319(int [] tdone, int [] ends){
        S134415=1;
    S134391=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 741, column: 39
      thread192320(tdone,ends);
      thread192321(tdone,ends);
      int biggest192322 = 0;
      if(ends[87]>=biggest192322){
        biggest192322=ends[87];
      }
      if(ends[88]>=biggest192322){
        biggest192322=ends[88];
      }
      if(biggest192322 == 1){
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
      }
    }
    else {
      S134391=1;
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
  }

  public void thread192318(int [] tdone, int [] ends){
        S134380=1;
    S134324=0;
    S134304=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
      S134304=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
    else {
      S134299=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
        S134299=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
          ends[85]=2;
          ;//sysj\conveyor_controller.sysj line: 728, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
            bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
            currsigs.addElement(bottleAtPos4_78);
            S134324=1;
            active[85]=1;
            ends[85]=1;
            tdone[85]=1;
          }
          else {
            done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
            currsigs.addElement(done_78);
            S134324=1;
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

  public void thread192317(int [] tdone, int [] ends){
        S134297=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 660, column: 13
    S133018=0;
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread192314(int [] tdone, int [] ends){
        S134423=1;
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192313(int [] tdone, int [] ends){
        S134420=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 763, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192312(int [] tdone, int [] ends){
        S134450=1;
    S134426=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 760, column: 27
      thread192313(tdone,ends);
      thread192314(tdone,ends);
      int biggest192315 = 0;
      if(ends[90]>=biggest192315){
        biggest192315=ends[90];
      }
      if(ends[91]>=biggest192315){
        biggest192315=ends[91];
      }
      if(biggest192315 == 1){
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
      }
    }
    else {
      S134426=1;
      active[89]=1;
      ends[89]=1;
      tdone[89]=1;
    }
  }

  public void thread192310(int [] tdone, int [] ends){
        S134388=1;
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192309(int [] tdone, int [] ends){
        S134385=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 744, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192308(int [] tdone, int [] ends){
        S134415=1;
    S134391=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 741, column: 39
      thread192309(tdone,ends);
      thread192310(tdone,ends);
      int biggest192311 = 0;
      if(ends[87]>=biggest192311){
        biggest192311=ends[87];
      }
      if(ends[88]>=biggest192311){
        biggest192311=ends[88];
      }
      if(biggest192311 == 1){
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
      }
    }
    else {
      S134391=1;
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
  }

  public void thread192307(int [] tdone, int [] ends){
        S134380=1;
    S134324=0;
    S134304=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
      S134304=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
    else {
      S134299=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
        S134299=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
          ends[85]=2;
          ;//sysj\conveyor_controller.sysj line: 728, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
            bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
            currsigs.addElement(bottleAtPos4_78);
            S134324=1;
            active[85]=1;
            ends[85]=1;
            tdone[85]=1;
          }
          else {
            done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
            currsigs.addElement(done_78);
            S134324=1;
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

  public void thread192306(int [] tdone, int [] ends){
        S134297=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 660, column: 13
    S133018=0;
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread192303(int [] tdone, int [] ends){
        S134423=1;
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192302(int [] tdone, int [] ends){
        S134420=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 763, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[90]=1;
    ends[90]=1;
    tdone[90]=1;
  }

  public void thread192301(int [] tdone, int [] ends){
        S134450=1;
    S134426=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 760, column: 27
      thread192302(tdone,ends);
      thread192303(tdone,ends);
      int biggest192304 = 0;
      if(ends[90]>=biggest192304){
        biggest192304=ends[90];
      }
      if(ends[91]>=biggest192304){
        biggest192304=ends[91];
      }
      if(biggest192304 == 1){
        active[89]=1;
        ends[89]=1;
        tdone[89]=1;
      }
    }
    else {
      S134426=1;
      active[89]=1;
      ends[89]=1;
      tdone[89]=1;
    }
  }

  public void thread192299(int [] tdone, int [] ends){
        S134388=1;
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192298(int [] tdone, int [] ends){
        S134385=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 744, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread192297(int [] tdone, int [] ends){
        S134415=1;
    S134391=0;
    if(bottleAtPos4_78.getprestatus()){//sysj\conveyor_controller.sysj line: 741, column: 39
      thread192298(tdone,ends);
      thread192299(tdone,ends);
      int biggest192300 = 0;
      if(ends[87]>=biggest192300){
        biggest192300=ends[87];
      }
      if(ends[88]>=biggest192300){
        biggest192300=ends[88];
      }
      if(biggest192300 == 1){
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
      }
    }
    else {
      S134391=1;
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
  }

  public void thread192296(int [] tdone, int [] ends){
        S134380=1;
    S134324=0;
    S134304=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 728, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
      S134304=1;
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
    else {
      S134299=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 728, column: 13
        S134299=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 728, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 728, column: 13
          ends[85]=2;
          ;//sysj\conveyor_controller.sysj line: 728, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 729, column: 16
            bottleAtPos4_78.setPresent();//sysj\conveyor_controller.sysj line: 730, column: 14
            currsigs.addElement(bottleAtPos4_78);
            S134324=1;
            active[85]=1;
            ends[85]=1;
            tdone[85]=1;
          }
          else {
            done_78.setPresent();//sysj\conveyor_controller.sysj line: 733, column: 14
            currsigs.addElement(done_78);
            S134324=1;
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

  public void thread192295(int [] tdone, int [] ends){
        S134297=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 660, column: 13
    S133018=0;
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
      switch(S138757){
        case 0 : 
          S138757=0;
          break RUN;
        
        case 1 : 
          S138757=2;
          S138757=2;
          bottleAtPos4_78.setClear();//sysj\conveyor_controller.sysj line: 654, column: 11
          done_78.setClear();//sysj\conveyor_controller.sysj line: 654, column: 11
          S138756=0;
          S133000=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 655, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 655, column: 11
            S133000=1;
            active[78]=1;
            ends[78]=1;
            break RUN;
          }
          else {
            S132995=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 655, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 655, column: 11
              S132995=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 655, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 655, column: 11
                ends[78]=2;
                ;//sysj\conveyor_controller.sysj line: 655, column: 11
                S138756=1;
                thread192295(tdone,ends);
                thread192296(tdone,ends);
                thread192297(tdone,ends);
                thread192301(tdone,ends);
                int biggest192305 = 0;
                if(ends[79]>=biggest192305){
                  biggest192305=ends[79];
                }
                if(ends[85]>=biggest192305){
                  biggest192305=ends[85];
                }
                if(ends[86]>=biggest192305){
                  biggest192305=ends[86];
                }
                if(ends[89]>=biggest192305){
                  biggest192305=ends[89];
                }
                if(biggest192305 == 1){
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
          switch(S138756){
            case 0 : 
              switch(S133000){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 655, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 655, column: 11
                    S133000=1;
                    active[78]=1;
                    ends[78]=1;
                    break RUN;
                  }
                  else {
                    switch(S132995){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 655, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 655, column: 11
                          S132995=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 655, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 655, column: 11
                            ends[78]=2;
                            ;//sysj\conveyor_controller.sysj line: 655, column: 11
                            S138756=1;
                            thread192306(tdone,ends);
                            thread192307(tdone,ends);
                            thread192308(tdone,ends);
                            thread192312(tdone,ends);
                            int biggest192316 = 0;
                            if(ends[79]>=biggest192316){
                              biggest192316=ends[79];
                            }
                            if(ends[85]>=biggest192316){
                              biggest192316=ends[85];
                            }
                            if(ends[86]>=biggest192316){
                              biggest192316=ends[86];
                            }
                            if(ends[89]>=biggest192316){
                              biggest192316=ends[89];
                            }
                            if(biggest192316 == 1){
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
                          S138756=1;
                          thread192317(tdone,ends);
                          thread192318(tdone,ends);
                          thread192319(tdone,ends);
                          thread192323(tdone,ends);
                          int biggest192327 = 0;
                          if(ends[79]>=biggest192327){
                            biggest192327=ends[79];
                          }
                          if(ends[85]>=biggest192327){
                            biggest192327=ends[85];
                          }
                          if(ends[86]>=biggest192327){
                            biggest192327=ends[86];
                          }
                          if(ends[89]>=biggest192327){
                            biggest192327=ends[89];
                          }
                          if(biggest192327 == 1){
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
                  S133000=1;
                  S133000=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 655, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 655, column: 11
                    S133000=1;
                    active[78]=1;
                    ends[78]=1;
                    break RUN;
                  }
                  else {
                    S132995=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 655, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 655, column: 11
                      S132995=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 655, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 655, column: 11
                        ends[78]=2;
                        ;//sysj\conveyor_controller.sysj line: 655, column: 11
                        S138756=1;
                        thread192328(tdone,ends);
                        thread192329(tdone,ends);
                        thread192330(tdone,ends);
                        thread192334(tdone,ends);
                        int biggest192338 = 0;
                        if(ends[79]>=biggest192338){
                          biggest192338=ends[79];
                        }
                        if(ends[85]>=biggest192338){
                          biggest192338=ends[85];
                        }
                        if(ends[86]>=biggest192338){
                          biggest192338=ends[86];
                        }
                        if(ends[89]>=biggest192338){
                          biggest192338=ends[89];
                        }
                        if(biggest192338 == 1){
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
              thread192339(tdone,ends);
              thread192354(tdone,ends);
              thread192355(tdone,ends);
              thread192362(tdone,ends);
              int biggest192369 = 0;
              if(ends[79]>=biggest192369){
                biggest192369=ends[79];
              }
              if(ends[85]>=biggest192369){
                biggest192369=ends[85];
              }
              if(ends[86]>=biggest192369){
                biggest192369=ends[86];
              }
              if(ends[89]>=biggest192369){
                biggest192369=ends[89];
              }
              if(biggest192369 == 1){
                active[78]=1;
                ends[78]=1;
                break RUN;
              }
              //FINXME code
              if(biggest192369 == 0){
                S138757=0;
                active[78]=0;
                ends[78]=0;
                S138757=0;
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
