package com.github.catvod.spider.merge.p039h0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p018S.C0207h;
import com.github.catvod.spider.merge.p035f0.C0524e;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0522c;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.h0.k */
/* loaded from: classes.dex */
public final class C0554k implements InterfaceC0522c {
    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    /* renamed from: a */
    public final C0525f mo322a(C0524e c0524e, List<C0525f> list) {
        LinkedList linkedList = (LinkedList) list;
        String m445g = ((C0525f) linkedList.get(0)).m445g();
        int max = Math.max(((C0525f) linkedList.get(1)).m446f().intValue() - 1, 0);
        if (linkedList.get(2) != null) {
            return new C0525f(C0207h.m1165j(m445g, max, Math.max(Math.min(((C0525f) linkedList.get(2)).m446f().intValue() + max, m445g.length()), 0)));
        }
        return new C0525f(C0207h.m1166i(m445g, max));
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    public final String name() {
        return atm.m897d("190F1806382A03141D");
    }
}
