package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p048m.C0620d;
import com.github.catvod.spider.merge.p050n.C0629f;
import com.github.catvod.spider.merge.p054p.C0642b;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppYsV2 extends Spider {

    /* renamed from: c */
    private static final Pattern f4c;

    /* renamed from: d */
    private static final Pattern f5d;

    /* renamed from: e */
    private static final Pattern f6e;

    /* renamed from: f */
    protected static final Pattern[] f7f;

    /* renamed from: a */
    protected final HashMap<String, ArrayList<String>> f8a = new HashMap<>();

    /* renamed from: b */
    private String[] f9b = null;

    static {
        Pattern.compile(atm.m897d("1D0D0D5B2D3403030F1B282A030C1F5B2F370755095A64033455275E65770C151611292A4552212B63054153551325340F2513116370312455286771"));
        Pattern.compile(atm.m897d("1D0D0D5B2D3403030F1B282A030C1F5B2F370755095A64033455275E65"));
        f4c = Pattern.compile(atm.m897d("0B0A13296228020A555B6667450C1511"));
        Pattern.compile(atm.m897d("0B0A13296228020A555B676736540C1A28"));
        Pattern.compile(atm.m897d("4554512973764147"));
        f5d = Pattern.compile(atm.m897d("445052003E34160C0603253C160A12051067031E5348"));
        f6e = Pattern.compile(atm.m897d("020E0E053F675055552E12773750"));
        f7f = new Pattern[]{Pattern.compile(atm.m897d("1A161B0C292A57141F02")), Pattern.compile(atm.m897d("561E13036C310E475803253C0F1558")), Pattern.compile(atm.m897d("561E13036C310E47582E127A375045052039131F0857")), Pattern.compile(atm.m897d("455592D2CAB1C8EB93E6F2BEE4DF")), Pattern.compile(atm.m897d("2216093F3F08061B03103E0442")), Pattern.compile(atm.m897d("56131C072D350F212606100B375045063E3B5758212B6E05414558")), Pattern.compile(atm.m897d("560C13112937312609291F05404509072F654821245711735558"))};
    }

    /* renamed from: b */
    private void m1560b(JSONObject jSONObject, String str, ArrayList<JSONArray> arrayList) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (next.equals(str) && (obj instanceof JSONArray)) {
                    arrayList.add((JSONArray) obj);
                }
                if (obj instanceof JSONObject) {
                    m1560b((JSONObject) obj, str, arrayList);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        m1560b(jSONArray.getJSONObject(i), str, arrayList);
                    }
                }
            } catch (JSONException e) {
                SpiderDebug.log(e);
            }
        }
    }

    /* renamed from: c */
    private void m1559c(String str, JSONObject jSONObject, JSONObject jSONObject2, String str2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String m897d;
        JSONObject jSONObject3;
        String str3;
        int indexOf;
        String str4;
        StringBuilder sb;
        String group;
        String str5;
        String str6;
        String m897d2 = atm.m897d("46");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean contains = str.contains(atm.m897d("0B0A135B3C301A551B053C77"));
        String m897d3 = atm.m897d("041B1710");
        String m897d4 = atm.m897d("1A1B080629070B0A13");
        String m897d5 = atm.m897d("09151E10");
        String m897d6 = atm.m897d("1C151E2A392A06250D1C3830350A1614353D18");
        String m897d7 = atm.m897d("1C151E2A2F340B0909");
        String m897d8 = atm.m897d("0E1B0E14");
        String m897d9 = atm.m897d("1F0816");
        String str7 = m897d2;
        String m897d10 = atm.m897d("1E030A1013360B171F");
        String m897d11 = atm.m897d("1C151E2A2F37040E1F1B38");
        String m897d12 = atm.m897d("1C151E2A2831181F1901232A");
        String str8 = m897d4;
        String m897d13 = atm.m897d("1C151E2A2D3B1E1508");
        ArrayList arrayList5 = arrayList3;
        String m897d14 = atm.m897d("1C151E2A3E3D071B081E3F");
        String str9 = m897d9;
        String m897d15 = atm.m897d("1C151E2A2D2A0F1B");
        ArrayList arrayList6 = arrayList4;
        String m897d16 = atm.m897d("1C151E2A353D0B08");
        String str10 = m897d3;
        String m897d17 = atm.m897d("1C151E2A3C3109");
        String str11 = m897d5;
        String m897d18 = atm.m897d("1C151E2A2239071F");
        String m897d19 = atm.m897d("1C151E2A253C");
        if (contains) {
            JSONObject jSONObject4 = jSONObject.getJSONObject(m897d8);
            jSONObject2.put(m897d19, jSONObject4.optString(m897d19, str2));
            jSONObject2.put(m897d18, jSONObject4.getString(m897d18));
            jSONObject2.put(m897d17, jSONObject4.getString(m897d17));
            jSONObject2.put(m897d10, jSONObject4.optString(m897d7));
            jSONObject2.put(m897d16, jSONObject4.optString(m897d16));
            jSONObject2.put(m897d15, jSONObject4.optString(m897d15));
            jSONObject2.put(m897d14, jSONObject4.optString(m897d14));
            jSONObject2.put(m897d13, jSONObject4.optString(m897d13));
            jSONObject2.put(m897d12, jSONObject4.optString(m897d12));
            jSONObject2.put(m897d11, jSONObject4.optString(m897d11));
            JSONArray jSONArray = jSONObject4.getJSONArray(m897d6);
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                String str12 = str11;
                String trim = jSONObject5.optString(str12).trim();
                if (trim.isEmpty()) {
                    str6 = str10;
                    trim = jSONObject5.getString(str6).trim();
                } else {
                    str6 = str10;
                }
                ArrayList arrayList7 = arrayList6;
                arrayList7.add(trim);
                String str13 = str9;
                ArrayList arrayList8 = arrayList5;
                arrayList8.add(jSONObject5.getString(str13));
                String str14 = str8;
                String trim2 = jSONObject5.optString(str14).trim();
                ArrayList<String> arrayList9 = this.f8a.get(trim);
                if (arrayList9 == null) {
                    arrayList9 = new ArrayList<>();
                    this.f8a.put(trim, arrayList9);
                }
                if (!trim2.isEmpty() && !arrayList9.contains(trim2)) {
                    arrayList9.add(trim2);
                }
                i++;
                str10 = str6;
                arrayList6 = arrayList7;
                str9 = str13;
                str8 = str14;
                str11 = str12;
                arrayList5 = arrayList8;
            }
        } else {
            String str15 = str8;
            String str16 = str9;
            if (!str.contains(atm.m897d("121D1B053C"))) {
                ArrayList arrayList10 = arrayList5;
                ArrayList arrayList11 = arrayList6;
                String str17 = str16;
                if (str.contains(atm.m897d("440C1511"))) {
                    JSONObject jSONObject6 = jSONObject.getJSONObject(m897d8);
                    jSONObject2.put(m897d19, jSONObject6.optString(m897d19, str2));
                    jSONObject2.put(m897d18, jSONObject6.getString(m897d18));
                    jSONObject2.put(m897d17, jSONObject6.getString(m897d17));
                    jSONObject2.put(m897d10, jSONObject6.optString(m897d7));
                    jSONObject2.put(m897d16, jSONObject6.optString(m897d16));
                    jSONObject2.put(m897d15, jSONObject6.optString(m897d15));
                    jSONObject2.put(m897d14, jSONObject6.optString(m897d14));
                    jSONObject2.put(m897d13, jSONObject6.optString(m897d13));
                    jSONObject2.put(m897d12, jSONObject6.optString(m897d12));
                    jSONObject2.put(m897d11, jSONObject6.optString(m897d11));
                    JSONArray jSONArray2 = jSONObject6.getJSONArray(atm.m897d("1C151E2A3C340B032519252B1E"));
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        JSONObject jSONObject7 = jSONArray2.getJSONObject(i2);
                        String m897d20 = atm.m897d("1A161B0C292A3513141323");
                        String trim3 = jSONObject7.getJSONObject(m897d20).optString(atm.m897d("0C081518")).trim();
                        if (trim3.isEmpty()) {
                            trim3 = jSONObject7.getJSONObject(m897d20).optString(atm.m897d("19121502")).trim();
                        }
                        ArrayList arrayList12 = arrayList11;
                        arrayList12.add(trim3);
                        String str18 = str17;
                        ArrayList arrayList13 = arrayList10;
                        arrayList13.add(jSONObject7.getString(str18));
                        try {
                            ArrayList arrayList14 = new ArrayList();
                            str4 = str7;
                            try {
                                String[] split = jSONObject7.getJSONObject(m897d20).optString(atm.m897d("1A1B080629")).split(str4);
                                String[] split2 = jSONObject7.getJSONObject(m897d20).optString(atm.m897d("1A1B0806296A")).split(str4);
                                arrayList14.addAll(Arrays.asList(split));
                                arrayList14.addAll(Arrays.asList(split2));
                                try {
                                    ArrayList<String> arrayList15 = this.f8a.get(trim3);
                                    if (arrayList15 == null) {
                                        arrayList15 = new ArrayList<>();
                                        this.f8a.put(trim3, arrayList15);
                                    }
                                    Iterator it = arrayList14.iterator();
                                    while (it.hasNext()) {
                                        String str19 = (String) it.next();
                                        if (str19.contains(atm.m897d("020E0E05"))) {
                                            Matcher matcher = f5d.matcher(str19);
                                            if (matcher.find()) {
                                                str19 = matcher.group(0);
                                            }
                                        } else if (str19.contains(atm.m897d("4555"))) {
                                            Matcher matcher2 = f5d.matcher(str19);
                                            if (matcher2.find()) {
                                                sb = new StringBuilder();
                                                sb.append(atm.m897d("020E0E0576"));
                                                group = matcher2.group(0);
                                                sb.append(group);
                                                str19 = sb.toString();
                                            }
                                        } else {
                                            Matcher matcher3 = f6e.matcher(str);
                                            if (matcher3.find()) {
                                                Matcher matcher4 = f5d.matcher(str);
                                                if (matcher4.find()) {
                                                    sb = new StringBuilder();
                                                    sb.append(matcher3.group(0));
                                                    group = matcher4.group(0);
                                                    sb.append(group);
                                                    str19 = sb.toString();
                                                }
                                            }
                                        }
                                        String trim4 = str19.replace(atm.m897d("4454"), atm.m897d("44")).trim();
                                        if (!trim4.isEmpty() && !arrayList15.contains(trim4)) {
                                            arrayList15.add(trim4);
                                        }
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    SpiderDebug.log(e);
                                    i2++;
                                    arrayList10 = arrayList13;
                                    str7 = str4;
                                    arrayList11 = arrayList12;
                                    str17 = str18;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str4 = str7;
                        }
                        i2++;
                        arrayList10 = arrayList13;
                        str7 = str4;
                        arrayList11 = arrayList12;
                        str17 = str18;
                    }
                    arrayList2 = arrayList10;
                    arrayList = arrayList11;
                } else {
                    String str20 = str17;
                    if (f4c.matcher(str).find()) {
                        jSONObject2.put(m897d19, jSONObject.optString(m897d19, str2));
                        jSONObject2.put(m897d18, jSONObject.getString(atm.m897d("1E130E1929")));
                        jSONObject2.put(m897d17, jSONObject.getString(atm.m897d("03171D2A392A06")));
                        jSONObject2.put(m897d10, m1548n(jSONObject.optJSONArray(atm.m897d("1E030A10"))));
                        jSONObject2.put(m897d16, jSONObject.optString(atm.m897d("1A0F180125350F")));
                        jSONObject2.put(m897d15, m1548n(jSONObject.optJSONArray(atm.m897d("0B081F14"))));
                        jSONObject2.put(m897d14, jSONObject.optString(atm.m897d("1E080F1B27")));
                        jSONObject2.put(m897d13, m1548n(jSONObject.optJSONArray(atm.m897d("0B190E1A3E"))));
                        jSONObject2.put(m897d12, m1548n(jSONObject.optJSONArray(atm.m897d("0E1308102F2C0508"))));
                        jSONObject2.put(m897d11, jSONObject.optString(atm.m897d("03140E0723")));
                        JSONObject jSONObject8 = jSONObject.getJSONObject(atm.m897d("1C131E10233403090E"));
                        Iterator<String> keys = jSONObject8.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            ArrayList<String> arrayList16 = this.f8a.get(next);
                            if (arrayList16 == null) {
                                arrayList16 = new ArrayList<>();
                                this.f8a.put(next, arrayList16);
                            }
                            JSONArray jSONArray3 = jSONObject8.getJSONArray(next);
                            ArrayList arrayList17 = new ArrayList();
                            int i3 = 0;
                            while (i3 < jSONArray3.length()) {
                                String str21 = str20;
                                String string = jSONArray3.getJSONObject(i3).getString(str21);
                                String m897d21 = atm.m897d("1F081648");
                                boolean contains2 = string.contains(m897d21);
                                String m897d22 = atm.m897d("4E");
                                if (contains2) {
                                    String trim5 = string.substring(0, string.indexOf(m897d21) + 4).trim();
                                    if (!trim5.isEmpty() && !arrayList16.contains(trim5)) {
                                        arrayList16.add(trim5);
                                    }
                                    str3 = jSONObject3.getString(m897d) + m897d22 + string.substring(indexOf).trim();
                                } else {
                                    str3 = jSONObject3.getString(m897d) + m897d22 + string;
                                }
                                arrayList17.add(str3);
                                i3++;
                                str20 = str21;
                            }
                            arrayList11.add(next);
                            arrayList10.add(TextUtils.join(atm.m897d("49"), arrayList17));
                        }
                    }
                    arrayList = arrayList11;
                    arrayList2 = arrayList10;
                }
                String m897d23 = atm.m897d("4E5E5E");
                jSONObject2.put(atm.m897d("1C151E2A3C340B0325133E3707"), TextUtils.join(m897d23, arrayList));
                jSONObject2.put(atm.m897d("1C151E2A3C340B0325003E34"), TextUtils.join(m897d23, arrayList2));
            }
            JSONObject jSONObject9 = jSONObject.getJSONObject(m897d8).getJSONObject(atm.m897d("1C151E2A25360C15"));
            jSONObject2.put(m897d19, jSONObject9.optString(m897d19, str2));
            jSONObject2.put(m897d18, jSONObject9.getString(m897d18));
            jSONObject2.put(m897d17, jSONObject9.getString(m897d17));
            jSONObject2.put(m897d10, jSONObject9.optString(m897d7));
            jSONObject2.put(m897d16, jSONObject9.optString(m897d16));
            jSONObject2.put(m897d15, jSONObject9.optString(m897d15));
            jSONObject2.put(m897d14, jSONObject9.optString(m897d14));
            jSONObject2.put(m897d13, jSONObject9.optString(m897d13));
            jSONObject2.put(m897d12, jSONObject9.optString(m897d12));
            jSONObject2.put(m897d11, jSONObject9.optString(m897d11));
            JSONArray jSONArray4 = jSONObject9.getJSONArray(m897d6);
            int i4 = 0;
            while (i4 < jSONArray4.length()) {
                JSONObject jSONObject10 = jSONArray4.getJSONObject(i4);
                String str22 = str11;
                String trim6 = jSONObject10.optString(str22).trim();
                if (trim6.isEmpty()) {
                    str5 = str10;
                    trim6 = jSONObject10.getString(str5).trim();
                } else {
                    str5 = str10;
                }
                ArrayList arrayList18 = arrayList6;
                arrayList18.add(trim6);
                String str23 = str16;
                ArrayList arrayList19 = arrayList5;
                arrayList19.add(jSONObject10.getString(str23));
                String str24 = str15;
                String trim7 = jSONObject10.optString(str24).trim();
                ArrayList<String> arrayList20 = this.f8a.get(trim6);
                if (arrayList20 == null) {
                    arrayList20 = new ArrayList<>();
                    this.f8a.put(trim6, arrayList20);
                }
                if (!trim7.isEmpty() && !arrayList20.contains(trim7)) {
                    arrayList20.add(trim7);
                }
                i4++;
                str11 = str22;
                str10 = str5;
                arrayList6 = arrayList18;
                str16 = str23;
                str15 = str24;
                arrayList5 = arrayList19;
            }
        }
        arrayList = arrayList6;
        arrayList2 = arrayList5;
        String m897d232 = atm.m897d("4E5E5E");
        jSONObject2.put(atm.m897d("1C151E2A3C340B0325133E3707"), TextUtils.join(m897d232, arrayList));
        jSONObject2.put(atm.m897d("1C151E2A3C340B0325003E34"), TextUtils.join(m897d232, arrayList2));
    }

    /* renamed from: d */
    private String m1558d() {
        String[] strArr = this.f9b;
        return (strArr == null || strArr.length < 1) ? "" : strArr[0].trim();
    }

    /* renamed from: i */
    private HashMap<String, String> m1553i(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(atm.m897d("3F091F0761190D1F1401"), str.contains(atm.m897d("1C151E5B753D5A4954162335")) ? atm.m897d("2715001C20340B554F5B7C784236131B3920515A3B1B282A05131E557A765A415A3B29201F095A406C1A1F1316116315383B4F4D02714A3B0A05203D3D1F183E252C454F4942626B5C5A523E040C273656552031011F5A32293B011553550F301815171063695A4954456268444A5A38233A03161F551F390C1B081C636D594D54467A") : (str.contains(atm.m897d("0B0A135B3C301A551B053C")) || str.contains(atm.m897d("121D1B053C")) || str.contains(atm.m897d("0C081F10273904"))) ? atm.m897d("2E1B0801636A444B4E55643C0B080E4F253743") : (str.contains(atm.m897d("100918")) || str.contains(atm.m897d("0C110206")) || str.contains(atm.m897d("121B0306")) || str.contains(atm.m897d("12190306")) || str.contains(atm.m897d("19000306")) || str.contains(atm.m897d("0E020306")) || str.contains(atm.m897d("130E0306")) || str.contains(atm.m897d("1B140306"))) ? atm.m897d("2E1B0801636A444B4F55643C0B080E4F253743") : str.contains(atm.m897d("440C1511")) ? atm.m897d("051112013828454E54446268") : atm.m897d("2E1B16032533454854446268"));
        return hashMap;
    }

    /* renamed from: l */
    private String m1550l(String str, String str2) {
        StringBuilder sb;
        String m897d;
        boolean contains = str.contains(atm.m897d("440C1511"));
        String m897d2 = atm.m897d("4C0A1B122965");
        if (contains) {
            if (str.contains(atm.m897d("03150A1022211F1454162335"))) {
                sb = new StringBuilder();
                sb.append(str);
                m897d = atm.m897d("4516130638671D1E47");
            } else {
                sb = new StringBuilder();
                sb.append(str);
                m897d = atm.m897d("550D1E48");
            }
        } else if (str.contains(atm.m897d("0B0A135B3C301A551B053C")) || str.contains(atm.m897d("121D1B053C"))) {
            sb = new StringBuilder();
            sb.append(str);
            sb.append(atm.m897d("191F1B072F30550E1F0D3865"));
            sb.append(str2);
            sb.append(atm.m897d("4C0A1D48"));
            return sb.toString();
        } else if (!f4c.matcher(str).find()) {
            return "";
        } else {
            if (str.contains(atm.m897d("0F091F1920391F0E15")) || str.contains(atm.m897d("5B544B41626E59544B457D")) || str.contains(atm.m897d("10100306")) || str.contains(atm.m897d("0E191E")) || str.contains(atm.m897d("06020F10")) || str.contains(atm.m897d("1D1F1F012D31441914")) || str.contains(atm.m897d("021B151E2D36000F4B")) || str.contains(atm.m897d("0C130E4F74")) || str.contains(atm.m897d("1010105B20310C1F")) || str.contains(atm.m897d("06150C1075615243")) || str.contains(atm.m897d("521E4204")) || str.contains(atm.m897d("06115405342D04")) || str.contains(atm.m897d("021D030D")) || str.contains(atm.m897d("5F484B0D79")) || str.contains(atm.m897d("0602030C35")) || str.contains(atm.m897d("5A424B4D382E")) || str.contains(atm.m897d("0E13031A3931")) || str.contains(atm.m897d("0E13161C272C1C")) || str.contains(atm.m897d("1A0A001D39")) || str.contains(atm.m897d("0B130E103F2D091B13")) || str.contains(atm.m897d("1000541625")) || str.contains(atm.m897d("0912021F2336")) || str.contains(atm.m897d("1D1B0E16243503")) || str.contains(atm.m897d("1C130A173C")) || str.contains(atm.m897d("08120E03")) || str.contains(atm.m897d("121C031E20"))) {
                sb = new StringBuilder();
                sb.append(str);
                m897d = atm.m897d("551B19482031190E5C022865");
            } else {
                sb = new StringBuilder();
                sb.append(str);
                m897d = atm.m897d("551B19482031190E5C0F2165");
            }
        }
        sb.append(m897d);
        sb.append(str2);
        sb.append(m897d2);
        return sb.toString();
    }

    /* renamed from: m */
    private boolean m1549m(String str) {
        return str.equals(atm.m897d("8EC6DC92DCDE")) || str.equals(atm.m897d("8CF9FF9DC5EA")) || str.equals(atm.m897d("8DDCF590C4F1"));
    }

    /* renamed from: n */
    private String m1548n(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return TextUtils.join(atm.m897d("46"), arrayList);
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: a */
    protected final String m1561a(String str) {
        String[] strArr = this.f9b;
        if (strArr.length > 1) {
            strArr[1].equals(atm.m897d("041C0E03"));
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:5|6|(23:11|(1:13)(1:115)|14|(1:114)(1:18)|19|(1:113)(1:23)|24|(1:112)(1:28)|29|(1:111)(1:33)|34|35|(1:110)(1:39)|40|41|42|(2:84|(3:89|(3:101|(1:103)(2:105|106)|104)|107)(1:88))(1:46)|47|(2:70|(5:79|(1:83)|(3:54|(5:57|58|(2:60|61)(2:63|64)|62|55)|65)|66|67)(1:78))(1:51)|52|(0)|66|67)|116|14|(1:16)|114|19|(1:21)|113|24|(1:26)|112|29|(1:31)|111|34|35|(1:37)|110|40|41|42|(1:44)|84|(1:86)|89|(17:91|93|95|97|99|101|(0)(0)|104|47|(1:49)|70|(1:72)|79|(2:81|83)|(0)|66|67)|107|47|(0)|70|(0)|79|(0)|(0)|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c4, code lost:
        com.github.catvod.crawler.SpiderDebug.log(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bc A[Catch: Exception -> 0x01c3, TryCatch #1 {Exception -> 0x01c3, blocks: (B:47:0x0147, B:49:0x014d, B:51:0x0155, B:52:0x015b, B:54:0x0161, B:56:0x0169, B:57:0x016e, B:59:0x0174, B:61:0x017c, B:63:0x0186, B:65:0x0192, B:67:0x019c, B:69:0x01a8, B:71:0x01bc, B:72:0x01be), top: B:118:0x0147, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01be A[Catch: Exception -> 0x01c3, TRY_LEAVE, TryCatch #1 {Exception -> 0x01c3, blocks: (B:47:0x0147, B:49:0x014d, B:51:0x0155, B:52:0x015b, B:54:0x0161, B:56:0x0169, B:57:0x016e, B:59:0x0174, B:61:0x017c, B:63:0x0186, B:65:0x0192, B:67:0x019c, B:69:0x01a8, B:71:0x01bc, B:72:0x01be), top: B:118:0x0147, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d6 A[Catch: Exception -> 0x02d2, TryCatch #2 {Exception -> 0x02d2, blocks: (B:5:0x0050, B:7:0x006f, B:10:0x007c, B:12:0x0088, B:15:0x009c, B:17:0x00b5, B:19:0x00bb, B:21:0x00c4, B:23:0x00d0, B:25:0x00d6, B:27:0x00df, B:29:0x00eb, B:31:0x00f1, B:33:0x00fa, B:35:0x0106, B:37:0x010c, B:39:0x0115, B:42:0x0121, B:44:0x0127, B:46:0x0130, B:78:0x01ca, B:80:0x01d6, B:92:0x0207, B:100:0x0221, B:102:0x0227, B:105:0x0245, B:107:0x02a6, B:106:0x026a, B:108:0x02ae, B:83:0x01df, B:85:0x01e5, B:87:0x01ed, B:89:0x01f7, B:91:0x0203, B:93:0x020c, B:95:0x0212, B:97:0x021a, B:76:0x01c4, B:13:0x008f, B:14:0x0096, B:47:0x0147, B:49:0x014d, B:51:0x0155, B:52:0x015b, B:54:0x0161, B:56:0x0169, B:57:0x016e, B:59:0x0174, B:61:0x017c, B:63:0x0186, B:65:0x0192, B:67:0x019c, B:69:0x01a8, B:71:0x01bc, B:72:0x01be), top: B:119:0x0050, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e5 A[Catch: Exception -> 0x02d2, TryCatch #2 {Exception -> 0x02d2, blocks: (B:5:0x0050, B:7:0x006f, B:10:0x007c, B:12:0x0088, B:15:0x009c, B:17:0x00b5, B:19:0x00bb, B:21:0x00c4, B:23:0x00d0, B:25:0x00d6, B:27:0x00df, B:29:0x00eb, B:31:0x00f1, B:33:0x00fa, B:35:0x0106, B:37:0x010c, B:39:0x0115, B:42:0x0121, B:44:0x0127, B:46:0x0130, B:78:0x01ca, B:80:0x01d6, B:92:0x0207, B:100:0x0221, B:102:0x0227, B:105:0x0245, B:107:0x02a6, B:106:0x026a, B:108:0x02ae, B:83:0x01df, B:85:0x01e5, B:87:0x01ed, B:89:0x01f7, B:91:0x0203, B:93:0x020c, B:95:0x0212, B:97:0x021a, B:76:0x01c4, B:13:0x008f, B:14:0x0096, B:47:0x0147, B:49:0x014d, B:51:0x0155, B:52:0x015b, B:54:0x0161, B:56:0x0169, B:57:0x016e, B:59:0x0174, B:61:0x017c, B:63:0x0186, B:65:0x0192, B:67:0x019c, B:69:0x01a8, B:71:0x01bc, B:72:0x01be), top: B:119:0x0050, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0212 A[Catch: Exception -> 0x02d2, TryCatch #2 {Exception -> 0x02d2, blocks: (B:5:0x0050, B:7:0x006f, B:10:0x007c, B:12:0x0088, B:15:0x009c, B:17:0x00b5, B:19:0x00bb, B:21:0x00c4, B:23:0x00d0, B:25:0x00d6, B:27:0x00df, B:29:0x00eb, B:31:0x00f1, B:33:0x00fa, B:35:0x0106, B:37:0x010c, B:39:0x0115, B:42:0x0121, B:44:0x0127, B:46:0x0130, B:78:0x01ca, B:80:0x01d6, B:92:0x0207, B:100:0x0221, B:102:0x0227, B:105:0x0245, B:107:0x02a6, B:106:0x026a, B:108:0x02ae, B:83:0x01df, B:85:0x01e5, B:87:0x01ed, B:89:0x01f7, B:91:0x0203, B:93:0x020c, B:95:0x0212, B:97:0x021a, B:76:0x01c4, B:13:0x008f, B:14:0x0096, B:47:0x0147, B:49:0x014d, B:51:0x0155, B:52:0x015b, B:54:0x0161, B:56:0x0169, B:57:0x016e, B:59:0x0174, B:61:0x017c, B:63:0x0186, B:65:0x0192, B:67:0x019c, B:69:0x01a8, B:71:0x01bc, B:72:0x01be), top: B:119:0x0050, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String categoryContent(java.lang.String r18, java.lang.String r19, boolean r20, java.util.HashMap<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String detailContent(List<String> list) {
        try {
            String m1558d = m1558d();
            String str = m1552j(m1558d) + list.get(0);
            SpiderDebug.log(str);
            String m179f = C0629f.m179f(str, m1553i(str));
            m1561a(m179f);
            JSONObject jSONObject = new JSONObject(m179f);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            m1559c(m1558d, jSONObject, jSONObject3, list.get(0));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put(atm.m897d("06130901"), jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* renamed from: e */
    final String m1557e(String str) {
        StringBuilder m635a;
        String m897d;
        if (str.contains(atm.m897d("0B0A135B3C301A551B053C")) || str.contains(atm.m897d("121D1B053C"))) {
            if (str.contains(atm.m897d("0E13101C2D20031B"))) {
                return atm.m897d("020E0E057677450D0D02623C0310131434310B54191A21770B0A135B3C301A551B053C771C131E1023671E131E48");
            }
            m635a = C0424a.m635a(str);
            m897d = atm.m897d("1C131E1023671E131E48");
        } else if (!str.contains(atm.m897d("440C1511"))) {
            m635a = C0424a.m635a(str);
            m897d = atm.m897d("551B19482031190E5C162039190947");
        } else if (str.contains(atm.m897d("03150A1022211F14"))) {
            m635a = C0424a.m635a(str);
            m897d = atm.m897d("4516130638671E030A1071");
        } else {
            m635a = C0424a.m635a(str);
            m897d = atm.m897d("550E03052965");
        }
        m635a.append(m897d);
        return m635a.toString();
    }

    /* renamed from: f */
    final String m1556f(String str) {
        StringBuilder m635a;
        String m897d;
        if (str.contains(atm.m897d("0B0A135B3C301A551B053C")) || str.contains(atm.m897d("121D1B053C"))) {
            m635a = C0424a.m635a(str);
            m897d = atm.m897d("041B0C4A3837011F1448");
        } else if (!str.contains(atm.m897d("440C1511"))) {
            return "";
        } else {
            if (str.contains(atm.m897d("03150A1022211F1454162335"))) {
                m635a = C0424a.m635a(str);
                m897d = atm.m897d("4516130638671E030A10");
            } else {
                m635a = C0424a.m635a(str);
                m897d = atm.m897d("450E0305292B");
            }
        }
        m635a.append(m897d);
        return m635a.toString();
    }

    /* renamed from: g */
    final String m1555g(String str, JSONObject jSONObject) {
        String str2 = "";
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.equals(atm.m897d("09161B063F")) || next.equals(atm.m897d("0B081F14")) || next.equals(atm.m897d("061B1412")) || next.equals(atm.m897d("131F1B07"))) {
                    try {
                        str2 = str2 + atm.m897d("8DD7E19CCCD1") + next + atm.m897d("419FFFDDA5DBC24751") + jSONObject.getString(next).replace(atm.m897d("46"), atm.m897d("41")) + atm.m897d("60");
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        if (str.contains(atm.m897d("440C1511"))) {
            return C0642b.m156a(str2, atm.m897d("609CF4E7A9E2E5519FF0E4B1E9D2475EAAC4EA9CECC5712C03171F5EAAC4EA9DF9D87130030E095EA4F7EE9FF2F3712B09150810"));
        }
        return (str.contains(atm.m897d("0B0A135B3C301A551B053C")) || str.contains(atm.m897d("121D1B053C"))) ? str2 : atm.m897d("8FF2FC92FDE3419FFFDDA5DBC2475192D8ED8FC7CB4821371C131F5EA4E7F49DC1D8A9D1CD470E033C340B035192F7E482F3C048382E1912150267BDE0D29CC9E7650915171C2F735E314718232E031F254127738EC7E99DCEEA570E130C39528DD7E19CCCD109161B063F738FFFD29CCFF057519FE3D0BDE3DD5192C4E98CF9FF5EAAD9FA9CFAE367BDE0D29EC8D0738DDDEB90F5E3419FF3D2AADBEF519CFDD4BCD0F3519DE1FE8FF6D05EABD2C59DC7DF67BDE0D29DE1F7738FDFFD90F5E3419CD7D3A8E6CA519FF3DEB1F3D35193D2F28CF2E25EAAD9FA9CFAE367BEE8D69DE3DD738CF9F093CEC2419DC1FAA9DDD25193E8DEBEF2DF5193DADF82F3C05EA9E6C49DEEC0A9E5DB519FFAE8B0C9FF5190C2DE8FF5C85EA4E7FA9FF0DD67BDECE69CE8DD738CF9F093CEC2419CF9FFAADAF0519EC9EABFFAFC5193CFDD82F3C85EABFEE59FF2DC67BCD2F39DCFEB738FFEC592E7FD419DC7E4ABE3F69DEEC0A9E5DB709DD8D7B1EAF31B072939419FFFDDA5DBC2475190E8FF83E3FC5EA5FEF39CC2DA67BDE5CA9CCCF2738DC4F490D7E54192F1C4A9C3D7519CC6D9BDF1C75193DBFD8CE6D65EA5C7C39FE1C867BDD4CD9FEEF1738CC9CA90D7E5419FF7C5A9E2CC5192D0F3BFE5D79DFCD5738FF0DA93C7E78FDEDD5EA9DDDC9EC1E346BFC7E193F5C5210F1B085EA9DDC293F9DD7173584A4847676A5A484B5E7E68584A51477C69535148457D6041484A447B73584A4B43676A5A4B4F5E7E685B4E51477C69595148457D6A41484A447D73584A4B45676A5A4A435E7E685A4251477C685D5148457C6E41484A457973584A4A41676A5A4A495E7E685A4851477C685B5148457C68");
    }

    /* renamed from: h */
    protected final JSONObject m1554h(ArrayList arrayList, String str) {
        Iterator it = arrayList.iterator();
        String str2 = "";
        while (true) {
            boolean hasNext = it.hasNext();
            String m897d = atm.m897d("1A161B0C192A06");
            String m897d2 = atm.m897d("1A1B080629");
            String m897d3 = atm.m897d("1F0816");
            JSONObject jSONObject = null;
            boolean z = true;
            if (!hasNext) {
                if (str2.isEmpty()) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(m897d2, 1);
                jSONObject2.put(m897d, str2);
                jSONObject2.put(m897d3, str);
                return jSONObject2;
            }
            String str3 = (String) it.next();
            if (!str3.isEmpty() && !str3.equals(atm.m897d("040F1619"))) {
                String m156a = C0642b.m156a(str3, str);
                String m179f = C0629f.m179f(m156a, null);
                m1561a(m179f);
                if (str3.contains(atm.m897d("5E4354477F6B444E4D5B786A5043424C74"))) {
                    HashMap hashMap = new HashMap();
                    C0629f.m176i(m156a, null, hashMap);
                    String m182c = C0629f.m182c(hashMap);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(m897d2, 0);
                    jSONObject3.put(m897d, "");
                    jSONObject3.put(m897d3, m182c);
                    return jSONObject3;
                }
                try {
                    jSONObject = C0620d.m196h(str, m179f);
                } catch (Throwable unused) {
                }
                if (jSONObject != null && jSONObject.has(m897d3)) {
                    String m897d4 = atm.m897d("021F1B11292A");
                    if (jSONObject.has(m897d4)) {
                        jSONObject.put(m897d4, jSONObject.getJSONObject(m897d4).toString());
                        return jSONObject;
                    }
                }
                if (m179f.contains(atm.m897d("56120E1820"))) {
                    Pattern[] patternArr = f7f;
                    int length = patternArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        } else if (patternArr[i].matcher(m179f).find()) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (z) {
                        str2 = str3;
                    }
                }
            }
        }
    }

    public String homeContent(boolean z) {
        String str;
        int i;
        String str2;
        String str3;
        JSONObject jSONObject;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        JSONArray jSONArray;
        String str11;
        String str12;
        String[] strArr;
        Object obj;
        String str13;
        String str14;
        JSONObject jSONObject2;
        String str15;
        String str16;
        String str17;
        JSONObject jSONObject3;
        String m897d;
        String m897d2 = atm.m897d("8DD7E19CCCD1");
        String str18 = "";
        String m897d3 = atm.m897d("0C131601292A19");
        String m897d4 = atm.m897d("06130901");
        String m897d5 = atm.m897d("0E1B0E14");
        try {
            String m1556f = m1556f(m1558d());
            boolean isEmpty = m1556f.isEmpty();
            String m897d6 = atm.m897d("57");
            String m897d7 = atm.m897d("3651");
            String m897d8 = atm.m897d("60");
            JSONArray jSONArray2 = null;
            String m897d9 = atm.m897d("1E030A1013310E");
            String m897d10 = atm.m897d("1E030A1013360B171F");
            if (isEmpty) {
                String[] split = m1555g(m1556f, null).split(m897d8)[0].split(m897d7);
                jSONArray2 = new JSONArray();
                for (int i2 = 1; i2 < split.length; i2++) {
                    String[] split2 = split[i2].trim().split(m897d6);
                    if (split2.length >= 2) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(m897d10, split2[0].trim());
                        jSONObject4.put(m897d9, split2[1].trim());
                        jSONArray2.put(jSONObject4);
                    }
                }
            } else {
                SpiderDebug.log(m1556f);
                String m179f = C0629f.m179f(m1556f, m1553i(m1556f));
                m1561a(m179f);
                JSONObject jSONObject5 = new JSONObject(m179f);
                if (jSONObject5.has(m897d4) && (jSONObject5.get(m897d4) instanceof JSONArray)) {
                    jSONArray2 = jSONObject5.getJSONArray(m897d4);
                } else if (jSONObject5.has(m897d5) && (jSONObject5.get(m897d5) instanceof JSONObject) && jSONObject5.getJSONObject(m897d5).has(m897d4) && (jSONObject5.getJSONObject(m897d5).get(m897d4) instanceof JSONArray)) {
                    jSONArray2 = jSONObject5.getJSONObject(m897d5).getJSONArray(m897d4);
                } else if (jSONObject5.has(m897d5) && (jSONObject5.get(m897d5) instanceof JSONArray)) {
                    jSONArray2 = jSONObject5.getJSONArray(m897d5);
                }
            }
            JSONObject jSONObject6 = new JSONObject();
            JSONArray jSONArray3 = new JSONArray();
            String m897d11 = atm.m897d("09161B063F");
            if (jSONArray2 != null) {
                int i3 = 0;
                while (i3 < jSONArray2.length()) {
                    JSONObject jSONObject7 = jSONArray2.getJSONObject(i3);
                    JSONArray jSONArray4 = jSONArray2;
                    String string = jSONObject7.getString(m897d10);
                    if (m1549m(string)) {
                        str2 = m897d2;
                        str3 = str18;
                        jSONArray = jSONArray3;
                        str4 = m1556f;
                        str5 = m897d11;
                        str6 = m897d6;
                        str7 = m897d7;
                        str8 = m897d8;
                        str9 = m897d9;
                        str10 = m897d10;
                        i = i3;
                    } else {
                        i = i3;
                        String string2 = jSONObject7.getString(m897d9);
                        JSONArray jSONArray5 = jSONArray3;
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put(m897d9, string2);
                        jSONObject8.put(m897d10, string);
                        JSONObject optJSONObject = jSONObject7.optJSONObject(atm.m897d("1E030A10133D120E1F1B28"));
                        if (z) {
                            String[] split3 = m1555g(m1556f, optJSONObject).split(m897d8);
                            JSONArray jSONArray6 = new JSONArray();
                            str4 = m1556f;
                            int i4 = m1556f.isEmpty() ? 1 : 0;
                            str8 = m897d8;
                            while (i4 < split3.length) {
                                String trim = split3[i4].trim();
                                if (trim.isEmpty()) {
                                    str12 = m897d2;
                                    str14 = str18;
                                    jSONObject2 = jSONObject8;
                                    str15 = m897d11;
                                    str16 = m897d6;
                                    str11 = m897d7;
                                    strArr = split3;
                                    str13 = m897d9;
                                    str17 = m897d10;
                                } else {
                                    String[] split4 = trim.split(m897d7);
                                    str11 = m897d7;
                                    String trim2 = split4[0].trim();
                                    if (trim2.contains(m897d2)) {
                                        strArr = split3;
                                        String replace = trim2.replace(m897d2, str18);
                                        if (replace.equals(m897d11)) {
                                            trim2 = atm.m897d("8DCBC190D2D3");
                                            str12 = m897d2;
                                        } else {
                                            str12 = m897d2;
                                            if (replace.equals(atm.m897d("0B081F14"))) {
                                                m897d = atm.m897d("8FE6CA90C0E2");
                                            } else if (replace.equals(atm.m897d("061B1412"))) {
                                                m897d = atm.m897d("82D5D79DE4D8");
                                            } else if (replace.equals(atm.m897d("131F1B07"))) {
                                                m897d = atm.m897d("8FC3CE91F7E5");
                                            }
                                            trim2 = m897d;
                                        }
                                        obj = trim2;
                                        trim2 = replace;
                                    } else {
                                        str12 = m897d2;
                                        strArr = split3;
                                        obj = trim2;
                                    }
                                    JSONObject jSONObject9 = new JSONObject();
                                    str13 = m897d9;
                                    jSONObject9.put(atm.m897d("011F03"), trim2);
                                    jSONObject9.put(atm.m897d("041B1710"), obj);
                                    JSONArray jSONArray7 = new JSONArray();
                                    int i5 = 1;
                                    while (i5 < split4.length) {
                                        JSONObject jSONObject10 = new JSONObject();
                                        String[] strArr2 = split4;
                                        String trim3 = split4[i5].trim();
                                        String str19 = m897d10;
                                        int indexOf = trim3.indexOf(m897d6);
                                        String str20 = m897d6;
                                        str = str18;
                                        String m897d12 = atm.m897d("1C");
                                        String str21 = m897d11;
                                        String m897d13 = atm.m897d("04");
                                        if (indexOf == -1) {
                                            try {
                                                if (m1549m(trim3)) {
                                                    jSONObject3 = jSONObject8;
                                                } else {
                                                    jSONObject10.put(m897d13, trim3);
                                                    jSONObject10.put(m897d12, trim3);
                                                    jSONObject3 = jSONObject8;
                                                    jSONArray7.put(jSONObject10);
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                SpiderDebug.log(e);
                                                return str;
                                            }
                                        } else {
                                            jSONObject3 = jSONObject8;
                                            String substring = trim3.substring(0, indexOf);
                                            if (!m1549m(substring)) {
                                                jSONObject10.put(m897d13, substring.trim());
                                                jSONObject10.put(m897d12, trim3.substring(indexOf + 1).trim());
                                                jSONArray7.put(jSONObject10);
                                            }
                                        }
                                        i5++;
                                        jSONObject8 = jSONObject3;
                                        m897d10 = str19;
                                        split4 = strArr2;
                                        m897d6 = str20;
                                        str18 = str;
                                        m897d11 = str21;
                                    }
                                    str14 = str18;
                                    jSONObject2 = jSONObject8;
                                    str15 = m897d11;
                                    str16 = m897d6;
                                    str17 = m897d10;
                                    jSONObject9.put(atm.m897d("1C1B160029"), jSONArray7);
                                    jSONArray6.put(jSONObject9);
                                }
                                i4++;
                                jSONObject8 = jSONObject2;
                                split3 = strArr;
                                m897d7 = str11;
                                m897d2 = str12;
                                m897d9 = str13;
                                m897d10 = str17;
                                m897d6 = str16;
                                str18 = str14;
                                m897d11 = str15;
                            }
                            str2 = m897d2;
                            str3 = str18;
                            jSONObject = jSONObject8;
                            str5 = m897d11;
                            str6 = m897d6;
                            str7 = m897d7;
                            str9 = m897d9;
                            str10 = m897d10;
                            if (!jSONObject6.has(m897d3)) {
                                jSONObject6.put(m897d3, new JSONObject());
                            }
                            jSONObject6.getJSONObject(m897d3).put(string2, jSONArray6);
                        } else {
                            str2 = m897d2;
                            str3 = str18;
                            jSONObject = jSONObject8;
                            str4 = m1556f;
                            str5 = m897d11;
                            str6 = m897d6;
                            str7 = m897d7;
                            str8 = m897d8;
                            str9 = m897d9;
                            str10 = m897d10;
                        }
                        jSONArray = jSONArray5;
                        jSONArray.put(jSONObject);
                    }
                    i3 = i + 1;
                    jSONArray3 = jSONArray;
                    jSONArray2 = jSONArray4;
                    m897d8 = str8;
                    m1556f = str4;
                    m897d7 = str7;
                    m897d2 = str2;
                    m897d9 = str9;
                    m897d10 = str10;
                    m897d6 = str6;
                    str18 = str3;
                    m897d11 = str5;
                }
            }
            str = str18;
            jSONObject6.put(m897d11, jSONArray3);
            return jSONObject6.toString();
        } catch (Exception e2) {
            e = e2;
            str = str18;
        }
    }

    public String homeVideoContent() {
        String m1558d;
        boolean z;
        try {
            String m1551k = m1551k(m1558d());
            if (m1551k.isEmpty()) {
                m1551k = m1557e(m1558d) + atm.m897d("07150C1C297E1A1B1D1071694C1B08102D654C0E030529654C090E143E2C57");
                z = true;
            } else {
                z = false;
            }
            SpiderDebug.log(m1551k);
            String m179f = C0629f.m179f(m1551k, m1553i(m1551k));
            m1561a(m179f);
            JSONObject jSONObject = new JSONObject(m179f);
            JSONArray jSONArray = new JSONArray();
            String m897d = atm.m897d("1C151E2A3E3D071B081E3F");
            String m897d2 = atm.m897d("1C151E2A3C3109");
            String m897d3 = atm.m897d("1C151E2A2239071F");
            String m897d4 = atm.m897d("1C151E2A253C");
            if (z) {
                JSONArray jSONArray2 = jSONObject.getJSONArray(atm.m897d("0E1B0E14"));
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(m897d4, jSONObject2.getString(atm.m897d("041F020120310411")));
                    jSONObject3.put(m897d3, jSONObject2.getString(atm.m897d("1E130E1929")));
                    jSONObject3.put(m897d2, jSONObject2.getString(atm.m897d("1A1319")));
                    jSONObject3.put(m897d, jSONObject2.getString(atm.m897d("190E1B0129")));
                    jSONArray.put(jSONObject3);
                }
            } else {
                ArrayList<JSONArray> arrayList = new ArrayList<>();
                m1560b(jSONObject, atm.m897d("1C16130638"), arrayList);
                if (arrayList.isEmpty()) {
                    m1560b(jSONObject, atm.m897d("1C151E2A2031190E"), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<JSONArray> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONArray next = it.next();
                    for (int i2 = 0; i2 < next.length(); i2++) {
                        JSONObject jSONObject4 = next.getJSONObject(i2);
                        String string = jSONObject4.getString(m897d4);
                        if (!arrayList2.contains(string)) {
                            arrayList2.add(string);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put(m897d4, string);
                            jSONObject5.put(m897d3, jSONObject4.getString(m897d3));
                            jSONObject5.put(m897d2, jSONObject4.getString(m897d2));
                            jSONObject5.put(m897d, jSONObject4.getString(m897d));
                            jSONArray.put(jSONObject5);
                        }
                    }
                }
            }
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(atm.m897d("06130901"), jSONArray);
            return jSONObject6.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        try {
            this.f9b = str.split(atm.m897d("495959"));
        } catch (Throwable unused) {
        }
    }

    public boolean isVideoFormat(String str) {
        return C0652d.m143h(str);
    }

    /* renamed from: j */
    final String m1552j(String str) {
        StringBuilder m635a;
        String m897d;
        if (str.contains(atm.m897d("0B0A135B3C301A551B053C")) || str.contains(atm.m897d("121D1B053C"))) {
            if (str.contains(atm.m897d("0E13101C2D20031B"))) {
                return atm.m897d("020E0E053F6245550D023B760E13101C2D20031B54162335451B0A1C6228020A55143C28450C13112937351E1F012D310645131171");
            }
            if (str.contains(atm.m897d("5B4A4B452821"))) {
                return atm.m897d("020E0E057677450D0D0262695A4B4A113576091955143C31440A120563391A0A5503253C0F152511292C0B13164A253C57");
            }
            m635a = C0424a.m635a(str);
            m897d = atm.m897d("1C131E1023070E1F0E14253455131E48");
        } else if (!str.contains(atm.m897d("440C1511"))) {
            return "";
        } else {
            if (str.contains(atm.m897d("03150A1022211F14"))) {
                m635a = C0424a.m635a(str);
                m897d = atm.m897d("451E1F012D3106333E4A3A370E25131171");
            } else {
                m635a = C0424a.m635a(str);
                m897d = atm.m897d("451E1F012D3106450C1A2807031E47");
            }
        }
        m635a.append(m897d);
        return m635a.toString();
    }

    /* renamed from: k */
    final String m1551k(String str) {
        StringBuilder m635a;
        String m897d;
        if (str.contains(atm.m897d("0B0A135B3C301A551B053C")) || str.contains(atm.m897d("121D1B053C"))) {
            m635a = C0424a.m635a(str);
            m897d = atm.m897d("03141E1034071C131E1023671E1511102265");
        } else if (!str.contains(atm.m897d("440C1511"))) {
            return "";
        } else {
            m635a = C0424a.m635a(str);
            m897d = atm.m897d("450C15111C30083B1619");
        }
        m635a.append(m897d);
        return m635a.toString();
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public String playerContent(String str, String str2, List<String> list) {
        JSONObject m1554h;
        try {
            ArrayList<String> arrayList = this.f8a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (arrayList.isEmpty() || (m1554h = m1554h(arrayList, str2)) == null) {
                boolean m143h = C0652d.m143h(str2);
                String m897d = atm.m897d("1F0816");
                String m897d2 = atm.m897d("1A1B080629");
                if (m143h) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(m897d2, 0);
                    jSONObject.put(atm.m897d("1A161B0C192A06"), "");
                    jSONObject.put(m897d, str2);
                    return jSONObject.toString();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(m897d2, 1);
                jSONObject2.put(atm.m897d("0002"), atm.m897d("5B"));
                jSONObject2.put(m897d, str2);
                return jSONObject2.toString();
            }
            return m1554h.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        JSONObject jSONObject;
        String string;
        String m897d = atm.m897d("1C151E2A253C");
        String m897d2 = atm.m897d("06130901");
        String m897d3 = atm.m897d("0E1B0E14");
        try {
            String m1550l = m1550l(m1558d(), URLEncoder.encode(str));
            String m179f = C0629f.m179f(m1550l, m1553i(m1550l));
            m1561a(m179f);
            JSONObject jSONObject2 = new JSONObject(m179f);
            JSONArray jSONArray = null;
            JSONArray jSONArray2 = new JSONArray();
            if (jSONObject2.has(m897d2) && (jSONObject2.get(m897d2) instanceof JSONArray)) {
                jSONArray = jSONObject2.getJSONArray(m897d2);
            } else if (jSONObject2.has(m897d3) && (jSONObject2.get(m897d3) instanceof JSONObject) && jSONObject2.getJSONObject(m897d3).has(m897d2) && (jSONObject2.getJSONObject(m897d3).get(m897d2) instanceof JSONArray)) {
                jSONArray = jSONObject2.getJSONObject(m897d3).getJSONArray(m897d2);
            } else if (jSONObject2.has(m897d3) && (jSONObject2.get(m897d3) instanceof JSONArray)) {
                jSONArray = jSONObject2.getJSONArray(m897d3);
            }
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    boolean has = jSONObject3.has(m897d);
                    String m897d4 = atm.m897d("1C151E2A3E3D071B081E3F");
                    String m897d5 = atm.m897d("1C151E2A3C3109");
                    String m897d6 = atm.m897d("1C151E2A2239071F");
                    if (has) {
                        jSONObject = new JSONObject();
                        jSONObject.put(m897d, jSONObject3.getString(m897d));
                        jSONObject.put(m897d6, jSONObject3.getString(m897d6));
                        jSONObject.put(m897d5, jSONObject3.getString(m897d5));
                        string = jSONObject3.getString(m897d4);
                    } else {
                        jSONObject = new JSONObject();
                        jSONObject.put(m897d, jSONObject3.getString(atm.m897d("041F020120310411")));
                        jSONObject.put(m897d6, jSONObject3.getString(atm.m897d("1E130E1929")));
                        jSONObject.put(m897d5, jSONObject3.getString(atm.m897d("1A1319")));
                        string = jSONObject3.getString(atm.m897d("190E1B0129"));
                    }
                    jSONObject.put(m897d4, string);
                    jSONArray2.put(jSONObject);
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(m897d2, jSONArray2);
            return jSONObject4.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
