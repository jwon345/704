import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  public output_Channel lidLoaderReady_o = new output_Channel();
  private Signal manualMode_81;
  private Signal autoMode_81;
  private int S46894 = 1;
  private int S46871 = 1;
  private int S46870 = 1;
  private int S38294 = 1;
  private int S38289 = 1;
  private int S38772 = 1;
  private int S38318 = 1;
  private int S38324 = 1;
  private int S38355 = 1;
  private int S38366 = 1;
  private int S38357 = 1;
  private int S38780 = 1;
  private int S38788 = 1;
  private int S38796 = 1;
  private int S38807 = 1;
  private int S46892 = 1;
  private int S46891 = 1;
  
  private int[] ends = new int[90];
  private int[] tdone = new int[90];
  
  public void thread47721(int [] tdone, int [] ends){
        switch(S46892){
      case 0 : 
        active[89]=0;
        ends[89]=0;
        tdone[89]=1;
        break;
      
      case 1 : 
        switch(S46891){
          case 0 : 
            if(mode.getprestatus()){//sysj\conveyor_controller.sysj line: 707, column: 11
              S46891=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 709, column: 9
                autoMode_81.setPresent();//sysj\conveyor_controller.sysj line: 710, column: 7
                currsigs.addElement(autoMode_81);
                active[89]=1;
                ends[89]=1;
                tdone[89]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 712, column: 14
                  manualMode_81.setPresent();//sysj\conveyor_controller.sysj line: 713, column: 7
                  currsigs.addElement(manualMode_81);
                  active[89]=1;
                  ends[89]=1;
                  tdone[89]=1;
                }
                else {
                  active[89]=1;
                  ends[89]=1;
                  tdone[89]=1;
                }
              }
            }
            else {
              active[89]=1;
              ends[89]=1;
              tdone[89]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 709, column: 9
              autoMode_81.setPresent();//sysj\conveyor_controller.sysj line: 710, column: 7
              currsigs.addElement(autoMode_81);
              active[89]=1;
              ends[89]=1;
              tdone[89]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 712, column: 14
                manualMode_81.setPresent();//sysj\conveyor_controller.sysj line: 713, column: 7
                currsigs.addElement(manualMode_81);
                active[89]=1;
                ends[89]=1;
                tdone[89]=1;
              }
              else {
                active[89]=1;
                ends[89]=1;
                tdone[89]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47719(int [] tdone, int [] ends){
        switch(S38807){
      case 0 : 
        active[88]=0;
        ends[88]=0;
        tdone[88]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 700, column: 21
          armDest.setPresent();//sysj\conveyor_controller.sysj line: 700, column: 31
          currsigs.addElement(armDest);
          System.out.println("Lid Loader - Lid Placed");//sysj\conveyor_controller.sysj line: 700, column: 45
          active[88]=1;
          ends[88]=1;
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

  public void thread47718(int [] tdone, int [] ends){
        switch(S38796){
      case 0 : 
        active[87]=0;
        ends[87]=0;
        tdone[87]=1;
        break;
      
      case 1 : 
        if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 698, column: 21
          armSource.setPresent();//sysj\conveyor_controller.sysj line: 698, column: 33
          currsigs.addElement(armSource);
          active[87]=1;
          ends[87]=1;
          tdone[87]=1;
        }
        else {
          active[87]=1;
          ends[87]=1;
          tdone[87]=1;
        }
        break;
      
    }
  }

  public void thread47717(int [] tdone, int [] ends){
        switch(S38788){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 696, column: 21
          vacOn.setPresent();//sysj\conveyor_controller.sysj line: 696, column: 29
          currsigs.addElement(vacOn);
          active[86]=1;
          ends[86]=1;
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

  public void thread47716(int [] tdone, int [] ends){
        switch(S38780){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 694, column: 21
          pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 694, column: 36
          currsigs.addElement(pusherExtend);
          active[85]=1;
          ends[85]=1;
          tdone[85]=1;
        }
        else {
          active[85]=1;
          ends[85]=1;
          tdone[85]=1;
        }
        break;
      
    }
  }

  public void thread47714(int [] tdone, int [] ends){
        S38807=1;
    if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 700, column: 21
      armDest.setPresent();//sysj\conveyor_controller.sysj line: 700, column: 31
      currsigs.addElement(armDest);
      System.out.println("Lid Loader - Lid Placed");//sysj\conveyor_controller.sysj line: 700, column: 45
      active[88]=1;
      ends[88]=1;
      tdone[88]=1;
    }
    else {
      active[88]=1;
      ends[88]=1;
      tdone[88]=1;
    }
  }

  public void thread47713(int [] tdone, int [] ends){
        S38796=1;
    if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 698, column: 21
      armSource.setPresent();//sysj\conveyor_controller.sysj line: 698, column: 33
      currsigs.addElement(armSource);
      active[87]=1;
      ends[87]=1;
      tdone[87]=1;
    }
    else {
      active[87]=1;
      ends[87]=1;
      tdone[87]=1;
    }
  }

  public void thread47712(int [] tdone, int [] ends){
        S38788=1;
    if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 696, column: 21
      vacOn.setPresent();//sysj\conveyor_controller.sysj line: 696, column: 29
      currsigs.addElement(vacOn);
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
    else {
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
  }

  public void thread47711(int [] tdone, int [] ends){
        S38780=1;
    if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 694, column: 21
      pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 694, column: 36
      currsigs.addElement(pusherExtend);
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
    else {
      active[85]=1;
      ends[85]=1;
      tdone[85]=1;
    }
  }

  public void thread47709(int [] tdone, int [] ends){
        switch(S38366){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        switch(S38357){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 670, column: 16
              System.out.println("WP gripped");//sysj\conveyor_controller.sysj line: 671, column: 10
              S38357=1;
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 673, column: 11
              currsigs.addElement(armDest);
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            else {
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            break;
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 672, column: 16
              System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 675, column: 10
              ends[84]=2;
              tdone[84]=1;
            }
            else {
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 673, column: 11
              currsigs.addElement(armDest);
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47708(int [] tdone, int [] ends){
        switch(S38355){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\conveyor_controller.sysj line: 666, column: 10
        currsigs.addElement(vacOn);
        active[83]=1;
        ends[83]=1;
        tdone[83]=1;
        break;
      
    }
  }

  public void thread47706(int [] tdone, int [] ends){
        S38366=1;
    S38357=0;
    active[84]=1;
    ends[84]=1;
    tdone[84]=1;
  }

  public void thread47705(int [] tdone, int [] ends){
        S38355=1;
    vacOn.setPresent();//sysj\conveyor_controller.sysj line: 666, column: 10
    currsigs.addElement(vacOn);
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread47704(int [] tdone, int [] ends){
        switch(S46871){
      case 0 : 
        active[82]=0;
        ends[82]=0;
        tdone[82]=1;
        break;
      
      case 1 : 
        switch(S46870){
          case 0 : 
            switch(S38294){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 632, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 632, column: 5
                  S38294=1;
                  active[82]=1;
                  ends[82]=1;
                  tdone[82]=1;
                }
                else {
                  switch(S38289){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 632, column: 5
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 632, column: 5
                        S38289=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 632, column: 5
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 632, column: 5
                          ends[82]=2;
                          ;//sysj\conveyor_controller.sysj line: 632, column: 5
                          S46870=1;
                          S38772=0;
                          System.out.println("*Capper - entering auto");//sysj\conveyor_controller.sysj line: 635, column: 7
                          S38318=0;
                          armDest.setPresent();//sysj\conveyor_controller.sysj line: 637, column: 8
                          currsigs.addElement(armDest);
                          active[82]=1;
                          ends[82]=1;
                          tdone[82]=1;
                        }
                        else {
                          active[82]=1;
                          ends[82]=1;
                          tdone[82]=1;
                        }
                      }
                      else {
                        active[82]=1;
                        ends[82]=1;
                        tdone[82]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 632, column: 5
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 632, column: 5
                        ends[82]=2;
                        ;//sysj\conveyor_controller.sysj line: 632, column: 5
                        S46870=1;
                        S38772=0;
                        System.out.println("*Capper - entering auto");//sysj\conveyor_controller.sysj line: 635, column: 7
                        S38318=0;
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 637, column: 8
                        currsigs.addElement(armDest);
                        active[82]=1;
                        ends[82]=1;
                        tdone[82]=1;
                      }
                      else {
                        active[82]=1;
                        ends[82]=1;
                        tdone[82]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S38294=1;
                S38294=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 632, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 632, column: 5
                  S38294=1;
                  active[82]=1;
                  ends[82]=1;
                  tdone[82]=1;
                }
                else {
                  S38289=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 632, column: 5
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 632, column: 5
                    S38289=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 632, column: 5
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 632, column: 5
                      ends[82]=2;
                      ;//sysj\conveyor_controller.sysj line: 632, column: 5
                      S46870=1;
                      S38772=0;
                      System.out.println("*Capper - entering auto");//sysj\conveyor_controller.sysj line: 635, column: 7
                      S38318=0;
                      armDest.setPresent();//sysj\conveyor_controller.sysj line: 637, column: 8
                      currsigs.addElement(armDest);
                      active[82]=1;
                      ends[82]=1;
                      tdone[82]=1;
                    }
                    else {
                      active[82]=1;
                      ends[82]=1;
                      tdone[82]=1;
                    }
                  }
                  else {
                    active[82]=1;
                    ends[82]=1;
                    tdone[82]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S38772){
              case 0 : 
                if(manualMode_81.getprestatus()){//sysj\conveyor_controller.sysj line: 634, column: 12
                  S38772=1;
                  active[82]=1;
                  ends[82]=1;
                  tdone[82]=1;
                }
                else {
                  switch(S38318){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 636, column: 13
                        System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 639, column: 7
                        S38318=1;
                        active[82]=1;
                        ends[82]=1;
                        tdone[82]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 637, column: 8
                        currsigs.addElement(armDest);
                        active[82]=1;
                        ends[82]=1;
                        tdone[82]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 640, column: 13
                        System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 641, column: 7
                        S38318=2;
                        S38324=0;
                        active[82]=1;
                        ends[82]=1;
                        tdone[82]=1;
                      }
                      else {
                        active[82]=1;
                        ends[82]=1;
                        tdone[82]=1;
                      }
                      break;
                    
                    case 2 : 
                      switch(S38324){
                        case 0 : 
                          if(!empty.getprestatus()){//sysj\conveyor_controller.sysj line: 644, column: 14
                            S38324=1;
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          else {
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(request.getprestatus()){//sysj\conveyor_controller.sysj line: 645, column: 14
                            System.out.println("New request");//sysj\conveyor_controller.sysj line: 646, column: 8
                            S38324=2;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 648, column: 9
                            currsigs.addElement(armDest);
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          else {
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          break;
                        
                        case 2 : 
                          if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 647, column: 14
                            System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 650, column: 8
                            S38324=3;
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 653, column: 9
                            currsigs.addElement(pusherExtend);
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          else {
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 648, column: 9
                            currsigs.addElement(armDest);
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          break;
                        
                        case 3 : 
                          if(pusherExtended.getprestatus()){//sysj\conveyor_controller.sysj line: 652, column: 14
                            System.out.println("Pusher extended");//sysj\conveyor_controller.sysj line: 655, column: 8
                            S38324=4;
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 653, column: 9
                            currsigs.addElement(pusherExtend);
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          break;
                        
                        case 4 : 
                          if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 656, column: 14
                            System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 657, column: 8
                            S38324=5;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 660, column: 9
                            currsigs.addElement(armSource);
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          else {
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          break;
                        
                        case 5 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 659, column: 14
                            System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 662, column: 8
                            S38324=6;
                            thread47705(tdone,ends);
                            thread47706(tdone,ends);
                            int biggest47707 = 0;
                            if(ends[83]>=biggest47707){
                              biggest47707=ends[83];
                            }
                            if(ends[84]>=biggest47707){
                              biggest47707=ends[84];
                            }
                            if(biggest47707 == 1){
                              active[82]=1;
                              ends[82]=1;
                              tdone[82]=1;
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 660, column: 9
                            currsigs.addElement(armSource);
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          break;
                        
                        case 6 : 
                          thread47708(tdone,ends);
                          thread47709(tdone,ends);
                          int biggest47710 = 0;
                          if(ends[83]>=biggest47710){
                            biggest47710=ends[83];
                          }
                          if(ends[84]>=biggest47710){
                            biggest47710=ends[84];
                          }
                          if(biggest47710 == 1){
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          if(biggest47710 == 2){
                            ends[82]=2;
                            ;//sysj\conveyor_controller.sysj line: 664, column: 8
                            S38324=7;
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          //FINXME code
                          if(biggest47710 == 0){
                            S38324=7;
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          break;
                        
                        case 7 : 
                          if(!WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 680, column: 14
                            S38324=8;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 683, column: 9
                            currsigs.addElement(armSource);
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          else {
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          break;
                        
                        case 8 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 682, column: 14
                            System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 685, column: 8
                            S38324=0;
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 683, column: 9
                            currsigs.addElement(armSource);
                            active[82]=1;
                            ends[82]=1;
                            tdone[82]=1;
                          }
                          break;
                        
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S38772=1;
                System.out.println("entering manual");//sysj\conveyor_controller.sysj line: 692, column: 6
                S38772=2;
                thread47711(tdone,ends);
                thread47712(tdone,ends);
                thread47713(tdone,ends);
                thread47714(tdone,ends);
                int biggest47715 = 0;
                if(ends[85]>=biggest47715){
                  biggest47715=ends[85];
                }
                if(ends[86]>=biggest47715){
                  biggest47715=ends[86];
                }
                if(ends[87]>=biggest47715){
                  biggest47715=ends[87];
                }
                if(ends[88]>=biggest47715){
                  biggest47715=ends[88];
                }
                if(biggest47715 == 1){
                  active[82]=1;
                  ends[82]=1;
                  tdone[82]=1;
                }
                break;
              
              case 2 : 
                if(autoMode_81.getprestatus()){//sysj\conveyor_controller.sysj line: 693, column: 12
                  S38772=0;
                  System.out.println("*Capper - entering auto");//sysj\conveyor_controller.sysj line: 635, column: 7
                  S38318=0;
                  armDest.setPresent();//sysj\conveyor_controller.sysj line: 637, column: 8
                  currsigs.addElement(armDest);
                  active[82]=1;
                  ends[82]=1;
                  tdone[82]=1;
                }
                else {
                  thread47716(tdone,ends);
                  thread47717(tdone,ends);
                  thread47718(tdone,ends);
                  thread47719(tdone,ends);
                  int biggest47720 = 0;
                  if(ends[85]>=biggest47720){
                    biggest47720=ends[85];
                  }
                  if(ends[86]>=biggest47720){
                    biggest47720=ends[86];
                  }
                  if(ends[87]>=biggest47720){
                    biggest47720=ends[87];
                  }
                  if(ends[88]>=biggest47720){
                    biggest47720=ends[88];
                  }
                  if(biggest47720 == 1){
                    active[82]=1;
                    ends[82]=1;
                    tdone[82]=1;
                  }
                  //FINXME code
                  if(biggest47720 == 0){
                    S38772=0;
                    System.out.println("*Capper - entering auto");//sysj\conveyor_controller.sysj line: 635, column: 7
                    S38318=0;
                    armDest.setPresent();//sysj\conveyor_controller.sysj line: 637, column: 8
                    currsigs.addElement(armDest);
                    active[82]=1;
                    ends[82]=1;
                    tdone[82]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47702(int [] tdone, int [] ends){
        S46892=1;
    S46891=0;
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread47701(int [] tdone, int [] ends){
        S46871=1;
    S46870=0;
    S38294=0;
    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 632, column: 5
      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 632, column: 5
      S38294=1;
      active[82]=1;
      ends[82]=1;
      tdone[82]=1;
    }
    else {
      S38289=0;
      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 632, column: 5
        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 632, column: 5
        S38289=1;
        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 632, column: 5
          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 632, column: 5
          ends[82]=2;
          ;//sysj\conveyor_controller.sysj line: 632, column: 5
          S46870=1;
          S38772=0;
          System.out.println("*Capper - entering auto");//sysj\conveyor_controller.sysj line: 635, column: 7
          S38318=0;
          armDest.setPresent();//sysj\conveyor_controller.sysj line: 637, column: 8
          currsigs.addElement(armDest);
          active[82]=1;
          ends[82]=1;
          tdone[82]=1;
        }
        else {
          active[82]=1;
          ends[82]=1;
          tdone[82]=1;
        }
      }
      else {
        active[82]=1;
        ends[82]=1;
        tdone[82]=1;
      }
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S46894){
        case 0 : 
          S46894=0;
          break RUN;
        
        case 1 : 
          S46894=2;
          S46894=2;
          manualMode_81.setClear();//sysj\conveyor_controller.sysj line: 630, column: 4
          autoMode_81.setClear();//sysj\conveyor_controller.sysj line: 630, column: 4
          thread47701(tdone,ends);
          thread47702(tdone,ends);
          int biggest47703 = 0;
          if(ends[82]>=biggest47703){
            biggest47703=ends[82];
          }
          if(ends[89]>=biggest47703){
            biggest47703=ends[89];
          }
          if(biggest47703 == 1){
            active[81]=1;
            ends[81]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_81.setClear();//sysj\conveyor_controller.sysj line: 630, column: 4
          autoMode_81.setClear();//sysj\conveyor_controller.sysj line: 630, column: 4
          thread47704(tdone,ends);
          thread47721(tdone,ends);
          int biggest47722 = 0;
          if(ends[82]>=biggest47722){
            biggest47722=ends[82];
          }
          if(ends[89]>=biggest47722){
            biggest47722=ends[89];
          }
          if(biggest47722 == 1){
            active[81]=1;
            ends[81]=1;
            break RUN;
          }
          //FINXME code
          if(biggest47722 == 0){
            S46894=0;
            active[81]=0;
            ends[81]=0;
            S46894=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    manualMode_81 = new Signal();
    autoMode_81 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[81] != 0){
      int index = 81;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[81]!=0 || suspended[81]!=0 || active[81]!=1);
      else{
        if(!df){
          lidLoaderReady_o.gethook();
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      manualMode_81.setpreclear();
      autoMode_81.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      manualMode_81.setClear();
      autoMode_81.setClear();
      lidLoaderReady_o.sethook();
      if(paused[81]!=0 || suspended[81]!=0 || active[81]!=1);
      else{
        lidLoaderReady_o.gethook();
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[81] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
