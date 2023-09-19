package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0812;
import com.github.catvod.parser.C0814;
import com.github.catvod.parser.C0815;
import com.github.catvod.parser.C0816;
import com.github.catvod.parser.C0817;
import com.github.catvod.parser.C0819;
import com.github.catvod.parser.C0821;
import com.github.catvod.parser.C0822;
import com.github.catvod.spider.merge.C0859;
import com.github.catvod.spider.merge.C0860;
import com.github.catvod.spider.merge.C0861;
import com.github.catvod.spider.merge.C0862;
import com.github.catvod.spider.merge.C0863;
import com.github.catvod.spider.merge.C0864;
import com.github.catvod.spider.merge.C0865;
import com.github.catvod.spider.merge.p000aD.C0829;
import com.github.catvod.spider.merge.p000aD.C0830;
import com.github.catvod.spider.merge.p000aD.C0831;
import com.github.catvod.spider.merge.p000aD.C0832;
import com.github.catvod.spider.merge.p000aD.C0834;
import com.github.catvod.spider.merge.p000aD.C0835;
import com.github.catvod.spider.merge.p000aD.C0836;
import com.github.catvod.spider.merge.p000aD.C0837;
import com.github.catvod.spider.merge.p000aD.C0838;
import com.github.catvod.spider.merge.p001aQ.C0839;
import com.github.catvod.spider.merge.p001aQ.C0840;
import com.github.catvod.spider.merge.p001aQ.C0841;
import com.github.catvod.spider.merge.p001aQ.C0842;
import com.github.catvod.spider.merge.p001aQ.C0849;
import com.github.catvod.spider.merge.p001aQ.C0851;
import com.github.catvod.spider.merge.p001aQ.C0854;
import com.github.catvod.spider.merge.p001aQ.C0855;
import com.github.catvod.spider.merge.p001aQ.C0856;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Bili extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f1746short = {1545, 1556, 1561, 1372, 1344, 1344, 1348, 1351, 1294, 1307, 1307, 1365, 1348, 1373, 1306, 1366, 1373, 1368, 1373, 1366, 1373, 1368, 1373, 1306, 1367, 1371, 1369, 1307, 1356, 1307, 1347, 1361, 1366, 1305, 1373, 1370, 1344, 1361, 1350, 1362, 1365, 1367, 1361, 1307, 1351, 1361, 1365, 1350, 1367, 1372, 1307, 1344, 1357, 1348, 1361, 1291, 1351, 1361, 1365, 1350, 1367, 1372, 1387, 1344, 1357, 1348, 1361, 1289, 1346, 1373, 1360, 1361, 1371, 1298, 1375, 1361, 1357, 1347, 1371, 1350, 1360, 1289, 1831, 1800, 536, 590, 607, 601, 603, 515, 1925, 1920, 1941, 1920, 2561, 2582, 2560, 2566, 2591, 2567, 2664, 2673, 2683, 3071, 3071, 625, 621, 621, 617, 618, 547, 578, 603, 592, 619, 605, 592, 2859, 2879, 2848, 2861, 1301, 1288, 1301, 1293, 1284, 1599, 1574, 1581, 1558, 1575, 1576, 1572, 1580, 1062, 1087, 1076, 1039, 1056, 1081, 1075, 1556, 1541, 1538, 1553, 1540, 1561, 1567, 1566, 445, 22549, -24948, 2086, 2111, 2100, 2063, 2082, 2101, 2109, 2097, 2082, 2107, 2083, 1997, 2012, 2010, 2008, 2390, 2375, 2369, 2371, 2373, 2377, 2387, 2376, 2386, 3081, 3084, 3080, 3084, 3089, 2937, 2914, 2937, 2924, 2913, 1040, 1045, 1039, 1032, 2264, 1654, 2364, 2361, 2348, 2361, 2629, 2649, 2649, 2653, 2654, 2583, 2562, 2562, 2636, 2653, 2628, 2563, 2639, 2628, 2625, 2628, 2639, 2628, 2625, 2628, 2563, 2638, 2626, 2624, 2562, 2645, 2562, 2650, 2632, 2639, 2560, 2628, 2627, 2649, 2632, 2655, 2635, 2636, 2638, 2632, 2562, 2651, 2628, 2632, 2650, 2578, 2639, 2651, 2628, 2633, 2576, 3177, 3169, 3180, 2602, 2614, 2614, 2610, 2609, 2680, 2669, 2669, 2595, 2610, 2603, 2668, 2592, 2603, 2606, 2603, 2592, 2603, 2606, 2603, 2668, 2593, 2605, 2607, 2669, 2618, 2669, 2613, 2599, 2592, 2671, 2603, 2604, 2614, 2599, 2608, 2596, 2595, 2593, 2599, 2669, 2612, 2603, 2599, 2613, 2685, 2595, 2603, 2598, 2687, 1099, 1106, 1113, 1122, 1108, 1113, 1133, 1136, 1133, 1141, 1148, 1355, 1362, 1369, 1378, 1363, 1372, 1360, 1368, 424, 433, 443, 1032, 1041, 1050, 1057, 1038, 1047, 1053, 3179, 3185, 3198, 3186, 3194, 2234, 2231, 2238, 2219, 2193, 2208, 2223, 2211, 2219, 2861, 2868, 2879, 2820, 2850, 2878, 2874, 2857, 281, 256, 267, 304, 270, 285, 266, 270, 3009, 3024, 3031, 3012, 3025, 3020, 3018, 3019, 20852, -26643, 3042, 3067, 3056, 3019, 3046, 3057, 3065, 3061, 3046, 3071, 3047, 2753, 2776, 2771, 2792, 2774, 2772, 2755, 2776, 2757, 2151, 2174, 2165, 2126, 2165, 2168, 2147, 2164, 2162, 2149, 2174, 2147, 2488, 2489, 2479, 2495, 3147, 3154, 3161, 3170, 3166, 3154, 3155, 3145, 3160, 3155, 3145, 2611, 2602, 2593, 2586, 2613, 2601, 2596, 2620, 2586, 2595, 2615, 2602, 2600, 1633, 31994, 573, 556, 554, 552, 574, 339, 2454, 2439, 2452, 2450, 2676, 2687, 486, 492, 481, 1008, 1001, 994, 985, 1014, 1002, 999, 1023, 985, 1011, 1012, 1002, 2814, 2811, 2785, 2790, 1347, 1356, 1345, 1363, 1363, 1896, 1895, 1898, 1912, 1912, 1902, 1912, 737, 750, 747, 755, 738, 757, 756, 2033, 2046, 2043, 2019, 2034, 2021, 1404, 1376, 1376, 1380, 1383, 1326, 1339, 1339, 1397, 1380, 1405, 1338, 1398, 1405, 1400, 1405, 1398, 1405, 1400, 1405, 1338, 1399, 1403, 1401, 1339, 1388, 1339, 1379, 1393, 1398, 1337, 1405, 1402, 1376, 1393, 1382, 1394, 1397, 1399, 1393, 1339, 1383, 1393, 1397, 1382, 1399, 1404, 1339, 1376, 1389, 1380, 1393, 1323, 1383, 1393, 1397, 1382, 1399, 1404, 1355, 1376, 1389, 1380, 1393, 1321, 1378, 1405, 1392, 1393, 1403, 1330, 1407, 1393, 1389, 1379, 1403, 1382, 1392, 1321, 32643, 1332, 29545, 21374, -27929, 1875, 1878, 1859, 1878, 1396, 1379, 1397, 1395, 1386, 1394, 1433, 1408, 1418, 2311, 2311, 2958, 2962, 2962, 2966, 2965, 3036, 2448, 2441, 2434, 2489, 2447, 2434, 2871, 2851, 2876, 2865, 2752, 2781, 2752, 2776, 2769, 2969, 2944, 2955, 2992, 2945, 2958, 2946, 2954, 730, 707, 712, 755, 732, 709, 719, 2169, 2152, 2159, 2172, 2153, 2164, 2162, 2163, 1816, 23085, -25420, 1333, 1324, 1319, 1308, 1329, 1318, 1326, 1314, 1329, 1320, 1328, 425, 428, 438, 433, 2861, 2858, 2868, 2660, 2579, 1522, 1518, 1518, 1514, 1513, 1440, 1461, 1461, 1531, 1514, 1523, 1460, 1528, 1523, 1526, 1523, 1528, 1523, 1526, 1523, 1460, 1529, 1525, 1527, 1461, 1506, 1461, 1514, 1526, 1531, 1507, 1535, 1512, 1461, 1514, 1526, 1531, 1507, 1519, 1512, 1526, 1445, 1531, 1516, 1523, 1534, 1447, 776, 845, 839, 842, 787, 782, 922, 973, 978, 897, 909, 910, 908, 922, 986, 979, 969, 974, 983, 897, 909, 1126, 1143, 1124, 1125, 1139, 1034, 1740, 1744, 1757, 1733, 1769, 1742, 1744, 2444, 2441, 2460, 2441, 2705, 2688, 2695, 2713, 1262, 1251, 1255, 1250, 1251, 1268, 985, 896, 1008, 967, 964, 967, 976, 967, 976, 896, 920, 896, 970, 982, 982, 978, 977, 920, 909, 909, 981, 981, 981, 908, 960, 971, 974, 971, 960, 971, 974, 971, 908, 961, 973, 975, 896, 910, 896, 1015, 977, 967, 976, 911, 995, 965, 967, 972, 982, 896, 920, 896, 1007, 973, 984, 971, 974, 974, 963, 909, 919, 908, 914, 898, 906, 1007, 963, 961, 971, 972, 982, 973, 977, 970, 921, 898, 1003, 972, 982, 967, 974, 898, 1007, 963, 961, 898, 1005, 1009, 898, 1018, 898, 915, 914, 1021, 915, 919, 1021, 917, 907, 898, 995, 978, 978, 974, 967, 1013, 967, 960, 1001, 971, 982, 909, 919, 913, 917, 908, 913, 916, 898, 906, 1001, 1002, 1014, 1007, 1006, 910, 898, 974, 971, 969, 967, 898, 997, 967, 961, 969, 973, 907, 898, 993, 970, 976, 973, 975, 967, 909, 915, 914, 914, 908, 914, 908, 918, 922, 923, 916, 908, 915, 912, 917, 898, 1009, 963, 964, 963, 976, 971, 909, 919, 913, 917, 908, 913, 916, 896, 991, 1036, 1024, 1025, 1051, 1034, 1025, 1051, 1083, 1046, 1055, 1034, 2771, 2764, 2753, 2752, 2762, 2698, 2781, 2696, 2755, 2761, 2771, 949, 937, 937, 941, 942, 999, 1010, 1010, 956, 941, 948, 1011, 959, 948, 945, 948, 959, 948, 945, 948, 1011, 958, 946, 944, 1010, 933, 1010, 938, 952, 959, 1008, 948, 947, 937, 952, 943, 955, 956, 958, 952, 1010, 942, 952, 956, 943, 958, 949, 1010, 937, 932, 941, 952, 994, 942, 
    952, 956, 943, 958, 949, 898, 937, 932, 941, 952, 992, 939, 948, 953, 952, 946, 1019, 950, 952, 932, 938, 946, 943, 953, 992, 1695, 1690, 1679, 1690, 1278, 1257, 1279, 1273, 1248, 1272, 1181, 1156, 1166, 994, 994, 1701, 1721, 1721, 1725, 1726, 1783, 1185, 1208, 1203, 1160, 1214, 1203, 2320, 2308, 2331, 2326, 1887, 1858, 1887, 1863, 1870, 1005, 1012, 1023, 964, 1013, 1018, 1014, 1022, 3298, 3323, 3312, 3275, 3300, 3325, 3319, 2124, 2141, 2138, 2121, 2140, 2113, 2119, 2118, 2769, 20694, -27057, 850, 843, 832, 891, 854, 833, 841, 837, 854, 847, 855, 949, 944, 938, 941, 1385, 1359, 1369, 1358, 1297, 1405, 1371, 1369, 1362, 1352, 2634, 2664, 2685, 2670, 2667, 2667, 2662, 2600, 2610, 2601, 2615, 2599, 2607, 2634, 2662, 2660, 2670, 2665, 2675, 2664, 2676, 2671, 2620, 2599, 2638, 2665, 2675, 2658, 2667, 2599, 2634, 2662, 2660, 2599, 2632, 2644, 2599, 2655, 2599, 2614, 2615, 2648, 2614, 2610, 2648, 2608, 2606, 2599, 2630, 2679, 2679, 2667, 2658, 2640, 2658, 2661, 2636, 2670, 2675, 2600, 2610, 2612, 2608, 2601, 2612, 2609, 2599, 2607, 2636, 2639, 2643, 2634, 2635, 2603, 2599, 2667, 2670, 2668, 2658, 2599, 2624, 2658, 2660, 2668, 2664, 2606, 2599, 2628, 2671, 2677, 2664, 2666, 2658, 2600, 2622, 2614, 2601, 2615, 2601, 2611, 2611, 2608, 2613, 2601, 2614, 2614, 2611, 2599, 2644, 2662, 2657, 2662, 2677, 2670, 2600, 2610, 2612, 2608, 2601, 2612, 2609, 2575, 2563, 2563, 2567, 2565, 2569, 2974, 2953, 2954, 2965, 2968, 3023, 3009, 3018, 3018, 3018, 2066, 2062, 2062, 2058, 3143, 3184, 3187, 3184, 3175, 3184, 3175, 2286, 2290, 2290, 2294, 2293, 2236, 2217, 2217, 2279, 2294, 2287, 2216, 2276, 2287, 2282, 2287, 2276, 2287, 2282, 2287, 2216, 2277, 2281, 2283};

    /* renamed from: yq */
    protected JSONObject f33yq = null;

    public Bili() {
        int m2435 = C0841.m2435();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (m2435 > 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    System.out.println(Long.valueOf(C0821.m2016("pHf4JNiI")));
                    return;
                case 239:
                    return;
            }
            i = 1678;
        }
    }

    /* renamed from: ۟ۢۤۢۥ  reason: not valid java name and contains not printable characters */
    public static JSONObject m2119(Object obj) {
        int m2710 = C0865.m2710();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (m2710 > 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return ((Bili) obj).f33yq;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    /* renamed from: ۡۥۡۢ  reason: not valid java name and contains not printable characters */
    public static void m2120(Object obj) {
        int m2440 = C0842.m2440();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (m2440 < 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    SpiderDebug.log((Throwable) obj);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    /* renamed from: ۣۨ۟ۢ  reason: not valid java name and contains not printable characters */
    public static short[] m2121() {
        int m2388 = C0837.m2388();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (m2388 >= 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return f1746short;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    /* renamed from: ۨۤۥۥ  reason: not valid java name and contains not printable characters */
    public static HashMap m2122(Object obj, Object obj2) {
        int m2399 = C0838.m2399();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (m2399 >= 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return ((Bili) obj).m1825yq((String) obj2);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String m2360;
        String m2398 = C0838.m2398(m2121(), 0, 3, 1661);
        try {
            String m2531 = C0849.m2531(m2121(), 3, 79, 1332);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (hashMap == null) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        int m2659 = C0861.m2659(hashMap);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (m2659 <= 0) {
                                        break;
                                    } else {
                                        i2 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    boolean m2371 = C0835.m2371(hashMap, m2398);
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                if (!m2371) {
                                                    break;
                                                } else {
                                                    i3 = 48736;
                                                    continue;
                                                }
                                            case 47384:
                                                break;
                                            case 47417:
                                                int m2677 = C0862.m2677((String) C0812.m1894(hashMap, m2398));
                                                int i4 = 48767;
                                                while (true) {
                                                    i4 ^= 48784;
                                                    switch (i4) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            break;
                                                        case 76:
                                                            StringBuilder sb = new StringBuilder();
                                                            C0830.m2318(sb, m2531);
                                                            C0830.m2318(sb, (String) C0812.m1894(hashMap, m2398));
                                                            m2360 = C0834.m2360(sb);
                                                            int i5 = 48891;
                                                            while (true) {
                                                                i5 ^= 48908;
                                                                switch (i5) {
                                                                    case 22:
                                                                        break;
                                                                    case 503:
                                                                        i5 = 48922;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 239:
                                                            if (m2677 <= 0) {
                                                                break;
                                                            } else {
                                                                i4 = 48860;
                                                                continue;
                                                            }
                                                        default:
                                                            continue;
                                                    }
                                                    i4 = 48829;
                                                }
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i3 = 48705;
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            StringBuilder sb2 = new StringBuilder();
            C0830.m2318(sb2, m2531);
            C0830.m2318(sb2, str);
            m2360 = C0834.m2360(sb2);
            int i6 = 49666;
            while (true) {
                i6 ^= 49683;
                switch (i6) {
                    case 17:
                        if (hashMap == null) {
                            break;
                        } else {
                            i6 = 49759;
                            continue;
                        }
                    case 50:
                        break;
                    case 76:
                        int m26592 = C0861.m2659(hashMap);
                        int i7 = 49790;
                        while (true) {
                            i7 ^= 49807;
                            switch (i7) {
                                case 18:
                                    break;
                                case 51:
                                    break;
                                case 84:
                                    Iterator m2020 = C0822.m2020(C0812.m1902(hashMap));
                                    String str3 = m2360;
                                    while (true) {
                                        boolean m1899 = C0812.m1899(m2020);
                                        int i8 = 49914;
                                        while (true) {
                                            i8 ^= 49931;
                                            switch (i8) {
                                                case 497:
                                                    i8 = m1899 ? 50658 : 50627;
                                                case 1711:
                                                case 1736:
                                                    m2360 = str3;
                                                    break;
                                                case 1769:
                                                    String str4 = (String) C0865.m2711(m2020);
                                                    String str5 = (String) C0812.m1894(hashMap, str4);
                                                    int m26772 = C0862.m2677(str5);
                                                    int i9 = 50689;
                                                    while (true) {
                                                        i9 ^= 50706;
                                                        switch (i9) {
                                                            case 19:
                                                                i9 = m26772 > 0 ? 50782 : 50751;
                                                            case 45:
                                                                break;
                                                            case 50:
                                                            case 76:
                                                                StringBuilder sb3 = new StringBuilder();
                                                                C0830.m2318(sb3, str3);
                                                                C0830.m2318(sb3, C0885.m2937(m2121(), 82, 1, 1793));
                                                                C0830.m2318(sb3, str4);
                                                                C0830.m2318(sb3, C0868.m2742(m2121(), 83, 1, 1845));
                                                                C0830.m2318(sb3, C0856.m2603(str5));
                                                                str3 = C0834.m2360(sb3);
                                                                int i10 = 50813;
                                                                while (true) {
                                                                    i10 ^= 50830;
                                                                    switch (i10) {
                                                                        case 18:
                                                                            break;
                                                                        case 243:
                                                                            i10 = 50844;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case 241:
                                    if (m26592 <= 0) {
                                        break;
                                    } else {
                                        i7 = 49883;
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                            i7 = 49852;
                        }
                        break;
                    case 83:
                        break;
                    default:
                        continue;
                }
                i6 = 49728;
            }
            StringBuilder sb4 = new StringBuilder();
            C0830.m2318(sb4, m2360);
            C0830.m2318(sb4, C0822.m2019(m2121(), 84, 6, 574));
            C0830.m2318(sb4, str2);
            String m23602 = C0834.m2360(sb4);
            JSONObject m2696 = C0864.m2696(new JSONObject(C0838.m2396(m23602, m2122(this, m23602))), C0839.m2409(m2121(), 90, 4, 2017));
            JSONArray jSONArray = new JSONArray();
            JSONArray m1934 = C0815.m1934(m2696, C0837.m2387(m2121(), 94, 6, 2675));
            int i11 = 0;
            while (true) {
                int m2366 = C0834.m2366(m1934);
                int i12 = 51588;
                while (true) {
                    i12 ^= 51605;
                    switch (i12) {
                        case 17:
                            i12 = i11 < m2366 ? 51681 : 51650;
                        case 54:
                        case 87:
                            JSONObject jSONObject = new JSONObject();
                            int m2348 = C0832.m2348(str2);
                            C0841.m2438(jSONObject, C0868.m2742(m2121(), 163, 4, 1981), m2348);
                            int m23662 = C0834.m2366(jSONArray);
                            int i13 = 52611;
                            while (true) {
                                i13 ^= 52628;
                                switch (i13) {
                                    case 23:
                                        if (m23662 != 20) {
                                            break;
                                        } else {
                                            i13 = 52704;
                                            continue;
                                        }
                                    case 54:
                                        break;
                                    case 85:
                                        break;
                                    case 116:
                                        m2348 = 1 - (0 - m2348);
                                        break;
                                    default:
                                        continue;
                                }
                                i13 = 52673;
                            }
                            C0841.m2438(jSONObject, C0882.m2900(m2121(), 167, 9, 2342), m2348);
                            C0841.m2438(jSONObject, C0822.m2019(m2121(), 176, 5, 3173), 20);
                            C0841.m2438(jSONObject, C0851.m2551(m2121(), 181, 5, 2829), Integer.MAX_VALUE);
                            C0841.m2436(jSONObject, C0851.m2551(m2121(), 186, 4, 1148), jSONArray);
                            return C0886.m2957(jSONObject);
                        case 116:
                            JSONObject m1946 = C0816.m1946(m1934, i11);
                            JSONObject jSONObject2 = new JSONObject();
                            String m2709 = C0865.m2709(m1946, C0841.m2437(m2121(), 100, 3, 2584));
                            boolean m2694 = C0864.m2694(m2709, C0871.m2769(m2121(), 103, 2, 3024));
                            int i14 = 51712;
                            while (true) {
                                i14 ^= 51729;
                                switch (i14) {
                                    case 14:
                                    case 17:
                                        i14 = m2694 ? 51805 : 51774;
                                    case 47:
                                        break;
                                    case 76:
                                        StringBuilder sb5 = new StringBuilder();
                                        C0830.m2318(sb5, C0838.m2398(m2121(), 105, 6, 537));
                                        C0830.m2318(sb5, m2709);
                                        m2709 = C0834.m2360(sb5);
                                        break;
                                }
                            }
                            C0841.m2436(jSONObject2, C0837.m2387(m2121(), 111, 6, 564), C0865.m2709(m1946, C0888.m2982(m2121(), 117, 4, 2889)));
                            C0841.m2436(jSONObject2, C0849.m2531(m2121(), 126, 8, 1609), C0886.m2953(C0837.m2386(C0865.m2709(m1946, C0862.m2671(m2121(), 121, 5, 1377)))));
                            C0841.m2436(jSONObject2, C0869.m2753(m2121(), 134, 7, 1104), m2709);
                            String str6 = C0815.m1937(C0865.m2709(m1946, C0861.m2661(m2121(), 141, 8, 1648)), C0840.m2424(m2121(), 149, 1, 391))[0];
                            StringBuilder sb6 = new StringBuilder();
                            C0830.m2318(sb6, str6);
                            C0830.m2318(sb6, C0812.m1893(m2121(), 150, 2, 2579));
                            C0841.m2436(jSONObject2, C0835.m2368(m2121(), 152, 11, 2128), C0834.m2360(sb6));
                            C0860.m2647(jSONArray, jSONObject2);
                            int i15 = i11 + 1;
                            int i16 = 51836;
                            while (true) {
                                i16 ^= 51853;
                                switch (i16) {
                                    case 241:
                                        i16 = 52518;
                                    case 1963:
                                        break;
                                }
                            }
                            i11 = i15;
                            break;
                    }
                }
            }
        } catch (Exception e) {
            C0888.m2974(e);
            return null;
        }
    }

    public String detailContent(List<String> list) {
        String m2368 = C0835.m2368(m2121(), 190, 1, 2183);
        String m1957 = C0817.m1957(m2121(), 191, 1, 1618);
        String m2649 = C0860.m2649(m2121(), 192, 4, 2392);
        String m2006 = C0821.m2006();
        int i = 0;
        try {
            String str = (String) C0886.m2954(list, 0);
            StringBuilder sb = new StringBuilder();
            C0830.m2318(sb, C0854.m2591(m2121(), 196, 51, 2605));
            C0830.m2318(sb, str);
            long m2750 = C0868.m2750(C0864.m2696(new JSONObject(C0838.m2396(C0834.m2360(sb), null)), m2649), C0860.m2649(m2121(), 247, 3, 3080));
            StringBuilder sb2 = new StringBuilder();
            C0841.m2432(sb2, m2750);
            C0830.m2318(sb2, m2006);
            String m2360 = C0834.m2360(sb2);
            StringBuilder sb3 = new StringBuilder();
            C0830.m2318(sb3, C0849.m2531(m2121(), 250, 50, 2626));
            C0830.m2318(sb3, m2360);
            String m23602 = C0834.m2360(sb3);
            JSONObject m2696 = C0864.m2696(new JSONObject(C0838.m2396(m23602, m2122(this, m23602))), m2649);
            JSONObject jSONObject = new JSONObject();
            C0841.m2436(jSONObject, C0812.m1893(m2121(), 300, 6, 1085), str);
            C0841.m2436(jSONObject, C0822.m2019(m2121(), 311, 8, 1341), C0865.m2709(m2696, C0856.m2610(m2121(), 306, 5, 1049)));
            C0841.m2436(jSONObject, C0859.m2637(m2121(), 322, 7, 1150), C0865.m2709(m2696, C0882.m2900(m2121(), 319, 3, 472)));
            C0841.m2436(jSONObject, C0841.m2437(m2121(), 334, 9, 2254), C0865.m2709(m2696, C0841.m2437(m2121(), 329, 5, 3103)));
            C0841.m2436(jSONObject, C0851.m2551(m2121(), 343, 8, 2907), m2006);
            C0841.m2436(jSONObject, C0860.m2649(m2121(), 351, 8, 367), m2006);
            StringBuilder sb4 = new StringBuilder();
            C0841.m2432(sb4, C0868.m2750(m2696, C0830.m2321(m2121(), 359, 8, 2981)) / 60);
            C0830.m2318(sb4, C0863.m2688(m2121(), 367, 2, 882));
            C0841.m2436(jSONObject, C0868.m2742(m2121(), 369, 11, 2964), C0834.m2360(sb4));
            C0841.m2436(jSONObject, C0819.m1986(m2121(), 380, 9, 2743), m2006);
            C0841.m2436(jSONObject, C0831.m2332(m2121(), 389, 12, 2065), m2006);
            C0841.m2436(jSONObject, C0836.m2374(m2121(), 405, 11, 3133), C0865.m2709(m2696, C0869.m2753(m2121(), 401, 4, 2524)));
            C0841.m2436(jSONObject, C0814.m1917(m2121(), 416, 13, 2629), C0859.m2637(m2121(), 429, 2, 1571));
            ArrayList arrayList = new ArrayList();
            JSONArray m1934 = C0815.m1934(m2696, C0859.m2637(m2121(), 431, 5, 589));
            while (true) {
                int m2366 = C0834.m2366(m1934);
                String m2437 = C0841.m2437(m2121(), 436, 1, 368);
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < m2366 ? 1709 : 1678;
                        case 204:
                            JSONObject m1946 = C0816.m1946(m1934, i);
                            String m2309 = C0829.m2309(C0829.m2309(C0865.m2709(m1946, C0876.m2835(m2121(), 437, 4, 2534)), m1957, m2368), m2437, m2368);
                            StringBuilder sb5 = new StringBuilder();
                            C0830.m2318(sb5, m2309);
                            C0830.m2318(sb5, m1957);
                            C0830.m2318(sb5, m2360);
                            C0830.m2318(sb5, C0882.m2900(m2121(), 441, 2, 2655));
                            C0841.m2432(sb5, C0868.m2750(m1946, C0876.m2835(m2121(), 443, 3, 389)));
                            C0842.m2445(arrayList, C0834.m2360(sb5));
                            int i3 = 0 - ((0 - i) - 1);
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = 1771;
                                    case 54:
                                        break;
                                }
                            }
                            i = i3;
                            break;
                        case 239:
                            C0841.m2436(jSONObject, C0840.m2424(m2121(), 446, 12, 902), C0856.m2605(m2437, arrayList));
                            JSONArray jSONArray = new JSONArray();
                            C0860.m2647(jSONArray, jSONObject);
                            JSONObject jSONObject2 = new JSONObject();
                            C0841.m2436(jSONObject2, C0886.m2950(m2121(), 458, 4, 2706), jSONArray);
                            return C0886.m2957(jSONObject2);
                    }
                }
            }
        } catch (Exception e) {
            C0888.m2974(e);
            return null;
        }
    }

    public String homeContent(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            C0841.m2436(jSONObject, C0816.m1941(m2121(), 462, 5, 1312), C0815.m1934(m2119(this), C0822.m2019(m2121(), 467, 7, 1803)));
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (!z) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        C0841.m2436(jSONObject, C0816.m1941(m2121(), 474, 7, 647), C0864.m2696(m2119(this), C0854.m2591(m2121(), 481, 6, 1943)));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (JSONException e) {
            m2120(e);
        }
        return C0886.m2957(jSONObject);
    }

    public String homeVideoContent() {
        JSONArray m1934;
        int i = 0;
        try {
            JSONArray jSONArray = new JSONArray();
            try {
                String m2442 = C0842.m2442(m2121(), 487, 84, 1300);
                m1934 = C0815.m1934(C0864.m2696(new JSONObject(C0838.m2396(m2442, m2122(this, m2442))), C0840.m2424(m2121(), 571, 4, 1847)), C0835.m2368(m2121(), 575, 6, 1286));
            } catch (Exception e) {
                int i2 = 48767;
                while (true) {
                    i2 ^= 48784;
                    switch (i2) {
                        case 14:
                            break;
                        case 239:
                            i2 = 48798;
                            break;
                    }
                }
            }
            while (true) {
                int i3 = i;
                int m2366 = C0834.m2366(m1934);
                int i4 = 1616;
                while (true) {
                    i4 ^= 1633;
                    switch (i4) {
                        case 14:
                        case 49:
                            i4 = i3 < m2366 ? 1709 : 1678;
                        case 204:
                            JSONObject m1946 = C0816.m1946(m1934, i3);
                            JSONObject jSONObject = new JSONObject();
                            String m2709 = C0865.m2709(m1946, C0835.m2368(m2121(), 581, 3, 1513));
                            boolean m2694 = C0864.m2694(m2709, C0863.m2688(m2121(), 584, 2, 2344));
                            int i5 = 1740;
                            while (true) {
                                i5 ^= 1757;
                                switch (i5) {
                                    case 17:
                                        i5 = m2694 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        StringBuilder sb = new StringBuilder();
                                        C0830.m2318(sb, C0854.m2591(m2121(), 586, 6, 3046));
                                        C0830.m2318(sb, m2709);
                                        m2709 = C0834.m2360(sb);
                                        break;
                                }
                            }
                            C0841.m2436(jSONObject, C0849.m2531(m2121(), 592, 6, 2534), C0865.m2709(m1946, C0855.m2597(m2121(), 598, 4, 2901)));
                            C0841.m2436(jSONObject, C0885.m2937(m2121(), 607, 8, 3055), C0886.m2953(C0837.m2386(C0865.m2709(m1946, C0840.m2424(m2121(), 602, 5, 2740)))));
                            C0841.m2436(jSONObject, C0819.m1986(m2121(), 615, 7, 684), m2709);
                            String str = C0815.m1937(C0865.m2709(m1946, C0864.m2692(m2121(), 622, 8, 2077)), C0868.m2742(m2121(), 630, 1, 1826))[0];
                            StringBuilder sb2 = new StringBuilder();
                            C0830.m2318(sb2, str);
                            C0830.m2318(sb2, C0812.m1893(m2121(), 631, 2, 2091));
                            C0841.m2436(jSONObject, C0835.m2368(m2121(), 633, 11, 1347), C0834.m2360(sb2));
                            C0860.m2647(jSONArray, jSONObject);
                            i = ((i3 + 30) + 1) - 30;
                            int i6 = 1864;
                            while (true) {
                                i6 ^= 1881;
                                switch (i6) {
                                    case 17:
                                        i6 = 48674;
                                    case 47483:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            break;
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                C0841.m2436(jSONObject2, C0869.m2753(m2121(), 644, 4, 453), jSONArray);
                return C0886.m2957(jSONObject2);
            }
        } catch (Throwable th) {
            return C0821.m2006();
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        try {
            this.f33yq = new JSONObject(C0838.m2396(str, null));
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        return;
                    case 49:
                        i = 1647;
                        break;
                }
            }
        } catch (JSONException e) {
            C0888.m2974(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String m2551 = C0851.m2551(m2121(), 648, 3, 2904);
        try {
            String[] m1937 = C0815.m1937(str2, C0868.m2742(m2121(), 651, 2, 2616));
            String str3 = m1937[0];
            String str4 = m1937[1];
            StringBuilder sb = new StringBuilder();
            C0830.m2318(sb, C0819.m1986(m2121(), 653, 47, 1434));
            C0830.m2318(sb, str3);
            C0830.m2318(sb, C0872.m2781(m2121(), 700, 6, 814));
            C0830.m2318(sb, str4);
            C0830.m2318(sb, C0819.m1986(m2121(), 706, 15, 956));
            String m2360 = C0834.m2360(sb);
            JSONObject jSONObject = new JSONObject(C0838.m2396(m2360, m2122(this, m2360)));
            JSONObject jSONObject2 = new JSONObject();
            C0841.m2436(jSONObject2, C0839.m2409(m2121(), 721, 5, 1046), C0865.m2706(m2121(), 726, 1, 1082));
            C0841.m2436(jSONObject2, C0815.m1935(m2121(), 727, 7, 1724), C0821.m2006());
            C0841.m2436(jSONObject2, m2551, C0865.m2709(C0816.m1946(C0815.m1934(C0864.m2696(jSONObject, C0841.m2437(m2121(), 734, 4, 2536)), C0870.m2759(m2121(), 738, 4, 2805)), 0), m2551));
            C0841.m2436(jSONObject2, C0835.m2368(m2121(), 742, 6, 1158), C0885.m2937(m2121(), 748, 176, 930));
            C0841.m2436(jSONObject2, C0868.m2742(m2121(), 924, 11, 1135), C0830.m2321(m2121(), 935, 11, 2725));
            return C0886.m2957(jSONObject2);
        } catch (Exception e) {
            C0888.m2974(e);
            return null;
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            C0830.m2318(sb, C0837.m2387(m2121(), 946, 79, 989));
            C0830.m2318(sb, C0856.m2603(str));
            String m2360 = C0834.m2360(sb);
            JSONObject m2696 = C0864.m2696(new JSONObject(C0838.m2396(m2360, m2122(this, m2360))), C0862.m2671(m2121(), 1025, 4, 1787));
            JSONArray jSONArray = new JSONArray();
            JSONArray m1934 = C0815.m1934(m2696, C0851.m2551(m2121(), 1029, 6, 1164));
            int i = 0;
            while (true) {
                int m2366 = C0834.m2366(m1934);
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < m2366 ? 1709 : 1678;
                        case 204:
                            JSONObject m1946 = C0816.m1946(m1934, i);
                            JSONObject jSONObject2 = new JSONObject();
                            String m2709 = C0865.m2709(m1946, C0838.m2398(m2121(), 1035, 3, 1261));
                            boolean m2694 = C0864.m2694(m2709, C0841.m2437(m2121(), 1038, 2, 973));
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = m2694 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        StringBuilder sb2 = new StringBuilder();
                                        C0830.m2318(sb2, C0838.m2398(m2121(), 1040, 6, 1741));
                                        C0830.m2318(sb2, m2709);
                                        m2709 = C0834.m2360(sb2);
                                        break;
                                }
                            }
                            C0841.m2436(jSONObject2, C0836.m2374(m2121(), 1046, 6, 1239), C0865.m2709(m1946, C0829.m2314(m2121(), 1052, 4, 2418)));
                            C0841.m2436(jSONObject2, C0855.m2597(m2121(), 1061, 8, 923), C0886.m2953(C0837.m2386(C0865.m2709(m1946, C0855.m2597(m2121(), 1056, 5, 1835)))));
                            C0841.m2436(jSONObject2, C0859.m2637(m2121(), 1069, 7, 3220), m2709);
                            String str2 = C0815.m1937(C0865.m2709(m1946, C0814.m1917(m2121(), 1076, 8, 2088)), C0860.m2649(m2121(), 1084, 1, 2795))[0];
                            StringBuilder sb3 = new StringBuilder();
                            C0830.m2318(sb3, str2);
                            C0830.m2318(sb3, C0863.m2688(m2121(), 1085, 2, 720));
                            C0841.m2436(jSONObject2, C0821.m2010(m2121(), 1087, 11, 804), C0834.m2360(sb3));
                            C0860.m2647(jSONArray, jSONObject2);
                            int i4 = i + 1;
                            int i5 = 1864;
                            while (true) {
                                i5 ^= 1881;
                                switch (i5) {
                                    case 17:
                                        i5 = 48674;
                                    case 47483:
                                        break;
                                }
                            }
                            i = i4;
                            break;
                        case 239:
                            C0841.m2436(jSONObject, C0854.m2591(m2121(), 1098, 4, 985), jSONArray);
                            return C0886.m2957(jSONObject);
                    }
                }
            }
        } catch (Exception e) {
            m2120(e);
            return C0821.m2006();
        }
    }

    /* renamed from: yq */
    protected final HashMap<String, String> m1825yq(String str) {
        HashMap<String, String> m2676 = C0862.m2676(C0855.m2597(m2121(), 1102, 10, 1340), C0862.m2671(m2121(), 1112, 121, 2567));
        JSONObject m2119 = m2119(this);
        String m2349 = C0832.m2349(m2121(), 1233, 6, 2668);
        String m2535 = C0849.m2535(m2119, m2349);
        boolean m2345 = C0832.m2345(m2535);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!m2345) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    m2535 = C0882.m2900(m2121(), 1239, 10, 3068);
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        boolean m2694 = C0864.m2694(m2535, C0817.m1957(m2121(), 1249, 4, 2170));
        int i2 = 1740;
        while (true) {
            i2 ^= 1757;
            switch (i2) {
                case 17:
                    if (!m2694) {
                        break;
                    } else {
                        i2 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    break;
                case 500:
                    m2535 = C0838.m2396(m2535, null);
                    break;
            }
            i2 = 1802;
        }
        C0840.m2421(m2676, m2349, m2535);
        C0840.m2421(m2676, C0886.m2950(m2121(), 1253, 7, 3093), C0856.m2610(m2121(), 1260, 24, 2182));
        return m2676;
    }
}
