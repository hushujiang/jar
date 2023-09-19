package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p026b.C0304b;
import com.github.catvod.spider.merge.p026b.C0305c;
import com.github.catvod.spider.merge.p026b.C0306d;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p027b0.C0321F;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p042j.C0574b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class Ying extends Spider {
    /* renamed from: a */
    private void m1521a(StringBuilder sb, HashMap<String, String> hashMap, String str) {
        if (!hashMap.containsKey(str) || hashMap.get(str).equals(atm.m897d("8FFFD29CCFF0")) || hashMap.get(str).equals(atm.m897d("8CE1CE93DAE88CEDCC9CDBEC"))) {
            return;
        }
        sb.append(atm.m897d("4C"));
        sb.append(str);
        sb.append(atm.m897d("57"));
        sb.append(hashMap.get(str));
    }

    /* renamed from: b */
    private HashMap<String, String> m1520b() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(atm.m897d("3F091F0761190D1F1401"), atm.m897d("2715001C20340B554F5B7C78422D131B28371D095A3B18785B4A544577783D13144378634A024C4165782B0A0A19290F0F18311C38775F494D5B7F6E4A52313D181526565A1925330F5A3D102F3305535A36242A05171F5A7D6853544A5B7C765A5A29142A39181355407F6F44494C"));
        return hashMap;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        ArrayList arrayList = new ArrayList();
        StringBuilder m635a = C0424a.m635a(atm.m897d("550A1B12292B03001F487E6C4C0A1B122931041E1F0D71"));
        m635a.append(Integer.parseInt(str2) - 1);
        if (!str.equals(atm.m897d("8FFFD29CCFF0"))) {
            m635a.append(atm.m897d("4C081F1225370447"));
            m635a.append(str);
        }
        m1521a(m635a, hashMap, atm.m897d("0D1F140729"));
        m1521a(m635a, hashMap, atm.m897d("061F0E01292A"));
        m1521a(m635a, hashMap, atm.m897d("131F1B07"));
        m1521a(m635a, hashMap, atm.m897d("191F1B062336"));
        m1521a(m635a, hashMap, atm.m897d("190E1B01392B"));
        m1521a(m635a, hashMap, atm.m897d("061B181020"));
        m1521a(m635a, hashMap, atm.m897d("181F091A392A091F"));
        m1521a(m635a, hashMap, atm.m897d("05081E103E"));
        Iterator<C0293m> it = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F6245550D023B7613120A1121760915175A2031190E55").concat(m635a.toString()), m1520b(), null)).m967p0(atm.m897d("0E130C5B202803195A4B6C2D065A44552031")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            String str3 = next.m967p0(atm.m897d("0B")).m606a(atm.m897d("02081F13")).split(atm.m897d("45"))[2];
            String m602e = next.m967p0(atm.m897d("0248")).m602e();
            String m606a = next.m967p0(atm.m897d("0B5A445525350D")).m606a(atm.m897d("190819"));
            String m602e2 = next.m967p0(atm.m897d("190A1B1B6C664A1C151B38")).m602e();
            if (m602e2.contains(atm.m897d("50"))) {
                m602e2 = m602e2.split(atm.m897d("4A"))[1];
            }
            arrayList.add(new C0310h(str3, m602e, m606a, m602e2));
        }
        return C0308f.m887h(arrayList);
    }

    public String detailContent(List<String> list) {
        C0288h m846d = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F6245550D023B7613120A1121760915175A3F30050D0A5A").concat(list.get(0)), m1520b(), null));
        String m602e = m846d.m967p0(atm.m897d("0E130C5B3E391E1F5A4B6C305B")).m602e();
        String m606a = m846d.m967p0(atm.m897d("0E130C5B38301F171855727803171D")).m606a(atm.m897d("190819"));
        String m602e2 = m846d.m967p0(atm.m897d("0E130C5B25360C15")).m602e();
        C0459g m967p0 = m846d.m967p0(atm.m897d("0E130C5B3F31041C15557278190A1B1B6C664A1B"));
        C0310h c0310h = new C0310h();
        c0310h.m868g(list.get(0));
        c0310h.m867h(m602e);
        c0310h.m866i(m606a);
        c0310h.m870e(m602e2);
        c0310h.m871d(m967p0.get(1).m960w0());
        c0310h.m861n(m967p0.get(0).m960w0());
        c0310h.m873b(m967p0.get(2).m960w0());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0459g m967p02 = m846d.m967p0(atm.m897d("1F16541829361F4A5A4B6C3403"));
        C0459g m967p03 = m846d.m967p0(atm.m897d("0E130C5B213903144A5572780E130C"));
        for (int i = 0; i < m967p02.size(); i++) {
            String m960w0 = m967p02.get(i).m960w0();
            C0459g m967p04 = m967p03.get(i).m967p0(atm.m897d("0B"));
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < m967p04.size(); i2++) {
                C0293m c0293m = m967p04.get(i2);
                arrayList.add(c0293m.m960w0() + atm.m897d("4E") + c0293m.mo925d(atm.m897d("02081F13")));
            }
            if (arrayList.size() > 0) {
                linkedHashMap.put(m960w0, TextUtils.join(atm.m897d("49"), arrayList));
            }
        }
        if (linkedHashMap.size() > 0) {
            Set keySet = linkedHashMap.keySet();
            String m897d = atm.m897d("4E5E5E");
            c0310h.m865j(TextUtils.join(m897d, keySet));
            c0310h.m864k(TextUtils.join(m897d, linkedHashMap.values()));
        }
        return C0308f.m888g(c0310h);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] split = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F6245550D023B7613120A1121760915175A3520191C551F3F77130225162D2C0B161512623219"), m1520b(), null)).m960w0().split(atm.m897d("35161B172934195A4755"));
        int i = 0;
        while (true) {
            int i2 = 2;
            if (i >= split.length) {
                break;
            }
            String str = split[i];
            String m897d = atm.m897d("31");
            if (str.startsWith(m897d)) {
                split[i] = split[i].substring(0, split[i].indexOf(atm.m897d("51"))).replace(m897d, "").replace(atm.m897d("37"), "").replace(atm.m897d("48"), "");
                boolean startsWith = split[i].startsWith(atm.m897d("181F1D1C2336"));
                String m897d2 = atm.m897d("46");
                if (startsWith) {
                    String[] split2 = split[i].split(m897d2);
                    while (i2 < split2.length) {
                        if (!split2[i2].isEmpty()) {
                            String trim = split2[i2].trim();
                            arrayList2.add(new C0304b(trim, trim));
                        }
                        i2++;
                    }
                } else {
                    String[] split3 = split[i].split(m897d2);
                    ArrayList arrayList4 = new ArrayList();
                    while (i2 < split3.length) {
                        if (!split3[i2].isEmpty()) {
                            arrayList4.add(new C0305c(split3[i2].trim()));
                        }
                        i2++;
                    }
                    arrayList3.add(new C0306d(split3[0].trim(), split3[1].trim(), arrayList4));
                }
            }
            i++;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((C0304b) it.next()).m895b(), arrayList3);
        }
        Iterator<C0293m> it2 = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F6245550D023B7613120A1121760915175A2031190E55"), m1520b(), null)).m967p0(atm.m897d("0E130C5B202803195A4B6C2D065A44552031")).iterator();
        while (it2.hasNext()) {
            C0293m next = it2.next();
            String str2 = next.m967p0(atm.m897d("0B")).m606a(atm.m897d("02081F13")).split(atm.m897d("45"))[2];
            String m602e = next.m967p0(atm.m897d("0248")).m602e();
            String m606a = next.m967p0(atm.m897d("0B5A445525350D")).m606a(atm.m897d("190819"));
            String m602e2 = next.m967p0(atm.m897d("190A1B1B6C664A1C151B38")).m602e();
            if (m602e2.contains(atm.m897d("50"))) {
                m602e2 = m602e2.split(atm.m897d("4A"))[1];
            }
            arrayList.add(new C0310h(str2, m602e, m606a, m602e2));
        }
        return C0308f.m884k(arrayList2, arrayList, linkedHashMap);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0308f c0308f = new C0308f();
        c0308f.m880o(atm.m897d("020E0E053F6245550D023B7613120A112176091517") + str2);
        c0308f.m889f();
        c0308f.m892c(m1520b());
        return c0308f.toString();
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F6245550D023B7613120A1121760915175A3F070B16164A2920574B5C1E3B65"));
        m635a.append(URLEncoder.encode(str));
        Iterator<C0293m> it = C0321F.m846d(C0574b.m307f(m635a.toString(), m1520b(), null)).m967p0(atm.m897d("0E130C5B202803195A4B6C2D065A44552031")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            String str2 = next.m967p0(atm.m897d("0B")).m606a(atm.m897d("02081F13")).split(atm.m897d("45"))[2];
            String m602e = next.m967p0(atm.m897d("0248")).m602e();
            String m606a = next.m967p0(atm.m897d("0B5A445525350D")).m606a(atm.m897d("190819"));
            String m602e2 = next.m967p0(atm.m897d("190A1B1B6C664A1C151B38")).m602e();
            if (m602e2.contains(atm.m897d("50"))) {
                m602e2 = m602e2.split(atm.m897d("4A"))[1];
            }
            arrayList.add(new C0310h(str2, m602e, m606a, m602e2));
        }
        return C0308f.m887h(arrayList);
    }
}
