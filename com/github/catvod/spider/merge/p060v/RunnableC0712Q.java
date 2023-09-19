package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p056r.C0672t;

/* renamed from: com.github.catvod.spider.merge.v.Q */
/* loaded from: classes.dex */
final class RunnableC0712Q extends AbstractC0727j<Void> implements Runnable {

    /* renamed from: h */
    private final Runnable f1323h;

    public RunnableC0712Q(Runnable runnable) {
        runnable.getClass();
        this.f1323h = runnable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o
    /* renamed from: r */
    public final String mo38r() {
        String valueOf = String.valueOf(this.f1323h);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append(atm.m897d("1E1B091E7103"));
        sb.append(valueOf);
        sb.append(atm.m897d("37"));
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1323h.run();
        } catch (Throwable th) {
            mo46u(th);
            int i = C0672t.f1276b;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw th;
        }
    }
}
