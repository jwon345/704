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
  private Signal filler1_56;
  private Signal filler2_56;
  private Signal filler3_56;
  private Signal filler4_56;
  private Signal done_56;
  private Signal filler1_amount_56;
  private Signal filler2_amount_56;
  private Signal filler3_amount_56;
  private Signal filler4_amount_56;
  private Signal current_fill_56;
  private Signal total_fill_56;
  private Signal bottleAtPos2_56;
  private int current_thread_57;//sysj\conveyor_controller.sysj line: 434, column: 16
  private int total_thread_57;//sysj\conveyor_controller.sysj line: 435, column: 16
  private long __start_thread_57;//sysj\conveyor_controller.sysj line: 433, column: 9
  private int S133261 = 1;
  private int S133260 = 1;
  private int S43024 = 1;
  private int S43019 = 1;
  private int S65471 = 1;
  private int S43043 = 1;
  private int S43050 = 1;
  private int S43045 = 1;
  private int S43200 = 1;
  private int S43151 = 1;
  private int S43156 = 1;
  private int S43165 = 1;
  private int S43170 = 1;
  private int S43548 = 1;
  private int S43499 = 1;
  private int S43504 = 1;
  private int S43513 = 1;
  private int S43518 = 1;
  private int S43954 = 1;
  private int S43905 = 1;
  private int S43910 = 1;
  private int S43919 = 1;
  private int S43924 = 1;
  private int S44418 = 1;
  private int S44369 = 1;
  private int S44374 = 1;
  private int S44383 = 1;
  private int S44388 = 1;
  private int S44890 = 1;
  private int S44885 = 1;
  private int S45117 = 1;
  private int S65476 = 1;
  private int S65559 = 1;
  private int S65503 = 1;
  private int S65483 = 1;
  private int S65478 = 1;
  private int S65594 = 1;
  private int S65570 = 1;
  private int S65564 = 1;
  private int S65567 = 1;
  
  private int[] ends = new int[106];
  private int[] tdone = new int[106];
  
  public void thread192580(int [] tdone, int [] ends){
        S65567=1;
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread192579(int [] tdone, int [] ends){
        S65564=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 628, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192577(int [] tdone, int [] ends){
        switch(S65567){
      case 0 : 
        active[78]=0;
        ends[78]=0;
        tdone[78]=1;
        break;
      
      case 1 : 
        if(done_56.getprestatus()){//sysj\conveyor_controller.sysj line: 632, column: 35
          ends[78]=2;
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

  public void thread192576(int [] tdone, int [] ends){
        switch(S65564){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 628, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[77]=1;
        ends[77]=1;
        tdone[77]=1;
        break;
      
    }
  }

  public void thread192575(int [] tdone, int [] ends){
        switch(S65594){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        switch(S65570){
          case 0 : 
            thread192576(tdone,ends);
            thread192577(tdone,ends);
            int biggest192578 = 0;
            if(ends[77]>=biggest192578){
              biggest192578=ends[77];
            }
            if(ends[78]>=biggest192578){
              biggest192578=ends[78];
            }
            if(biggest192578 == 1){
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            if(biggest192578 == 2){
              ends[76]=2;
              ;//sysj\conveyor_controller.sysj line: 626, column: 18
              S65570=1;
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            //FINXME code
            if(biggest192578 == 0){
              S65570=1;
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
          case 1 : 
            S65570=1;
            S65570=0;
            if(bottleAtPos2_56.getprestatus()){//sysj\conveyor_controller.sysj line: 625, column: 26
              thread192579(tdone,ends);
              thread192580(tdone,ends);
              int biggest192581 = 0;
              if(ends[77]>=biggest192581){
                biggest192581=ends[77];
              }
              if(ends[78]>=biggest192581){
                biggest192581=ends[78];
              }
              if(biggest192581 == 1){
                active[76]=1;
                ends[76]=1;
                tdone[76]=1;
              }
            }
            else {
              S65570=1;
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192574(int [] tdone, int [] ends){
        switch(S65559){
      case 0 : 
        active[75]=0;
        ends[75]=0;
        tdone[75]=1;
        break;
      
      case 1 : 
        switch(S65503){
          case 0 : 
            switch(S65483){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 610, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
                  S65483=1;
                  active[75]=1;
                  ends[75]=1;
                  tdone[75]=1;
                }
                else {
                  switch(S65478){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 610, column: 12
                        S65478=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
                          ends[75]=2;
                          ;//sysj\conveyor_controller.sysj line: 610, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 611, column: 15
                            bottleAtPos2_56.setPresent();//sysj\conveyor_controller.sysj line: 612, column: 13
                            currsigs.addElement(bottleAtPos2_56);
                            S65503=1;
                            active[75]=1;
                            ends[75]=1;
                            tdone[75]=1;
                          }
                          else {
                            done_56.setPresent();//sysj\conveyor_controller.sysj line: 615, column: 13
                            currsigs.addElement(done_56);
                            S65503=1;
                            active[75]=1;
                            ends[75]=1;
                            tdone[75]=1;
                          }
                        }
                        else {
                          active[75]=1;
                          ends[75]=1;
                          tdone[75]=1;
                        }
                      }
                      else {
                        active[75]=1;
                        ends[75]=1;
                        tdone[75]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
                        ends[75]=2;
                        ;//sysj\conveyor_controller.sysj line: 610, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 611, column: 15
                          bottleAtPos2_56.setPresent();//sysj\conveyor_controller.sysj line: 612, column: 13
                          currsigs.addElement(bottleAtPos2_56);
                          S65503=1;
                          active[75]=1;
                          ends[75]=1;
                          tdone[75]=1;
                        }
                        else {
                          done_56.setPresent();//sysj\conveyor_controller.sysj line: 615, column: 13
                          currsigs.addElement(done_56);
                          S65503=1;
                          active[75]=1;
                          ends[75]=1;
                          tdone[75]=1;
                        }
                      }
                      else {
                        active[75]=1;
                        ends[75]=1;
                        tdone[75]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S65483=1;
                S65483=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 610, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
                  S65483=1;
                  active[75]=1;
                  ends[75]=1;
                  tdone[75]=1;
                }
                else {
                  S65478=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 610, column: 12
                    S65478=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
                      ends[75]=2;
                      ;//sysj\conveyor_controller.sysj line: 610, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 611, column: 15
                        bottleAtPos2_56.setPresent();//sysj\conveyor_controller.sysj line: 612, column: 13
                        currsigs.addElement(bottleAtPos2_56);
                        S65503=1;
                        active[75]=1;
                        ends[75]=1;
                        tdone[75]=1;
                      }
                      else {
                        done_56.setPresent();//sysj\conveyor_controller.sysj line: 615, column: 13
                        currsigs.addElement(done_56);
                        S65503=1;
                        active[75]=1;
                        ends[75]=1;
                        tdone[75]=1;
                      }
                    }
                    else {
                      active[75]=1;
                      ends[75]=1;
                      tdone[75]=1;
                    }
                  }
                  else {
                    active[75]=1;
                    ends[75]=1;
                    tdone[75]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S65503=1;
            S65503=0;
            S65483=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 610, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
              S65483=1;
              active[75]=1;
              ends[75]=1;
              tdone[75]=1;
            }
            else {
              S65478=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 610, column: 12
                S65478=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
                  ends[75]=2;
                  ;//sysj\conveyor_controller.sysj line: 610, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 611, column: 15
                    bottleAtPos2_56.setPresent();//sysj\conveyor_controller.sysj line: 612, column: 13
                    currsigs.addElement(bottleAtPos2_56);
                    S65503=1;
                    active[75]=1;
                    ends[75]=1;
                    tdone[75]=1;
                  }
                  else {
                    done_56.setPresent();//sysj\conveyor_controller.sysj line: 615, column: 13
                    currsigs.addElement(done_56);
                    S65503=1;
                    active[75]=1;
                    ends[75]=1;
                    tdone[75]=1;
                  }
                }
                else {
                  active[75]=1;
                  ends[75]=1;
                  tdone[75]=1;
                }
              }
              else {
                active[75]=1;
                ends[75]=1;
                tdone[75]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192573(int [] tdone, int [] ends){
        switch(S65476){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        filler1_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 597, column: 11
        currsigs.addElement(filler1_amount_56);
        filler1_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 597, column: 11
        filler2_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 598, column: 8
        currsigs.addElement(filler2_amount_56);
        filler2_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 598, column: 8
        filler3_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 599, column: 8
        currsigs.addElement(filler3_amount_56);
        filler3_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 599, column: 8
        filler4_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 600, column: 8
        currsigs.addElement(filler4_amount_56);
        filler4_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 600, column: 8
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
        break;
      
    }
  }

  public void thread192571(int [] tdone, int [] ends){
        switch(S44388){
      case 0 : 
        active[73]=0;
        ends[73]=0;
        tdone[73]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[73]=1;
        ends[73]=1;
        tdone[73]=1;
        break;
      
    }
  }

  public void thread192570(int [] tdone, int [] ends){
        switch(S44383){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 560, column: 32
        currsigs.addElement(valveInletOnOff);
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
        break;
      
    }
  }

  public void thread192568(int [] tdone, int [] ends){
        S44388=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread192567(int [] tdone, int [] ends){
        S44383=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 559, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 560, column: 32
    currsigs.addElement(valveInletOnOff);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread192565(int [] tdone, int [] ends){
        switch(S44374){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
        break;
      
    }
  }

  public void thread192564(int [] tdone, int [] ends){
        switch(S44369){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
        break;
      
    }
  }

  public void thread192562(int [] tdone, int [] ends){
        S44388=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread192561(int [] tdone, int [] ends){
        S44383=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 559, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 560, column: 32
    currsigs.addElement(valveInletOnOff);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread192559(int [] tdone, int [] ends){
        S44374=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192558(int [] tdone, int [] ends){
        S44369=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 549, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192556(int [] tdone, int [] ends){
        switch(S43924){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
        break;
      
    }
  }

  public void thread192555(int [] tdone, int [] ends){
        switch(S43919){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 530, column: 32
        currsigs.addElement(valveInletOnOff);
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
        break;
      
    }
  }

  public void thread192553(int [] tdone, int [] ends){
        S43924=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192552(int [] tdone, int [] ends){
        S43919=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 529, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 530, column: 32
    currsigs.addElement(valveInletOnOff);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread192550(int [] tdone, int [] ends){
        switch(S43910){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread192549(int [] tdone, int [] ends){
        switch(S43905){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 520, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread192547(int [] tdone, int [] ends){
        S43924=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192546(int [] tdone, int [] ends){
        S43919=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 529, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 530, column: 32
    currsigs.addElement(valveInletOnOff);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread192544(int [] tdone, int [] ends){
        S44374=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192543(int [] tdone, int [] ends){
        S44369=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 549, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192541(int [] tdone, int [] ends){
        S43910=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread192540(int [] tdone, int [] ends){
        S43905=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 519, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 520, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192538(int [] tdone, int [] ends){
        switch(S43518){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 504, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
        break;
      
    }
  }

  public void thread192537(int [] tdone, int [] ends){
        switch(S43513){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 500, column: 32
        currsigs.addElement(valveInletOnOff);
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
        break;
      
    }
  }

  public void thread192535(int [] tdone, int [] ends){
        S43518=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 504, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192534(int [] tdone, int [] ends){
        S43513=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 499, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 500, column: 32
    currsigs.addElement(valveInletOnOff);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread192532(int [] tdone, int [] ends){
        switch(S43504){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 492, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
        break;
      
    }
  }

  public void thread192531(int [] tdone, int [] ends){
        switch(S43499){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 488, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
        break;
      
    }
  }

  public void thread192529(int [] tdone, int [] ends){
        S43518=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 504, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192528(int [] tdone, int [] ends){
        S43513=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 499, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 500, column: 32
    currsigs.addElement(valveInletOnOff);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread192526(int [] tdone, int [] ends){
        S44374=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192525(int [] tdone, int [] ends){
        S44369=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 549, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192523(int [] tdone, int [] ends){
        S43910=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread192522(int [] tdone, int [] ends){
        S43905=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 519, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 520, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192520(int [] tdone, int [] ends){
        S43504=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 492, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread192519(int [] tdone, int [] ends){
        S43499=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 487, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 488, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192517(int [] tdone, int [] ends){
        switch(S43170){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 472, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[61]=1;
        ends[61]=1;
        tdone[61]=1;
        break;
      
    }
  }

  public void thread192516(int [] tdone, int [] ends){
        switch(S43165){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 468, column: 32
        currsigs.addElement(valveInletOnOff);
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
        break;
      
    }
  }

  public void thread192514(int [] tdone, int [] ends){
        S43170=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 472, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192513(int [] tdone, int [] ends){
        S43165=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 467, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 468, column: 32
    currsigs.addElement(valveInletOnOff);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread192511(int [] tdone, int [] ends){
        switch(S43156){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
        break;
      
    }
  }

  public void thread192510(int [] tdone, int [] ends){
        switch(S43151){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread192508(int [] tdone, int [] ends){
        S43170=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 472, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192507(int [] tdone, int [] ends){
        S43165=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 467, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 468, column: 32
    currsigs.addElement(valveInletOnOff);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread192505(int [] tdone, int [] ends){
        S44374=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192504(int [] tdone, int [] ends){
        S44369=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 549, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192502(int [] tdone, int [] ends){
        S43910=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread192501(int [] tdone, int [] ends){
        S43905=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 519, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 520, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192499(int [] tdone, int [] ends){
        S43504=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 492, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread192498(int [] tdone, int [] ends){
        S43499=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 487, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 488, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192496(int [] tdone, int [] ends){
        S43156=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread192495(int [] tdone, int [] ends){
        S43151=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 457, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192493(int [] tdone, int [] ends){
        S44374=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192492(int [] tdone, int [] ends){
        S44369=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 549, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192490(int [] tdone, int [] ends){
        S43910=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread192489(int [] tdone, int [] ends){
        S43905=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 519, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 520, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192487(int [] tdone, int [] ends){
        S43504=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 492, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread192486(int [] tdone, int [] ends){
        S43499=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 487, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 488, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192484(int [] tdone, int [] ends){
        S43156=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread192483(int [] tdone, int [] ends){
        S43151=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 457, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192481(int [] tdone, int [] ends){
        S44374=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192480(int [] tdone, int [] ends){
        S44369=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 549, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192478(int [] tdone, int [] ends){
        S43910=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread192477(int [] tdone, int [] ends){
        S43905=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 519, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 520, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192475(int [] tdone, int [] ends){
        S43504=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 492, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread192474(int [] tdone, int [] ends){
        S43499=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 487, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 488, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192472(int [] tdone, int [] ends){
        S43156=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread192471(int [] tdone, int [] ends){
        S43151=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 457, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192469(int [] tdone, int [] ends){
        S44374=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192468(int [] tdone, int [] ends){
        S44369=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 549, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192466(int [] tdone, int [] ends){
        S43910=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread192465(int [] tdone, int [] ends){
        S43905=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 519, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 520, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192463(int [] tdone, int [] ends){
        S43504=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 492, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread192462(int [] tdone, int [] ends){
        S43499=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 487, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 488, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192460(int [] tdone, int [] ends){
        S43156=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread192459(int [] tdone, int [] ends){
        S43151=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 457, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192457(int [] tdone, int [] ends){
        S44374=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192456(int [] tdone, int [] ends){
        S44369=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 549, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 550, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192454(int [] tdone, int [] ends){
        S43910=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread192453(int [] tdone, int [] ends){
        S43905=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 519, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 520, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192451(int [] tdone, int [] ends){
        S43504=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 492, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread192450(int [] tdone, int [] ends){
        S43499=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 487, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 488, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192448(int [] tdone, int [] ends){
        S43156=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread192447(int [] tdone, int [] ends){
        S43151=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 457, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192446(int [] tdone, int [] ends){
        switch(S65471){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        switch(S43043){
          case 0 : 
            if(bottleAtPos2_56.getprestatus()){//sysj\conveyor_controller.sysj line: 446, column: 26
              S43043=1;
              S43050=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 447, column: 20
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 447, column: 20
                S43050=1;
                active[57]=1;
                ends[57]=1;
                tdone[57]=1;
              }
              else {
                S43045=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 447, column: 20
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 447, column: 20
                  S43045=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 447, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 447, column: 20
                    ends[57]=2;
                    ;//sysj\conveyor_controller.sysj line: 447, column: 20
                    S43043=2;
                    __start_thread_57 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 433, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_57 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 433, column: 9
                      ends[57]=2;
                      ;//sysj\conveyor_controller.sysj line: 433, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 450, column: 20
                      S43043=3;
                      if(((filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 453, column: 24
                        S43200=0;
                        thread192447(tdone,ends);
                        thread192448(tdone,ends);
                        int biggest192449 = 0;
                        if(ends[58]>=biggest192449){
                          biggest192449=ends[58];
                        }
                        if(ends[59]>=biggest192449){
                          biggest192449=ends[59];
                        }
                        if(biggest192449 == 1){
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                      }
                      else {
                        S43043=4;
                        if(((filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 483, column: 24
                          S43548=0;
                          thread192450(tdone,ends);
                          thread192451(tdone,ends);
                          int biggest192452 = 0;
                          if(ends[62]>=biggest192452){
                            biggest192452=ends[62];
                          }
                          if(ends[63]>=biggest192452){
                            biggest192452=ends[63];
                          }
                          if(biggest192452 == 1){
                            active[57]=1;
                            ends[57]=1;
                            tdone[57]=1;
                          }
                        }
                        else {
                          S43043=5;
                          if(((filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 515, column: 24
                            S43954=0;
                            thread192453(tdone,ends);
                            thread192454(tdone,ends);
                            int biggest192455 = 0;
                            if(ends[66]>=biggest192455){
                              biggest192455=ends[66];
                            }
                            if(ends[67]>=biggest192455){
                              biggest192455=ends[67];
                            }
                            if(biggest192455 == 1){
                              active[57]=1;
                              ends[57]=1;
                              tdone[57]=1;
                            }
                          }
                          else {
                            S43043=6;
                            if(((filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 545, column: 24
                              S44418=0;
                              thread192456(tdone,ends);
                              thread192457(tdone,ends);
                              int biggest192458 = 0;
                              if(ends[70]>=biggest192458){
                                biggest192458=ends[70];
                              }
                              if(ends[71]>=biggest192458){
                                biggest192458=ends[71];
                              }
                              if(biggest192458 == 1){
                                active[57]=1;
                                ends[57]=1;
                                tdone[57]=1;
                              }
                            }
                            else {
                              current_thread_57 = 0;//sysj\conveyor_controller.sysj line: 576, column: 20
                              current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 20
                              currsigs.addElement(current_fill_56);
                              current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 577, column: 20
                              S43043=7;
                              S44890=0;
                              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 579, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                                S44890=1;
                                active[57]=1;
                                ends[57]=1;
                                tdone[57]=1;
                              }
                              else {
                                S44885=0;
                                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 579, column: 20
                                  S44885=1;
                                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                                    ends[57]=2;
                                    ;//sysj\conveyor_controller.sysj line: 579, column: 20
                                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 580, column: 20
                                    S43043=8;
                                    S45117=0;
                                    active[57]=1;
                                    ends[57]=1;
                                    tdone[57]=1;
                                  }
                                  else {
                                    active[57]=1;
                                    ends[57]=1;
                                    tdone[57]=1;
                                  }
                                }
                                else {
                                  active[57]=1;
                                  ends[57]=1;
                                  tdone[57]=1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    else {
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                  else {
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                else {
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
              }
            }
            else {
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            break;
          
          case 1 : 
            switch(S43050){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 447, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 447, column: 20
                  S43050=1;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  switch(S43045){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 447, column: 20
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 447, column: 20
                        S43045=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 447, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 447, column: 20
                          ends[57]=2;
                          ;//sysj\conveyor_controller.sysj line: 447, column: 20
                          S43043=2;
                          __start_thread_57 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 433, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_57 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 433, column: 9
                            ends[57]=2;
                            ;//sysj\conveyor_controller.sysj line: 433, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 450, column: 20
                            S43043=3;
                            if(((filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 453, column: 24
                              S43200=0;
                              thread192459(tdone,ends);
                              thread192460(tdone,ends);
                              int biggest192461 = 0;
                              if(ends[58]>=biggest192461){
                                biggest192461=ends[58];
                              }
                              if(ends[59]>=biggest192461){
                                biggest192461=ends[59];
                              }
                              if(biggest192461 == 1){
                                active[57]=1;
                                ends[57]=1;
                                tdone[57]=1;
                              }
                            }
                            else {
                              S43043=4;
                              if(((filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 483, column: 24
                                S43548=0;
                                thread192462(tdone,ends);
                                thread192463(tdone,ends);
                                int biggest192464 = 0;
                                if(ends[62]>=biggest192464){
                                  biggest192464=ends[62];
                                }
                                if(ends[63]>=biggest192464){
                                  biggest192464=ends[63];
                                }
                                if(biggest192464 == 1){
                                  active[57]=1;
                                  ends[57]=1;
                                  tdone[57]=1;
                                }
                              }
                              else {
                                S43043=5;
                                if(((filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 515, column: 24
                                  S43954=0;
                                  thread192465(tdone,ends);
                                  thread192466(tdone,ends);
                                  int biggest192467 = 0;
                                  if(ends[66]>=biggest192467){
                                    biggest192467=ends[66];
                                  }
                                  if(ends[67]>=biggest192467){
                                    biggest192467=ends[67];
                                  }
                                  if(biggest192467 == 1){
                                    active[57]=1;
                                    ends[57]=1;
                                    tdone[57]=1;
                                  }
                                }
                                else {
                                  S43043=6;
                                  if(((filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 545, column: 24
                                    S44418=0;
                                    thread192468(tdone,ends);
                                    thread192469(tdone,ends);
                                    int biggest192470 = 0;
                                    if(ends[70]>=biggest192470){
                                      biggest192470=ends[70];
                                    }
                                    if(ends[71]>=biggest192470){
                                      biggest192470=ends[71];
                                    }
                                    if(biggest192470 == 1){
                                      active[57]=1;
                                      ends[57]=1;
                                      tdone[57]=1;
                                    }
                                  }
                                  else {
                                    current_thread_57 = 0;//sysj\conveyor_controller.sysj line: 576, column: 20
                                    current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 20
                                    currsigs.addElement(current_fill_56);
                                    current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 577, column: 20
                                    S43043=7;
                                    S44890=0;
                                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 579, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                                      S44890=1;
                                      active[57]=1;
                                      ends[57]=1;
                                      tdone[57]=1;
                                    }
                                    else {
                                      S44885=0;
                                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 579, column: 20
                                        S44885=1;
                                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                                          ends[57]=2;
                                          ;//sysj\conveyor_controller.sysj line: 579, column: 20
                                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 580, column: 20
                                          S43043=8;
                                          S45117=0;
                                          active[57]=1;
                                          ends[57]=1;
                                          tdone[57]=1;
                                        }
                                        else {
                                          active[57]=1;
                                          ends[57]=1;
                                          tdone[57]=1;
                                        }
                                      }
                                      else {
                                        active[57]=1;
                                        ends[57]=1;
                                        tdone[57]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            active[57]=1;
                            ends[57]=1;
                            tdone[57]=1;
                          }
                        }
                        else {
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                      }
                      else {
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 447, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 447, column: 20
                        ends[57]=2;
                        ;//sysj\conveyor_controller.sysj line: 447, column: 20
                        S43043=2;
                        __start_thread_57 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 433, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_57 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 433, column: 9
                          ends[57]=2;
                          ;//sysj\conveyor_controller.sysj line: 433, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 450, column: 20
                          S43043=3;
                          if(((filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 453, column: 24
                            S43200=0;
                            thread192471(tdone,ends);
                            thread192472(tdone,ends);
                            int biggest192473 = 0;
                            if(ends[58]>=biggest192473){
                              biggest192473=ends[58];
                            }
                            if(ends[59]>=biggest192473){
                              biggest192473=ends[59];
                            }
                            if(biggest192473 == 1){
                              active[57]=1;
                              ends[57]=1;
                              tdone[57]=1;
                            }
                          }
                          else {
                            S43043=4;
                            if(((filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 483, column: 24
                              S43548=0;
                              thread192474(tdone,ends);
                              thread192475(tdone,ends);
                              int biggest192476 = 0;
                              if(ends[62]>=biggest192476){
                                biggest192476=ends[62];
                              }
                              if(ends[63]>=biggest192476){
                                biggest192476=ends[63];
                              }
                              if(biggest192476 == 1){
                                active[57]=1;
                                ends[57]=1;
                                tdone[57]=1;
                              }
                            }
                            else {
                              S43043=5;
                              if(((filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 515, column: 24
                                S43954=0;
                                thread192477(tdone,ends);
                                thread192478(tdone,ends);
                                int biggest192479 = 0;
                                if(ends[66]>=biggest192479){
                                  biggest192479=ends[66];
                                }
                                if(ends[67]>=biggest192479){
                                  biggest192479=ends[67];
                                }
                                if(biggest192479 == 1){
                                  active[57]=1;
                                  ends[57]=1;
                                  tdone[57]=1;
                                }
                              }
                              else {
                                S43043=6;
                                if(((filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 545, column: 24
                                  S44418=0;
                                  thread192480(tdone,ends);
                                  thread192481(tdone,ends);
                                  int biggest192482 = 0;
                                  if(ends[70]>=biggest192482){
                                    biggest192482=ends[70];
                                  }
                                  if(ends[71]>=biggest192482){
                                    biggest192482=ends[71];
                                  }
                                  if(biggest192482 == 1){
                                    active[57]=1;
                                    ends[57]=1;
                                    tdone[57]=1;
                                  }
                                }
                                else {
                                  current_thread_57 = 0;//sysj\conveyor_controller.sysj line: 576, column: 20
                                  current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 20
                                  currsigs.addElement(current_fill_56);
                                  current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 577, column: 20
                                  S43043=7;
                                  S44890=0;
                                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 579, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                                    S44890=1;
                                    active[57]=1;
                                    ends[57]=1;
                                    tdone[57]=1;
                                  }
                                  else {
                                    S44885=0;
                                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 579, column: 20
                                      S44885=1;
                                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                                        ends[57]=2;
                                        ;//sysj\conveyor_controller.sysj line: 579, column: 20
                                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 580, column: 20
                                        S43043=8;
                                        S45117=0;
                                        active[57]=1;
                                        ends[57]=1;
                                        tdone[57]=1;
                                      }
                                      else {
                                        active[57]=1;
                                        ends[57]=1;
                                        tdone[57]=1;
                                      }
                                    }
                                    else {
                                      active[57]=1;
                                      ends[57]=1;
                                      tdone[57]=1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                      }
                      else {
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S43050=1;
                S43050=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 447, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 447, column: 20
                  S43050=1;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  S43045=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 447, column: 20
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 447, column: 20
                    S43045=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 447, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 447, column: 20
                      ends[57]=2;
                      ;//sysj\conveyor_controller.sysj line: 447, column: 20
                      S43043=2;
                      __start_thread_57 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 433, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_57 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 433, column: 9
                        ends[57]=2;
                        ;//sysj\conveyor_controller.sysj line: 433, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 450, column: 20
                        S43043=3;
                        if(((filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 453, column: 24
                          S43200=0;
                          thread192483(tdone,ends);
                          thread192484(tdone,ends);
                          int biggest192485 = 0;
                          if(ends[58]>=biggest192485){
                            biggest192485=ends[58];
                          }
                          if(ends[59]>=biggest192485){
                            biggest192485=ends[59];
                          }
                          if(biggest192485 == 1){
                            active[57]=1;
                            ends[57]=1;
                            tdone[57]=1;
                          }
                        }
                        else {
                          S43043=4;
                          if(((filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 483, column: 24
                            S43548=0;
                            thread192486(tdone,ends);
                            thread192487(tdone,ends);
                            int biggest192488 = 0;
                            if(ends[62]>=biggest192488){
                              biggest192488=ends[62];
                            }
                            if(ends[63]>=biggest192488){
                              biggest192488=ends[63];
                            }
                            if(biggest192488 == 1){
                              active[57]=1;
                              ends[57]=1;
                              tdone[57]=1;
                            }
                          }
                          else {
                            S43043=5;
                            if(((filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 515, column: 24
                              S43954=0;
                              thread192489(tdone,ends);
                              thread192490(tdone,ends);
                              int biggest192491 = 0;
                              if(ends[66]>=biggest192491){
                                biggest192491=ends[66];
                              }
                              if(ends[67]>=biggest192491){
                                biggest192491=ends[67];
                              }
                              if(biggest192491 == 1){
                                active[57]=1;
                                ends[57]=1;
                                tdone[57]=1;
                              }
                            }
                            else {
                              S43043=6;
                              if(((filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 545, column: 24
                                S44418=0;
                                thread192492(tdone,ends);
                                thread192493(tdone,ends);
                                int biggest192494 = 0;
                                if(ends[70]>=biggest192494){
                                  biggest192494=ends[70];
                                }
                                if(ends[71]>=biggest192494){
                                  biggest192494=ends[71];
                                }
                                if(biggest192494 == 1){
                                  active[57]=1;
                                  ends[57]=1;
                                  tdone[57]=1;
                                }
                              }
                              else {
                                current_thread_57 = 0;//sysj\conveyor_controller.sysj line: 576, column: 20
                                current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 20
                                currsigs.addElement(current_fill_56);
                                current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 577, column: 20
                                S43043=7;
                                S44890=0;
                                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 579, column: 20
                                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                                  S44890=1;
                                  active[57]=1;
                                  ends[57]=1;
                                  tdone[57]=1;
                                }
                                else {
                                  S44885=0;
                                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 579, column: 20
                                    S44885=1;
                                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                                      ends[57]=2;
                                      ;//sysj\conveyor_controller.sysj line: 579, column: 20
                                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 580, column: 20
                                      S43043=8;
                                      S45117=0;
                                      active[57]=1;
                                      ends[57]=1;
                                      tdone[57]=1;
                                    }
                                    else {
                                      active[57]=1;
                                      ends[57]=1;
                                      tdone[57]=1;
                                    }
                                  }
                                  else {
                                    active[57]=1;
                                    ends[57]=1;
                                    tdone[57]=1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      else {
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                    }
                    else {
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                  else {
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_57 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 433, column: 9
              ends[57]=2;
              ;//sysj\conveyor_controller.sysj line: 433, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 450, column: 20
              S43043=3;
              if(((filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 453, column: 24
                S43200=0;
                thread192495(tdone,ends);
                thread192496(tdone,ends);
                int biggest192497 = 0;
                if(ends[58]>=biggest192497){
                  biggest192497=ends[58];
                }
                if(ends[59]>=biggest192497){
                  biggest192497=ends[59];
                }
                if(biggest192497 == 1){
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
              }
              else {
                S43043=4;
                if(((filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 483, column: 24
                  S43548=0;
                  thread192498(tdone,ends);
                  thread192499(tdone,ends);
                  int biggest192500 = 0;
                  if(ends[62]>=biggest192500){
                    biggest192500=ends[62];
                  }
                  if(ends[63]>=biggest192500){
                    biggest192500=ends[63];
                  }
                  if(biggest192500 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                else {
                  S43043=5;
                  if(((filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 515, column: 24
                    S43954=0;
                    thread192501(tdone,ends);
                    thread192502(tdone,ends);
                    int biggest192503 = 0;
                    if(ends[66]>=biggest192503){
                      biggest192503=ends[66];
                    }
                    if(ends[67]>=biggest192503){
                      biggest192503=ends[67];
                    }
                    if(biggest192503 == 1){
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                  else {
                    S43043=6;
                    if(((filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 545, column: 24
                      S44418=0;
                      thread192504(tdone,ends);
                      thread192505(tdone,ends);
                      int biggest192506 = 0;
                      if(ends[70]>=biggest192506){
                        biggest192506=ends[70];
                      }
                      if(ends[71]>=biggest192506){
                        biggest192506=ends[71];
                      }
                      if(biggest192506 == 1){
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                    }
                    else {
                      current_thread_57 = 0;//sysj\conveyor_controller.sysj line: 576, column: 20
                      current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 20
                      currsigs.addElement(current_fill_56);
                      current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 577, column: 20
                      S43043=7;
                      S44890=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 579, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                        S44890=1;
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      else {
                        S44885=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 579, column: 20
                          S44885=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                            ends[57]=2;
                            ;//sysj\conveyor_controller.sysj line: 579, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 580, column: 20
                            S43043=8;
                            S45117=0;
                            active[57]=1;
                            ends[57]=1;
                            tdone[57]=1;
                          }
                          else {
                            active[57]=1;
                            ends[57]=1;
                            tdone[57]=1;
                          }
                        }
                        else {
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                      }
                    }
                  }
                }
              }
            }
            else {
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            break;
          
          case 3 : 
            switch(S43200){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 455, column: 30
                  S43200=1;
                  thread192507(tdone,ends);
                  thread192508(tdone,ends);
                  int biggest192509 = 0;
                  if(ends[60]>=biggest192509){
                    biggest192509=ends[60];
                  }
                  if(ends[61]>=biggest192509){
                    biggest192509=ends[61];
                  }
                  if(biggest192509 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                else {
                  thread192510(tdone,ends);
                  thread192511(tdone,ends);
                  int biggest192512 = 0;
                  if(ends[58]>=biggest192512){
                    biggest192512=ends[58];
                  }
                  if(ends[59]>=biggest192512){
                    biggest192512=ends[59];
                  }
                  if(biggest192512 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                  //FINXME code
                  if(biggest192512 == 0){
                    S43200=1;
                    thread192513(tdone,ends);
                    thread192514(tdone,ends);
                    int biggest192515 = 0;
                    if(ends[60]>=biggest192515){
                      biggest192515=ends[60];
                    }
                    if(ends[61]>=biggest192515){
                      biggest192515=ends[61];
                    }
                    if(biggest192515 == 1){
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 465, column: 30
                  System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 476, column: 24
                  current_thread_57 += (filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 477, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_57);//sysj\conveyor_controller.sysj line: 478, column: 24
                  current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 479, column: 24
                  currsigs.addElement(current_fill_56);
                  current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 479, column: 24
                  S43200=2;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  thread192516(tdone,ends);
                  thread192517(tdone,ends);
                  int biggest192518 = 0;
                  if(ends[60]>=biggest192518){
                    biggest192518=ends[60];
                  }
                  if(ends[61]>=biggest192518){
                    biggest192518=ends[61];
                  }
                  if(biggest192518 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                  //FINXME code
                  if(biggest192518 == 0){
                    System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 476, column: 24
                    current_thread_57 += (filler1_amount_56.getpreval() == null ? 0 : ((Integer)filler1_amount_56.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 477, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_57);//sysj\conveyor_controller.sysj line: 478, column: 24
                    current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 479, column: 24
                    currsigs.addElement(current_fill_56);
                    current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 479, column: 24
                    S43200=2;
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                break;
              
              case 2 : 
                S43200=2;
                S43043=4;
                if(((filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 483, column: 24
                  S43548=0;
                  thread192519(tdone,ends);
                  thread192520(tdone,ends);
                  int biggest192521 = 0;
                  if(ends[62]>=biggest192521){
                    biggest192521=ends[62];
                  }
                  if(ends[63]>=biggest192521){
                    biggest192521=ends[63];
                  }
                  if(biggest192521 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                else {
                  S43043=5;
                  if(((filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 515, column: 24
                    S43954=0;
                    thread192522(tdone,ends);
                    thread192523(tdone,ends);
                    int biggest192524 = 0;
                    if(ends[66]>=biggest192524){
                      biggest192524=ends[66];
                    }
                    if(ends[67]>=biggest192524){
                      biggest192524=ends[67];
                    }
                    if(biggest192524 == 1){
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                  else {
                    S43043=6;
                    if(((filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 545, column: 24
                      S44418=0;
                      thread192525(tdone,ends);
                      thread192526(tdone,ends);
                      int biggest192527 = 0;
                      if(ends[70]>=biggest192527){
                        biggest192527=ends[70];
                      }
                      if(ends[71]>=biggest192527){
                        biggest192527=ends[71];
                      }
                      if(biggest192527 == 1){
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                    }
                    else {
                      current_thread_57 = 0;//sysj\conveyor_controller.sysj line: 576, column: 20
                      current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 20
                      currsigs.addElement(current_fill_56);
                      current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 577, column: 20
                      S43043=7;
                      S44890=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 579, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                        S44890=1;
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      else {
                        S44885=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 579, column: 20
                          S44885=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                            ends[57]=2;
                            ;//sysj\conveyor_controller.sysj line: 579, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 580, column: 20
                            S43043=8;
                            S45117=0;
                            active[57]=1;
                            ends[57]=1;
                            tdone[57]=1;
                          }
                          else {
                            active[57]=1;
                            ends[57]=1;
                            tdone[57]=1;
                          }
                        }
                        else {
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            switch(S43548){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 485, column: 30
                  S43548=1;
                  thread192528(tdone,ends);
                  thread192529(tdone,ends);
                  int biggest192530 = 0;
                  if(ends[64]>=biggest192530){
                    biggest192530=ends[64];
                  }
                  if(ends[65]>=biggest192530){
                    biggest192530=ends[65];
                  }
                  if(biggest192530 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                else {
                  thread192531(tdone,ends);
                  thread192532(tdone,ends);
                  int biggest192533 = 0;
                  if(ends[62]>=biggest192533){
                    biggest192533=ends[62];
                  }
                  if(ends[63]>=biggest192533){
                    biggest192533=ends[63];
                  }
                  if(biggest192533 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                  //FINXME code
                  if(biggest192533 == 0){
                    S43548=1;
                    thread192534(tdone,ends);
                    thread192535(tdone,ends);
                    int biggest192536 = 0;
                    if(ends[64]>=biggest192536){
                      biggest192536=ends[64];
                    }
                    if(ends[65]>=biggest192536){
                      biggest192536=ends[65];
                    }
                    if(biggest192536 == 1){
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 497, column: 30
                  System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 508, column: 24
                  current_thread_57 += (filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 509, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_57);//sysj\conveyor_controller.sysj line: 510, column: 24
                  current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 24
                  currsigs.addElement(current_fill_56);
                  current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 511, column: 24
                  S43548=2;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  thread192537(tdone,ends);
                  thread192538(tdone,ends);
                  int biggest192539 = 0;
                  if(ends[64]>=biggest192539){
                    biggest192539=ends[64];
                  }
                  if(ends[65]>=biggest192539){
                    biggest192539=ends[65];
                  }
                  if(biggest192539 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                  //FINXME code
                  if(biggest192539 == 0){
                    System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 508, column: 24
                    current_thread_57 += (filler2_amount_56.getpreval() == null ? 0 : ((Integer)filler2_amount_56.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 509, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_57);//sysj\conveyor_controller.sysj line: 510, column: 24
                    current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 24
                    currsigs.addElement(current_fill_56);
                    current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 511, column: 24
                    S43548=2;
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                break;
              
              case 2 : 
                S43548=2;
                S43043=5;
                if(((filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 515, column: 24
                  S43954=0;
                  thread192540(tdone,ends);
                  thread192541(tdone,ends);
                  int biggest192542 = 0;
                  if(ends[66]>=biggest192542){
                    biggest192542=ends[66];
                  }
                  if(ends[67]>=biggest192542){
                    biggest192542=ends[67];
                  }
                  if(biggest192542 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                else {
                  S43043=6;
                  if(((filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 545, column: 24
                    S44418=0;
                    thread192543(tdone,ends);
                    thread192544(tdone,ends);
                    int biggest192545 = 0;
                    if(ends[70]>=biggest192545){
                      biggest192545=ends[70];
                    }
                    if(ends[71]>=biggest192545){
                      biggest192545=ends[71];
                    }
                    if(biggest192545 == 1){
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                  else {
                    current_thread_57 = 0;//sysj\conveyor_controller.sysj line: 576, column: 20
                    current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 20
                    currsigs.addElement(current_fill_56);
                    current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 577, column: 20
                    S43043=7;
                    S44890=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 579, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                      S44890=1;
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                    else {
                      S44885=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 579, column: 20
                        S44885=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                          ends[57]=2;
                          ;//sysj\conveyor_controller.sysj line: 579, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 580, column: 20
                          S43043=8;
                          S45117=0;
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                        else {
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                      }
                      else {
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            switch(S43954){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 517, column: 30
                  S43954=1;
                  thread192546(tdone,ends);
                  thread192547(tdone,ends);
                  int biggest192548 = 0;
                  if(ends[68]>=biggest192548){
                    biggest192548=ends[68];
                  }
                  if(ends[69]>=biggest192548){
                    biggest192548=ends[69];
                  }
                  if(biggest192548 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                else {
                  thread192549(tdone,ends);
                  thread192550(tdone,ends);
                  int biggest192551 = 0;
                  if(ends[66]>=biggest192551){
                    biggest192551=ends[66];
                  }
                  if(ends[67]>=biggest192551){
                    biggest192551=ends[67];
                  }
                  if(biggest192551 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                  //FINXME code
                  if(biggest192551 == 0){
                    S43954=1;
                    thread192552(tdone,ends);
                    thread192553(tdone,ends);
                    int biggest192554 = 0;
                    if(ends[68]>=biggest192554){
                      biggest192554=ends[68];
                    }
                    if(ends[69]>=biggest192554){
                      biggest192554=ends[69];
                    }
                    if(biggest192554 == 1){
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 527, column: 30
                  System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 538, column: 24
                  current_thread_57 += (filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 539, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_57);//sysj\conveyor_controller.sysj line: 540, column: 24
                  current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 541, column: 24
                  currsigs.addElement(current_fill_56);
                  current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 541, column: 24
                  S43954=2;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  thread192555(tdone,ends);
                  thread192556(tdone,ends);
                  int biggest192557 = 0;
                  if(ends[68]>=biggest192557){
                    biggest192557=ends[68];
                  }
                  if(ends[69]>=biggest192557){
                    biggest192557=ends[69];
                  }
                  if(biggest192557 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                  //FINXME code
                  if(biggest192557 == 0){
                    System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 538, column: 24
                    current_thread_57 += (filler3_amount_56.getpreval() == null ? 0 : ((Integer)filler3_amount_56.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 539, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_57);//sysj\conveyor_controller.sysj line: 540, column: 24
                    current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 541, column: 24
                    currsigs.addElement(current_fill_56);
                    current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 541, column: 24
                    S43954=2;
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                break;
              
              case 2 : 
                S43954=2;
                S43043=6;
                if(((filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) > 0) && (current_thread_57 + (filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()) <= total_thread_57)){//sysj\conveyor_controller.sysj line: 545, column: 24
                  S44418=0;
                  thread192558(tdone,ends);
                  thread192559(tdone,ends);
                  int biggest192560 = 0;
                  if(ends[70]>=biggest192560){
                    biggest192560=ends[70];
                  }
                  if(ends[71]>=biggest192560){
                    biggest192560=ends[71];
                  }
                  if(biggest192560 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                else {
                  current_thread_57 = 0;//sysj\conveyor_controller.sysj line: 576, column: 20
                  current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 20
                  currsigs.addElement(current_fill_56);
                  current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 577, column: 20
                  S43043=7;
                  S44890=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 579, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                    S44890=1;
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                  else {
                    S44885=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 579, column: 20
                      S44885=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                        ends[57]=2;
                        ;//sysj\conveyor_controller.sysj line: 579, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 580, column: 20
                        S43043=8;
                        S45117=0;
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      else {
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                    }
                    else {
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S44418){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 547, column: 30
                  S44418=1;
                  thread192561(tdone,ends);
                  thread192562(tdone,ends);
                  int biggest192563 = 0;
                  if(ends[72]>=biggest192563){
                    biggest192563=ends[72];
                  }
                  if(ends[73]>=biggest192563){
                    biggest192563=ends[73];
                  }
                  if(biggest192563 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                else {
                  thread192564(tdone,ends);
                  thread192565(tdone,ends);
                  int biggest192566 = 0;
                  if(ends[70]>=biggest192566){
                    biggest192566=ends[70];
                  }
                  if(ends[71]>=biggest192566){
                    biggest192566=ends[71];
                  }
                  if(biggest192566 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                  //FINXME code
                  if(biggest192566 == 0){
                    S44418=1;
                    thread192567(tdone,ends);
                    thread192568(tdone,ends);
                    int biggest192569 = 0;
                    if(ends[72]>=biggest192569){
                      biggest192569=ends[72];
                    }
                    if(ends[73]>=biggest192569){
                      biggest192569=ends[73];
                    }
                    if(biggest192569 == 1){
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 557, column: 30
                  System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 568, column: 24
                  current_thread_57 += (filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 569, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_57);//sysj\conveyor_controller.sysj line: 570, column: 24
                  S44418=2;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  thread192570(tdone,ends);
                  thread192571(tdone,ends);
                  int biggest192572 = 0;
                  if(ends[72]>=biggest192572){
                    biggest192572=ends[72];
                  }
                  if(ends[73]>=biggest192572){
                    biggest192572=ends[73];
                  }
                  if(biggest192572 == 1){
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                  //FINXME code
                  if(biggest192572 == 0){
                    System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 568, column: 24
                    current_thread_57 += (filler4_amount_56.getpreval() == null ? 0 : ((Integer)filler4_amount_56.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 569, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_57);//sysj\conveyor_controller.sysj line: 570, column: 24
                    S44418=2;
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                break;
              
              case 2 : 
                S44418=2;
                current_thread_57 = 0;//sysj\conveyor_controller.sysj line: 576, column: 20
                current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 577, column: 20
                currsigs.addElement(current_fill_56);
                current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 577, column: 20
                S43043=7;
                S44890=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 579, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                  S44890=1;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  S44885=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 579, column: 20
                    S44885=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                      ends[57]=2;
                      ;//sysj\conveyor_controller.sysj line: 579, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 580, column: 20
                      S43043=8;
                      S45117=0;
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                    else {
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                  else {
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 7 : 
            switch(S44890){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 579, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                  S44890=1;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  switch(S44885){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 579, column: 20
                        S44885=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                          ends[57]=2;
                          ;//sysj\conveyor_controller.sysj line: 579, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 580, column: 20
                          S43043=8;
                          S45117=0;
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                        else {
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                      }
                      else {
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                        ends[57]=2;
                        ;//sysj\conveyor_controller.sysj line: 579, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 580, column: 20
                        S43043=8;
                        S45117=0;
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      else {
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S44890=1;
                S44890=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 579, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                  S44890=1;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  S44885=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 579, column: 20
                    S44885=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 579, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 579, column: 20
                      ends[57]=2;
                      ;//sysj\conveyor_controller.sysj line: 579, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 580, column: 20
                      S43043=8;
                      S45117=0;
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                    else {
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                  else {
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S45117){
              case 0 : 
                if(!bottleAtPos2_56.getprestatus()){//sysj\conveyor_controller.sysj line: 583, column: 30
                  S45117=1;
                  if(bottleAtPos2_56.getprestatus()){//sysj\conveyor_controller.sysj line: 585, column: 36
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                  else {
                    ends[57]=2;
                    ;//sysj\conveyor_controller.sysj line: 582, column: 20
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 445, column: 20
                    S43043=0;
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                else {
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_56.getprestatus()){//sysj\conveyor_controller.sysj line: 585, column: 36
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  ends[57]=2;
                  ;//sysj\conveyor_controller.sysj line: 582, column: 20
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 445, column: 20
                  S43043=0;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192443(int [] tdone, int [] ends){
        S65567=1;
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread192442(int [] tdone, int [] ends){
        S65564=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 628, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192441(int [] tdone, int [] ends){
        S65594=1;
    S65570=0;
    if(bottleAtPos2_56.getprestatus()){//sysj\conveyor_controller.sysj line: 625, column: 26
      thread192442(tdone,ends);
      thread192443(tdone,ends);
      int biggest192444 = 0;
      if(ends[77]>=biggest192444){
        biggest192444=ends[77];
      }
      if(ends[78]>=biggest192444){
        biggest192444=ends[78];
      }
      if(biggest192444 == 1){
        active[76]=1;
        ends[76]=1;
        tdone[76]=1;
      }
    }
    else {
      S65570=1;
      active[76]=1;
      ends[76]=1;
      tdone[76]=1;
    }
  }

  public void thread192440(int [] tdone, int [] ends){
        S65559=1;
    S65503=0;
    S65483=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 610, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
      S65483=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
    else {
      S65478=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 610, column: 12
        S65478=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
          ends[75]=2;
          ;//sysj\conveyor_controller.sysj line: 610, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 611, column: 15
            bottleAtPos2_56.setPresent();//sysj\conveyor_controller.sysj line: 612, column: 13
            currsigs.addElement(bottleAtPos2_56);
            S65503=1;
            active[75]=1;
            ends[75]=1;
            tdone[75]=1;
          }
          else {
            done_56.setPresent();//sysj\conveyor_controller.sysj line: 615, column: 13
            currsigs.addElement(done_56);
            S65503=1;
            active[75]=1;
            ends[75]=1;
            tdone[75]=1;
          }
        }
        else {
          active[75]=1;
          ends[75]=1;
          tdone[75]=1;
        }
      }
      else {
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
  }

  public void thread192439(int [] tdone, int [] ends){
        S65476=1;
    filler1_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 597, column: 11
    currsigs.addElement(filler1_amount_56);
    filler1_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 597, column: 11
    filler2_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 598, column: 8
    currsigs.addElement(filler2_amount_56);
    filler2_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 598, column: 8
    filler3_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 599, column: 8
    currsigs.addElement(filler3_amount_56);
    filler3_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 599, column: 8
    filler4_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 600, column: 8
    currsigs.addElement(filler4_amount_56);
    filler4_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 600, column: 8
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread192438(int [] tdone, int [] ends){
        S65471=1;
    current_thread_57 = 0;//sysj\conveyor_controller.sysj line: 434, column: 16
    total_thread_57 = 100;//sysj\conveyor_controller.sysj line: 435, column: 16
    total_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 16
    currsigs.addElement(total_fill_56);
    total_fill_56.setValue(total_thread_57);//sysj\conveyor_controller.sysj line: 436, column: 16
    current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 437, column: 16
    currsigs.addElement(current_fill_56);
    current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 437, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 445, column: 20
    S43043=0;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192435(int [] tdone, int [] ends){
        S65567=1;
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread192434(int [] tdone, int [] ends){
        S65564=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 628, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192433(int [] tdone, int [] ends){
        S65594=1;
    S65570=0;
    if(bottleAtPos2_56.getprestatus()){//sysj\conveyor_controller.sysj line: 625, column: 26
      thread192434(tdone,ends);
      thread192435(tdone,ends);
      int biggest192436 = 0;
      if(ends[77]>=biggest192436){
        biggest192436=ends[77];
      }
      if(ends[78]>=biggest192436){
        biggest192436=ends[78];
      }
      if(biggest192436 == 1){
        active[76]=1;
        ends[76]=1;
        tdone[76]=1;
      }
    }
    else {
      S65570=1;
      active[76]=1;
      ends[76]=1;
      tdone[76]=1;
    }
  }

  public void thread192432(int [] tdone, int [] ends){
        S65559=1;
    S65503=0;
    S65483=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 610, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
      S65483=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
    else {
      S65478=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 610, column: 12
        S65478=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
          ends[75]=2;
          ;//sysj\conveyor_controller.sysj line: 610, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 611, column: 15
            bottleAtPos2_56.setPresent();//sysj\conveyor_controller.sysj line: 612, column: 13
            currsigs.addElement(bottleAtPos2_56);
            S65503=1;
            active[75]=1;
            ends[75]=1;
            tdone[75]=1;
          }
          else {
            done_56.setPresent();//sysj\conveyor_controller.sysj line: 615, column: 13
            currsigs.addElement(done_56);
            S65503=1;
            active[75]=1;
            ends[75]=1;
            tdone[75]=1;
          }
        }
        else {
          active[75]=1;
          ends[75]=1;
          tdone[75]=1;
        }
      }
      else {
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
  }

  public void thread192431(int [] tdone, int [] ends){
        S65476=1;
    filler1_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 597, column: 11
    currsigs.addElement(filler1_amount_56);
    filler1_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 597, column: 11
    filler2_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 598, column: 8
    currsigs.addElement(filler2_amount_56);
    filler2_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 598, column: 8
    filler3_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 599, column: 8
    currsigs.addElement(filler3_amount_56);
    filler3_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 599, column: 8
    filler4_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 600, column: 8
    currsigs.addElement(filler4_amount_56);
    filler4_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 600, column: 8
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread192430(int [] tdone, int [] ends){
        S65471=1;
    current_thread_57 = 0;//sysj\conveyor_controller.sysj line: 434, column: 16
    total_thread_57 = 100;//sysj\conveyor_controller.sysj line: 435, column: 16
    total_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 16
    currsigs.addElement(total_fill_56);
    total_fill_56.setValue(total_thread_57);//sysj\conveyor_controller.sysj line: 436, column: 16
    current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 437, column: 16
    currsigs.addElement(current_fill_56);
    current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 437, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 445, column: 20
    S43043=0;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192427(int [] tdone, int [] ends){
        S65567=1;
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread192426(int [] tdone, int [] ends){
        S65564=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 628, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192425(int [] tdone, int [] ends){
        S65594=1;
    S65570=0;
    if(bottleAtPos2_56.getprestatus()){//sysj\conveyor_controller.sysj line: 625, column: 26
      thread192426(tdone,ends);
      thread192427(tdone,ends);
      int biggest192428 = 0;
      if(ends[77]>=biggest192428){
        biggest192428=ends[77];
      }
      if(ends[78]>=biggest192428){
        biggest192428=ends[78];
      }
      if(biggest192428 == 1){
        active[76]=1;
        ends[76]=1;
        tdone[76]=1;
      }
    }
    else {
      S65570=1;
      active[76]=1;
      ends[76]=1;
      tdone[76]=1;
    }
  }

  public void thread192424(int [] tdone, int [] ends){
        S65559=1;
    S65503=0;
    S65483=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 610, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
      S65483=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
    else {
      S65478=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 610, column: 12
        S65478=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
          ends[75]=2;
          ;//sysj\conveyor_controller.sysj line: 610, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 611, column: 15
            bottleAtPos2_56.setPresent();//sysj\conveyor_controller.sysj line: 612, column: 13
            currsigs.addElement(bottleAtPos2_56);
            S65503=1;
            active[75]=1;
            ends[75]=1;
            tdone[75]=1;
          }
          else {
            done_56.setPresent();//sysj\conveyor_controller.sysj line: 615, column: 13
            currsigs.addElement(done_56);
            S65503=1;
            active[75]=1;
            ends[75]=1;
            tdone[75]=1;
          }
        }
        else {
          active[75]=1;
          ends[75]=1;
          tdone[75]=1;
        }
      }
      else {
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
  }

  public void thread192423(int [] tdone, int [] ends){
        S65476=1;
    filler1_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 597, column: 11
    currsigs.addElement(filler1_amount_56);
    filler1_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 597, column: 11
    filler2_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 598, column: 8
    currsigs.addElement(filler2_amount_56);
    filler2_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 598, column: 8
    filler3_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 599, column: 8
    currsigs.addElement(filler3_amount_56);
    filler3_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 599, column: 8
    filler4_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 600, column: 8
    currsigs.addElement(filler4_amount_56);
    filler4_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 600, column: 8
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread192422(int [] tdone, int [] ends){
        S65471=1;
    current_thread_57 = 0;//sysj\conveyor_controller.sysj line: 434, column: 16
    total_thread_57 = 100;//sysj\conveyor_controller.sysj line: 435, column: 16
    total_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 16
    currsigs.addElement(total_fill_56);
    total_fill_56.setValue(total_thread_57);//sysj\conveyor_controller.sysj line: 436, column: 16
    current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 437, column: 16
    currsigs.addElement(current_fill_56);
    current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 437, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 445, column: 20
    S43043=0;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192419(int [] tdone, int [] ends){
        S65567=1;
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread192418(int [] tdone, int [] ends){
        S65564=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 628, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192417(int [] tdone, int [] ends){
        S65594=1;
    S65570=0;
    if(bottleAtPos2_56.getprestatus()){//sysj\conveyor_controller.sysj line: 625, column: 26
      thread192418(tdone,ends);
      thread192419(tdone,ends);
      int biggest192420 = 0;
      if(ends[77]>=biggest192420){
        biggest192420=ends[77];
      }
      if(ends[78]>=biggest192420){
        biggest192420=ends[78];
      }
      if(biggest192420 == 1){
        active[76]=1;
        ends[76]=1;
        tdone[76]=1;
      }
    }
    else {
      S65570=1;
      active[76]=1;
      ends[76]=1;
      tdone[76]=1;
    }
  }

  public void thread192416(int [] tdone, int [] ends){
        S65559=1;
    S65503=0;
    S65483=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 610, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
      S65483=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
    else {
      S65478=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 610, column: 12
        S65478=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 610, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 610, column: 12
          ends[75]=2;
          ;//sysj\conveyor_controller.sysj line: 610, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 611, column: 15
            bottleAtPos2_56.setPresent();//sysj\conveyor_controller.sysj line: 612, column: 13
            currsigs.addElement(bottleAtPos2_56);
            S65503=1;
            active[75]=1;
            ends[75]=1;
            tdone[75]=1;
          }
          else {
            done_56.setPresent();//sysj\conveyor_controller.sysj line: 615, column: 13
            currsigs.addElement(done_56);
            S65503=1;
            active[75]=1;
            ends[75]=1;
            tdone[75]=1;
          }
        }
        else {
          active[75]=1;
          ends[75]=1;
          tdone[75]=1;
        }
      }
      else {
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
  }

  public void thread192415(int [] tdone, int [] ends){
        S65476=1;
    filler1_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 597, column: 11
    currsigs.addElement(filler1_amount_56);
    filler1_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 597, column: 11
    filler2_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 598, column: 8
    currsigs.addElement(filler2_amount_56);
    filler2_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 598, column: 8
    filler3_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 599, column: 8
    currsigs.addElement(filler3_amount_56);
    filler3_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 599, column: 8
    filler4_amount_56.setPresent();//sysj\conveyor_controller.sysj line: 600, column: 8
    currsigs.addElement(filler4_amount_56);
    filler4_amount_56.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 600, column: 8
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread192414(int [] tdone, int [] ends){
        S65471=1;
    current_thread_57 = 0;//sysj\conveyor_controller.sysj line: 434, column: 16
    total_thread_57 = 100;//sysj\conveyor_controller.sysj line: 435, column: 16
    total_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 16
    currsigs.addElement(total_fill_56);
    total_fill_56.setValue(total_thread_57);//sysj\conveyor_controller.sysj line: 436, column: 16
    current_fill_56.setPresent();//sysj\conveyor_controller.sysj line: 437, column: 16
    currsigs.addElement(current_fill_56);
    current_fill_56.setValue(current_thread_57);//sysj\conveyor_controller.sysj line: 437, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 445, column: 20
    S43043=0;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S133261){
        case 0 : 
          S133261=0;
          break RUN;
        
        case 1 : 
          S133261=2;
          S133261=2;
          filler1_56.setClear();//sysj\conveyor_controller.sysj line: 424, column: 9
          filler2_56.setClear();//sysj\conveyor_controller.sysj line: 424, column: 9
          filler3_56.setClear();//sysj\conveyor_controller.sysj line: 424, column: 9
          filler4_56.setClear();//sysj\conveyor_controller.sysj line: 424, column: 9
          done_56.setClear();//sysj\conveyor_controller.sysj line: 424, column: 9
          filler1_amount_56.setClear();//sysj\conveyor_controller.sysj line: 426, column: 9
          filler2_amount_56.setClear();//sysj\conveyor_controller.sysj line: 426, column: 9
          filler3_amount_56.setClear();//sysj\conveyor_controller.sysj line: 426, column: 9
          filler4_amount_56.setClear();//sysj\conveyor_controller.sysj line: 426, column: 9
          current_fill_56.setClear();//sysj\conveyor_controller.sysj line: 427, column: 9
          total_fill_56.setClear();//sysj\conveyor_controller.sysj line: 427, column: 9
          bottleAtPos2_56.setClear();//sysj\conveyor_controller.sysj line: 429, column: 9
          S133260=0;
          S43024=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 431, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 431, column: 9
            S43024=1;
            active[56]=1;
            ends[56]=1;
            break RUN;
          }
          else {
            S43019=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 431, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 431, column: 9
              S43019=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 431, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 431, column: 9
                ends[56]=2;
                ;//sysj\conveyor_controller.sysj line: 431, column: 9
                S133260=1;
                thread192414(tdone,ends);
                thread192415(tdone,ends);
                thread192416(tdone,ends);
                thread192417(tdone,ends);
                int biggest192421 = 0;
                if(ends[57]>=biggest192421){
                  biggest192421=ends[57];
                }
                if(ends[74]>=biggest192421){
                  biggest192421=ends[74];
                }
                if(ends[75]>=biggest192421){
                  biggest192421=ends[75];
                }
                if(ends[76]>=biggest192421){
                  biggest192421=ends[76];
                }
                if(biggest192421 == 1){
                  active[56]=1;
                  ends[56]=1;
                  break RUN;
                }
              }
              else {
                active[56]=1;
                ends[56]=1;
                break RUN;
              }
            }
            else {
              active[56]=1;
              ends[56]=1;
              break RUN;
            }
          }
        
        case 2 : 
          filler1_56.setClear();//sysj\conveyor_controller.sysj line: 424, column: 9
          filler2_56.setClear();//sysj\conveyor_controller.sysj line: 424, column: 9
          filler3_56.setClear();//sysj\conveyor_controller.sysj line: 424, column: 9
          filler4_56.setClear();//sysj\conveyor_controller.sysj line: 424, column: 9
          done_56.setClear();//sysj\conveyor_controller.sysj line: 424, column: 9
          filler1_amount_56.setClear();//sysj\conveyor_controller.sysj line: 426, column: 9
          filler2_amount_56.setClear();//sysj\conveyor_controller.sysj line: 426, column: 9
          filler3_amount_56.setClear();//sysj\conveyor_controller.sysj line: 426, column: 9
          filler4_amount_56.setClear();//sysj\conveyor_controller.sysj line: 426, column: 9
          current_fill_56.setClear();//sysj\conveyor_controller.sysj line: 427, column: 9
          total_fill_56.setClear();//sysj\conveyor_controller.sysj line: 427, column: 9
          bottleAtPos2_56.setClear();//sysj\conveyor_controller.sysj line: 429, column: 9
          switch(S133260){
            case 0 : 
              switch(S43024){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 431, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 431, column: 9
                    S43024=1;
                    active[56]=1;
                    ends[56]=1;
                    break RUN;
                  }
                  else {
                    switch(S43019){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 431, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 431, column: 9
                          S43019=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 431, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 431, column: 9
                            ends[56]=2;
                            ;//sysj\conveyor_controller.sysj line: 431, column: 9
                            S133260=1;
                            thread192422(tdone,ends);
                            thread192423(tdone,ends);
                            thread192424(tdone,ends);
                            thread192425(tdone,ends);
                            int biggest192429 = 0;
                            if(ends[57]>=biggest192429){
                              biggest192429=ends[57];
                            }
                            if(ends[74]>=biggest192429){
                              biggest192429=ends[74];
                            }
                            if(ends[75]>=biggest192429){
                              biggest192429=ends[75];
                            }
                            if(ends[76]>=biggest192429){
                              biggest192429=ends[76];
                            }
                            if(biggest192429 == 1){
                              active[56]=1;
                              ends[56]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[56]=1;
                            ends[56]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 431, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 431, column: 9
                          ends[56]=2;
                          ;//sysj\conveyor_controller.sysj line: 431, column: 9
                          S133260=1;
                          thread192430(tdone,ends);
                          thread192431(tdone,ends);
                          thread192432(tdone,ends);
                          thread192433(tdone,ends);
                          int biggest192437 = 0;
                          if(ends[57]>=biggest192437){
                            biggest192437=ends[57];
                          }
                          if(ends[74]>=biggest192437){
                            biggest192437=ends[74];
                          }
                          if(ends[75]>=biggest192437){
                            biggest192437=ends[75];
                          }
                          if(ends[76]>=biggest192437){
                            biggest192437=ends[76];
                          }
                          if(biggest192437 == 1){
                            active[56]=1;
                            ends[56]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S43024=1;
                  S43024=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 431, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 431, column: 9
                    S43024=1;
                    active[56]=1;
                    ends[56]=1;
                    break RUN;
                  }
                  else {
                    S43019=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 431, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 431, column: 9
                      S43019=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 431, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 431, column: 9
                        ends[56]=2;
                        ;//sysj\conveyor_controller.sysj line: 431, column: 9
                        S133260=1;
                        thread192438(tdone,ends);
                        thread192439(tdone,ends);
                        thread192440(tdone,ends);
                        thread192441(tdone,ends);
                        int biggest192445 = 0;
                        if(ends[57]>=biggest192445){
                          biggest192445=ends[57];
                        }
                        if(ends[74]>=biggest192445){
                          biggest192445=ends[74];
                        }
                        if(ends[75]>=biggest192445){
                          biggest192445=ends[75];
                        }
                        if(ends[76]>=biggest192445){
                          biggest192445=ends[76];
                        }
                        if(biggest192445 == 1){
                          active[56]=1;
                          ends[56]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[56]=1;
                      ends[56]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread192446(tdone,ends);
              thread192573(tdone,ends);
              thread192574(tdone,ends);
              thread192575(tdone,ends);
              int biggest192582 = 0;
              if(ends[57]>=biggest192582){
                biggest192582=ends[57];
              }
              if(ends[74]>=biggest192582){
                biggest192582=ends[74];
              }
              if(ends[75]>=biggest192582){
                biggest192582=ends[75];
              }
              if(ends[76]>=biggest192582){
                biggest192582=ends[76];
              }
              if(biggest192582 == 1){
                active[56]=1;
                ends[56]=1;
                break RUN;
              }
              //FINXME code
              if(biggest192582 == 0){
                S133261=0;
                active[56]=0;
                ends[56]=0;
                S133261=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    filler1_56 = new Signal();
    filler2_56 = new Signal();
    filler3_56 = new Signal();
    filler4_56 = new Signal();
    done_56 = new Signal();
    filler1_amount_56 = new Signal();
    filler2_amount_56 = new Signal();
    filler3_amount_56 = new Signal();
    filler4_amount_56 = new Signal();
    current_fill_56 = new Signal();
    total_fill_56 = new Signal();
    bottleAtPos2_56 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[56] != 0){
      int index = 56;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[56]!=0 || suspended[56]!=0 || active[56]!=1);
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
      filler1_56.setpreclear();
      filler2_56.setpreclear();
      filler3_56.setpreclear();
      filler4_56.setpreclear();
      done_56.setpreclear();
      filler1_amount_56.setpreclear();
      filler2_amount_56.setpreclear();
      filler3_amount_56.setpreclear();
      filler4_amount_56.setpreclear();
      current_fill_56.setpreclear();
      total_fill_56.setpreclear();
      bottleAtPos2_56.setpreclear();
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
      filler1_56.setClear();
      filler2_56.setClear();
      filler3_56.setClear();
      filler4_56.setClear();
      done_56.setClear();
      filler1_amount_56.setClear();
      filler2_amount_56.setClear();
      filler3_amount_56.setClear();
      filler4_amount_56.setClear();
      current_fill_56.setClear();
      total_fill_56.setClear();
      bottleAtPos2_56.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[56]!=0 || suspended[56]!=0 || active[56]!=1);
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
      if(active[56] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
