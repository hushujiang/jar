package com.github.catvod.spider;

import android.os.SystemClock;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p026b.C0304b;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p054p.C0642b;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Eighteen extends Spider {
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        ArrayList arrayList = new ArrayList();
        String replace = str.replace(atm.m897d("181B14112335"), atm.m897d("06130901")).replace(atm.m897d("03141E1034"), str2);
        StringBuilder sb = new StringBuilder();
        String m897d = atm.m897d("020E0E053F62455517142D69524B485B2F370755001D63");
        sb.append(m897d);
        sb.append(replace);
        Iterator<C0293m> it = C0052e.m1414e(C0574b.m307f(sb.toString(), null, null)).m967p0(atm.m897d("0E130C5B3C37190E")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            arrayList.add(new C0310h(next.m967p0(atm.m897d("0B")).m606a(atm.m897d("02081F13")).replace(m897d, ""), next.m967p0(atm.m897d("0249")).m602e(), next.m967p0(atm.m897d("0B5A445525350D")).m606a(atm.m897d("190819")), next.m967p0(atm.m897d("0E130C5B213D1E1B")).m602e()));
        }
        return C0308f.m887h(arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F62455517142D69524B485B2F370755001D63"));
        m635a.append(list.get(0));
        C0293m c0293m = C0052e.m1414e(C0574b.m307f(m635a.toString(), null, null)).m967p0(atm.m897d("0E130C5B3A310E1F15583B2A0B0A")).get(0);
        String m602e = c0293m.m967p0(atm.m897d("0E130C5B2D2A0912130329751E130E192978545A1244")).m602e();
        String m606a = c0293m.m967p0(atm.m897d("0E130C5B3C340B031F07612F181B0A55727803171D")).m606a(atm.m897d("190819"));
        C0310h c0310h = new C0310h();
        c0310h.m868g(list.get(0));
        c0310h.m866i(m606a);
        c0310h.m867h(m602e);
        c0310h.m865j(atm.m897d("5B423B23"));
        c0310h.m864k(atm.m897d("8CE8D793D8E64E") + list.get(0));
        return C0308f.m888g(c0310h);
    }

    public String homeContent(boolean z) {
        String m897d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String m897d2 = atm.m897d("020E0E053F62455517142D69524B485B2F370755001D63");
        C0288h m1414e = C0052e.m1414e(C0574b.m307f(m897d2, null, null));
        Iterator<C0293m> it = m1414e.m967p0(atm.m897d("1F1654142231071F14001307041B0C55727806135A4B6C39")).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            m897d = atm.m897d("02081F13");
            if (!hasNext) {
                break;
            }
            C0293m next = it.next();
            String m960w0 = next.m960w0();
            String replace = next.mo925d(m897d).replace(m897d2, "");
            if (replace.contains(atm.m897d("181B14112335451B161963"))) {
                if (m960w0.contains(atm.m897d("5B4232"))) {
                    break;
                }
                arrayList.add(new C0304b(replace, m960w0));
            }
        }
        Iterator<C0293m> it2 = m1414e.m967p0(atm.m897d("0E130C5B3C37190E")).iterator();
        while (it2.hasNext()) {
            C0293m next2 = it2.next();
            arrayList2.add(new C0310h(next2.m967p0(atm.m897d("0B")).m606a(m897d).replace(m897d2, ""), next2.m967p0(atm.m897d("0249")).m602e(), next2.m967p0(atm.m897d("0B5A445525350D")).m606a(atm.m897d("190819")), next2.m967p0(atm.m897d("0E130C5B213D1E1B")).m602e()));
        }
        return C0308f.m885j(arrayList, arrayList2);
    }

    public String playerContent(String str, String str2, List<String> list) {
        final HashMap hashMap = new HashMap();
        C0652d.m141j(C0642b.m156a(atm.m897d("020E0E053F62455517142D69524B485B2F370755001D63"), str2), new WebViewClient() { // from class: com.github.catvod.spider.Eighteen.1
            @Override // android.webkit.WebViewClient
            public void onLoadResource(WebView webView, String str3) {
                if (str3.endsWith(atm.m897d("4417490074"))) {
                    hashMap.put(atm.m897d("1F0816"), str3);
                    webView.destroy();
                }
            }
        });
        while (hashMap.isEmpty()) {
            SystemClock.sleep(10L);
        }
        C0308f c0308f = new C0308f();
        c0308f.m880o((String) hashMap.get(atm.m897d("1F0816")));
        return c0308f.toString();
    }

    public String searchContent(String str, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(atm.m897d("191F1B072F3035111F0C3B37181E"), str);
        hashMap.put(atm.m897d("191F1B072F30350E030529"), atm.m897d("0C19"));
        hashMap.put(atm.m897d("050A"), atm.m897d("191F1B072F30"));
        String m310c = C0574b.m310c(atm.m897d("020E0E053F62455517142D69524B485B2F370755001D632B0F1B0816243E0508172A3F3D0B08191D63390616551C223C0F02541D383506"), hashMap, null);
        ArrayList arrayList = new ArrayList();
        Iterator<C0293m> it = C0052e.m1414e(m310c).m967p0(atm.m897d("0E130C5B3C37190E")).iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            arrayList.add(new C0310h(next.m967p0(atm.m897d("0B")).m606a(atm.m897d("02081F13")).replace(atm.m897d("020E0E053F62455517142D69524B485B2F370755001D63"), ""), next.m967p0(atm.m897d("0249")).m602e(), next.m967p0(atm.m897d("0B5A445525350D")).m606a(atm.m897d("190819")), next.m967p0(atm.m897d("0E130C5B213D1E1B")).m602e()));
        }
        return C0308f.m887h(arrayList);
    }
}
