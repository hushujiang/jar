package com.github.catvod.spider.merge.p060v;

import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.v.w */
/* loaded from: classes.dex */
final class C0740w extends AbstractC0718a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0740w() {
        super((C0738u) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: d */
    public final void mo37d(AbstractC0741x abstractC0741x, Set set) {
        Set set2;
        synchronized (abstractC0741x) {
            set2 = abstractC0741x.f1374h;
            if (set2 == null) {
                abstractC0741x.f1374h = set;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: e */
    public final int mo36e(AbstractC0741x<?> abstractC0741x) {
        int m30y;
        synchronized (abstractC0741x) {
            m30y = AbstractC0741x.m30y(abstractC0741x);
        }
        return m30y;
    }
}
