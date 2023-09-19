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
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class Dm84 extends Spider {
    /* renamed from: a */
    private C0306d m1540a(String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            if (!str3.isEmpty()) {
                String replace = str3.replace(atm.m897d("8CF6F3"), "");
                if (str2.equals(atm.m897d("0803"))) {
                    str3 = str3.replace(atm.m897d("8CF6F393DBEE83EDCE"), atm.m897d("1E131710")).replace(atm.m897d("8CF6F391F6E28CCAEE"), atm.m897d("02130E06")).replace(atm.m897d("8CF6F39DE3DC8FF2FC"), atm.m897d("1919150729"));
                }
                arrayList.add(new C0305c(replace, str3));
            }
        }
        return new C0306d(str2, str, arrayList);
    }

    /* renamed from: b */
    private HashMap<String, String> m1539b() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(atm.m897d("3F091F0761190D1F1401"), atm.m897d("2715001C20340B554F5B7C78422D131B28371D095A3B18785B4A544577783D13144378634A024C4165782B0A0A19290F0F18311C38775F494D5B7F6E4A52313D181526565A1925330F5A3D102F3305535A36242A05171F5A7D6853544A5B7C765A5A29142A39181355407F6F44494C"));
        return hashMap;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        ArrayList arrayList = new ArrayList();
        String m897d = atm.m897d("1E030A10");
        if (hashMap.get(m897d) == null) {
            hashMap.put(m897d, "");
        }
        String m897d2 = atm.m897d("131F1B07");
        if (hashMap.get(m897d2) == null) {
            hashMap.put(m897d2, "");
        }
        String m897d3 = atm.m897d("0803");
        if (hashMap.get(m897d3) == null) {
            hashMap.put(m897d3, atm.m897d("1E131710"));
        }
        String encode = URLEncoder.encode(hashMap.get(m897d));
        StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F6245551E18746C440E0C"));
        m635a.append(String.format(atm.m897d("4509121A3B754F095758692B475F0958617D19575F0662301E1716"), str, hashMap.get(m897d3), encode, hashMap.get(m897d2), str2));
        Iterator<C0293m> it = C0321F.m846d(C0574b.m307f(m635a.toString(), m1539b(), null)).m967p0(atm.m897d("0E130C5B252C0F17")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            String m606a = next.m967p0(atm.m897d("0B54191A3A3D18")).m606a(atm.m897d("0E1B0E14613A0D"));
            String m897d4 = atm.m897d("0B540E1C38340F");
            arrayList.add(new C0310h(next.m967p0(m897d4).m606a(atm.m897d("02081F13")).split(atm.m897d("45"))[2], next.m967p0(m897d4).m602e(), m606a, next.m967p0(atm.m897d("190A1B1B623C0F0919")).m602e()));
        }
        return C0308f.m887h(arrayList);
    }

    public String detailContent(List<String> list) {
        C0288h m846d = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F6245551E18746C440E0C").concat(atm.m897d("450C55")).concat(list.get(0)), m1539b(), null));
        String m602e = m846d.m967p0(atm.m897d("024B5403132C030E1610")).m602e();
        String m602e2 = m846d.m967p0(atm.m897d("1A540C2A283D19195A4B6C2B1A1B145B283D1919")).m602e();
        C0459g m967p0 = m846d.m967p0(atm.m897d("071F0E14172818150A103E2C134715127631071B1D1011"));
        String m897d = atm.m897d("0915140129361E");
        String m606a = m967p0.m606a(m897d);
        String m606a2 = m846d.m967p0(atm.m897d("071F0E1417360B171F48233F500C13112937501B08102D05")).m606a(m897d);
        String m606a3 = m846d.m967p0(atm.m897d("071F0E1417360B171F48233F500C13112937501916143F2B37")).m606a(m897d);
        String m606a4 = m846d.m967p0(atm.m897d("071F0E1417360B171F48233F500C13112937501B1901232A37")).m606a(m897d);
        String m606a5 = m846d.m967p0(atm.m897d("071F0E14172818150A103E2C13471512763C0F09190725281E13151B11")).m606a(m897d);
        String m606a6 = m846d.m967p0(atm.m897d("071F0E1417360B171F48233F500C1311293750081F192939191F25112D2C0F27")).m606a(m897d);
        String m606a7 = m846d.m967p0(atm.m897d("071F0E1417360B171F48233F500C13112937501E1307293B1E150828")).m606a(m897d);
        C0310h c0310h = new C0310h();
        c0310h.m868g(list.get(0));
        c0310h.m866i(m606a);
        c0310h.m861n(m606a6);
        c0310h.m867h(m602e);
        c0310h.m871d(m606a2);
        c0310h.m872c(m606a4);
        c0310h.m863l(m602e2);
        c0310h.m870e(m606a5);
        c0310h.m869f(m606a7);
        c0310h.m873b(m606a3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0459g m967p02 = m846d.m967p0(atm.m897d("1F1654012D3A3519151B382A05165A4B6C3403"));
        C0459g m967p03 = m846d.m967p0(atm.m897d("1F16540520391325161C3F2C"));
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
            String m897d2 = atm.m897d("4E5E5E");
            c0310h.m865j(TextUtils.join(m897d2, keySet));
            c0310h.m864k(TextUtils.join(m897d2, linkedHashMap.values()));
        }
        return C0308f.m888g(c0310h);
    }

    public String homeContent(boolean z) {
        String m897d;
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = null;
        C0288h m846d = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F6245551E18746C440E0C"), m1539b(), null));
        Iterator<C0293m> it = m846d.m967p0(atm.m897d("1F16541B2D2E350815026C664A16135572780B")).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            m897d = atm.m897d("02081F13");
            i = 0;
            if (!hasNext) {
                break;
            }
            C0293m next = it.next();
            if (next.mo925d(m897d).startsWith(atm.m897d("4516130638"))) {
                arrayList2.add(new C0304b(next.mo925d(m897d).split(atm.m897d("47"))[1].substring(0, 1), next.m960w0().substring(0, 2)));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C0304b c0304b = (C0304b) it2.next();
            StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F6245551E18746C440E0C5A2031190E57"));
            m635a.append(c0304b.m895b());
            m635a.append(atm.m897d("44120E1820"));
            C0288h m846d2 = C0321F.m846d(C0574b.m307f(m635a.toString(), m1539b(), map));
            C0459g m967p0 = m846d2.m967p0(atm.m897d("1F165419252B1E251C1C202C0F085A4B6C34035A445528311C"));
            ArrayList arrayList3 = new ArrayList();
            String m897d2 = atm.m897d("0B");
            arrayList3.add(m1540a(atm.m897d("83DBE490D2D3"), atm.m897d("1E030A10"), m967p0.get(i).m967p0(m897d2).m605b()));
            arrayList3.add(m1540a(atm.m897d("8CE3F89CDACB"), atm.m897d("131F1B07"), m967p0.get(1).m967p0(m897d2).m605b()));
            arrayList3.add(m1540a(atm.m897d("8CF4E890F6D7"), atm.m897d("0803"), m967p0.get(2).m967p0(m897d2).m605b()));
            linkedHashMap.put(c0304b.m895b(), arrayList3);
            i = 0;
            map = null;
            m846d = m846d2;
        }
        Iterator<C0293m> it3 = m846d.m967p0(atm.m897d("0E130C5B252C0F17")).iterator();
        while (it3.hasNext()) {
            C0293m next2 = it3.next();
            String m606a = next2.m967p0(atm.m897d("0B54191A3A3D18")).m606a(atm.m897d("0E1B0E14613A0D"));
            String m897d3 = atm.m897d("0B540E1C38340F");
            arrayList.add(new C0310h(next2.m967p0(m897d3).m606a(m897d).split(atm.m897d("45"))[2], next2.m967p0(m897d3).m602e(), m606a, next2.m967p0(atm.m897d("190A1B1B623C0F0919")).m602e()));
        }
        return C0308f.m884k(arrayList2, arrayList, linkedHashMap);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String m606a = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F6245551E18746C440E0C").concat(str2), m1539b(), null)).m967p0(atm.m897d("031C0814213D")).m606a(atm.m897d("190819"));
        C0308f c0308f = new C0308f();
        c0308f.m880o(m606a);
        c0308f.m889f();
        c0308f.m892c(m1539b());
        return c0308f.toString();
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0293m> it = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F6245551E18746C440E0C").concat(atm.m897d("45095758617547575758617544120E1820671D1E47")).concat(str), m1539b(), null)).m967p0(atm.m897d("0E130C5B252C0F17")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            String m606a = next.m967p0(atm.m897d("0B54191A3A3D18")).m606a(atm.m897d("0E1B0E14613A0D"));
            String m897d = atm.m897d("0B540E1C38340F");
            String m606a2 = next.m967p0(m897d).m606a(atm.m897d("02081F13"));
            arrayList.add(new C0310h(m606a2.split(atm.m897d("45"))[2], next.m967p0(m897d).m602e(), m606a, next.m967p0(atm.m897d("190A1B1B623C0F0919")).m602e()));
        }
        return C0308f.m887h(arrayList);
    }
}
