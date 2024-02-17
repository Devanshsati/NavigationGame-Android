package com.example.navigationgame

import android.content.Intent
import android.os.Bundle
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationgame.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: FragmentGameWonBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_won, container, false)
        binding.nextMatchButton.setOnClickListener { view:View ->
            view.findNavController().navigate(GameWonFragmentDirections.actionGameWonFragmentToGameFragment3())
        }
//        Toast.makeText(context,"Correct: ${args.numCorrect} , Total Question: ${args.numQuestions}",Toast.LENGTH_LONG).show()
        return binding.root
    }

    private fun getShareIntent(): Intent{
        val args = GameWonFragmentArgs.fromBundle(requireArguments())
//        val shareIntent = Intent(Intent.ACTION_SEND)
//        shareIntent.setType("text/plain").putExtra(Intent.EXTRA_TEXT, getString(R.string.share_success_text,args.numCorrect,args.numQuestions))
        return ShareCompat.IntentBuilder.from(requireActivity()).setText(getString(R.string.share_success_text,args.numCorrect,args.numQuestions)).setType("text/plain").intent
    }

    private fun shareSuccess(){
        startActivity(getShareIntent())
    }

    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        if(null==getShareIntent().resolveActivity(requireActivity().packageManager)){
            menu.findItem(R.id.share)?.isVisible = false
        }
        menu.apply { R.menu.winner_menu }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.share -> shareSuccess()
        }
        return super.onContextItemSelected(item)
    }

//    @Deprecated("Deprecated in Java")
//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        super.onCreateOptionsMenu(menu, inflater)
//        inflater.inflate(R.menu.winner_menu,menu)
//        if(null==getShareIntent().resolveActivity(requireActivity().packageManager)){
//          menu.findItem(R.id.share)?.isVisible = false
//        }
//    }
//    @Deprecated("Deprecated in Java")
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when(item.itemId){
//            R.id.share -> shareSuccess()
//        }
//        return super.onOptionsItemSelected(item)
//    }

}
