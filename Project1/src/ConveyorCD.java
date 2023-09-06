import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ConveyorCD extends ClockDomain{
  public ConveyorCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal bottleDeployed = new Signal("bottleDeployed", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  public output_Channel convReady_o = new output_Channel();
  private long __start_thread_7;//sysj\conveyor_controller.sysj line: 44, column: 17
  private int S2371 = 1;
  private int S2039 = 1;
  private int S1461 = 1;
  private int S1466 = 1;
  private int S1465 = 1;
  private int S1512 = 1;
  private int S1511 = 1;
  private int S1473 = 1;
  private int S1468 = 1;
  private int S1570 = 1;
  private int S1565 = 1;
  private int S1614 = 1;
  private int S1609 = 1;
  private int S2369 = 1;
  private int S2121 = 1;
  private int S2048 = 1;
  private int S2079 = 1;
  private int S2050 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread2388(int [] tdone, int [] ends){
        switch(S2079){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S2050){
          case 0 : 
            if(bottleAtPos1.getprestatus() || bottleLeftPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 45, column: 27
              System.out.println("Bottle Reached Pos1");//sysj\conveyor_controller.sysj line: 46, column: 21
              S2050=1;
              __start_thread_7 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 44, column: 17
              if(com.systemj.Timer.getMs() - __start_thread_7 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 44, column: 17
                ends[7]=3;
                ;//sysj\conveyor_controller.sysj line: 44, column: 17
                ends[7]=2;
                tdone[7]=1;
              }
              else {
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_7 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 44, column: 17
              ends[7]=3;
              ;//sysj\conveyor_controller.sysj line: 44, column: 17
              ends[7]=2;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2387(int [] tdone, int [] ends){
        switch(S2048){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 41, column: 21
        currsigs.addElement(motConveyorOnOff);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread2385(int [] tdone, int [] ends){
        S2079=1;
    S2050=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2384(int [] tdone, int [] ends){
        S2048=1;
    System.out.println("Conveyer On");//sysj\conveyor_controller.sysj line: 40, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 41, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2383(int [] tdone, int [] ends){
        switch(S2369){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2121){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 37, column: 19
              S2121=1;
              thread2384(tdone,ends);
              thread2385(tdone,ends);
              int biggest2386 = 0;
              if(ends[6]>=biggest2386){
                biggest2386=ends[6];
              }
              if(ends[7]>=biggest2386){
                biggest2386=ends[7];
              }
              if(biggest2386 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            thread2387(tdone,ends);
            thread2388(tdone,ends);
            int biggest2389 = 0;
            if(ends[6]>=biggest2389){
              biggest2389=ends[6];
            }
            if(ends[7]>=biggest2389){
              biggest2389=ends[7];
            }
            if(biggest2389 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest2389 == 2){
              ends[5]=2;
              ;//sysj\conveyor_controller.sysj line: 38, column: 13
              S2121=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest2389 == 0){
              S2121=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2381(int [] tdone, int [] ends){
        switch(S1512){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1511){
          case 0 : 
            S1511=0;
            S1511=1;
            S1473=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 23, column: 21
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
              S1473=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S1468=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                convReady_o.setVal(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                S1468=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                  ends[4]=2;
                  ;//sysj\conveyor_controller.sysj line: 23, column: 21
                  S1512=0;
                  active[4]=0;
                  ends[4]=0;
                  tdone[4]=1;
                }
                else {
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
          case 1 : 
            switch(S1473){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 23, column: 21
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                  S1473=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S1468){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                        convReady_o.setVal(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                        S1468=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                          ends[4]=2;
                          ;//sysj\conveyor_controller.sysj line: 23, column: 21
                          S1512=0;
                          active[4]=0;
                          ends[4]=0;
                          tdone[4]=1;
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                        ends[4]=2;
                        ;//sysj\conveyor_controller.sysj line: 23, column: 21
                        S1512=0;
                        active[4]=0;
                        ends[4]=0;
                        tdone[4]=1;
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S1473=1;
                S1473=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 23, column: 21
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                  S1473=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S1468=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                    convReady_o.setVal(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                    S1468=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                      ends[4]=2;
                      ;//sysj\conveyor_controller.sysj line: 23, column: 21
                      S1512=0;
                      active[4]=0;
                      ends[4]=0;
                      tdone[4]=1;
                    }
                    else {
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2380(int [] tdone, int [] ends){
        switch(S1466){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1465){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 16, column: 27
              S1465=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S1465=1;
            convReady_o.setPreempted();//sysj\conveyor_controller.sysj line: 18, column: 21
            ends[3]=2;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2378(int [] tdone, int [] ends){
        S1512=1;
    S1511=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2377(int [] tdone, int [] ends){
        S1466=1;
    S1465=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2376(int [] tdone, int [] ends){
        switch(S2039){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1461){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 11, column: 19
              S1461=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!bottleLeftPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 12, column: 19
              S1461=2;
              thread2377(tdone,ends);
              thread2378(tdone,ends);
              int biggest2379 = 0;
              if(ends[3]>=biggest2379){
                biggest2379=ends[3];
              }
              if(ends[4]>=biggest2379){
                biggest2379=ends[4];
              }
              if(biggest2379 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            thread2380(tdone,ends);
            thread2381(tdone,ends);
            int biggest2382 = 0;
            if(ends[3]>=biggest2382){
              biggest2382=ends[3];
            }
            if(ends[4]>=biggest2382){
              biggest2382=ends[4];
            }
            if(biggest2382 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest2382 == 2){
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 14, column: 13
              S1461=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest2382 == 0){
              S1461=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            S1461=3;
            S1461=4;
            S1570=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 27, column: 13
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 27, column: 13
              S1570=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S1565=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 27, column: 13
                convReady_o.setVal(false);//sysj\conveyor_controller.sysj line: 27, column: 13
                S1565=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 27, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 27, column: 13
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 27, column: 13
                  S1461=5;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 4 : 
            switch(S1570){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 27, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 27, column: 13
                  S1570=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S1565){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 27, column: 13
                        convReady_o.setVal(false);//sysj\conveyor_controller.sysj line: 27, column: 13
                        S1565=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 27, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 27, column: 13
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 27, column: 13
                          S1461=5;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 27, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 27, column: 13
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 27, column: 13
                        S1461=5;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S1570=1;
                S1570=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 27, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 27, column: 13
                  S1570=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1565=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 27, column: 13
                    convReady_o.setVal(false);//sysj\conveyor_controller.sysj line: 27, column: 13
                    S1565=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 27, column: 13
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 27, column: 13
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 27, column: 13
                      S1461=5;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            S1461=5;
            S1461=6;
            S1614=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 29, column: 14
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 29, column: 14
              S1614=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S1609=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 29, column: 14
                convReady_o.setVal(true);//sysj\conveyor_controller.sysj line: 29, column: 14
                S1609=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 29, column: 14
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 29, column: 14
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 29, column: 14
                  System.out.println("Conveyor Ready");//sysj\conveyor_controller.sysj line: 30, column: 13
                  S1461=7;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 6 : 
            switch(S1614){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 29, column: 14
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 29, column: 14
                  S1614=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S1609){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 29, column: 14
                        convReady_o.setVal(true);//sysj\conveyor_controller.sysj line: 29, column: 14
                        S1609=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 29, column: 14
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 29, column: 14
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 29, column: 14
                          System.out.println("Conveyor Ready");//sysj\conveyor_controller.sysj line: 30, column: 13
                          S1461=7;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 29, column: 14
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 29, column: 14
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 29, column: 14
                        System.out.println("Conveyor Ready");//sysj\conveyor_controller.sysj line: 30, column: 13
                        S1461=7;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S1614=1;
                S1614=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 29, column: 14
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 29, column: 14
                  S1614=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1609=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 29, column: 14
                    convReady_o.setVal(true);//sysj\conveyor_controller.sysj line: 29, column: 14
                    S1609=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 29, column: 14
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 29, column: 14
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 29, column: 14
                      System.out.println("Conveyor Ready");//sysj\conveyor_controller.sysj line: 30, column: 13
                      S1461=7;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 7 : 
            S1461=7;
            System.out.println("Waiting for bottle to be delopyed and conveyor to be cleared...");//sysj\conveyor_controller.sysj line: 10, column: 10
            S1461=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2374(int [] tdone, int [] ends){
        S2369=1;
    S2121=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2373(int [] tdone, int [] ends){
        S2039=1;
    System.out.println("Waiting for bottle to be delopyed and conveyor to be cleared...");//sysj\conveyor_controller.sysj line: 10, column: 10
    S1461=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2371){
        case 0 : 
          S2371=0;
          break RUN;
        
        case 1 : 
          S2371=2;
          S2371=2;
          thread2373(tdone,ends);
          thread2374(tdone,ends);
          int biggest2375 = 0;
          if(ends[2]>=biggest2375){
            biggest2375=ends[2];
          }
          if(ends[5]>=biggest2375){
            biggest2375=ends[5];
          }
          if(biggest2375 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2376(tdone,ends);
          thread2383(tdone,ends);
          int biggest2390 = 0;
          if(ends[2]>=biggest2390){
            biggest2390=ends[2];
          }
          if(ends[5]>=biggest2390){
            biggest2390=ends[5];
          }
          if(biggest2390 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2390 == 0){
            S2371=0;
            active[1]=0;
            ends[1]=0;
            S2371=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          convReady_o.gethook();
          bottleAtPos1.gethook();
          bottleLeftPos5.gethook();
          bottleDeployed.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleDeployed.setpreclear();
      motConveyorOnOff.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      dummyint = bottleDeployed.getStatus() ? bottleDeployed.setprepresent() : bottleDeployed.setpreclear();
      bottleDeployed.setpreval(bottleDeployed.getValue());
      bottleDeployed.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      convReady_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        convReady_o.gethook();
        bottleAtPos1.gethook();
        bottleLeftPos5.gethook();
        bottleDeployed.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
