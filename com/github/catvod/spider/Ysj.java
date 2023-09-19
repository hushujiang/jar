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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class Ysj extends Spider {
    /* renamed from: a */
    private C0306d m1519a(String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            if (!str3.isEmpty()) {
                arrayList.add(new C0305c(str3, str3.replace(atm.m897d("8FFFD29CCFF0"), "")));
            }
        }
        return new C0306d(str2, str, arrayList);
    }

    /* renamed from: b */
    private HashMap<String, String> m1518b() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(atm.m897d("3F091F0761190D1F1401"), atm.m897d("2715001C20340B554F5B7C78422D131B28371D095A3B18785B4A544577783D13144378634A024C4165782B0A0A19290F0F18311C38775F494D5B7F6E4A52313D181526565A1925330F5A3D102F3305535A36242A05171F5A7D6853544A5B7C765A5A29142A39181355407F6F44494C"));
        return hashMap;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        StringBuilder sb = new StringBuilder(atm.m897d("020E0E053F6245550306263C07541410387703141E1034761A120A5A3A370E55091D232F"));
        String m897d = atm.m897d("0B081F14");
        if (hashMap.containsKey(m897d)) {
            sb.append(atm.m897d("451B08102D77"));
            sb.append(hashMap.get(m897d));
        }
        if (str.length() > 0) {
            sb.append(atm.m897d("451916143F2B45"));
            sb.append(str);
        }
        sb.append(atm.m897d("45131E5A7E68"));
        String m897d2 = atm.m897d("061B1412");
        if (hashMap.containsKey(m897d2)) {
            sb.append(atm.m897d("45161B1B2B77"));
            sb.append(hashMap.get(m897d2));
        }
        String m897d3 = atm.m897d("061F0E01292A");
        if (hashMap.containsKey(m897d3)) {
            sb.append(atm.m897d("45161F01383D1855"));
            sb.append(hashMap.get(m897d3));
        }
        String m897d4 = atm.m897d("131F1B07");
        if (hashMap.containsKey(m897d4)) {
            sb.append(atm.m897d("45031F143E77"));
            sb.append(hashMap.get(m897d4));
        }
        if (!str2.equals(atm.m897d("5B"))) {
            sb.append(atm.m897d("450A1B122977"));
            sb.append(str2);
        }
        sb.append(atm.m897d("44120E1820"));
        C0288h m846d = C0321F.m846d(C0574b.m307f(sb.toString(), m1518b(), null));
        ArrayList arrayList = new ArrayList();
        Iterator<C0293m> it = m846d.m967p0(atm.m897d("06135403233C0613090113311E1F17")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            String m897d5 = atm.m897d("0B");
            String str3 = next.m967p0(m897d5).m606a(atm.m897d("02081F13")).split(atm.m897d("45"))[5];
            String m606a = next.m967p0(m897d5).m606a(atm.m897d("1E130E1929"));
            StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F6245550306263C0754141038"));
            m635a.append(next.m967p0(m897d5).m606a(atm.m897d("0E1B0E14613718131D1C223906")));
            arrayList.add(new C0310h(str3, m606a, m635a.toString(), next.m967p0(atm.m897d("190A1B1B62280319250129201E")).m602e()));
        }
        return C0308f.m887h(arrayList);
    }

    public String detailContent(List<String> list) {
        C0288h m846d = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F6245550306263C07541410387703141E1034761A120A5A3A370E551E1038390316551C2877").concat(list.get(0)), m1518b(), null));
        String m602e = m846d.m967p0(atm.m897d("02485401252C061F")).m602e();
        StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F6245550306263C0754141038"));
        m635a.append(m846d.m967p0(atm.m897d("0B540C1A283403090E2A38301F1718")).m606a(atm.m897d("0E1B0E14613718131D1C223906")));
        String sb = m635a.toString();
        String m897d = atm.m897d("061354112D2C0B");
        String m897d2 = atm.m897d("0B");
        String m960w0 = m846d.m967p0(m897d).get(0).m967p0(m897d2).get(0).m960w0();
        String m960w02 = m846d.m967p0(m897d).get(0).m967p0(m897d2).get(1).m960w0();
        String m960w03 = m846d.m967p0(m897d).get(0).m967p0(m897d2).get(2).m960w0();
        String replace = m846d.m967p0(m897d).get(2).m960w0().replace(atm.m897d("8EC2C193F0CC85C6E0"), "");
        String replace2 = m846d.m967p0(m897d).get(3).m960w0().replace(atm.m897d("8FD5C693F0CC85C6E0"), "");
        String m602e2 = m846d.m967p0(atm.m897d("0E130C5B2F37040E1F1B38070E1F09166C664A090A1422")).m602e();
        C0310h c0310h = new C0310h();
        c0310h.m868g(list.get(0));
        c0310h.m866i(sb);
        c0310h.m861n(m960w0);
        c0310h.m867h(m602e);
        c0310h.m871d(m960w02);
        c0310h.m872c(replace);
        c0310h.m870e(m602e2);
        c0310h.m869f(replace2);
        c0310h.m873b(m960w03);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0459g m967p0 = m846d.m967p0(atm.m897d("0E130C5B3C340B032506232D18191F2A3839085A44552D"));
        C0459g m967p02 = m846d.m967p0(atm.m897d("1F16541623361E1F14011328061B0319252B1E"));
        for (int i = 0; i < m967p0.size(); i++) {
            String mo925d = m967p0.get(i).mo925d(atm.m897d("0B160E"));
            C0459g m967p03 = m967p02.get(i).m967p0(m897d2);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < m967p03.size(); i2++) {
                C0293m c0293m = m967p03.get(i2);
                String replace3 = c0293m.mo925d(atm.m897d("02081F13")).replace(atm.m897d("451314112920440A1205632E051E550520391355131163"), "");
                arrayList.add(c0293m.m960w0() + atm.m897d("4E") + replace3);
            }
            if (arrayList.size() > 0) {
                linkedHashMap.put(mo925d, TextUtils.join(atm.m897d("49"), arrayList));
            }
        }
        if (linkedHashMap.size() > 0) {
            Set keySet = linkedHashMap.keySet();
            String m897d3 = atm.m897d("4E5E5E");
            c0310h.m865j(TextUtils.join(m897d3, keySet));
            c0310h.m864k(TextUtils.join(m897d3, linkedHashMap.values()));
        }
        return C0308f.m888g(c0310h);
    }

    public String homeContent(boolean z) {
        String m897d;
        String m897d2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0288h m846d = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F6245550306263C07541410387703141E1034761A120A5A3A370E55091D232F45131E5A7E6844120E1820"), m1518b(), null));
        C0459g m967p0 = m846d.m967p0(atm.m897d("0E130C5624345A49"));
        String m897d3 = atm.m897d("0B");
        arrayList3.add(m1519a(atm.m897d("8FE6CA90C1D8"), atm.m897d("0B081F14"), m967p0.m603d(m897d3).m605b()));
        arrayList3.add(m1519a(atm.m897d("8FC3CE91F7E5"), atm.m897d("131F1B07"), m846d.m967p0(atm.m897d("0E130C5624345A4E")).m603d(m897d3).m605b()));
        arrayList3.add(m1519a(atm.m897d("82D0E49DE4D8"), atm.m897d("061B1412"), m846d.m967p0(atm.m897d("0E130C5624345A4F")).m603d(m897d3).m605b()));
        arrayList3.add(m1519a(atm.m897d("8FD7ED93E3D5"), atm.m897d("061F0E01292A"), m846d.m967p0(atm.m897d("0E130C5624345A4C")).m603d(m897d3).m605b()));
        Iterator<C0293m> it = m846d.m967p0(atm.m897d("0E130C5624345A48")).m603d(m897d3).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            m897d = atm.m897d("45");
            m897d2 = atm.m897d("02081F13");
            if (!hasNext) {
                break;
            }
            C0293m next = it.next();
            String str = next.mo925d(m897d2).split(m897d)[5];
            if (str.contains(atm.m897d("44120E1820"))) {
                str = "";
            }
            arrayList2.add(new C0304b(str, next.m960w0().replace(atm.m897d("283E"), "")));
            linkedHashMap.put(str, arrayList3);
        }
        Iterator<C0293m> it2 = m846d.m967p0(atm.m897d("06135403233C0613090113311E1F17")).iterator();
        while (it2.hasNext()) {
            C0293m next2 = it2.next();
            String str2 = next2.m967p0(m897d3).m606a(m897d2).split(m897d)[5];
            String m606a = next2.m967p0(m897d3).m606a(atm.m897d("1E130E1929"));
            StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F6245550306263C0754141038"));
            m635a.append(next2.m967p0(m897d3).m606a(atm.m897d("0E1B0E14613718131D1C223906")));
            arrayList.add(new C0310h(str2, m606a, m635a.toString(), next2.m967p0(atm.m897d("190A1B1B62280319250129201E")).m602e()));
        }
        return C0308f.m884k(arrayList2, arrayList, linkedHashMap);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0308f c0308f = new C0308f();
        c0308f.m880o(atm.m897d("020E0E053F6245550306263C07541410387703141E1034761A120A5A3A370E550A192D2145131E5A") + str2);
        c0308f.m889f();
        c0308f.m892c(m1518b());
        return c0308f.toString();
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        C0288h m846d = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F6245550306263C07541410387703141E1034761A120A5A3A370E5509102D2A0912541D383506").concat(atm.m897d("550D1E48")).concat(str).concat(atm.m897d("4C090F1721311E47")), m1518b(), null));
        if (m846d.m979d0().contains(atm.m897d("8FC4F293C6E98CD7F39AF0D48CE0F893DBF88DE1C290C9EB82DDFC9CEEC9"))) {
            return C0308f.m887h(arrayList);
        }
        Iterator<C0293m> it = m846d.m967p0(atm.m897d("06135406293918191219252B1E2513012935")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            String m897d = atm.m897d("0B");
            String str2 = next.m967p0(m897d).m606a(atm.m897d("02081F13")).split(atm.m897d("45"))[5];
            String m606a = next.m967p0(m897d).m606a(atm.m897d("1E130E1929"));
            StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F6245550306263C0754141038"));
            m635a.append(next.m967p0(m897d).m606a(atm.m897d("0E1B0E14613718131D1C223906")));
            arrayList.add(new C0310h(str2, m606a, m635a.toString(), next.m967p0(atm.m897d("190A1B1B62280319250129201E")).m602e()));
        }
        return C0308f.m887h(arrayList);
    }
}
