package com.example.measure

import com.blankj.utilcode.util.ToastUtils
import com.google.ar.core.exceptions.*
import com.google.ar.sceneform.ux.ArFragment

class MyArFragment : ArFragment() {
    override fun handleSessionException(sessionException: UnavailableException) {
        val message: String
        when (sessionException) {
            is UnavailableArcoreNotInstalledException -> message = "ARCore를 설치하십시오."
            is UnavailableApkTooOldException -> message = "ARCore를 업그레이드해주세요"
            is UnavailableSdkTooOldException -> message = "앱을 업그레이드해주세요"
            is UnavailableDeviceNotCompatibleException -> message = "앱을 업그레이드해주세요"
            else -> {
                message = "AR 세션을 만들 수 없습니다. 기종, arcore 버전과 시스템 버전을 확인해 보십시오."
                val var3 = sessionException.toString()
            }
        }
        ToastUtils.showLong(message)
    }
}