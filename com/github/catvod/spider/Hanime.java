package com.github.catvod.spider;

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
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p042j.C0574b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public class Hanime extends Spider {
    /* renamed from: a */
    private C0306d m1538a(String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (!str2.equals(atm.m897d("0803"))) {
            arrayList.add(new C0305c(atm.m897d("8FFFD29CCFF0"), ""));
        }
        for (String str3 : list) {
            if (!str3.isEmpty()) {
                arrayList.add(new C0305c(str3));
            }
        }
        return new C0306d(str2, str, arrayList);
    }

    /* renamed from: b */
    private HashMap<String, String> m1537b() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(atm.m897d("3F091F0761190D1F1401"), atm.m897d("2715001C20340B554F5B7C78422D131B28371D095A3B18785B4A544577783D13144378634A024C4165782B0A0A19290F0F18311C38775F494D5B7F6E4A52313D181526565A1925330F5A3D102F3305535A36242A05171F5A7D6853544A5B7C765A5A29142A39181355407F6F44494C"));
        return hashMap;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String m897d;
        String m897d2;
        String m897d3;
        ArrayList arrayList = new ArrayList();
        String m897d4 = atm.m897d("0803");
        if (hashMap.get(m897d4) == null) {
            hashMap.put(m897d4, atm.m897d("8CE6FA93DAE88EC2F090F4DA"));
        }
        String m897d5 = atm.m897d("131F1B07");
        if (hashMap.get(m897d5) == null) {
            hashMap.put(m897d5, "");
        }
        C0288h m846d = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F62455512142231071F4B5B213D").concat(atm.m897d("45091F143E3B02451D10222A0F47")).concat(str).concat(atm.m897d("4C0A1B122965")).concat(str2).concat(atm.m897d("4C0915073865")).concat(hashMap.get(m897d4)).concat(atm.m897d("4C031F143E65")).concat(hashMap.get(m897d5)), m1537b(), null));
        Iterator<C0293m> it = m846d.m967p0(atm.m897d("0E130C5B2F3706570206616E")).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            m897d = atm.m897d("57");
            m897d2 = atm.m897d("190819");
            m897d3 = atm.m897d("02081F13");
            if (!hasNext) {
                break;
            }
            C0293m next = it.next();
            String mo925d = next.m967p0(atm.m897d("03171D")).get(1).mo925d(m897d2);
            String m606a = next.m967p0(atm.m897d("0B541503292A061B03")).m606a(m897d3);
            arrayList.add(new C0310h(m606a.split(m897d)[1], next.m967p0(atm.m897d("0E130C5B2F39181E5718233A03161F5838311E161F")).m602e(), mo925d));
        }
        if (arrayList.isEmpty()) {
            Iterator<C0293m> it2 = m846d.m967p0(atm.m897d("0B")).iterator();
            while (it2.hasNext()) {
                C0293m next2 = it2.next();
                if (next2.mo925d(m897d3).contains(atm.m897d("1D1B0E1624"))) {
                    String m606a2 = next2.m967p0(atm.m897d("0E130C55727803171D")).m606a(m897d2);
                    String mo925d2 = next2.mo925d(m897d3);
                    String m602e = next2.m967p0(atm.m897d("0E130C5572780E130C")).m602e();
                    String str3 = mo925d2.split(m897d)[1];
                    if (!m602e.contains(atm.m897d("19171B0738070E130905203913"))) {
                        arrayList.add(new C0310h(str3, m602e, m606a2));
                    }
                }
            }
        }
        return C0308f.m887h(arrayList);
    }

    public String detailContent(List<String> list) {
        C0288h m846d = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F62455512142231071F4B5B213D").concat(atm.m897d("450D1B012F30550C47")).concat(list.get(0)), m1537b(), null));
        String m960w0 = m846d.m982a0(atm.m897d("19121B07291A1E145701252C061F")).m960w0();
        String m602e = m846d.m967p0(atm.m897d("0E130C5B3A310E1F15582F391A0E131A22751E1F0201")).m602e();
        String m606a = m846d.m967p0(atm.m897d("071F0E14172818150A103E2C134715127631071B1D1011")).m606a(atm.m897d("0915140129361E"));
        String mo925d = m846d.m982a0(atm.m897d("1C131E102375191E")).mo925d(atm.m897d("1C1B160029"));
        C0310h c0310h = new C0310h();
        c0310h.m868g(list.get(0));
        c0310h.m866i(m606a);
        c0310h.m867h(m960w0);
        c0310h.m870e(m602e);
        c0310h.m865j(atm.m897d("221B141C213D5B"));
        c0310h.m864k(atm.m897d("8CE8D793D8E64E") + mo925d);
        return C0308f.m888g(c0310h);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String m897d = atm.m897d("020E0E053F62455512142231071F4B5B213D");
        C0288h m846d = C0321F.m846d(C0574b.m307f(m897d.concat(atm.m897d("45091F143E3B02451D10222A0F4792D6C3BFFFD0")), m1537b(), null));
        List<String> m605b = m846d.m967p0(atm.m897d("0E130C5B243D040E1B1C612B05080E5823281E13151B3F751D081B053C3D18")).m605b();
        String m897d2 = atm.m897d("131F1B07");
        C0459g m967p0 = m846d.m982a0(m897d2).m967p0(atm.m897d("050A0E1C2336"));
        String m897d3 = atm.m897d("1C1B160029");
        ArrayList arrayList3 = new ArrayList(m967p0.size());
        Iterator<C0293m> it = m967p0.iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            if (next.m917o(m897d3)) {
                arrayList3.add(next.mo925d(m897d3));
            }
        }
        C0288h m846d2 = C0321F.m846d(C0574b.m307f(m897d, m1537b(), null));
        Iterator<C0293m> it2 = m846d2.m967p0(atm.m897d("0B5414143A75030E1F18")).iterator();
        while (it2.hasNext()) {
            String m960w0 = it2.next().m960w0();
            if (!m960w0.equals(atm.m897d("8CECCA92D9F283DAEA90DDD2")) && !m960w0.equals(atm.m897d("229CC6DEABCDC1"))) {
                arrayList2.add(new C0304b(m960w0, m960w0));
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(m1538a(atm.m897d("8CF4E890F6D7"), atm.m897d("0803"), m605b));
                arrayList4.add(m1538a(atm.m897d("8FC3CE91F7E5"), m897d2, arrayList3));
                linkedHashMap.put(m960w0, arrayList4);
            }
        }
        Iterator<C0293m> it3 = m846d2.m967p0(atm.m897d("0B")).iterator();
        while (it3.hasNext()) {
            C0293m next2 = it3.next();
            String m897d4 = atm.m897d("02081F13");
            if (next2.mo925d(m897d4).contains(atm.m897d("1D1B0E1624"))) {
                String m606a = next2.m967p0(atm.m897d("0E130C55727803171D")).m606a(atm.m897d("190819"));
                String mo925d = next2.mo925d(m897d4);
                String m602e = next2.m967p0(atm.m897d("0E130C5572780E130C")).m602e();
                String str = mo925d.split(atm.m897d("57"))[1];
                if (!m602e.contains(atm.m897d("19171B0738070E130905203913")) && !m602e.isEmpty()) {
                    arrayList.add(new C0310h(str, m602e, m606a));
                }
            }
        }
        return C0308f.m884k(arrayList2, arrayList, linkedHashMap);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0308f c0308f = new C0308f();
        c0308f.m880o(str2);
        c0308f.m892c(m1537b());
        return c0308f.toString();
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0293m> it = C0321F.m846d(C0574b.m307f(atm.m897d("020E0E053F62455512142231071F4B5B213D").concat(atm.m897d("45091F143E3B02450B00292A1347")).concat(str).concat(atm.m897d("4C1D1F1B3E3D575C091A3E2C575C03102D2A575C171A222C02475C11392A0B0E131A2265")), m1537b(), null)).m967p0(atm.m897d("0E130C5B2F3706570206616E")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            String mo925d = next.m967p0(atm.m897d("03171D")).get(1).mo925d(atm.m897d("190819"));
            String m606a = next.m967p0(atm.m897d("0B541503292A061B03")).m606a(atm.m897d("02081F13"));
            arrayList.add(new C0310h(m606a.split(atm.m897d("57"))[1], next.m967p0(atm.m897d("0E130C5B2F39181E5718233A03161F5838311E161F")).m602e(), mo925d));
        }
        return C0308f.m887h(arrayList);
    }
}
