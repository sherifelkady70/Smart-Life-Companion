package build

import com.android.build.api.dsl.ApplicationBuildType
import com.android.build.api.dsl.LibraryBuildType
import org.gradle.api.NamedDomainObjectContainer
import org.gradle.declarative.dsl.schema.DataTypeRef

sealed class BuildCreator (name : String){

    abstract fun create(namedDomainObjectContainer: NamedDomainObjectContainer<ApplicationBuildType>) : ApplicationBuildType
    abstract fun createLibrary(namedDomainOverride: NamedDomainObjectContainer<LibraryBuildType>) : LibraryBuildType


    class Debug() : BuildCreator("Debug"){
        override fun create(namedDomainObjectContainer: NamedDomainObjectContainer<ApplicationBuildType>): ApplicationBuildType {
            TODO("Not yet implemented")
        }

        override fun createLibrary(namedDomainOverride: NamedDomainObjectContainer<LibraryBuildType>): LibraryBuildType {
            TODO("Not yet implemented")
        }
    }


    class Release() : BuildCreator("") {
        override fun create(namedDomainObjectContainer: NamedDomainObjectContainer<ApplicationBuildType>): ApplicationBuildType {
            TODO("Not yet implemented")
        }

        override fun createLibrary(namedDomainOverride: NamedDomainObjectContainer<LibraryBuildType>): LibraryBuildType {
            TODO("Not yet implemented")
        }


    }

}