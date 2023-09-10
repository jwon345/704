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
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public input_Channel simFiller_in = new input_Channel();
  public output_Channel fillerReady_o = new output_Channel();
  private Signal bottleAtPos2_53;
  private long __start_thread_54;//sysj\conveyor_controller.sysj line: 394, column: 9
  private int S29509 = 1;
  private int S29508 = 1;
  private int S21612 = 1;
  private int S21607 = 1;
  private int S23479 = 1;
  private int S21630 = 1;
  private int S21637 = 1;
  private int S21632 = 1;
  private int S21738 = 1;
  private int S21743 = 1;
  private int S21822 = 1;
  private int S21827 = 1;
  private int S21863 = 1;
  private int S21858 = 1;
  private int S21936 = 1;
  private int S23562 = 1;
  private int S23506 = 1;
  private int S23486 = 1;
  private int S23481 = 1;
  private int S23597 = 1;
  private int S23573 = 1;
  private int S23567 = 1;
  private int S23570 = 1;
  
  private int[] ends = new int[77];
  private int[] tdone = new int[77];
  
  public void thread35826(int [] tdone, int [] ends){
        S23570=1;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread35825(int [] tdone, int [] ends){
        S23567=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread35823(int [] tdone, int [] ends){
        switch(S23570){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 464, column: 35
          ends[62]=2;
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

  public void thread35822(int [] tdone, int [] ends){
        switch(S23567){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[61]=1;
        ends[61]=1;
        tdone[61]=1;
        break;
      
    }
  }

  public void thread35821(int [] tdone, int [] ends){
        switch(S23597){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        switch(S23573){
          case 0 : 
            thread35822(tdone,ends);
            thread35823(tdone,ends);
            int biggest35824 = 0;
            if(ends[61]>=biggest35824){
              biggest35824=ends[61];
            }
            if(ends[62]>=biggest35824){
              biggest35824=ends[62];
            }
            if(biggest35824 == 1){
              active[60]=1;
              ends[60]=1;
              tdone[60]=1;
            }
            if(biggest35824 == 2){
              ends[60]=2;
              ;//sysj\conveyor_controller.sysj line: 458, column: 18
              S23573=1;
              active[60]=1;
              ends[60]=1;
              tdone[60]=1;
            }
            //FINXME code
            if(biggest35824 == 0){
              S23573=1;
              active[60]=1;
              ends[60]=1;
              tdone[60]=1;
            }
            break;
          
          case 1 : 
            S23573=1;
            S23573=0;
            if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 457, column: 26
              thread35825(tdone,ends);
              thread35826(tdone,ends);
              int biggest35827 = 0;
              if(ends[61]>=biggest35827){
                biggest35827=ends[61];
              }
              if(ends[62]>=biggest35827){
                biggest35827=ends[62];
              }
              if(biggest35827 == 1){
                active[60]=1;
                ends[60]=1;
                tdone[60]=1;
              }
            }
            else {
              S23573=1;
              active[60]=1;
              ends[60]=1;
              tdone[60]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35820(int [] tdone, int [] ends){
        switch(S23562){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        switch(S23506){
          case 0 : 
            switch(S23486){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
                  S23486=1;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  switch(S23481){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
                        S23481=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
                          ends[59]=2;
                          ;//sysj\conveyor_controller.sysj line: 446, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
                            bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
                            currsigs.addElement(bottleAtPos2_53);
                            S23506=1;
                            active[59]=1;
                            ends[59]=1;
                            tdone[59]=1;
                          }
                          else {
                            S23506=1;
                            active[59]=1;
                            ends[59]=1;
                            tdone[59]=1;
                          }
                        }
                        else {
                          active[59]=1;
                          ends[59]=1;
                          tdone[59]=1;
                        }
                      }
                      else {
                        active[59]=1;
                        ends[59]=1;
                        tdone[59]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
                        ends[59]=2;
                        ;//sysj\conveyor_controller.sysj line: 446, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
                          bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
                          currsigs.addElement(bottleAtPos2_53);
                          S23506=1;
                          active[59]=1;
                          ends[59]=1;
                          tdone[59]=1;
                        }
                        else {
                          S23506=1;
                          active[59]=1;
                          ends[59]=1;
                          tdone[59]=1;
                        }
                      }
                      else {
                        active[59]=1;
                        ends[59]=1;
                        tdone[59]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S23486=1;
                S23486=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
                  S23486=1;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  S23481=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
                    S23481=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
                      ends[59]=2;
                      ;//sysj\conveyor_controller.sysj line: 446, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
                        bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
                        currsigs.addElement(bottleAtPos2_53);
                        S23506=1;
                        active[59]=1;
                        ends[59]=1;
                        tdone[59]=1;
                      }
                      else {
                        S23506=1;
                        active[59]=1;
                        ends[59]=1;
                        tdone[59]=1;
                      }
                    }
                    else {
                      active[59]=1;
                      ends[59]=1;
                      tdone[59]=1;
                    }
                  }
                  else {
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S23506=1;
            S23506=0;
            S23486=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
              S23486=1;
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            else {
              S23481=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
                S23481=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
                  ends[59]=2;
                  ;//sysj\conveyor_controller.sysj line: 446, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
                    bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
                    currsigs.addElement(bottleAtPos2_53);
                    S23506=1;
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                  else {
                    S23506=1;
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                }
                else {
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
              }
              else {
                active[59]=1;
                ends[59]=1;
                tdone[59]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35818(int [] tdone, int [] ends){
        switch(S21827){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 424, column: 13
        currsigs.addElement(dosUnitValveExtend);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread35817(int [] tdone, int [] ends){
        switch(S21822){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 420, column: 13
        currsigs.addElement(valveInletOnOff);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread35815(int [] tdone, int [] ends){
        S21827=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 424, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread35814(int [] tdone, int [] ends){
        S21822=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 419, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 420, column: 13
    currsigs.addElement(valveInletOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread35812(int [] tdone, int [] ends){
        switch(S21743){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread35811(int [] tdone, int [] ends){
        switch(S21738){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 408, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread35809(int [] tdone, int [] ends){
        S21827=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 424, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread35808(int [] tdone, int [] ends){
        S21822=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 419, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 420, column: 13
    currsigs.addElement(valveInletOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread35806(int [] tdone, int [] ends){
        S21743=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread35805(int [] tdone, int [] ends){
        S21738=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 407, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 408, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread35803(int [] tdone, int [] ends){
        S21743=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread35802(int [] tdone, int [] ends){
        S21738=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 407, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 408, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread35800(int [] tdone, int [] ends){
        S21743=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread35799(int [] tdone, int [] ends){
        S21738=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 407, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 408, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread35797(int [] tdone, int [] ends){
        S21743=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread35796(int [] tdone, int [] ends){
        S21738=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 407, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 408, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread35794(int [] tdone, int [] ends){
        S21743=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread35793(int [] tdone, int [] ends){
        S21738=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 407, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 408, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread35792(int [] tdone, int [] ends){
        switch(S23479){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S21630){
          case 0 : 
            if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 397, column: 17
              S21630=1;
              S21637=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 398, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 11
                S21637=1;
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
              else {
                S21632=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 11
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 398, column: 11
                  S21632=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 11
                    ends[54]=2;
                    ;//sysj\conveyor_controller.sysj line: 398, column: 11
                    S21630=2;
                    __start_thread_54 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 394, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_54 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 394, column: 9
                      ends[54]=2;
                      ;//sysj\conveyor_controller.sysj line: 394, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 401, column: 11
                      S21630=3;
                      thread35793(tdone,ends);
                      thread35794(tdone,ends);
                      int biggest35795 = 0;
                      if(ends[55]>=biggest35795){
                        biggest35795=ends[55];
                      }
                      if(ends[56]>=biggest35795){
                        biggest35795=ends[56];
                      }
                      if(biggest35795 == 1){
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                    }
                    else {
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                  }
                  else {
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                }
                else {
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
              }
            }
            else {
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 1 : 
            switch(S21637){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 398, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 11
                  S21637=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  switch(S21632){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 398, column: 11
                        S21632=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 11
                          ends[54]=2;
                          ;//sysj\conveyor_controller.sysj line: 398, column: 11
                          S21630=2;
                          __start_thread_54 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 394, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_54 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 394, column: 9
                            ends[54]=2;
                            ;//sysj\conveyor_controller.sysj line: 394, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 401, column: 11
                            S21630=3;
                            thread35796(tdone,ends);
                            thread35797(tdone,ends);
                            int biggest35798 = 0;
                            if(ends[55]>=biggest35798){
                              biggest35798=ends[55];
                            }
                            if(ends[56]>=biggest35798){
                              biggest35798=ends[56];
                            }
                            if(biggest35798 == 1){
                              active[54]=1;
                              ends[54]=1;
                              tdone[54]=1;
                            }
                          }
                          else {
                            active[54]=1;
                            ends[54]=1;
                            tdone[54]=1;
                          }
                        }
                        else {
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                      }
                      else {
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 11
                        ends[54]=2;
                        ;//sysj\conveyor_controller.sysj line: 398, column: 11
                        S21630=2;
                        __start_thread_54 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 394, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_54 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 394, column: 9
                          ends[54]=2;
                          ;//sysj\conveyor_controller.sysj line: 394, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 401, column: 11
                          S21630=3;
                          thread35799(tdone,ends);
                          thread35800(tdone,ends);
                          int biggest35801 = 0;
                          if(ends[55]>=biggest35801){
                            biggest35801=ends[55];
                          }
                          if(ends[56]>=biggest35801){
                            biggest35801=ends[56];
                          }
                          if(biggest35801 == 1){
                            active[54]=1;
                            ends[54]=1;
                            tdone[54]=1;
                          }
                        }
                        else {
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                      }
                      else {
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S21637=1;
                S21637=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 398, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 11
                  S21637=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  S21632=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 398, column: 11
                    S21632=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 398, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 398, column: 11
                      ends[54]=2;
                      ;//sysj\conveyor_controller.sysj line: 398, column: 11
                      S21630=2;
                      __start_thread_54 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 394, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_54 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 394, column: 9
                        ends[54]=2;
                        ;//sysj\conveyor_controller.sysj line: 394, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 401, column: 11
                        S21630=3;
                        thread35802(tdone,ends);
                        thread35803(tdone,ends);
                        int biggest35804 = 0;
                        if(ends[55]>=biggest35804){
                          biggest35804=ends[55];
                        }
                        if(ends[56]>=biggest35804){
                          biggest35804=ends[56];
                        }
                        if(biggest35804 == 1){
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                      }
                      else {
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                    }
                    else {
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                  }
                  else {
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_54 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 394, column: 9
              ends[54]=2;
              ;//sysj\conveyor_controller.sysj line: 394, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 401, column: 11
              S21630=3;
              thread35805(tdone,ends);
              thread35806(tdone,ends);
              int biggest35807 = 0;
              if(ends[55]>=biggest35807){
                biggest35807=ends[55];
              }
              if(ends[56]>=biggest35807){
                biggest35807=ends[56];
              }
              if(biggest35807 == 1){
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
            }
            else {
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 3 : 
            if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 405, column: 17
              S21630=4;
              thread35808(tdone,ends);
              thread35809(tdone,ends);
              int biggest35810 = 0;
              if(ends[57]>=biggest35810){
                biggest35810=ends[57];
              }
              if(ends[58]>=biggest35810){
                biggest35810=ends[58];
              }
              if(biggest35810 == 1){
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
            }
            else {
              thread35811(tdone,ends);
              thread35812(tdone,ends);
              int biggest35813 = 0;
              if(ends[55]>=biggest35813){
                biggest35813=ends[55];
              }
              if(ends[56]>=biggest35813){
                biggest35813=ends[56];
              }
              if(biggest35813 == 1){
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
              //FINXME code
              if(biggest35813 == 0){
                S21630=4;
                thread35814(tdone,ends);
                thread35815(tdone,ends);
                int biggest35816 = 0;
                if(ends[57]>=biggest35816){
                  biggest35816=ends[57];
                }
                if(ends[58]>=biggest35816){
                  biggest35816=ends[58];
                }
                if(biggest35816 == 1){
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 417, column: 17
              S21630=5;
              S21863=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 429, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                S21863=1;
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
              else {
                S21858=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 429, column: 11
                  S21858=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                    ends[54]=2;
                    ;//sysj\conveyor_controller.sysj line: 429, column: 11
                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 430, column: 11
                    S21630=6;
                    S21936=0;
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                  else {
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                }
                else {
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
              }
            }
            else {
              thread35817(tdone,ends);
              thread35818(tdone,ends);
              int biggest35819 = 0;
              if(ends[57]>=biggest35819){
                biggest35819=ends[57];
              }
              if(ends[58]>=biggest35819){
                biggest35819=ends[58];
              }
              if(biggest35819 == 1){
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
              //FINXME code
              if(biggest35819 == 0){
                S21630=5;
                S21863=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 429, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                  S21863=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  S21858=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 429, column: 11
                    S21858=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                      ends[54]=2;
                      ;//sysj\conveyor_controller.sysj line: 429, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 430, column: 11
                      S21630=6;
                      S21936=0;
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                    else {
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                  }
                  else {
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                }
              }
            }
            break;
          
          case 5 : 
            switch(S21863){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 429, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                  S21863=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  switch(S21858){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 429, column: 11
                        S21858=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                          ends[54]=2;
                          ;//sysj\conveyor_controller.sysj line: 429, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 430, column: 11
                          S21630=6;
                          S21936=0;
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                        else {
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                      }
                      else {
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                        ends[54]=2;
                        ;//sysj\conveyor_controller.sysj line: 429, column: 11
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 430, column: 11
                        S21630=6;
                        S21936=0;
                        active[54]=1;
                        ends[54]=1;
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
                break;
              
              case 1 : 
                S21863=1;
                S21863=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 429, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                  S21863=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  S21858=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 429, column: 11
                    S21858=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                      ends[54]=2;
                      ;//sysj\conveyor_controller.sysj line: 429, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 430, column: 11
                      S21630=6;
                      S21936=0;
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                    else {
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                  }
                  else {
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S21936){
              case 0 : 
                if(!bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 433, column: 18
                  S21936=1;
                  if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 435, column: 21
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                  else {
                    ends[54]=2;
                    ;//sysj\conveyor_controller.sysj line: 432, column: 11
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 396, column: 14
                    S21630=0;
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                }
                else {
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 435, column: 21
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  ends[54]=2;
                  ;//sysj\conveyor_controller.sysj line: 432, column: 11
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 396, column: 14
                  S21630=0;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35789(int [] tdone, int [] ends){
        S23570=1;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread35788(int [] tdone, int [] ends){
        S23567=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread35787(int [] tdone, int [] ends){
        S23597=1;
    S23573=0;
    if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 457, column: 26
      thread35788(tdone,ends);
      thread35789(tdone,ends);
      int biggest35790 = 0;
      if(ends[61]>=biggest35790){
        biggest35790=ends[61];
      }
      if(ends[62]>=biggest35790){
        biggest35790=ends[62];
      }
      if(biggest35790 == 1){
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
      }
    }
    else {
      S23573=1;
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread35786(int [] tdone, int [] ends){
        S23562=1;
    S23506=0;
    S23486=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
      S23486=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      S23481=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
        S23481=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
          ends[59]=2;
          ;//sysj\conveyor_controller.sysj line: 446, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
            bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
            currsigs.addElement(bottleAtPos2_53);
            S23506=1;
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
          }
          else {
            S23506=1;
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
          }
        }
        else {
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
      }
      else {
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
      }
    }
  }

  public void thread35785(int [] tdone, int [] ends){
        S23479=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 396, column: 14
    S21630=0;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread35782(int [] tdone, int [] ends){
        S23570=1;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread35781(int [] tdone, int [] ends){
        S23567=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread35780(int [] tdone, int [] ends){
        S23597=1;
    S23573=0;
    if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 457, column: 26
      thread35781(tdone,ends);
      thread35782(tdone,ends);
      int biggest35783 = 0;
      if(ends[61]>=biggest35783){
        biggest35783=ends[61];
      }
      if(ends[62]>=biggest35783){
        biggest35783=ends[62];
      }
      if(biggest35783 == 1){
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
      }
    }
    else {
      S23573=1;
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread35779(int [] tdone, int [] ends){
        S23562=1;
    S23506=0;
    S23486=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
      S23486=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      S23481=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
        S23481=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
          ends[59]=2;
          ;//sysj\conveyor_controller.sysj line: 446, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
            bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
            currsigs.addElement(bottleAtPos2_53);
            S23506=1;
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
          }
          else {
            S23506=1;
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
          }
        }
        else {
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
      }
      else {
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
      }
    }
  }

  public void thread35778(int [] tdone, int [] ends){
        S23479=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 396, column: 14
    S21630=0;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread35775(int [] tdone, int [] ends){
        S23570=1;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread35774(int [] tdone, int [] ends){
        S23567=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread35773(int [] tdone, int [] ends){
        S23597=1;
    S23573=0;
    if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 457, column: 26
      thread35774(tdone,ends);
      thread35775(tdone,ends);
      int biggest35776 = 0;
      if(ends[61]>=biggest35776){
        biggest35776=ends[61];
      }
      if(ends[62]>=biggest35776){
        biggest35776=ends[62];
      }
      if(biggest35776 == 1){
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
      }
    }
    else {
      S23573=1;
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread35772(int [] tdone, int [] ends){
        S23562=1;
    S23506=0;
    S23486=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
      S23486=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      S23481=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
        S23481=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
          ends[59]=2;
          ;//sysj\conveyor_controller.sysj line: 446, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
            bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
            currsigs.addElement(bottleAtPos2_53);
            S23506=1;
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
          }
          else {
            S23506=1;
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
          }
        }
        else {
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
      }
      else {
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
      }
    }
  }

  public void thread35771(int [] tdone, int [] ends){
        S23479=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 396, column: 14
    S21630=0;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread35768(int [] tdone, int [] ends){
        S23570=1;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread35767(int [] tdone, int [] ends){
        S23567=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread35766(int [] tdone, int [] ends){
        S23597=1;
    S23573=0;
    if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 457, column: 26
      thread35767(tdone,ends);
      thread35768(tdone,ends);
      int biggest35769 = 0;
      if(ends[61]>=biggest35769){
        biggest35769=ends[61];
      }
      if(ends[62]>=biggest35769){
        biggest35769=ends[62];
      }
      if(biggest35769 == 1){
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
      }
    }
    else {
      S23573=1;
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread35765(int [] tdone, int [] ends){
        S23562=1;
    S23506=0;
    S23486=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
      S23486=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      S23481=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
        S23481=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
          ends[59]=2;
          ;//sysj\conveyor_controller.sysj line: 446, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
            bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
            currsigs.addElement(bottleAtPos2_53);
            S23506=1;
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
          }
          else {
            S23506=1;
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
          }
        }
        else {
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
      }
      else {
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
      }
    }
  }

  public void thread35764(int [] tdone, int [] ends){
        S23479=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 396, column: 14
    S21630=0;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S29509){
        case 0 : 
          S29509=0;
          break RUN;
        
        case 1 : 
          S29509=2;
          S29509=2;
          bottleAtPos2_53.setClear();//sysj\conveyor_controller.sysj line: 390, column: 9
          S29508=0;
          S21612=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 391, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 9
            S21612=1;
            active[53]=1;
            ends[53]=1;
            break RUN;
          }
          else {
            S21607=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 391, column: 9
              S21607=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 9
                ends[53]=2;
                ;//sysj\conveyor_controller.sysj line: 391, column: 9
                S29508=1;
                thread35764(tdone,ends);
                thread35765(tdone,ends);
                thread35766(tdone,ends);
                int biggest35770 = 0;
                if(ends[54]>=biggest35770){
                  biggest35770=ends[54];
                }
                if(ends[59]>=biggest35770){
                  biggest35770=ends[59];
                }
                if(ends[60]>=biggest35770){
                  biggest35770=ends[60];
                }
                if(biggest35770 == 1){
                  active[53]=1;
                  ends[53]=1;
                  break RUN;
                }
              }
              else {
                active[53]=1;
                ends[53]=1;
                break RUN;
              }
            }
            else {
              active[53]=1;
              ends[53]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos2_53.setClear();//sysj\conveyor_controller.sysj line: 390, column: 9
          switch(S29508){
            case 0 : 
              switch(S21612){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 391, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 9
                    S21612=1;
                    active[53]=1;
                    ends[53]=1;
                    break RUN;
                  }
                  else {
                    switch(S21607){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 391, column: 9
                          S21607=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 9
                            ends[53]=2;
                            ;//sysj\conveyor_controller.sysj line: 391, column: 9
                            S29508=1;
                            thread35771(tdone,ends);
                            thread35772(tdone,ends);
                            thread35773(tdone,ends);
                            int biggest35777 = 0;
                            if(ends[54]>=biggest35777){
                              biggest35777=ends[54];
                            }
                            if(ends[59]>=biggest35777){
                              biggest35777=ends[59];
                            }
                            if(ends[60]>=biggest35777){
                              biggest35777=ends[60];
                            }
                            if(biggest35777 == 1){
                              active[53]=1;
                              ends[53]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[53]=1;
                            ends[53]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[53]=1;
                          ends[53]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 9
                          ends[53]=2;
                          ;//sysj\conveyor_controller.sysj line: 391, column: 9
                          S29508=1;
                          thread35778(tdone,ends);
                          thread35779(tdone,ends);
                          thread35780(tdone,ends);
                          int biggest35784 = 0;
                          if(ends[54]>=biggest35784){
                            biggest35784=ends[54];
                          }
                          if(ends[59]>=biggest35784){
                            biggest35784=ends[59];
                          }
                          if(ends[60]>=biggest35784){
                            biggest35784=ends[60];
                          }
                          if(biggest35784 == 1){
                            active[53]=1;
                            ends[53]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[53]=1;
                          ends[53]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S21612=1;
                  S21612=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 391, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 9
                    S21612=1;
                    active[53]=1;
                    ends[53]=1;
                    break RUN;
                  }
                  else {
                    S21607=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 391, column: 9
                      S21607=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 9
                        ends[53]=2;
                        ;//sysj\conveyor_controller.sysj line: 391, column: 9
                        S29508=1;
                        thread35785(tdone,ends);
                        thread35786(tdone,ends);
                        thread35787(tdone,ends);
                        int biggest35791 = 0;
                        if(ends[54]>=biggest35791){
                          biggest35791=ends[54];
                        }
                        if(ends[59]>=biggest35791){
                          biggest35791=ends[59];
                        }
                        if(ends[60]>=biggest35791){
                          biggest35791=ends[60];
                        }
                        if(biggest35791 == 1){
                          active[53]=1;
                          ends[53]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[53]=1;
                        ends[53]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[53]=1;
                      ends[53]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread35792(tdone,ends);
              thread35820(tdone,ends);
              thread35821(tdone,ends);
              int biggest35828 = 0;
              if(ends[54]>=biggest35828){
                biggest35828=ends[54];
              }
              if(ends[59]>=biggest35828){
                biggest35828=ends[59];
              }
              if(ends[60]>=biggest35828){
                biggest35828=ends[60];
              }
              if(biggest35828 == 1){
                active[53]=1;
                ends[53]=1;
                break RUN;
              }
              //FINXME code
              if(biggest35828 == 0){
                S29509=0;
                active[53]=0;
                ends[53]=0;
                S29509=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos2_53 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[53] != 0){
      int index = 53;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[53]!=0 || suspended[53]!=0 || active[53]!=1);
      else{
        if(!df){
          simFiller_in.gethook();
          fillerReady_o.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          df = true;
        }
        runClockDomain();
      }
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      bottleAtPos2E.setpreclear();
      bottleAtPos2_53.setpreclear();
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
      bottleAtPos2_53.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[53]!=0 || suspended[53]!=0 || active[53]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[53] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
