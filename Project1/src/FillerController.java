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
  private long __start_thread_54;//sysj\conveyor_controller.sysj line: 397, column: 9
  private int S36353 = 1;
  private int S36352 = 1;
  private int S28456 = 1;
  private int S28451 = 1;
  private int S30323 = 1;
  private int S28474 = 1;
  private int S28481 = 1;
  private int S28476 = 1;
  private int S28582 = 1;
  private int S28587 = 1;
  private int S28666 = 1;
  private int S28671 = 1;
  private int S28707 = 1;
  private int S28702 = 1;
  private int S28780 = 1;
  private int S30406 = 1;
  private int S30350 = 1;
  private int S30330 = 1;
  private int S30325 = 1;
  private int S30441 = 1;
  private int S30417 = 1;
  private int S30411 = 1;
  private int S30414 = 1;
  
  private int[] ends = new int[77];
  private int[] tdone = new int[77];
  
  public void thread42677(int [] tdone, int [] ends){
        S30414=1;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread42676(int [] tdone, int [] ends){
        S30411=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread42674(int [] tdone, int [] ends){
        switch(S30414){
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

  public void thread42673(int [] tdone, int [] ends){
        switch(S30411){
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

  public void thread42672(int [] tdone, int [] ends){
        switch(S30441){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        switch(S30417){
          case 0 : 
            thread42673(tdone,ends);
            thread42674(tdone,ends);
            int biggest42675 = 0;
            if(ends[61]>=biggest42675){
              biggest42675=ends[61];
            }
            if(ends[62]>=biggest42675){
              biggest42675=ends[62];
            }
            if(biggest42675 == 1){
              active[60]=1;
              ends[60]=1;
              tdone[60]=1;
            }
            if(biggest42675 == 2){
              ends[60]=2;
              ;//sysj\conveyor_controller.sysj line: 458, column: 18
              S30417=1;
              active[60]=1;
              ends[60]=1;
              tdone[60]=1;
            }
            //FINXME code
            if(biggest42675 == 0){
              S30417=1;
              active[60]=1;
              ends[60]=1;
              tdone[60]=1;
            }
            break;
          
          case 1 : 
            S30417=1;
            S30417=0;
            if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 457, column: 26
              thread42676(tdone,ends);
              thread42677(tdone,ends);
              int biggest42678 = 0;
              if(ends[61]>=biggest42678){
                biggest42678=ends[61];
              }
              if(ends[62]>=biggest42678){
                biggest42678=ends[62];
              }
              if(biggest42678 == 1){
                active[60]=1;
                ends[60]=1;
                tdone[60]=1;
              }
            }
            else {
              S30417=1;
              active[60]=1;
              ends[60]=1;
              tdone[60]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread42671(int [] tdone, int [] ends){
        switch(S30406){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        switch(S30350){
          case 0 : 
            switch(S30330){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
                  S30330=1;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  switch(S30325){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
                        S30325=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
                          ends[59]=2;
                          ;//sysj\conveyor_controller.sysj line: 446, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
                            bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
                            currsigs.addElement(bottleAtPos2_53);
                            S30350=1;
                            active[59]=1;
                            ends[59]=1;
                            tdone[59]=1;
                          }
                          else {
                            S30350=1;
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
                          S30350=1;
                          active[59]=1;
                          ends[59]=1;
                          tdone[59]=1;
                        }
                        else {
                          S30350=1;
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
                S30330=1;
                S30330=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
                  S30330=1;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  S30325=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
                    S30325=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
                      ends[59]=2;
                      ;//sysj\conveyor_controller.sysj line: 446, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
                        bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
                        currsigs.addElement(bottleAtPos2_53);
                        S30350=1;
                        active[59]=1;
                        ends[59]=1;
                        tdone[59]=1;
                      }
                      else {
                        S30350=1;
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
            S30350=1;
            S30350=0;
            S30330=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
              S30330=1;
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            else {
              S30325=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
                S30325=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
                  ends[59]=2;
                  ;//sysj\conveyor_controller.sysj line: 446, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
                    bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
                    currsigs.addElement(bottleAtPos2_53);
                    S30350=1;
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                  else {
                    S30350=1;
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

  public void thread42669(int [] tdone, int [] ends){
        switch(S28671){
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

  public void thread42668(int [] tdone, int [] ends){
        switch(S28666){
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

  public void thread42666(int [] tdone, int [] ends){
        S28671=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 424, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread42665(int [] tdone, int [] ends){
        S28666=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 419, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 420, column: 13
    currsigs.addElement(valveInletOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread42663(int [] tdone, int [] ends){
        switch(S28587){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 413, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread42662(int [] tdone, int [] ends){
        switch(S28582){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 409, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread42660(int [] tdone, int [] ends){
        S28671=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 424, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread42659(int [] tdone, int [] ends){
        S28666=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 419, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 420, column: 13
    currsigs.addElement(valveInletOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread42657(int [] tdone, int [] ends){
        S28587=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 413, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread42656(int [] tdone, int [] ends){
        S28582=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 408, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 409, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread42654(int [] tdone, int [] ends){
        S28587=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 413, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread42653(int [] tdone, int [] ends){
        S28582=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 408, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 409, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread42651(int [] tdone, int [] ends){
        S28587=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 413, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread42650(int [] tdone, int [] ends){
        S28582=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 408, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 409, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread42648(int [] tdone, int [] ends){
        S28587=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 413, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread42647(int [] tdone, int [] ends){
        S28582=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 408, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 409, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread42645(int [] tdone, int [] ends){
        S28587=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 413, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread42644(int [] tdone, int [] ends){
        S28582=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 408, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 409, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread42643(int [] tdone, int [] ends){
        switch(S30323){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S28474){
          case 0 : 
            if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 400, column: 17
              S28474=1;
              S28481=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 401, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 401, column: 11
                S28481=1;
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
              else {
                S28476=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 401, column: 11
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 401, column: 11
                  S28476=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 401, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 401, column: 11
                    ends[54]=2;
                    ;//sysj\conveyor_controller.sysj line: 401, column: 11
                    S28474=2;
                    __start_thread_54 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 397, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_54 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 397, column: 9
                      ends[54]=2;
                      ;//sysj\conveyor_controller.sysj line: 397, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 404, column: 11
                      S28474=3;
                      thread42644(tdone,ends);
                      thread42645(tdone,ends);
                      int biggest42646 = 0;
                      if(ends[55]>=biggest42646){
                        biggest42646=ends[55];
                      }
                      if(ends[56]>=biggest42646){
                        biggest42646=ends[56];
                      }
                      if(biggest42646 == 1){
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
            switch(S28481){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 401, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 401, column: 11
                  S28481=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  switch(S28476){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 401, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 401, column: 11
                        S28476=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 401, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 401, column: 11
                          ends[54]=2;
                          ;//sysj\conveyor_controller.sysj line: 401, column: 11
                          S28474=2;
                          __start_thread_54 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 397, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_54 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 397, column: 9
                            ends[54]=2;
                            ;//sysj\conveyor_controller.sysj line: 397, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 404, column: 11
                            S28474=3;
                            thread42647(tdone,ends);
                            thread42648(tdone,ends);
                            int biggest42649 = 0;
                            if(ends[55]>=biggest42649){
                              biggest42649=ends[55];
                            }
                            if(ends[56]>=biggest42649){
                              biggest42649=ends[56];
                            }
                            if(biggest42649 == 1){
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
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 401, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 401, column: 11
                        ends[54]=2;
                        ;//sysj\conveyor_controller.sysj line: 401, column: 11
                        S28474=2;
                        __start_thread_54 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 397, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_54 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 397, column: 9
                          ends[54]=2;
                          ;//sysj\conveyor_controller.sysj line: 397, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 404, column: 11
                          S28474=3;
                          thread42650(tdone,ends);
                          thread42651(tdone,ends);
                          int biggest42652 = 0;
                          if(ends[55]>=biggest42652){
                            biggest42652=ends[55];
                          }
                          if(ends[56]>=biggest42652){
                            biggest42652=ends[56];
                          }
                          if(biggest42652 == 1){
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
                S28481=1;
                S28481=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 401, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 401, column: 11
                  S28481=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  S28476=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 401, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 401, column: 11
                    S28476=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 401, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 401, column: 11
                      ends[54]=2;
                      ;//sysj\conveyor_controller.sysj line: 401, column: 11
                      S28474=2;
                      __start_thread_54 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 397, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_54 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 397, column: 9
                        ends[54]=2;
                        ;//sysj\conveyor_controller.sysj line: 397, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 404, column: 11
                        S28474=3;
                        thread42653(tdone,ends);
                        thread42654(tdone,ends);
                        int biggest42655 = 0;
                        if(ends[55]>=biggest42655){
                          biggest42655=ends[55];
                        }
                        if(ends[56]>=biggest42655){
                          biggest42655=ends[56];
                        }
                        if(biggest42655 == 1){
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
            if(com.systemj.Timer.getMs() - __start_thread_54 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 397, column: 9
              ends[54]=2;
              ;//sysj\conveyor_controller.sysj line: 397, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 404, column: 11
              S28474=3;
              thread42656(tdone,ends);
              thread42657(tdone,ends);
              int biggest42658 = 0;
              if(ends[55]>=biggest42658){
                biggest42658=ends[55];
              }
              if(ends[56]>=biggest42658){
                biggest42658=ends[56];
              }
              if(biggest42658 == 1){
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
            if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 406, column: 17
              S28474=4;
              thread42659(tdone,ends);
              thread42660(tdone,ends);
              int biggest42661 = 0;
              if(ends[57]>=biggest42661){
                biggest42661=ends[57];
              }
              if(ends[58]>=biggest42661){
                biggest42661=ends[58];
              }
              if(biggest42661 == 1){
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
            }
            else {
              thread42662(tdone,ends);
              thread42663(tdone,ends);
              int biggest42664 = 0;
              if(ends[55]>=biggest42664){
                biggest42664=ends[55];
              }
              if(ends[56]>=biggest42664){
                biggest42664=ends[56];
              }
              if(biggest42664 == 1){
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
              //FINXME code
              if(biggest42664 == 0){
                S28474=4;
                thread42665(tdone,ends);
                thread42666(tdone,ends);
                int biggest42667 = 0;
                if(ends[57]>=biggest42667){
                  biggest42667=ends[57];
                }
                if(ends[58]>=biggest42667){
                  biggest42667=ends[58];
                }
                if(biggest42667 == 1){
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 417, column: 17
              S28474=5;
              S28707=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 429, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                S28707=1;
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
              else {
                S28702=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 429, column: 11
                  S28702=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                    ends[54]=2;
                    ;//sysj\conveyor_controller.sysj line: 429, column: 11
                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 430, column: 11
                    S28474=6;
                    S28780=0;
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
              thread42668(tdone,ends);
              thread42669(tdone,ends);
              int biggest42670 = 0;
              if(ends[57]>=biggest42670){
                biggest42670=ends[57];
              }
              if(ends[58]>=biggest42670){
                biggest42670=ends[58];
              }
              if(biggest42670 == 1){
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
              //FINXME code
              if(biggest42670 == 0){
                S28474=5;
                S28707=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 429, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                  S28707=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  S28702=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 429, column: 11
                    S28702=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                      ends[54]=2;
                      ;//sysj\conveyor_controller.sysj line: 429, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 430, column: 11
                      S28474=6;
                      S28780=0;
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
            switch(S28707){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 429, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                  S28707=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  switch(S28702){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 429, column: 11
                        S28702=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                          ends[54]=2;
                          ;//sysj\conveyor_controller.sysj line: 429, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 430, column: 11
                          S28474=6;
                          S28780=0;
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
                        S28474=6;
                        S28780=0;
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
                S28707=1;
                S28707=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 429, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                  S28707=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  S28702=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 429, column: 11
                    S28702=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 429, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 429, column: 11
                      ends[54]=2;
                      ;//sysj\conveyor_controller.sysj line: 429, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 430, column: 11
                      S28474=6;
                      S28780=0;
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
            switch(S28780){
              case 0 : 
                if(!bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 433, column: 18
                  S28780=1;
                  if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 435, column: 21
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                  else {
                    ends[54]=2;
                    ;//sysj\conveyor_controller.sysj line: 432, column: 11
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 399, column: 14
                    S28474=0;
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
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 399, column: 14
                  S28474=0;
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

  public void thread42640(int [] tdone, int [] ends){
        S30414=1;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread42639(int [] tdone, int [] ends){
        S30411=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread42638(int [] tdone, int [] ends){
        S30441=1;
    S30417=0;
    if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 457, column: 26
      thread42639(tdone,ends);
      thread42640(tdone,ends);
      int biggest42641 = 0;
      if(ends[61]>=biggest42641){
        biggest42641=ends[61];
      }
      if(ends[62]>=biggest42641){
        biggest42641=ends[62];
      }
      if(biggest42641 == 1){
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
      }
    }
    else {
      S30417=1;
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread42637(int [] tdone, int [] ends){
        S30406=1;
    S30350=0;
    S30330=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
      S30330=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      S30325=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
        S30325=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
          ends[59]=2;
          ;//sysj\conveyor_controller.sysj line: 446, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
            bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
            currsigs.addElement(bottleAtPos2_53);
            S30350=1;
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
          }
          else {
            S30350=1;
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

  public void thread42636(int [] tdone, int [] ends){
        S30323=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 399, column: 14
    S28474=0;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread42633(int [] tdone, int [] ends){
        S30414=1;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread42632(int [] tdone, int [] ends){
        S30411=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread42631(int [] tdone, int [] ends){
        S30441=1;
    S30417=0;
    if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 457, column: 26
      thread42632(tdone,ends);
      thread42633(tdone,ends);
      int biggest42634 = 0;
      if(ends[61]>=biggest42634){
        biggest42634=ends[61];
      }
      if(ends[62]>=biggest42634){
        biggest42634=ends[62];
      }
      if(biggest42634 == 1){
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
      }
    }
    else {
      S30417=1;
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread42630(int [] tdone, int [] ends){
        S30406=1;
    S30350=0;
    S30330=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
      S30330=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      S30325=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
        S30325=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
          ends[59]=2;
          ;//sysj\conveyor_controller.sysj line: 446, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
            bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
            currsigs.addElement(bottleAtPos2_53);
            S30350=1;
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
          }
          else {
            S30350=1;
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

  public void thread42629(int [] tdone, int [] ends){
        S30323=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 399, column: 14
    S28474=0;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread42626(int [] tdone, int [] ends){
        S30414=1;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread42625(int [] tdone, int [] ends){
        S30411=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread42624(int [] tdone, int [] ends){
        S30441=1;
    S30417=0;
    if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 457, column: 26
      thread42625(tdone,ends);
      thread42626(tdone,ends);
      int biggest42627 = 0;
      if(ends[61]>=biggest42627){
        biggest42627=ends[61];
      }
      if(ends[62]>=biggest42627){
        biggest42627=ends[62];
      }
      if(biggest42627 == 1){
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
      }
    }
    else {
      S30417=1;
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread42623(int [] tdone, int [] ends){
        S30406=1;
    S30350=0;
    S30330=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
      S30330=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      S30325=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
        S30325=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
          ends[59]=2;
          ;//sysj\conveyor_controller.sysj line: 446, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
            bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
            currsigs.addElement(bottleAtPos2_53);
            S30350=1;
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
          }
          else {
            S30350=1;
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

  public void thread42622(int [] tdone, int [] ends){
        S30323=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 399, column: 14
    S28474=0;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread42619(int [] tdone, int [] ends){
        S30414=1;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread42618(int [] tdone, int [] ends){
        S30411=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 460, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread42617(int [] tdone, int [] ends){
        S30441=1;
    S30417=0;
    if(bottleAtPos2_53.getprestatus()){//sysj\conveyor_controller.sysj line: 457, column: 26
      thread42618(tdone,ends);
      thread42619(tdone,ends);
      int biggest42620 = 0;
      if(ends[61]>=biggest42620){
        biggest42620=ends[61];
      }
      if(ends[62]>=biggest42620){
        biggest42620=ends[62];
      }
      if(biggest42620 == 1){
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
      }
    }
    else {
      S30417=1;
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread42616(int [] tdone, int [] ends){
        S30406=1;
    S30350=0;
    S30330=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 446, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
      S30330=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      S30325=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 446, column: 12
        S30325=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 446, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 446, column: 12
          ends[59]=2;
          ;//sysj\conveyor_controller.sysj line: 446, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 447, column: 15
            bottleAtPos2_53.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 13
            currsigs.addElement(bottleAtPos2_53);
            S30350=1;
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
          }
          else {
            S30350=1;
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

  public void thread42615(int [] tdone, int [] ends){
        S30323=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 399, column: 14
    S28474=0;
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
      switch(S36353){
        case 0 : 
          S36353=0;
          break RUN;
        
        case 1 : 
          S36353=2;
          S36353=2;
          bottleAtPos2_53.setClear();//sysj\conveyor_controller.sysj line: 393, column: 9
          S36352=0;
          S28456=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 394, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 394, column: 9
            S28456=1;
            active[53]=1;
            ends[53]=1;
            break RUN;
          }
          else {
            S28451=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 394, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 394, column: 9
              S28451=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 394, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 394, column: 9
                ends[53]=2;
                ;//sysj\conveyor_controller.sysj line: 394, column: 9
                S36352=1;
                thread42615(tdone,ends);
                thread42616(tdone,ends);
                thread42617(tdone,ends);
                int biggest42621 = 0;
                if(ends[54]>=biggest42621){
                  biggest42621=ends[54];
                }
                if(ends[59]>=biggest42621){
                  biggest42621=ends[59];
                }
                if(ends[60]>=biggest42621){
                  biggest42621=ends[60];
                }
                if(biggest42621 == 1){
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
          bottleAtPos2_53.setClear();//sysj\conveyor_controller.sysj line: 393, column: 9
          switch(S36352){
            case 0 : 
              switch(S28456){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 394, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 394, column: 9
                    S28456=1;
                    active[53]=1;
                    ends[53]=1;
                    break RUN;
                  }
                  else {
                    switch(S28451){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 394, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 394, column: 9
                          S28451=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 394, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 394, column: 9
                            ends[53]=2;
                            ;//sysj\conveyor_controller.sysj line: 394, column: 9
                            S36352=1;
                            thread42622(tdone,ends);
                            thread42623(tdone,ends);
                            thread42624(tdone,ends);
                            int biggest42628 = 0;
                            if(ends[54]>=biggest42628){
                              biggest42628=ends[54];
                            }
                            if(ends[59]>=biggest42628){
                              biggest42628=ends[59];
                            }
                            if(ends[60]>=biggest42628){
                              biggest42628=ends[60];
                            }
                            if(biggest42628 == 1){
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
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 394, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 394, column: 9
                          ends[53]=2;
                          ;//sysj\conveyor_controller.sysj line: 394, column: 9
                          S36352=1;
                          thread42629(tdone,ends);
                          thread42630(tdone,ends);
                          thread42631(tdone,ends);
                          int biggest42635 = 0;
                          if(ends[54]>=biggest42635){
                            biggest42635=ends[54];
                          }
                          if(ends[59]>=biggest42635){
                            biggest42635=ends[59];
                          }
                          if(ends[60]>=biggest42635){
                            biggest42635=ends[60];
                          }
                          if(biggest42635 == 1){
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
                  S28456=1;
                  S28456=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 394, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 394, column: 9
                    S28456=1;
                    active[53]=1;
                    ends[53]=1;
                    break RUN;
                  }
                  else {
                    S28451=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 394, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 394, column: 9
                      S28451=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 394, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 394, column: 9
                        ends[53]=2;
                        ;//sysj\conveyor_controller.sysj line: 394, column: 9
                        S36352=1;
                        thread42636(tdone,ends);
                        thread42637(tdone,ends);
                        thread42638(tdone,ends);
                        int biggest42642 = 0;
                        if(ends[54]>=biggest42642){
                          biggest42642=ends[54];
                        }
                        if(ends[59]>=biggest42642){
                          biggest42642=ends[59];
                        }
                        if(ends[60]>=biggest42642){
                          biggest42642=ends[60];
                        }
                        if(biggest42642 == 1){
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
              thread42643(tdone,ends);
              thread42671(tdone,ends);
              thread42672(tdone,ends);
              int biggest42679 = 0;
              if(ends[54]>=biggest42679){
                biggest42679=ends[54];
              }
              if(ends[59]>=biggest42679){
                biggest42679=ends[59];
              }
              if(ends[60]>=biggest42679){
                biggest42679=ends[60];
              }
              if(biggest42679 == 1){
                active[53]=1;
                ends[53]=1;
                break RUN;
              }
              //FINXME code
              if(biggest42679 == 0){
                S36353=0;
                active[53]=0;
                ends[53]=0;
                S36353=0;
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
