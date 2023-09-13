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
  private Signal filler1_51;
  private Signal filler2_51;
  private Signal filler3_51;
  private Signal filler4_51;
  private Signal filler1_amount_51;
  private Signal filler2_amount_51;
  private Signal filler3_amount_51;
  private Signal filler4_amount_51;
  private Signal current_fill_51;
  private Signal total_fill_51;
  private Signal bottleAtPos2_51;
  private int current_thread_52;//sysj\conveyor_controller.sysj line: 385, column: 16
  private int total_thread_52;//sysj\conveyor_controller.sysj line: 386, column: 16
  private long __start_thread_52;//sysj\conveyor_controller.sysj line: 384, column: 9
  private int S118679 = 1;
  private int S118678 = 1;
  private int S28462 = 1;
  private int S28457 = 1;
  private int S50909 = 1;
  private int S28479 = 1;
  private int S28488 = 1;
  private int S28483 = 1;
  private int S28638 = 1;
  private int S28589 = 1;
  private int S28594 = 1;
  private int S28603 = 1;
  private int S28608 = 1;
  private int S28986 = 1;
  private int S28937 = 1;
  private int S28942 = 1;
  private int S28951 = 1;
  private int S28956 = 1;
  private int S29392 = 1;
  private int S29343 = 1;
  private int S29348 = 1;
  private int S29357 = 1;
  private int S29362 = 1;
  private int S29856 = 1;
  private int S29807 = 1;
  private int S29812 = 1;
  private int S29821 = 1;
  private int S29826 = 1;
  private int S30328 = 1;
  private int S30323 = 1;
  private int S30555 = 1;
  private int S50992 = 1;
  private int S50936 = 1;
  private int S50916 = 1;
  private int S50911 = 1;
  private int S51027 = 1;
  private int S51003 = 1;
  private int S50997 = 1;
  private int S51000 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread183272(int [] tdone, int [] ends){
        S51000=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread183271(int [] tdone, int [] ends){
        S50997=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 573, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread183269(int [] tdone, int [] ends){
        switch(S51000){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 577, column: 35
          ends[72]=2;
          tdone[72]=1;
        }
        else {
          active[72]=1;
          ends[72]=1;
          tdone[72]=1;
        }
        break;
      
    }
  }

  public void thread183268(int [] tdone, int [] ends){
        switch(S50997){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 573, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
        break;
      
    }
  }

  public void thread183267(int [] tdone, int [] ends){
        switch(S51027){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        switch(S51003){
          case 0 : 
            thread183268(tdone,ends);
            thread183269(tdone,ends);
            int biggest183270 = 0;
            if(ends[71]>=biggest183270){
              biggest183270=ends[71];
            }
            if(ends[72]>=biggest183270){
              biggest183270=ends[72];
            }
            if(biggest183270 == 1){
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            if(biggest183270 == 2){
              ends[70]=2;
              ;//sysj\conveyor_controller.sysj line: 571, column: 18
              S51003=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            //FINXME code
            if(biggest183270 == 0){
              S51003=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            break;
          
          case 1 : 
            S51003=1;
            S51003=0;
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 570, column: 26
              thread183271(tdone,ends);
              thread183272(tdone,ends);
              int biggest183273 = 0;
              if(ends[71]>=biggest183273){
                biggest183273=ends[71];
              }
              if(ends[72]>=biggest183273){
                biggest183273=ends[72];
              }
              if(biggest183273 == 1){
                active[70]=1;
                ends[70]=1;
                tdone[70]=1;
              }
            }
            else {
              S51003=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread183266(int [] tdone, int [] ends){
        switch(S50992){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        switch(S50936){
          case 0 : 
            switch(S50916){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 559, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
                  S50916=1;
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
                else {
                  switch(S50911){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 559, column: 12
                        S50911=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
                          ends[69]=2;
                          ;//sysj\conveyor_controller.sysj line: 559, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 560, column: 15
                            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 13
                            currsigs.addElement(bottleAtPos2_51);
                            S50936=1;
                            active[69]=1;
                            ends[69]=1;
                            tdone[69]=1;
                          }
                          else {
                            S50936=1;
                            active[69]=1;
                            ends[69]=1;
                            tdone[69]=1;
                          }
                        }
                        else {
                          active[69]=1;
                          ends[69]=1;
                          tdone[69]=1;
                        }
                      }
                      else {
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
                        ends[69]=2;
                        ;//sysj\conveyor_controller.sysj line: 559, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 560, column: 15
                          bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 13
                          currsigs.addElement(bottleAtPos2_51);
                          S50936=1;
                          active[69]=1;
                          ends[69]=1;
                          tdone[69]=1;
                        }
                        else {
                          S50936=1;
                          active[69]=1;
                          ends[69]=1;
                          tdone[69]=1;
                        }
                      }
                      else {
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S50916=1;
                S50916=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 559, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
                  S50916=1;
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
                else {
                  S50911=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 559, column: 12
                    S50911=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
                      ends[69]=2;
                      ;//sysj\conveyor_controller.sysj line: 559, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 560, column: 15
                        bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 13
                        currsigs.addElement(bottleAtPos2_51);
                        S50936=1;
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                      else {
                        S50936=1;
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                    }
                    else {
                      active[69]=1;
                      ends[69]=1;
                      tdone[69]=1;
                    }
                  }
                  else {
                    active[69]=1;
                    ends[69]=1;
                    tdone[69]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S50936=1;
            S50936=0;
            S50916=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 559, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
              S50916=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            else {
              S50911=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 559, column: 12
                S50911=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
                  ends[69]=2;
                  ;//sysj\conveyor_controller.sysj line: 559, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 560, column: 15
                    bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 13
                    currsigs.addElement(bottleAtPos2_51);
                    S50936=1;
                    active[69]=1;
                    ends[69]=1;
                    tdone[69]=1;
                  }
                  else {
                    S50936=1;
                    active[69]=1;
                    ends[69]=1;
                    tdone[69]=1;
                  }
                }
                else {
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
              }
              else {
                active[69]=1;
                ends[69]=1;
                tdone[69]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread183264(int [] tdone, int [] ends){
        switch(S29826){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 523, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
        break;
      
    }
  }

  public void thread183263(int [] tdone, int [] ends){
        switch(S29821){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 519, column: 32
        currsigs.addElement(valveInletOnOff);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread183261(int [] tdone, int [] ends){
        S29826=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 523, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread183260(int [] tdone, int [] ends){
        S29821=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 518, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 519, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread183258(int [] tdone, int [] ends){
        switch(S29812){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread183257(int [] tdone, int [] ends){
        switch(S29807){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 509, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
        break;
      
    }
  }

  public void thread183255(int [] tdone, int [] ends){
        S29826=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 523, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread183254(int [] tdone, int [] ends){
        S29821=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 518, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 519, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread183252(int [] tdone, int [] ends){
        S29812=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread183251(int [] tdone, int [] ends){
        S29807=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 508, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 509, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread183249(int [] tdone, int [] ends){
        switch(S29362){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 493, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
        break;
      
    }
  }

  public void thread183248(int [] tdone, int [] ends){
        switch(S29357){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 489, column: 32
        currsigs.addElement(valveInletOnOff);
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
        break;
      
    }
  }

  public void thread183246(int [] tdone, int [] ends){
        S29362=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 493, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread183245(int [] tdone, int [] ends){
        S29357=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 488, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 489, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread183243(int [] tdone, int [] ends){
        switch(S29348){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
        break;
      
    }
  }

  public void thread183242(int [] tdone, int [] ends){
        switch(S29343){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 479, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[61]=1;
        ends[61]=1;
        tdone[61]=1;
        break;
      
    }
  }

  public void thread183240(int [] tdone, int [] ends){
        S29362=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 493, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread183239(int [] tdone, int [] ends){
        S29357=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 488, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 489, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread183237(int [] tdone, int [] ends){
        S29812=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread183236(int [] tdone, int [] ends){
        S29807=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 508, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 509, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread183234(int [] tdone, int [] ends){
        S29348=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread183233(int [] tdone, int [] ends){
        S29343=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 478, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 479, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread183231(int [] tdone, int [] ends){
        switch(S28956){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 463, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
        break;
      
    }
  }

  public void thread183230(int [] tdone, int [] ends){
        switch(S28951){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 459, column: 32
        currsigs.addElement(valveInletOnOff);
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
        break;
      
    }
  }

  public void thread183228(int [] tdone, int [] ends){
        S28956=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 463, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread183227(int [] tdone, int [] ends){
        S28951=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 458, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 459, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread183225(int [] tdone, int [] ends){
        switch(S28942){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 451, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread183224(int [] tdone, int [] ends){
        switch(S28937){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread183222(int [] tdone, int [] ends){
        S28956=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 463, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread183221(int [] tdone, int [] ends){
        S28951=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 458, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 459, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread183219(int [] tdone, int [] ends){
        S29812=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread183218(int [] tdone, int [] ends){
        S29807=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 508, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 509, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread183216(int [] tdone, int [] ends){
        S29348=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread183215(int [] tdone, int [] ends){
        S29343=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 478, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 479, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread183213(int [] tdone, int [] ends){
        S28942=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 451, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread183212(int [] tdone, int [] ends){
        S28937=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 446, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread183210(int [] tdone, int [] ends){
        switch(S28608){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread183209(int [] tdone, int [] ends){
        switch(S28603){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 427, column: 32
        currsigs.addElement(valveInletOnOff);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread183207(int [] tdone, int [] ends){
        S28608=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread183206(int [] tdone, int [] ends){
        S28603=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 426, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 427, column: 32
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread183204(int [] tdone, int [] ends){
        switch(S28594){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 421, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
        break;
      
    }
  }

  public void thread183203(int [] tdone, int [] ends){
        switch(S28589){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 417, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread183201(int [] tdone, int [] ends){
        S28608=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread183200(int [] tdone, int [] ends){
        S28603=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 426, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 427, column: 32
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread183198(int [] tdone, int [] ends){
        S29812=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread183197(int [] tdone, int [] ends){
        S29807=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 508, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 509, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread183195(int [] tdone, int [] ends){
        S29348=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread183194(int [] tdone, int [] ends){
        S29343=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 478, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 479, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread183192(int [] tdone, int [] ends){
        S28942=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 451, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread183191(int [] tdone, int [] ends){
        S28937=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 446, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread183189(int [] tdone, int [] ends){
        S28594=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 421, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread183188(int [] tdone, int [] ends){
        S28589=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 416, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 417, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread183186(int [] tdone, int [] ends){
        S29812=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread183185(int [] tdone, int [] ends){
        S29807=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 508, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 509, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread183183(int [] tdone, int [] ends){
        S29348=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread183182(int [] tdone, int [] ends){
        S29343=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 478, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 479, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread183180(int [] tdone, int [] ends){
        S28942=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 451, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread183179(int [] tdone, int [] ends){
        S28937=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 446, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread183177(int [] tdone, int [] ends){
        S28594=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 421, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread183176(int [] tdone, int [] ends){
        S28589=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 416, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 417, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread183174(int [] tdone, int [] ends){
        S29812=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread183173(int [] tdone, int [] ends){
        S29807=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 508, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 509, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread183171(int [] tdone, int [] ends){
        S29348=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread183170(int [] tdone, int [] ends){
        S29343=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 478, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 479, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread183168(int [] tdone, int [] ends){
        S28942=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 451, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread183167(int [] tdone, int [] ends){
        S28937=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 446, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread183165(int [] tdone, int [] ends){
        S28594=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 421, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread183164(int [] tdone, int [] ends){
        S28589=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 416, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 417, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread183162(int [] tdone, int [] ends){
        S29812=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread183161(int [] tdone, int [] ends){
        S29807=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 508, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 509, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread183159(int [] tdone, int [] ends){
        S29348=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread183158(int [] tdone, int [] ends){
        S29343=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 478, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 479, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread183156(int [] tdone, int [] ends){
        S28942=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 451, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread183155(int [] tdone, int [] ends){
        S28937=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 446, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread183153(int [] tdone, int [] ends){
        S28594=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 421, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread183152(int [] tdone, int [] ends){
        S28589=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 416, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 417, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread183150(int [] tdone, int [] ends){
        S29812=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread183149(int [] tdone, int [] ends){
        S29807=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 508, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 509, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread183147(int [] tdone, int [] ends){
        S29348=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread183146(int [] tdone, int [] ends){
        S29343=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 478, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 479, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread183144(int [] tdone, int [] ends){
        S28942=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 451, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread183143(int [] tdone, int [] ends){
        S28937=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 446, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 447, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread183141(int [] tdone, int [] ends){
        S28594=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 421, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread183140(int [] tdone, int [] ends){
        S28589=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 416, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 417, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread183139(int [] tdone, int [] ends){
        switch(S50909){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        switch(S28479){
          case 0 : 
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 405, column: 26
              S28479=1;
              S28488=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 406, column: 20
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 406, column: 20
                S28488=1;
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              else {
                S28483=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 406, column: 20
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 406, column: 20
                  S28483=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 406, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 406, column: 20
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 406, column: 20
                    S28479=2;
                    __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 384, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 384, column: 9
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 384, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 409, column: 20
                      S28479=3;
                      if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 412, column: 24
                        S28638=0;
                        thread183140(tdone,ends);
                        thread183141(tdone,ends);
                        int biggest183142 = 0;
                        if(ends[53]>=biggest183142){
                          biggest183142=ends[53];
                        }
                        if(ends[54]>=biggest183142){
                          biggest183142=ends[54];
                        }
                        if(biggest183142 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        S28479=4;
                        if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 442, column: 24
                          S28986=0;
                          thread183143(tdone,ends);
                          thread183144(tdone,ends);
                          int biggest183145 = 0;
                          if(ends[57]>=biggest183145){
                            biggest183145=ends[57];
                          }
                          if(ends[58]>=biggest183145){
                            biggest183145=ends[58];
                          }
                          if(biggest183145 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          S28479=5;
                          if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 474, column: 24
                            S29392=0;
                            thread183146(tdone,ends);
                            thread183147(tdone,ends);
                            int biggest183148 = 0;
                            if(ends[61]>=biggest183148){
                              biggest183148=ends[61];
                            }
                            if(ends[62]>=biggest183148){
                              biggest183148=ends[62];
                            }
                            if(biggest183148 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S28479=6;
                            if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 504, column: 24
                              S29856=0;
                              thread183149(tdone,ends);
                              thread183150(tdone,ends);
                              int biggest183151 = 0;
                              if(ends[65]>=biggest183151){
                                biggest183151=ends[65];
                              }
                              if(ends[66]>=biggest183151){
                                biggest183151=ends[66];
                              }
                              if(biggest183151 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 535, column: 20
                              current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 536, column: 20
                              currsigs.addElement(current_fill_51);
                              current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 536, column: 20
                              S28479=7;
                              S30328=0;
                              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 538, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                                S30328=1;
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                              else {
                                S30323=0;
                                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 538, column: 20
                                  S30323=1;
                                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                                    ends[52]=2;
                                    ;//sysj\conveyor_controller.sysj line: 538, column: 20
                                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 539, column: 20
                                    S28479=8;
                                    S30555=0;
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                  else {
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 1 : 
            switch(S28488){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 406, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 406, column: 20
                  S28488=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S28483){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 406, column: 20
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 406, column: 20
                        S28483=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 406, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 406, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 406, column: 20
                          S28479=2;
                          __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 384, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 384, column: 9
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 384, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 409, column: 20
                            S28479=3;
                            if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 412, column: 24
                              S28638=0;
                              thread183152(tdone,ends);
                              thread183153(tdone,ends);
                              int biggest183154 = 0;
                              if(ends[53]>=biggest183154){
                                biggest183154=ends[53];
                              }
                              if(ends[54]>=biggest183154){
                                biggest183154=ends[54];
                              }
                              if(biggest183154 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S28479=4;
                              if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 442, column: 24
                                S28986=0;
                                thread183155(tdone,ends);
                                thread183156(tdone,ends);
                                int biggest183157 = 0;
                                if(ends[57]>=biggest183157){
                                  biggest183157=ends[57];
                                }
                                if(ends[58]>=biggest183157){
                                  biggest183157=ends[58];
                                }
                                if(biggest183157 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                S28479=5;
                                if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 474, column: 24
                                  S29392=0;
                                  thread183158(tdone,ends);
                                  thread183159(tdone,ends);
                                  int biggest183160 = 0;
                                  if(ends[61]>=biggest183160){
                                    biggest183160=ends[61];
                                  }
                                  if(ends[62]>=biggest183160){
                                    biggest183160=ends[62];
                                  }
                                  if(biggest183160 == 1){
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  S28479=6;
                                  if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 504, column: 24
                                    S29856=0;
                                    thread183161(tdone,ends);
                                    thread183162(tdone,ends);
                                    int biggest183163 = 0;
                                    if(ends[65]>=biggest183163){
                                      biggest183163=ends[65];
                                    }
                                    if(ends[66]>=biggest183163){
                                      biggest183163=ends[66];
                                    }
                                    if(biggest183163 == 1){
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                  }
                                  else {
                                    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 535, column: 20
                                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 536, column: 20
                                    currsigs.addElement(current_fill_51);
                                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 536, column: 20
                                    S28479=7;
                                    S30328=0;
                                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 538, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                                      S30328=1;
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                    else {
                                      S30323=0;
                                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 538, column: 20
                                        S30323=1;
                                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                                          ends[52]=2;
                                          ;//sysj\conveyor_controller.sysj line: 538, column: 20
                                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 539, column: 20
                                          S28479=8;
                                          S30555=0;
                                          active[52]=1;
                                          ends[52]=1;
                                          tdone[52]=1;
                                        }
                                        else {
                                          active[52]=1;
                                          ends[52]=1;
                                          tdone[52]=1;
                                        }
                                      }
                                      else {
                                        active[52]=1;
                                        ends[52]=1;
                                        tdone[52]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 406, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 406, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 406, column: 20
                        S28479=2;
                        __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 384, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 384, column: 9
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 384, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 409, column: 20
                          S28479=3;
                          if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 412, column: 24
                            S28638=0;
                            thread183164(tdone,ends);
                            thread183165(tdone,ends);
                            int biggest183166 = 0;
                            if(ends[53]>=biggest183166){
                              biggest183166=ends[53];
                            }
                            if(ends[54]>=biggest183166){
                              biggest183166=ends[54];
                            }
                            if(biggest183166 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S28479=4;
                            if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 442, column: 24
                              S28986=0;
                              thread183167(tdone,ends);
                              thread183168(tdone,ends);
                              int biggest183169 = 0;
                              if(ends[57]>=biggest183169){
                                biggest183169=ends[57];
                              }
                              if(ends[58]>=biggest183169){
                                biggest183169=ends[58];
                              }
                              if(biggest183169 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S28479=5;
                              if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 474, column: 24
                                S29392=0;
                                thread183170(tdone,ends);
                                thread183171(tdone,ends);
                                int biggest183172 = 0;
                                if(ends[61]>=biggest183172){
                                  biggest183172=ends[61];
                                }
                                if(ends[62]>=biggest183172){
                                  biggest183172=ends[62];
                                }
                                if(biggest183172 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                S28479=6;
                                if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 504, column: 24
                                  S29856=0;
                                  thread183173(tdone,ends);
                                  thread183174(tdone,ends);
                                  int biggest183175 = 0;
                                  if(ends[65]>=biggest183175){
                                    biggest183175=ends[65];
                                  }
                                  if(ends[66]>=biggest183175){
                                    biggest183175=ends[66];
                                  }
                                  if(biggest183175 == 1){
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 535, column: 20
                                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 536, column: 20
                                  currsigs.addElement(current_fill_51);
                                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 536, column: 20
                                  S28479=7;
                                  S30328=0;
                                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 538, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                                    S30328=1;
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                  else {
                                    S30323=0;
                                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 538, column: 20
                                      S30323=1;
                                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                                        ends[52]=2;
                                        ;//sysj\conveyor_controller.sysj line: 538, column: 20
                                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 539, column: 20
                                        S28479=8;
                                        S30555=0;
                                        active[52]=1;
                                        ends[52]=1;
                                        tdone[52]=1;
                                      }
                                      else {
                                        active[52]=1;
                                        ends[52]=1;
                                        tdone[52]=1;
                                      }
                                    }
                                    else {
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S28488=1;
                S28488=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 406, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 406, column: 20
                  S28488=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S28483=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 406, column: 20
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 406, column: 20
                    S28483=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 406, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 406, column: 20
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 406, column: 20
                      S28479=2;
                      __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 384, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 384, column: 9
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 384, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 409, column: 20
                        S28479=3;
                        if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 412, column: 24
                          S28638=0;
                          thread183176(tdone,ends);
                          thread183177(tdone,ends);
                          int biggest183178 = 0;
                          if(ends[53]>=biggest183178){
                            biggest183178=ends[53];
                          }
                          if(ends[54]>=biggest183178){
                            biggest183178=ends[54];
                          }
                          if(biggest183178 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          S28479=4;
                          if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 442, column: 24
                            S28986=0;
                            thread183179(tdone,ends);
                            thread183180(tdone,ends);
                            int biggest183181 = 0;
                            if(ends[57]>=biggest183181){
                              biggest183181=ends[57];
                            }
                            if(ends[58]>=biggest183181){
                              biggest183181=ends[58];
                            }
                            if(biggest183181 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S28479=5;
                            if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 474, column: 24
                              S29392=0;
                              thread183182(tdone,ends);
                              thread183183(tdone,ends);
                              int biggest183184 = 0;
                              if(ends[61]>=biggest183184){
                                biggest183184=ends[61];
                              }
                              if(ends[62]>=biggest183184){
                                biggest183184=ends[62];
                              }
                              if(biggest183184 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S28479=6;
                              if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 504, column: 24
                                S29856=0;
                                thread183185(tdone,ends);
                                thread183186(tdone,ends);
                                int biggest183187 = 0;
                                if(ends[65]>=biggest183187){
                                  biggest183187=ends[65];
                                }
                                if(ends[66]>=biggest183187){
                                  biggest183187=ends[66];
                                }
                                if(biggest183187 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 535, column: 20
                                current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 536, column: 20
                                currsigs.addElement(current_fill_51);
                                current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 536, column: 20
                                S28479=7;
                                S30328=0;
                                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 538, column: 20
                                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                                  S30328=1;
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                                else {
                                  S30323=0;
                                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 538, column: 20
                                    S30323=1;
                                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                                      ends[52]=2;
                                      ;//sysj\conveyor_controller.sysj line: 538, column: 20
                                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 539, column: 20
                                      S28479=8;
                                      S30555=0;
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                    else {
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                  }
                                  else {
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 384, column: 9
              ends[52]=2;
              ;//sysj\conveyor_controller.sysj line: 384, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 409, column: 20
              S28479=3;
              if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 412, column: 24
                S28638=0;
                thread183188(tdone,ends);
                thread183189(tdone,ends);
                int biggest183190 = 0;
                if(ends[53]>=biggest183190){
                  biggest183190=ends[53];
                }
                if(ends[54]>=biggest183190){
                  biggest183190=ends[54];
                }
                if(biggest183190 == 1){
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
              else {
                S28479=4;
                if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 442, column: 24
                  S28986=0;
                  thread183191(tdone,ends);
                  thread183192(tdone,ends);
                  int biggest183193 = 0;
                  if(ends[57]>=biggest183193){
                    biggest183193=ends[57];
                  }
                  if(ends[58]>=biggest183193){
                    biggest183193=ends[58];
                  }
                  if(biggest183193 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  S28479=5;
                  if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 474, column: 24
                    S29392=0;
                    thread183194(tdone,ends);
                    thread183195(tdone,ends);
                    int biggest183196 = 0;
                    if(ends[61]>=biggest183196){
                      biggest183196=ends[61];
                    }
                    if(ends[62]>=biggest183196){
                      biggest183196=ends[62];
                    }
                    if(biggest183196 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S28479=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 504, column: 24
                      S29856=0;
                      thread183197(tdone,ends);
                      thread183198(tdone,ends);
                      int biggest183199 = 0;
                      if(ends[65]>=biggest183199){
                        biggest183199=ends[65];
                      }
                      if(ends[66]>=biggest183199){
                        biggest183199=ends[66];
                      }
                      if(biggest183199 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 535, column: 20
                      current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 536, column: 20
                      currsigs.addElement(current_fill_51);
                      current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 536, column: 20
                      S28479=7;
                      S30328=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 538, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                        S30328=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S30323=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 538, column: 20
                          S30323=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 538, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 539, column: 20
                            S28479=8;
                            S30555=0;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                    }
                  }
                }
              }
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 3 : 
            switch(S28638){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 414, column: 30
                  S28638=1;
                  thread183200(tdone,ends);
                  thread183201(tdone,ends);
                  int biggest183202 = 0;
                  if(ends[55]>=biggest183202){
                    biggest183202=ends[55];
                  }
                  if(ends[56]>=biggest183202){
                    biggest183202=ends[56];
                  }
                  if(biggest183202 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread183203(tdone,ends);
                  thread183204(tdone,ends);
                  int biggest183205 = 0;
                  if(ends[53]>=biggest183205){
                    biggest183205=ends[53];
                  }
                  if(ends[54]>=biggest183205){
                    biggest183205=ends[54];
                  }
                  if(biggest183205 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest183205 == 0){
                    S28638=1;
                    thread183206(tdone,ends);
                    thread183207(tdone,ends);
                    int biggest183208 = 0;
                    if(ends[55]>=biggest183208){
                      biggest183208=ends[55];
                    }
                    if(ends[56]>=biggest183208){
                      biggest183208=ends[56];
                    }
                    if(biggest183208 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 424, column: 30
                  System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 435, column: 24
                  current_thread_52 += (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 436, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 437, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 438, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 438, column: 24
                  S28638=2;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  thread183209(tdone,ends);
                  thread183210(tdone,ends);
                  int biggest183211 = 0;
                  if(ends[55]>=biggest183211){
                    biggest183211=ends[55];
                  }
                  if(ends[56]>=biggest183211){
                    biggest183211=ends[56];
                  }
                  if(biggest183211 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest183211 == 0){
                    System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 435, column: 24
                    current_thread_52 += (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 436, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 437, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 438, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 438, column: 24
                    S28638=2;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
              case 2 : 
                S28638=2;
                S28479=4;
                if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 442, column: 24
                  S28986=0;
                  thread183212(tdone,ends);
                  thread183213(tdone,ends);
                  int biggest183214 = 0;
                  if(ends[57]>=biggest183214){
                    biggest183214=ends[57];
                  }
                  if(ends[58]>=biggest183214){
                    biggest183214=ends[58];
                  }
                  if(biggest183214 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  S28479=5;
                  if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 474, column: 24
                    S29392=0;
                    thread183215(tdone,ends);
                    thread183216(tdone,ends);
                    int biggest183217 = 0;
                    if(ends[61]>=biggest183217){
                      biggest183217=ends[61];
                    }
                    if(ends[62]>=biggest183217){
                      biggest183217=ends[62];
                    }
                    if(biggest183217 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S28479=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 504, column: 24
                      S29856=0;
                      thread183218(tdone,ends);
                      thread183219(tdone,ends);
                      int biggest183220 = 0;
                      if(ends[65]>=biggest183220){
                        biggest183220=ends[65];
                      }
                      if(ends[66]>=biggest183220){
                        biggest183220=ends[66];
                      }
                      if(biggest183220 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 535, column: 20
                      current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 536, column: 20
                      currsigs.addElement(current_fill_51);
                      current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 536, column: 20
                      S28479=7;
                      S30328=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 538, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                        S30328=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S30323=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 538, column: 20
                          S30323=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 538, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 539, column: 20
                            S28479=8;
                            S30555=0;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            switch(S28986){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 444, column: 30
                  S28986=1;
                  thread183221(tdone,ends);
                  thread183222(tdone,ends);
                  int biggest183223 = 0;
                  if(ends[59]>=biggest183223){
                    biggest183223=ends[59];
                  }
                  if(ends[60]>=biggest183223){
                    biggest183223=ends[60];
                  }
                  if(biggest183223 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread183224(tdone,ends);
                  thread183225(tdone,ends);
                  int biggest183226 = 0;
                  if(ends[57]>=biggest183226){
                    biggest183226=ends[57];
                  }
                  if(ends[58]>=biggest183226){
                    biggest183226=ends[58];
                  }
                  if(biggest183226 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest183226 == 0){
                    S28986=1;
                    thread183227(tdone,ends);
                    thread183228(tdone,ends);
                    int biggest183229 = 0;
                    if(ends[59]>=biggest183229){
                      biggest183229=ends[59];
                    }
                    if(ends[60]>=biggest183229){
                      biggest183229=ends[60];
                    }
                    if(biggest183229 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 456, column: 30
                  System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 467, column: 24
                  current_thread_52 += (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 468, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 469, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 470, column: 24
                  S28986=2;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  thread183230(tdone,ends);
                  thread183231(tdone,ends);
                  int biggest183232 = 0;
                  if(ends[59]>=biggest183232){
                    biggest183232=ends[59];
                  }
                  if(ends[60]>=biggest183232){
                    biggest183232=ends[60];
                  }
                  if(biggest183232 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest183232 == 0){
                    System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 467, column: 24
                    current_thread_52 += (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 468, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 469, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 470, column: 24
                    S28986=2;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
              case 2 : 
                S28986=2;
                S28479=5;
                if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 474, column: 24
                  S29392=0;
                  thread183233(tdone,ends);
                  thread183234(tdone,ends);
                  int biggest183235 = 0;
                  if(ends[61]>=biggest183235){
                    biggest183235=ends[61];
                  }
                  if(ends[62]>=biggest183235){
                    biggest183235=ends[62];
                  }
                  if(biggest183235 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  S28479=6;
                  if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 504, column: 24
                    S29856=0;
                    thread183236(tdone,ends);
                    thread183237(tdone,ends);
                    int biggest183238 = 0;
                    if(ends[65]>=biggest183238){
                      biggest183238=ends[65];
                    }
                    if(ends[66]>=biggest183238){
                      biggest183238=ends[66];
                    }
                    if(biggest183238 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 535, column: 20
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 536, column: 20
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 536, column: 20
                    S28479=7;
                    S30328=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 538, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                      S30328=1;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      S30323=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 538, column: 20
                        S30323=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 538, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 539, column: 20
                          S28479=8;
                          S30555=0;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            switch(S29392){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 476, column: 30
                  S29392=1;
                  thread183239(tdone,ends);
                  thread183240(tdone,ends);
                  int biggest183241 = 0;
                  if(ends[63]>=biggest183241){
                    biggest183241=ends[63];
                  }
                  if(ends[64]>=biggest183241){
                    biggest183241=ends[64];
                  }
                  if(biggest183241 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread183242(tdone,ends);
                  thread183243(tdone,ends);
                  int biggest183244 = 0;
                  if(ends[61]>=biggest183244){
                    biggest183244=ends[61];
                  }
                  if(ends[62]>=biggest183244){
                    biggest183244=ends[62];
                  }
                  if(biggest183244 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest183244 == 0){
                    S29392=1;
                    thread183245(tdone,ends);
                    thread183246(tdone,ends);
                    int biggest183247 = 0;
                    if(ends[63]>=biggest183247){
                      biggest183247=ends[63];
                    }
                    if(ends[64]>=biggest183247){
                      biggest183247=ends[64];
                    }
                    if(biggest183247 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 486, column: 30
                  System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 497, column: 24
                  current_thread_52 += (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 498, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 499, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 500, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 500, column: 24
                  S29392=2;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  thread183248(tdone,ends);
                  thread183249(tdone,ends);
                  int biggest183250 = 0;
                  if(ends[63]>=biggest183250){
                    biggest183250=ends[63];
                  }
                  if(ends[64]>=biggest183250){
                    biggest183250=ends[64];
                  }
                  if(biggest183250 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest183250 == 0){
                    System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 497, column: 24
                    current_thread_52 += (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 498, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 499, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 500, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 500, column: 24
                    S29392=2;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
              case 2 : 
                S29392=2;
                S28479=6;
                if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 504, column: 24
                  S29856=0;
                  thread183251(tdone,ends);
                  thread183252(tdone,ends);
                  int biggest183253 = 0;
                  if(ends[65]>=biggest183253){
                    biggest183253=ends[65];
                  }
                  if(ends[66]>=biggest183253){
                    biggest183253=ends[66];
                  }
                  if(biggest183253 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 535, column: 20
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 536, column: 20
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 536, column: 20
                  S28479=7;
                  S30328=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 538, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                    S30328=1;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    S30323=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 538, column: 20
                      S30323=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 538, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 539, column: 20
                        S28479=8;
                        S30555=0;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S29856){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 506, column: 30
                  S29856=1;
                  thread183254(tdone,ends);
                  thread183255(tdone,ends);
                  int biggest183256 = 0;
                  if(ends[67]>=biggest183256){
                    biggest183256=ends[67];
                  }
                  if(ends[68]>=biggest183256){
                    biggest183256=ends[68];
                  }
                  if(biggest183256 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread183257(tdone,ends);
                  thread183258(tdone,ends);
                  int biggest183259 = 0;
                  if(ends[65]>=biggest183259){
                    biggest183259=ends[65];
                  }
                  if(ends[66]>=biggest183259){
                    biggest183259=ends[66];
                  }
                  if(biggest183259 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest183259 == 0){
                    S29856=1;
                    thread183260(tdone,ends);
                    thread183261(tdone,ends);
                    int biggest183262 = 0;
                    if(ends[67]>=biggest183262){
                      biggest183262=ends[67];
                    }
                    if(ends[68]>=biggest183262){
                      biggest183262=ends[68];
                    }
                    if(biggest183262 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 516, column: 30
                  System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 527, column: 24
                  current_thread_52 += (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 528, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 529, column: 24
                  S29856=2;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  thread183263(tdone,ends);
                  thread183264(tdone,ends);
                  int biggest183265 = 0;
                  if(ends[67]>=biggest183265){
                    biggest183265=ends[67];
                  }
                  if(ends[68]>=biggest183265){
                    biggest183265=ends[68];
                  }
                  if(biggest183265 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest183265 == 0){
                    System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 527, column: 24
                    current_thread_52 += (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 528, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 529, column: 24
                    S29856=2;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
              case 2 : 
                S29856=2;
                current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 535, column: 20
                current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 536, column: 20
                currsigs.addElement(current_fill_51);
                current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 536, column: 20
                S28479=7;
                S30328=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 538, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                  S30328=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S30323=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 538, column: 20
                    S30323=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 538, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 539, column: 20
                      S28479=8;
                      S30555=0;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 7 : 
            switch(S30328){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 538, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                  S30328=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S30323){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 538, column: 20
                        S30323=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 538, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 539, column: 20
                          S28479=8;
                          S30555=0;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 538, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 539, column: 20
                        S28479=8;
                        S30555=0;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S30328=1;
                S30328=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 538, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                  S30328=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S30323=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 538, column: 20
                    S30323=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 538, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 538, column: 20
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 538, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 539, column: 20
                      S28479=8;
                      S30555=0;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S30555){
              case 0 : 
                if(!bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 542, column: 30
                  S30555=1;
                  if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 544, column: 36
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 541, column: 20
                    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 17
                    currsigs.addElement(filler1_amount_51);
                    filler1_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 393, column: 17
                    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 8
                    currsigs.addElement(filler2_amount_51);
                    filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 394, column: 8
                    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 8
                    currsigs.addElement(filler3_amount_51);
                    filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 395, column: 8
                    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 396, column: 8
                    currsigs.addElement(filler4_amount_51);
                    filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 396, column: 8
                    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 398, column: 8
                    currsigs.addElement(filler1_amount_51);
                    filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 398, column: 8
                    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 8
                    currsigs.addElement(filler2_amount_51);
                    filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 399, column: 8
                    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 400, column: 8
                    currsigs.addElement(filler3_amount_51);
                    filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 400, column: 8
                    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 401, column: 8
                    currsigs.addElement(filler4_amount_51);
                    filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 401, column: 8
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 404, column: 20
                    S28479=0;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 544, column: 36
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  ends[52]=2;
                  ;//sysj\conveyor_controller.sysj line: 541, column: 20
                  filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 17
                  currsigs.addElement(filler1_amount_51);
                  filler1_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 393, column: 17
                  filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 8
                  currsigs.addElement(filler2_amount_51);
                  filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 394, column: 8
                  filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 8
                  currsigs.addElement(filler3_amount_51);
                  filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 395, column: 8
                  filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 396, column: 8
                  currsigs.addElement(filler4_amount_51);
                  filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 396, column: 8
                  filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 398, column: 8
                  currsigs.addElement(filler1_amount_51);
                  filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 398, column: 8
                  filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 8
                  currsigs.addElement(filler2_amount_51);
                  filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 399, column: 8
                  filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 400, column: 8
                  currsigs.addElement(filler3_amount_51);
                  filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 400, column: 8
                  filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 401, column: 8
                  currsigs.addElement(filler4_amount_51);
                  filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 401, column: 8
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 404, column: 20
                  S28479=0;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread183136(int [] tdone, int [] ends){
        S51000=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread183135(int [] tdone, int [] ends){
        S50997=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 573, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread183134(int [] tdone, int [] ends){
        S51027=1;
    S51003=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 570, column: 26
      thread183135(tdone,ends);
      thread183136(tdone,ends);
      int biggest183137 = 0;
      if(ends[71]>=biggest183137){
        biggest183137=ends[71];
      }
      if(ends[72]>=biggest183137){
        biggest183137=ends[72];
      }
      if(biggest183137 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S51003=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread183133(int [] tdone, int [] ends){
        S50992=1;
    S50936=0;
    S50916=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 559, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
      S50916=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S50911=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 559, column: 12
        S50911=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 559, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 560, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S50936=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S50936=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread183132(int [] tdone, int [] ends){
        S50909=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 385, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 386, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 387, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 388, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 388, column: 16
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 17
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 393, column: 17
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 8
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 394, column: 8
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 8
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 395, column: 8
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 396, column: 8
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 396, column: 8
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 398, column: 8
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 398, column: 8
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 8
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 399, column: 8
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 400, column: 8
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 400, column: 8
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 401, column: 8
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 401, column: 8
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 404, column: 20
    S28479=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread183129(int [] tdone, int [] ends){
        S51000=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread183128(int [] tdone, int [] ends){
        S50997=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 573, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread183127(int [] tdone, int [] ends){
        S51027=1;
    S51003=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 570, column: 26
      thread183128(tdone,ends);
      thread183129(tdone,ends);
      int biggest183130 = 0;
      if(ends[71]>=biggest183130){
        biggest183130=ends[71];
      }
      if(ends[72]>=biggest183130){
        biggest183130=ends[72];
      }
      if(biggest183130 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S51003=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread183126(int [] tdone, int [] ends){
        S50992=1;
    S50936=0;
    S50916=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 559, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
      S50916=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S50911=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 559, column: 12
        S50911=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 559, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 560, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S50936=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S50936=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread183125(int [] tdone, int [] ends){
        S50909=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 385, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 386, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 387, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 388, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 388, column: 16
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 17
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 393, column: 17
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 8
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 394, column: 8
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 8
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 395, column: 8
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 396, column: 8
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 396, column: 8
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 398, column: 8
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 398, column: 8
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 8
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 399, column: 8
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 400, column: 8
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 400, column: 8
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 401, column: 8
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 401, column: 8
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 404, column: 20
    S28479=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread183122(int [] tdone, int [] ends){
        S51000=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread183121(int [] tdone, int [] ends){
        S50997=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 573, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread183120(int [] tdone, int [] ends){
        S51027=1;
    S51003=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 570, column: 26
      thread183121(tdone,ends);
      thread183122(tdone,ends);
      int biggest183123 = 0;
      if(ends[71]>=biggest183123){
        biggest183123=ends[71];
      }
      if(ends[72]>=biggest183123){
        biggest183123=ends[72];
      }
      if(biggest183123 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S51003=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread183119(int [] tdone, int [] ends){
        S50992=1;
    S50936=0;
    S50916=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 559, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
      S50916=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S50911=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 559, column: 12
        S50911=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 559, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 560, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S50936=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S50936=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread183118(int [] tdone, int [] ends){
        S50909=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 385, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 386, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 387, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 388, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 388, column: 16
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 17
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 393, column: 17
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 8
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 394, column: 8
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 8
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 395, column: 8
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 396, column: 8
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 396, column: 8
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 398, column: 8
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 398, column: 8
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 8
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 399, column: 8
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 400, column: 8
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 400, column: 8
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 401, column: 8
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 401, column: 8
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 404, column: 20
    S28479=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread183115(int [] tdone, int [] ends){
        S51000=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread183114(int [] tdone, int [] ends){
        S50997=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 573, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread183113(int [] tdone, int [] ends){
        S51027=1;
    S51003=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 570, column: 26
      thread183114(tdone,ends);
      thread183115(tdone,ends);
      int biggest183116 = 0;
      if(ends[71]>=biggest183116){
        biggest183116=ends[71];
      }
      if(ends[72]>=biggest183116){
        biggest183116=ends[72];
      }
      if(biggest183116 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S51003=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread183112(int [] tdone, int [] ends){
        S50992=1;
    S50936=0;
    S50916=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 559, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
      S50916=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S50911=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 559, column: 12
        S50911=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 559, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 559, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 559, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 560, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S50936=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S50936=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread183111(int [] tdone, int [] ends){
        S50909=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 385, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 386, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 387, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 388, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 388, column: 16
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 17
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 393, column: 17
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 8
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 394, column: 8
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 8
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 395, column: 8
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 396, column: 8
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 396, column: 8
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 398, column: 8
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 398, column: 8
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 8
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 399, column: 8
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 400, column: 8
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 400, column: 8
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 401, column: 8
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 401, column: 8
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 404, column: 20
    S28479=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S118679){
        case 0 : 
          S118679=0;
          break RUN;
        
        case 1 : 
          S118679=2;
          S118679=2;
          filler1_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler2_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler3_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler4_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler1_amount_51.setClear();//sysj\conveyor_controller.sysj line: 377, column: 9
          filler2_amount_51.setClear();//sysj\conveyor_controller.sysj line: 377, column: 9
          filler3_amount_51.setClear();//sysj\conveyor_controller.sysj line: 377, column: 9
          filler4_amount_51.setClear();//sysj\conveyor_controller.sysj line: 377, column: 9
          current_fill_51.setClear();//sysj\conveyor_controller.sysj line: 378, column: 9
          total_fill_51.setClear();//sysj\conveyor_controller.sysj line: 378, column: 9
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 380, column: 9
          S118678=0;
          S28462=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 382, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 9
            S28462=1;
            active[51]=1;
            ends[51]=1;
            break RUN;
          }
          else {
            S28457=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 382, column: 9
              S28457=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 9
                ends[51]=2;
                ;//sysj\conveyor_controller.sysj line: 382, column: 9
                S118678=1;
                thread183111(tdone,ends);
                thread183112(tdone,ends);
                thread183113(tdone,ends);
                int biggest183117 = 0;
                if(ends[52]>=biggest183117){
                  biggest183117=ends[52];
                }
                if(ends[69]>=biggest183117){
                  biggest183117=ends[69];
                }
                if(ends[70]>=biggest183117){
                  biggest183117=ends[70];
                }
                if(biggest183117 == 1){
                  active[51]=1;
                  ends[51]=1;
                  break RUN;
                }
              }
              else {
                active[51]=1;
                ends[51]=1;
                break RUN;
              }
            }
            else {
              active[51]=1;
              ends[51]=1;
              break RUN;
            }
          }
        
        case 2 : 
          filler1_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler2_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler3_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler4_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler1_amount_51.setClear();//sysj\conveyor_controller.sysj line: 377, column: 9
          filler2_amount_51.setClear();//sysj\conveyor_controller.sysj line: 377, column: 9
          filler3_amount_51.setClear();//sysj\conveyor_controller.sysj line: 377, column: 9
          filler4_amount_51.setClear();//sysj\conveyor_controller.sysj line: 377, column: 9
          current_fill_51.setClear();//sysj\conveyor_controller.sysj line: 378, column: 9
          total_fill_51.setClear();//sysj\conveyor_controller.sysj line: 378, column: 9
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 380, column: 9
          switch(S118678){
            case 0 : 
              switch(S28462){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 382, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 9
                    S28462=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    switch(S28457){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 382, column: 9
                          S28457=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 9
                            ends[51]=2;
                            ;//sysj\conveyor_controller.sysj line: 382, column: 9
                            S118678=1;
                            thread183118(tdone,ends);
                            thread183119(tdone,ends);
                            thread183120(tdone,ends);
                            int biggest183124 = 0;
                            if(ends[52]>=biggest183124){
                              biggest183124=ends[52];
                            }
                            if(ends[69]>=biggest183124){
                              biggest183124=ends[69];
                            }
                            if(ends[70]>=biggest183124){
                              biggest183124=ends[70];
                            }
                            if(biggest183124 == 1){
                              active[51]=1;
                              ends[51]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[51]=1;
                            ends[51]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 9
                          ends[51]=2;
                          ;//sysj\conveyor_controller.sysj line: 382, column: 9
                          S118678=1;
                          thread183125(tdone,ends);
                          thread183126(tdone,ends);
                          thread183127(tdone,ends);
                          int biggest183131 = 0;
                          if(ends[52]>=biggest183131){
                            biggest183131=ends[52];
                          }
                          if(ends[69]>=biggest183131){
                            biggest183131=ends[69];
                          }
                          if(ends[70]>=biggest183131){
                            biggest183131=ends[70];
                          }
                          if(biggest183131 == 1){
                            active[51]=1;
                            ends[51]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S28462=1;
                  S28462=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 382, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 9
                    S28462=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    S28457=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 382, column: 9
                      S28457=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 382, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 382, column: 9
                        ends[51]=2;
                        ;//sysj\conveyor_controller.sysj line: 382, column: 9
                        S118678=1;
                        thread183132(tdone,ends);
                        thread183133(tdone,ends);
                        thread183134(tdone,ends);
                        int biggest183138 = 0;
                        if(ends[52]>=biggest183138){
                          biggest183138=ends[52];
                        }
                        if(ends[69]>=biggest183138){
                          biggest183138=ends[69];
                        }
                        if(ends[70]>=biggest183138){
                          biggest183138=ends[70];
                        }
                        if(biggest183138 == 1){
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[51]=1;
                        ends[51]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[51]=1;
                      ends[51]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread183139(tdone,ends);
              thread183266(tdone,ends);
              thread183267(tdone,ends);
              int biggest183274 = 0;
              if(ends[52]>=biggest183274){
                biggest183274=ends[52];
              }
              if(ends[69]>=biggest183274){
                biggest183274=ends[69];
              }
              if(ends[70]>=biggest183274){
                biggest183274=ends[70];
              }
              if(biggest183274 == 1){
                active[51]=1;
                ends[51]=1;
                break RUN;
              }
              //FINXME code
              if(biggest183274 == 0){
                S118679=0;
                active[51]=0;
                ends[51]=0;
                S118679=0;
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
    filler1_51 = new Signal();
    filler2_51 = new Signal();
    filler3_51 = new Signal();
    filler4_51 = new Signal();
    filler1_amount_51 = new Signal();
    filler2_amount_51 = new Signal();
    filler3_amount_51 = new Signal();
    filler4_amount_51 = new Signal();
    current_fill_51 = new Signal();
    total_fill_51 = new Signal();
    bottleAtPos2_51 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[51] != 0){
      int index = 51;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[51]!=0 || suspended[51]!=0 || active[51]!=1);
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
      filler1_51.setpreclear();
      filler2_51.setpreclear();
      filler3_51.setpreclear();
      filler4_51.setpreclear();
      filler1_amount_51.setpreclear();
      filler2_amount_51.setpreclear();
      filler3_amount_51.setpreclear();
      filler4_amount_51.setpreclear();
      current_fill_51.setpreclear();
      total_fill_51.setpreclear();
      bottleAtPos2_51.setpreclear();
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
      filler1_51.setClear();
      filler2_51.setClear();
      filler3_51.setClear();
      filler4_51.setClear();
      filler1_amount_51.setClear();
      filler2_amount_51.setClear();
      filler3_amount_51.setClear();
      filler4_amount_51.setClear();
      current_fill_51.setClear();
      total_fill_51.setClear();
      bottleAtPos2_51.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[51]!=0 || suspended[51]!=0 || active[51]!=1);
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
      if(active[51] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
