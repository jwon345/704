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
  private Signal bottleAtPos4_41;
  private int S24391 = 1;
  private int S24390 = 1;
  private int S21354 = 1;
  private int S21349 = 1;
  private int S21971 = 1;
  private int S21372 = 1;
  private int S21379 = 1;
  private int S21374 = 1;
  private int S21441 = 1;
  private int S21476 = 1;
  private int S21443 = 1;
  private int S21448 = 1;
  private int S21456 = 1;
  private int S21459 = 1;
  private int S21528 = 1;
  private int S21523 = 1;
  private int S22054 = 1;
  private int S21998 = 1;
  private int S21978 = 1;
  private int S21973 = 1;
  private int S22089 = 1;
  private int S22065 = 1;
  private int S22059 = 1;
  private int S22062 = 1;
  private int S22124 = 1;
  private int S22100 = 1;
  private int S22094 = 1;
  private int S22097 = 1;
  
  private int[] ends = new int[55];
  private int[] tdone = new int[55];
  
  public void thread24811(int [] tdone, int [] ends){
        S22097=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread24810(int [] tdone, int [] ends){
        S22094=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 441, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread24808(int [] tdone, int [] ends){
        switch(S22097){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 445, column: 36
          ends[54]=2;
          tdone[54]=1;
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
        break;
      
    }
  }

  public void thread24807(int [] tdone, int [] ends){
        switch(S22094){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 441, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread24806(int [] tdone, int [] ends){
        switch(S22124){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        switch(S22100){
          case 0 : 
            thread24807(tdone,ends);
            thread24808(tdone,ends);
            int biggest24809 = 0;
            if(ends[53]>=biggest24809){
              biggest24809=ends[53];
            }
            if(ends[54]>=biggest24809){
              biggest24809=ends[54];
            }
            if(biggest24809 == 1){
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            if(biggest24809 == 2){
              ends[52]=2;
              ;//sysj\conveyor_controller.sysj line: 439, column: 19
              S22100=1;
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            //FINXME code
            if(biggest24809 == 0){
              S22100=1;
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 1 : 
            S22100=1;
            S22100=0;
            if(bottleAtPos4_41.getprestatus()){//sysj\conveyor_controller.sysj line: 438, column: 27
              thread24810(tdone,ends);
              thread24811(tdone,ends);
              int biggest24812 = 0;
              if(ends[53]>=biggest24812){
                biggest24812=ends[53];
              }
              if(ends[54]>=biggest24812){
                biggest24812=ends[54];
              }
              if(biggest24812 == 1){
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
            }
            else {
              S22100=1;
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24804(int [] tdone, int [] ends){
        S22062=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread24803(int [] tdone, int [] ends){
        S22059=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread24801(int [] tdone, int [] ends){
        switch(S22062){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 426, column: 37
          ends[51]=2;
          tdone[51]=1;
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        break;
      
    }
  }

  public void thread24800(int [] tdone, int [] ends){
        switch(S22059){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
        break;
      
    }
  }

  public void thread24799(int [] tdone, int [] ends){
        switch(S22089){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        switch(S22065){
          case 0 : 
            thread24800(tdone,ends);
            thread24801(tdone,ends);
            int biggest24802 = 0;
            if(ends[50]>=biggest24802){
              biggest24802=ends[50];
            }
            if(ends[51]>=biggest24802){
              biggest24802=ends[51];
            }
            if(biggest24802 == 1){
              active[49]=1;
              ends[49]=1;
              tdone[49]=1;
            }
            if(biggest24802 == 2){
              ends[49]=2;
              ;//sysj\conveyor_controller.sysj line: 420, column: 20
              S22065=1;
              active[49]=1;
              ends[49]=1;
              tdone[49]=1;
            }
            //FINXME code
            if(biggest24802 == 0){
              S22065=1;
              active[49]=1;
              ends[49]=1;
              tdone[49]=1;
            }
            break;
          
          case 1 : 
            S22065=1;
            S22065=0;
            if(bottleAtPos4_41.getprestatus()){//sysj\conveyor_controller.sysj line: 419, column: 39
              thread24803(tdone,ends);
              thread24804(tdone,ends);
              int biggest24805 = 0;
              if(ends[50]>=biggest24805){
                biggest24805=ends[50];
              }
              if(ends[51]>=biggest24805){
                biggest24805=ends[51];
              }
              if(biggest24805 == 1){
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
            }
            else {
              S22065=1;
              active[49]=1;
              ends[49]=1;
              tdone[49]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24798(int [] tdone, int [] ends){
        switch(S22054){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        switch(S21998){
          case 0 : 
            switch(S21978){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 410, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
                  S21978=1;
                  active[48]=1;
                  ends[48]=1;
                  tdone[48]=1;
                }
                else {
                  switch(S21973){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 410, column: 13
                        S21973=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
                          ends[48]=2;
                          ;//sysj\conveyor_controller.sysj line: 410, column: 13
                          if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 411, column: 16
                            bottleAtPos4_41.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 14
                            currsigs.addElement(bottleAtPos4_41);
                            S21998=1;
                            active[48]=1;
                            ends[48]=1;
                            tdone[48]=1;
                          }
                          else {
                            S21998=1;
                            active[48]=1;
                            ends[48]=1;
                            tdone[48]=1;
                          }
                        }
                        else {
                          active[48]=1;
                          ends[48]=1;
                          tdone[48]=1;
                        }
                      }
                      else {
                        active[48]=1;
                        ends[48]=1;
                        tdone[48]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
                        ends[48]=2;
                        ;//sysj\conveyor_controller.sysj line: 410, column: 13
                        if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 411, column: 16
                          bottleAtPos4_41.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 14
                          currsigs.addElement(bottleAtPos4_41);
                          S21998=1;
                          active[48]=1;
                          ends[48]=1;
                          tdone[48]=1;
                        }
                        else {
                          S21998=1;
                          active[48]=1;
                          ends[48]=1;
                          tdone[48]=1;
                        }
                      }
                      else {
                        active[48]=1;
                        ends[48]=1;
                        tdone[48]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S21978=1;
                S21978=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 410, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
                  S21978=1;
                  active[48]=1;
                  ends[48]=1;
                  tdone[48]=1;
                }
                else {
                  S21973=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 410, column: 13
                    S21973=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
                      ends[48]=2;
                      ;//sysj\conveyor_controller.sysj line: 410, column: 13
                      if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 411, column: 16
                        bottleAtPos4_41.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 14
                        currsigs.addElement(bottleAtPos4_41);
                        S21998=1;
                        active[48]=1;
                        ends[48]=1;
                        tdone[48]=1;
                      }
                      else {
                        S21998=1;
                        active[48]=1;
                        ends[48]=1;
                        tdone[48]=1;
                      }
                    }
                    else {
                      active[48]=1;
                      ends[48]=1;
                      tdone[48]=1;
                    }
                  }
                  else {
                    active[48]=1;
                    ends[48]=1;
                    tdone[48]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S21998=1;
            S21998=0;
            S21978=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 410, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
              S21978=1;
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            else {
              S21973=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 410, column: 13
                S21973=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
                  ends[48]=2;
                  ;//sysj\conveyor_controller.sysj line: 410, column: 13
                  if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 411, column: 16
                    bottleAtPos4_41.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 14
                    currsigs.addElement(bottleAtPos4_41);
                    S21998=1;
                    active[48]=1;
                    ends[48]=1;
                    tdone[48]=1;
                  }
                  else {
                    S21998=1;
                    active[48]=1;
                    ends[48]=1;
                    tdone[48]=1;
                  }
                }
                else {
                  active[48]=1;
                  ends[48]=1;
                  tdone[48]=1;
                }
              }
              else {
                active[48]=1;
                ends[48]=1;
                tdone[48]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24795(int [] tdone, int [] ends){
        switch(S21459){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 389, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 390, column: 16
          ends[47]=2;
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

  public void thread24794(int [] tdone, int [] ends){
        switch(S21456){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
        break;
      
    }
  }

  public void thread24793(int [] tdone, int [] ends){
        switch(S21448){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 380, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
        break;
      
    }
  }

  public void thread24791(int [] tdone, int [] ends){
        S21459=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread24790(int [] tdone, int [] ends){
        S21456=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 384, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread24789(int [] tdone, int [] ends){
        S21448=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 380, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread24788(int [] tdone, int [] ends){
        switch(S21476){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        switch(S21443){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 377, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 378, column: 15
              S21443=1;
              thread24789(tdone,ends);
              thread24790(tdone,ends);
              thread24791(tdone,ends);
              int biggest24792 = 0;
              if(ends[45]>=biggest24792){
                biggest24792=ends[45];
              }
              if(ends[46]>=biggest24792){
                biggest24792=ends[46];
              }
              if(ends[47]>=biggest24792){
                biggest24792=ends[47];
              }
              if(biggest24792 == 1){
                active[44]=1;
                ends[44]=1;
                tdone[44]=1;
              }
            }
            else {
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
          case 1 : 
            thread24793(tdone,ends);
            thread24794(tdone,ends);
            thread24795(tdone,ends);
            int biggest24796 = 0;
            if(ends[45]>=biggest24796){
              biggest24796=ends[45];
            }
            if(ends[46]>=biggest24796){
              biggest24796=ends[46];
            }
            if(ends[47]>=biggest24796){
              biggest24796=ends[47];
            }
            if(biggest24796 == 1){
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            if(biggest24796 == 2){
              ends[44]=2;
              tdone[44]=1;
            }
            //FINXME code
            if(biggest24796 == 0){
              S21476=0;
              active[44]=0;
              ends[44]=0;
              tdone[44]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24787(int [] tdone, int [] ends){
        switch(S21441){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 373, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
        break;
      
    }
  }

  public void thread24785(int [] tdone, int [] ends){
        S21476=1;
    S21443=0;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread24784(int [] tdone, int [] ends){
        S21441=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 373, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread24783(int [] tdone, int [] ends){
        switch(S21971){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S21372){
          case 0 : 
            if(bottleAtPos4_41.getprestatus()){//sysj\conveyor_controller.sysj line: 352, column: 19
              System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 353, column: 13
              S21372=1;
              S21379=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 354, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 354, column: 13
                S21379=1;
                active[42]=1;
                ends[42]=1;
                tdone[42]=1;
              }
              else {
                S21374=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 354, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 354, column: 13
                  S21374=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 354, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 354, column: 13
                    ends[42]=2;
                    ;//sysj\conveyor_controller.sysj line: 354, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 355, column: 13
                    S21372=2;
                    active[42]=1;
                    ends[42]=1;
                    tdone[42]=1;
                  }
                  else {
                    active[42]=1;
                    ends[42]=1;
                    tdone[42]=1;
                  }
                }
                else {
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
              }
            }
            else {
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
          case 1 : 
            switch(S21379){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 354, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 354, column: 13
                  S21379=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  switch(S21374){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 354, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 354, column: 13
                        S21374=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 354, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 354, column: 13
                          ends[42]=2;
                          ;//sysj\conveyor_controller.sysj line: 354, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 355, column: 13
                          S21372=2;
                          active[42]=1;
                          ends[42]=1;
                          tdone[42]=1;
                        }
                        else {
                          active[42]=1;
                          ends[42]=1;
                          tdone[42]=1;
                        }
                      }
                      else {
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 354, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 354, column: 13
                        ends[42]=2;
                        ;//sysj\conveyor_controller.sysj line: 354, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 355, column: 13
                        S21372=2;
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      else {
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S21379=1;
                S21379=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 354, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 354, column: 13
                  S21379=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  S21374=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 354, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 354, column: 13
                    S21374=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 354, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 354, column: 13
                      ends[42]=2;
                      ;//sysj\conveyor_controller.sysj line: 354, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 355, column: 13
                      S21372=2;
                      active[42]=1;
                      ends[42]=1;
                      tdone[42]=1;
                    }
                    else {
                      active[42]=1;
                      ends[42]=1;
                      tdone[42]=1;
                    }
                  }
                  else {
                    active[42]=1;
                    ends[42]=1;
                    tdone[42]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 356, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 360, column: 13
              S21372=3;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            else {
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
          case 3 : 
            S21372=3;
            S21372=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 366, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 364, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 369, column: 13
              S21372=5;
              thread24784(tdone,ends);
              thread24785(tdone,ends);
              int biggest24786 = 0;
              if(ends[43]>=biggest24786){
                biggest24786=ends[43];
              }
              if(ends[44]>=biggest24786){
                biggest24786=ends[44];
              }
              if(biggest24786 == 1){
                active[42]=1;
                ends[42]=1;
                tdone[42]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 367, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
          case 5 : 
            thread24787(tdone,ends);
            thread24788(tdone,ends);
            int biggest24797 = 0;
            if(ends[43]>=biggest24797){
              biggest24797=ends[43];
            }
            if(ends[44]>=biggest24797){
              biggest24797=ends[44];
            }
            if(biggest24797 == 1){
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            if(biggest24797 == 2){
              ends[42]=2;
              ;//sysj\conveyor_controller.sysj line: 372, column: 13
              S21372=6;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            //FINXME code
            if(biggest24797 == 0){
              S21372=6;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 396, column: 19
              S21372=7;
              S21528=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 398, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 13
                S21528=1;
                active[42]=1;
                ends[42]=1;
                tdone[42]=1;
              }
              else {
                S21523=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 398, column: 13
                  S21523=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 13
                    ends[42]=2;
                    ;//sysj\conveyor_controller.sysj line: 398, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 399, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 400, column: 13
                    S21372=8;
                    active[42]=1;
                    ends[42]=1;
                    tdone[42]=1;
                  }
                  else {
                    active[42]=1;
                    ends[42]=1;
                    tdone[42]=1;
                  }
                }
                else {
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
              }
            }
            else {
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
          case 7 : 
            switch(S21528){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 398, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 13
                  S21528=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  switch(S21523){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 398, column: 13
                        S21523=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 13
                          ends[42]=2;
                          ;//sysj\conveyor_controller.sysj line: 398, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 399, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 400, column: 13
                          S21372=8;
                          active[42]=1;
                          ends[42]=1;
                          tdone[42]=1;
                        }
                        else {
                          active[42]=1;
                          ends[42]=1;
                          tdone[42]=1;
                        }
                      }
                      else {
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 13
                        ends[42]=2;
                        ;//sysj\conveyor_controller.sysj line: 398, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 399, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 400, column: 13
                        S21372=8;
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      else {
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S21528=1;
                S21528=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 398, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 13
                  S21528=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  S21523=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 398, column: 13
                    S21523=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 13
                      ends[42]=2;
                      ;//sysj\conveyor_controller.sysj line: 398, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 399, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 400, column: 13
                      S21372=8;
                      active[42]=1;
                      ends[42]=1;
                      tdone[42]=1;
                    }
                    else {
                      active[42]=1;
                      ends[42]=1;
                      tdone[42]=1;
                    }
                  }
                  else {
                    active[42]=1;
                    ends[42]=1;
                    tdone[42]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            if(!bottleAtPos4_41.getprestatus()){//sysj\conveyor_controller.sysj line: 401, column: 19
              System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 351, column: 13
              S21372=0;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            else {
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24780(int [] tdone, int [] ends){
        S22097=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread24779(int [] tdone, int [] ends){
        S22094=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 441, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread24778(int [] tdone, int [] ends){
        S22124=1;
    S22100=0;
    if(bottleAtPos4_41.getprestatus()){//sysj\conveyor_controller.sysj line: 438, column: 27
      thread24779(tdone,ends);
      thread24780(tdone,ends);
      int biggest24781 = 0;
      if(ends[53]>=biggest24781){
        biggest24781=ends[53];
      }
      if(ends[54]>=biggest24781){
        biggest24781=ends[54];
      }
      if(biggest24781 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S22100=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread24776(int [] tdone, int [] ends){
        S22062=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread24775(int [] tdone, int [] ends){
        S22059=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread24774(int [] tdone, int [] ends){
        S22089=1;
    S22065=0;
    if(bottleAtPos4_41.getprestatus()){//sysj\conveyor_controller.sysj line: 419, column: 39
      thread24775(tdone,ends);
      thread24776(tdone,ends);
      int biggest24777 = 0;
      if(ends[50]>=biggest24777){
        biggest24777=ends[50];
      }
      if(ends[51]>=biggest24777){
        biggest24777=ends[51];
      }
      if(biggest24777 == 1){
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
    else {
      S22065=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread24773(int [] tdone, int [] ends){
        S22054=1;
    S21998=0;
    S21978=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 410, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
      S21978=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S21973=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 410, column: 13
        S21973=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 410, column: 13
          if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 411, column: 16
            bottleAtPos4_41.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 14
            currsigs.addElement(bottleAtPos4_41);
            S21998=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S21998=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread24772(int [] tdone, int [] ends){
        S21971=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 351, column: 13
    S21372=0;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread24769(int [] tdone, int [] ends){
        S22097=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread24768(int [] tdone, int [] ends){
        S22094=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 441, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread24767(int [] tdone, int [] ends){
        S22124=1;
    S22100=0;
    if(bottleAtPos4_41.getprestatus()){//sysj\conveyor_controller.sysj line: 438, column: 27
      thread24768(tdone,ends);
      thread24769(tdone,ends);
      int biggest24770 = 0;
      if(ends[53]>=biggest24770){
        biggest24770=ends[53];
      }
      if(ends[54]>=biggest24770){
        biggest24770=ends[54];
      }
      if(biggest24770 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S22100=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread24765(int [] tdone, int [] ends){
        S22062=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread24764(int [] tdone, int [] ends){
        S22059=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread24763(int [] tdone, int [] ends){
        S22089=1;
    S22065=0;
    if(bottleAtPos4_41.getprestatus()){//sysj\conveyor_controller.sysj line: 419, column: 39
      thread24764(tdone,ends);
      thread24765(tdone,ends);
      int biggest24766 = 0;
      if(ends[50]>=biggest24766){
        biggest24766=ends[50];
      }
      if(ends[51]>=biggest24766){
        biggest24766=ends[51];
      }
      if(biggest24766 == 1){
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
    else {
      S22065=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread24762(int [] tdone, int [] ends){
        S22054=1;
    S21998=0;
    S21978=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 410, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
      S21978=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S21973=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 410, column: 13
        S21973=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 410, column: 13
          if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 411, column: 16
            bottleAtPos4_41.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 14
            currsigs.addElement(bottleAtPos4_41);
            S21998=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S21998=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread24761(int [] tdone, int [] ends){
        S21971=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 351, column: 13
    S21372=0;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread24758(int [] tdone, int [] ends){
        S22097=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread24757(int [] tdone, int [] ends){
        S22094=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 441, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread24756(int [] tdone, int [] ends){
        S22124=1;
    S22100=0;
    if(bottleAtPos4_41.getprestatus()){//sysj\conveyor_controller.sysj line: 438, column: 27
      thread24757(tdone,ends);
      thread24758(tdone,ends);
      int biggest24759 = 0;
      if(ends[53]>=biggest24759){
        biggest24759=ends[53];
      }
      if(ends[54]>=biggest24759){
        biggest24759=ends[54];
      }
      if(biggest24759 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S22100=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread24754(int [] tdone, int [] ends){
        S22062=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread24753(int [] tdone, int [] ends){
        S22059=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread24752(int [] tdone, int [] ends){
        S22089=1;
    S22065=0;
    if(bottleAtPos4_41.getprestatus()){//sysj\conveyor_controller.sysj line: 419, column: 39
      thread24753(tdone,ends);
      thread24754(tdone,ends);
      int biggest24755 = 0;
      if(ends[50]>=biggest24755){
        biggest24755=ends[50];
      }
      if(ends[51]>=biggest24755){
        biggest24755=ends[51];
      }
      if(biggest24755 == 1){
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
    else {
      S22065=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread24751(int [] tdone, int [] ends){
        S22054=1;
    S21998=0;
    S21978=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 410, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
      S21978=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S21973=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 410, column: 13
        S21973=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 410, column: 13
          if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 411, column: 16
            bottleAtPos4_41.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 14
            currsigs.addElement(bottleAtPos4_41);
            S21998=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S21998=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread24750(int [] tdone, int [] ends){
        S21971=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 351, column: 13
    S21372=0;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread24747(int [] tdone, int [] ends){
        S22097=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread24746(int [] tdone, int [] ends){
        S22094=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 441, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread24745(int [] tdone, int [] ends){
        S22124=1;
    S22100=0;
    if(bottleAtPos4_41.getprestatus()){//sysj\conveyor_controller.sysj line: 438, column: 27
      thread24746(tdone,ends);
      thread24747(tdone,ends);
      int biggest24748 = 0;
      if(ends[53]>=biggest24748){
        biggest24748=ends[53];
      }
      if(ends[54]>=biggest24748){
        biggest24748=ends[54];
      }
      if(biggest24748 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S22100=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread24743(int [] tdone, int [] ends){
        S22062=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread24742(int [] tdone, int [] ends){
        S22059=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread24741(int [] tdone, int [] ends){
        S22089=1;
    S22065=0;
    if(bottleAtPos4_41.getprestatus()){//sysj\conveyor_controller.sysj line: 419, column: 39
      thread24742(tdone,ends);
      thread24743(tdone,ends);
      int biggest24744 = 0;
      if(ends[50]>=biggest24744){
        biggest24744=ends[50];
      }
      if(ends[51]>=biggest24744){
        biggest24744=ends[51];
      }
      if(biggest24744 == 1){
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
    else {
      S22065=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread24740(int [] tdone, int [] ends){
        S22054=1;
    S21998=0;
    S21978=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 410, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
      S21978=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      S21973=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 410, column: 13
        S21973=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 410, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 410, column: 13
          ends[48]=2;
          ;//sysj\conveyor_controller.sysj line: 410, column: 13
          if((simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 411, column: 16
            bottleAtPos4_41.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 14
            currsigs.addElement(bottleAtPos4_41);
            S21998=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
          else {
            S21998=1;
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
          }
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
      }
      else {
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
  }

  public void thread24739(int [] tdone, int [] ends){
        S21971=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 351, column: 13
    S21372=0;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S24391){
        case 0 : 
          S24391=0;
          break RUN;
        
        case 1 : 
          S24391=2;
          S24391=2;
          bottleAtPos4_41.setClear();//sysj\conveyor_controller.sysj line: 345, column: 11
          S24390=0;
          S21354=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 346, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 346, column: 11
            S21354=1;
            active[41]=1;
            ends[41]=1;
            break RUN;
          }
          else {
            S21349=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 346, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 346, column: 11
              S21349=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 346, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 346, column: 11
                ends[41]=2;
                ;//sysj\conveyor_controller.sysj line: 346, column: 11
                S24390=1;
                thread24739(tdone,ends);
                thread24740(tdone,ends);
                thread24741(tdone,ends);
                thread24745(tdone,ends);
                int biggest24749 = 0;
                if(ends[42]>=biggest24749){
                  biggest24749=ends[42];
                }
                if(ends[48]>=biggest24749){
                  biggest24749=ends[48];
                }
                if(ends[49]>=biggest24749){
                  biggest24749=ends[49];
                }
                if(ends[52]>=biggest24749){
                  biggest24749=ends[52];
                }
                if(biggest24749 == 1){
                  active[41]=1;
                  ends[41]=1;
                  break RUN;
                }
              }
              else {
                active[41]=1;
                ends[41]=1;
                break RUN;
              }
            }
            else {
              active[41]=1;
              ends[41]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_41.setClear();//sysj\conveyor_controller.sysj line: 345, column: 11
          switch(S24390){
            case 0 : 
              switch(S21354){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 346, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 346, column: 11
                    S21354=1;
                    active[41]=1;
                    ends[41]=1;
                    break RUN;
                  }
                  else {
                    switch(S21349){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 346, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 346, column: 11
                          S21349=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 346, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 346, column: 11
                            ends[41]=2;
                            ;//sysj\conveyor_controller.sysj line: 346, column: 11
                            S24390=1;
                            thread24750(tdone,ends);
                            thread24751(tdone,ends);
                            thread24752(tdone,ends);
                            thread24756(tdone,ends);
                            int biggest24760 = 0;
                            if(ends[42]>=biggest24760){
                              biggest24760=ends[42];
                            }
                            if(ends[48]>=biggest24760){
                              biggest24760=ends[48];
                            }
                            if(ends[49]>=biggest24760){
                              biggest24760=ends[49];
                            }
                            if(ends[52]>=biggest24760){
                              biggest24760=ends[52];
                            }
                            if(biggest24760 == 1){
                              active[41]=1;
                              ends[41]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[41]=1;
                            ends[41]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[41]=1;
                          ends[41]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 346, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 346, column: 11
                          ends[41]=2;
                          ;//sysj\conveyor_controller.sysj line: 346, column: 11
                          S24390=1;
                          thread24761(tdone,ends);
                          thread24762(tdone,ends);
                          thread24763(tdone,ends);
                          thread24767(tdone,ends);
                          int biggest24771 = 0;
                          if(ends[42]>=biggest24771){
                            biggest24771=ends[42];
                          }
                          if(ends[48]>=biggest24771){
                            biggest24771=ends[48];
                          }
                          if(ends[49]>=biggest24771){
                            biggest24771=ends[49];
                          }
                          if(ends[52]>=biggest24771){
                            biggest24771=ends[52];
                          }
                          if(biggest24771 == 1){
                            active[41]=1;
                            ends[41]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[41]=1;
                          ends[41]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S21354=1;
                  S21354=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 346, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 346, column: 11
                    S21354=1;
                    active[41]=1;
                    ends[41]=1;
                    break RUN;
                  }
                  else {
                    S21349=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 346, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 346, column: 11
                      S21349=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 346, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 346, column: 11
                        ends[41]=2;
                        ;//sysj\conveyor_controller.sysj line: 346, column: 11
                        S24390=1;
                        thread24772(tdone,ends);
                        thread24773(tdone,ends);
                        thread24774(tdone,ends);
                        thread24778(tdone,ends);
                        int biggest24782 = 0;
                        if(ends[42]>=biggest24782){
                          biggest24782=ends[42];
                        }
                        if(ends[48]>=biggest24782){
                          biggest24782=ends[48];
                        }
                        if(ends[49]>=biggest24782){
                          biggest24782=ends[49];
                        }
                        if(ends[52]>=biggest24782){
                          biggest24782=ends[52];
                        }
                        if(biggest24782 == 1){
                          active[41]=1;
                          ends[41]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[41]=1;
                        ends[41]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[41]=1;
                      ends[41]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread24783(tdone,ends);
              thread24798(tdone,ends);
              thread24799(tdone,ends);
              thread24806(tdone,ends);
              int biggest24813 = 0;
              if(ends[42]>=biggest24813){
                biggest24813=ends[42];
              }
              if(ends[48]>=biggest24813){
                biggest24813=ends[48];
              }
              if(ends[49]>=biggest24813){
                biggest24813=ends[49];
              }
              if(ends[52]>=biggest24813){
                biggest24813=ends[52];
              }
              if(biggest24813 == 1){
                active[41]=1;
                ends[41]=1;
                break RUN;
              }
              //FINXME code
              if(biggest24813 == 0){
                S24391=0;
                active[41]=0;
                ends[41]=0;
                S24391=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos4_41 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[41] != 0){
      int index = 41;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[41]!=0 || suspended[41]!=0 || active[41]!=1);
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
      bottleAtPos4_41.setpreclear();
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
      bottleAtPos4_41.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[41]!=0 || suspended[41]!=0 || active[41]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[41] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
