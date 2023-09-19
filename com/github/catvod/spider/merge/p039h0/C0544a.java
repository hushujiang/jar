package com.github.catvod.spider.merge.p039h0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p035f0.C0524e;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0522c;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.h0.a */
/* loaded from: classes.dex */
public final class C0544a implements InterfaceC0522c {
    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    /* renamed from: a */
    public final C0525f mo322a(C0524e c0524e, List<C0525f> list) {
        StringBuilder sb = new StringBuilder();
        for (C0525f c0525f : list) {
            sb.append(c0525f.m445g());
        }
        return new C0525f(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    public final String name() {
        return atm.m897d("091514162D2C");
    }
}
