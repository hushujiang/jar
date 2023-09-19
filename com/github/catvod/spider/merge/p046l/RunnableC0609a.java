package com.github.catvod.spider.merge.p046l;

import com.github.catvod.spider.Bili;

/* renamed from: com.github.catvod.spider.merge.l.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0609a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1165a;

    /* renamed from: b */
    public final /* synthetic */ Object f1166b;

    public /* synthetic */ RunnableC0609a(Object obj, int i) {
        this.f1165a = i;
        this.f1166b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1165a) {
            case 0:
                C0613e.m240a((C0613e) this.f1166b);
                return;
            default:
                Bili.m1545c((Bili) this.f1166b);
                return;
        }
    }
}
