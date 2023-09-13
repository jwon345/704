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
  private int S152004 = 1;
  private int S152003 = 1;
  private int S146247 = 1;
  private int S146242 = 1;
  private int S147544 = 1;
  private int S146265 = 1;
  private int S146272 = 1;
  private int S146267 = 1;
  private int S146334 = 1;
  private int S146369 = 1;
  private int S146336 = 1;
  private int S146341 = 1;
  private int S146349 = 1;
  private int S146352 = 1;
  private int S146421 = 1;
  private int S146416 = 1;
  private int S146472 = 1;
  private int S147627 = 1;
  private int S147571 = 1;
  private int S147551 = 1;
  private int S147546 = 1;
  private int S147662 = 1;
  private int S147638 = 1;
  private int S147632 = 1;
  private int S147635 = 1;
  private int S147697 = 1;
  private int S147673 = 1;
  private int S147667 = 1;
  private int S147670 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread210935(int [] tdone, int [] ends){
        S147670=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread210934(int [] tdone, int [] ends){
        S147667=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 702, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread210932(int [] tdone, int [] ends){
        switch(S147670){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 706, column: 36
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

  public void thread210931(int [] tdone, int [] ends){
        switch(S147667){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 702, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
        break;
      
    }
  }

  public void thread210930(int [] tdone, int [] ends){
        switch(S147697){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        switch(S147673){
          case 0 : 
            thread210931(tdone,ends);
            thread210932(tdone,ends);
            int biggest210933 = 0;
            if(ends[85]>=biggest210933){
              biggest210933=ends[85];
            }
            if(ends[86]>=biggest210933){
              biggest210933=ends[86];
            }
            if(biggest210933 == 1){
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            if(biggest210933 == 2){
              ends[84]=2;
              ;//sysj\conveyor_controller.sysj line: 700, column: 19
              S147673=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            //FINXME code
            if(biggest210933 == 0){
              S147673=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            break;
          
          case 1 : 
            S147673=1;
            S147673=0;
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 699, column: 27
              thread210934(tdone,ends);
              thread210935(tdone,ends);
              int biggest210936 = 0;
              if(ends[85]>=biggest210936){
                biggest210936=ends[85];
              }
              if(ends[86]>=biggest210936){
                biggest210936=ends[86];
              }
              if(biggest210936 == 1){
                active[84]=1;
                ends[84]=1;
                tdone[84]=1;
              }
            }
            else {
              S147673=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread210928(int [] tdone, int [] ends){
        S147635=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread210927(int [] tdone, int [] ends){
        S147632=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 683, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread210925(int [] tdone, int [] ends){
        switch(S147635){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 687, column: 37
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

  public void thread210924(int [] tdone, int [] ends){
        switch(S147632){
      case 0 : 
        active[82]=0;
        ends[82]=0;
        tdone[82]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 683, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[82]=1;
        ends[82]=1;
        tdone[82]=1;
        break;
      
    }
  }

  public void thread210923(int [] tdone, int [] ends){
        switch(S147662){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        switch(S147638){
          case 0 : 
            thread210924(tdone,ends);
            thread210925(tdone,ends);
            int biggest210926 = 0;
            if(ends[82]>=biggest210926){
              biggest210926=ends[82];
            }
            if(ends[83]>=biggest210926){
              biggest210926=ends[83];
            }
            if(biggest210926 == 1){
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            if(biggest210926 == 2){
              ends[81]=2;
              ;//sysj\conveyor_controller.sysj line: 681, column: 20
              S147638=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            //FINXME code
            if(biggest210926 == 0){
              S147638=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            break;
          
          case 1 : 
            S147638=1;
            S147638=0;
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 680, column: 39
              thread210927(tdone,ends);
              thread210928(tdone,ends);
              int biggest210929 = 0;
              if(ends[82]>=biggest210929){
                biggest210929=ends[82];
              }
              if(ends[83]>=biggest210929){
                biggest210929=ends[83];
              }
              if(biggest210929 == 1){
                active[81]=1;
                ends[81]=1;
                tdone[81]=1;
              }
            }
            else {
              S147638=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread210922(int [] tdone, int [] ends){
        switch(S147627){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        switch(S147571){
          case 0 : 
            switch(S147551){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 670, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
                  S147551=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  switch(S147546){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 670, column: 13
                        S147546=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
                          ends[80]=2;
                          ;//sysj\conveyor_controller.sysj line: 670, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 671, column: 16
                            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 672, column: 14
                            currsigs.addElement(bottleAtPos4_73);
                            S147571=1;
                            active[80]=1;
                            ends[80]=1;
                            tdone[80]=1;
                          }
                          else {
                            S147571=1;
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
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
                        ends[80]=2;
                        ;//sysj\conveyor_controller.sysj line: 670, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 671, column: 16
                          bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 672, column: 14
                          currsigs.addElement(bottleAtPos4_73);
                          S147571=1;
                          active[80]=1;
                          ends[80]=1;
                          tdone[80]=1;
                        }
                        else {
                          S147571=1;
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
                S147551=1;
                S147551=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 670, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
                  S147551=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  S147546=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 670, column: 13
                    S147546=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
                      ends[80]=2;
                      ;//sysj\conveyor_controller.sysj line: 670, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 671, column: 16
                        bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 672, column: 14
                        currsigs.addElement(bottleAtPos4_73);
                        S147571=1;
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      else {
                        S147571=1;
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
            S147571=1;
            S147571=0;
            S147551=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 670, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
              S147551=1;
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            else {
              S147546=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 670, column: 13
                S147546=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
                  ends[80]=2;
                  ;//sysj\conveyor_controller.sysj line: 670, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 671, column: 16
                    bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 672, column: 14
                    currsigs.addElement(bottleAtPos4_73);
                    S147571=1;
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                  else {
                    S147571=1;
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

  public void thread210919(int [] tdone, int [] ends){
        switch(S146352){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 643, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 644, column: 16
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

  public void thread210918(int [] tdone, int [] ends){
        switch(S146349){
      case 0 : 
        active[78]=0;
        ends[78]=0;
        tdone[78]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 639, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
        break;
      
    }
  }

  public void thread210917(int [] tdone, int [] ends){
        switch(S146341){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 634, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[77]=1;
        ends[77]=1;
        tdone[77]=1;
        break;
      
    }
  }

  public void thread210915(int [] tdone, int [] ends){
        S146352=1;
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread210914(int [] tdone, int [] ends){
        S146349=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 638, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 639, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread210913(int [] tdone, int [] ends){
        S146341=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 634, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread210912(int [] tdone, int [] ends){
        switch(S146369){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        switch(S146336){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 631, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 632, column: 15
              S146336=1;
              thread210913(tdone,ends);
              thread210914(tdone,ends);
              thread210915(tdone,ends);
              int biggest210916 = 0;
              if(ends[77]>=biggest210916){
                biggest210916=ends[77];
              }
              if(ends[78]>=biggest210916){
                biggest210916=ends[78];
              }
              if(ends[79]>=biggest210916){
                biggest210916=ends[79];
              }
              if(biggest210916 == 1){
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
            thread210917(tdone,ends);
            thread210918(tdone,ends);
            thread210919(tdone,ends);
            int biggest210920 = 0;
            if(ends[77]>=biggest210920){
              biggest210920=ends[77];
            }
            if(ends[78]>=biggest210920){
              biggest210920=ends[78];
            }
            if(ends[79]>=biggest210920){
              biggest210920=ends[79];
            }
            if(biggest210920 == 1){
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            if(biggest210920 == 2){
              ends[76]=2;
              tdone[76]=1;
            }
            //FINXME code
            if(biggest210920 == 0){
              S146369=0;
              active[76]=0;
              ends[76]=0;
              tdone[76]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread210911(int [] tdone, int [] ends){
        switch(S146334){
      case 0 : 
        active[75]=0;
        ends[75]=0;
        tdone[75]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 627, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
        break;
      
    }
  }

  public void thread210909(int [] tdone, int [] ends){
        S146369=1;
    S146336=0;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread210908(int [] tdone, int [] ends){
        S146334=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 627, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread210907(int [] tdone, int [] ends){
        switch(S147544){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        switch(S146265){
          case 0 : 
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 606, column: 19
              S146265=1;
              S146272=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 607, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 13
                S146272=1;
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
              else {
                S146267=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 607, column: 13
                  S146267=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 13
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 607, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 608, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 609, column: 13
                    S146265=2;
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
            switch(S146272){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 607, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 13
                  S146272=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  switch(S146267){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 607, column: 13
                        S146267=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 13
                          ends[74]=2;
                          ;//sysj\conveyor_controller.sysj line: 607, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 608, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 609, column: 13
                          S146265=2;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 13
                        ends[74]=2;
                        ;//sysj\conveyor_controller.sysj line: 607, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 608, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 609, column: 13
                        S146265=2;
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
                S146272=1;
                S146272=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 607, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 13
                  S146272=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  S146267=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 607, column: 13
                    S146267=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 13
                      ends[74]=2;
                      ;//sysj\conveyor_controller.sysj line: 607, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 608, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 609, column: 13
                      S146265=2;
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
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 610, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 614, column: 13
              S146265=3;
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
            S146265=3;
            S146265=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 620, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 621, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 618, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 623, column: 13
              S146265=5;
              thread210908(tdone,ends);
              thread210909(tdone,ends);
              int biggest210910 = 0;
              if(ends[75]>=biggest210910){
                biggest210910=ends[75];
              }
              if(ends[76]>=biggest210910){
                biggest210910=ends[76];
              }
              if(biggest210910 == 1){
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 621, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 5 : 
            thread210911(tdone,ends);
            thread210912(tdone,ends);
            int biggest210921 = 0;
            if(ends[75]>=biggest210921){
              biggest210921=ends[75];
            }
            if(ends[76]>=biggest210921){
              biggest210921=ends[76];
            }
            if(biggest210921 == 1){
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            if(biggest210921 == 2){
              ends[74]=2;
              ;//sysj\conveyor_controller.sysj line: 626, column: 13
              S146265=6;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            //FINXME code
            if(biggest210921 == 0){
              S146265=6;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 650, column: 19
              S146265=7;
              S146421=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 652, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 652, column: 13
                S146421=1;
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
              else {
                S146416=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 652, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 652, column: 13
                  S146416=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 652, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 652, column: 13
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 652, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 653, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 654, column: 13
                    S146265=8;
                    S146472=0;
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
            switch(S146421){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 652, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 652, column: 13
                  S146421=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  switch(S146416){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 652, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 652, column: 13
                        S146416=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 652, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 652, column: 13
                          ends[74]=2;
                          ;//sysj\conveyor_controller.sysj line: 652, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 653, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 654, column: 13
                          S146265=8;
                          S146472=0;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 652, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 652, column: 13
                        ends[74]=2;
                        ;//sysj\conveyor_controller.sysj line: 652, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 653, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 654, column: 13
                        S146265=8;
                        S146472=0;
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
                S146421=1;
                S146421=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 652, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 652, column: 13
                  S146421=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  S146416=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 652, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 652, column: 13
                    S146416=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 652, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 652, column: 13
                      ends[74]=2;
                      ;//sysj\conveyor_controller.sysj line: 652, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 653, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 654, column: 13
                      S146265=8;
                      S146472=0;
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
            switch(S146472){
              case 0 : 
                if(!bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 655, column: 29
                  S146472=1;
                  if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 657, column: 23
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                  else {
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 655, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 605, column: 13
                    S146265=0;
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
                if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 657, column: 23
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  ends[74]=2;
                  ;//sysj\conveyor_controller.sysj line: 655, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 605, column: 13
                  S146265=0;
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

  public void thread210904(int [] tdone, int [] ends){
        S147670=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread210903(int [] tdone, int [] ends){
        S147667=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 702, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread210902(int [] tdone, int [] ends){
        S147697=1;
    S147673=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 699, column: 27
      thread210903(tdone,ends);
      thread210904(tdone,ends);
      int biggest210905 = 0;
      if(ends[85]>=biggest210905){
        biggest210905=ends[85];
      }
      if(ends[86]>=biggest210905){
        biggest210905=ends[86];
      }
      if(biggest210905 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S147673=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread210900(int [] tdone, int [] ends){
        S147635=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread210899(int [] tdone, int [] ends){
        S147632=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 683, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread210898(int [] tdone, int [] ends){
        S147662=1;
    S147638=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 680, column: 39
      thread210899(tdone,ends);
      thread210900(tdone,ends);
      int biggest210901 = 0;
      if(ends[82]>=biggest210901){
        biggest210901=ends[82];
      }
      if(ends[83]>=biggest210901){
        biggest210901=ends[83];
      }
      if(biggest210901 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S147638=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread210897(int [] tdone, int [] ends){
        S147627=1;
    S147571=0;
    S147551=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 670, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
      S147551=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S147546=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 670, column: 13
        S147546=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 670, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 671, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 672, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S147571=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S147571=1;
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

  public void thread210896(int [] tdone, int [] ends){
        S147544=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 605, column: 13
    S146265=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread210893(int [] tdone, int [] ends){
        S147670=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread210892(int [] tdone, int [] ends){
        S147667=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 702, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread210891(int [] tdone, int [] ends){
        S147697=1;
    S147673=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 699, column: 27
      thread210892(tdone,ends);
      thread210893(tdone,ends);
      int biggest210894 = 0;
      if(ends[85]>=biggest210894){
        biggest210894=ends[85];
      }
      if(ends[86]>=biggest210894){
        biggest210894=ends[86];
      }
      if(biggest210894 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S147673=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread210889(int [] tdone, int [] ends){
        S147635=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread210888(int [] tdone, int [] ends){
        S147632=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 683, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread210887(int [] tdone, int [] ends){
        S147662=1;
    S147638=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 680, column: 39
      thread210888(tdone,ends);
      thread210889(tdone,ends);
      int biggest210890 = 0;
      if(ends[82]>=biggest210890){
        biggest210890=ends[82];
      }
      if(ends[83]>=biggest210890){
        biggest210890=ends[83];
      }
      if(biggest210890 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S147638=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread210886(int [] tdone, int [] ends){
        S147627=1;
    S147571=0;
    S147551=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 670, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
      S147551=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S147546=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 670, column: 13
        S147546=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 670, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 671, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 672, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S147571=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S147571=1;
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

  public void thread210885(int [] tdone, int [] ends){
        S147544=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 605, column: 13
    S146265=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread210882(int [] tdone, int [] ends){
        S147670=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread210881(int [] tdone, int [] ends){
        S147667=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 702, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread210880(int [] tdone, int [] ends){
        S147697=1;
    S147673=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 699, column: 27
      thread210881(tdone,ends);
      thread210882(tdone,ends);
      int biggest210883 = 0;
      if(ends[85]>=biggest210883){
        biggest210883=ends[85];
      }
      if(ends[86]>=biggest210883){
        biggest210883=ends[86];
      }
      if(biggest210883 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S147673=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread210878(int [] tdone, int [] ends){
        S147635=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread210877(int [] tdone, int [] ends){
        S147632=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 683, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread210876(int [] tdone, int [] ends){
        S147662=1;
    S147638=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 680, column: 39
      thread210877(tdone,ends);
      thread210878(tdone,ends);
      int biggest210879 = 0;
      if(ends[82]>=biggest210879){
        biggest210879=ends[82];
      }
      if(ends[83]>=biggest210879){
        biggest210879=ends[83];
      }
      if(biggest210879 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S147638=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread210875(int [] tdone, int [] ends){
        S147627=1;
    S147571=0;
    S147551=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 670, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
      S147551=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S147546=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 670, column: 13
        S147546=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 670, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 671, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 672, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S147571=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S147571=1;
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

  public void thread210874(int [] tdone, int [] ends){
        S147544=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 605, column: 13
    S146265=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread210871(int [] tdone, int [] ends){
        S147670=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread210870(int [] tdone, int [] ends){
        S147667=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 702, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread210869(int [] tdone, int [] ends){
        S147697=1;
    S147673=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 699, column: 27
      thread210870(tdone,ends);
      thread210871(tdone,ends);
      int biggest210872 = 0;
      if(ends[85]>=biggest210872){
        biggest210872=ends[85];
      }
      if(ends[86]>=biggest210872){
        biggest210872=ends[86];
      }
      if(biggest210872 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S147673=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread210867(int [] tdone, int [] ends){
        S147635=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread210866(int [] tdone, int [] ends){
        S147632=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 683, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread210865(int [] tdone, int [] ends){
        S147662=1;
    S147638=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 680, column: 39
      thread210866(tdone,ends);
      thread210867(tdone,ends);
      int biggest210868 = 0;
      if(ends[82]>=biggest210868){
        biggest210868=ends[82];
      }
      if(ends[83]>=biggest210868){
        biggest210868=ends[83];
      }
      if(biggest210868 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S147638=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread210864(int [] tdone, int [] ends){
        S147627=1;
    S147571=0;
    S147551=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 670, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
      S147551=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S147546=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 670, column: 13
        S147546=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 670, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 670, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 670, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 671, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 672, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S147571=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S147571=1;
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

  public void thread210863(int [] tdone, int [] ends){
        S147544=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 605, column: 13
    S146265=0;
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
      switch(S152004){
        case 0 : 
          S152004=0;
          break RUN;
        
        case 1 : 
          S152004=2;
          S152004=2;
          bottleAtPos4_73.setClear();//sysj\conveyor_controller.sysj line: 599, column: 11
          S152003=0;
          S146247=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 600, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 600, column: 11
            S146247=1;
            active[73]=1;
            ends[73]=1;
            break RUN;
          }
          else {
            S146242=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 600, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 600, column: 11
              S146242=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 600, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 600, column: 11
                ends[73]=2;
                ;//sysj\conveyor_controller.sysj line: 600, column: 11
                S152003=1;
                thread210863(tdone,ends);
                thread210864(tdone,ends);
                thread210865(tdone,ends);
                thread210869(tdone,ends);
                int biggest210873 = 0;
                if(ends[74]>=biggest210873){
                  biggest210873=ends[74];
                }
                if(ends[80]>=biggest210873){
                  biggest210873=ends[80];
                }
                if(ends[81]>=biggest210873){
                  biggest210873=ends[81];
                }
                if(ends[84]>=biggest210873){
                  biggest210873=ends[84];
                }
                if(biggest210873 == 1){
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
          bottleAtPos4_73.setClear();//sysj\conveyor_controller.sysj line: 599, column: 11
          switch(S152003){
            case 0 : 
              switch(S146247){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 600, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 600, column: 11
                    S146247=1;
                    active[73]=1;
                    ends[73]=1;
                    break RUN;
                  }
                  else {
                    switch(S146242){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 600, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 600, column: 11
                          S146242=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 600, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 600, column: 11
                            ends[73]=2;
                            ;//sysj\conveyor_controller.sysj line: 600, column: 11
                            S152003=1;
                            thread210874(tdone,ends);
                            thread210875(tdone,ends);
                            thread210876(tdone,ends);
                            thread210880(tdone,ends);
                            int biggest210884 = 0;
                            if(ends[74]>=biggest210884){
                              biggest210884=ends[74];
                            }
                            if(ends[80]>=biggest210884){
                              biggest210884=ends[80];
                            }
                            if(ends[81]>=biggest210884){
                              biggest210884=ends[81];
                            }
                            if(ends[84]>=biggest210884){
                              biggest210884=ends[84];
                            }
                            if(biggest210884 == 1){
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
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 600, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 600, column: 11
                          ends[73]=2;
                          ;//sysj\conveyor_controller.sysj line: 600, column: 11
                          S152003=1;
                          thread210885(tdone,ends);
                          thread210886(tdone,ends);
                          thread210887(tdone,ends);
                          thread210891(tdone,ends);
                          int biggest210895 = 0;
                          if(ends[74]>=biggest210895){
                            biggest210895=ends[74];
                          }
                          if(ends[80]>=biggest210895){
                            biggest210895=ends[80];
                          }
                          if(ends[81]>=biggest210895){
                            biggest210895=ends[81];
                          }
                          if(ends[84]>=biggest210895){
                            biggest210895=ends[84];
                          }
                          if(biggest210895 == 1){
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
                  S146247=1;
                  S146247=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 600, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 600, column: 11
                    S146247=1;
                    active[73]=1;
                    ends[73]=1;
                    break RUN;
                  }
                  else {
                    S146242=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 600, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 600, column: 11
                      S146242=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 600, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 600, column: 11
                        ends[73]=2;
                        ;//sysj\conveyor_controller.sysj line: 600, column: 11
                        S152003=1;
                        thread210896(tdone,ends);
                        thread210897(tdone,ends);
                        thread210898(tdone,ends);
                        thread210902(tdone,ends);
                        int biggest210906 = 0;
                        if(ends[74]>=biggest210906){
                          biggest210906=ends[74];
                        }
                        if(ends[80]>=biggest210906){
                          biggest210906=ends[80];
                        }
                        if(ends[81]>=biggest210906){
                          biggest210906=ends[81];
                        }
                        if(ends[84]>=biggest210906){
                          biggest210906=ends[84];
                        }
                        if(biggest210906 == 1){
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
              thread210907(tdone,ends);
              thread210922(tdone,ends);
              thread210923(tdone,ends);
              thread210930(tdone,ends);
              int biggest210937 = 0;
              if(ends[74]>=biggest210937){
                biggest210937=ends[74];
              }
              if(ends[80]>=biggest210937){
                biggest210937=ends[80];
              }
              if(ends[81]>=biggest210937){
                biggest210937=ends[81];
              }
              if(ends[84]>=biggest210937){
                biggest210937=ends[84];
              }
              if(biggest210937 == 1){
                active[73]=1;
                ends[73]=1;
                break RUN;
              }
              //FINXME code
              if(biggest210937 == 0){
                S152004=0;
                active[73]=0;
                ends[73]=0;
                S152004=0;
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
