package com.github.catvod.spider.merge.p039h0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p018S.C0207h;
import com.github.catvod.spider.merge.p035f0.C0524e;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0522c;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.h0.l */
/* loaded from: classes.dex */
public final class C0555l implements InterfaceC0522c {
    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    /* renamed from: a */
    public final C0525f mo322a(C0524e c0524e, List<C0525f> list) {
        int indexOf;
        LinkedList linkedList = (LinkedList) list;
        String m445g = ((C0525f) linkedList.get(0)).m445g();
        String m445g2 = ((C0525f) linkedList.get(1)).m445g();
        if (!C0207h.m1172c(m445g)) {
            m445g = (m445g2 == null || (indexOf = m445g.indexOf(m445g2)) == -1) ? "" : m445g.substring(m445g2.length() + indexOf);
        }
        return new C0525f(m445g);
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    public final String name() {
        return atm.m897d("190F1806382A03141D582D3E1E1F08");
    }
}
