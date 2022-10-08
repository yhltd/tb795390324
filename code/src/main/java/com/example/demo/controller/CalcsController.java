package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.*;
import com.example.demo.util.GsonUtil;
import com.example.demo.util.ResultInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/calcs")
public class CalcsController {
    @Autowired
    CalcsService calcsService;
    @Autowired
    InputService inputService;
    @Autowired
    Input2Service input2Service;
    @Autowired
    Input3Service input3Service;
    @Autowired
    Input4Service input4Service;
    @Autowired
    Input5Service input5Service;
    @Autowired
    Input6Service input6Service;
    @Autowired
    Input7Service input7Service;
    @Autowired
    TrackService trackService;
    @Autowired
    Track2Service track2Service;
    @Autowired
    LeanService leanService;
    @Autowired
    Lean2Service lean2Service;
    @Autowired
    Lean3Service lean3Service;

    /**
     * 查询所有
     *
     * @return ResultInfo
     */
    @RequestMapping("/getList")
    public ResultInfo getList() {
        try {
            List<Calcs> list = calcsService.getList();
            if (list.size() > 0) {

                List<Input> input = inputService.getList();
                List<Input2> input2 = input2Service.getList();
                List<Input3> input3 = input3Service.getList();
                List<Input4> input4 = input4Service.getList();
                List<Input5> input5 = input5Service.getList();
                List<Input6> input6 = input6Service.getList();
                List<Input7> input7 = input7Service.getList();

                List<Track> track = trackService.getList();

                List<Lean> lean = leanService.getList();
                List<Lean2> lean2 = lean2Service.getList();
                List<Lean3> lean3 = lean3Service.getList();


                Map input_an_at = new HashMap();
                Map input_ah_ai = new HashMap();
                Map track_a_b = new HashMap();
                Map track_a_c = new HashMap();
                Map lean_au_av = new HashMap();
                Map input_g_k = new HashMap();
                Map input_g_i = new HashMap();
                Map input_a_b = new HashMap();

                for (int i = 0; i < 20; i++) {
                    input_an_at.put(input7.get(i).getAN(), input7.get(i).getAT());
                }
                for (int i = 0; i < 33; i++) {
                    input_ah_ai.put(input7.get(i).getAH(), input7.get(i).getAI());
                }
                for (int i = 0; i < track.size(); i++) {
                    track_a_b.put(track.get(i).getKong(), track.get(i).getTradm());
                    track_a_c.put(track.get(i).getKong(), track.get(i).getBankanglerad());
                }
                for (int i = 0; i < lean2.size(); i++) {
                    lean_au_av.put(lean2.get(i).getAU(), lean2.get(i).getAV());
                }
                for (int i = 0; i < input5.size(); i++) {
                    input_g_k.put(input5.get(i).getG(), input5.get(i).getK());
                    input_g_i.put(input5.get(i).getG(), input5.get(i).getI());
                }
                for (int i = 11; i < input7.size(); i++) {
                    input_a_b.put(input7.get(i).getA(), input7.get(i).getB());
                }


                for (int i = 0; i < list.size(); i++) {
                    list.get(i).setQ("1");

                    list.get(i).setB(input2.get(0).getB());
                    list.get(i).setC(input7.get(0).getAN());
                    list.get(i).setD(input.get(0).getB());
                    list.get(i).setE(input.get(1).getB());
                    list.get(i).setF(input.get(2).getB());
                    list.get(i).setG(input.get(3).getB());
                    double t = Double.parseDouble(list.get(i).getB());
                    if (input2.get(17).equals("male")) {
                        list.get(i).setI((Double.parseDouble(input6.get(4).getG()) * Double.parseDouble(input6.get(3).getG())) + (-0.00000209 * Math.pow(t, 6) + 0.00046936 * Math.pow(t, 5) - 0.04095257 * Math.pow(t, 4) + 1.75290819 * Math.pow(t, 3) - 37.78916029 * Math.pow(t, 2) + 353.56482552 * t + 0.56673857) + "");
                    } else {
                        list.get(i).setI((Double.parseDouble(input6.get(4).getG()) * Double.parseDouble(input6.get(3).getG())) + (0.00001005 * Math.pow(t, 6) - 0.00094366 * Math.pow(t, 5) + 0.0219983 * Math.pow(t, 4) + 0.38272972 * Math.pow(t, 3) - 21.91542658 * Math.pow(t, 2) + 254.90139424 * t - 5) + "");
                    }
                    list.get(i).setJ(list.get(i).getC().substring(list.get(i).getC().length() - 1));
                    list.get(i).setK(input2.get(1).getB());
                    list.get(i).setL((Double.parseDouble(input2.get(1).getB()) * Double.parseDouble(input2.get(0).getB())) + "");
                    list.get(i).setM(list.get(i).getL());
                    list.get(i).setN(list.get(i).getK());
                    list.get(i).setO(Double.parseDouble(list.get(i).getB()) * Double.parseDouble(list.get(i).getK()) + "");
                    list.get(i).setP(input_an_at.get(list.get(i).getC()).toString());
                    list.get(i).setR(input_ah_ai.get("1").toString());
                    //
                    list.get(i).setS("FALSE");
                    list.get(i).setT("");
                    list.get(i).setU(Double.parseDouble(list.get(i).getO()) - (Double.parseDouble(list.get(i).getR()) - (Double.parseDouble(input2.get(2).getB()) / 0.99499)) + "");
                    BigDecimal bd = new BigDecimal(Double.parseDouble(list.get(i).getU()) / (Double.parseDouble(input2.get(2).getB()) / 0.99499) + "");
                    list.get(i).setV(bd.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue()+"");
                    list.get(i).setW(track_a_b.get(list.get(i).getV()).toString());
                    list.get(i).setX(track_a_c.get(list.get(i).getV()).toString());
                    list.get(i).setY("0");
                    list.get(i).setZ(input_g_k.get(list.get(i).getD()).toString());
                    list.get(i).setAA(Double.parseDouble(input_g_i.get(list.get(i).getD()).toString()) + Double.parseDouble(input6.get(1).getG()) + "");
                    list.get(i).setAB("0.49");
                    list.get(i).setAC(Math.atan(Double.parseDouble(list.get(i).getV()) * Double.parseDouble(list.get(i).getV()) * (Double.parseDouble(list.get(i).getW()) - Double.parseDouble(list.get(i).getZ()) * Math.cos(Double.parseDouble(list.get(i).getY()))) / (9.81 * Double.parseDouble(list.get(i).getW()) * Double.parseDouble(list.get(i).getW()))) + "");
                    list.get(i).setAD(Math.atan(Double.parseDouble(list.get(i).getV()) * Double.parseDouble(list.get(i).getV()) * (Double.parseDouble(list.get(i).getW()) - Double.parseDouble(list.get(i).getZ()) * Math.sin(Double.parseDouble(list.get(i).getAC()))) / (9.81 * Double.parseDouble(list.get(i).getW()) * Double.parseDouble(list.get(i).getW()))) + "");
                    list.get(i).setAE(Math.atan(Double.parseDouble(list.get(i).getV()) * Double.parseDouble(list.get(i).getV()) * (Double.parseDouble(list.get(i).getW()) - Double.parseDouble(list.get(i).getZ()) * Math.sin(Double.parseDouble(list.get(i).getAD()))) / (9.81 * Double.parseDouble(list.get(i).getW()) * Double.parseDouble(list.get(i).getW()))) + "");
                    list.get(i).setAF(Math.toDegrees(Double.parseDouble(list.get(i).getAE())) + "");
                    list.get(i).setAG((90 - Double.parseDouble(list.get(i).getAF())) + "");
                    System.out.println(Math.sin(Double.parseDouble(list.get(i).getAE())));
                    list.get(i).setAH(Double.parseDouble(list.get(i).getW()) - (Double.parseDouble(list.get(i).getZ()) * Math.sin(Double.parseDouble(list.get(i).getAE()))) + "");
                    list.get(i).setAI(Double.parseDouble(list.get(i).getN()) / Double.parseDouble(list.get(i).getW()) + "");
                    list.get(i).setAJ(Double.parseDouble(list.get(i).getAA()) * ((Double.parseDouble(list.get(i).getK()) * Double.parseDouble(list.get(i).getK()) / Double.parseDouble(list.get(i).getAH())) * Math.sin(Math.toRadians(Double.parseDouble(list.get(i).getAF())))) + (Double.parseDouble(list.get(i).getAA()) * 9.81 * Math.cos(Math.toRadians(Double.parseDouble(list.get(i).getAF())))) + "");

                    list.get(i).setAQ(90 - Math.toDegrees(Double.parseDouble(list.get(i).getX())) + "");
                    list.get(i).setAR(Math.abs(Double.parseDouble(list.get(i).getAG()) - Double.parseDouble(list.get(i).getAQ())) + "");

                    list.get(i).setAK(Double.parseDouble(list.get(i).getAJ()) * (1 - Double.parseDouble(input2.get(6).getB())) + "");
                    list.get(i).setAL(Double.parseDouble(list.get(i).getAJ()) - Double.parseDouble(list.get(i).getAK()) + "");
                    list.get(i).setAM(Double.parseDouble(list.get(i).getAK()) * (Double.parseDouble(input2.get(7).getB()) + Double.parseDouble(input6.get(2).getG())) * (1 + (Double.parseDouble(input2.get(9).getB()) * Double.parseDouble(list.get(i).getAR()))) + "");
                    list.get(i).setAN(Double.parseDouble(list.get(i).getAL()) * (Double.parseDouble(input2.get(7).getB()) + Double.parseDouble(input6.get(2).getG())) * (1 + (Double.parseDouble(input2.get(9).getB()) * Double.parseDouble(list.get(i).getAR()))) + "");
                    list.get(i).setAO(Double.parseDouble(list.get(i).getAM()) * Double.parseDouble(list.get(i).getAN()) + "");
                    list.get(i).setAP(Double.parseDouble(list.get(i).getAN()) * Double.parseDouble(list.get(i).getAN()) + "");

                    list.get(i).setAS(input_a_b.get("1").toString());

                    list.get(i).setAT(Double.parseDouble(list.get(i).getAO()) + Double.parseDouble(list.get(i).getAP()) + "");
                    list.get(i).setAU(Double.parseDouble(list.get(i).getAB()) * 0.5 * Double.parseDouble(input2.get(2).getB()) * Double.parseDouble(list.get(i).getK()) * (Double.parseDouble(list.get(i).getK()) - Double.parseDouble(list.get(i).getAS())) * (Double.parseDouble(list.get(i).getK()) - Double.parseDouble(list.get(i).getAS())) + "");
                    list.get(i).setAV(Double.parseDouble(list.get(i).getAI()) - Double.parseDouble(list.get(i).getAT()) - Double.parseDouble(list.get(i).getAU()) + "");
                    list.get(i).setAW(Double.parseDouble(list.get(i).getAV()) / Double.parseDouble(list.get(i).getK()) + "");
                    list.get(i).setAX(Double.parseDouble(list.get(i).getAW()) / (Double.parseDouble(list.get(i).getAA()) + (Double.parseDouble(input2.get(11).getB()) / Math.pow(Double.parseDouble(input2.get(13).getB()), 2)) + (Double.parseDouble(input2.get(12).getB()) / Math.pow(Double.parseDouble(input2.get(13).getB()), 2))) + "");
                    list.get(i).setAY(Double.parseDouble(list.get(i).getI()) * Double.parseDouble(input2.get(i).getB()) + "");
                    list.get(i).setAZ(list.get(i).getAY());
                    list.get(i).setBA("FALSE");
                    list.get(i).setBB(Double.parseDouble(list.get(i).getI()) / Double.parseDouble(list.get(i).getAB()) + "");
                    list.get(i).setBC(Double.parseDouble(list.get(i).getAX()) * Double.parseDouble(list.get(i).getAA()) * Double.parseDouble(list.get(i).getK()) + "");
                    list.get(i).setBD("");
                    list.get(i).setBE("0");
                    list.get(i).setBF(Double.parseDouble(list.get(i).getAT()) * Double.parseDouble(input_g_i.get(list.get(i).getE()).toString()) / Double.parseDouble(list.get(i).getAA()) + "");
                    list.get(i).setBG(Double.parseDouble(input_g_i.get(list.get(i).getE()).toString()) * Double.parseDouble(list.get(i).getAX()) * Double.parseDouble(list.get(i).getK()) + "");
                    list.get(i).setBH((Double.parseDouble(list.get(i).getBE()) + Double.parseDouble(list.get(i).getBF()) + Double.parseDouble(list.get(i).getBG())) / Double.parseDouble(input2.get(10).getB()) + "");
                    list.get(i).setBI(Double.parseDouble(list.get(i).getBH()) * Double.parseDouble(input2.get(0).getB()) + "");
                    list.get(i).setBJ("0");
                    list.get(i).setBK(Double.parseDouble(list.get(i).getAT()) * Double.parseDouble(input_g_i.get(list.get(i).getF()).toString()) / Double.parseDouble(list.get(i).getAA()) + "");
                    list.get(i).setBL(Double.parseDouble(input_g_i.get(list.get(i).getF()).toString()) * Double.parseDouble(list.get(i).getAX()) * Double.parseDouble(list.get(i).getK()) + "");
                    list.get(i).setBM((Double.parseDouble(list.get(i).getBJ()) + Double.parseDouble(list.get(i).getBJ()) + Double.parseDouble(list.get(i).getBL())) / Double.parseDouble(input2.get(10).getB()) + "");
                    list.get(i).setBN(Double.parseDouble(list.get(i).getBM()) * Double.parseDouble(input2.get(0).getB()) + "");
                    list.get(i).setBO("0");
                    list.get(i).setBP(Double.parseDouble(list.get(i).getAT()) * Double.parseDouble(input_g_i.get(list.get(i).getG()).toString()) / Double.parseDouble(list.get(i).getAA()) + "");
                    list.get(i).setBQ(Double.parseDouble(input_g_i.get(list.get(i).getG()).toString()) * Double.parseDouble(list.get(i).getAX()) * Double.parseDouble(list.get(i).getK()) + "");
                    list.get(i).setBR((Double.parseDouble(list.get(i).getBO()) + Double.parseDouble(list.get(i).getBP()) + Double.parseDouble(list.get(i).getBQ())) / Double.parseDouble(input2.get(10).getB()) + "");
                    list.get(i).setBS(Double.parseDouble(list.get(i).getBR()) * Double.parseDouble(input2.get(0).getB()) + "");
                    list.get(i).setBT(list.get(i).getI());
                    list.get(i).setBU(Double.parseDouble(list.get(i).getBT()) * Double.parseDouble(input2.get(0).getB()) + "");
                    list.get(i).setBV(list.get(i).getBU());
                    list.get(i).setBW("0");
                    list.get(i).setBX(list.get(i).getBW());
                    if (i + 1 < 5.0 / Double.parseDouble(input2.get(0).getB())) {
                        list.get(i).setBY("FALSE");
                    } else {
                        list.get(i).setBY("TRUE");
                    }
                    list.get(i).setBZ("0");
                    if (i + 1 < 60.0 / Double.parseDouble(input2.get(0).getB())) {
                        list.get(i).setCA("FALSE");
                    } else {
                        list.get(i).setCA("TRUE");
                    }
                    list.get(i).setCB("0");
                    if (i + 1 < 180.0 / Double.parseDouble(input2.get(0).getB())) {
                        list.get(i).setCC("FALSE");
                    } else {
                        list.get(i).setCC("TRUE");
                    }
                    list.get(i).setCD("0");
                    list.get(i).setCE(list.get(i).getI());
                    list.get(i).setCF(Double.parseDouble(list.get(i).getCE()) * Double.parseDouble(input2.get(0).getB()) + "");
                    list.get(i).setCG(list.get(i).getCF());
                    list.get(i).setCH("0");
                    list.get(i).setCI(list.get(i).getCH());
                    list.get(i).setCJ(list.get(i).getBY());
                    list.get(i).setCK("0");
                    list.get(i).setCL(list.get(i).getCA());
                    list.get(i).setCM("0");
                    list.get(i).setCN(list.get(i).getCC());
                    list.get(i).setCO("0");
                    list.get(i).setCP(list.get(i).getI());
                    list.get(i).setCQ(Double.parseDouble(list.get(i).getCP()) * Double.parseDouble(input2.get(0).getB()) + "");
                    list.get(i).setCR(list.get(i).getCQ());
                    list.get(i).setCS("0");
                    list.get(i).setCT(list.get(i).getCS());
                    list.get(i).setCU(list.get(i).getBY());
                    list.get(i).setCV("0");
                    list.get(i).setCW(list.get(i).getCA());
                    list.get(i).setCX("0");
                    list.get(i).setCY(list.get(i).getCC());
                    list.get(i).setCZ("0");
                    list.get(i).setDA(list.get(i).getI());
                    list.get(i).setDB(Double.parseDouble(list.get(i).getDA()) * Double.parseDouble(input2.get(0).getB()) + "");
                    list.get(i).setDA(list.get(i).getDB());
                    list.get(i).setDD("0");
                    list.get(i).setDE(list.get(i).getDD());
                    list.get(i).setDF(list.get(i).getBY());
                    list.get(i).setDG("0");
                    list.get(i).setDH(list.get(i).getCA());
                    list.get(i).setDI("0");
                    list.get(i).setDJ(list.get(i).getCC());
                    list.get(i).setDK("0");
                    list.get(i).setH(list.get(i).getO());
                }
            }
            return ResultInfo.success("获取成功", list);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取失败：{}", e.getMessage());
            return ResultInfo.error("错误!");
        }
    }

    /**
     * 添加一行
     */
    @RequestMapping("/add")
    public ResultInfo add() {
        Calcs calcs = new Calcs();
        calcs.setKong("");
        try {
            if (calcsService.add(calcs)) {
                return ResultInfo.success("添加成功", calcs);
            } else {
                return ResultInfo.success("添加失败", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("添加失败：{}", e.getMessage());
            log.error("参数：{}", calcs);
            return ResultInfo.error("添加失败");
        }
    }

    /**
     * 删除
     *
     * @return ResultInfo
     */
    @RequestMapping("/delete")
    public ResultInfo delete(@RequestBody HashMap map) {
        GsonUtil gsonUtil = new GsonUtil(GsonUtil.toJson(map));
        List<Integer> idList = GsonUtil.toList(gsonUtil.get("idList"), Integer.class);
        try {
            if (calcsService.delete(idList)) {
                return ResultInfo.success("删除成功", idList);
            } else {
                return ResultInfo.success("删除失败", idList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("删除失败：{}", e.getMessage());
            log.error("参数：{}", idList);
            return ResultInfo.error("删除失败");
        }
    }
}
