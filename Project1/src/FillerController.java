import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class FillerController extends ClockDomain{
  public FillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal fileReadSignal = new Signal("fileReadSignal", Signal.INPUT);
  public Signal ordered = new Signal("ordered", Signal.INPUT);
  public Signal orderFill_1 = new Signal("orderFill_1", Signal.INPUT);
  public Signal orderFill_2 = new Signal("orderFill_2", Signal.INPUT);
  public Signal orderFill_3 = new Signal("orderFill_3", Signal.INPUT);
  public Signal orderFill_4 = new Signal("orderFill_4", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal order_finished = new Signal("order_finished", Signal.OUTPUT);
  public input_Channel simFiller_in = new input_Channel();
  public output_Channel fillerReady_o = new output_Channel();
  private Signal filler1_59;
  private Signal filler2_59;
  private Signal filler3_59;
  private Signal filler4_59;
  private Signal done_59;
  private Signal filler1_amount_59;
  private Signal filler2_amount_59;
  private Signal filler3_amount_59;
  private Signal filler4_amount_59;
  private Signal current_fill_59;
  private Signal total_fill_59;
  private Signal bottleAtPos2_59;
  private int current_thread_60;//sysj\conveyor_controller.sysj line: 438, column: 16
  private int total_thread_60;//sysj\conveyor_controller.sysj line: 439, column: 16
  private long __start_thread_60;//sysj\conveyor_controller.sysj line: 437, column: 9
  private int S142452 = 1;
  private int S142451 = 1;
  private int S52215 = 1;
  private int S52210 = 1;
  private int S74662 = 1;
  private int S52234 = 1;
  private int S52241 = 1;
  private int S52236 = 1;
  private int S52391 = 1;
  private int S52342 = 1;
  private int S52347 = 1;
  private int S52356 = 1;
  private int S52361 = 1;
  private int S52739 = 1;
  private int S52690 = 1;
  private int S52695 = 1;
  private int S52704 = 1;
  private int S52709 = 1;
  private int S53145 = 1;
  private int S53096 = 1;
  private int S53101 = 1;
  private int S53110 = 1;
  private int S53115 = 1;
  private int S53609 = 1;
  private int S53560 = 1;
  private int S53565 = 1;
  private int S53574 = 1;
  private int S53579 = 1;
  private int S54081 = 1;
  private int S54076 = 1;
  private int S54308 = 1;
  private int S74667 = 1;
  private int S74750 = 1;
  private int S74694 = 1;
  private int S74674 = 1;
  private int S74669 = 1;
  private int S74785 = 1;
  private int S74761 = 1;
  private int S74755 = 1;
  private int S74758 = 1;
  
  private int[] ends = new int[109];
  private int[] tdone = new int[109];
  
  public void thread201950(int [] tdone, int [] ends){
        S74758=1;
    active[81]=1;
    ends[81]=1;
    tdone[81]=1;
  }

  public void thread201949(int [] tdone, int [] ends){
        S74755=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 629, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread201947(int [] tdone, int [] ends){
        switch(S74758){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        if(done_59.getprestatus()){//sysj\conveyor_controller.sysj line: 633, column: 35
          ends[81]=2;
          tdone[81]=1;
        }
        else {
          active[81]=1;
          ends[81]=1;
          tdone[81]=1;
        }
        break;
      
    }
  }

  public void thread201946(int [] tdone, int [] ends){
        switch(S74755){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 629, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[80]=1;
        ends[80]=1;
        tdone[80]=1;
        break;
      
    }
  }

  public void thread201945(int [] tdone, int [] ends){
        switch(S74785){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        switch(S74761){
          case 0 : 
            thread201946(tdone,ends);
            thread201947(tdone,ends);
            int biggest201948 = 0;
            if(ends[80]>=biggest201948){
              biggest201948=ends[80];
            }
            if(ends[81]>=biggest201948){
              biggest201948=ends[81];
            }
            if(biggest201948 == 1){
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            if(biggest201948 == 2){
              ends[79]=2;
              ;//sysj\conveyor_controller.sysj line: 627, column: 18
              S74761=1;
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            //FINXME code
            if(biggest201948 == 0){
              S74761=1;
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            break;
          
          case 1 : 
            S74761=1;
            S74761=0;
            if(bottleAtPos2_59.getprestatus()){//sysj\conveyor_controller.sysj line: 626, column: 26
              thread201949(tdone,ends);
              thread201950(tdone,ends);
              int biggest201951 = 0;
              if(ends[80]>=biggest201951){
                biggest201951=ends[80];
              }
              if(ends[81]>=biggest201951){
                biggest201951=ends[81];
              }
              if(biggest201951 == 1){
                active[79]=1;
                ends[79]=1;
                tdone[79]=1;
              }
            }
            else {
              S74761=1;
              active[79]=1;
              ends[79]=1;
              tdone[79]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread201944(int [] tdone, int [] ends){
        switch(S74750){
      case 0 : 
        active[78]=0;
        ends[78]=0;
        tdone[78]=1;
        break;
      
      case 1 : 
        switch(S74694){
          case 0 : 
            switch(S74674){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 611, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
                  S74674=1;
                  active[78]=1;
                  ends[78]=1;
                  tdone[78]=1;
                }
                else {
                  switch(S74669){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 611, column: 12
                        S74669=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
                          ends[78]=2;
                          ;//sysj\conveyor_controller.sysj line: 611, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 612, column: 15
                            bottleAtPos2_59.setPresent();//sysj\conveyor_controller.sysj line: 613, column: 13
                            currsigs.addElement(bottleAtPos2_59);
                            S74694=1;
                            active[78]=1;
                            ends[78]=1;
                            tdone[78]=1;
                          }
                          else {
                            done_59.setPresent();//sysj\conveyor_controller.sysj line: 616, column: 13
                            currsigs.addElement(done_59);
                            S74694=1;
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
                      else {
                        active[78]=1;
                        ends[78]=1;
                        tdone[78]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
                        ends[78]=2;
                        ;//sysj\conveyor_controller.sysj line: 611, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 612, column: 15
                          bottleAtPos2_59.setPresent();//sysj\conveyor_controller.sysj line: 613, column: 13
                          currsigs.addElement(bottleAtPos2_59);
                          S74694=1;
                          active[78]=1;
                          ends[78]=1;
                          tdone[78]=1;
                        }
                        else {
                          done_59.setPresent();//sysj\conveyor_controller.sysj line: 616, column: 13
                          currsigs.addElement(done_59);
                          S74694=1;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S74674=1;
                S74674=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 611, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
                  S74674=1;
                  active[78]=1;
                  ends[78]=1;
                  tdone[78]=1;
                }
                else {
                  S74669=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 611, column: 12
                    S74669=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
                      ends[78]=2;
                      ;//sysj\conveyor_controller.sysj line: 611, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 612, column: 15
                        bottleAtPos2_59.setPresent();//sysj\conveyor_controller.sysj line: 613, column: 13
                        currsigs.addElement(bottleAtPos2_59);
                        S74694=1;
                        active[78]=1;
                        ends[78]=1;
                        tdone[78]=1;
                      }
                      else {
                        done_59.setPresent();//sysj\conveyor_controller.sysj line: 616, column: 13
                        currsigs.addElement(done_59);
                        S74694=1;
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
                  else {
                    active[78]=1;
                    ends[78]=1;
                    tdone[78]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S74694=1;
            S74694=0;
            S74674=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 611, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
              S74674=1;
              active[78]=1;
              ends[78]=1;
              tdone[78]=1;
            }
            else {
              S74669=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 611, column: 12
                S74669=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
                  ends[78]=2;
                  ;//sysj\conveyor_controller.sysj line: 611, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 612, column: 15
                    bottleAtPos2_59.setPresent();//sysj\conveyor_controller.sysj line: 613, column: 13
                    currsigs.addElement(bottleAtPos2_59);
                    S74694=1;
                    active[78]=1;
                    ends[78]=1;
                    tdone[78]=1;
                  }
                  else {
                    done_59.setPresent();//sysj\conveyor_controller.sysj line: 616, column: 13
                    currsigs.addElement(done_59);
                    S74694=1;
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
              else {
                active[78]=1;
                ends[78]=1;
                tdone[78]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread201943(int [] tdone, int [] ends){
        switch(S74667){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        filler1_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 599, column: 7
        currsigs.addElement(filler1_amount_59);
        filler1_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 599, column: 7
        filler2_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 600, column: 7
        currsigs.addElement(filler2_amount_59);
        filler2_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 600, column: 7
        filler3_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 7
        currsigs.addElement(filler3_amount_59);
        filler3_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 601, column: 7
        filler4_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 602, column: 7
        currsigs.addElement(filler4_amount_59);
        filler4_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 602, column: 7
        active[77]=1;
        ends[77]=1;
        tdone[77]=1;
        break;
      
    }
  }

  public void thread201941(int [] tdone, int [] ends){
        switch(S53579){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 566, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[76]=1;
        ends[76]=1;
        tdone[76]=1;
        break;
      
    }
  }

  public void thread201940(int [] tdone, int [] ends){
        switch(S53574){
      case 0 : 
        active[75]=0;
        ends[75]=0;
        tdone[75]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 562, column: 32
        currsigs.addElement(valveInletOnOff);
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
        break;
      
    }
  }

  public void thread201938(int [] tdone, int [] ends){
        S53579=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 566, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread201937(int [] tdone, int [] ends){
        S53574=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 561, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 562, column: 32
    currsigs.addElement(valveInletOnOff);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread201935(int [] tdone, int [] ends){
        switch(S53565){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
        break;
      
    }
  }

  public void thread201934(int [] tdone, int [] ends){
        switch(S53560){
      case 0 : 
        active[73]=0;
        ends[73]=0;
        tdone[73]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 552, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[73]=1;
        ends[73]=1;
        tdone[73]=1;
        break;
      
    }
  }

  public void thread201932(int [] tdone, int [] ends){
        S53579=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 566, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread201931(int [] tdone, int [] ends){
        S53574=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 561, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 562, column: 32
    currsigs.addElement(valveInletOnOff);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread201929(int [] tdone, int [] ends){
        S53565=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread201928(int [] tdone, int [] ends){
        S53560=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 551, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 552, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread201926(int [] tdone, int [] ends){
        switch(S53115){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 536, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
        break;
      
    }
  }

  public void thread201925(int [] tdone, int [] ends){
        switch(S53110){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 32
        currsigs.addElement(valveInletOnOff);
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
        break;
      
    }
  }

  public void thread201923(int [] tdone, int [] ends){
        S53115=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 536, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread201922(int [] tdone, int [] ends){
        S53110=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 531, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 32
    currsigs.addElement(valveInletOnOff);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread201920(int [] tdone, int [] ends){
        switch(S53101){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 526, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
        break;
      
    }
  }

  public void thread201919(int [] tdone, int [] ends){
        switch(S53096){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 522, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
        break;
      
    }
  }

  public void thread201917(int [] tdone, int [] ends){
        S53115=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 536, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread201916(int [] tdone, int [] ends){
        S53110=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 531, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 32
    currsigs.addElement(valveInletOnOff);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread201914(int [] tdone, int [] ends){
        S53565=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread201913(int [] tdone, int [] ends){
        S53560=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 551, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 552, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread201911(int [] tdone, int [] ends){
        S53101=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 526, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread201910(int [] tdone, int [] ends){
        S53096=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 521, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 522, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread201908(int [] tdone, int [] ends){
        switch(S52709){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 506, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
        break;
      
    }
  }

  public void thread201907(int [] tdone, int [] ends){
        switch(S52704){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 502, column: 32
        currsigs.addElement(valveInletOnOff);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread201905(int [] tdone, int [] ends){
        S52709=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 506, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread201904(int [] tdone, int [] ends){
        S52704=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 501, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 502, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread201902(int [] tdone, int [] ends){
        switch(S52695){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 494, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread201901(int [] tdone, int [] ends){
        switch(S52690){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 490, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
        break;
      
    }
  }

  public void thread201899(int [] tdone, int [] ends){
        S52709=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 506, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread201898(int [] tdone, int [] ends){
        S52704=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 501, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 502, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread201896(int [] tdone, int [] ends){
        S53565=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread201895(int [] tdone, int [] ends){
        S53560=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 551, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 552, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread201893(int [] tdone, int [] ends){
        S53101=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 526, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread201892(int [] tdone, int [] ends){
        S53096=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 521, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 522, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread201890(int [] tdone, int [] ends){
        S52695=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 494, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread201889(int [] tdone, int [] ends){
        S52690=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 489, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 490, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread201887(int [] tdone, int [] ends){
        switch(S52361){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 474, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
        break;
      
    }
  }

  public void thread201886(int [] tdone, int [] ends){
        switch(S52356){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 32
        currsigs.addElement(valveInletOnOff);
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
        break;
      
    }
  }

  public void thread201884(int [] tdone, int [] ends){
        S52361=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 474, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread201883(int [] tdone, int [] ends){
        S52356=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 469, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread201881(int [] tdone, int [] ends){
        switch(S52347){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 464, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
        break;
      
    }
  }

  public void thread201880(int [] tdone, int [] ends){
        switch(S52342){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[61]=1;
        ends[61]=1;
        tdone[61]=1;
        break;
      
    }
  }

  public void thread201878(int [] tdone, int [] ends){
        S52361=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 474, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread201877(int [] tdone, int [] ends){
        S52356=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 469, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread201875(int [] tdone, int [] ends){
        S53565=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread201874(int [] tdone, int [] ends){
        S53560=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 551, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 552, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread201872(int [] tdone, int [] ends){
        S53101=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 526, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread201871(int [] tdone, int [] ends){
        S53096=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 521, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 522, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread201869(int [] tdone, int [] ends){
        S52695=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 494, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread201868(int [] tdone, int [] ends){
        S52690=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 489, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 490, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread201866(int [] tdone, int [] ends){
        S52347=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 464, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread201865(int [] tdone, int [] ends){
        S52342=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 459, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread201863(int [] tdone, int [] ends){
        S53565=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread201862(int [] tdone, int [] ends){
        S53560=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 551, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 552, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread201860(int [] tdone, int [] ends){
        S53101=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 526, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread201859(int [] tdone, int [] ends){
        S53096=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 521, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 522, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread201857(int [] tdone, int [] ends){
        S52695=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 494, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread201856(int [] tdone, int [] ends){
        S52690=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 489, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 490, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread201854(int [] tdone, int [] ends){
        S52347=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 464, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread201853(int [] tdone, int [] ends){
        S52342=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 459, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread201851(int [] tdone, int [] ends){
        S53565=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread201850(int [] tdone, int [] ends){
        S53560=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 551, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 552, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread201848(int [] tdone, int [] ends){
        S53101=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 526, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread201847(int [] tdone, int [] ends){
        S53096=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 521, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 522, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread201845(int [] tdone, int [] ends){
        S52695=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 494, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread201844(int [] tdone, int [] ends){
        S52690=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 489, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 490, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread201842(int [] tdone, int [] ends){
        S52347=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 464, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread201841(int [] tdone, int [] ends){
        S52342=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 459, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread201839(int [] tdone, int [] ends){
        S53565=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread201838(int [] tdone, int [] ends){
        S53560=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 551, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 552, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread201836(int [] tdone, int [] ends){
        S53101=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 526, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread201835(int [] tdone, int [] ends){
        S53096=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 521, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 522, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread201833(int [] tdone, int [] ends){
        S52695=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 494, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread201832(int [] tdone, int [] ends){
        S52690=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 489, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 490, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread201830(int [] tdone, int [] ends){
        S52347=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 464, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread201829(int [] tdone, int [] ends){
        S52342=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 459, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread201827(int [] tdone, int [] ends){
        S53565=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 556, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread201826(int [] tdone, int [] ends){
        S53560=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 551, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 552, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread201824(int [] tdone, int [] ends){
        S53101=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 526, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread201823(int [] tdone, int [] ends){
        S53096=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 521, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 522, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread201821(int [] tdone, int [] ends){
        S52695=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 494, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread201820(int [] tdone, int [] ends){
        S52690=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 489, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 490, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread201818(int [] tdone, int [] ends){
        S52347=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 464, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread201817(int [] tdone, int [] ends){
        S52342=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 459, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread201816(int [] tdone, int [] ends){
        switch(S74662){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        switch(S52234){
          case 0 : 
            if(bottleAtPos2_59.getprestatus()){//sysj\conveyor_controller.sysj line: 448, column: 26
              S52234=1;
              S52241=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 449, column: 20
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 449, column: 20
                S52241=1;
                active[60]=1;
                ends[60]=1;
                tdone[60]=1;
              }
              else {
                S52236=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 449, column: 20
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 449, column: 20
                  S52236=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 449, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 449, column: 20
                    ends[60]=2;
                    ;//sysj\conveyor_controller.sysj line: 449, column: 20
                    S52234=2;
                    __start_thread_60 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 437, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_60 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 437, column: 9
                      ends[60]=2;
                      ;//sysj\conveyor_controller.sysj line: 437, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 452, column: 20
                      S52234=3;
                      if(((filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 455, column: 24
                        S52391=0;
                        thread201817(tdone,ends);
                        thread201818(tdone,ends);
                        int biggest201819 = 0;
                        if(ends[61]>=biggest201819){
                          biggest201819=ends[61];
                        }
                        if(ends[62]>=biggest201819){
                          biggest201819=ends[62];
                        }
                        if(biggest201819 == 1){
                          active[60]=1;
                          ends[60]=1;
                          tdone[60]=1;
                        }
                      }
                      else {
                        S52234=4;
                        if(((filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 485, column: 24
                          S52739=0;
                          thread201820(tdone,ends);
                          thread201821(tdone,ends);
                          int biggest201822 = 0;
                          if(ends[65]>=biggest201822){
                            biggest201822=ends[65];
                          }
                          if(ends[66]>=biggest201822){
                            biggest201822=ends[66];
                          }
                          if(biggest201822 == 1){
                            active[60]=1;
                            ends[60]=1;
                            tdone[60]=1;
                          }
                        }
                        else {
                          S52234=5;
                          if(((filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 517, column: 24
                            S53145=0;
                            thread201823(tdone,ends);
                            thread201824(tdone,ends);
                            int biggest201825 = 0;
                            if(ends[69]>=biggest201825){
                              biggest201825=ends[69];
                            }
                            if(ends[70]>=biggest201825){
                              biggest201825=ends[70];
                            }
                            if(biggest201825 == 1){
                              active[60]=1;
                              ends[60]=1;
                              tdone[60]=1;
                            }
                          }
                          else {
                            S52234=6;
                            if(((filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 547, column: 24
                              S53609=0;
                              thread201826(tdone,ends);
                              thread201827(tdone,ends);
                              int biggest201828 = 0;
                              if(ends[73]>=biggest201828){
                                biggest201828=ends[73];
                              }
                              if(ends[74]>=biggest201828){
                                biggest201828=ends[74];
                              }
                              if(biggest201828 == 1){
                                active[60]=1;
                                ends[60]=1;
                                tdone[60]=1;
                              }
                            }
                            else {
                              current_thread_60 = 0;//sysj\conveyor_controller.sysj line: 578, column: 20
                              current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 579, column: 20
                              currsigs.addElement(current_fill_59);
                              current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 579, column: 20
                              S52234=7;
                              S54081=0;
                              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 581, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                                S54081=1;
                                active[60]=1;
                                ends[60]=1;
                                tdone[60]=1;
                              }
                              else {
                                S54076=0;
                                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 581, column: 20
                                  S54076=1;
                                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                                    ends[60]=2;
                                    ;//sysj\conveyor_controller.sysj line: 581, column: 20
                                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 582, column: 20
                                    S52234=8;
                                    S54308=0;
                                    active[60]=1;
                                    ends[60]=1;
                                    tdone[60]=1;
                                  }
                                  else {
                                    active[60]=1;
                                    ends[60]=1;
                                    tdone[60]=1;
                                  }
                                }
                                else {
                                  active[60]=1;
                                  ends[60]=1;
                                  tdone[60]=1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    else {
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                  }
                  else {
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                else {
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
              }
            }
            else {
              active[60]=1;
              ends[60]=1;
              tdone[60]=1;
            }
            break;
          
          case 1 : 
            switch(S52241){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 449, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 449, column: 20
                  S52241=1;
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
                else {
                  switch(S52236){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 449, column: 20
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 449, column: 20
                        S52236=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 449, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 449, column: 20
                          ends[60]=2;
                          ;//sysj\conveyor_controller.sysj line: 449, column: 20
                          S52234=2;
                          __start_thread_60 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 437, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_60 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 437, column: 9
                            ends[60]=2;
                            ;//sysj\conveyor_controller.sysj line: 437, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 452, column: 20
                            S52234=3;
                            if(((filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 455, column: 24
                              S52391=0;
                              thread201829(tdone,ends);
                              thread201830(tdone,ends);
                              int biggest201831 = 0;
                              if(ends[61]>=biggest201831){
                                biggest201831=ends[61];
                              }
                              if(ends[62]>=biggest201831){
                                biggest201831=ends[62];
                              }
                              if(biggest201831 == 1){
                                active[60]=1;
                                ends[60]=1;
                                tdone[60]=1;
                              }
                            }
                            else {
                              S52234=4;
                              if(((filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 485, column: 24
                                S52739=0;
                                thread201832(tdone,ends);
                                thread201833(tdone,ends);
                                int biggest201834 = 0;
                                if(ends[65]>=biggest201834){
                                  biggest201834=ends[65];
                                }
                                if(ends[66]>=biggest201834){
                                  biggest201834=ends[66];
                                }
                                if(biggest201834 == 1){
                                  active[60]=1;
                                  ends[60]=1;
                                  tdone[60]=1;
                                }
                              }
                              else {
                                S52234=5;
                                if(((filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 517, column: 24
                                  S53145=0;
                                  thread201835(tdone,ends);
                                  thread201836(tdone,ends);
                                  int biggest201837 = 0;
                                  if(ends[69]>=biggest201837){
                                    biggest201837=ends[69];
                                  }
                                  if(ends[70]>=biggest201837){
                                    biggest201837=ends[70];
                                  }
                                  if(biggest201837 == 1){
                                    active[60]=1;
                                    ends[60]=1;
                                    tdone[60]=1;
                                  }
                                }
                                else {
                                  S52234=6;
                                  if(((filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 547, column: 24
                                    S53609=0;
                                    thread201838(tdone,ends);
                                    thread201839(tdone,ends);
                                    int biggest201840 = 0;
                                    if(ends[73]>=biggest201840){
                                      biggest201840=ends[73];
                                    }
                                    if(ends[74]>=biggest201840){
                                      biggest201840=ends[74];
                                    }
                                    if(biggest201840 == 1){
                                      active[60]=1;
                                      ends[60]=1;
                                      tdone[60]=1;
                                    }
                                  }
                                  else {
                                    current_thread_60 = 0;//sysj\conveyor_controller.sysj line: 578, column: 20
                                    current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 579, column: 20
                                    currsigs.addElement(current_fill_59);
                                    current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 579, column: 20
                                    S52234=7;
                                    S54081=0;
                                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 581, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                                      S54081=1;
                                      active[60]=1;
                                      ends[60]=1;
                                      tdone[60]=1;
                                    }
                                    else {
                                      S54076=0;
                                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 581, column: 20
                                        S54076=1;
                                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                                          ends[60]=2;
                                          ;//sysj\conveyor_controller.sysj line: 581, column: 20
                                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 582, column: 20
                                          S52234=8;
                                          S54308=0;
                                          active[60]=1;
                                          ends[60]=1;
                                          tdone[60]=1;
                                        }
                                        else {
                                          active[60]=1;
                                          ends[60]=1;
                                          tdone[60]=1;
                                        }
                                      }
                                      else {
                                        active[60]=1;
                                        ends[60]=1;
                                        tdone[60]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            active[60]=1;
                            ends[60]=1;
                            tdone[60]=1;
                          }
                        }
                        else {
                          active[60]=1;
                          ends[60]=1;
                          tdone[60]=1;
                        }
                      }
                      else {
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 449, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 449, column: 20
                        ends[60]=2;
                        ;//sysj\conveyor_controller.sysj line: 449, column: 20
                        S52234=2;
                        __start_thread_60 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 437, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_60 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 437, column: 9
                          ends[60]=2;
                          ;//sysj\conveyor_controller.sysj line: 437, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 452, column: 20
                          S52234=3;
                          if(((filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 455, column: 24
                            S52391=0;
                            thread201841(tdone,ends);
                            thread201842(tdone,ends);
                            int biggest201843 = 0;
                            if(ends[61]>=biggest201843){
                              biggest201843=ends[61];
                            }
                            if(ends[62]>=biggest201843){
                              biggest201843=ends[62];
                            }
                            if(biggest201843 == 1){
                              active[60]=1;
                              ends[60]=1;
                              tdone[60]=1;
                            }
                          }
                          else {
                            S52234=4;
                            if(((filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 485, column: 24
                              S52739=0;
                              thread201844(tdone,ends);
                              thread201845(tdone,ends);
                              int biggest201846 = 0;
                              if(ends[65]>=biggest201846){
                                biggest201846=ends[65];
                              }
                              if(ends[66]>=biggest201846){
                                biggest201846=ends[66];
                              }
                              if(biggest201846 == 1){
                                active[60]=1;
                                ends[60]=1;
                                tdone[60]=1;
                              }
                            }
                            else {
                              S52234=5;
                              if(((filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 517, column: 24
                                S53145=0;
                                thread201847(tdone,ends);
                                thread201848(tdone,ends);
                                int biggest201849 = 0;
                                if(ends[69]>=biggest201849){
                                  biggest201849=ends[69];
                                }
                                if(ends[70]>=biggest201849){
                                  biggest201849=ends[70];
                                }
                                if(biggest201849 == 1){
                                  active[60]=1;
                                  ends[60]=1;
                                  tdone[60]=1;
                                }
                              }
                              else {
                                S52234=6;
                                if(((filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 547, column: 24
                                  S53609=0;
                                  thread201850(tdone,ends);
                                  thread201851(tdone,ends);
                                  int biggest201852 = 0;
                                  if(ends[73]>=biggest201852){
                                    biggest201852=ends[73];
                                  }
                                  if(ends[74]>=biggest201852){
                                    biggest201852=ends[74];
                                  }
                                  if(biggest201852 == 1){
                                    active[60]=1;
                                    ends[60]=1;
                                    tdone[60]=1;
                                  }
                                }
                                else {
                                  current_thread_60 = 0;//sysj\conveyor_controller.sysj line: 578, column: 20
                                  current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 579, column: 20
                                  currsigs.addElement(current_fill_59);
                                  current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 579, column: 20
                                  S52234=7;
                                  S54081=0;
                                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 581, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                                    S54081=1;
                                    active[60]=1;
                                    ends[60]=1;
                                    tdone[60]=1;
                                  }
                                  else {
                                    S54076=0;
                                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 581, column: 20
                                      S54076=1;
                                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                                        ends[60]=2;
                                        ;//sysj\conveyor_controller.sysj line: 581, column: 20
                                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 582, column: 20
                                        S52234=8;
                                        S54308=0;
                                        active[60]=1;
                                        ends[60]=1;
                                        tdone[60]=1;
                                      }
                                      else {
                                        active[60]=1;
                                        ends[60]=1;
                                        tdone[60]=1;
                                      }
                                    }
                                    else {
                                      active[60]=1;
                                      ends[60]=1;
                                      tdone[60]=1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[60]=1;
                          ends[60]=1;
                          tdone[60]=1;
                        }
                      }
                      else {
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S52241=1;
                S52241=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 449, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 449, column: 20
                  S52241=1;
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
                else {
                  S52236=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 449, column: 20
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 449, column: 20
                    S52236=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 449, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 449, column: 20
                      ends[60]=2;
                      ;//sysj\conveyor_controller.sysj line: 449, column: 20
                      S52234=2;
                      __start_thread_60 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 437, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_60 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 437, column: 9
                        ends[60]=2;
                        ;//sysj\conveyor_controller.sysj line: 437, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 452, column: 20
                        S52234=3;
                        if(((filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 455, column: 24
                          S52391=0;
                          thread201853(tdone,ends);
                          thread201854(tdone,ends);
                          int biggest201855 = 0;
                          if(ends[61]>=biggest201855){
                            biggest201855=ends[61];
                          }
                          if(ends[62]>=biggest201855){
                            biggest201855=ends[62];
                          }
                          if(biggest201855 == 1){
                            active[60]=1;
                            ends[60]=1;
                            tdone[60]=1;
                          }
                        }
                        else {
                          S52234=4;
                          if(((filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 485, column: 24
                            S52739=0;
                            thread201856(tdone,ends);
                            thread201857(tdone,ends);
                            int biggest201858 = 0;
                            if(ends[65]>=biggest201858){
                              biggest201858=ends[65];
                            }
                            if(ends[66]>=biggest201858){
                              biggest201858=ends[66];
                            }
                            if(biggest201858 == 1){
                              active[60]=1;
                              ends[60]=1;
                              tdone[60]=1;
                            }
                          }
                          else {
                            S52234=5;
                            if(((filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 517, column: 24
                              S53145=0;
                              thread201859(tdone,ends);
                              thread201860(tdone,ends);
                              int biggest201861 = 0;
                              if(ends[69]>=biggest201861){
                                biggest201861=ends[69];
                              }
                              if(ends[70]>=biggest201861){
                                biggest201861=ends[70];
                              }
                              if(biggest201861 == 1){
                                active[60]=1;
                                ends[60]=1;
                                tdone[60]=1;
                              }
                            }
                            else {
                              S52234=6;
                              if(((filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 547, column: 24
                                S53609=0;
                                thread201862(tdone,ends);
                                thread201863(tdone,ends);
                                int biggest201864 = 0;
                                if(ends[73]>=biggest201864){
                                  biggest201864=ends[73];
                                }
                                if(ends[74]>=biggest201864){
                                  biggest201864=ends[74];
                                }
                                if(biggest201864 == 1){
                                  active[60]=1;
                                  ends[60]=1;
                                  tdone[60]=1;
                                }
                              }
                              else {
                                current_thread_60 = 0;//sysj\conveyor_controller.sysj line: 578, column: 20
                                current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 579, column: 20
                                currsigs.addElement(current_fill_59);
                                current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 579, column: 20
                                S52234=7;
                                S54081=0;
                                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 581, column: 20
                                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                                  S54081=1;
                                  active[60]=1;
                                  ends[60]=1;
                                  tdone[60]=1;
                                }
                                else {
                                  S54076=0;
                                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 581, column: 20
                                    S54076=1;
                                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                                      ends[60]=2;
                                      ;//sysj\conveyor_controller.sysj line: 581, column: 20
                                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 582, column: 20
                                      S52234=8;
                                      S54308=0;
                                      active[60]=1;
                                      ends[60]=1;
                                      tdone[60]=1;
                                    }
                                    else {
                                      active[60]=1;
                                      ends[60]=1;
                                      tdone[60]=1;
                                    }
                                  }
                                  else {
                                    active[60]=1;
                                    ends[60]=1;
                                    tdone[60]=1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      else {
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                    }
                    else {
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                  }
                  else {
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_60 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 437, column: 9
              ends[60]=2;
              ;//sysj\conveyor_controller.sysj line: 437, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 452, column: 20
              S52234=3;
              if(((filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 455, column: 24
                S52391=0;
                thread201865(tdone,ends);
                thread201866(tdone,ends);
                int biggest201867 = 0;
                if(ends[61]>=biggest201867){
                  biggest201867=ends[61];
                }
                if(ends[62]>=biggest201867){
                  biggest201867=ends[62];
                }
                if(biggest201867 == 1){
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
              }
              else {
                S52234=4;
                if(((filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 485, column: 24
                  S52739=0;
                  thread201868(tdone,ends);
                  thread201869(tdone,ends);
                  int biggest201870 = 0;
                  if(ends[65]>=biggest201870){
                    biggest201870=ends[65];
                  }
                  if(ends[66]>=biggest201870){
                    biggest201870=ends[66];
                  }
                  if(biggest201870 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                else {
                  S52234=5;
                  if(((filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 517, column: 24
                    S53145=0;
                    thread201871(tdone,ends);
                    thread201872(tdone,ends);
                    int biggest201873 = 0;
                    if(ends[69]>=biggest201873){
                      biggest201873=ends[69];
                    }
                    if(ends[70]>=biggest201873){
                      biggest201873=ends[70];
                    }
                    if(biggest201873 == 1){
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                  }
                  else {
                    S52234=6;
                    if(((filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 547, column: 24
                      S53609=0;
                      thread201874(tdone,ends);
                      thread201875(tdone,ends);
                      int biggest201876 = 0;
                      if(ends[73]>=biggest201876){
                        biggest201876=ends[73];
                      }
                      if(ends[74]>=biggest201876){
                        biggest201876=ends[74];
                      }
                      if(biggest201876 == 1){
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                    }
                    else {
                      current_thread_60 = 0;//sysj\conveyor_controller.sysj line: 578, column: 20
                      current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 579, column: 20
                      currsigs.addElement(current_fill_59);
                      current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 579, column: 20
                      S52234=7;
                      S54081=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 581, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                        S54081=1;
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                      else {
                        S54076=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 581, column: 20
                          S54076=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                            ends[60]=2;
                            ;//sysj\conveyor_controller.sysj line: 581, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 582, column: 20
                            S52234=8;
                            S54308=0;
                            active[60]=1;
                            ends[60]=1;
                            tdone[60]=1;
                          }
                          else {
                            active[60]=1;
                            ends[60]=1;
                            tdone[60]=1;
                          }
                        }
                        else {
                          active[60]=1;
                          ends[60]=1;
                          tdone[60]=1;
                        }
                      }
                    }
                  }
                }
              }
            }
            else {
              active[60]=1;
              ends[60]=1;
              tdone[60]=1;
            }
            break;
          
          case 3 : 
            switch(S52391){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 457, column: 30
                  S52391=1;
                  thread201877(tdone,ends);
                  thread201878(tdone,ends);
                  int biggest201879 = 0;
                  if(ends[63]>=biggest201879){
                    biggest201879=ends[63];
                  }
                  if(ends[64]>=biggest201879){
                    biggest201879=ends[64];
                  }
                  if(biggest201879 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                else {
                  thread201880(tdone,ends);
                  thread201881(tdone,ends);
                  int biggest201882 = 0;
                  if(ends[61]>=biggest201882){
                    biggest201882=ends[61];
                  }
                  if(ends[62]>=biggest201882){
                    biggest201882=ends[62];
                  }
                  if(biggest201882 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                  //FINXME code
                  if(biggest201882 == 0){
                    S52391=1;
                    thread201883(tdone,ends);
                    thread201884(tdone,ends);
                    int biggest201885 = 0;
                    if(ends[63]>=biggest201885){
                      biggest201885=ends[63];
                    }
                    if(ends[64]>=biggest201885){
                      biggest201885=ends[64];
                    }
                    if(biggest201885 == 1){
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 467, column: 30
                  System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 478, column: 24
                  current_thread_60 += (filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 479, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_60);//sysj\conveyor_controller.sysj line: 480, column: 24
                  current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 481, column: 24
                  currsigs.addElement(current_fill_59);
                  current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 481, column: 24
                  S52391=2;
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
                else {
                  thread201886(tdone,ends);
                  thread201887(tdone,ends);
                  int biggest201888 = 0;
                  if(ends[63]>=biggest201888){
                    biggest201888=ends[63];
                  }
                  if(ends[64]>=biggest201888){
                    biggest201888=ends[64];
                  }
                  if(biggest201888 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                  //FINXME code
                  if(biggest201888 == 0){
                    System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 478, column: 24
                    current_thread_60 += (filler1_amount_59.getpreval() == null ? 0 : ((Integer)filler1_amount_59.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 479, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_60);//sysj\conveyor_controller.sysj line: 480, column: 24
                    current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 481, column: 24
                    currsigs.addElement(current_fill_59);
                    current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 481, column: 24
                    S52391=2;
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                break;
              
              case 2 : 
                S52391=2;
                S52234=4;
                if(((filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 485, column: 24
                  S52739=0;
                  thread201889(tdone,ends);
                  thread201890(tdone,ends);
                  int biggest201891 = 0;
                  if(ends[65]>=biggest201891){
                    biggest201891=ends[65];
                  }
                  if(ends[66]>=biggest201891){
                    biggest201891=ends[66];
                  }
                  if(biggest201891 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                else {
                  S52234=5;
                  if(((filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 517, column: 24
                    S53145=0;
                    thread201892(tdone,ends);
                    thread201893(tdone,ends);
                    int biggest201894 = 0;
                    if(ends[69]>=biggest201894){
                      biggest201894=ends[69];
                    }
                    if(ends[70]>=biggest201894){
                      biggest201894=ends[70];
                    }
                    if(biggest201894 == 1){
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                  }
                  else {
                    S52234=6;
                    if(((filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 547, column: 24
                      S53609=0;
                      thread201895(tdone,ends);
                      thread201896(tdone,ends);
                      int biggest201897 = 0;
                      if(ends[73]>=biggest201897){
                        biggest201897=ends[73];
                      }
                      if(ends[74]>=biggest201897){
                        biggest201897=ends[74];
                      }
                      if(biggest201897 == 1){
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                    }
                    else {
                      current_thread_60 = 0;//sysj\conveyor_controller.sysj line: 578, column: 20
                      current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 579, column: 20
                      currsigs.addElement(current_fill_59);
                      current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 579, column: 20
                      S52234=7;
                      S54081=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 581, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                        S54081=1;
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                      else {
                        S54076=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 581, column: 20
                          S54076=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                            ends[60]=2;
                            ;//sysj\conveyor_controller.sysj line: 581, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 582, column: 20
                            S52234=8;
                            S54308=0;
                            active[60]=1;
                            ends[60]=1;
                            tdone[60]=1;
                          }
                          else {
                            active[60]=1;
                            ends[60]=1;
                            tdone[60]=1;
                          }
                        }
                        else {
                          active[60]=1;
                          ends[60]=1;
                          tdone[60]=1;
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            switch(S52739){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 487, column: 30
                  S52739=1;
                  thread201898(tdone,ends);
                  thread201899(tdone,ends);
                  int biggest201900 = 0;
                  if(ends[67]>=biggest201900){
                    biggest201900=ends[67];
                  }
                  if(ends[68]>=biggest201900){
                    biggest201900=ends[68];
                  }
                  if(biggest201900 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                else {
                  thread201901(tdone,ends);
                  thread201902(tdone,ends);
                  int biggest201903 = 0;
                  if(ends[65]>=biggest201903){
                    biggest201903=ends[65];
                  }
                  if(ends[66]>=biggest201903){
                    biggest201903=ends[66];
                  }
                  if(biggest201903 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                  //FINXME code
                  if(biggest201903 == 0){
                    S52739=1;
                    thread201904(tdone,ends);
                    thread201905(tdone,ends);
                    int biggest201906 = 0;
                    if(ends[67]>=biggest201906){
                      biggest201906=ends[67];
                    }
                    if(ends[68]>=biggest201906){
                      biggest201906=ends[68];
                    }
                    if(biggest201906 == 1){
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 499, column: 30
                  System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 510, column: 24
                  current_thread_60 += (filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 511, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_60);//sysj\conveyor_controller.sysj line: 512, column: 24
                  current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 24
                  currsigs.addElement(current_fill_59);
                  current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 513, column: 24
                  S52739=2;
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
                else {
                  thread201907(tdone,ends);
                  thread201908(tdone,ends);
                  int biggest201909 = 0;
                  if(ends[67]>=biggest201909){
                    biggest201909=ends[67];
                  }
                  if(ends[68]>=biggest201909){
                    biggest201909=ends[68];
                  }
                  if(biggest201909 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                  //FINXME code
                  if(biggest201909 == 0){
                    System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 510, column: 24
                    current_thread_60 += (filler2_amount_59.getpreval() == null ? 0 : ((Integer)filler2_amount_59.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 511, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_60);//sysj\conveyor_controller.sysj line: 512, column: 24
                    current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 24
                    currsigs.addElement(current_fill_59);
                    current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 513, column: 24
                    S52739=2;
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                break;
              
              case 2 : 
                S52739=2;
                S52234=5;
                if(((filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 517, column: 24
                  S53145=0;
                  thread201910(tdone,ends);
                  thread201911(tdone,ends);
                  int biggest201912 = 0;
                  if(ends[69]>=biggest201912){
                    biggest201912=ends[69];
                  }
                  if(ends[70]>=biggest201912){
                    biggest201912=ends[70];
                  }
                  if(biggest201912 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                else {
                  S52234=6;
                  if(((filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 547, column: 24
                    S53609=0;
                    thread201913(tdone,ends);
                    thread201914(tdone,ends);
                    int biggest201915 = 0;
                    if(ends[73]>=biggest201915){
                      biggest201915=ends[73];
                    }
                    if(ends[74]>=biggest201915){
                      biggest201915=ends[74];
                    }
                    if(biggest201915 == 1){
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                  }
                  else {
                    current_thread_60 = 0;//sysj\conveyor_controller.sysj line: 578, column: 20
                    current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 579, column: 20
                    currsigs.addElement(current_fill_59);
                    current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 579, column: 20
                    S52234=7;
                    S54081=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 581, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                      S54081=1;
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                    else {
                      S54076=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 581, column: 20
                        S54076=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                          ends[60]=2;
                          ;//sysj\conveyor_controller.sysj line: 581, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 582, column: 20
                          S52234=8;
                          S54308=0;
                          active[60]=1;
                          ends[60]=1;
                          tdone[60]=1;
                        }
                        else {
                          active[60]=1;
                          ends[60]=1;
                          tdone[60]=1;
                        }
                      }
                      else {
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            switch(S53145){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 519, column: 30
                  S53145=1;
                  thread201916(tdone,ends);
                  thread201917(tdone,ends);
                  int biggest201918 = 0;
                  if(ends[71]>=biggest201918){
                    biggest201918=ends[71];
                  }
                  if(ends[72]>=biggest201918){
                    biggest201918=ends[72];
                  }
                  if(biggest201918 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                else {
                  thread201919(tdone,ends);
                  thread201920(tdone,ends);
                  int biggest201921 = 0;
                  if(ends[69]>=biggest201921){
                    biggest201921=ends[69];
                  }
                  if(ends[70]>=biggest201921){
                    biggest201921=ends[70];
                  }
                  if(biggest201921 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                  //FINXME code
                  if(biggest201921 == 0){
                    S53145=1;
                    thread201922(tdone,ends);
                    thread201923(tdone,ends);
                    int biggest201924 = 0;
                    if(ends[71]>=biggest201924){
                      biggest201924=ends[71];
                    }
                    if(ends[72]>=biggest201924){
                      biggest201924=ends[72];
                    }
                    if(biggest201924 == 1){
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 529, column: 30
                  System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 540, column: 24
                  current_thread_60 += (filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 541, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_60);//sysj\conveyor_controller.sysj line: 542, column: 24
                  current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 543, column: 24
                  currsigs.addElement(current_fill_59);
                  current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 543, column: 24
                  S53145=2;
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
                else {
                  thread201925(tdone,ends);
                  thread201926(tdone,ends);
                  int biggest201927 = 0;
                  if(ends[71]>=biggest201927){
                    biggest201927=ends[71];
                  }
                  if(ends[72]>=biggest201927){
                    biggest201927=ends[72];
                  }
                  if(biggest201927 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                  //FINXME code
                  if(biggest201927 == 0){
                    System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 540, column: 24
                    current_thread_60 += (filler3_amount_59.getpreval() == null ? 0 : ((Integer)filler3_amount_59.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 541, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_60);//sysj\conveyor_controller.sysj line: 542, column: 24
                    current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 543, column: 24
                    currsigs.addElement(current_fill_59);
                    current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 543, column: 24
                    S53145=2;
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                break;
              
              case 2 : 
                S53145=2;
                S52234=6;
                if(((filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) > 0) && (current_thread_60 + (filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()) <= total_thread_60)){//sysj\conveyor_controller.sysj line: 547, column: 24
                  S53609=0;
                  thread201928(tdone,ends);
                  thread201929(tdone,ends);
                  int biggest201930 = 0;
                  if(ends[73]>=biggest201930){
                    biggest201930=ends[73];
                  }
                  if(ends[74]>=biggest201930){
                    biggest201930=ends[74];
                  }
                  if(biggest201930 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                else {
                  current_thread_60 = 0;//sysj\conveyor_controller.sysj line: 578, column: 20
                  current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 579, column: 20
                  currsigs.addElement(current_fill_59);
                  current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 579, column: 20
                  S52234=7;
                  S54081=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 581, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                    S54081=1;
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                  else {
                    S54076=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 581, column: 20
                      S54076=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                        ends[60]=2;
                        ;//sysj\conveyor_controller.sysj line: 581, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 582, column: 20
                        S52234=8;
                        S54308=0;
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                      else {
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                    }
                    else {
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S53609){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 549, column: 30
                  S53609=1;
                  thread201931(tdone,ends);
                  thread201932(tdone,ends);
                  int biggest201933 = 0;
                  if(ends[75]>=biggest201933){
                    biggest201933=ends[75];
                  }
                  if(ends[76]>=biggest201933){
                    biggest201933=ends[76];
                  }
                  if(biggest201933 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                else {
                  thread201934(tdone,ends);
                  thread201935(tdone,ends);
                  int biggest201936 = 0;
                  if(ends[73]>=biggest201936){
                    biggest201936=ends[73];
                  }
                  if(ends[74]>=biggest201936){
                    biggest201936=ends[74];
                  }
                  if(biggest201936 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                  //FINXME code
                  if(biggest201936 == 0){
                    S53609=1;
                    thread201937(tdone,ends);
                    thread201938(tdone,ends);
                    int biggest201939 = 0;
                    if(ends[75]>=biggest201939){
                      biggest201939=ends[75];
                    }
                    if(ends[76]>=biggest201939){
                      biggest201939=ends[76];
                    }
                    if(biggest201939 == 1){
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 559, column: 30
                  System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 570, column: 24
                  current_thread_60 += (filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 571, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_60);//sysj\conveyor_controller.sysj line: 572, column: 24
                  S53609=2;
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
                else {
                  thread201940(tdone,ends);
                  thread201941(tdone,ends);
                  int biggest201942 = 0;
                  if(ends[75]>=biggest201942){
                    biggest201942=ends[75];
                  }
                  if(ends[76]>=biggest201942){
                    biggest201942=ends[76];
                  }
                  if(biggest201942 == 1){
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                  //FINXME code
                  if(biggest201942 == 0){
                    System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 570, column: 24
                    current_thread_60 += (filler4_amount_59.getpreval() == null ? 0 : ((Integer)filler4_amount_59.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 571, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_60);//sysj\conveyor_controller.sysj line: 572, column: 24
                    S53609=2;
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                break;
              
              case 2 : 
                S53609=2;
                current_thread_60 = 0;//sysj\conveyor_controller.sysj line: 578, column: 20
                current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 579, column: 20
                currsigs.addElement(current_fill_59);
                current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 579, column: 20
                S52234=7;
                S54081=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 581, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                  S54081=1;
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
                else {
                  S54076=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 581, column: 20
                    S54076=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                      ends[60]=2;
                      ;//sysj\conveyor_controller.sysj line: 581, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 582, column: 20
                      S52234=8;
                      S54308=0;
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                    else {
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                  }
                  else {
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 7 : 
            switch(S54081){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 581, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                  S54081=1;
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
                else {
                  switch(S54076){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 581, column: 20
                        S54076=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                          ends[60]=2;
                          ;//sysj\conveyor_controller.sysj line: 581, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 582, column: 20
                          S52234=8;
                          S54308=0;
                          active[60]=1;
                          ends[60]=1;
                          tdone[60]=1;
                        }
                        else {
                          active[60]=1;
                          ends[60]=1;
                          tdone[60]=1;
                        }
                      }
                      else {
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                        ends[60]=2;
                        ;//sysj\conveyor_controller.sysj line: 581, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 582, column: 20
                        S52234=8;
                        S54308=0;
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                      else {
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S54081=1;
                S54081=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 581, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                  S54081=1;
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
                else {
                  S54076=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 581, column: 20
                    S54076=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 581, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 581, column: 20
                      ends[60]=2;
                      ;//sysj\conveyor_controller.sysj line: 581, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 582, column: 20
                      S52234=8;
                      S54308=0;
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                    else {
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                  }
                  else {
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S54308){
              case 0 : 
                if(!bottleAtPos2_59.getprestatus()){//sysj\conveyor_controller.sysj line: 585, column: 30
                  S54308=1;
                  if(bottleAtPos2_59.getprestatus()){//sysj\conveyor_controller.sysj line: 587, column: 36
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                  else {
                    ends[60]=2;
                    ;//sysj\conveyor_controller.sysj line: 584, column: 20
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 447, column: 20
                    S52234=0;
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
                else {
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_59.getprestatus()){//sysj\conveyor_controller.sysj line: 587, column: 36
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
                else {
                  ends[60]=2;
                  ;//sysj\conveyor_controller.sysj line: 584, column: 20
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 447, column: 20
                  S52234=0;
                  active[60]=1;
                  ends[60]=1;
                  tdone[60]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread201813(int [] tdone, int [] ends){
        S74758=1;
    active[81]=1;
    ends[81]=1;
    tdone[81]=1;
  }

  public void thread201812(int [] tdone, int [] ends){
        S74755=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 629, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread201811(int [] tdone, int [] ends){
        S74785=1;
    S74761=0;
    if(bottleAtPos2_59.getprestatus()){//sysj\conveyor_controller.sysj line: 626, column: 26
      thread201812(tdone,ends);
      thread201813(tdone,ends);
      int biggest201814 = 0;
      if(ends[80]>=biggest201814){
        biggest201814=ends[80];
      }
      if(ends[81]>=biggest201814){
        biggest201814=ends[81];
      }
      if(biggest201814 == 1){
        active[79]=1;
        ends[79]=1;
        tdone[79]=1;
      }
    }
    else {
      S74761=1;
      active[79]=1;
      ends[79]=1;
      tdone[79]=1;
    }
  }

  public void thread201810(int [] tdone, int [] ends){
        S74750=1;
    S74694=0;
    S74674=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 611, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
      S74674=1;
      active[78]=1;
      ends[78]=1;
      tdone[78]=1;
    }
    else {
      S74669=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 611, column: 12
        S74669=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
          ends[78]=2;
          ;//sysj\conveyor_controller.sysj line: 611, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 612, column: 15
            bottleAtPos2_59.setPresent();//sysj\conveyor_controller.sysj line: 613, column: 13
            currsigs.addElement(bottleAtPos2_59);
            S74694=1;
            active[78]=1;
            ends[78]=1;
            tdone[78]=1;
          }
          else {
            done_59.setPresent();//sysj\conveyor_controller.sysj line: 616, column: 13
            currsigs.addElement(done_59);
            S74694=1;
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
      else {
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
      }
    }
  }

  public void thread201809(int [] tdone, int [] ends){
        S74667=1;
    filler1_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 599, column: 7
    currsigs.addElement(filler1_amount_59);
    filler1_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 599, column: 7
    filler2_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 600, column: 7
    currsigs.addElement(filler2_amount_59);
    filler2_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 600, column: 7
    filler3_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 7
    currsigs.addElement(filler3_amount_59);
    filler3_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 601, column: 7
    filler4_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 602, column: 7
    currsigs.addElement(filler4_amount_59);
    filler4_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 602, column: 7
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread201808(int [] tdone, int [] ends){
        S74662=1;
    current_thread_60 = 0;//sysj\conveyor_controller.sysj line: 438, column: 16
    total_thread_60 = 100;//sysj\conveyor_controller.sysj line: 439, column: 16
    total_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 16
    currsigs.addElement(total_fill_59);
    total_fill_59.setValue(total_thread_60);//sysj\conveyor_controller.sysj line: 440, column: 16
    current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 441, column: 16
    currsigs.addElement(current_fill_59);
    current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 441, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 447, column: 20
    S52234=0;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread201805(int [] tdone, int [] ends){
        S74758=1;
    active[81]=1;
    ends[81]=1;
    tdone[81]=1;
  }

  public void thread201804(int [] tdone, int [] ends){
        S74755=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 629, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread201803(int [] tdone, int [] ends){
        S74785=1;
    S74761=0;
    if(bottleAtPos2_59.getprestatus()){//sysj\conveyor_controller.sysj line: 626, column: 26
      thread201804(tdone,ends);
      thread201805(tdone,ends);
      int biggest201806 = 0;
      if(ends[80]>=biggest201806){
        biggest201806=ends[80];
      }
      if(ends[81]>=biggest201806){
        biggest201806=ends[81];
      }
      if(biggest201806 == 1){
        active[79]=1;
        ends[79]=1;
        tdone[79]=1;
      }
    }
    else {
      S74761=1;
      active[79]=1;
      ends[79]=1;
      tdone[79]=1;
    }
  }

  public void thread201802(int [] tdone, int [] ends){
        S74750=1;
    S74694=0;
    S74674=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 611, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
      S74674=1;
      active[78]=1;
      ends[78]=1;
      tdone[78]=1;
    }
    else {
      S74669=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 611, column: 12
        S74669=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
          ends[78]=2;
          ;//sysj\conveyor_controller.sysj line: 611, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 612, column: 15
            bottleAtPos2_59.setPresent();//sysj\conveyor_controller.sysj line: 613, column: 13
            currsigs.addElement(bottleAtPos2_59);
            S74694=1;
            active[78]=1;
            ends[78]=1;
            tdone[78]=1;
          }
          else {
            done_59.setPresent();//sysj\conveyor_controller.sysj line: 616, column: 13
            currsigs.addElement(done_59);
            S74694=1;
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
      else {
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
      }
    }
  }

  public void thread201801(int [] tdone, int [] ends){
        S74667=1;
    filler1_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 599, column: 7
    currsigs.addElement(filler1_amount_59);
    filler1_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 599, column: 7
    filler2_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 600, column: 7
    currsigs.addElement(filler2_amount_59);
    filler2_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 600, column: 7
    filler3_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 7
    currsigs.addElement(filler3_amount_59);
    filler3_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 601, column: 7
    filler4_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 602, column: 7
    currsigs.addElement(filler4_amount_59);
    filler4_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 602, column: 7
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread201800(int [] tdone, int [] ends){
        S74662=1;
    current_thread_60 = 0;//sysj\conveyor_controller.sysj line: 438, column: 16
    total_thread_60 = 100;//sysj\conveyor_controller.sysj line: 439, column: 16
    total_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 16
    currsigs.addElement(total_fill_59);
    total_fill_59.setValue(total_thread_60);//sysj\conveyor_controller.sysj line: 440, column: 16
    current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 441, column: 16
    currsigs.addElement(current_fill_59);
    current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 441, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 447, column: 20
    S52234=0;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread201797(int [] tdone, int [] ends){
        S74758=1;
    active[81]=1;
    ends[81]=1;
    tdone[81]=1;
  }

  public void thread201796(int [] tdone, int [] ends){
        S74755=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 629, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread201795(int [] tdone, int [] ends){
        S74785=1;
    S74761=0;
    if(bottleAtPos2_59.getprestatus()){//sysj\conveyor_controller.sysj line: 626, column: 26
      thread201796(tdone,ends);
      thread201797(tdone,ends);
      int biggest201798 = 0;
      if(ends[80]>=biggest201798){
        biggest201798=ends[80];
      }
      if(ends[81]>=biggest201798){
        biggest201798=ends[81];
      }
      if(biggest201798 == 1){
        active[79]=1;
        ends[79]=1;
        tdone[79]=1;
      }
    }
    else {
      S74761=1;
      active[79]=1;
      ends[79]=1;
      tdone[79]=1;
    }
  }

  public void thread201794(int [] tdone, int [] ends){
        S74750=1;
    S74694=0;
    S74674=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 611, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
      S74674=1;
      active[78]=1;
      ends[78]=1;
      tdone[78]=1;
    }
    else {
      S74669=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 611, column: 12
        S74669=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
          ends[78]=2;
          ;//sysj\conveyor_controller.sysj line: 611, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 612, column: 15
            bottleAtPos2_59.setPresent();//sysj\conveyor_controller.sysj line: 613, column: 13
            currsigs.addElement(bottleAtPos2_59);
            S74694=1;
            active[78]=1;
            ends[78]=1;
            tdone[78]=1;
          }
          else {
            done_59.setPresent();//sysj\conveyor_controller.sysj line: 616, column: 13
            currsigs.addElement(done_59);
            S74694=1;
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
      else {
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
      }
    }
  }

  public void thread201793(int [] tdone, int [] ends){
        S74667=1;
    filler1_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 599, column: 7
    currsigs.addElement(filler1_amount_59);
    filler1_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 599, column: 7
    filler2_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 600, column: 7
    currsigs.addElement(filler2_amount_59);
    filler2_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 600, column: 7
    filler3_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 7
    currsigs.addElement(filler3_amount_59);
    filler3_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 601, column: 7
    filler4_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 602, column: 7
    currsigs.addElement(filler4_amount_59);
    filler4_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 602, column: 7
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread201792(int [] tdone, int [] ends){
        S74662=1;
    current_thread_60 = 0;//sysj\conveyor_controller.sysj line: 438, column: 16
    total_thread_60 = 100;//sysj\conveyor_controller.sysj line: 439, column: 16
    total_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 16
    currsigs.addElement(total_fill_59);
    total_fill_59.setValue(total_thread_60);//sysj\conveyor_controller.sysj line: 440, column: 16
    current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 441, column: 16
    currsigs.addElement(current_fill_59);
    current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 441, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 447, column: 20
    S52234=0;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread201789(int [] tdone, int [] ends){
        S74758=1;
    active[81]=1;
    ends[81]=1;
    tdone[81]=1;
  }

  public void thread201788(int [] tdone, int [] ends){
        S74755=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 629, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread201787(int [] tdone, int [] ends){
        S74785=1;
    S74761=0;
    if(bottleAtPos2_59.getprestatus()){//sysj\conveyor_controller.sysj line: 626, column: 26
      thread201788(tdone,ends);
      thread201789(tdone,ends);
      int biggest201790 = 0;
      if(ends[80]>=biggest201790){
        biggest201790=ends[80];
      }
      if(ends[81]>=biggest201790){
        biggest201790=ends[81];
      }
      if(biggest201790 == 1){
        active[79]=1;
        ends[79]=1;
        tdone[79]=1;
      }
    }
    else {
      S74761=1;
      active[79]=1;
      ends[79]=1;
      tdone[79]=1;
    }
  }

  public void thread201786(int [] tdone, int [] ends){
        S74750=1;
    S74694=0;
    S74674=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 611, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
      S74674=1;
      active[78]=1;
      ends[78]=1;
      tdone[78]=1;
    }
    else {
      S74669=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 611, column: 12
        S74669=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 611, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 611, column: 12
          ends[78]=2;
          ;//sysj\conveyor_controller.sysj line: 611, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 612, column: 15
            bottleAtPos2_59.setPresent();//sysj\conveyor_controller.sysj line: 613, column: 13
            currsigs.addElement(bottleAtPos2_59);
            S74694=1;
            active[78]=1;
            ends[78]=1;
            tdone[78]=1;
          }
          else {
            done_59.setPresent();//sysj\conveyor_controller.sysj line: 616, column: 13
            currsigs.addElement(done_59);
            S74694=1;
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
      else {
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
      }
    }
  }

  public void thread201785(int [] tdone, int [] ends){
        S74667=1;
    filler1_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 599, column: 7
    currsigs.addElement(filler1_amount_59);
    filler1_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 599, column: 7
    filler2_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 600, column: 7
    currsigs.addElement(filler2_amount_59);
    filler2_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 600, column: 7
    filler3_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 601, column: 7
    currsigs.addElement(filler3_amount_59);
    filler3_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 601, column: 7
    filler4_amount_59.setPresent();//sysj\conveyor_controller.sysj line: 602, column: 7
    currsigs.addElement(filler4_amount_59);
    filler4_amount_59.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 602, column: 7
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread201784(int [] tdone, int [] ends){
        S74662=1;
    current_thread_60 = 0;//sysj\conveyor_controller.sysj line: 438, column: 16
    total_thread_60 = 100;//sysj\conveyor_controller.sysj line: 439, column: 16
    total_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 16
    currsigs.addElement(total_fill_59);
    total_fill_59.setValue(total_thread_60);//sysj\conveyor_controller.sysj line: 440, column: 16
    current_fill_59.setPresent();//sysj\conveyor_controller.sysj line: 441, column: 16
    currsigs.addElement(current_fill_59);
    current_fill_59.setValue(current_thread_60);//sysj\conveyor_controller.sysj line: 441, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 447, column: 20
    S52234=0;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S142452){
        case 0 : 
          S142452=0;
          break RUN;
        
        case 1 : 
          S142452=2;
          S142452=2;
          filler1_59.setClear();//sysj\conveyor_controller.sysj line: 428, column: 9
          filler2_59.setClear();//sysj\conveyor_controller.sysj line: 428, column: 9
          filler3_59.setClear();//sysj\conveyor_controller.sysj line: 428, column: 9
          filler4_59.setClear();//sysj\conveyor_controller.sysj line: 428, column: 9
          done_59.setClear();//sysj\conveyor_controller.sysj line: 428, column: 9
          filler1_amount_59.setClear();//sysj\conveyor_controller.sysj line: 430, column: 9
          filler2_amount_59.setClear();//sysj\conveyor_controller.sysj line: 430, column: 9
          filler3_amount_59.setClear();//sysj\conveyor_controller.sysj line: 430, column: 9
          filler4_amount_59.setClear();//sysj\conveyor_controller.sysj line: 430, column: 9
          current_fill_59.setClear();//sysj\conveyor_controller.sysj line: 431, column: 9
          total_fill_59.setClear();//sysj\conveyor_controller.sysj line: 431, column: 9
          bottleAtPos2_59.setClear();//sysj\conveyor_controller.sysj line: 433, column: 9
          S142451=0;
          S52215=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 435, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 9
            S52215=1;
            active[59]=1;
            ends[59]=1;
            break RUN;
          }
          else {
            S52210=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 435, column: 9
              S52210=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 9
                ends[59]=2;
                ;//sysj\conveyor_controller.sysj line: 435, column: 9
                S142451=1;
                thread201784(tdone,ends);
                thread201785(tdone,ends);
                thread201786(tdone,ends);
                thread201787(tdone,ends);
                int biggest201791 = 0;
                if(ends[60]>=biggest201791){
                  biggest201791=ends[60];
                }
                if(ends[77]>=biggest201791){
                  biggest201791=ends[77];
                }
                if(ends[78]>=biggest201791){
                  biggest201791=ends[78];
                }
                if(ends[79]>=biggest201791){
                  biggest201791=ends[79];
                }
                if(biggest201791 == 1){
                  active[59]=1;
                  ends[59]=1;
                  break RUN;
                }
              }
              else {
                active[59]=1;
                ends[59]=1;
                break RUN;
              }
            }
            else {
              active[59]=1;
              ends[59]=1;
              break RUN;
            }
          }
        
        case 2 : 
          filler1_59.setClear();//sysj\conveyor_controller.sysj line: 428, column: 9
          filler2_59.setClear();//sysj\conveyor_controller.sysj line: 428, column: 9
          filler3_59.setClear();//sysj\conveyor_controller.sysj line: 428, column: 9
          filler4_59.setClear();//sysj\conveyor_controller.sysj line: 428, column: 9
          done_59.setClear();//sysj\conveyor_controller.sysj line: 428, column: 9
          filler1_amount_59.setClear();//sysj\conveyor_controller.sysj line: 430, column: 9
          filler2_amount_59.setClear();//sysj\conveyor_controller.sysj line: 430, column: 9
          filler3_amount_59.setClear();//sysj\conveyor_controller.sysj line: 430, column: 9
          filler4_amount_59.setClear();//sysj\conveyor_controller.sysj line: 430, column: 9
          current_fill_59.setClear();//sysj\conveyor_controller.sysj line: 431, column: 9
          total_fill_59.setClear();//sysj\conveyor_controller.sysj line: 431, column: 9
          bottleAtPos2_59.setClear();//sysj\conveyor_controller.sysj line: 433, column: 9
          switch(S142451){
            case 0 : 
              switch(S52215){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 435, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 9
                    S52215=1;
                    active[59]=1;
                    ends[59]=1;
                    break RUN;
                  }
                  else {
                    switch(S52210){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 435, column: 9
                          S52210=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 9
                            ends[59]=2;
                            ;//sysj\conveyor_controller.sysj line: 435, column: 9
                            S142451=1;
                            thread201792(tdone,ends);
                            thread201793(tdone,ends);
                            thread201794(tdone,ends);
                            thread201795(tdone,ends);
                            int biggest201799 = 0;
                            if(ends[60]>=biggest201799){
                              biggest201799=ends[60];
                            }
                            if(ends[77]>=biggest201799){
                              biggest201799=ends[77];
                            }
                            if(ends[78]>=biggest201799){
                              biggest201799=ends[78];
                            }
                            if(ends[79]>=biggest201799){
                              biggest201799=ends[79];
                            }
                            if(biggest201799 == 1){
                              active[59]=1;
                              ends[59]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[59]=1;
                            ends[59]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[59]=1;
                          ends[59]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 9
                          ends[59]=2;
                          ;//sysj\conveyor_controller.sysj line: 435, column: 9
                          S142451=1;
                          thread201800(tdone,ends);
                          thread201801(tdone,ends);
                          thread201802(tdone,ends);
                          thread201803(tdone,ends);
                          int biggest201807 = 0;
                          if(ends[60]>=biggest201807){
                            biggest201807=ends[60];
                          }
                          if(ends[77]>=biggest201807){
                            biggest201807=ends[77];
                          }
                          if(ends[78]>=biggest201807){
                            biggest201807=ends[78];
                          }
                          if(ends[79]>=biggest201807){
                            biggest201807=ends[79];
                          }
                          if(biggest201807 == 1){
                            active[59]=1;
                            ends[59]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[59]=1;
                          ends[59]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S52215=1;
                  S52215=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 435, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 9
                    S52215=1;
                    active[59]=1;
                    ends[59]=1;
                    break RUN;
                  }
                  else {
                    S52210=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 435, column: 9
                      S52210=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 9
                        ends[59]=2;
                        ;//sysj\conveyor_controller.sysj line: 435, column: 9
                        S142451=1;
                        thread201808(tdone,ends);
                        thread201809(tdone,ends);
                        thread201810(tdone,ends);
                        thread201811(tdone,ends);
                        int biggest201815 = 0;
                        if(ends[60]>=biggest201815){
                          biggest201815=ends[60];
                        }
                        if(ends[77]>=biggest201815){
                          biggest201815=ends[77];
                        }
                        if(ends[78]>=biggest201815){
                          biggest201815=ends[78];
                        }
                        if(ends[79]>=biggest201815){
                          biggest201815=ends[79];
                        }
                        if(biggest201815 == 1){
                          active[59]=1;
                          ends[59]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[59]=1;
                        ends[59]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[59]=1;
                      ends[59]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread201816(tdone,ends);
              thread201943(tdone,ends);
              thread201944(tdone,ends);
              thread201945(tdone,ends);
              int biggest201952 = 0;
              if(ends[60]>=biggest201952){
                biggest201952=ends[60];
              }
              if(ends[77]>=biggest201952){
                biggest201952=ends[77];
              }
              if(ends[78]>=biggest201952){
                biggest201952=ends[78];
              }
              if(ends[79]>=biggest201952){
                biggest201952=ends[79];
              }
              if(biggest201952 == 1){
                active[59]=1;
                ends[59]=1;
                break RUN;
              }
              //FINXME code
              if(biggest201952 == 0){
                S142452=0;
                active[59]=0;
                ends[59]=0;
                S142452=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    filler1_59 = new Signal();
    filler2_59 = new Signal();
    filler3_59 = new Signal();
    filler4_59 = new Signal();
    done_59 = new Signal();
    filler1_amount_59 = new Signal();
    filler2_amount_59 = new Signal();
    filler3_amount_59 = new Signal();
    filler4_amount_59 = new Signal();
    current_fill_59 = new Signal();
    total_fill_59 = new Signal();
    bottleAtPos2_59 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[59] != 0){
      int index = 59;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[59]!=0 || suspended[59]!=0 || active[59]!=1);
      else{
        if(!df){
          simFiller_in.gethook();
          fillerReady_o.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          fileReadSignal.gethook();
          ordered.gethook();
          orderFill_1.gethook();
          orderFill_2.gethook();
          orderFill_3.gethook();
          orderFill_4.gethook();
          df = true;
        }
        runClockDomain();
      }
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      fileReadSignal.setpreclear();
      ordered.setpreclear();
      orderFill_1.setpreclear();
      orderFill_2.setpreclear();
      orderFill_3.setpreclear();
      orderFill_4.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      bottleAtPos2E.setpreclear();
      order_finished.setpreclear();
      filler1_59.setpreclear();
      filler2_59.setpreclear();
      filler3_59.setpreclear();
      filler4_59.setpreclear();
      done_59.setpreclear();
      filler1_amount_59.setpreclear();
      filler2_amount_59.setpreclear();
      filler3_amount_59.setpreclear();
      filler4_amount_59.setpreclear();
      current_fill_59.setpreclear();
      total_fill_59.setpreclear();
      bottleAtPos2_59.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      dummyint = fileReadSignal.getStatus() ? fileReadSignal.setprepresent() : fileReadSignal.setpreclear();
      fileReadSignal.setpreval(fileReadSignal.getValue());
      fileReadSignal.setClear();
      dummyint = ordered.getStatus() ? ordered.setprepresent() : ordered.setpreclear();
      ordered.setpreval(ordered.getValue());
      ordered.setClear();
      dummyint = orderFill_1.getStatus() ? orderFill_1.setprepresent() : orderFill_1.setpreclear();
      orderFill_1.setpreval(orderFill_1.getValue());
      orderFill_1.setClear();
      dummyint = orderFill_2.getStatus() ? orderFill_2.setprepresent() : orderFill_2.setpreclear();
      orderFill_2.setpreval(orderFill_2.getValue());
      orderFill_2.setClear();
      dummyint = orderFill_3.getStatus() ? orderFill_3.setprepresent() : orderFill_3.setpreclear();
      orderFill_3.setpreval(orderFill_3.getValue());
      orderFill_3.setClear();
      dummyint = orderFill_4.getStatus() ? orderFill_4.setprepresent() : orderFill_4.setpreclear();
      orderFill_4.setpreval(orderFill_4.getValue());
      orderFill_4.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      order_finished.sethook();
      order_finished.setClear();
      filler1_59.setClear();
      filler2_59.setClear();
      filler3_59.setClear();
      filler4_59.setClear();
      done_59.setClear();
      filler1_amount_59.setClear();
      filler2_amount_59.setClear();
      filler3_amount_59.setClear();
      filler4_amount_59.setClear();
      current_fill_59.setClear();
      total_fill_59.setClear();
      bottleAtPos2_59.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[59]!=0 || suspended[59]!=0 || active[59]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        fileReadSignal.gethook();
        ordered.gethook();
        orderFill_1.gethook();
        orderFill_2.gethook();
        orderFill_3.gethook();
        orderFill_4.gethook();
      }
      runFinisher();
      if(active[59] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
