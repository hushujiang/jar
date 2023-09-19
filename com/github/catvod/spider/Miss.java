package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p026b.C0304b;
import com.github.catvod.spider.merge.p026b.C0305c;
import com.github.catvod.spider.merge.p026b.C0306d;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p054p.C0642b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public class Miss extends Spider {
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String m897d;
        String str3;
        ArrayList arrayList = new ArrayList();
        String m897d2 = atm.m897d("020E0E053F624555171C3F2B0B0C5416233545");
        String m156a = C0642b.m156a(m897d2, str);
        if (TextUtils.isEmpty(hashMap.get(atm.m897d("0C131601292A19")))) {
            str3 = m156a + atm.m897d("550A1B122965") + str2;
        } else {
            str3 = m156a + atm.m897d("551C1319383D180947") + hashMap.get(m897d) + atm.m897d("4C0A1B122965") + str2;
        }
        Iterator<C0293m> it = C0052e.m1414e(C0574b.m307f(str3, null, null)).m967p0(atm.m897d("0E130C5B38301F17181B2D3106")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            String m897d3 = atm.m897d("0B540E10342C47091F1623360E1B080C");
            String replace = next.m967p0(m897d3).m606a(atm.m897d("02081F13")).replace(m897d2, "");
            String m602e = next.m967p0(m897d3).m602e();
            String m897d4 = atm.m897d("03171D");
            String m606a = next.m967p0(m897d4).m606a(atm.m897d("0E1B0E14612B1819"));
            if (m606a.isEmpty()) {
                m606a = next.m967p0(m897d4).m606a(atm.m897d("190819"));
            }
            arrayList.add(new C0310h(replace, m602e, m606a, next.m967p0(atm.m897d("190A1B1B")).m602e()));
        }
        return C0308f.m887h(arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F624555171C3F2B0B0C5416233545"));
        m635a.append(list.get(0));
        C0288h m1414e = C0052e.m1414e(C0574b.m307f(m635a.toString(), null, null));
        C0459g m967p0 = m1414e.m967p0(atm.m897d("071F0E14172818150A103E2C13471512762C030E161011"));
        String m897d = atm.m897d("0915140129361E");
        String m606a = m967p0.m606a(m897d);
        String m606a2 = m1414e.m967p0(atm.m897d("071F0E14172818150A103E2C134715127631071B1D1011")).m606a(m897d);
        C0310h c0310h = new C0310h();
        c0310h.m868g(list.get(0));
        c0310h.m866i(m606a2);
        c0310h.m867h(m606a);
        c0310h.m865j(atm.m897d("271309060D0E"));
        c0310h.m864k(atm.m897d("8CE8D793D8E64E") + list.get(0));
        return C0308f.m888g(c0310h);
    }

    public String homeContent(boolean z) {
        String m897d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String m897d2 = atm.m897d("0912131B292B0F5709002E2C030E1610");
        int i = 3;
        String m897d3 = atm.m897d("1F141910222B05081F1161340F1B11");
        List asList = Arrays.asList(m897d2, atm.m897d("041F0D"), atm.m897d("181F16102D2B0F"), m897d3, atm.m897d("1913081A"), atm.m897d("060F0200"), atm.m897d("0D1B1414"), atm.m897d("071B1B1B"), atm.m897d("19190F0129"), atm.m897d("0B081B"), m897d3, atm.m897d("0C1948"), atm.m897d("021F030F23"), atm.m897d("1E15110C2330050E"), atm.m897d("5B0A151B2837"), atm.m897d("091B081C2E3A0F1B14162335"), atm.m897d("091B081C2E3A0F1B141623351A08"), atm.m897d("5B4A17003F2D071F"), atm.m897d("1A1B191A3C39091517142139"), atm.m897d("0D1B191D25360915"), atm.m897d("120202143A"), atm.m897d("071B0807253D0E0916143F30"), atm.m897d("041B0F12242C134E4C447C"), atm.m897d("041B0F12242C134A43467C"), atm.m897d("071B1E1A39"), atm.m897d("1E0D1B03"));
        String m897d4 = atm.m897d("020E0E053F624555171C3F2B0B0C5416233545");
        C0288h m1414e = C0052e.m1414e(C0574b.m307f(m897d4, null, null));
        Iterator<C0293m> it = m1414e.m967p0(atm.m897d("041B0C")).m603d(atm.m897d("0B")).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            m897d = atm.m897d("02081F13");
            if (!hasNext) {
                break;
            }
            C0293m next = it.next();
            String m960w0 = next.m960w0();
            String replace = next.mo925d(m897d).replace(m897d4, "");
            if (asList.contains(replace)) {
                arrayList2.add(new C0304b(replace, m960w0));
                C0305c[] c0305cArr = new C0305c[i];
                c0305cArr[0] = new C0305c(atm.m897d("8FFFD29CCFF0"), "");
                c0305cArr[1] = new C0305c(atm.m897d("8FECD491F6E28EC7E690DFD9"), atm.m897d("03141E1C3A310E0F1B19"));
                c0305cArr[2] = new C0305c(atm.m897d("8EC2D793DADF8FD7ED90F5CD"), m897d2);
                Object[] objArr = {new C0306d(atm.m897d("0C131601292A19"), atm.m897d("83FBF493F3E6"), Arrays.asList(c0305cArr))};
                ArrayList arrayList3 = new ArrayList(1);
                for (int i2 = 0; i2 < 1; i2++) {
                    Object obj = objArr[i2];
                    obj.getClass();
                    arrayList3.add(obj);
                }
                linkedHashMap.put(replace, Collections.unmodifiableList(arrayList3));
                i = 3;
            }
        }
        Iterator<C0293m> it2 = m1414e.m967p0(atm.m897d("0E130C5B38301F17181B2D3106")).iterator();
        while (it2.hasNext()) {
            C0293m next2 = it2.next();
            String m897d5 = atm.m897d("0B540E10342C47091F1623360E1B080C");
            String replace2 = next2.m967p0(m897d5).m606a(m897d).replace(m897d4, "");
            String m602e = next2.m967p0(m897d5).m602e();
            String m897d6 = atm.m897d("03171D");
            String m606a = next2.m967p0(m897d6).m606a(atm.m897d("0E1B0E14612B1819"));
            if (m606a.isEmpty()) {
                m606a = next2.m967p0(m897d6).m606a(atm.m897d("190819"));
            }
            arrayList.add(new C0310h(replace2, m602e, m606a, next2.m967p0(atm.m897d("190A1B1B")).m602e()));
        }
        return C0308f.m884k(arrayList2, arrayList, linkedHashMap);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0308f c0308f = new C0308f();
        c0308f.m889f();
        c0308f.m880o(atm.m897d("020E0E053F624555171C3F2B0B0C5416233545") + str2);
        return c0308f.toString();
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0293m> it = C0052e.m1414e(C0574b.m307f(atm.m897d("020E0E053F624555171C3F2B0B0C5416233545091F143E3B0255") + str, null, null)).m967p0(atm.m897d("0E130C5B38301F17181B2D3106")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            String m897d = atm.m897d("0B540E10342C47091F1623360E1B080C");
            String replace = next.m967p0(m897d).m606a(atm.m897d("02081F13")).replace(atm.m897d("020E0E053F624555171C3F2B0B0C5416233545"), "");
            String m602e = next.m967p0(m897d).m602e();
            String m897d2 = atm.m897d("03171D");
            String m606a = next.m967p0(m897d2).m606a(atm.m897d("0E1B0E14612B1819"));
            if (m606a.isEmpty()) {
                m606a = next.m967p0(m897d2).m606a(atm.m897d("190819"));
            }
            arrayList.add(new C0310h(replace, m602e, m606a, next.m967p0(atm.m897d("190A1B1B")).m602e()));
        }
        return C0308f.m887h(arrayList);
    }
}
